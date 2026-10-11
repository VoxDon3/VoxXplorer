/*
 * Decompiled with CFR 0.152.
 */
package ax.G9;

public class a {
    private int[] a = new int[16];
    private int[] b = new int[16];
    private int c = 16384;
    private int d = 16383;

    private void b(int n8, int n9) {
        if (n9 >= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected message of at least ");
        stringBuilder.append(n8);
        stringBuilder.append(" bytes but got ");
        stringBuilder.append(n9);
        stringBuilder.append(" bytes.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void d(int n8) {
        int n9 = this.a[n8];
        if ((this.c & n9) == 0) {
            this.m(n8, n9, this.b[n8]);
            return;
        }
        this.e(n8, n9 & this.d, this.b[n8]);
    }

    public void a(int n8, int n9) {
        throw null;
    }

    public void c(int n8, int n9, int n10) {
        throw null;
    }

    public void e(int n8, int n9, int n10) {
    }

    public void f(int n8, int n9, int n10) {
        throw null;
    }

    public void g(int n8, int n9, int n10) {
        throw null;
    }

    public void h(byte[] byArray, int n8, int n9) {
        this.b(1, n9);
        int n10 = byArray[n8];
        int n11 = n10 & 0xF0;
        n10 &= 0xF;
        if (n11 != 128) {
            if (n11 != 144) {
                if (n11 != 160) {
                    if (n11 != 176) {
                        if (n11 != 192) {
                            if (n11 != 208) {
                                if (n11 != 224) {
                                    return;
                                }
                                this.b(3, n9);
                                this.i(n10, (byArray[n8 + 2] << 7) + byArray[n8 + 1]);
                                return;
                            }
                            this.b(2, n9);
                            this.a(n10, byArray[n8 + 1]);
                            return;
                        }
                        this.b(2, n9);
                        this.k(n10, byArray[n8 + 1]);
                        return;
                    }
                    this.b(3, n9);
                    this.l(n10, byArray[n8 + 1], byArray[n8 + 2]);
                    return;
                }
                this.b(3, n9);
                this.j(n10, byArray[n8 + 1], byArray[n8 + 2]);
                return;
            }
            this.b(3, n9);
            n9 = byArray[n8 + 2];
            if (n9 == 0) {
                this.f(n10, byArray[n8 + 1], n9);
                return;
            }
            this.g(n10, byArray[n8 + 1], n9);
            return;
        }
        this.b(3, n9);
        this.f(n10, byArray[n8 + 1], byArray[n8 + 2]);
    }

    public void i(int n8, int n9) {
        throw null;
    }

    public void j(int n8, int n9, int n10) {
    }

    public void k(int n8, int n9) {
        throw null;
    }

    public void l(int n8, int n9, int n10) {
        if (n9 != 6) {
            if (n9 != 38) {
                switch (n9) {
                    default: {
                        this.c(n8, n9, n10);
                        return;
                    }
                    case 101: {
                        this.a[n8] = n10 << 7;
                        return;
                    }
                    case 100: {
                        int[] nArray = this.a;
                        nArray[n8] = n10 | nArray[n8] & 0xFFFFFF80;
                        return;
                    }
                    case 99: {
                        this.a[n8] = n10 << 7 | this.c;
                        return;
                    }
                    case 98: 
                }
                int[] nArray = this.a;
                n9 = nArray[n8];
                nArray[n8] = n10 | this.c | n9 & 0xFFFFFF80;
                return;
            }
            int[] nArray = this.b;
            nArray[n8] = n10 | nArray[n8] & 0xFFFFFF80;
            this.d(n8);
            return;
        }
        this.b[n8] = n10 << 7;
        this.d(n8);
    }

    public void m(int n8, int n9, int n10) {
        throw null;
    }
}

