/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.c;
import ax.Wc.k0;
import ax.Wc.t;

public class k
extends t {
    private c q;

    public k(int n8) {
        this.q = new k0(n8);
    }

    @Override
    public A g() {
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        int n8;
        StringBuilder stringBuilder;
        byte[] byArray = this.q.D();
        if (byArray.length == 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("KeyUsage: 0x");
            n8 = byArray[0] & 0xFF;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("KeyUsage: 0x");
            n8 = byArray[1];
            n8 = byArray[0] & 0xFF | (n8 & 0xFF) << 8;
        }
        stringBuilder.append(Integer.toHexString(n8));
        return stringBuilder.toString();
    }
}

