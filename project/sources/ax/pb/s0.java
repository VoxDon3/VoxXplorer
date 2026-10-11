package ax.pb;

/* loaded from: classes3.dex */
class s0 extends Q {
    private int Y0;
    InterfaceC2793a Z0;

    class a implements InterfaceC2793a {
        long a;
        long b;
        int c;
        int d;

        a() {
        }

        @Override // ax.pb.InterfaceC2793a
        public long a() {
            return this.b * this.c * this.d;
        }

        @Override // ax.pb.InterfaceC2793a
        public long b() {
            return this.a * this.c * this.d;
        }

        public String toString() {
            return new String("SmbInfoAllocation[alloc=" + this.a + ",free=" + this.b + ",sectPerAlloc=" + this.c + ",bytesPerSect=" + this.d + "]");
        }
    }

    s0(int i) {
        this.Y0 = i;
        this.d0 = (byte) 50;
        this.R0 = (byte) 3;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        int i3 = this.Y0;
        if (i3 == 1) {
            return H(bArr, i);
        }
        if (i3 == 259) {
            return I(bArr, i);
        }
        if (i3 != 1007) {
            return 0;
        }
        return G(bArr, i);
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        return 0;
    }

    int G(byte[] bArr, int i) {
        a aVar = new a();
        aVar.a = AbstractC2818s.k(bArr, i);
        aVar.b = AbstractC2818s.k(bArr, i + 8);
        aVar.c = AbstractC2818s.j(bArr, i + 24);
        aVar.d = AbstractC2818s.j(bArr, i + 28);
        this.Z0 = aVar;
        return (i + 32) - i;
    }

    int H(byte[] bArr, int i) {
        a aVar = new a();
        aVar.c = AbstractC2818s.j(bArr, i + 4);
        aVar.a = AbstractC2818s.j(bArr, i + 8);
        aVar.b = AbstractC2818s.j(bArr, i + 12);
        aVar.d = AbstractC2818s.i(bArr, i + 16);
        this.Z0 = aVar;
        return (i + 20) - i;
    }

    int I(byte[] bArr, int i) {
        a aVar = new a();
        aVar.a = AbstractC2818s.k(bArr, i);
        aVar.b = AbstractC2818s.k(bArr, i + 8);
        aVar.c = AbstractC2818s.j(bArr, i + 16);
        aVar.d = AbstractC2818s.j(bArr, i + 20);
        this.Z0 = aVar;
        return (i + 24) - i;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2QueryFSInformationResponse[" + super.toString() + "]");
    }
}
