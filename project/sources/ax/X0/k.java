package ax.X0;

import ax.P0.E;
import ax.S0.G;

/* loaded from: classes.dex */
final class k {
    private static final int[] j = {3, 3, 3, 3, 2, 2, 3};
    private static final int[] k = {1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
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
        h();
    }

    private static int a(int i) {
        if (i < 128 || i > 255) {
            return 0;
        }
        return i >= 240 ? k[i & 15] : j[(i >> 4) & 7];
    }

    private static int g(G g) {
        int i = 0;
        int i2 = 0;
        do {
            int M = g.M();
            i = (i << 7) | (M & 127);
            i2++;
            if ((M & 128) == 0) {
                break;
            }
        } while (i2 <= 4);
        return i;
    }

    public boolean b() {
        return this.d == 255;
    }

    public boolean c() {
        int i = this.d;
        return (i == 255 || i == 240) ? false : true;
    }

    public boolean d() {
        int i = this.d >>> 4;
        if (c()) {
            return i == 8 || i == 9;
        }
        return false;
    }

    public boolean e() {
        return this.i;
    }

    public boolean f(G g, int i) throws E {
        h();
        int g2 = g.g();
        if (g.a() < 2) {
            return false;
        }
        this.f = g(g);
        this.a = g.g() - g2;
        int M = g.M();
        this.c = 1;
        if (M == 240) {
            this.d = M;
            while (g.M() != 247) {
            }
        } else if (M == 255) {
            int M2 = g.M();
            int g3 = g(g);
            this.d = M;
            if (M2 == 47) {
                g.b0(g2);
                h();
                return false;
            }
            if (M2 != 81) {
                g.c0(g3);
            } else {
                long P = g.P();
                this.e = P;
                if (P <= 0) {
                    throw E.d("Tempo event data value must be a non-zero positive value. Parsed value: " + this.e);
                }
                g.c0(g3 - 3);
            }
        } else {
            boolean z = M < 128;
            if (!z) {
                i = M;
            } else {
                if (i == Integer.MIN_VALUE) {
                    throw E.a("Running status in the first event.", null);
                }
                this.g = M;
                this.c = 1 + 1;
            }
            int a = a(i);
            if (!z && a > this.c) {
                this.g = g.M();
                this.c++;
            }
            if (a > this.c) {
                this.h = g.M();
                this.c++;
            }
            this.d = i;
        }
        this.b = g.g() - g2;
        g.b0(g2);
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

    public void i(byte[] bArr) {
        bArr[0] = (byte) this.d;
        bArr[1] = (byte) this.g;
        bArr[2] = (byte) this.h;
    }
}
