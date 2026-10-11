/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.h;
import ax.pb.j0;
import ax.pb.s;
import ax.qb.e;

class n
extends Q {
    private int Y0;
    private int Z0;

    n() {
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        this.q0 = false;
        this.X0 = new j0[this.W0];
        int n10 = n8;
        for (n9 = 0; n9 < this.W0; ++n9) {
            h[] hArray = this.X0;
            j0 j02 = new j0();
            hArray[n9] = j02;
            j02.a = this.o(byArray, n10, 13, false);
            j02.b = s.i(byArray, n10 + 14);
            int n11 = s.j(byArray, n10 + 16);
            n10 += 20;
            j02.c = this.o(byArray, (n11 & 0xFFFF) - this.Y0 + n8, 128, false);
            if (e.c0 < 4) continue;
            s.A0.println(j02);
        }
        return n10 - n8;
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
        stringBuilder.append("NetShareEnumResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",status=");
        stringBuilder.append(this.V0);
        stringBuilder.append(",converter=");
        stringBuilder.append(this.Y0);
        stringBuilder.append(",entriesReturned=");
        stringBuilder.append(this.W0);
        stringBuilder.append(",totalAvailableEntries=");
        stringBuilder.append(this.Z0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

