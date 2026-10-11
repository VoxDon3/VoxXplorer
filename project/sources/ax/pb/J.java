package ax.pb;

import ax.qb.C2896d;
import java.util.Date;

/* loaded from: classes3.dex */
class J extends AbstractC2818s implements InterfaceC2810j {
    private long E0;
    private int C0 = 0;
    private long D0 = 0;
    private int F0 = 0;

    J(long j) {
        this.E0 = j;
        this.d0 = (byte) 8;
    }

    @Override // ax.pb.InterfaceC2810j
    public long a() {
        return this.D0 + this.E0;
    }

    @Override // ax.pb.InterfaceC2810j
    public int b() {
        return this.C0;
    }

    @Override // ax.pb.InterfaceC2810j
    public long c() {
        return this.D0 + this.E0;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.InterfaceC2810j
    public long getSize() {
        return this.F0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        if (this.o0 == 0) {
            return 0;
        }
        this.C0 = AbstractC2818s.i(bArr, i);
        this.D0 = AbstractC2818s.r(bArr, i + 2);
        this.F0 = AbstractC2818s.j(bArr, i + 6);
        return 20;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComQueryInformationResponse[" + super.toString() + ",fileAttributes=0x" + C2896d.c(this.C0, 4) + ",lastWriteTime=" + new Date(this.D0) + ",fileSize=" + this.F0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
