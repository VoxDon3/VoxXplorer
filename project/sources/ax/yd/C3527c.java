package ax.yd;

import ax.Dd.k;
import ax.vd.AbstractC3318o;
import ax.vd.InterfaceC3307d;
import ax.vd.InterfaceC3312i;
import ax.vd.InterfaceC3315l;
import ax.zd.C3569c;

/* renamed from: ax.yd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3527c extends AbstractC3318o {
    private InterfaceC3315l d;
    private byte[] e;

    public C3527c(InterfaceC3312i interfaceC3312i) {
        C3569c c3569c = new C3569c(interfaceC3312i);
        this.d = c3569c;
        this.e = new byte[c3569c.a()];
    }

    private void c(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2) {
        if (i == 0) {
            throw new IllegalArgumentException("iteration count must be at least 1.");
        }
        if (bArr != null) {
            this.d.b(bArr, 0, bArr.length);
        }
        this.d.b(bArr2, 0, bArr2.length);
        this.d.c(this.e, 0);
        byte[] bArr4 = this.e;
        System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
        for (int i3 = 1; i3 < i; i3++) {
            InterfaceC3315l interfaceC3315l = this.d;
            byte[] bArr5 = this.e;
            interfaceC3315l.b(bArr5, 0, bArr5.length);
            this.d.c(this.e, 0);
            int i4 = 0;
            while (true) {
                byte[] bArr6 = this.e;
                if (i4 != bArr6.length) {
                    int i5 = i2 + i4;
                    bArr3[i5] = (byte) (bArr6[i4] ^ bArr3[i5]);
                    i4++;
                }
            }
        }
    }

    private byte[] d(int i) {
        int i2;
        int a = this.d.a();
        int i3 = ((i + a) - 1) / a;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i3 * a];
        this.d.e(new k(this.a));
        int i4 = 0;
        for (int i5 = 1; i5 <= i3; i5++) {
            while (true) {
                byte b = (byte) (bArr[i2] + 1);
                bArr[i2] = b;
                i2 = b == 0 ? i2 - 1 : 3;
            }
            c(this.b, this.c, bArr, bArr2, i4);
            i4 += a;
        }
        return bArr2;
    }

    @Override // ax.vd.AbstractC3318o
    public InterfaceC3307d a(int i) {
        return e(i);
    }

    public InterfaceC3307d e(int i) {
        int i2 = i / 8;
        return new k(d(i2), 0, i2);
    }
}
