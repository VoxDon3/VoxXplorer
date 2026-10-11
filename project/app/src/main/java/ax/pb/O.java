/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b;
import ax.pb.s;

class O
extends b {
    private String F0 = "";
    private String G0 = "";
    private String H0 = "";
    boolean I0;
    byte[] J0 = null;

    O(s s8) {
        super(s8);
    }

    @Override
    int g(byte[] object, int n8) {
        int n9;
        int n10;
        Object object2;
        if (this.s0) {
            object2 = this.J0;
            System.arraycopy(object, n8, object2, 0, ((byte[])object2).length);
            n10 = this.J0.length + n8;
        } else {
            n10 = n8;
        }
        object2 = this.m((byte[])object, n10);
        this.F0 = object2;
        n10 += this.t((String)object2, n10);
        object2 = this.n((byte[])object, n10, n8 + this.p0, 255, this.q0);
        this.G0 = object2;
        n10 = n9 = n10 + this.t((String)object2, n10);
        if (!this.s0) {
            object = this.n((byte[])object, n9, n8 + this.p0, 255, this.q0);
            this.H0 = object;
            n10 = n9 + this.t((String)object, n9);
        }
        return n10 - n8;
    }

    @Override
    int l(byte[] byArray, int n8) {
        int n9;
        int n10 = byArray[n8];
        boolean bl = true;
        if ((n10 & 1) != 1) {
            bl = false;
        }
        this.I0 = bl;
        n10 = n9 = n8 + 2;
        if (this.s0) {
            n9 = s.i(byArray, n9);
            n10 = n8 + 4;
            this.J0 = new byte[n9];
        }
        return n10 - n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComSessionSetupAndXResponse[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",isLoggedInAsGuest=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",nativeOs=");
        stringBuilder.append(this.F0);
        stringBuilder.append(",nativeLanMan=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",primaryDomain=");
        stringBuilder.append(this.H0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

