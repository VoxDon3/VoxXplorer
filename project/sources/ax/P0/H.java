package ax.P0;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import ax.P0.r;
import ax.S0.d0;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public interface H {

    public static final class b {
        public static final b b = new a().e();
        private static final String c = d0.G0(0);
        private final r a;

        public static final class a {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            private final r.b a = new r.b();

            public a a(int i) {
                this.a.a(i);
                return this;
            }

            public a b(b bVar) {
                this.a.b(bVar.a);
                return this;
            }

            public a c(int... iArr) {
                this.a.c(iArr);
                return this;
            }

            public a d(int i, boolean z) {
                this.a.d(i, z);
                return this;
            }

            public b e() {
                return new b(this.a.e());
            }
        }

        public boolean b(int i) {
            return this.a.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private b(r rVar) {
            this.a = rVar;
        }
    }

    public static final class c {
        private final r a;

        public c(r rVar) {
            this.a = rVar;
        }

        public boolean a(int... iArr) {
            return this.a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public interface d {
        void D(int i);

        @Deprecated
        void E(boolean z);

        @Deprecated
        void F(int i);

        void H(V v);

        void I(boolean z);

        void J(F f);

        void L(float f);

        void N(F f);

        void O(int i);

        void P(N n, int i);

        void S(boolean z);

        void U(T t);

        void W(b bVar);

        void Y(int i, boolean z);

        @Deprecated
        void Z(boolean z, int i);

        void a(a0 a0Var);

        void a0(C0915y c0915y, int i);

        void b0();

        void c(int i);

        void c0(H h, c cVar);

        void e(boolean z);

        void i0(boolean z, int i);

        void j(G g);

        void j0(A a);

        void k0(C0905n c0905n);

        void o0(int i, int i2);

        void p0(e eVar, e eVar2, int i);

        void r(C c);

        void r0(C0894c c0894c);

        void s(ax.R0.c cVar);

        @Deprecated
        void t(List<ax.R0.a> list);

        void t0(boolean z);

        void v(int i);
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
        public final C0915y d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public e(Object obj, int i, C0915y c0915y, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.a = obj;
            this.b = i;
            this.c = i;
            this.d = c0915y;
            this.e = obj2;
            this.f = i2;
            this.g = j;
            this.h = j2;
            this.i = i3;
            this.j = i4;
        }

        public boolean a(e eVar) {
            return this.c == eVar.c && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && this.j == eVar.j && Objects.equals(this.d, eVar.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.a, eVar.a) && Objects.equals(this.e, eVar.e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
        }

        public String toString() {
            String str = "mediaItem=" + this.c + ", period=" + this.f + ", pos=" + this.g;
            if (this.i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.h + ", adGroup=" + this.i + ", ad=" + this.j;
        }
    }

    long A();

    void B(C0915y c0915y, boolean z);

    long C();

    int D();

    void E(TextureView textureView);

    a0 F();

    void G(C0894c c0894c, boolean z);

    void H();

    void I(List<C0915y> list, boolean z);

    boolean J();

    int K();

    void L(SurfaceView surfaceView);

    ax.S0.I M();

    void N(d dVar);

    void O(int i, int i2);

    @Deprecated
    int P();

    void Q();

    F R();

    void S(boolean z);

    long T();

    void U(C0915y c0915y);

    long V();

    boolean W();

    V X();

    boolean Y();

    ax.R0.c Z();

    int a0();

    int b0();

    boolean c0(int i);

    void d0(SurfaceView surfaceView);

    void e(G g);

    boolean e0();

    void f();

    int f0();

    void g(float f);

    long g0();

    G h();

    N h0();

    int i();

    Looper i0();

    void j(int i);

    boolean j0();

    void k();

    T k0();

    void l(float f);

    long l0();

    void m();

    void m0();

    boolean n();

    void n0();

    int o();

    void o0(TextureView textureView);

    boolean p();

    void p0();

    void q(d dVar);

    A q0();

    long r();

    void s(int i, long j);

    long s0();

    void stop();

    void t(long j);

    long t0();

    b u();

    boolean u0();

    boolean v();

    void w(T t);

    void x();

    C0915y y();

    void z(boolean z);
}
