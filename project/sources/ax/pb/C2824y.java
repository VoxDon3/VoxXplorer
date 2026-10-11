package ax.pb;

import ax.qb.C2896d;

/* renamed from: ax.pb.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2824y extends AbstractC2818s {
    private int C0;

    C2824y(String str) {
        this.x0 = str;
        this.d0 = (byte) 6;
        this.C0 = 6;
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
        return new String("SmbComDelete[" + super.toString() + ",searchAttributes=0x" + C2896d.c(this.C0, 4) + ",fileName=" + this.x0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + A(this.x0, bArr, i2)) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.C0, bArr, i);
        return 2;
    }
}
