/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.vd.d;

public class l
implements d {
    private byte[] a;
    private d b;

    public l(d d8, byte[] byArray) {
        this(d8, byArray, 0, byArray.length);
    }

    public l(d d8, byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[n9];
        this.a = byArray2;
        this.b = d8;
        System.arraycopy(byArray, n8, byArray2, 0, n9);
    }

    public byte[] a() {
        return this.a;
    }

    public d b() {
        return this.b;
    }
}

