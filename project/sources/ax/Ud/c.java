package ax.Ud;

/* loaded from: classes3.dex */
public class c extends g {
    @Override // ax.Ud.b
    protected int b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        if (i2 < 161) {
            return -1;
        }
        return (((i2 - 161) * 94) + (bArr[i + 1] & 255)) - 161;
    }
}
