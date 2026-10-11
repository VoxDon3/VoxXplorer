/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

class f {
    private final int a;
    private final byte[] b;
    private int c;
    private int d;

    f(int n8) {
        this.a = n8;
        this.b = new byte[n8];
    }

    public boolean a() {
        return this.c != this.d;
    }

    public void b(int n8, int n9) {
        int n10;
        for (n8 = n10 = this.d - n8; n8 < n9 + n10; ++n8) {
            byte[] byArray = this.b;
            int n11 = this.d;
            int n12 = this.a;
            byArray[n11] = byArray[(n8 + n12) % n12];
            this.d = (n11 + 1) % n12;
        }
    }

    public int c() {
        if (this.a()) {
            byte[] byArray = this.b;
            int n8 = this.c;
            byte by = byArray[n8];
            this.c = (n8 + 1) % this.a;
            return by & 0xFF;
        }
        return -1;
    }

    public void d(int n8) {
        byte[] byArray = this.b;
        int n9 = this.d;
        byArray[n9] = (byte)n8;
        this.d = (n9 + 1) % this.a;
    }
}

