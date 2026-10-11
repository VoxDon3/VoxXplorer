/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.vd.d;

public class k
implements d {
    private byte[] a;

    public k(byte[] byArray) {
        this(byArray, 0, byArray.length);
    }

    public k(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[n9];
        this.a = byArray2;
        System.arraycopy(byArray, n8, byArray2, 0, n9);
    }

    public byte[] a() {
        return this.a;
    }
}

