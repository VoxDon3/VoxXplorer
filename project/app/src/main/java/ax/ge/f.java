/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

import ax.ge.a;
import ax.ge.c;
import ax.ge.g;
import java.io.IOException;
import java.io.OutputStream;

public abstract class f {
    private final int a;
    private final int b;
    final int c;
    final int d;
    final byte[] e;
    final int f;
    int g = -1;
    private int h = -1;
    private boolean i = false;
    private int j = 0;
    private int k = 0;

    f(int n8, int n9, int n10, int n11, int n12, ax.be.c c8) {
        int n13;
        this.f = n13 = ax.ge.f.d(n8, n9, n10, n12);
        this.e = c8.a(n13, false);
        this.a = n9 + n8;
        this.b = n10 + n12;
        this.c = n12;
        this.d = n11;
    }

    private static int d(int n8, int n9, int n10, int n11) {
        return n9 + n8 + (n10 + n11) + Math.min(n8 / 2 + 262144, 0x20000000);
    }

    public static f g(int n8, int n9, int n10, int n11, int n12, int n13, int n14, ax.be.c c8) {
        if (n13 != 4) {
            if (n13 == 20) {
                return new a(n8, n9, n10, n11, n12, n14, c8);
            }
            throw new IllegalArgumentException();
        }
        return new c(n8, n9, n10, n11, n12, n14, c8);
    }

    private void o() {
        int n8 = this.g + 1 - this.a & 0xFFFFFFF0;
        int n9 = this.j;
        byte[] byArray = this.e;
        System.arraycopy(byArray, n8, byArray, 0, n9 - n8);
        this.g -= n8;
        this.h -= n8;
        this.j -= n8;
    }

    static void p(int[] nArray, int n8, int n9) {
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = nArray[i8];
            nArray[i8] = n10 <= n9 ? 0 : n10 - n9;
        }
    }

    private void q() {
        int n8;
        int n9 = this.k;
        if (n9 > 0 && (n8 = this.g) < this.h) {
            this.g = n8 - n9;
            this.k = 0;
            this.v(n9);
        }
    }

    public void a(OutputStream outputStream, int n8, int n9) throws IOException {
        outputStream.write(this.e, this.g + 1 - n8, n9);
    }

    public int b(byte[] byArray, int n8, int n9) {
        if (this.g >= this.f - this.b) {
            this.o();
        }
        int n10 = this.f;
        int n11 = this.j;
        int n12 = n9;
        if (n9 > n10 - n11) {
            n12 = n10 - n11;
        }
        System.arraycopy(byArray, n8, this.e, n11, n12);
        this.j = n8 = this.j + n12;
        n9 = this.b;
        if (n8 >= n9) {
            this.h = n8 - n9;
        }
        this.q();
        return n12;
    }

    public int c() {
        return this.j - this.g;
    }

    public int e(int n8) {
        return this.e[this.g - n8] & 0xFF;
    }

    public int f(int n8, int n9) {
        return this.e[this.g + n8 - n9] & 0xFF;
    }

    public int h(int n8, int n9) {
        byte[] byArray;
        int n10;
        int n11 = this.g;
        for (n10 = 0; n10 < n9 && (byArray = this.e)[this.g + n10] == byArray[n11 - n8 - 1 + n10]; ++n10) {
        }
        return n10;
    }

    public int i(int n8, int n9, int n10) {
        byte[] byArray;
        int n11 = this.g + n8;
        for (n8 = 0; n8 < n10 && (byArray = this.e)[n11 + n8] == byArray[n11 - n9 - 1 + n8]; ++n8) {
        }
        return n8;
    }

    public abstract g j();

    public int k() {
        return this.g;
    }

    public boolean l(int n8) {
        return this.g - n8 < this.h;
    }

    public boolean m() {
        return this.g != -1;
    }

    int n(int n8, int n9) {
        int n10;
        this.g = n10 = this.g + 1;
        if (!((n10 = this.j - n10) >= n8 || n10 >= n9 && this.i)) {
            ++this.k;
            return 0;
        }
        return n10;
    }

    public void r(ax.be.c c8) {
        c8.d(this.e);
    }

    public void s() {
        this.h = this.j - 1;
        this.i = true;
        this.q();
    }

    public void t() {
        this.h = this.j - 1;
        this.q();
    }

    public void u(int n8, byte[] byArray) {
        if (byArray != null) {
            n8 = Math.min(byArray.length, n8);
            System.arraycopy(byArray, byArray.length - n8, this.e, 0, n8);
            this.j += n8;
            this.v(n8);
        }
    }

    public abstract void v(int var1);
}

