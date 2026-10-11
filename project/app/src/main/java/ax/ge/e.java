/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

import ax.be.c;
import ax.be.i;
import java.io.DataInputStream;
import java.io.IOException;

public final class e {
    private final byte[] a;
    private final int b;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    public e(int n8, byte[] byArray, c object) {
        this.b = n8;
        object = ((c)object).a(n8, false);
        this.a = (byte[])object;
        if (byArray != null) {
            this.d = n8 = Math.min(byArray.length, n8);
            this.e = n8;
            this.c = n8;
            System.arraycopy(byArray, byArray.length - n8, object, 0, n8);
        }
    }

    public void a(DataInputStream dataInputStream, int n8) throws IOException {
        n8 = Math.min(this.b - this.d, n8);
        dataInputStream.readFully(this.a, this.d, n8);
        this.d = n8 = this.d + n8;
        if (this.e < n8) {
            this.e = n8;
        }
    }

    public int b(byte[] byArray, int n8) {
        int n9 = this.d;
        int n10 = this.c;
        int n11 = n9 - n10;
        if (n9 == this.b) {
            this.d = 0;
        }
        System.arraycopy(this.a, n10, byArray, n8, n11);
        this.c = this.d;
        return n11;
    }

    public int c(int n8) {
        int n9;
        int n10 = this.d;
        int n11 = n9 = n10 - n8 - 1;
        if (n8 >= n10) {
            n11 = n9 + this.b;
        }
        return this.a[n11] & 0xFF;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.g > 0;
    }

    public boolean f() {
        return this.d < this.f;
    }

    public void g(c c8) {
        c8.d(this.a);
    }

    public void h(byte by) {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.d;
        this.d = n8 = n9 + 1;
        byArray[n9] = by;
        if (this.e < n8) {
            this.e = n8;
        }
    }

    public void i(int n8, int n9) throws IOException {
        block5: {
            block7: {
                byte[] byArray;
                int n10;
                int n11;
                block6: {
                    if (n8 < 0 || n8 >= this.e) break block5;
                    n11 = Math.min(this.f - this.d, n9);
                    this.g = n9 - n11;
                    this.h = n8;
                    n10 = this.d - n8 - 1;
                    n8 = n11;
                    n9 = n10;
                    if (n10 >= 0) break block6;
                    n9 = this.b;
                    n8 = n10 + n9;
                    n9 = Math.min(n9 - n8, n11);
                    byArray = this.a;
                    System.arraycopy(byArray, n8, byArray, this.d, n9);
                    this.d += n9;
                    n8 = n11 - n9;
                    if (n8 == 0) break block7;
                    n9 = 0;
                }
                do {
                    n11 = Math.min(n8, this.d - n9);
                    byArray = this.a;
                    System.arraycopy(byArray, n9, byArray, this.d, n11);
                    this.d = n10 = this.d + n11;
                    n8 = n11 = n8 - n11;
                } while (n11 > 0);
                if (this.e < n10) {
                    this.e = n10;
                }
            }
            return;
        }
        throw new i();
    }

    public void j() throws IOException {
        int n8 = this.g;
        if (n8 > 0) {
            this.i(this.h, n8);
        }
    }

    public void k() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.a[this.b - 1] = 0;
    }

    public void l(int n8) {
        int n9 = this.b;
        int n10 = this.d;
        if (n9 - n10 <= n8) {
            this.f = n9;
            return;
        }
        this.f = n10 + n8;
    }
}

