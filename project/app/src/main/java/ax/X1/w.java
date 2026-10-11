/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.a;
import java.util.Arrays;

public final class w {
    private final int a;
    private boolean b;
    private boolean c;
    public byte[] d;
    public int e;

    public w(int n8, int n9) {
        this.a = n8;
        byte[] byArray = new byte[n9 + 3];
        this.d = byArray;
        byArray[2] = 1;
    }

    public void a(byte[] byArray, int n8, int n9) {
        if (!this.b) {
            return;
        }
        byte[] byArray2 = this.d;
        int n10 = byArray2.length;
        int n11 = this.e;
        if (n10 < n11 + (n9 -= n8)) {
            this.d = Arrays.copyOf(byArray2, (n11 + n9) * 2);
        }
        System.arraycopy(byArray, n8, this.d, this.e, n9);
        this.e += n9;
    }

    public boolean b(int n8) {
        if (!this.b) {
            return false;
        }
        this.e -= n8;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int n8) {
        boolean bl = this.b;
        boolean bl2 = true;
        ax.S0.a.g(bl ^ true);
        if (n8 != this.a) {
            bl2 = false;
        }
        this.b = bl2;
        if (bl2) {
            this.e = 3;
            this.c = false;
        }
    }
}

