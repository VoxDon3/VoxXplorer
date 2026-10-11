/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Address;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        l.f(address, "address");
        l.f(proxy, "proxy");
        l.f(inetSocketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final Address -deprecated_address() {
        return this.address;
    }

    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    public final InetSocketAddress -deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object object) {
        if (object instanceof Route) {
            object = (Route)object;
            if (l.a(((Route)object).address, this.address) && l.a(((Route)object).proxy, this.proxy) && l.a(((Route)object).socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.address.hashCode()) * 31 + this.proxy.hashCode()) * 31 + this.socketAddress.hashCode();
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Route{");
        stringBuilder.append(this.socketAddress);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

