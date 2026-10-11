/*
 * Decompiled with CFR 0.152.
 */
package ax.U4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.V4.a;
import ax.W4.f;
import ax.b5.n;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class c
extends j {
    protected static final byte[] e0;
    protected static final int[] f0;
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
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        e0 = new byte[0];
        f0 = new int[0];
        g0 = bigInteger4 = BigInteger.valueOf(Integer.MIN_VALUE);
        h0 = bigInteger3 = BigInteger.valueOf(Integer.MAX_VALUE);
        i0 = bigInteger2 = BigInteger.valueOf(Long.MIN_VALUE);
        j0 = bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        k0 = new BigDecimal(bigInteger2);
        l0 = new BigDecimal(bigInteger);
        m0 = new BigDecimal(bigInteger4);
        n0 = new BigDecimal(bigInteger3);
    }

    protected c(int n8) {
        super(n8);
    }

    protected static final String o0(int n8) {
        char c8 = (char)n8;
        if (Character.isISOControl(c8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(CTRL-CHAR, code ");
            stringBuilder.append(n8);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        if (n8 > 255) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("'");
            stringBuilder.append(c8);
            stringBuilder.append("' (code ");
            stringBuilder.append(n8);
            stringBuilder.append(" / 0x");
            stringBuilder.append(Integer.toHexString(n8));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("'");
        stringBuilder.append(c8);
        stringBuilder.append("' (code ");
        stringBuilder.append(n8);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    protected String A0(String string) {
        int n8 = string.length();
        if (n8 < 1000) {
            return string;
        }
        int n9 = n8;
        if (string.startsWith("-")) {
            n9 = n8 - 1;
        }
        return String.format("[number with %d characters]", n9);
    }

    protected final void C0(String string) throws i {
        throw this.a(string);
    }

    protected final void D0(String string, Object object) throws i {
        throw this.a(String.format(string, object));
    }

    protected final void F0(String string, Object object, Object object2) throws i {
        throw this.a(String.format(string, object, object2));
    }

    protected void G0(String string, m m8, Class<?> clazz) throws a {
        throw new a(this, string, m8, clazz);
    }

    @Override
    public abstract m H() throws IOException;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public j L() throws IOException {
        m m8 = this.d0;
        if (m8 != m.l0 && m8 != m.n0) return this;
        int n8 = 1;
        while (true) {
            if ((m8 = this.H()) == null) {
                this.s0();
                return this;
            }
            if (m8.n()) {
                ++n8;
                continue;
            }
            if (m8.l()) {
                int n9;
                n8 = n9 = n8 - 1;
                if (n9 != 0) continue;
                return this;
            }
            if (m8 != m.k0) continue;
            this.D0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", this.getClass().getName());
        }
    }

    protected void L0() throws i {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" in ");
        stringBuilder.append((Object)this.d0);
        this.M0(stringBuilder.toString(), this.d0);
    }

    protected void M0(String string, m m8) throws i {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end-of-input");
        stringBuilder.append(string);
        throw new f((j)this, m8, stringBuilder.toString());
    }

    protected void T0(m m8) throws i {
        String string = m8 == m.r0 ? " in a String value" : (m8 != m.s0 && m8 != m.t0 ? " in a value" : " in a Number value");
        this.M0(string, m8);
    }

    protected final i W(String string, Throwable throwable) {
        return new i(this, string, throwable);
    }

    protected void Y0(int n8) throws i {
        this.Z0(n8, "Expected space separating root-level values");
    }

    protected void Z0(int n8, String string) throws i {
        if (n8 < 0) {
            this.L0();
        }
        String string2 = String.format("Unexpected character (%s)", c.o0(n8));
        CharSequence charSequence = string2;
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.C0((String)charSequence);
    }

    protected <T> T a1(int n8, String string) throws i {
        String string2 = String.format("Unexpected character (%s) in numeric value", c.o0(n8));
        CharSequence charSequence = string2;
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.C0((String)charSequence);
        return null;
    }

    @Override
    public m b() {
        return this.d0;
    }

    protected final void b1() {
        n.a();
    }

    protected void c1(int n8) throws i {
        n8 = (char)n8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal character (");
        stringBuilder.append(c.o0(n8));
        stringBuilder.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        this.C0(stringBuilder.toString());
    }

    protected void d0(String string, ax.b5.c c8, ax.T4.a a8) throws IOException {
        try {
            a8.e(string, c8);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.C0(illegalArgumentException.getMessage());
            return;
        }
    }

    protected final void d1(String string, Throwable throwable) throws i {
        throw this.W(string, throwable);
    }

    protected void e1(String string) throws i {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid numeric value: ");
        stringBuilder.append(string);
        this.C0(stringBuilder.toString());
    }

    protected void f1() throws IOException {
        this.g1(this.u());
    }

    protected void g1(String string) throws IOException {
        this.h1(string, this.b());
    }

    protected void h1(String string, m m8) throws IOException {
        this.G0(String.format("Numeric value (%s) out of range of int (%d - %s)", this.u0(string), Integer.MIN_VALUE, Integer.MAX_VALUE), m8, Integer.TYPE);
    }

    protected void i1() throws IOException {
        this.j1(this.u());
    }

    @Override
    public m j() {
        return this.d0;
    }

    protected void j1(String string) throws IOException {
        this.k1(string, this.b());
    }

    protected void k1(String string, m m8) throws IOException {
        this.G0(String.format("Numeric value (%s) out of range of long (%d - %s)", this.u0(string), Long.MIN_VALUE, Long.MAX_VALUE), m8, Long.TYPE);
    }

    protected abstract void s0() throws i;

    @Override
    public abstract String u() throws IOException;

    protected String u0(String string) {
        int n8 = string.length();
        if (n8 < 1000) {
            return string;
        }
        int n9 = n8;
        if (string.startsWith("-")) {
            n9 = n8 - 1;
        }
        return String.format("[Integer with %d digits]", n9);
    }
}

