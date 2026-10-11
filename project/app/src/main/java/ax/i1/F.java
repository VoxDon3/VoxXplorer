/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.os.Handler;
import ax.N1.t;
import ax.P0.y;
import ax.Z0.I1;
import ax.b1.u;
import ax.b1.z;
import ax.i1.C;
import ax.i1.N;
import ax.m1.f;
import ax.m1.m;
import java.io.IOException;

public interface F {
    public void a(y var1);

    public void b(c var1);

    public void c(Handler var1, N var2);

    public void d(c var1);

    public void e(C var1);

    public void g(N var1);

    public C i(b var1, ax.m1.b var2, long var3);

    public y j();

    public void k() throws IOException;

    public void l(c var1, ax.U0.z var2, I1 var3);

    public boolean m();

    public void n(u var1);

    public ax.P0.N o();

    public void p(Handler var1, u var2);

    public void q(c var1);

    public static interface a {
        public a a(t.a var1);

        public a b(int var1);

        @Deprecated
        public a c(boolean var1);

        public a d(f.a var1);

        public F e(y var1);

        public a f(z var1);

        public a g(m var1);
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object object) {
            this(object, -1L);
        }

        public b(Object object, int n8, int n9, long l8) {
            this(object, n8, n9, l8, -1);
        }

        private b(Object object, int n8, int n9, long l8, int n10) {
            this.a = object;
            this.b = n8;
            this.c = n9;
            this.d = l8;
            this.e = n10;
        }

        public b(Object object, long l8) {
            this(object, -1, -1, l8, -1);
        }

        public b(Object object, long l8, int n8) {
            this(object, -1, -1, l8, n8);
        }

        public b a(Object object) {
            if (this.a.equals(object)) {
                return this;
            }
            return new b(object, this.b, this.c, this.d, this.e);
        }

        public boolean b() {
            return this.b != -1;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return this.a.equals(((b)object).a) && this.b == ((b)object).b && this.c == ((b)object).c && this.d == ((b)object).d && this.e == ((b)object).e;
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
        }
    }

    public static interface c {
        public void a(F var1, ax.P0.N var2);
    }
}

