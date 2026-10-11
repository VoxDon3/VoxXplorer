/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.j;
import ax.pb.s;
import ax.qb.d;
import java.util.Date;

class u0
extends Q {
    private int Y0;
    j Z0;

    u0(int n8) {
        this.Y0 = n8;
        this.R0 = (byte)5;
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        n9 = this.Y0;
        if (n9 != 257) {
            if (n9 != 258) {
                return 0;
            }
            return this.H(byArray, n8);
        }
        return this.G(byArray, n8);
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        return 2;
    }

    int G(byte[] byArray, int n8) {
        a a8 = new a(this);
        a8.q = s.q(byArray, n8);
        a8.c0 = s.q(byArray, n8 + 8);
        a8.d0 = s.q(byArray, n8 + 16);
        a8.e0 = s.q(byArray, n8 + 24);
        a8.f0 = s.i(byArray, n8 + 32);
        this.Z0 = a8;
        return n8 + 34 - n8;
    }

    int H(byte[] byArray, int n8) {
        b b8 = new b(this);
        b8.q = s.k(byArray, n8);
        b8.c0 = s.k(byArray, n8 + 8);
        b8.d0 = s.j(byArray, n8 + 16);
        byte by = byArray[n8 + 20];
        boolean bl = false;
        boolean bl2 = (by & 0xFF) > 0;
        b8.e0 = bl2;
        bl2 = bl;
        if ((byArray[n8 + 21] & 0xFF) > 0) {
            bl2 = true;
        }
        b8.f0 = bl2;
        this.Z0 = b8;
        return n8 + 22 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trans2QueryPathInformationResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    class a
    implements j {
        long c0;
        long d0;
        long e0;
        int f0;
        final u0 g0;
        long q;

        a(u0 u02) {
            this.g0 = u02;
        }

        @Override
        public long a() {
            return this.q;
        }

        @Override
        public int b() {
            return this.f0;
        }

        @Override
        public long c() {
            return this.d0;
        }

        @Override
        public long getSize() {
            return 0L;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SmbQueryFileBasicInfo[createTime=");
            stringBuilder.append(new Date(this.q));
            stringBuilder.append(",lastAccessTime=");
            stringBuilder.append(new Date(this.c0));
            stringBuilder.append(",lastWriteTime=");
            stringBuilder.append(new Date(this.d0));
            stringBuilder.append(",changeTime=");
            stringBuilder.append(new Date(this.e0));
            stringBuilder.append(",attributes=0x");
            stringBuilder.append(d.c(this.f0, 4));
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }

    class b
    implements j {
        long c0;
        int d0;
        boolean e0;
        boolean f0;
        final u0 g0;
        long q;

        b(u0 u02) {
            this.g0 = u02;
        }

        @Override
        public long a() {
            return 0L;
        }

        @Override
        public int b() {
            return 0;
        }

        @Override
        public long c() {
            return 0L;
        }

        @Override
        public long getSize() {
            return this.c0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SmbQueryInfoStandard[allocationSize=");
            stringBuilder.append(this.q);
            stringBuilder.append(",endOfFile=");
            stringBuilder.append(this.c0);
            stringBuilder.append(",numberOfLinks=");
            stringBuilder.append(this.d0);
            stringBuilder.append(",deletePending=");
            stringBuilder.append(this.e0);
            stringBuilder.append(",directory=");
            stringBuilder.append(this.f0);
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }
}

