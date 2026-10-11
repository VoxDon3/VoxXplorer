package ax.pb;

/* renamed from: ax.pb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2825z extends AbstractC2818s {
    C2825z(String str) {
        this.x0 = str;
        this.d0 = (byte) 1;
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
        return new String("SmbComDeleteDirectory[" + super.toString() + ",directoryName=" + this.x0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + A(this.x0, bArr, i2)) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
