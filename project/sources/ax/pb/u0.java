package ax.pb;

import ax.qb.C2896d;
import java.util.Date;

/* loaded from: classes3.dex */
class u0 extends Q {
    private int Y0;
    InterfaceC2810j Z0;

    class a implements InterfaceC2810j {
        long c0;
        long d0;
        long e0;
        int f0;
        long q;

        a() {
        }

        @Override // ax.pb.InterfaceC2810j
        public long a() {
            return this.q;
        }

        @Override // ax.pb.InterfaceC2810j
        public int b() {
            return this.f0;
        }

        @Override // ax.pb.InterfaceC2810j
        public long c() {
            return this.d0;
        }

        @Override // ax.pb.InterfaceC2810j
        public long getSize() {
            return 0L;
        }

        public String toString() {
            return new String("SmbQueryFileBasicInfo[createTime=" + new Date(this.q) + ",lastAccessTime=" + new Date(this.c0) + ",lastWriteTime=" + new Date(this.d0) + ",changeTime=" + new Date(this.e0) + ",attributes=0x" + C2896d.c(this.f0, 4) + "]");
        }
    }

    class b implements InterfaceC2810j {
        long c0;
        int d0;
        boolean e0;
        boolean f0;
        long q;

        b() {
        }

        @Override // ax.pb.InterfaceC2810j
        public long a() {
            return 0L;
        }

        @Override // ax.pb.InterfaceC2810j
        public int b() {
            return 0;
        }

        @Override // ax.pb.InterfaceC2810j
        public long c() {
            return 0L;
        }

        @Override // ax.pb.InterfaceC2810j
        public long getSize() {
            return this.c0;
        }

        public String toString() {
            return new String("SmbQueryInfoStandard[allocationSize=" + this.q + ",endOfFile=" + this.c0 + ",numberOfLinks=" + this.d0 + ",deletePending=" + this.e0 + ",directory=" + this.f0 + "]");
        }
    }

    u0(int i) {
        this.Y0 = i;
        this.R0 = (byte) 5;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        int i3 = this.Y0;
        if (i3 == 257) {
            return G(bArr, i);
        }
        if (i3 != 258) {
            return 0;
        }
        return H(bArr, i);
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        return 2;
    }

    int G(byte[] bArr, int i) {
        a aVar = new a();
        aVar.q = AbstractC2818s.q(bArr, i);
        aVar.c0 = AbstractC2818s.q(bArr, i + 8);
        aVar.d0 = AbstractC2818s.q(bArr, i + 16);
        aVar.e0 = AbstractC2818s.q(bArr, i + 24);
        aVar.f0 = AbstractC2818s.i(bArr, i + 32);
        this.Z0 = aVar;
        return (i + 34) - i;
    }

    int H(byte[] bArr, int i) {
        b bVar = new b();
        bVar.q = AbstractC2818s.k(bArr, i);
        bVar.c0 = AbstractC2818s.k(bArr, i + 8);
        bVar.d0 = AbstractC2818s.j(bArr, i + 16);
        int i2 = i + 21;
        bVar.e0 = (bArr[i + 20] & 255) > 0;
        int i3 = i + 22;
        bVar.f0 = (bArr[i2] & 255) > 0;
        this.Z0 = bVar;
        return i3 - i;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2QueryPathInformationResponse[" + super.toString() + "]");
    }
}
