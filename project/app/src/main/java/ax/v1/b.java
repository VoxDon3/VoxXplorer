/*
 * Decompiled with CFR 0.152.
 */
package ax.v1;

import ax.q1.B;
import ax.q1.e;
import ax.q1.f;
import ax.q1.s;
import ax.q1.y;
import ax.v1.a;
import java.io.IOException;

final class b
extends e {
    public b(B b8, int n8, long l8, long l9) {
        j.Objects.requireNonNull((Object)b8);
        super(new a(b8), new b(b8, n8), b8.f(), 0L, b8.j, l8, l9, b8.d(), Math.max(6, b8.c));
    }

    private static final class b
    implements e.f {
        private final B a;
        private final int b;
        private final y.a c;

        private b(B b8, int n8) {
            this.a = b8;
            this.b = n8;
            this.c = new y.a();
        }

        private long c(s s8) throws IOException {
            while (s8.i() < s8.getLength() - 6L && !y.h(s8, this.a, this.b, this.c)) {
                s8.j(1);
            }
            if (s8.i() >= s8.getLength() - 6L) {
                s8.j((int)(s8.getLength() - s8.i()));
                return this.a.j;
            }
            return this.c.a;
        }

        @Override
        public e.e a(s s8, long l8) throws IOException {
            long l9 = s8.getPosition();
            long l10 = this.c(s8);
            long l11 = s8.i();
            s8.j(Math.max(6, this.a.c));
            long l12 = this.c(s8);
            long l13 = s8.i();
            if (l10 <= l8 && l12 > l8) {
                return e.e.e(l11);
            }
            if (l12 <= l8) {
                return e.e.f(l12, l13);
            }
            return e.e.d(l10, l9);
        }

        @Override
        public /* synthetic */ void b() {
            f.a(this);
        }
    }
}

