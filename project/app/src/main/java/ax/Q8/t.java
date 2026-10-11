/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.g;
import ax.Q8.m;
import ax.Q8.o;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import ax.h9.c;
import java.util.Arrays;

public class t
implements c {
    public static final byte[] p = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] q = new byte[]{-2, 83, 77, 66};
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

    private void A(b b8) {
        if (this.a.j()) {
            b8.o(new byte[]{0, 0});
            b8.W(2);
            return;
        }
        b8.Y();
    }

    private void B(b b8) {
        int n8 = ax.Q8.t$a.a[this.a.ordinal()];
        if (n8 != 1 && n8 != 2) {
            b8.s(this.b);
            return;
        }
        b8.W(2);
    }

    private void C(b b8) {
        b8.s(this.c + this.b);
    }

    public static boolean p(byte[] byArray) {
        return Arrays.equals(q, byArray);
    }

    public void D(b b8) {
        this.n = b8.V();
        b8.o(q);
        b8.s(64);
        this.B(b8);
        this.A(b8);
        b8.s(this.e.h());
        this.C(b8);
        b8.u(this.k);
        b8.u(this.l);
        b8.k(this.f);
        if (c.a.c(this.k, ax.Q8.o.d0)) {
            b8.k(this.g);
        } else {
            b8.Y();
            b8.u(this.i);
        }
        b8.k(this.h);
        b8.o(p);
    }

    @Override
    public int a() {
        return this.n;
    }

    @Override
    public void b(ax.Z8.a<?> a8) throws a.b {
        this.n = a8.S();
        ax.k9.a.b(a8.G(4), q, "Could not find SMB2 Packet header");
        a8.U(2);
        a8.J();
        this.j = a8.N();
        this.e = ax.Q8.m.j(a8.J());
        this.d = a8.J();
        this.k = a8.N();
        this.l = a8.P();
        this.f = a8.A();
        if (c.a.c(this.k, ax.Q8.o.d0)) {
            this.g = a8.A();
        } else {
            a8.U(4);
            this.i = a8.N();
        }
        this.h = a8.A();
        this.m = a8.G(16);
        int n8 = this.l;
        if ((long)n8 != 0L) {
            this.o = this.n + n8;
            return;
        }
        this.o = a8.V();
    }

    @Override
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

    public boolean o(o o8) {
        return c.a.c(this.k, o8);
    }

    public void q(long l8) {
        this.g = l8;
    }

    public void r(int n8) {
        this.b = n8;
    }

    public void s(int n8) {
        this.c = n8;
    }

    public void t(g g8) {
        this.a = g8;
    }

    public String toString() {
        return String.format("dialect=%s, creditCharge=%s, creditRequest=%s, creditResponse=%s, message=%s, messageId=%s, asyncId=%s, sessionId=%s, treeId=%s, status=0x%08x, flags=%s, nextCommandOffset=%s", new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    public void u(o o8) {
        this.k |= o8.getValue();
    }

    public void v(int n8) {
        this.o = n8;
    }

    public void w(long l8) {
        this.f = l8;
    }

    public void x(m m8) {
        this.e = m8;
    }

    public void y(long l8) {
        this.h = l8;
    }

    public void z(long l8) {
        this.i = l8;
    }
}

