package ax.pb;

import java.io.InputStream;

/* loaded from: classes3.dex */
class C0 extends Q {
    private C2806g0 Y0;

    C0(C2806g0 c2806g0) {
        this.Y0 = c2806g0;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.Y0.E0;
        if (inputStream == null) {
            return i2;
        }
        F0 f0 = (F0) inputStream;
        synchronized (f0.m0) {
            f0.c(bArr, i, i2);
            f0.m0.notify();
        }
        return i2;
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("TransTransactNamedPipeResponse[" + super.toString() + "]");
    }
}
