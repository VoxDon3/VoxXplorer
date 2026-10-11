package ax.pb;

/* loaded from: classes3.dex */
class A0 extends Q {
    private C2806g0 Y0;
    private int Z0;
    int a1;
    int b1;

    A0(C2806g0 c2806g0) {
        this.Y0 = c2806g0;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        this.b1 = AbstractC2818s.i(bArr, i);
        this.Z0 = AbstractC2818s.i(bArr, i + 2);
        this.a1 = AbstractC2818s.i(bArr, i + 4);
        return 6;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("TransPeekNamedPipeResponse[" + super.toString() + "]");
    }
}
