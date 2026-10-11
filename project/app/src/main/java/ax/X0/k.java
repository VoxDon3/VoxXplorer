/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import ax.P0.E;
import ax.S0.G;

final class k {
    private static final int[] j = new int[]{3, 3, 3, 3, 2, 2, 3};
    private static final int[] k = new int[]{1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    private int g;
    private int h;
    private boolean i;

    public k() {
        this.h();
    }

    private static int a(int n8) {
        if (n8 >= 128 && n8 <= 255) {
            if (n8 >= 240) {
                return k[n8 & 0xF];
            }
            return j[n8 >> 4 & 7];
        }
        return 0;
    }

    private static int g(G g8) {
        int n8;
        int n9;
        int n10 = 0;
        int n11 = 0;
        do {
            int n12 = g8.M();
            n8 = n10 << 7 | n12 & 0x7F;
            n9 = n11 + 1;
            if ((n12 & 0x80) == 0) break;
            n10 = n8;
            n11 = n9;
        } while (n9 <= 4);
        return n8;
    }

    public boolean b() {
        return this.d == 255;
    }

    public boolean c() {
        int n8 = this.d;
        return n8 != 255 && n8 != 240;
    }

    public boolean d() {
        int n8 = this.d >>> 4;
        return this.c() && (n8 == 8 || n8 == 9);
    }

    public boolean e() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean f(G object, int n8) throws E {
        this.h();
        int n9 = ((G)object).g();
        int n10 = ((G)object).a();
        int n11 = 0;
        if (n10 < 2) {
            return false;
        }
        this.f = ax.X0.k.g((G)object);
        this.a = ((G)object).g() - n9;
        n10 = ((G)object).M();
        this.c = 1;
        if (n10 == 240) {
            this.d = n10;
            while (((G)object).M() != 247) {
            }
        } else if (n10 == 255) {
            n8 = ((G)object).M();
            n11 = ax.X0.k.g((G)object);
            this.d = n10;
            if (n8 == 47) {
                ((G)object).b0(n9);
                this.h();
                return false;
            }
            if (n8 != 81) {
                ((G)object).c0(n11);
            } else {
                long l8;
                this.e = l8 = (long)((G)object).P();
                if (l8 <= 0L) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Tempo event data value must be a non-zero positive value. Parsed value: ");
                    ((StringBuilder)object).append(this.e);
                    throw E.d(((StringBuilder)object).toString());
                }
                ((G)object).c0(n11 - 3);
            }
        } else {
            if (n10 < 128) {
                n11 = 1;
            }
            if (n11 != 0) {
                if (n8 == Integer.MIN_VALUE) {
                    throw E.a("Running status in the first event.", null);
                }
                this.g = n10;
                this.c = 1 + 1;
            } else {
                n8 = n10;
            }
            n10 = ax.X0.k.a(n8);
            if (n11 == 0 && n10 > this.c) {
                this.g = ((G)object).M();
                ++this.c;
            }
            if (n10 > this.c) {
                this.h = ((G)object).M();
                ++this.c;
            }
            this.d = n8;
        }
        this.b = ((G)object).g() - n9;
        ((G)object).b0(n9);
        this.i = true;
        return true;
    }

    public void h() {
        this.i = false;
        this.a = -1;
        this.d = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.f = -1L;
        this.b = -1;
        this.c = -1;
        this.e = -9223372036854775807L;
    }

    public void i(byte[] byArray) {
        byArray[0] = (byte)this.d;
        byArray[1] = (byte)this.g;
        byArray[2] = (byte)this.h;
    }
}

