/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

public class g {
    byte[] a;
    int b;
    int c;

    public g(byte[] byArray) {
        this.a(byArray, 0, byArray.length);
    }

    public void a(byte[] byArray, int n8, int n9) {
        int n10;
        this.a = new byte[256];
        this.b = 0;
        while ((n10 = this.b) < 256) {
            this.a[n10] = (byte)n10;
            this.b = n10 + 1;
        }
        this.c = 0;
        this.b = 0;
        while ((n10 = this.b) < 256) {
            int n11 = this.c;
            byte by = byArray[n10 % n9 + n8];
            byte[] byArray2 = this.a;
            byte by2 = byArray2[n10];
            this.c = n11 = n11 + by + by2 & 0xFF;
            byArray2[n10] = byArray2[n11];
            byArray2[n11] = by2;
            this.b = n10 + 1;
        }
        this.c = 0;
        this.b = 0;
    }

    public void b(byte[] byArray, int n8, int n9, byte[] byArray2, int n10) {
        int n11 = n10;
        for (n10 = n8; n10 < n9 + n8; ++n10) {
            int n12;
            this.b = n12 = this.b + 1 & 0xFF;
            int n13 = this.c;
            byte[] byArray3 = this.a;
            byte by = byArray3[n12];
            this.c = n13 = n13 + by & 0xFF;
            byArray3[n12] = byArray3[n13];
            byArray3[n13] = by;
            byArray2[n11] = (byte)(byArray[n10] ^ byArray3[byArray3[n12] + by & 0xFF]);
            ++n11;
        }
    }
}

