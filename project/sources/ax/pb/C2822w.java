package ax.pb;

/* renamed from: ax.pb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2822w extends AbstractC2818s {
    private int C0;
    private long D0;

    C2822w(int i, long j) {
        this.C0 = i;
        this.D0 = j;
        this.d0 = (byte) 4;
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
        return new String("SmbComClose[" + super.toString() + ",fid=" + this.C0 + ",lastWriteTime=" + this.D0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.C0, bArr, i);
        AbstractC2818s.D(this.D0, bArr, i + 2);
        return 6;
    }
}
