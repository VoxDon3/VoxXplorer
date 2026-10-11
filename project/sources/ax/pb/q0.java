package ax.pb;

/* loaded from: classes3.dex */
class q0 extends Q {
    int Y0;
    int Z0;
    int a1;
    a[] b1;

    class a {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private String i;
        int j;
        String k = null;
        String l = null;

        a() {
        }

        int a(byte[] bArr, int i, int i2) {
            int i3 = AbstractC2818s.i(bArr, i);
            this.a = i3;
            if (i3 != 3 && i3 != 1) {
                throw new RuntimeException("Version " + this.a + " referral not supported. Please report this to jcifs at samba dot org.");
            }
            this.b = AbstractC2818s.i(bArr, i + 2);
            this.c = AbstractC2818s.i(bArr, i + 4);
            this.d = AbstractC2818s.i(bArr, i + 6);
            int i4 = i + 8;
            int i5 = this.a;
            if (i5 == 3) {
                this.e = AbstractC2818s.i(bArr, i4);
                this.j = AbstractC2818s.i(bArr, i + 10);
                this.f = AbstractC2818s.i(bArr, i + 12);
                this.g = AbstractC2818s.i(bArr, i + 14);
                this.h = AbstractC2818s.i(bArr, i + 16);
                q0 q0Var = q0.this;
                this.k = q0Var.o(bArr, this.f + i, i2, (q0Var.j0 & 32768) != 0);
                int i6 = this.h;
                if (i6 > 0) {
                    q0 q0Var2 = q0.this;
                    this.l = q0Var2.o(bArr, i + i6, i2, (q0Var2.j0 & 32768) != 0);
                }
            } else if (i5 == 1) {
                q0 q0Var3 = q0.this;
                this.l = q0Var3.o(bArr, i4, i2, (q0Var3.j0 & 32768) != 0);
            }
            return this.b;
        }

        public String toString() {
            return new String("Referral[version=" + this.a + ",size=" + this.b + ",serverType=" + this.c + ",flags=" + this.d + ",proximity=" + this.e + ",ttl=" + this.j + ",pathOffset=" + this.f + ",altPathOffset=" + this.g + ",nodeOffset=" + this.h + ",path=" + this.k + ",altPath=" + this.i + ",node=" + this.l + "]");
        }
    }

    q0() {
        this.R0 = (byte) 16;
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        int i3 = AbstractC2818s.i(bArr, i);
        this.Y0 = i3;
        int i4 = i + 2;
        if ((this.j0 & 32768) != 0) {
            this.Y0 = i3 / 2;
        }
        this.Z0 = AbstractC2818s.i(bArr, i4);
        this.a1 = AbstractC2818s.i(bArr, i + 4);
        int i5 = i + 8;
        this.b1 = new a[this.Z0];
        for (int i6 = 0; i6 < this.Z0; i6++) {
            this.b1[i6] = new a();
            i5 += this.b1[i6].a(bArr, i5, i2);
        }
        return i5 - i;
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2GetDfsReferralResponse[" + super.toString() + ",pathConsumed=" + this.Y0 + ",numReferrals=" + this.Z0 + ",flags=" + this.a1 + "]");
    }
}
