package ax.i1;

import android.os.Handler;
import ax.N1.t;
import ax.P0.C0915y;
import ax.Z0.I1;
import ax.b1.InterfaceC1471u;
import ax.m1.f;
import java.io.IOException;

/* renamed from: ax.i1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2209F {

    /* renamed from: ax.i1.F$a */
    public interface a {
        a a(t.a aVar);

        a b(int i);

        @Deprecated
        a c(boolean z);

        a d(f.a aVar);

        InterfaceC2209F e(C0915y c0915y);

        a f(ax.b1.z zVar);

        a g(ax.m1.m mVar);
    }

    /* renamed from: ax.i1.F$b */
    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.a.equals(obj) ? this : new b(obj, this.b, this.c, this.d, this.e);
        }

        public boolean b() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public int hashCode() {
            return ((((((((527 + this.a.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }
    }

    /* renamed from: ax.i1.F$c */
    public interface c {
        void a(InterfaceC2209F interfaceC2209F, ax.P0.N n);
    }

    void a(C0915y c0915y);

    void b(c cVar);

    void c(Handler handler, N n);

    void d(c cVar);

    void e(InterfaceC2206C interfaceC2206C);

    void g(N n);

    InterfaceC2206C i(b bVar, ax.m1.b bVar2, long j);

    C0915y j();

    void k() throws IOException;

    void l(c cVar, ax.U0.z zVar, I1 i1);

    boolean m();

    void n(InterfaceC1471u interfaceC1471u);

    ax.P0.N o();

    void p(Handler handler, InterfaceC1471u interfaceC1471u);

    void q(c cVar);
}
