/*
 * Decompiled with CFR 0.152.
 */
package ax.r1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.d0;
import ax.q1.I;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.j;
import ax.q1.o;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import ax.r1.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class b
implements r {
    public static final x s = new a();
    private static final int[] t = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] u = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
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
    private t l;
    private U m;
    private U n;
    private N o;
    private boolean p;
    private long q;
    private boolean r;

    public b() {
        this(0);
    }

    public b(int n8) {
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.b = n9;
        this.a = new byte[1];
        this.i = -1;
        o o8 = new o();
        this.c = o8;
        this.n = o8;
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new b()};
    }

    private void h() {
        ax.S0.a.i(this.m);
        d0.i(this.l);
    }

    private static int i(int n8, long l8) {
        return (int)((long)n8 * 8000000L / l8);
    }

    private N j(long l8, boolean bl) {
        int n8 = ax.r1.b.i(this.i, 20000L);
        return new j(l8, this.h, n8, this.i, bl);
    }

    private int l(int n8) throws E {
        if (!this.o(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal AMR ");
            String string = this.d ? "WB" : "NB";
            stringBuilder.append(string);
            stringBuilder.append(" frame type ");
            stringBuilder.append(n8);
            throw E.a(stringBuilder.toString(), null);
        }
        if (this.d) {
            return u[n8];
        }
        return t[n8];
    }

    private boolean m(int n8) {
        return !this.d && (n8 < 12 || n8 > 14);
    }

    private boolean n(long l8, long l9) {
        return Math.abs(l9 - l8) < 20000L;
    }

    private boolean o(int n8) {
        return n8 >= 0 && n8 <= 15 && (this.p(n8) || this.m(n8));
    }

    private boolean p(int n8) {
        return this.d && (n8 < 10 || n8 > 13);
    }

    private void q() {
        if (!this.r) {
            this.r = true;
            boolean bl = this.d;
            String string = "audio/amr-wb";
            String string2 = bl ? "audio/amr-wb" : "audio/amr";
            if (!bl) {
                string = "audio/3gpp";
            }
            int n8 = bl ? 16000 : 8000;
            int n9 = bl ? u[8] : t[7];
            this.m.e(new v.b().W(string2).y0(string).o0(n9).T(1).z0(n8).P());
        }
    }

    private void r(long l8, int n8) {
        boolean bl = false;
        if (this.o == null) {
            N n9;
            int n10;
            int n11 = this.b;
            if ((n11 & 4) != 0) {
                this.o = new I(new long[]{this.h}, new long[]{0L}, -9223372036854775807L);
            } else if ((n11 & 1) != 0 && ((n10 = this.i) == -1 || n10 == this.f)) {
                if (this.j >= 20 || n8 == -1) {
                    if ((n11 & 2) != 0) {
                        bl = true;
                    }
                    this.o = n9 = this.j(l8, bl);
                    this.m.d(n9.n());
                }
            } else {
                this.o = new N.b(-9223372036854775807L);
            }
            n9 = this.o;
            if (n9 != null) {
                this.l.h(n9);
            }
        }
    }

    private static boolean s(s s8, byte[] byArray) throws IOException {
        s8.m();
        byte[] byArray2 = new byte[byArray.length];
        s8.p(byArray2, 0, byArray.length);
        return Arrays.equals(byArray2, byArray);
    }

    private int t(s object) throws IOException {
        object.m();
        object.p(this.a, 0, 1);
        byte by = this.a[0];
        if ((by & 0x83) <= 0) {
            return this.l(by >> 3 & 0xF);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid padding bits for frame header ");
        ((StringBuilder)object).append(by);
        throw E.a(((StringBuilder)object).toString(), null);
    }

    private boolean u(s s8) throws IOException {
        byte[] byArray = v;
        if (ax.r1.b.s(s8, byArray)) {
            this.d = false;
            s8.n(byArray.length);
            return true;
        }
        byArray = w;
        if (ax.r1.b.s(s8, byArray)) {
            this.d = true;
            s8.n(byArray.length);
            return true;
        }
        return false;
    }

    private int v(s s8) throws IOException {
        int n8;
        if (this.g == 0) {
            N n9;
            block9: {
                try {
                    this.f = n8 = this.t(s8);
                    this.g = n8;
                    if (this.i == -1) {
                        this.h = s8.getPosition();
                        this.i = this.f;
                    }
                    if (this.i != this.f) break block9;
                    ++this.j;
                }
                catch (EOFException eOFException) {
                    return -1;
                }
            }
            if ((n9 = this.o) instanceof I) {
                n9 = (I)n9;
                long l8 = this.k + this.e + 20000L;
                long l9 = s8.getPosition();
                long l10 = this.f;
                if (!((I)n9).b(l8, 100000L)) {
                    ((I)n9).a(l8, l9 + l10);
                }
                if (this.p && this.n(l8, this.q)) {
                    this.p = false;
                    this.n = this.m;
                }
            }
        }
        if ((n8 = this.n.a(s8, this.g, true)) == -1) {
            return -1;
        }
        this.g = n8 = this.g - n8;
        if (n8 > 0) {
            return 0;
        }
        this.n.f(this.k + this.e, 1, this.f, 0, null);
        this.e += 20000L;
        return 0;
    }

    @Override
    public void a(t t8) {
        U u8;
        this.l = t8;
        this.m = u8 = t8.u(0, 1);
        this.n = u8;
        t8.o();
    }

    @Override
    public void b(long l8, long l9) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = l9;
        N n8 = this.o;
        if (n8 instanceof I) {
            this.k = l8 = ((I)n8).j(l8);
            if (!this.n(l8, this.q)) {
                this.p = true;
                this.n = this.c;
            }
            return;
        }
        if (l8 != 0L && n8 instanceof j) {
            this.k = ((j)n8).b(l8);
            return;
        }
        this.k = 0L;
    }

    @Override
    public boolean c(s s8) throws IOException {
        return this.u(s8);
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(s object, M m8) throws IOException {
        this.h();
        if (object.getPosition() == 0L && !this.u((s)object)) {
            throw E.a("Could not find AMR header.", null);
        }
        this.q();
        int n8 = this.v((s)object);
        this.r(object.getLength(), n8);
        if (n8 == -1 && (object = this.o) instanceof I) {
            long l8 = this.k + this.e;
            ((I)object).c(l8);
            this.l.h(this.o);
            this.m.d(l8);
        }
        return n8;
    }

    public /* synthetic */ List k() {
        return ax.q1.q.a(this);
    }
}

