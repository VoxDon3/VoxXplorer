/*
 * Decompiled with CFR 0.152.
 */
package ax.V3;

import ax.M3.j;
import ax.U3.g;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;
import java.net.URL;

public class e
implements m<URL, InputStream> {
    private final m<g, InputStream> a;

    public e(m<g, InputStream> m8) {
        this.a = m8;
    }

    public m.a<InputStream> c(URL uRL, int n8, int n9, j j8) {
        return this.a.a(new g(uRL), n8, n9, j8);
    }

    public boolean d(URL uRL) {
        return true;
    }

    public static class a
    implements n<URL, InputStream> {
        @Override
        public m<URL, InputStream> b(q q8) {
            return new e(q8.d(g.class, InputStream.class));
        }
    }
}

