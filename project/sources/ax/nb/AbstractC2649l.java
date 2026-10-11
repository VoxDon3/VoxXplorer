package ax.nb;

/* renamed from: ax.nb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2649l {
    int a;
    int b;

    static void b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    int a(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) this.a;
        int i3 = this.b;
        if (i3 > 65535) {
            bArr[i2] = 1;
        }
        b(i3, bArr, i + 2);
        return 4;
    }

    abstract int c(byte[] bArr, int i);

    public int d(byte[] bArr, int i) {
        this.b = c(bArr, i + 4);
        a(bArr, i);
        return this.b + 4;
    }
}
