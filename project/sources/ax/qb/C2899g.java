package ax.qb;

/* renamed from: ax.qb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2899g {
    byte[] a;
    int b;
    int c;

    public C2899g(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i, int i2) {
        this.a = new byte[256];
        this.b = 0;
        while (true) {
            int i3 = this.b;
            if (i3 >= 256) {
                break;
            }
            this.a[i3] = (byte) i3;
            this.b = i3 + 1;
        }
        this.c = 0;
        this.b = 0;
        while (true) {
            int i4 = this.b;
            if (i4 >= 256) {
                this.c = 0;
                this.b = 0;
                return;
            }
            int i5 = this.c + bArr[(i4 % i2) + i];
            byte[] bArr2 = this.a;
            byte b = bArr2[i4];
            int i6 = (i5 + b) & 255;
            this.c = i6;
            bArr2[i4] = bArr2[i6];
            bArr2[i6] = b;
            this.b = i4 + 1;
        }
    }

    public void b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        while (i < i4) {
            int i5 = (this.b + 1) & 255;
            this.b = i5;
            int i6 = this.c;
            byte[] bArr3 = this.a;
            byte b = bArr3[i5];
            int i7 = (i6 + b) & 255;
            this.c = i7;
            bArr3[i5] = bArr3[i7];
            bArr3[i7] = b;
            bArr2[i3] = (byte) (bArr[i] ^ bArr3[(bArr3[i5] + b) & 255]);
            i3++;
            i++;
        }
    }
}
