/*
 * Decompiled with CFR 0.152.
 */
package ax.m8;

import ax.U7.c;
import ax.U7.e;
import ax.m8.b;
import ax.m8.d;
import java.io.IOException;

public final class a
implements ax.V7.a {
    public static final ax.V7.a a = new a();

    private a() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        a a8 = ax.m8.a$a.a;
        b8.a(d.class, a8);
        b8.a(b.class, a8);
    }

    private static final class a
    implements ax.U7.d<d> {
        static final a a = new a();
        private static final c b = ax.U7.c.d("rolloutId");
        private static final c c = ax.U7.c.d("variantId");
        private static final c d = ax.U7.c.d("parameterKey");
        private static final c e = ax.U7.c.d("parameterValue");
        private static final c f = ax.U7.c.d("templateVersion");

        private a() {
        }

        public void b(d d8, e e8) throws IOException {
            e8.e(b, d8.d());
            e8.e(c, d8.f());
            e8.e(d, d8.b());
            e8.e(e, d8.c());
            e8.c(f, d8.e());
        }
    }
}

