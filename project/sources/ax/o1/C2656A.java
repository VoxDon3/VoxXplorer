package ax.o1;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.C0622s;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;
import ax.S0.d0;

/* renamed from: ax.o1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2656A {
    private final b a;
    private final C2659D b;
    private final long c;
    private boolean d;
    private long g;
    private boolean j;
    private boolean m;
    private boolean n;
    private boolean o;
    private int e = 0;
    private long f = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private float k = 1.0f;
    private InterfaceC0975h l = InterfaceC0975h.a;

    /* renamed from: ax.o1.A$a */
    public static class a {
        private long a = -9223372036854775807L;
        private long b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
        }

        public long f() {
            return this.a;
        }

        public long g() {
            return this.b;
        }
    }

    /* renamed from: ax.o1.A$b */
    public interface b {
        boolean E(long j, long j2);

        boolean g(long j, long j2, long j3, boolean z, boolean z2) throws C0622s;

        boolean y(long j, long j2, boolean z);
    }

    public C2656A(Context context, b bVar, long j) {
        this.a = bVar;
        this.c = j;
        this.b = new C2659D(context);
    }

    private long b(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.k);
        return this.d ? j4 - (d0.a1(this.l.b()) - j2) : j4;
    }

    private void f(int i) {
        this.e = Math.min(this.e, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5 != r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.i
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L11
            boolean r0 = r7.j
            if (r0 != 0) goto L11
            return r2
        L11:
            int r0 = r7.e
            if (r0 == 0) goto L54
            r1 = 1
            if (r0 == r1) goto L53
            r5 = 2
            if (r0 == r5) goto L4d
            r12 = 3
            if (r0 != r12) goto L47
            ax.S0.h r12 = r7.l
            long r12 = r12.b()
            long r12 = ax.S0.d0.a1(r12)
            long r5 = r7.g
            long r12 = r12 - r5
            boolean r0 = r7.d
            if (r0 == 0) goto L46
            boolean r0 = r7.o
            if (r0 != 0) goto L3d
            long r5 = r7.f
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L46
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L46
        L3d:
            ax.o1.A$b r8 = r7.a
            boolean r8 = r8.E(r10, r12)
            if (r8 == 0) goto L46
            return r1
        L46:
            return r2
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L4d:
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 < 0) goto L52
            return r1
        L52:
            return r2
        L53:
            return r1
        L54:
            boolean r8 = r7.d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o1.C2656A.q(long, long, long):boolean");
    }

    public void a() {
        if (this.e == 0) {
            this.e = 1;
        }
    }

    public int c(long j, long j2, long j3, long j4, boolean z, boolean z2, a aVar) throws C0622s {
        aVar.h();
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            this.b.h(j);
            this.h = j;
        }
        aVar.a = b(j2, j3, j);
        if (z && !z2) {
            return 3;
        }
        if (!this.m) {
            this.n = true;
            if (this.a.g(aVar.a, j2, j3, z2, true)) {
                return 4;
            }
            return (!this.d || aVar.a >= 30000) ? 5 : 3;
        }
        if (q(j2, aVar.a, j4)) {
            return 0;
        }
        if (!this.d || j2 == this.f) {
            return 5;
        }
        long nanoTime = this.l.nanoTime();
        aVar.b = this.b.b((aVar.a * 1000) + nanoTime);
        aVar.a = (aVar.b - nanoTime) / 1000;
        boolean z3 = (this.i == -9223372036854775807L || this.j) ? false : true;
        if (this.a.g(aVar.a, j2, j3, z2, z3)) {
            return 4;
        }
        return this.a.y(aVar.a, j3, z2) ? z3 ? 3 : 2 : aVar.a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.b() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z) {
        this.j = z;
        this.i = this.c > 0 ? this.l.b() + this.c : -9223372036854775807L;
    }

    public boolean g() {
        boolean z = this.e != 3;
        this.e = 3;
        this.g = d0.a1(this.l.b());
        return z;
    }

    public void h() {
        this.d = true;
        this.g = d0.a1(this.l.b());
        this.b.k();
    }

    public void i() {
        this.d = false;
        this.i = -9223372036854775807L;
        this.b.l();
    }

    public void j(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.b.j();
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        f(1);
        this.i = -9223372036854775807L;
    }

    public void l(int i) {
        this.b.o(i);
    }

    public void m(InterfaceC0975h interfaceC0975h) {
        this.l = interfaceC0975h;
    }

    public void n(float f) {
        this.b.g(f);
    }

    public void o(Surface surface) {
        this.m = surface != null;
        this.n = false;
        this.b.m(surface);
        f(1);
    }

    public void p(float f) {
        C0968a.a(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        this.b.i(f);
    }
}
