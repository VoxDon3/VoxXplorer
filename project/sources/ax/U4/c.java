package ax.U4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.W4.f;
import ax.b5.n;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class c extends j {
    protected static final byte[] e0 = new byte[0];
    protected static final int[] f0 = new int[0];
    protected static final BigInteger g0;
    protected static final BigInteger h0;
    protected static final BigInteger i0;
    protected static final BigInteger j0;
    protected static final BigDecimal k0;
    protected static final BigDecimal l0;
    protected static final BigDecimal m0;
    protected static final BigDecimal n0;
    protected m d0;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        g0 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        h0 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        i0 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        j0 = valueOf4;
        k0 = new BigDecimal(valueOf3);
        l0 = new BigDecimal(valueOf4);
        m0 = new BigDecimal(valueOf);
        n0 = new BigDecimal(valueOf2);
    }

    protected c(int i) {
        super(i);
    }

    protected static final String o0(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i <= 255) {
            return "'" + c + "' (code " + i + ")";
        }
        return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    protected String A0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    protected final void C0(String str) throws i {
        throw a(str);
    }

    protected final void D0(String str, Object obj) throws i {
        throw a(String.format(str, obj));
    }

    protected final void F0(String str, Object obj, Object obj2) throws i {
        throw a(String.format(str, obj, obj2));
    }

    protected void G0(String str, m mVar, Class<?> cls) throws ax.V4.a {
        throw new ax.V4.a(this, str, mVar, cls);
    }

    @Override // ax.T4.j
    public abstract m H() throws IOException;

    @Override // ax.T4.j
    public j L() throws IOException {
        m mVar = this.d0;
        if (mVar == m.START_OBJECT || mVar == m.START_ARRAY) {
            int i = 1;
            while (true) {
                m H = H();
                if (H == null) {
                    s0();
                    return this;
                }
                if (H.n()) {
                    i++;
                } else if (H.l()) {
                    i--;
                    if (i == 0) {
                        break;
                    }
                } else if (H == m.NOT_AVAILABLE) {
                    D0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                }
            }
        }
        return this;
    }

    protected void L0() throws i {
        M0(" in " + this.d0, this.d0);
    }

    protected void M0(String str, m mVar) throws i {
        throw new f(this, mVar, "Unexpected end-of-input" + str);
    }

    protected void T0(m mVar) throws i {
        M0(mVar == m.VALUE_STRING ? " in a String value" : (mVar == m.VALUE_NUMBER_INT || mVar == m.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", mVar);
    }

    protected final i W(String str, Throwable th) {
        return new i(this, str, th);
    }

    protected void Y0(int i) throws i {
        Z0(i, "Expected space separating root-level values");
    }

    protected void Z0(int i, String str) throws i {
        if (i < 0) {
            L0();
        }
        String format = String.format("Unexpected character (%s)", o0(i));
        if (str != null) {
            format = format + ": " + str;
        }
        C0(format);
    }

    protected <T> T a1(int i, String str) throws i {
        String format = String.format("Unexpected character (%s) in numeric value", o0(i));
        if (str != null) {
            format = format + ": " + str;
        }
        C0(format);
        return null;
    }

    @Override // ax.T4.j
    public m b() {
        return this.d0;
    }

    protected final void b1() {
        n.a();
    }

    protected void c1(int i) throws i {
        C0("Illegal character (" + o0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    protected void d0(String str, ax.b5.c cVar, ax.T4.a aVar) throws IOException {
        try {
            aVar.e(str, cVar);
        } catch (IllegalArgumentException e) {
            C0(e.getMessage());
        }
    }

    protected final void d1(String str, Throwable th) throws i {
        throw W(str, th);
    }

    protected void e1(String str) throws i {
        C0("Invalid numeric value: " + str);
    }

    protected void f1() throws IOException {
        g1(u());
    }

    protected void g1(String str) throws IOException {
        h1(str, b());
    }

    protected void h1(String str, m mVar) throws IOException {
        G0(String.format("Numeric value (%s) out of range of int (%d - %s)", u0(str), Integer.MIN_VALUE, Integer.valueOf(SubsamplingScaleImageView.TILE_SIZE_AUTO)), mVar, Integer.TYPE);
    }

    protected void i1() throws IOException {
        j1(u());
    }

    @Override // ax.T4.j
    public m j() {
        return this.d0;
    }

    protected void j1(String str) throws IOException {
        k1(str, b());
    }

    protected void k1(String str, m mVar) throws IOException {
        G0(String.format("Numeric value (%s) out of range of long (%d - %s)", u0(str), Long.MIN_VALUE, Long.MAX_VALUE), mVar, Long.TYPE);
    }

    protected abstract void s0() throws i;

    @Override // ax.T4.j
    public abstract String u() throws IOException;

    protected String u0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }
}
