/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.u0;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public abstract class v0 {
    private static v0 a = new u0(null);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static v0 a() {
        synchronized (v0.class) {
            return a;
        }
    }

    public abstract URLConnection b(URL var1, String var2) throws IOException;
}

