/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.K1;
import ax.W5.O0;
import ax.W5.f0;
import ax.W5.j0;
import ax.W5.k0;
import ax.W5.q0;
import ax.W5.s0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class t0
implements Iterable,
Serializable {
    public static final t0 c0 = new q0(O0.d);
    private static final Comparator d0;
    private static final s0 e0;
    private int q = 0;

    static {
        int n8 = f0.a;
        e0 = new s0(null);
        d0 = new k0();
    }

    t0() {
    }

    static int p(int n8, int n9, int n10) {
        int n11 = n9 - n8;
        if ((n8 | n9 | n11 | n10 - n9) < 0) {
            if (n8 >= 0) {
                if (n9 < n8) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n8);
                    stringBuilder.append(", ");
                    stringBuilder.append(n9);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n9);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n8);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static t0 r(byte[] byArray, int n8, int n9) {
        t0.p(n8, n8 + n9, byArray.length);
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        return new q0(byArray2);
    }

    public abstract byte e(int var1);

    public abstract boolean equals(Object var1);

    abstract byte g(int var1);

    public abstract int h();

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.q;
        if (n8 == 0) {
            n9 = this.h();
            n9 = n8 = this.i(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.q = n9;
        }
        return n9;
    }

    protected abstract int i(int var1, int var2, int var3);

    public final /* synthetic */ Iterator iterator() {
        return new j0(this);
    }

    public abstract t0 k(int var1, int var2);

    protected abstract String l(Charset var1);

    public abstract boolean n();

    protected final int q() {
        return this.q;
    }

    public final String s(Charset charset) {
        if (this.h() == 0) {
            return "";
        }
        return this.l(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String string = Integer.toHexString(System.identityHashCode(this));
        int n8 = this.h();
        String string2 = this.h() <= 50 ? K1.a(this) : K1.a(this.k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", string, n8, string2);
    }
}

