/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.g;
import ax.L1.i;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.A;
import ax.q1.B;
import ax.q1.N;
import ax.q1.s;
import ax.q1.y;
import ax.q1.z;
import java.util.Arrays;

final class b
extends i {
    private B n;
    private a o;

    b() {
    }

    private int n(G g8) {
        int n8 = (g8.f()[2] & 0xFF) >> 4;
        if (n8 == 6 || n8 == 7) {
            g8.c0(4);
            g8.V();
        }
        n8 = y.j(g8, n8);
        g8.b0(0);
        return n8;
    }

    private static boolean o(byte[] byArray) {
        return byArray[0] == -1;
    }

    public static boolean p(G g8) {
        return g8.a() >= 5 && g8.M() == 127 && g8.O() == 1179402563L;
    }

    @Override
    protected long f(G g8) {
        if (!b.o(g8.f())) {
            return -1L;
        }
        return this.n(g8);
    }

    @Override
    protected boolean h(G object, long l8, i.b object2) {
        byte[] byArray = ((G)object).f();
        B b8 = this.n;
        if (b8 == null) {
            this.n = b8 = new B(byArray, 17);
            ((i.b)object2).a = b8.g(Arrays.copyOfRange(byArray, 9, ((G)object).j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((byArray[0] & 0x7F) == 3) {
            object = z.f((G)object);
            this.n = object2 = b8.b((B.a)object);
            this.o = new a((B)object2, (B.a)object);
            return true;
        }
        if (b.o(byArray)) {
            object = this.o;
            if (object != null) {
                ((a)object).d(l8);
                ((i.b)object2).b = this.o;
            }
            ax.S0.a.e(((i.b)object2).a);
            return false;
        }
        return true;
    }

    @Override
    protected void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = null;
            this.o = null;
        }
    }

    private static final class a
    implements g {
        private B a;
        private B.a b;
        private long c;
        private long d;

        public a(B b8, B.a a8) {
            this.a = b8;
            this.b = a8;
            this.c = -1L;
            this.d = -1L;
        }

        @Override
        public N a() {
            boolean bl = this.c != -1L;
            ax.S0.a.g(bl);
            return new A(this.a, this.c);
        }

        @Override
        public long b(s s8) {
            long l8 = this.d;
            if (l8 >= 0L) {
                l8 = -(l8 + 2L);
                this.d = -1L;
                return l8;
            }
            return -1L;
        }

        @Override
        public void c(long l8) {
            long[] lArray = this.b.a;
            this.d = lArray[d0.h(lArray, l8, true, true)];
        }

        public void d(long l8) {
            this.c = l8;
        }
    }
}

