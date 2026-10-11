package ax.pb;

/* loaded from: classes3.dex */
class z0 extends P {
    private int d1;

    z0(String str, int i) {
        this.Z0 = str;
        this.d1 = i;
        this.d0 = (byte) 37;
        this.Y0 = (byte) 35;
        this.W0 = -1;
        this.T0 = 6;
        this.U0 = 1;
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
        AbstractC2818s.w(this.d1, bArr, i + 2);
        return 4;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("TransPeekNamedPipe[" + super.toString() + ",pipeName=" + this.Z0 + "]");
    }
}
