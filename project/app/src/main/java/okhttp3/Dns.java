/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.tb.i;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public interface Dns {
    public static final Companion Companion = okhttp3.Dns$Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    public List<InetAddress> lookup(String var1) throws UnknownHostException;

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final class DnsSystem
        implements Dns {
            @Override
            public List<InetAddress> lookup(String object) {
                l.f(object, "hostname");
                try {
                    Object object2 = InetAddress.getAllByName((String)object);
                    l.e(object2, "getAllByName(hostname)");
                    object2 = i.E(object2);
                    return object2;
                }
                catch (NullPointerException nullPointerException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Broken system behaviour for dns lookup of ");
                    stringBuilder.append((String)object);
                    object = new UnknownHostException(stringBuilder.toString());
                    ((Throwable)object).initCause(nullPointerException);
                    throw object;
                }
            }
        }
    }
}

