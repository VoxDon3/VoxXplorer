/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.K7.b;
import ax.K7.i;
import ax.U7.c;
import ax.U7.d;
import ax.U7.e;
import java.io.IOException;

public final class a
implements ax.V7.a {
    public static final ax.V7.a a = new a();

    private a() {
    }

    @Override
    public void a(ax.V7.b<?> b8) {
        a a8 = ax.K7.a$a.a;
        b8.a(i.class, a8);
        b8.a(b.class, a8);
    }

    private static final class a
    implements d<i> {
        static final a a = new a();
        private static final c b = ax.U7.c.d("rolloutId");
        private static final c c = ax.U7.c.d("parameterKey");
        private static final c d = ax.U7.c.d("parameterValue");
        private static final c e = ax.U7.c.d("variantId");
        private static final c f = ax.U7.c.d("templateVersion");

        private a() {
        }

        public void b(i i8, e e8) throws IOException {
            e8.e(b, i8.e());
            e8.e(c, i8.c());
            e8.e(d, i8.d());
            e8.e(e, i8.g());
            e8.c(f, i8.f());
        }
    }
}

