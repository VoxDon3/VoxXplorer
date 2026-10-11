package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1118o0 extends C1113m {
    public C1118o0(String str) {
        super(str);
    }

    private byte[] Q() {
        byte[] bArr = this.q;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!M()) {
            byte[] bArr2 = this.q;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(ax.Nd.j.e("0000Z"), 0, bArr3, this.q.length - 1, 5);
            return bArr3;
        }
        if (!N()) {
            byte[] bArr4 = this.q;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(ax.Nd.j.e("00Z"), 0, bArr5, this.q.length - 1, 3);
            return bArr5;
        }
        if (!K()) {
            return this.q;
        }
        int length = this.q.length - 2;
        while (length > 0 && this.q[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.q;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i);
        bArr8[i] = 90;
        return bArr8;
    }

    @Override // ax.Wc.C1113m, ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 24, Q());
    }

    @Override // ax.Wc.C1113m, ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, Q().length);
    }

    public C1118o0(byte[] bArr) {
        super(bArr);
    }

    @Override // ax.Wc.C1113m, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.C1113m, ax.Wc.A
    A B() {
        return this;
    }
}
