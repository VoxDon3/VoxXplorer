package ax.X1;

import android.net.Uri;
import android.util.SparseArray;
import ax.N1.t;
import ax.S0.C0968a;
import ax.X1.L;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements ax.q1.r {
    public static final InterfaceC2863x l = new InterfaceC2863x() { // from class: ax.X1.B
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
            return C.g();
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
    private final ax.S0.M a;
    private final SparseArray<a> b;
    private final ax.S0.G c;
    private final A d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private z i;
    private InterfaceC2859t j;
    private boolean k;

    private static final class a {
        private final InterfaceC1152m a;
        private final ax.S0.M b;
        private final ax.S0.F c = new ax.S0.F(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(InterfaceC1152m interfaceC1152m, ax.S0.M m) {
            this.a = interfaceC1152m;
            this.b = m;
        }

        private void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                this.c.r(1);
                this.c.r(1);
                long h = (this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15);
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    this.c.r(1);
                    this.c.r(1);
                    this.c.r(1);
                    this.b.b((this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15));
                    this.f = true;
                }
                this.h = this.b.b(h);
            }
        }

        public void a(ax.S0.G g) throws ax.P0.E {
            g.q(this.c.a, 0, 3);
            this.c.p(0);
            b();
            g.q(this.c.a, 0, this.g);
            this.c.p(0);
            c();
            this.a.f(this.h, 4);
            this.a.c(g);
            this.a.e(false);
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

    public C() {
        this(new ax.S0.M(0L));
    }

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new C()};
    }

    private void h(long j) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.c() == -9223372036854775807L) {
            this.j.h(new N.b(this.d.c()));
            return;
        }
        z zVar = new z(this.d.d(), this.d.c(), j);
        this.i = zVar;
        this.j.h(zVar.b());
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.j = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        boolean z = this.a.f() == -9223372036854775807L;
        if (!z) {
            long d = this.a.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            this.a.i(j2);
        }
        z zVar = this.i;
        if (zVar != null) {
            zVar.h(j2);
        }
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).d();
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC2858s.p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC2858s.j(bArr[13] & 7);
        interfaceC2858s.p(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        InterfaceC1152m interfaceC1152m;
        C0968a.i(this.j);
        long length = interfaceC2858s.getLength();
        if (length != -1 && !this.d.e()) {
            return this.d.g(interfaceC2858s, m);
        }
        h(length);
        z zVar = this.i;
        if (zVar != null && zVar.d()) {
            return this.i.c(interfaceC2858s, m);
        }
        interfaceC2858s.m();
        long i = length != -1 ? length - interfaceC2858s.i() : -1L;
        if ((i != -1 && i < 4) || !interfaceC2858s.h(this.c.f(), 0, 4, true)) {
            return -1;
        }
        this.c.b0(0);
        int v = this.c.v();
        if (v == 441) {
            return -1;
        }
        if (v == 442) {
            interfaceC2858s.p(this.c.f(), 0, 10);
            this.c.b0(9);
            interfaceC2858s.n((this.c.M() & 7) + 14);
            return 0;
        }
        if (v == 443) {
            interfaceC2858s.p(this.c.f(), 0, 2);
            this.c.b0(0);
            interfaceC2858s.n(this.c.U() + 6);
            return 0;
        }
        if (((v & (-256)) >> 8) != 1) {
            interfaceC2858s.n(1);
            return 0;
        }
        int i2 = v & 255;
        a aVar = this.b.get(i2);
        if (!this.e) {
            if (aVar == null) {
                if (i2 == 189) {
                    interfaceC1152m = new C1142c("video/mp2p");
                    this.f = true;
                    this.h = interfaceC2858s.getPosition();
                } else if ((v & 224) == 192) {
                    interfaceC1152m = new t("video/mp2p");
                    this.f = true;
                    this.h = interfaceC2858s.getPosition();
                } else if ((v & 240) == 224) {
                    interfaceC1152m = new C1153n("video/mp2p");
                    this.g = true;
                    this.h = interfaceC2858s.getPosition();
                } else {
                    interfaceC1152m = null;
                }
                if (interfaceC1152m != null) {
                    interfaceC1152m.d(this.j, new L.d(i2, 256));
                    aVar = new a(interfaceC1152m, this.a);
                    this.b.put(i2, aVar);
                }
            }
            if (interfaceC2858s.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.o();
            }
        }
        interfaceC2858s.p(this.c.f(), 0, 2);
        this.c.b0(0);
        int U = this.c.U() + 6;
        if (aVar == null) {
            interfaceC2858s.n(U);
        } else {
            this.c.X(U);
            interfaceC2858s.readFully(this.c.f(), 0, U);
            this.c.b0(6);
            aVar.a(this.c);
            ax.S0.G g = this.c;
            g.a0(g.b());
        }
        return 0;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public C(ax.S0.M m) {
        this.a = m;
        this.c = new ax.S0.G(4096);
        this.b = new SparseArray<>();
        this.d = new A();
    }

    @Override // ax.q1.r
    public void d() {
    }
}
