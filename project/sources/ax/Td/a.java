package ax.Td;

/* loaded from: classes3.dex */
public class a extends b {
    @Override // ax.Td.b
    protected int b(byte[] bArr, int i) {
        int i2;
        if ((bArr[i] & 255) != 164 || (i2 = bArr[i + 1] & 255) < 161 || i2 > 243) {
            return -1;
        }
        return i2 - 161;
    }
}
