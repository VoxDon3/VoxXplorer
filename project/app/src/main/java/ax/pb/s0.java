/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.s;

class s0
extends Q {
    private int Y0;
    ax.pb.a Z0;

    s0(int n8) {
        this.Y0 = n8;
        this.d0 = (byte)50;
        this.R0 = (byte)3;
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        n9 = this.Y0;
        if (n9 != 1) {
            if (n9 != 259) {
                if (n9 != 1007) {
                    return 0;
                }
                return this.G(byArray, n8);
            }
            return this.I(byArray, n8);
        }
        return this.H(byArray, n8);
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        return 0;
    }

    int G(byte[] byArray, int n8) {
        a a8 = new a(this);
        a8.a = s.k(byArray, n8);
        a8.b = s.k(byArray, n8 + 8);
        a8.c = s.j(byArray, n8 + 24);
        a8.d = s.j(byArray, n8 + 28);
        this.Z0 = a8;
        return n8 + 32 - n8;
    }

    int H(byte[] byArray, int n8) {
        a a8 = new a(this);
        a8.c = s.j(byArray, n8 + 4);
        a8.a = s.j(byArray, n8 + 8);
        a8.b = s.j(byArray, n8 + 12);
        a8.d = s.i(byArray, n8 + 16);
        this.Z0 = a8;
        return n8 + 20 - n8;
    }

    int I(byte[] byArray, int n8) {
        a a8 = new a(this);
        a8.a = s.k(byArray, n8);
        a8.b = s.k(byArray, n8 + 8);
        a8.c = s.j(byArray, n8 + 16);
        a8.d = s.j(byArray, n8 + 20);
        this.Z0 = a8;
        return n8 + 24 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trans2QueryFSInformationResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    class a
    implements ax.pb.a {
        long a;
        long b;
        int c;
        int d;
        final s0 e;

        a(s0 s02) {
            this.e = s02;
        }

        @Override
        public long a() {
            return this.b * (long)this.c * (long)this.d;
        }

        @Override
        public long b() {
            return this.a * (long)this.c * (long)this.d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SmbInfoAllocation[alloc=");
            stringBuilder.append(this.a);
            stringBuilder.append(",free=");
            stringBuilder.append(this.b);
            stringBuilder.append(",sectPerAlloc=");
            stringBuilder.append(this.c);
            stringBuilder.append(",bytesPerSect=");
            stringBuilder.append(this.d);
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }
}

