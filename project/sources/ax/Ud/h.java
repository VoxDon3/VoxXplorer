package ax.Ud;

/* loaded from: classes3.dex */
public class h extends g {
    @Override // ax.Ud.b
    protected int b(byte[] bArr, int i) {
        int i2;
        int i3 = bArr[i] & 255;
        if (i3 >= 129 && i3 <= 159) {
            i2 = i3 - 129;
        } else {
            if (i3 < 224 || i3 > 239) {
                return -1;
            }
            i2 = i3 - 193;
        }
        int i4 = i2 * 188;
        int i5 = bArr[i + 1] & 255;
        int i6 = i4 + (i5 - 64);
        return i5 >= 128 ? i6 - 1 : i6;
    }
}
