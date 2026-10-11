package ax.r1;

import android.net.Uri;
import ax.N1.t;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.q1.C2850j;
import ax.q1.C2855o;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.I;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.r;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: ax.r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2940b implements r {
    public static final InterfaceC2863x s = new InterfaceC2863x() { // from class: ax.r1.a
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return C2940b.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private static final int[] t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] v = d0.x0("#!AMR\n");
    private static final byte[] w = d0.x0("#!AMR-WB\n");
    private final byte[] a;
    private final int b;
    private final U c;
    private boolean d;
    private long e;
    private int f;
    private int g;
    private long h;
    private int i;
    private int j;
    private long k;
    private InterfaceC2859t l;
    private U m;
    private U n;
    private N o;
    private boolean p;
    private long q;
    private boolean r;

    public C2940b() {
        this(0);
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new C2940b()};
    }

    private void h() {
        C0968a.i(this.m);
        d0.i(this.l);
    }

    private static int i(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private N j(long j, boolean z) {
        return new C2850j(j, this.h, i(this.i, 20000L), this.i, z);
    }

    private int l(int i) throws E {
        if (o(i)) {
            return this.d ? u[i] : t[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw E.a(sb.toString(), null);
    }

    private boolean m(int i) {
        if (this.d) {
            return false;
        }
        return i < 12 || i > 14;
    }

    private boolean n(long j, long j2) {
        return Math.abs(j2 - j) < 20000;
    }

    private boolean o(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        return p(i) || m(i);
    }

    private boolean p(int i) {
        if (this.d) {
            return i < 10 || i > 13;
        }
        return false;
    }

    private void q() {
        if (this.r) {
            return;
        }
        this.r = true;
        boolean z = this.d;
        String str = z ? "audio/amr-wb" : "audio/amr";
        this.m.e(new C0912v.b().W(str).y0(z ? "audio/amr-wb" : "audio/3gpp").o0(z ? u[8] : t[7]).T(1).z0(z ? 16000 : 8000).P());
    }

    private void r(long j, int i) {
        int i2;
        if (this.o != null) {
            return;
        }
        int i3 = this.b;
        if ((i3 & 4) != 0) {
            this.o = new I(new long[]{this.h}, new long[]{0}, -9223372036854775807L);
        } else if ((i3 & 1) == 0 || !((i2 = this.i) == -1 || i2 == this.f)) {
            this.o = new N.b(-9223372036854775807L);
        } else if (this.j >= 20 || i == -1) {
            N j2 = j(j, (i3 & 2) != 0);
            this.o = j2;
            this.m.d(j2.n());
        }
        N n = this.o;
        if (n != null) {
            this.l.h(n);
        }
    }

    private static boolean s(InterfaceC2858s interfaceC2858s, byte[] bArr) throws IOException {
        interfaceC2858s.m();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2858s.p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int t(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.m();
        interfaceC2858s.p(this.a, 0, 1);
        byte b = this.a[0];
        if ((b & 131) <= 0) {
            return l((b >> 3) & 15);
        }
        throw E.a("Invalid padding bits for frame header " + ((int) b), null);
    }

    private boolean u(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr = v;
        if (s(interfaceC2858s, bArr)) {
            this.d = false;
            interfaceC2858s.n(bArr.length);
            return true;
        }
        byte[] bArr2 = w;
        if (!s(interfaceC2858s, bArr2)) {
            return false;
        }
        this.d = true;
        interfaceC2858s.n(bArr2.length);
        return true;
    }

    private int v(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.g == 0) {
            try {
                int t2 = t(interfaceC2858s);
                this.f = t2;
                this.g = t2;
                if (this.i == -1) {
                    this.h = interfaceC2858s.getPosition();
                    this.i = this.f;
                }
                if (this.i == this.f) {
                    this.j++;
                }
                N n = this.o;
                if (n instanceof I) {
                    I i = (I) n;
                    long j = this.k + this.e + 20000;
                    long position = interfaceC2858s.getPosition() + this.f;
                    if (!i.b(j, 100000L)) {
                        i.a(j, position);
                    }
                    if (this.p && n(j, this.q)) {
                        this.p = false;
                        this.n = this.m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a = this.n.a(interfaceC2858s, this.g, true);
        if (a == -1) {
            return -1;
        }
        int i2 = this.g - a;
        this.g = i2;
        if (i2 > 0) {
            return 0;
        }
        this.n.f(this.k + this.e, 1, this.f, 0, null);
        this.e += 20000;
        return 0;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.l = interfaceC2859t;
        U u2 = interfaceC2859t.u(0, 1);
        this.m = u2;
        this.n = u2;
        interfaceC2859t.o();
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        N n = this.o;
        if (!(n instanceof I)) {
            if (j == 0 || !(n instanceof C2850j)) {
                this.k = 0L;
                return;
            } else {
                this.k = ((C2850j) n).b(j);
                return;
            }
        }
        long j3 = ((I) n).j(j);
        this.k = j3;
        if (n(j3, this.q)) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return u(interfaceC2858s);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        h();
        if (interfaceC2858s.getPosition() == 0 && !u(interfaceC2858s)) {
            throw E.a("Could not find AMR header.", null);
        }
        q();
        int v2 = v(interfaceC2858s);
        r(interfaceC2858s.getLength(), v2);
        if (v2 == -1) {
            N n = this.o;
            if (n instanceof I) {
                long j = this.k + this.e;
                ((I) n).c(j);
                this.l.h(this.o);
                this.m.d(j);
            }
        }
        return v2;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public C2940b(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.i = -1;
        C2855o c2855o = new C2855o();
        this.c = c2855o;
        this.n = c2855o;
    }

    @Override // ax.q1.r
    public void d() {
    }
}
