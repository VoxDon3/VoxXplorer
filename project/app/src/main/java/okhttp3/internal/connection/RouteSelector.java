/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.o;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteDatabase;

public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        l.f(address, "address");
        l.f(routeDatabase, "routeDatabase");
        l.f(call, "call");
        l.f(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = o.j();
        this.inetSocketAddresses = o.j();
        this.postponedRoutes = new ArrayList<Route>();
        this.resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (this.hasNextProxy()) {
            Object object = this.proxies;
            int n8 = this.nextProxyIndex;
            this.nextProxyIndex = n8 + 1;
            object = object.get(n8);
            this.resetNextInetSocketAddress((Proxy)object);
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No route to ");
        stringBuilder.append(this.address.url().host());
        stringBuilder.append("; exhausted proxy configurations: ");
        stringBuilder.append(this.proxies);
        throw new SocketException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void resetNextInetSocketAddress(Proxy object) throws IOException {
        int n8;
        Object object2;
        ArrayList<? extends InetSocketAddress> arrayList = new ArrayList<InetSocketAddress>();
        this.inetSocketAddresses = arrayList;
        if (((Proxy)object).type() != Proxy.Type.DIRECT && ((Proxy)object).type() != Proxy.Type.SOCKS) {
            object2 = ((Proxy)object).address();
            if (!(object2 instanceof InetSocketAddress)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Proxy.address() is not an InetSocketAddress: ");
                ((StringBuilder)object).append(object2.getClass());
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            Companion companion = Companion;
            l.e(object2, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress)object2;
            object2 = companion.getSocketHost(inetSocketAddress);
            n8 = inetSocketAddress.getPort();
        } else {
            object2 = this.address.url().host();
            n8 = this.address.url().port();
        }
        if (1 <= n8 && n8 < 65536) {
            if (((Proxy)object).type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved((String)object2, n8));
                return;
            }
            if (Util.canParseAsIpAddress((String)object2)) {
                object = o.d(InetAddress.getByName((String)object2));
            } else {
                this.eventListener.dnsStart(this.call, (String)object2);
                object = this.address.dns().lookup((String)object2);
                if (object.isEmpty()) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.address.dns());
                    ((StringBuilder)object).append(" returned no addresses for ");
                    ((StringBuilder)object).append((String)object2);
                    throw new UnknownHostException(((StringBuilder)object).toString());
                }
                this.eventListener.dnsEnd(this.call, (String)object2, (List<InetAddress>)object);
            }
            object = object.iterator();
            while (true) {
                if (!object.hasNext()) {
                    return;
                }
                arrayList.add(new InetSocketAddress((InetAddress)object.next(), n8));
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("No route to ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(':');
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append("; port is out of range");
        throw new SocketException(((StringBuilder)object).toString());
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy object) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        this.proxies = object = RouteSelector.resetNextProxy$selectProxies((Proxy)object, httpUrl, this);
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, (List<Proxy>)object);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy list, HttpUrl object, RouteSelector routeSelector) {
        if (list != null) {
            return o.d(list);
        }
        list = ((HttpUrl)object).uri();
        if (((URI)((Object)list)).getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        list = routeSelector.address.proxySelector().select((URI)((Object)list));
        object = list;
        if (object != null && !object.isEmpty()) {
            l.e(list, "proxiesOrNull");
            return Util.toImmutableList(list);
        }
        return Util.immutableListOf(Proxy.NO_PROXY);
    }

    public final boolean hasNext() {
        return this.hasNextProxy() || !((Collection)this.postponedRoutes).isEmpty();
        {
        }
    }

    public final Selection next() throws IOException {
        if (this.hasNext()) {
            ArrayList<Route> arrayList = new ArrayList<Route>();
            while (this.hasNextProxy()) {
                Proxy proxy = this.nextProxy();
                for (InetSocketAddress inetSocketAddress : this.inetSocketAddresses) {
                    Route object = new Route(this.address, proxy, inetSocketAddress);
                    if (this.routeDatabase.shouldPostpone(object)) {
                        ((Collection)this.postponedRoutes).add(object);
                        continue;
                    }
                    arrayList.add(object);
                }
                if (arrayList.isEmpty()) continue;
            }
            if (arrayList.isEmpty()) {
                o.v(arrayList, (Iterable)this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final String getSocketHost(InetSocketAddress object) {
            l.f(object, "<this>");
            InetAddress inetAddress = ((InetSocketAddress)object).getAddress();
            if (inetAddress == null) {
                object = ((InetSocketAddress)object).getHostName();
                l.e(object, "hostName");
                return object;
            }
            object = inetAddress.getHostAddress();
            l.e(object, "address.hostAddress");
            return object;
        }
    }

    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            l.f(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (this.hasNext()) {
                List<Route> list = this.routes;
                int n8 = this.nextRouteIndex;
                this.nextRouteIndex = n8 + 1;
                return list.get(n8);
            }
            throw new NoSuchElementException();
        }
    }
}

