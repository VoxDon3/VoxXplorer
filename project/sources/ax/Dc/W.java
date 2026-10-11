package ax.Dc;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class W implements Cloneable, Serializable {
    public static final W c0 = new W(0);
    private final int q;

    public W(int i) {
        this.q = i;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[2];
        i(i, bArr, 0);
        return bArr;
    }

    public static int f(byte[] bArr) {
        return h(bArr, 0);
    }

    public static int h(byte[] bArr, int i) {
        return (int) ax.Kc.f.c(bArr, i, 2);
    }

    public static void i(int i, byte[] bArr, int i2) {
        ax.Kc.f.d(bArr, i, i2, 2);
    }

    public byte[] b() {
        byte[] bArr = new byte[2];
        ax.Kc.f.d(bArr, this.q, 0, 2);
        return bArr;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int d() {
        return this.q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof W) && this.q == ((W) obj).d();
    }

    public int hashCode() {
        return this.q;
    }

    public String toString() {
        return "ZipShort value: " + this.q;
    }

    public W(byte[] bArr, int i) {
        this.q = h(bArr, i);
    }
}
