/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.f;
import ax.nb.g;

class d
extends f {
    d() {
        this.r = new b();
    }

    @Override
    int a(byte[] byArray, int n8) {
        return this.h(byArray, n8);
    }

    @Override
    int g(byte[] byArray, int n8) {
        int n9 = this.e;
        boolean bl = false;
        if (n9 == 0 && this.d == 0) {
            n9 = byArray[n8];
            if ((n9 & 0x80) == 128) {
                bl = true;
            }
            this.b[this.a] = (n8 = ax.nb.f.d(byArray, n8 + 2)) != 0 ? new g(this.r, n8, bl, (n9 & 0x60) >> 5) : null;
            return 6;
        }
        return 0;
    }

    @Override
    int j(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NameQueryResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",addrEntry=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

