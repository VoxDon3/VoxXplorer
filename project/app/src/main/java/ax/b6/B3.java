/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.C5;
import ax.b6.D3;
import ax.b6.E3;
import ax.b6.G3;
import ax.b6.K3;
import ax.b6.N3;
import ax.b6.m4;
import ax.b6.x3;
import ax.b6.z3;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class B3
implements Serializable,
Iterable<Byte> {
    public static final B3 c0 = new K3(m4.b);
    private static final E3 d0 = new N3(null);
    private int q = 0;

    static {
        new D3();
    }

    B3() {
    }

    static /* synthetic */ int h(byte by) {
        return by & 0xFF;
    }

    static int i(int n8, int n9, int n10) {
        int n11 = n9 - n8;
        if ((n8 | n9 | n11 | n10 - n9) < 0) {
            if (n8 >= 0) {
                if (n9 < n8) {
                    StringBuilder stringBuilder = new StringBuilder("Beginning index larger than ending index: ");
                    stringBuilder.append(n8);
                    stringBuilder.append(", ");
                    stringBuilder.append(n9);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder("End index: ");
                stringBuilder.append(n9);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Beginning index: ");
            stringBuilder.append(n8);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static B3 l(String string) {
        return new K3(string.getBytes(m4.a));
    }

    public static B3 n(byte[] byArray) {
        return B3.p(byArray, 0, byArray.length);
    }

    public static B3 p(byte[] byArray, int n8, int n9) {
        B3.i(n8, n8 + n9, byArray.length);
        return new K3(d0.a(byArray, n8, n9));
    }

    static G3 u(int n8) {
        return new G3(n8, null);
    }

    public abstract byte e(int var1);

    public abstract boolean equals(Object var1);

    protected final int g() {
        return this.q;
    }

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.q;
        if (n8 == 0) {
            n9 = this.s();
            n9 = n8 = this.t(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.q = n9;
        }
        return n9;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return new z3(this);
    }

    public abstract B3 k(int var1, int var2);

    abstract void q(x3 var1) throws IOException;

    abstract byte r(int var1);

    public abstract int s();

    protected abstract int t(int var1, int var2, int var3);

    public final String toString() {
        CharSequence charSequence;
        Locale locale = Locale.ROOT;
        String string = Integer.toHexString(System.identityHashCode(this));
        int n8 = this.s();
        if (this.s() <= 50) {
            charSequence = C5.a(this);
        } else {
            String string2 = C5.a(this.k(0, 47));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("...");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", string, n8, charSequence);
    }
}

