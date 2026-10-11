package ax.W5;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: ax.W5.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1069t0 implements Iterable, Serializable {
    public static final AbstractC1069t0 c0 = new C1061q0(O0.d);
    private static final Comparator d0;
    private static final C1066s0 e0;
    private int q = 0;

    static {
        int i = C1028f0.a;
        e0 = new C1066s0(null);
        d0 = new C1043k0();
    }

    AbstractC1069t0() {
    }

    static int p(int i, int i2, int i3) {
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

    public static AbstractC1069t0 r(byte[] bArr, int i, int i2) {
        p(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C1061q0(bArr2);
    }

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    abstract byte g(int i);

    public abstract int h();

    public final int hashCode() {
        int i = this.q;
        if (i == 0) {
            int h = h();
            i = i(h, 0, h);
            if (i == 0) {
                i = 1;
            }
            this.q = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1040j0(this);
    }

    public abstract AbstractC1069t0 k(int i, int i2);

    protected abstract String l(Charset charset);

    public abstract boolean n();

    protected final int q() {
        return this.q;
    }

    public final String s(Charset charset) {
        return h() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : l(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? K1.a(this) : K1.a(k(0, 47)).concat("..."));
    }
}
