package ax.Dc;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class U implements Cloneable, Serializable {
    public static final U c0 = new U(33639248);
    public static final U d0 = new U(67324752);
    public static final U e0 = new U(134695760);
    static final U f0 = new U(4294967295L);
    public static final U g0 = new U(808471376);
    public static final U h0 = new U(134630224);
    private final long q;

    public U(long j) {
        this.q = j;
    }

    public static byte[] c(long j) {
        byte[] bArr = new byte[4];
        j(j, bArr, 0);
        return bArr;
    }

    public static long h(byte[] bArr) {
        return i(bArr, 0);
    }

    public static long i(byte[] bArr, int i) {
        return ax.Kc.f.c(bArr, i, 4);
    }

    public static void j(long j, byte[] bArr, int i) {
        ax.Kc.f.d(bArr, j, i, 4);
    }

    public byte[] b() {
        return c(this.q);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int d() {
        return (int) this.q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof U) && this.q == ((U) obj).f();
    }

    public long f() {
        return this.q;
    }

    public int hashCode() {
        return (int) this.q;
    }

    public void k(byte[] bArr, int i) {
        j(this.q, bArr, i);
    }

    public String toString() {
        return "ZipLong value: " + this.q;
    }

    public U(byte[] bArr, int i) {
        this.q = i(bArr, i);
    }
}
