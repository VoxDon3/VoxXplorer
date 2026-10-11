/*
 * Decompiled with CFR 0.152.
 */
package ax.g9;

import ax.d9.d;
import ax.d9.e;
import ax.d9.f;

public class a
implements d {
    private e a;
    private byte[] b = new byte[64];
    private byte[] c = new byte[64];

    public a(e e8) {
        this.a = e8;
    }

    @Override
    public void a(byte[] byArray) throws f {
        if (byArray != null) {
            int n8 = Math.min(byArray.length, 64);
            int n9 = 0;
            while (true) {
                if (n9 >= n8) break;
                this.b[n9] = (byte)(0x36 ^ byArray[n9]);
                this.c[n9] = (byte)(0x5C ^ byArray[n9]);
                ++n9;
            }
            for (int i8 = n8; i8 < 64; ++i8) {
                this.b[i8] = 54;
                this.c[i8] = 92;
            }
            this.c();
            return;
        }
        throw new f("Missing key data");
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        this.a.b(byArray, n8, n9);
    }

    public void c() {
        this.a.a();
        e e8 = this.a;
        byte[] byArray = this.b;
        e8.b(byArray, 0, byArray.length);
    }

    @Override
    public void d(byte by) {
        this.a.d(by);
    }

    @Override
    public void f(byte[] byArray) {
        this.a.f(byArray);
    }

    @Override
    public byte[] g() {
        try {
            byte[] byArray = this.a.c();
            this.a.f(this.c);
            this.a.f(byArray);
            byArray = this.a.c();
            return byArray;
        }
        finally {
            this.c();
        }
    }
}

