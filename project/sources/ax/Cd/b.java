package ax.Cd;

/* loaded from: classes3.dex */
public class b implements a {
    @Override // ax.Cd.a
    public int a(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }
}
