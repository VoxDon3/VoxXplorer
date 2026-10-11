/*
 * Decompiled with CFR 0.152.
 */
package ax.U4;

import ax.T4.g;
import ax.T4.l;
import ax.T4.n;
import ax.T4.o;
import ax.Z4.b;
import ax.Z4.f;
import ax.b5.e;
import java.io.IOException;

public abstract class a
extends g {
    protected static final int k0 = g.a.j0.l() | g.a.i0.l() | g.a.l0.l();
    protected n f0;
    protected int g0;
    protected boolean h0;
    protected f i0;
    protected boolean j0;

    protected a(int n8, n object) {
        this.g0 = n8;
        this.f0 = object;
        object = g.a.l0.j(n8) ? b.e(this) : null;
        this.i0 = f.m((b)object);
        this.h0 = g.a.j0.j(n8);
    }

    protected void A0(char[] cArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        if (cArray == null) {
            this.a("Invalid `char[]` argument: `null`");
        }
        if (((n11 = cArray.length) - (n10 = n8 + n9) | (n8 | n9 | n10)) < 0) {
            this.a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", n8, n9, n11));
        }
    }

    protected void C0(String string, int n8, int n9) throws IOException {
        int n10;
        int n11;
        if (string == null) {
            this.a("Invalid `String` argument: `null`");
        }
        if (((n11 = string.length()) - (n10 = n8 + n9) | (n8 | n9 | n10)) < 0) {
            this.a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", n8, n9, n11));
        }
    }

    protected o D0() {
        return new e();
    }

    protected final int F0(int n8, int n9) throws IOException {
        if (n9 < 56320 || n9 > 57343) {
            this.a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", n8, n9));
        }
        return (n8 - 55296 << 10) + 65536 + (n9 - 56320);
    }

    public l G0() {
        return this.i0;
    }

    public final boolean L0(g.a a8) {
        int n8 = this.g0;
        return (a8.l() & n8) != 0;
    }

    @Override
    public void close() throws IOException {
        this.j0 = true;
    }

    @Override
    public g f() {
        if (this.c() != null) {
            return this;
        }
        return this.e(this.D0());
    }
}

