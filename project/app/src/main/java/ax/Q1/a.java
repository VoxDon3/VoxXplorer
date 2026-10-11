/*
 * Decompiled with CFR 0.152.
 */
package ax.Q1;

import android.graphics.Bitmap;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

public final class a
implements t {
    private final G a = new G();
    private final G b = new G();
    private final a c = new a();
    private Inflater d;

    private static ax.R0.a e(G g8, a object) {
        int n8 = g8.j();
        int n9 = g8.M();
        int n10 = g8.U();
        int n11 = g8.g() + n10;
        ax.R0.a a8 = null;
        if (n11 > n8) {
            g8.b0(n8);
            return null;
        }
        if (n9 != 128) {
            switch (n9) {
                default: {
                    object = a8;
                    break;
                }
                case 22: {
                    ((a)object).f(g8, n10);
                    object = a8;
                    break;
                }
                case 21: {
                    ((a)object).e(g8, n10);
                    object = a8;
                    break;
                }
                case 20: {
                    ((a)object).g(g8, n10);
                    object = a8;
                    break;
                }
            }
        } else {
            a8 = ((a)object).d();
            ((a)object).h();
            object = a8;
        }
        g8.b0(n11);
        return object;
    }

    @Override
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override
    public /* synthetic */ k b(byte[] byArray, int n8, int n9) {
        return s.a(this, byArray, n8, n9);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b object2, l<e> l8) {
        this.a.Z((byte[])object, n9 + n8);
        this.a.b0(n8);
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (d0.V0(this.a, this.b, this.d)) {
            this.a.Z(this.b.f(), this.b.j());
        }
        this.c.h();
        object = new ArrayList();
        while (this.a.a() >= 3) {
            object2 = ax.Q1.a.e(this.a, this.c);
            if (object2 == null) continue;
            ((ArrayList)object).add(object2);
        }
        l8.accept(new e((List<ax.R0.a>)object, -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }

    private static final class a {
        private final G a = new G();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        private void e(G g8, int n8) {
            block4: {
                int n9;
                int n10;
                block5: {
                    int n11;
                    if (n8 < 4) break block4;
                    g8.c0(3);
                    n10 = (g8.M() & 0x80) != 0 ? 1 : 0;
                    n9 = n11 = n8 - 4;
                    if (n10 == 0) break block5;
                    if (n11 < 7 || (n9 = g8.P()) < 4) break block4;
                    this.h = g8.U();
                    this.i = g8.U();
                    this.a.X(n9 - 4);
                    n9 = n8 - 11;
                }
                if ((n8 = this.a.g()) < (n10 = this.a.j()) && n9 > 0) {
                    n9 = Math.min(n9, n10 - n8);
                    g8.q(this.a.f(), n8, n9);
                    this.a.b0(n8 + n9);
                }
            }
        }

        private void f(G g8, int n8) {
            if (n8 < 19) {
                return;
            }
            this.d = g8.U();
            this.e = g8.U();
            g8.c0(11);
            this.f = g8.U();
            this.g = g8.U();
        }

        private void g(G g8, int n8) {
            if (n8 % 5 != 2) {
                return;
            }
            g8.c0(2);
            Arrays.fill(this.b, 0);
            int n9 = n8 / 5;
            for (n8 = 0; n8 < n9; ++n8) {
                int n10 = g8.M();
                int n11 = g8.M();
                int n12 = g8.M();
                int n13 = g8.M();
                int n14 = g8.M();
                double d8 = n11;
                double d9 = n12 - 128;
                n11 = (int)(1.402 * d9 + d8);
                double d10 = n13 - 128;
                n13 = (int)(d8 - 0.34414 * d10 - d9 * 0.71414);
                n12 = (int)(d8 + d10 * 1.772);
                int[] nArray = this.b;
                n11 = d0.p(n11, 0, 255);
                nArray[n10] = d0.p(n13, 0, 255) << 8 | (n14 << 24 | n11 << 16) | d0.p(n12, 0, 255);
            }
            this.c = true;
        }

        public ax.R0.a d() {
            if (this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0 && this.a.j() != 0 && this.a.g() == this.a.j() && this.c) {
                this.a.b0(0);
                int n8 = this.h * this.i;
                Object object = new int[n8];
                int n9 = 0;
                while (n9 < n8) {
                    int n10;
                    int n11 = this.a.M();
                    if (n11 != 0) {
                        n10 = n9 + 1;
                        object[n9] = this.b[n11];
                        n9 = n10;
                        continue;
                    }
                    n11 = this.a.M();
                    if (n11 == 0) continue;
                    n10 = (n11 & 0x40) == 0 ? n11 & 0x3F : (n11 & 0x3F) << 8 | this.a.M();
                    n11 = (n11 & 0x80) == 0 ? this.b[0] : this.b[this.a.M()];
                    Arrays.fill(object, n9, n10 += n9, n11);
                    n9 = n10;
                }
                object = Bitmap.createBitmap((int[])object, (int)this.h, (int)this.i, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                return new a.b().f((Bitmap)object).k((float)this.f / (float)this.d).l(0).h((float)this.g / (float)this.e, 0).i(0).n((float)this.h / (float)this.d).g((float)this.i / (float)this.e).a();
            }
            return null;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.X(0);
            this.c = false;
        }
    }
}

