/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import ax.P0.A;
import ax.P0.C;
import ax.P0.F;
import ax.P0.G;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.n;
import ax.P0.r;
import ax.P0.y;
import ax.R0.a;
import ax.S0.I;
import ax.S0.d0;
import java.util.List;

public interface H {
    public long A();

    public void B(y var1, boolean var2);

    public long C();

    public int D();

    public void E(TextureView var1);

    public a0 F();

    public void G(ax.P0.c var1, boolean var2);

    public void H();

    public void I(List<y> var1, boolean var2);

    public boolean J();

    public int K();

    public void L(SurfaceView var1);

    public I M();

    public void N(d var1);

    public void O(int var1, int var2);

    @Deprecated
    public int P();

    public void Q();

    public F R();

    public void S(boolean var1);

    public long T();

    public void U(y var1);

    public long V();

    public boolean W();

    public V X();

    public boolean Y();

    public ax.R0.c Z();

    public int a0();

    public int b0();

    public boolean c0(int var1);

    public void d0(SurfaceView var1);

    public void e(G var1);

    public boolean e0();

    public void f();

    public int f0();

    public void g(float var1);

    public long g0();

    public G h();

    public N h0();

    public int i();

    public Looper i0();

    public void j(int var1);

    public boolean j0();

    public void k();

    public T k0();

    public void l(float var1);

    public long l0();

    public void m();

    public void m0();

    public boolean n();

    public void n0();

    public int o();

    public void o0(TextureView var1);

    public boolean p();

    public void p0();

    public void q(d var1);

    public A q0();

    public long r();

    public void s(int var1, long var2);

    public long s0();

    public void stop();

    public void t(long var1);

    public long t0();

    public b u();

    public boolean u0();

    public boolean v();

    public void w(T var1);

    public void x();

    public y y();

    public void z(boolean var1);

    public static final class b {
        public static final b b = new a().e();
        private static final String c = d0.G0(0);
        private final r a;

        private b(r r8) {
            this.a = r8;
        }

        public boolean b(int n8) {
            return this.a.a(n8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return this.a.equals(((b)object).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public static final class a {
            private static final int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            private final r.b a = new r.b();

            public a a(int n8) {
                this.a.a(n8);
                return this;
            }

            public a b(b b8) {
                this.a.b(b8.a);
                return this;
            }

            public a c(int ... nArray) {
                this.a.c(nArray);
                return this;
            }

            public a d(int n8, boolean bl) {
                this.a.d(n8, bl);
                return this;
            }

            public b e() {
                return new b(this.a.e());
            }
        }
    }

    public static final class c {
        private final r a;

        public c(r r8) {
            this.a = r8;
        }

        public boolean a(int ... nArray) {
            return this.a.b(nArray);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return this.a.equals(((c)object).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static interface d {
        public void D(int var1);

        @Deprecated
        public void E(boolean var1);

        @Deprecated
        public void F(int var1);

        public void H(V var1);

        public void I(boolean var1);

        public void J(F var1);

        public void L(float var1);

        public void N(F var1);

        public void O(int var1);

        public void P(N var1, int var2);

        public void S(boolean var1);

        public void U(T var1);

        public void W(b var1);

        public void Y(int var1, boolean var2);

        @Deprecated
        public void Z(boolean var1, int var2);

        public void a(a0 var1);

        public void a0(y var1, int var2);

        public void b0();

        public void c(int var1);

        public void c0(H var1, c var2);

        public void e(boolean var1);

        public void i0(boolean var1, int var2);

        public void j(G var1);

        public void j0(A var1);

        public void k0(n var1);

        public void o0(int var1, int var2);

        public void p0(e var1, e var2, int var3);

        public void r(C var1);

        public void r0(ax.P0.c var1);

        public void s(ax.R0.c var1);

        @Deprecated
        public void t(List<a> var1);

        public void t0(boolean var1);

        public void v(int var1);
    }

    public static final class e {
        static final String k = d0.G0(0);
        private static final String l = d0.G0(1);
        static final String m = d0.G0(2);
        static final String n = d0.G0(3);
        static final String o = d0.G0(4);
        private static final String p = d0.G0(5);
        private static final String q = d0.G0(6);
        public final Object a;
        @Deprecated
        public final int b;
        public final int c;
        public final y d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public e(Object object, int n8, y y8, Object object2, int n9, long l8, long l9, int n10, int n11) {
            this.a = object;
            this.b = n8;
            this.c = n8;
            this.d = y8;
            this.e = object2;
            this.f = n9;
            this.g = l8;
            this.h = l9;
            this.i = n10;
            this.j = n11;
        }

        public boolean a(e e8) {
            return this.c == e8.c && this.f == e8.f && this.g == e8.g && this.h == e8.h && this.i == e8.i && this.j == e8.j && j.Objects.equals((Object)this.d, (Object)e8.d);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            return object != null && e.class == object.getClass() && this.a((e)(object = (e)object)) && j.Objects.equals((Object)this.a, (Object)((e)object).a) && j.Objects.equals((Object)this.e, (Object)((e)object).e);
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
        }

        public String toString() {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("mediaItem=");
            charSequence.append(this.c);
            charSequence.append(", period=");
            charSequence.append(this.f);
            charSequence.append(", pos=");
            charSequence.append(this.g);
            charSequence = charSequence.toString();
            if (this.i == -1) {
                return charSequence;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(", contentPos=");
            stringBuilder.append(this.h);
            stringBuilder.append(", adGroup=");
            stringBuilder.append(this.i);
            stringBuilder.append(", ad=");
            stringBuilder.append(this.j);
            return stringBuilder.toString();
        }
    }
}

