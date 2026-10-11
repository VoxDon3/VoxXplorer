package ax.pb;

/* loaded from: classes3.dex */
class D0 extends P {
    D0(String str) {
        this.Z0 = str;
        this.d0 = (byte) 37;
        this.Y0 = (byte) 83;
        this.W0 = -1;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = (byte) 0;
        this.X0 = 2;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
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
        return new String("TransWaitNamedPipe[" + super.toString() + ",pipeName=" + this.Z0 + "]");
    }
}
