package ax.pb;

import ax.qb.C2897e;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
class x0 extends P {
    private byte[] d1;
    private int e1;
    private int f1;

    x0(String str, byte[] bArr, int i, int i2) {
        this.Z0 = str;
        this.d1 = bArr;
        this.e1 = i;
        this.f1 = i2;
        this.d0 = (byte) 37;
        this.Y0 = (byte) 84;
        this.W0 = -1;
        this.T0 = 0;
        this.U0 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.V0 = (byte) 0;
        this.X0 = 2;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = this.f1;
        if (length >= i2) {
            System.arraycopy(this.d1, this.e1, bArr, i, i2);
            return this.f1;
        }
        if (C2897e.c0 < 3) {
            return 0;
        }
        AbstractC2818s.A0.println("TransCallNamedPipe data too long for buffer");
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("TransCallNamedPipe[" + super.toString() + ",pipeName=" + this.Z0 + "]");
    }
}
