/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.L0;
import ax.Wc.g;
import ax.Wc.v0;
import java.io.IOException;
import java.io.OutputStream;

public class y {
    private OutputStream a;

    y(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static y a(OutputStream outputStream) {
        return new y(outputStream);
    }

    public static y b(OutputStream outputStream, String string) {
        if (string.equals("DER")) {
            return new v0(outputStream);
        }
        if (string.equals("DL")) {
            return new L0(outputStream);
        }
        return new y(outputStream);
    }

    static int f(int n8) {
        if (n8 < 128) {
            return 1;
        }
        int n9 = 2;
        int n10 = n8;
        n8 = n9;
        while ((n10 >>>= 8) != 0) {
            ++n8;
        }
        return n8;
    }

    static int g(boolean bl, int n8) {
        return bl + y.f(n8) + n8;
    }

    static int h(int n8) {
        if (n8 < 31) {
            return 1;
        }
        int n9 = 2;
        while ((n8 >>>= 7) != 0) {
            ++n9;
        }
        return n9;
    }

    void c() throws IOException {
    }

    v0 d() {
        return new v0(this.a);
    }

    L0 e() {
        return new L0(this.a);
    }

    final void i(int n8) throws IOException {
        this.a.write(n8);
    }

    final void j(byte[] byArray, int n8, int n9) throws IOException {
        this.a.write(byArray, n8, n9);
    }

    final void k(int n8) throws IOException {
        if (n8 < 128) {
            this.i(n8);
            return;
        }
        int n9 = 5;
        byte[] byArray = new byte[5];
        while (true) {
            int n10 = n9 - 1;
            byArray[n10] = (byte)n8;
            if ((n8 >>>= 8) == 0) {
                n8 = n9 - 2;
                byArray[n8] = (byte)(5 - n10 | 0x80);
                this.j(byArray, n8, 6 - n10);
                return;
            }
            n9 = n10;
        }
    }

    void l(g[] gArray) throws IOException {
        int n8 = gArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            gArray[i8].g().s(this, true);
        }
    }

    final void m(boolean bl, int n8, byte by) throws IOException {
        this.s(bl, n8);
        this.k(1);
        this.i(by);
    }

    final void n(boolean bl, int n8, byte by, byte[] byArray, int n9, int n10) throws IOException {
        this.s(bl, n8);
        this.k(n10 + 1);
        this.i(by);
        this.j(byArray, n9, n10);
    }

    final void o(boolean bl, int n8, byte[] byArray) throws IOException {
        this.s(bl, n8);
        this.k(byArray.length);
        this.j(byArray, 0, byArray.length);
    }

    final void p(boolean bl, int n8, byte[] byArray, int n9, int n10) throws IOException {
        this.s(bl, n8);
        this.k(n10);
        this.j(byArray, n9, n10);
    }

    final void q(boolean bl, int n8, byte[] byArray, int n9, int n10, byte by) throws IOException {
        this.s(bl, n8);
        this.k(n10 + 1);
        this.j(byArray, n9, n10);
        this.i(by);
    }

    final void r(boolean bl, int n8, g[] gArray) throws IOException {
        this.s(bl, n8);
        this.i(128);
        this.l(gArray);
        this.i(0);
        this.i(0);
    }

    final void s(boolean bl, int n8) throws IOException {
        if (bl) {
            this.i(n8);
        }
    }

    final void t(boolean bl, int n8, int n9) throws IOException {
        if (!bl) {
            return;
        }
        if (n9 < 31) {
            this.i(n8 | n9);
            return;
        }
        byte[] byArray = new byte[6];
        byte by = (byte)(n9 & 0x7F);
        int n10 = 5;
        byArray[5] = by;
        int n11 = n9;
        n9 = n10;
        while (n11 > 127) {
            byArray[--n9] = (byte)((n11 >>>= 7) & 0x7F | 0x80);
        }
        byArray[--n9] = (byte)(0x1F | n8);
        this.j(byArray, n9, 6 - n9);
    }

    void u(A a8, boolean bl) throws IOException {
        a8.s(this, bl);
    }

    void v(A[] aArray) throws IOException {
        int n8 = aArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            aArray[i8].s(this, true);
        }
    }
}

