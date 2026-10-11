/*
 * Decompiled with CFR 0.152.
 */
package ax.U4;

import ax.T4.a;
import ax.T4.j;
import ax.T4.k;
import ax.T4.m;
import ax.T4.q;
import ax.T4.r;
import ax.T4.s;
import ax.U4.c;
import ax.W4.d;
import ax.W4.e;
import ax.W4.i;
import ax.b5.h;
import ax.b5.l;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public abstract class b
extends c {
    protected static final h<q> S0 = j.c0;
    protected m A0;
    protected final l B0;
    protected char[] C0;
    protected boolean D0;
    protected ax.b5.c E0;
    protected byte[] F0;
    protected int G0 = 0;
    protected int H0;
    protected long I0;
    protected float J0;
    protected double K0;
    protected BigInteger L0;
    protected BigDecimal M0;
    protected String N0;
    protected boolean O0;
    protected int P0;
    protected int Q0;
    protected int R0;
    protected final e o0;
    protected final r p0;
    protected boolean q0;
    protected int r0;
    protected int s0;
    protected long t0;
    protected int u0 = 1;
    protected int v0;
    protected long w0;
    protected int x0 = 1;
    protected int y0;
    protected ax.Z4.d z0;

    protected b(e object, int n8) {
        super(n8);
        r r8;
        this.o0 = object;
        r r9 = r8 = ((e)object).s();
        if (r8 == null) {
            r9 = r.a();
        }
        this.p0 = r9;
        this.B0 = ((e)object).i();
        object = j.a.r0.j(n8) ? ax.Z4.b.f(this) : null;
        this.z0 = ax.Z4.d.m((ax.Z4.b)object);
    }

    private void A1(int n8) throws IOException {
        if (n8 == 16) {
            this.M0 = null;
            this.N0 = this.B0.h();
            this.G0 = 16;
            return;
        }
        if (n8 == 32) {
            this.J0 = 0.0f;
            this.N0 = this.B0.h();
            this.G0 = 32;
            return;
        }
        this.K0 = 0.0;
        this.N0 = this.B0.h();
        this.G0 = 8;
    }

    private void B1(int n8) throws IOException {
        String string = this.B0.h();
        if (n8 == 1 || n8 == 2) {
            this.E1(n8, string);
        }
        if (n8 != 8 && n8 != 32) {
            this.L0 = null;
            this.N0 = string;
            this.G0 = 4;
            return;
        }
        this.N0 = string;
        this.G0 = 8;
    }

    protected static int[] P1(int[] nArray, int n8) {
        if (nArray == null) {
            return new int[n8];
        }
        return Arrays.copyOf(nArray, nArray.length + n8);
    }

    protected void C1() throws IOException {
        this.B0.q();
        char[] cArray = this.C0;
        if (cArray != null) {
            this.C0 = null;
            this.o0.n(cArray);
        }
    }

    protected void D1(int n8, char c8) throws ax.T4.i {
        ax.Z4.d d8 = this.O1();
        this.C0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char)n8), Character.valueOf(c8), d8.h(), d8.r(this.m1())));
    }

    protected void E1(int n8, String string) throws IOException {
        if (n8 == 1) {
            this.g1(string);
            return;
        }
        this.j1(string);
    }

    protected void F1(int n8, String string) throws ax.T4.i {
        if (this.A(j.a.i0) && n8 <= 32) {
            return;
        }
        n8 = (char)n8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal unquoted character (");
        stringBuilder.append(c.o0(n8));
        stringBuilder.append("): has to be escaped using backslash to be included in ");
        stringBuilder.append(string);
        this.C0(stringBuilder.toString());
    }

    protected String G1() throws IOException {
        return this.H1();
    }

    protected String H1() throws IOException {
        if (this.A(j.a.o0)) {
            return "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')";
        }
        return "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected void I1() throws IOException {
        int n8 = this.G0;
        if ((n8 & 0x10) != 0) {
            this.K0 = this.N0 != null ? this.u1() : this.r1().doubleValue();
        } else if ((n8 & 4) != 0) {
            this.K0 = this.N0 != null ? this.u1() : this.s1().doubleValue();
        } else if ((n8 & 2) != 0) {
            this.K0 = this.I0;
        } else if ((n8 & 1) != 0) {
            this.K0 = this.H0;
        } else if ((n8 & 0x20) != 0) {
            this.K0 = this.N0 != null ? this.u1() : (double)this.v1();
        } else {
            this.b1();
        }
        this.G0 |= 8;
    }

    protected void J1() throws IOException {
        int n8 = this.G0;
        if ((n8 & 0x10) != 0) {
            this.J0 = this.N0 != null ? this.v1() : this.r1().floatValue();
        } else if ((n8 & 4) != 0) {
            this.J0 = this.N0 != null ? this.v1() : this.s1().floatValue();
        } else if ((n8 & 2) != 0) {
            this.J0 = this.I0;
        } else if ((n8 & 1) != 0) {
            this.J0 = this.H0;
        } else if ((n8 & 8) != 0) {
            this.J0 = this.N0 != null ? this.v1() : (float)this.u1();
        } else {
            this.b1();
        }
        this.G0 |= 0x20;
    }

    protected void K1() throws IOException {
        int n8 = this.G0;
        if ((n8 & 2) != 0) {
            long l8 = this.I0;
            n8 = (int)l8;
            if ((long)n8 != l8) {
                this.h1(this.u(), this.b());
            }
            this.H0 = n8;
        } else if ((n8 & 4) != 0) {
            BigInteger bigInteger = this.s1();
            if (c.g0.compareTo(bigInteger) > 0 || c.h0.compareTo(bigInteger) < 0) {
                this.f1();
            }
            this.H0 = bigInteger.intValue();
        } else if ((n8 & 8) != 0) {
            double d8 = this.u1();
            if (d8 < -2.147483648E9 || d8 > 2.147483647E9) {
                this.f1();
            }
            this.H0 = (int)d8;
        } else if ((n8 & 0x10) != 0) {
            BigDecimal bigDecimal = this.r1();
            if (c.m0.compareTo(bigDecimal) > 0 || c.n0.compareTo(bigDecimal) < 0) {
                this.f1();
            }
            this.H0 = bigDecimal.intValue();
        } else {
            this.b1();
        }
        this.G0 |= 1;
    }

    protected void L1() throws IOException {
        int n8 = this.G0;
        if ((n8 & 1) != 0) {
            this.I0 = this.H0;
        } else if ((n8 & 4) != 0) {
            BigInteger bigInteger = this.s1();
            if (c.i0.compareTo(bigInteger) > 0 || c.j0.compareTo(bigInteger) < 0) {
                this.i1();
            }
            this.I0 = bigInteger.longValue();
        } else if ((n8 & 8) != 0) {
            double d8 = this.u1();
            if (d8 < -9.223372036854776E18 || d8 > 9.223372036854776E18) {
                this.i1();
            }
            this.I0 = (long)d8;
        } else if ((n8 & 0x10) != 0) {
            BigDecimal bigDecimal = this.r1();
            if (c.k0.compareTo(bigDecimal) > 0 || c.l0.compareTo(bigDecimal) < 0) {
                this.i1();
            }
            this.I0 = bigDecimal.longValue();
        } else {
            this.b1();
        }
        this.G0 |= 2;
    }

    protected void M1(int n8, int n9) throws IOException {
        ax.Z4.d d8;
        this.z0 = d8 = this.z0.k(n8, n9);
        this.p0.d(d8.d());
    }

    protected void N1(int n8, int n9) throws IOException {
        ax.Z4.d d8;
        this.z0 = d8 = this.z0.l(n8, n9);
        this.p0.d(d8.d());
    }

    public ax.Z4.d O1() {
        return this.z0;
    }

    protected IllegalArgumentException Q1(a a8, int n8, int n9) throws IllegalArgumentException {
        return this.R1(a8, n8, n9, null);
    }

    protected IllegalArgumentException R1(a object, int n8, int n9, String string) throws IllegalArgumentException {
        Object object2;
        if (n8 <= 32) {
            object = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(n8), n9 + 1);
        } else if (((a)object).n(n8)) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Unexpected padding character ('");
            ((StringBuilder)object2).append(((a)object).i());
            ((StringBuilder)object2).append("') as character #");
            ((StringBuilder)object2).append(n9 + 1);
            ((StringBuilder)object2).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            object = ((StringBuilder)object2).toString();
        } else if (Character.isDefined(n8) && !Character.isISOControl(n8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Illegal character '");
            ((StringBuilder)object).append((char)n8);
            ((StringBuilder)object).append("' (code 0x");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            ((StringBuilder)object).append(") in base64 content");
            object = ((StringBuilder)object).toString();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("Illegal character (code 0x");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            ((StringBuilder)object).append(") in base64 content");
            object = ((StringBuilder)object).toString();
        }
        object2 = object;
        if (string != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(string);
            object2 = ((StringBuilder)object2).toString();
        }
        return new IllegalArgumentException((String)object2);
    }

    protected final m S1(String string, double d8) throws IOException {
        this.B0.t(string);
        this.K0 = d8;
        this.G0 = 8;
        return m.t0;
    }

    protected final m T1(boolean bl, int n8, int n9, int n10) throws IOException {
        this.p0.b(n8 + n9 + n10);
        this.O0 = bl;
        this.P0 = n8;
        this.Q0 = n9;
        this.R0 = n10;
        this.G0 = 0;
        return m.t0;
    }

    protected final m U1(boolean bl, int n8) throws IOException {
        this.p0.c(n8);
        this.O0 = bl;
        this.P0 = n8;
        this.Q0 = 0;
        this.R0 = 0;
        this.G0 = 0;
        return m.s0;
    }

    @Override
    public void close() throws IOException {
        if (!this.q0) {
            this.r0 = Math.max(this.r0, this.s0);
            this.q0 = true;
            try {
                this.l1();
                return;
            }
            finally {
                this.C1();
            }
        }
    }

    @Override
    public String g() throws IOException {
        Object object = this.d0;
        if ((object == m.l0 || object == m.n0) && (object = this.z0.o()) != null) {
            return ((ax.Z4.d)object).b();
        }
        return this.z0.b();
    }

    protected abstract void l1() throws IOException;

    @Override
    public double m() throws IOException {
        int n8 = this.G0;
        if ((n8 & 8) == 0) {
            if (n8 == 0) {
                this.z1(8);
            }
            if ((this.G0 & 8) == 0) {
                this.I1();
            }
        }
        return this.u1();
    }

    protected d m1() {
        if (j.a.t0.j(this.q)) {
            return this.o0.j();
        }
        return d.o();
    }

    protected final int n1(a a8, char c8, int n8) throws IOException {
        if (c8 == '\\') {
            char c9 = this.p1();
            if (c9 <= ' ' && n8 == 0) {
                return -1;
            }
            c8 = (char)a8.f(c9);
            if (c8 < '\u0000' && (c8 != '\ufffffffe' || n8 < 2)) {
                throw this.Q1(a8, c9, n8);
            }
            return c8;
        }
        throw this.Q1(a8, c8, n8);
    }

    @Override
    public float o() throws IOException {
        int n8 = this.G0;
        if ((n8 & 0x20) == 0) {
            if (n8 == 0) {
                this.z1(32);
            }
            if ((this.G0 & 0x20) == 0) {
                this.J1();
            }
        }
        return this.v1();
    }

    protected final int o1(a a8, int n8, int n9) throws IOException {
        if (n8 == 92) {
            n8 = this.p1();
            if (n8 <= 32 && n9 == 0) {
                return -1;
            }
            int n10 = a8.g(n8);
            if (n10 < 0 && n10 != -2) {
                throw this.Q1(a8, n8, n9);
            }
            return n10;
        }
        throw this.Q1(a8, n8, n9);
    }

    @Override
    public int p() throws IOException {
        int n8 = this.G0;
        if ((n8 & 1) == 0) {
            if (n8 == 0) {
                return this.y1();
            }
            if ((n8 & 1) == 0) {
                this.K1();
            }
        }
        return this.H0;
    }

    protected abstract char p1() throws IOException;

    @Override
    public long q() throws IOException {
        int n8 = this.G0;
        if ((n8 & 2) == 0) {
            if (n8 == 0) {
                this.z1(2);
            }
            if ((this.G0 & 2) == 0) {
                this.L1();
            }
        }
        return this.I0;
    }

    protected final int q1() throws ax.T4.i {
        this.s0();
        return -1;
    }

    protected BigDecimal r1() throws ax.T4.i {
        Object object = this.M0;
        if (object != null) {
            return object;
        }
        object = this.N0;
        if (object != null) {
            try {
                this.M0 = i.b((String)object, this.F(s.j0));
            }
            catch (NumberFormatException numberFormatException) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Malformed numeric value (");
                ((StringBuilder)object).append(this.A0(this.N0));
                ((StringBuilder)object).append(")");
                this.d1(((StringBuilder)object).toString(), numberFormatException);
            }
            this.N0 = null;
            return this.M0;
        }
        throw new IllegalStateException("cannot get BigDecimal from current parser state");
    }

    @Override
    protected void s0() throws ax.T4.i {
        if (!this.z0.g()) {
            String string = this.z0.e() ? "Array" : "Object";
            this.M0(String.format(": expected close marker for %s (start marker at %s)", string, this.z0.r(this.m1())), null);
        }
    }

    protected BigInteger s1() throws ax.T4.i {
        Object object = this.L0;
        if (object != null) {
            return object;
        }
        object = this.N0;
        if (object != null) {
            try {
                this.L0 = i.d((String)object, this.F(s.j0));
            }
            catch (NumberFormatException numberFormatException) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Malformed numeric value (");
                ((StringBuilder)object).append(this.A0(this.N0));
                ((StringBuilder)object).append(")");
                this.d1(((StringBuilder)object).toString(), numberFormatException);
            }
            this.N0 = null;
            return this.L0;
        }
        throw new IllegalStateException("cannot get BigInteger from current parser state");
    }

    public ax.b5.c t1() {
        ax.b5.c c8 = this.E0;
        if (c8 == null) {
            this.E0 = new ax.b5.c();
        } else {
            c8.j();
        }
        return this.E0;
    }

    protected double u1() throws ax.T4.i {
        CharSequence charSequence = this.N0;
        if (charSequence != null) {
            try {
                this.K0 = i.e((String)charSequence, this.F(s.i0));
            }
            catch (NumberFormatException numberFormatException) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Malformed numeric value (");
                ((StringBuilder)charSequence).append(this.A0(this.N0));
                ((StringBuilder)charSequence).append(")");
                this.d1(((StringBuilder)charSequence).toString(), numberFormatException);
            }
            this.N0 = null;
        }
        return this.K0;
    }

    protected float v1() throws ax.T4.i {
        CharSequence charSequence = this.N0;
        if (charSequence != null) {
            try {
                this.J0 = i.f((String)charSequence, this.F(s.i0));
            }
            catch (NumberFormatException numberFormatException) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Malformed numeric value (");
                ((StringBuilder)charSequence).append(this.A0(this.N0));
                ((StringBuilder)charSequence).append(")");
                this.d1(((StringBuilder)charSequence).toString(), numberFormatException);
            }
            this.N0 = null;
        }
        return this.J0;
    }

    protected void w1(a a8) throws IOException {
        this.C0(a8.j());
    }

    protected char x1(char c8) throws k {
        if (this.A(j.a.j0) || c8 == '\'' && this.A(j.a.h0)) {
            return c8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unrecognized character escape ");
        stringBuilder.append(c.o0(c8));
        this.C0(stringBuilder.toString());
        return c8;
    }

    protected int y1() throws IOException {
        if (this.q0) {
            this.C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.d0 == m.s0 && this.P0 <= 9) {
            int n8;
            this.H0 = n8 = this.B0.f(this.O0);
            this.G0 = 1;
            return n8;
        }
        this.z1(1);
        if ((this.G0 & 1) == 0) {
            this.K1();
        }
        return this.H0;
    }

    protected void z1(int n8) throws IOException {
        Object object;
        if (this.q0) {
            this.C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        if ((object = this.d0) == m.s0) {
            int n9 = this.P0;
            if (n9 <= 9) {
                this.H0 = this.B0.f(this.O0);
                this.G0 = 1;
                return;
            }
            if (n9 <= 18) {
                long l8 = this.B0.g(this.O0);
                if (n9 == 10) {
                    if (this.O0) {
                        if (l8 >= Integer.MIN_VALUE) {
                            this.H0 = (int)l8;
                            this.G0 = 1;
                            return;
                        }
                    } else if (l8 <= Integer.MAX_VALUE) {
                        this.H0 = (int)l8;
                        this.G0 = 1;
                        return;
                    }
                }
                this.I0 = l8;
                this.G0 = 2;
                return;
            }
            if (n9 == 19) {
                object = this.B0.o();
                int n10 = this.B0.p();
                boolean bl = this.O0;
                int n11 = n10;
                if (bl) {
                    n11 = n10 + 1;
                }
                if (i.a((char[])object, n11, n9, bl)) {
                    this.I0 = i.i((char[])object, n11, this.O0);
                    this.G0 = 2;
                    return;
                }
            }
            this.B1(n8);
            return;
        }
        if (object == m.t0) {
            this.A1(n8);
            return;
        }
        this.D0("Current token (%s) not numeric, can not use numeric value accessors", object);
    }
}

