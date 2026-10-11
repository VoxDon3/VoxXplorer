package ax.pb;

import ax.qb.C2897e;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/* loaded from: classes3.dex */
class n0 extends Q {
    int Y0;
    boolean Z0;
    int a1;
    int b1;
    int c1;
    String d1;
    int e1;

    class a implements InterfaceC2807h {
        int a;
        int b;
        long c;
        long d;
        long e;
        long f;
        long g;
        long h;
        int i;
        int j;
        int k;
        int l;
        String m;
        String n;

        a() {
        }

        @Override // ax.pb.InterfaceC2807h
        public int a() {
            return 1;
        }

        @Override // ax.pb.InterfaceC2807h
        public int b() {
            return this.i;
        }

        @Override // ax.pb.InterfaceC2807h
        public long c() {
            return this.c;
        }

        @Override // ax.pb.InterfaceC2807h
        public String getName() {
            return this.n;
        }

        @Override // ax.pb.InterfaceC2807h
        public long h() {
            return this.e;
        }

        @Override // ax.pb.InterfaceC2807h
        public long length() {
            return this.g;
        }

        public String toString() {
            return new String("SmbFindFileBothDirectoryInfo[nextEntryOffset=" + this.a + ",fileIndex=" + this.b + ",creationTime=" + new Date(this.c) + ",lastAccessTime=" + new Date(this.d) + ",lastWriteTime=" + new Date(this.e) + ",changeTime=" + new Date(this.f) + ",endOfFile=" + this.g + ",allocationSize=" + this.h + ",extFileAttributes=" + this.i + ",fileNameLength=" + this.j + ",eaSize=" + this.k + ",shortNameLength=" + this.l + ",shortName=" + this.m + ",filename=" + this.n + "]");
        }
    }

    n0() {
        this.d0 = (byte) 50;
        this.R0 = (byte) 1;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        int i3;
        this.c1 = this.b1 + i;
        this.X0 = new a[this.W0];
        for (int i4 = 0; i4 < this.W0; i4++) {
            InterfaceC2807h[] interfaceC2807hArr = this.X0;
            a aVar = new a();
            interfaceC2807hArr[i4] = aVar;
            aVar.a = AbstractC2818s.j(bArr, i);
            aVar.b = AbstractC2818s.j(bArr, i + 4);
            aVar.c = AbstractC2818s.q(bArr, i + 8);
            aVar.e = AbstractC2818s.q(bArr, i + 24);
            aVar.g = AbstractC2818s.k(bArr, i + 40);
            aVar.i = AbstractC2818s.j(bArr, i + 56);
            int j = AbstractC2818s.j(bArr, i + 60);
            aVar.j = j;
            String G = G(bArr, i + 94, j);
            aVar.n = G;
            int i5 = this.c1;
            if (i5 >= i && ((i3 = aVar.a) == 0 || i5 < i3 + i)) {
                this.d1 = G;
                this.e1 = aVar.b;
            }
            i += aVar.a;
        }
        return this.Q0;
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        int i3;
        if (this.R0 == 1) {
            this.Y0 = AbstractC2818s.i(bArr, i);
            i3 = i + 2;
        } else {
            i3 = i;
        }
        this.W0 = AbstractC2818s.i(bArr, i3);
        this.Z0 = (bArr[i3 + 2] & 1) == 1;
        this.a1 = AbstractC2818s.i(bArr, i3 + 4);
        this.b1 = AbstractC2818s.i(bArr, i3 + 6);
        return (i3 + 8) - i;
    }

    String G(byte[] bArr, int i, int i2) {
        try {
            if (this.q0) {
                return new String(bArr, i, i2, "UTF-16LE");
            }
            if (i2 > 0 && bArr[(i + i2) - 1] == 0) {
                i2--;
            }
            return new String(bArr, i, i2, Z.K);
        } catch (UnsupportedEncodingException e) {
            if (C2897e.c0 <= 1) {
                return null;
            }
            e.printStackTrace(AbstractC2818s.A0);
            return null;
        }
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String((this.R0 == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[") + super.toString() + ",sid=" + this.Y0 + ",searchCount=" + this.W0 + ",isEndOfSearch=" + this.Z0 + ",eaErrorOffset=" + this.a1 + ",lastNameOffset=" + this.b1 + ",lastName=" + this.d1 + "]");
    }
}
