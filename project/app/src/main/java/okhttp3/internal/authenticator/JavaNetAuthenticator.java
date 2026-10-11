/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.authenticator;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.tb.o;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.Iterator;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class JavaNetAuthenticator
implements Authenticator {
    private final Dns defaultDns;

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    public JavaNetAuthenticator(Dns dns) {
        l.f(dns, "defaultDns");
        this.defaultDns = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int n8, g g8) {
        if ((n8 & 1) != 0) {
            dns = Dns.SYSTEM;
        }
        this(dns);
    }

    private final InetAddress connectToInetAddress(Proxy object, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = ((Proxy)object).type();
        int n8 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (n8 == 1) {
            return o.E(dns.lookup(httpUrl.host()));
        }
        object = ((Proxy)object).address();
        l.d(object, "null cannot be cast to non-null type java.net.InetSocketAddress");
        object = ((InetSocketAddress)object).getAddress();
        l.e(object, "address() as InetSocketAddress).address");
        return object;
    }

    @Override
    public Request authenticate(Route object, Response object2) throws IOException {
        Object object3;
        boolean bl;
        HttpUrl httpUrl;
        Request request;
        Object object4;
        block10: {
            block9: {
                l.f(object2, "response");
                object4 = ((Response)object2).challenges();
                request = ((Response)object2).request();
                httpUrl = request.url();
                bl = ((Response)object2).code() == 407;
                if (object == null) break block9;
                object2 = object3 = ((Route)object).proxy();
                if (object3 != null) break block10;
            }
            object2 = Proxy.NO_PROXY;
        }
        Iterator<Challenge> iterator = object4.iterator();
        while (iterator.hasNext()) {
            Challenge challenge;
            block12: {
                block11: {
                    challenge = iterator.next();
                    if (!h.v("Basic", challenge.scheme(), true)) continue;
                    if (object == null || (object3 = ((Route)object).address()) == null) break block11;
                    object3 = object4 = ((Address)object3).dns();
                    if (object4 != null) break block12;
                }
                object3 = this.defaultDns;
            }
            if (bl) {
                object4 = ((Proxy)object2).address();
                l.d(object4, "null cannot be cast to non-null type java.net.InetSocketAddress");
                object4 = (InetSocketAddress)object4;
                String string = ((InetSocketAddress)object4).getHostName();
                l.e(object2, "proxy");
                object3 = java.net.Authenticator.requestPasswordAuthentication(string, this.connectToInetAddress((Proxy)object2, httpUrl, (Dns)object3), ((InetSocketAddress)object4).getPort(), httpUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrl.url(), Authenticator.RequestorType.PROXY);
            } else {
                object4 = httpUrl.host();
                l.e(object2, "proxy");
                object3 = java.net.Authenticator.requestPasswordAuthentication((String)object4, this.connectToInetAddress((Proxy)object2, httpUrl, (Dns)object3), httpUrl.port(), httpUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrl.url(), Authenticator.RequestorType.SERVER);
            }
            if (object3 == null) continue;
            object = bl ? "Proxy-Authorization" : "Authorization";
            object2 = ((PasswordAuthentication)object3).getUserName();
            l.e(object2, "auth.userName");
            object3 = ((PasswordAuthentication)object3).getPassword();
            l.e(object3, "auth.password");
            object2 = Credentials.basic((String)object2, new String((char[])object3), challenge.charset());
            return request.newBuilder().header((String)object, (String)object2).build();
        }
        return null;
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[Proxy.Type.values().length];
            try {
                nArray[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

