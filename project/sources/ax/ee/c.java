package ax.ee;

/* loaded from: classes3.dex */
public class c extends a {
    public c(int i) {
        super(i);
    }

    public void a(byte[] bArr, int i, int i2, byte[] bArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr3 = this.b;
            int i4 = this.a;
            int i5 = this.c;
            byte b = bArr3[(i4 + i5) & 255];
            this.c = i5 - 1;
            int i6 = i + i3;
            bArr3[i5 & 255] = bArr[i6];
            bArr2[i3] = (byte) (bArr[i6] - b);
        }
    }
}
