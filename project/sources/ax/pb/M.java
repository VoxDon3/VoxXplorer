package ax.pb;

import ax.qb.C2896d;

/* loaded from: classes3.dex */
class M extends AbstractC2818s {
    private int C0;
    private String D0;
    private String E0;

    M(String str, String str2) {
        this.d0 = (byte) 7;
        this.D0 = str;
        this.E0 = str2;
        this.C0 = 22;
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
        return new String("SmbComRename[" + super.toString() + ",searchAttributes=0x" + C2896d.c(this.C0, 4) + ",oldFileName=" + this.D0 + ",newFileName=" + this.E0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = 4;
        int A = i2 + A(this.D0, bArr, i2);
        int i3 = A + 1;
        bArr[A] = 4;
        if (this.q0) {
            bArr[i3] = 0;
            i3 = A + 2;
        }
        return (i3 + A(this.E0, bArr, i3)) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.C0, bArr, i);
        return 2;
    }
}
