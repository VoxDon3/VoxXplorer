/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.h;
import ax.pb.s;
import ax.qb.d;
import ax.qb.e;

class l
extends Q {
    private int Y0;
    private int Z0;
    String a1;

    l() {
    }

    @Override
    int E(byte[] object, int n8, int n9) {
        int n10;
        this.X0 = new a[this.W0];
        Object var7_4 = null;
        int n11 = n8;
        a a8 = null;
        for (n9 = 0; n9 < (n10 = this.W0); ++n9) {
            h[] hArray = this.X0;
            a8 = new a(this);
            hArray[n9] = a8;
            a8.a = this.o((byte[])object, n11, 16, false);
            a8.b = object[n11 + 16] & 0xFF;
            a8.c = object[n11 + 17] & 0xFF;
            a8.d = s.j(object, n11 + 18);
            n10 = s.j(object, n11 + 22);
            n11 += 26;
            a8.e = this.o((byte[])object, (n10 & 0xFFFF) - this.Y0 + n8, 48, false);
            if (e.c0 < 4) continue;
            s.A0.println(a8);
        }
        object = n10 == 0 ? var7_4 : (Object)a8.a;
        this.a1 = object;
        return n11 - n8;
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        this.V0 = s.i(byArray, n8);
        this.Y0 = s.i(byArray, n8 + 2);
        this.W0 = s.i(byArray, n8 + 4);
        this.Z0 = s.i(byArray, n8 + 6);
        return n8 + 8 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetServerEnum2Response[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",status=");
        stringBuilder.append(this.V0);
        stringBuilder.append(",converter=");
        stringBuilder.append(this.Y0);
        stringBuilder.append(",entriesReturned=");
        stringBuilder.append(this.W0);
        stringBuilder.append(",totalAvailableEntries=");
        stringBuilder.append(this.Z0);
        stringBuilder.append(",lastName=");
        stringBuilder.append(this.a1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    class a
    implements h {
        String a;
        int b;
        int c;
        int d;
        String e;
        final l f;

        a(l l8) {
            this.f = l8;
        }

        @Override
        public int a() {
            if ((this.d & Integer.MIN_VALUE) != 0) {
                return 2;
            }
            return 4;
        }

        @Override
        public int b() {
            return 17;
        }

        @Override
        public long c() {
            return 0L;
        }

        @Override
        public String getName() {
            return this.a;
        }

        @Override
        public long h() {
            return 0L;
        }

        @Override
        public long length() {
            return 0L;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ServerInfo1[name=");
            stringBuilder.append(this.a);
            stringBuilder.append(",versionMajor=");
            stringBuilder.append(this.b);
            stringBuilder.append(",versionMinor=");
            stringBuilder.append(this.c);
            stringBuilder.append(",type=0x");
            stringBuilder.append(ax.qb.d.c(this.d, 8));
            stringBuilder.append(",commentOrMasterBrowser=");
            stringBuilder.append(this.e);
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }
}

