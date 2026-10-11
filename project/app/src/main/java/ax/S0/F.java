/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import java.nio.charset.Charset;

public final class F {
    public byte[] a;
    private int b;
    private int c;
    private int d;

    public F() {
        this.a = d0.f;
    }

    public F(byte[] byArray) {
        this(byArray, byArray.length);
    }

    public F(byte[] byArray, int n8) {
        this.a = byArray;
        this.d = n8;
    }

    private void a() {
        int n8;
        int n9 = this.b;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.d) || n9 == n8 && this.c == 0);
        ax.S0.a.g(bl);
    }

    public int b() {
        return (this.d - this.b) * 8 - this.c;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        ++this.b;
        this.a();
    }

    public int d() {
        boolean bl = this.c == 0;
        ax.S0.a.g(bl);
        return this.b;
    }

    public int e() {
        return this.b * 8 + this.c;
    }

    public void f(int n8, int n9) {
        byte by;
        int n10 = n8;
        if (n9 < 32) {
            n10 = n8 & (1 << n9) - 1;
        }
        int n11 = Math.min(8 - this.c, n9);
        int n12 = this.c;
        int n13 = 8 - n12 - n11;
        byte[] byArray = this.a;
        n8 = this.b;
        byArray[n8] = by = (byte)((65280 >> n12 | (1 << n13) - 1) & byArray[n8]);
        n11 = n9 - n11;
        byArray[n8] = (byte)(by | n10 >>> n11 << n13);
        ++n8;
        while (n11 > 8) {
            this.a[n8] = (byte)(n10 >>> n11 - 8);
            n11 -= 8;
            ++n8;
        }
        n13 = 8 - n11;
        byArray = this.a;
        byArray[n8] = by = (byte)(byArray[n8] & (1 << n13) - 1);
        byArray[n8] = (byte)((n10 & (1 << n11) - 1) << n13 | by);
        this.r(n9);
        this.a();
    }

    public boolean g() {
        boolean bl = (this.a[this.b] & 128 >> this.c) != 0;
        this.q();
        return bl;
    }

    public int h(int n8) {
        byte[] byArray;
        int n9;
        int n10;
        if (n8 == 0) {
            return 0;
        }
        this.c += n8;
        int n11 = 0;
        while ((n10 = this.c) > 8) {
            this.c = n9 = n10 - 8;
            byArray = this.a;
            n10 = this.b;
            this.b = n10 + 1;
            n11 |= (byArray[n10] & 0xFF) << n9;
        }
        byArray = this.a;
        n9 = this.b;
        byte by = byArray[n9];
        if (n10 == 8) {
            this.c = 0;
            this.b = n9 + 1;
        }
        this.a();
        return -1 >>> 32 - n8 & (n11 | (by & 0xFF) >> 8 - n10);
    }

    public void i(byte[] byArray, int n8, int n9) {
        byte by;
        int n10;
        int n11;
        int n12;
        byte[] byArray2;
        int n13 = (n9 >> 3) + n8;
        while (n8 < n13) {
            byArray2 = this.a;
            n12 = this.b;
            this.b = n11 = n12 + 1;
            n12 = byArray2[n12];
            n10 = this.c;
            byArray[n8] = by = (byte)(n12 << n10);
            byArray[n8] = (byte)((0xFF & byArray2[n11]) >> 8 - n10 | by);
            ++n8;
        }
        n8 = n9 & 7;
        if (n8 == 0) {
            return;
        }
        byArray[n13] = by = (byte)(byArray[n13] & 255 >> n8);
        n11 = this.c;
        if (n11 + n8 > 8) {
            byArray2 = this.a;
            n9 = this.b;
            this.b = n9 + 1;
            byArray[n13] = (byte)(by | (byArray2[n9] & 0xFF) << n11);
            this.c = n11 - 8;
        }
        this.c = n9 = this.c + n8;
        byArray2 = this.a;
        n12 = this.b;
        n11 = byArray2[n12];
        n10 = byArray[n13];
        byArray[n13] = (byte)((byte)((0xFF & n11) >> 8 - n9 << 8 - n8) | n10);
        if (n9 == 8) {
            this.c = 0;
            this.b = n12 + 1;
        }
        this.a();
    }

    public long j(int n8) {
        if (n8 <= 32) {
            return d0.D1(this.h(n8));
        }
        return d0.C1(this.h(n8 - 32), this.h(32));
    }

    public void k(byte[] byArray, int n8, int n9) {
        boolean bl = this.c == 0;
        ax.S0.a.g(bl);
        System.arraycopy(this.a, this.b, byArray, n8, n9);
        this.b += n9;
        this.a();
    }

    public String l(int n8, Charset charset) {
        byte[] byArray = new byte[n8];
        this.k(byArray, 0, n8);
        return new String(byArray, charset);
    }

    public void m(G g8) {
        this.o(g8.f(), g8.j());
        this.p(g8.g() * 8);
    }

    public void n(byte[] byArray) {
        this.o(byArray, byArray.length);
    }

    public void o(byte[] byArray, int n8) {
        this.a = byArray;
        this.b = 0;
        this.c = 0;
        this.d = n8;
    }

    public void p(int n8) {
        int n9;
        this.b = n9 = n8 / 8;
        this.c = n8 - n9 * 8;
        this.a();
    }

    public void q() {
        int n8;
        this.c = n8 = this.c + 1;
        if (n8 == 8) {
            this.c = 0;
            ++this.b;
        }
        this.a();
    }

    public void r(int n8) {
        int n9;
        int n10 = n8 / 8;
        this.b = n9 = this.b + n10;
        this.c = n8 = this.c + (n8 - n10 * 8);
        if (n8 > 7) {
            this.b = n9 + 1;
            this.c = n8 - 8;
        }
        this.a();
    }

    public void s(int n8) {
        boolean bl = this.c == 0;
        ax.S0.a.g(bl);
        this.b += n8;
        this.a();
    }
}

