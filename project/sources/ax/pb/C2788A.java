package ax.pb;

/* renamed from: ax.pb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2788A extends AbstractC2818s {
    private int C0;

    C2788A(int i) {
        this.C0 = i;
        this.d0 = (byte) 52;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComFindClose2[" + super.toString() + ",sid=" + this.C0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.C0, bArr, i);
        return 2;
    }
}
