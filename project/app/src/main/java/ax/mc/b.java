/*
 * Decompiled with CFR 0.152.
 */
package ax.mc;

import ax.mc.a;
import ax.mc.c;
import ax.mc.d;
import ax.tc.e;

public class b {
    private c a;
    private d b;

    public b(c c8) {
        this(c8, null);
    }

    public b(c c8, d d8) {
        this.a = c8;
        this.b = d8;
    }

    private byte[] b(d object, byte[] byArray, int n8, int n9) {
        byte[] byArray2 = byArray;
        if (byArray == null) {
            byArray2 = new byte[]{};
        }
        int n10 = object.c();
        int n11 = this.e(n9, n10);
        byArray = new byte[n11 * n10];
        int n12 = 0;
        for (int i8 = 1; i8 <= n11; ++i8) {
            this.c(byArray, n12, (d)object, byArray2, n8, i8);
            n12 += n10;
        }
        if (n9 - (n11 - 1) * n10 < n10) {
            object = new byte[n9];
            System.arraycopy(byArray, 0, object, 0, n9);
            return object;
        }
        return byArray;
    }

    private void c(byte[] byArray, int n8, d d8, byte[] byArray2, int n9, int n10) {
        int n11 = d8.c();
        byte[] byArray3 = new byte[n11];
        byte[] byArray4 = new byte[byArray2.length + 4];
        System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length);
        this.a(byArray4, byArray2.length, n10);
        byArray2 = byArray4;
        for (n10 = 0; n10 < n9; ++n10) {
            byArray2 = d8.b(byArray2);
            this.g(byArray3, byArray2);
        }
        System.arraycopy(byArray3, 0, byArray, n8, n11);
    }

    private void d(byte[] byArray) {
        if (this.b == null) {
            this.b = new a(this.a.a());
        }
        this.b.a(byArray);
    }

    private int e(int n8, int n9) {
        int n10 = n8 % n9 > 0 ? 1 : 0;
        return n8 / n9 + n10;
    }

    private void g(byte[] byArray, byte[] byArray2) {
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byArray[i8] = (byte)(byArray[i8] ^ byArray2[i8]);
        }
    }

    protected void a(byte[] byArray, int n8, int n9) {
        byArray[n8] = (byte)(n9 / 0x1000000);
        byArray[n8 + 1] = (byte)(n9 / 65536);
        byArray[n8 + 2] = (byte)(n9 / 256);
        byArray[n8 + 3] = (byte)n9;
    }

    public byte[] f(char[] cArray, int n8, boolean bl) {
        cArray.getClass();
        this.d(e.a(cArray, bl));
        int n9 = n8;
        if (n8 == 0) {
            n9 = this.b.c();
        }
        return this.b(this.b, this.a.c(), this.a.b(), n9);
    }
}

