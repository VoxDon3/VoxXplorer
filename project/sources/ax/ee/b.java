package ax.ee;

/* loaded from: classes3.dex */
public class b extends a {
    public b(int i) {
        super(i);
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            byte[] bArr2 = this.b;
            int i4 = this.a;
            int i5 = this.c;
            byte b2 = (byte) (b + bArr2[(i4 + i5) & 255]);
            bArr[i] = b2;
            this.c = i5 - 1;
            bArr2[i5 & 255] = b2;
            i++;
        }
    }
}
