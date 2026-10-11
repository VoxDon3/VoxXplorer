/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.a;

public final class W {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public W(byte[] byArray) {
        this.a = byArray;
        this.b = byArray.length;
    }

    private void a() {
        int n8;
        int n9 = this.c;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.b) || n9 == n8 && this.d == 0);
        ax.S0.a.g(bl);
    }

    public int b() {
        return this.c * 8 + this.d;
    }

    public boolean c() {
        boolean bl = ((this.a[this.c] & 0xFF) >> this.d & 1) == 1;
        this.e(1);
        return bl;
    }

    public int d(int n8) {
        int n9 = this.c;
        int n10 = Math.min(n8, 8 - this.d);
        byte[] byArray = this.a;
        int n11 = n9 + 1;
        n9 = (byArray[n9] & 0xFF) >> this.d & 255 >> 8 - n10;
        while (n10 < n8) {
            n9 |= (this.a[n11] & 0xFF) << n10;
            n10 += 8;
            ++n11;
        }
        this.e(n8);
        return n9 & -1 >>> 32 - n8;
    }

    public void e(int n8) {
        int n9;
        int n10 = n8 / 8;
        this.c = n9 = this.c + n10;
        this.d = n8 = this.d + (n8 - n10 * 8);
        if (n8 > 7) {
            this.c = n9 + 1;
            this.d = n8 - 8;
        }
        this.a();
    }
}

