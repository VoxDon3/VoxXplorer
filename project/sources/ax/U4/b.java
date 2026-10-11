package ax.U4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.k;
import ax.T4.m;
import ax.T4.q;
import ax.T4.r;
import ax.T4.s;
import ax.W4.e;
import ax.Z4.d;
import ax.b5.h;
import ax.b5.l;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b extends c {
    protected static final h<q> S0 = j.c0;
    protected m A0;
    protected final l B0;
    protected char[] C0;
    protected boolean D0;
    protected ax.b5.c E0;
    protected byte[] F0;
    protected int G0;
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
    protected int u0;
    protected int v0;
    protected long w0;
    protected int x0;
    protected int y0;
    protected d z0;

    protected b(e eVar, int i) {
        super(i);
        this.u0 = 1;
        this.x0 = 1;
        this.G0 = 0;
        this.o0 = eVar;
        r s = eVar.s();
        this.p0 = s == null ? r.a() : s;
        this.B0 = eVar.i();
        this.z0 = d.m(j.a.STRICT_DUPLICATE_DETECTION.j(i) ? ax.Z4.b.f(this) : null);
    }

    private void A1(int i) throws IOException {
        if (i == 16) {
            this.M0 = null;
            this.N0 = this.B0.h();
            this.G0 = 16;
        } else if (i == 32) {
            this.J0 = 0.0f;
            this.N0 = this.B0.h();
            this.G0 = 32;
        } else {
            this.K0 = 0.0d;
            this.N0 = this.B0.h();
            this.G0 = 8;
        }
    }

    private void B1(int i) throws IOException {
        String h = this.B0.h();
        if (i == 1 || i == 2) {
            E1(i, h);
        }
        if (i == 8 || i == 32) {
            this.N0 = h;
            this.G0 = 8;
        } else {
            this.L0 = null;
            this.N0 = h;
            this.G0 = 4;
        }
    }

    protected static int[] P1(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    protected void C1() throws IOException {
        this.B0.q();
        char[] cArr = this.C0;
        if (cArr != null) {
            this.C0 = null;
            this.o0.n(cArr);
        }
    }

    protected void D1(int i, char c) throws i {
        d O1 = O1();
        C0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), O1.h(), O1.r(m1())));
    }

    protected void E1(int i, String str) throws IOException {
        if (i == 1) {
            g1(str);
        } else {
            j1(str);
        }
    }

    protected void F1(int i, String str) throws i {
        if (!A(j.a.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            C0("Illegal unquoted character (" + c.o0((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    protected String G1() throws IOException {
        return H1();
    }

    protected String H1() throws IOException {
        return A(j.a.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    protected void I1() throws IOException {
        int i = this.G0;
        if ((i & 16) != 0) {
            if (this.N0 != null) {
                this.K0 = u1();
            } else {
                this.K0 = r1().doubleValue();
            }
        } else if ((i & 4) != 0) {
            if (this.N0 != null) {
                this.K0 = u1();
            } else {
                this.K0 = s1().doubleValue();
            }
        } else if ((i & 2) != 0) {
            this.K0 = this.I0;
        } else if ((i & 1) != 0) {
            this.K0 = this.H0;
        } else if ((i & 32) == 0) {
            b1();
        } else if (this.N0 != null) {
            this.K0 = u1();
        } else {
            this.K0 = v1();
        }
        this.G0 |= 8;
    }

    protected void J1() throws IOException {
        int i = this.G0;
        if ((i & 16) != 0) {
            if (this.N0 != null) {
                this.J0 = v1();
            } else {
                this.J0 = r1().floatValue();
            }
        } else if ((i & 4) != 0) {
            if (this.N0 != null) {
                this.J0 = v1();
            } else {
                this.J0 = s1().floatValue();
            }
        } else if ((i & 2) != 0) {
            this.J0 = this.I0;
        } else if ((i & 1) != 0) {
            this.J0 = this.H0;
        } else if ((i & 8) == 0) {
            b1();
        } else if (this.N0 != null) {
            this.J0 = v1();
        } else {
            this.J0 = (float) u1();
        }
        this.G0 |= 32;
    }

    protected void K1() throws IOException {
        int i = this.G0;
        if ((i & 2) != 0) {
            long j = this.I0;
            int i2 = (int) j;
            if (i2 != j) {
                h1(u(), b());
            }
            this.H0 = i2;
        } else if ((i & 4) != 0) {
            BigInteger s1 = s1();
            if (c.g0.compareTo(s1) > 0 || c.h0.compareTo(s1) < 0) {
                f1();
            }
            this.H0 = s1.intValue();
        } else if ((i & 8) != 0) {
            double u1 = u1();
            if (u1 < -2.147483648E9d || u1 > 2.147483647E9d) {
                f1();
            }
            this.H0 = (int) u1;
        } else if ((i & 16) != 0) {
            BigDecimal r1 = r1();
            if (c.m0.compareTo(r1) > 0 || c.n0.compareTo(r1) < 0) {
                f1();
            }
            this.H0 = r1.intValue();
        } else {
            b1();
        }
        this.G0 |= 1;
    }

    protected void L1() throws IOException {
        int i = this.G0;
        if ((i & 1) != 0) {
            this.I0 = this.H0;
        } else if ((i & 4) != 0) {
            BigInteger s1 = s1();
            if (c.i0.compareTo(s1) > 0 || c.j0.compareTo(s1) < 0) {
                i1();
            }
            this.I0 = s1.longValue();
        } else if ((i & 8) != 0) {
            double u1 = u1();
            if (u1 < -9.223372036854776E18d || u1 > 9.223372036854776E18d) {
                i1();
            }
            this.I0 = (long) u1;
        } else if ((i & 16) != 0) {
            BigDecimal r1 = r1();
            if (c.k0.compareTo(r1) > 0 || c.l0.compareTo(r1) < 0) {
                i1();
            }
            this.I0 = r1.longValue();
        } else {
            b1();
        }
        this.G0 |= 2;
    }

    protected void M1(int i, int i2) throws IOException {
        d k = this.z0.k(i, i2);
        this.z0 = k;
        this.p0.d(k.d());
    }

    protected void N1(int i, int i2) throws IOException {
        d l = this.z0.l(i, i2);
        this.z0 = l;
        this.p0.d(l.d());
    }

    public d O1() {
        return this.z0;
    }

    protected IllegalArgumentException Q1(ax.T4.a aVar, int i, int i2) throws IllegalArgumentException {
        return R1(aVar, i, i2, null);
    }

    protected IllegalArgumentException R1(ax.T4.a aVar, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (aVar.n(i)) {
            str2 = "Unexpected padding character ('" + aVar.i() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    protected final m S1(String str, double d) throws IOException {
        this.B0.t(str);
        this.K0 = d;
        this.G0 = 8;
        return m.VALUE_NUMBER_FLOAT;
    }

    protected final m T1(boolean z, int i, int i2, int i3) throws IOException {
        this.p0.b(i + i2 + i3);
        this.O0 = z;
        this.P0 = i;
        this.Q0 = i2;
        this.R0 = i3;
        this.G0 = 0;
        return m.VALUE_NUMBER_FLOAT;
    }

    protected final m U1(boolean z, int i) throws IOException {
        this.p0.c(i);
        this.O0 = z;
        this.P0 = i;
        this.Q0 = 0;
        this.R0 = 0;
        this.G0 = 0;
        return m.VALUE_NUMBER_INT;
    }

    @Override // ax.T4.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q0) {
            return;
        }
        this.r0 = Math.max(this.r0, this.s0);
        this.q0 = true;
        try {
            l1();
        } finally {
            C1();
        }
    }

    @Override // ax.T4.j
    public String g() throws IOException {
        d o;
        m mVar = this.d0;
        return ((mVar == m.START_OBJECT || mVar == m.START_ARRAY) && (o = this.z0.o()) != null) ? o.b() : this.z0.b();
    }

    protected abstract void l1() throws IOException;

    @Override // ax.T4.j
    public double m() throws IOException {
        int i = this.G0;
        if ((i & 8) == 0) {
            if (i == 0) {
                z1(8);
            }
            if ((this.G0 & 8) == 0) {
                I1();
            }
        }
        return u1();
    }

    protected ax.W4.d m1() {
        return j.a.INCLUDE_SOURCE_IN_LOCATION.j(this.q) ? this.o0.j() : ax.W4.d.o();
    }

    protected final int n1(ax.T4.a aVar, char c, int i) throws IOException {
        if (c != '\\') {
            throw Q1(aVar, c, i);
        }
        char p1 = p1();
        if (p1 <= ' ' && i == 0) {
            return -1;
        }
        int f = aVar.f(p1);
        if (f >= 0 || (f == -2 && i >= 2)) {
            return f;
        }
        throw Q1(aVar, p1, i);
    }

    @Override // ax.T4.j
    public float o() throws IOException {
        int i = this.G0;
        if ((i & 32) == 0) {
            if (i == 0) {
                z1(32);
            }
            if ((this.G0 & 32) == 0) {
                J1();
            }
        }
        return v1();
    }

    protected final int o1(ax.T4.a aVar, int i, int i2) throws IOException {
        if (i != 92) {
            throw Q1(aVar, i, i2);
        }
        char p1 = p1();
        if (p1 <= ' ' && i2 == 0) {
            return -1;
        }
        int g = aVar.g(p1);
        if (g >= 0 || g == -2) {
            return g;
        }
        throw Q1(aVar, p1, i2);
    }

    @Override // ax.T4.j
    public int p() throws IOException {
        int i = this.G0;
        if ((i & 1) == 0) {
            if (i == 0) {
                return y1();
            }
            if ((i & 1) == 0) {
                K1();
            }
        }
        return this.H0;
    }

    protected abstract char p1() throws IOException;

    @Override // ax.T4.j
    public long q() throws IOException {
        int i = this.G0;
        if ((i & 2) == 0) {
            if (i == 0) {
                z1(2);
            }
            if ((this.G0 & 2) == 0) {
                L1();
            }
        }
        return this.I0;
    }

    protected final int q1() throws i {
        s0();
        return -1;
    }

    protected BigDecimal r1() throws i {
        BigDecimal bigDecimal = this.M0;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.N0;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            this.M0 = ax.W4.i.b(str, F(s.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e) {
            d1("Malformed numeric value (" + A0(this.N0) + ")", e);
        }
        this.N0 = null;
        return this.M0;
    }

    @Override // ax.U4.c
    protected void s0() throws i {
        if (this.z0.g()) {
            return;
        }
        M0(String.format(": expected close marker for %s (start marker at %s)", this.z0.e() ? "Array" : "Object", this.z0.r(m1())), null);
    }

    protected BigInteger s1() throws i {
        BigInteger bigInteger = this.L0;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.N0;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            this.L0 = ax.W4.i.d(str, F(s.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e) {
            d1("Malformed numeric value (" + A0(this.N0) + ")", e);
        }
        this.N0 = null;
        return this.L0;
    }

    public ax.b5.c t1() {
        ax.b5.c cVar = this.E0;
        if (cVar == null) {
            this.E0 = new ax.b5.c();
        } else {
            cVar.j();
        }
        return this.E0;
    }

    protected double u1() throws i {
        String str = this.N0;
        if (str != null) {
            try {
                this.K0 = ax.W4.i.e(str, F(s.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e) {
                d1("Malformed numeric value (" + A0(this.N0) + ")", e);
            }
            this.N0 = null;
        }
        return this.K0;
    }

    protected float v1() throws i {
        String str = this.N0;
        if (str != null) {
            try {
                this.J0 = ax.W4.i.f(str, F(s.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e) {
                d1("Malformed numeric value (" + A0(this.N0) + ")", e);
            }
            this.N0 = null;
        }
        return this.J0;
    }

    protected void w1(ax.T4.a aVar) throws IOException {
        C0(aVar.j());
    }

    protected char x1(char c) throws k {
        if (A(j.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || (c == '\'' && A(j.a.ALLOW_SINGLE_QUOTES))) {
            return c;
        }
        C0("Unrecognized character escape " + c.o0(c));
        return c;
    }

    protected int y1() throws IOException {
        if (this.q0) {
            C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.d0 != m.VALUE_NUMBER_INT || this.P0 > 9) {
            z1(1);
            if ((this.G0 & 1) == 0) {
                K1();
            }
            return this.H0;
        }
        int f = this.B0.f(this.O0);
        this.H0 = f;
        this.G0 = 1;
        return f;
    }

    protected void z1(int i) throws IOException {
        if (this.q0) {
            C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        m mVar = this.d0;
        if (mVar != m.VALUE_NUMBER_INT) {
            if (mVar == m.VALUE_NUMBER_FLOAT) {
                A1(i);
                return;
            } else {
                D0("Current token (%s) not numeric, can not use numeric value accessors", mVar);
                return;
            }
        }
        int i2 = this.P0;
        if (i2 <= 9) {
            this.H0 = this.B0.f(this.O0);
            this.G0 = 1;
            return;
        }
        if (i2 > 18) {
            if (i2 == 19) {
                char[] o = this.B0.o();
                int p = this.B0.p();
                boolean z = this.O0;
                if (z) {
                    p++;
                }
                if (ax.W4.i.a(o, p, i2, z)) {
                    this.I0 = ax.W4.i.i(o, p, this.O0);
                    this.G0 = 2;
                    return;
                }
            }
            B1(i);
            return;
        }
        long g = this.B0.g(this.O0);
        if (i2 == 10) {
            if (this.O0) {
                if (g >= -2147483648L) {
                    this.H0 = (int) g;
                    this.G0 = 1;
                    return;
                }
            } else if (g <= 2147483647L) {
                this.H0 = (int) g;
                this.G0 = 1;
                return;
            }
        }
        this.I0 = g;
        this.G0 = 2;
    }
}
