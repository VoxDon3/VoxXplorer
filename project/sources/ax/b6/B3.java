package ax.b6;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class B3 implements Serializable, Iterable<Byte> {
    public static final B3 c0 = new K3(C1616m4.b);
    private static final E3 d0 = new N3();
    private int q = 0;

    static {
        new D3();
    }

    B3() {
    }

    static /* synthetic */ int h(byte b) {
        return b & 255;
    }

    static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static B3 l(String str) {
        return new K3(str.getBytes(C1616m4.a));
    }

    public static B3 n(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static B3 p(byte[] bArr, int i, int i2) {
        i(i, i + i2, bArr.length);
        return new K3(d0.a(bArr, i, i2));
    }

    static G3 u(int i) {
        return new G3(i);
    }

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    protected final int g() {
        return this.q;
    }

    public final int hashCode() {
        int i = this.q;
        if (i == 0) {
            int s = s();
            i = t(s, 0, s);
            if (i == 0) {
                i = 1;
            }
            this.q = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C1718z3(this);
    }

    public abstract B3 k(int i, int i2);

    abstract void q(AbstractC1702x3 abstractC1702x3) throws IOException;

    abstract byte r(int i);

    public abstract int s();

    protected abstract int t(int i, int i2, int i3);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(s());
        if (s() <= 50) {
            str = C5.a(this);
        } else {
            str = C5.a(k(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }
}
