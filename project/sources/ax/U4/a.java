package ax.U4;

import ax.T4.g;
import ax.T4.l;
import ax.T4.n;
import ax.T4.o;
import ax.Z4.f;
import ax.b5.e;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a extends g {
    protected static final int k0 = (g.a.WRITE_NUMBERS_AS_STRINGS.l() | g.a.ESCAPE_NON_ASCII.l()) | g.a.STRICT_DUPLICATE_DETECTION.l();
    protected n f0;
    protected int g0;
    protected boolean h0;
    protected f i0;
    protected boolean j0;

    protected a(int i, n nVar) {
        this.g0 = i;
        this.f0 = nVar;
        this.i0 = f.m(g.a.STRICT_DUPLICATE_DETECTION.j(i) ? ax.Z4.b.e(this) : null);
        this.h0 = g.a.WRITE_NUMBERS_AS_STRINGS.j(i);
    }

    protected void A0(char[] cArr, int i, int i2) throws IOException {
        if (cArr == null) {
            a("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if (((length - i3) | i | i2 | i3) < 0) {
            a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected void C0(String str, int i, int i2) throws IOException {
        if (str == null) {
            a("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i3 = i + i2;
        if (((length - i3) | i | i2 | i3) < 0) {
            a(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(length)));
        }
    }

    protected o D0() {
        return new e();
    }

    protected final int F0(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - 56320);
    }

    public l G0() {
        return this.i0;
    }

    public final boolean L0(g.a aVar) {
        return (aVar.l() & this.g0) != 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j0 = true;
    }

    @Override // ax.T4.g
    public g f() {
        return c() != null ? this : e(D0());
    }
}
