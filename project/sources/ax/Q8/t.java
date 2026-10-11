package ax.Q8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import ax.h9.InterfaceC2172c;
import ax.k9.C2413a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class t implements InterfaceC2172c {
    public static final byte[] p = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] q = {-2, 83, 77, 66};
    private g a;
    private int b = 1;
    private int c;
    private int d;
    private m e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private int l;
    private byte[] m;
    private int n;
    private int o;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.SMB_2_0_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void A(C2171b c2171b) {
        if (!this.a.j()) {
            c2171b.Y();
        } else {
            c2171b.o(new byte[]{0, 0});
            c2171b.W(2);
        }
    }

    private void B(C2171b c2171b) {
        int i = a.a[this.a.ordinal()];
        if (i == 1 || i == 2) {
            c2171b.W(2);
        } else {
            c2171b.s(this.b);
        }
    }

    private void C(C2171b c2171b) {
        c2171b.s(this.c + this.b);
    }

    public static boolean p(byte[] bArr) {
        return Arrays.equals(q, bArr);
    }

    public void D(C2171b c2171b) {
        this.n = c2171b.V();
        c2171b.o(q);
        c2171b.s(64);
        B(c2171b);
        A(c2171b);
        c2171b.s(this.e.h());
        C(c2171b);
        c2171b.u(this.k);
        c2171b.u(this.l);
        c2171b.k(this.f);
        if (c.a.c(this.k, o.SMB2_FLAGS_ASYNC_COMMAND)) {
            c2171b.k(this.g);
        } else {
            c2171b.Y();
            c2171b.u(this.i);
        }
        c2171b.k(this.h);
        c2171b.o(p);
    }

    @Override // ax.h9.InterfaceC2172c
    public int a() {
        return this.n;
    }

    @Override // ax.h9.InterfaceC2172c
    public void b(ax.Z8.a<?> aVar) throws a.b {
        this.n = aVar.S();
        C2413a.b(aVar.G(4), q, "Could not find SMB2 Packet header");
        aVar.U(2);
        aVar.J();
        this.j = aVar.N();
        this.e = m.j(aVar.J());
        this.d = aVar.J();
        this.k = aVar.N();
        this.l = aVar.P();
        this.f = aVar.A();
        if (c.a.c(this.k, o.SMB2_FLAGS_ASYNC_COMMAND)) {
            this.g = aVar.A();
        } else {
            aVar.U(4);
            this.i = aVar.N();
        }
        this.h = aVar.A();
        this.m = aVar.G(16);
        int i = this.l;
        if (i != 0) {
            this.o = this.n + i;
        } else {
            this.o = aVar.V();
        }
    }

    @Override // ax.h9.InterfaceC2172c
    public int c() {
        return this.o;
    }

    public long d() {
        return this.g;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.d;
    }

    public long g() {
        return this.k;
    }

    public m h() {
        return this.e;
    }

    public long i() {
        return this.f;
    }

    public int j() {
        return this.l;
    }

    public long k() {
        return this.h;
    }

    public byte[] l() {
        return this.m;
    }

    public long m() {
        return this.j;
    }

    public long n() {
        return this.i;
    }

    public boolean o(o oVar) {
        return c.a.c(this.k, oVar);
    }

    public void q(long j) {
        this.g = j;
    }

    public void r(int i) {
        this.b = i;
    }

    public void s(int i) {
        this.c = i;
    }

    public void t(g gVar) {
        this.a = gVar;
    }

    public String toString() {
        return String.format("dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s", this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l));
    }

    public void u(o oVar) {
        this.k |= oVar.getValue();
    }

    public void v(int i) {
        this.o = i;
    }

    public void w(long j) {
        this.f = j;
    }

    public void x(m mVar) {
        this.e = mVar;
    }

    public void y(long j) {
        this.h = j;
    }

    public void z(long j) {
        this.i = j;
    }
}
