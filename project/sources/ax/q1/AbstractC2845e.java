package ax.q1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.N;
import java.io.IOException;

/* renamed from: ax.q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2845e {
    protected final a a;
    protected final f b;
    protected c c;
    private final int d;

    /* renamed from: ax.q1.e$a */
    public static class a implements N {
        private final d a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        public long f(long j) {
            return this.a.a(j);
        }

        @Override // ax.q1.N
        public boolean i() {
            return true;
        }

        @Override // ax.q1.N
        public N.a l(long j) {
            return new N.a(new O(j, c.h(this.a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // ax.q1.N
        public long n() {
            return this.b;
        }
    }

    /* renamed from: ax.q1.e$c */
    protected static class c {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        protected static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return d0.q(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.b;
        }

        private void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ax.q1.e$d */
    public interface d {
        long a(long j);
    }

    /* renamed from: ax.q1.e$e, reason: collision with other inner class name */
    public static final class C0426e {
        public static final C0426e d = new C0426e(-3, -9223372036854775807L, -1);
        private final int a;
        private final long b;
        private final long c;

        private C0426e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static C0426e d(long j, long j2) {
            return new C0426e(-1, j, j2);
        }

        public static C0426e e(long j) {
            return new C0426e(0, -9223372036854775807L, j);
        }

        public static C0426e f(long j, long j2) {
            return new C0426e(-2, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ax.q1.e$f */
    public interface f {
        C0426e a(InterfaceC2858s interfaceC2858s, long j) throws IOException;

        void b();
    }

    protected AbstractC2845e(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    protected c a(long j) {
        return new c(j, this.a.f(j), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }

    public final N b() {
        return this.a;
    }

    public int c(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        while (true) {
            c cVar = (c) C0968a.i(this.c);
            long j = cVar.j();
            long i = cVar.i();
            long k = cVar.k();
            if (i - j <= this.d) {
                e(false, j);
                return g(interfaceC2858s, j, m);
            }
            if (!i(interfaceC2858s, k)) {
                return g(interfaceC2858s, k, m);
            }
            interfaceC2858s.m();
            C0426e a2 = this.b.a(interfaceC2858s, cVar.m());
            int i2 = a2.a;
            if (i2 == -3) {
                e(false, k);
                return g(interfaceC2858s, k, m);
            }
            if (i2 == -2) {
                cVar.p(a2.b, a2.c);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC2858s, a2.c);
                    e(true, a2.c);
                    return g(interfaceC2858s, a2.c, m);
                }
                cVar.o(a2.b, a2.c);
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    protected final void e(boolean z, long j) {
        this.c = null;
        this.b.b();
        f(z, j);
    }

    protected final int g(InterfaceC2858s interfaceC2858s, long j, M m) {
        if (j == interfaceC2858s.getPosition()) {
            return 0;
        }
        m.a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.l() != j) {
            this.c = a(j);
        }
    }

    protected final boolean i(InterfaceC2858s interfaceC2858s, long j) throws IOException {
        long position = j - interfaceC2858s.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC2858s.n((int) position);
        return true;
    }

    /* renamed from: ax.q1.e$b */
    public static final class b implements d {
        @Override // ax.q1.AbstractC2845e.d
        public long a(long j) {
            return j;
        }
    }

    protected void f(boolean z, long j) {
    }
}
