/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.s;

class q0
extends Q {
    int Y0;
    int Z0;
    int a1;
    a[] b1;

    q0() {
        this.R0 = (byte)16;
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        int n10;
        this.Y0 = n10 = s.i(byArray, n8);
        if ((this.j0 & 0x8000) != 0) {
            this.Y0 = n10 / 2;
        }
        this.Z0 = s.i(byArray, n8 + 2);
        this.a1 = s.i(byArray, n8 + 4);
        int n11 = n8 + 8;
        this.b1 = new a[this.Z0];
        for (n10 = 0; n10 < this.Z0; ++n10) {
            this.b1[n10] = new a(this);
            n11 += this.b1[n10].a(byArray, n11, n9);
        }
        return n11 - n8;
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trans2GetDfsReferralResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",pathConsumed=");
        stringBuilder.append(this.Y0);
        stringBuilder.append(",numReferrals=");
        stringBuilder.append(this.Z0);
        stringBuilder.append(",flags=");
        stringBuilder.append(this.a1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

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
        String k;
        String l;
        final q0 m;

        a(q0 q02) {
            this.m = q02;
            this.k = null;
            this.l = null;
        }

        int a(byte[] object, int n8, int n9) {
            int n10;
            this.a = n10 = s.i((byte[])object, n8);
            boolean bl = true;
            boolean bl2 = true;
            if (n10 != 3 && n10 != 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Version ");
                ((StringBuilder)object).append(this.a);
                ((StringBuilder)object).append(" referral not supported. Please report this to jcifs at samba dot org.");
                throw new RuntimeException(((StringBuilder)object).toString());
            }
            this.b = s.i((byte[])object, n8 + 2);
            this.c = s.i((byte[])object, n8 + 4);
            this.d = s.i((byte[])object, n8 + 6);
            n10 = n8 + 8;
            int n11 = this.a;
            if (n11 == 3) {
                this.e = s.i((byte[])object, n10);
                this.j = s.i((byte[])object, n8 + 10);
                this.f = s.i((byte[])object, n8 + 12);
                this.g = s.i((byte[])object, n8 + 14);
                this.h = s.i((byte[])object, n8 + 16);
                q0 q02 = this.m;
                n10 = this.f;
                bl = (q02.j0 & 0x8000) != 0;
                this.k = q02.o((byte[])object, n10 + n8, n9, bl);
                n10 = this.h;
                if (n10 > 0) {
                    q02 = this.m;
                    bl = (q02.j0 & 0x8000) != 0 ? bl2 : false;
                    this.l = q02.o((byte[])object, n8 + n10, n9, bl);
                }
            } else if (n11 == 1) {
                q0 q03 = this.m;
                if ((q03.j0 & 0x8000) == 0) {
                    bl = false;
                }
                this.l = q03.o((byte[])object, n10, n9, bl);
            }
            return this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Referral[version=");
            stringBuilder.append(this.a);
            stringBuilder.append(",size=");
            stringBuilder.append(this.b);
            stringBuilder.append(",serverType=");
            stringBuilder.append(this.c);
            stringBuilder.append(",flags=");
            stringBuilder.append(this.d);
            stringBuilder.append(",proximity=");
            stringBuilder.append(this.e);
            stringBuilder.append(",ttl=");
            stringBuilder.append(this.j);
            stringBuilder.append(",pathOffset=");
            stringBuilder.append(this.f);
            stringBuilder.append(",altPathOffset=");
            stringBuilder.append(this.g);
            stringBuilder.append(",nodeOffset=");
            stringBuilder.append(this.h);
            stringBuilder.append(",path=");
            stringBuilder.append(this.k);
            stringBuilder.append(",altPath=");
            stringBuilder.append(this.i);
            stringBuilder.append(",node=");
            stringBuilder.append(this.l);
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }
}

