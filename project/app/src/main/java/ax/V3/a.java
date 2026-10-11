/*
 * Decompiled with CFR 0.152.
 */
package ax.V3;

import ax.M3.i;
import ax.M3.j;
import ax.N3.h;
import ax.U3.g;
import ax.U3.l;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;

public class a
implements m<g, InputStream> {
    public static final i<Integer> b = i.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final l<g, g> a;

    public a(l<g, g> l8) {
        this.a = l8;
    }

    public m.a<InputStream> c(g g8, int n8, int n9, j j8) {
        l<g, g> l8 = this.a;
        g g9 = g8;
        if (l8 != null && (g9 = l8.a(g8, 0, 0)) == null) {
            this.a.b(g8, 0, 0, g8);
            g9 = g8;
        }
        return new m.a<InputStream>(g9, new h(g9, j8.c(b)));
    }

    public boolean d(g g8) {
        return true;
    }

    public static class a
    implements n<g, InputStream> {
        private final l<g, g> a = new l(500);

        @Override
        public m<g, InputStream> b(q q8) {
            return new a(this.a);
        }
    }
}

