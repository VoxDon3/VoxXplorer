package ax.Dd;

/* loaded from: classes3.dex */
public class e extends d {
    public e(byte[] bArr) {
        super(bArr);
        if (c(bArr, 0, bArr.length)) {
            throw new IllegalArgumentException("attempt to create weak DESede key");
        }
    }

    public static boolean c(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (d.b(bArr, i)) {
                return true;
            }
            i += 8;
        }
        return false;
    }
}
