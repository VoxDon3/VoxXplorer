package ax.Td;

/* loaded from: classes3.dex */
public class c extends b {
    @Override // ax.Td.b
    protected int b(byte[] bArr, int i) {
        int i2;
        if ((bArr[i] & 255) != 130 || (i2 = bArr[i + 1] & 255) < 159 || i2 > 241) {
            return -1;
        }
        return i2 - 159;
    }
}
