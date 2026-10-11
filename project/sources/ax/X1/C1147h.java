package ax.X1;

import android.net.Uri;
import ax.N1.t;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.C2850j;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: ax.X1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147h implements ax.q1.r {
    public static final InterfaceC2863x m = new InterfaceC2863x() { // from class: ax.X1.g
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final ax.q1.r[] c() {
            return C1147h.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private final int a;
    private final C1148i b;
    private final ax.S0.G c;
    private final ax.S0.G d;
    private final ax.S0.F e;
    private InterfaceC2859t f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    public C1147h() {
        this(0);
    }

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new C1147h()};
    }

    private void h(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.j) {
            return;
        }
        this.i = -1;
        interfaceC2858s.m();
        long j = 0;
        if (interfaceC2858s.getPosition() == 0) {
            m(interfaceC2858s);
        }
        int i = 0;
        int i2 = 0;
        while (interfaceC2858s.h(this.d.f(), 0, 2, true)) {
            try {
                this.d.b0(0);
                if (!C1148i.m(this.d.U())) {
                    break;
                }
                if (!interfaceC2858s.h(this.d.f(), 0, 4, true)) {
                    break;
                }
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    this.j = true;
                    throw ax.P0.E.a("Malformed ADTS stream", null);
                }
                j += h;
                i2++;
                if (i2 != 1000 && interfaceC2858s.o(h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i = i2;
        interfaceC2858s.m();
        if (i > 0) {
            this.i = (int) (j / i);
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    private static int i(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private ax.q1.N j(long j, boolean z) {
        return new C2850j(j, this.h, i(this.i, this.b.k()), this.i, z);
    }

    private void l(long j, boolean z) {
        if (this.l) {
            return;
        }
        boolean z2 = (this.a & 1) != 0 && this.i > 0;
        if (z2 && this.b.k() == -9223372036854775807L && !z) {
            return;
        }
        if (!z2 || this.b.k() == -9223372036854775807L) {
            this.f.h(new N.b(-9223372036854775807L));
        } else {
            this.f.h(j(j, (this.a & 2) != 0));
        }
        this.l = true;
    }

    private int m(InterfaceC2858s interfaceC2858s) throws IOException {
        int i = 0;
        while (true) {
            interfaceC2858s.p(this.d.f(), 0, 10);
            this.d.b0(0);
            if (this.d.P() != 4801587) {
                break;
            }
            this.d.c0(3);
            int L = this.d.L();
            i += L + 10;
            interfaceC2858s.j(L);
        }
        interfaceC2858s.m();
        interfaceC2858s.j(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.f = interfaceC2859t;
        this.b.d(interfaceC2859t, new L.d(0, 1));
        interfaceC2859t.o();
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.k = false;
        this.b.b();
        this.g = j2;
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        int m2 = m(interfaceC2858s);
        int i = m2;
        int i2 = 0;
        int i3 = 0;
        do {
            interfaceC2858s.p(this.d.f(), 0, 2);
            this.d.b0(0);
            if (C1148i.m(this.d.U())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                interfaceC2858s.p(this.d.f(), 0, 4);
                this.e.p(14);
                int h = this.e.h(13);
                if (h <= 6) {
                    i++;
                    interfaceC2858s.m();
                    interfaceC2858s.j(i);
                } else {
                    interfaceC2858s.j(h - 6);
                    i3 += h;
                }
            } else {
                i++;
                interfaceC2858s.m();
                interfaceC2858s.j(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - m2 < 8192);
        return false;
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m2) throws IOException {
        C0968a.i(this.f);
        long length = interfaceC2858s.getLength();
        int i = this.a;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            h(interfaceC2858s);
        }
        int c = interfaceC2858s.c(this.c.f(), 0, 2048);
        boolean z = c == -1;
        l(length, z);
        if (z) {
            return -1;
        }
        this.c.b0(0);
        this.c.a0(c);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.c(this.c);
        return 0;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public C1147h(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new C1148i(true, "audio/mp4a-latm");
        this.c = new ax.S0.G(2048);
        this.i = -1;
        this.h = -1L;
        ax.S0.G g = new ax.S0.G(10);
        this.d = g;
        this.e = new ax.S0.F(g.f());
    }

    @Override // ax.q1.r
    public void d() {
    }
}
