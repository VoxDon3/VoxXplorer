/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

class F {
    private static F d;
    public long a;
    public long b;
    public int c;

    F() {
    }

    static F b() {
        if (d == null) {
            d = new F();
        }
        return d;
    }

    public void a(long l8, double d8, double d9) {
        long l9;
        float f8 = (float)(l8 - 946728000000L) / 8.64E7f;
        float f9 = 0.01720197f * f8 + 6.24006f;
        double d10 = f9;
        double d11 = Math.sin(d10) * (double)0.0334196f + d10 + Math.sin(2.0f * f9) * 3.4906598739326E-4 + Math.sin(f9 * 3.0f) * (double)5.236E-6f + 1.796593063 + Math.PI;
        d9 = -d9 / 360.0;
        d9 = (double)((float)Math.round((double)(f8 - 9.0E-4f) - d9) + 9.0E-4f) + d9 + Math.sin(d10) * 0.0053 + Math.sin(2.0 * d11) * -0.0069;
        d11 = Math.asin(Math.sin(d11) * Math.sin(0.4092797040939331));
        d8 = 0.01745329238474369 * d8;
        d8 = (Math.sin(-0.10471975803375244) - Math.sin(d8) * Math.sin(d11)) / (Math.cos(d8) * Math.cos(d11));
        if (d8 >= 1.0) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        if (d8 <= -1.0) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        d8 = (float)(Math.acos(d8) / (Math.PI * 2));
        this.a = Math.round((d9 + d8) * 8.64E7) + 946728000000L;
        this.b = l9 = Math.round((d9 - d8) * 8.64E7) + 946728000000L;
        if (l9 < l8 && this.a > l8) {
            this.c = 0;
            return;
        }
        this.c = 1;
    }
}

