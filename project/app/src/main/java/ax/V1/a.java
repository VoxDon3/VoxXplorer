/*
 * Decompiled with CFR 0.152.
 */
package ax.V1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import ax.S0.u;
import ax.r7.z;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

public final class a
implements t {
    private final G a = new G();
    private final G b = new G();
    private final b c;
    private Inflater d;

    public a(List<byte[]> list) {
        b b8;
        this.c = b8 = new b();
        b8.i(new String(list.get(0), StandardCharsets.UTF_8));
    }

    private ax.R0.a e() {
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (d0.V0(this.a, this.b, this.d)) {
            this.a.Z(this.b.f(), this.b.j());
        }
        this.c.m();
        int n8 = this.a.a();
        if (n8 >= 2 && this.a.U() == n8) {
            this.c.l(this.a);
            return this.c.a(this.a);
        }
        return null;
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
    public void c(byte[] object, int n8, int n9, t.b b8, l<e> l8) {
        this.a.Z((byte[])object, n9 + n8);
        this.a.b0(n8);
        object = this.e();
        object = object != null ? (Object)z.A(object) : (Object)z.z();
        l8.accept(new e((List<ax.R0.a>)object, -9223372036854775807L, 5000000L));
    }

    @Override
    public int d() {
        return 2;
    }

    private static final class b {
        private final int[] a = new int[4];
        private boolean b;
        private boolean c;
        private int[] d;
        private int e;
        private int f;
        private Rect g;
        private int h = -1;
        private int i = -1;

        private static int b(int[] nArray, int n8) {
            if (n8 >= 0 && n8 < nArray.length) {
                return nArray[n8];
            }
            return nArray[0];
        }

        private static int c(String string) {
            try {
                int n8 = Integer.parseInt(string, 16);
                return n8;
            }
            catch (RuntimeException runtimeException) {
                return 0;
            }
        }

        private void d(int[] nArray, G g8, int n8) {
            block7: while (g8.g() < n8 && g8.a() > 0) {
                switch (g8.M()) {
                    case 0: 
                    case 1: 
                    case 2: {
                        continue block7;
                    }
                    default: {
                        break block7;
                    }
                    case 6: {
                        if (this.h(g8)) continue block7;
                        break block7;
                    }
                    case 5: {
                        if (this.f(g8)) continue block7;
                        break block7;
                    }
                    case 4: {
                        if (this.e(g8)) continue block7;
                        break block7;
                    }
                    case 3: {
                        if (this.g(nArray, g8)) continue block7;
                    }
                }
            }
        }

        private boolean e(G object) {
            if (((G)object).a() >= 2 && this.c) {
                int n8 = ((G)object).M();
                int n9 = ((G)object).M();
                object = this.a;
                object[3] = ax.V1.a$b.n((int)object[3], n8 >> 4);
                object = this.a;
                object[2] = ax.V1.a$b.n((int)object[2], n8 & 0xF);
                object = this.a;
                object[1] = ax.V1.a$b.n((int)object[1], n9 >> 4);
                object = this.a;
                object[0] = ax.V1.a$b.n((int)object[0], n9 & 0xF);
                return true;
            }
            return false;
        }

        private boolean f(G g8) {
            if (g8.a() < 6) {
                return false;
            }
            int n8 = g8.M();
            int n9 = g8.M();
            int n10 = g8.M();
            int n11 = g8.M();
            int n12 = g8.M();
            this.g = new Rect(n8 << 4 | n9 >> 4, n11 << 4 | n12 >> 4, ((n9 & 0xF) << 8 | n10) + 1, (g8.M() | (n12 & 0xF) << 8) + 1);
            return true;
        }

        private boolean g(int[] nArray, G g8) {
            if (g8.a() < 2) {
                return false;
            }
            int n8 = g8.M();
            int n9 = g8.M();
            this.a[3] = ax.V1.a$b.b(nArray, n8 >> 4);
            this.a[2] = ax.V1.a$b.b(nArray, n8 & 0xF);
            this.a[1] = ax.V1.a$b.b(nArray, n9 >> 4);
            this.a[0] = ax.V1.a$b.b(nArray, n9 & 0xF);
            this.c = true;
            return true;
        }

        private boolean h(G g8) {
            if (g8.a() < 4) {
                return false;
            }
            this.h = g8.U();
            this.i = g8.U();
            return true;
        }

        private void j(F f8, boolean bl, Rect object, int[] nArray) {
            int n8 = object.width();
            int n9 = object.height();
            int n10 = bl ^ 1;
            int n11 = n10 * n8;
            object = new a();
            while (true) {
                int n12;
                int n13 = 0;
                do {
                    ax.V1.a$b.k(f8, n8, (a)object);
                    int n14 = Math.min(object.b, n8 - n13);
                    int n15 = n11;
                    n12 = n13;
                    if (n14 > 0) {
                        n15 = n11 + n14;
                        Arrays.fill(nArray, n11, n15, this.a[object.a]);
                        n12 = n13 + n14;
                    }
                    n11 = n15;
                    n13 = n12;
                } while (n12 < n8);
                if ((n10 += 2) >= n9) {
                    return;
                }
                n11 = n10 * n8;
                f8.c();
            }
        }

        private static void k(F f8, int n8, a a8) {
            int n9 = 0;
            for (int i8 = 1; n9 < i8 && i8 <= 64; i8 <<= 2) {
                if (f8.b() < 4) {
                    a8.a = -1;
                    a8.b = 0;
                    return;
                }
                n9 = n9 << 4 | f8.h(4);
            }
            a8.a = n9 & 3;
            if (n9 >= 4) {
                n8 = n9 >> 2;
            }
            a8.b = n8;
        }

        private static int n(int n8, int n9) {
            return n8 & 0xFFFFFF | n9 * 17 << 24;
        }

        public ax.R0.a a(G g8) {
            Rect rect;
            if (this.d != null && this.b && this.c && (rect = this.g) != null && this.h != -1 && this.i != -1 && rect.width() >= 2 && this.g.height() >= 2) {
                rect = this.g;
                int[] nArray = new int[rect.width() * rect.height()];
                F f8 = new F();
                g8.b0(this.h);
                f8.m(g8);
                this.j(f8, true, rect, nArray);
                g8.b0(this.i);
                f8.m(g8);
                this.j(f8, false, rect, nArray);
                g8 = Bitmap.createBitmap((int[])nArray, (int)rect.width(), (int)rect.height(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                return new a.b().f((Bitmap)g8).k((float)rect.left / (float)this.e).l(0).h((float)rect.top / (float)this.f, 0).i(0).n((float)rect.width() / (float)this.e).g((float)rect.height() / (float)this.f).a();
            }
            return null;
        }

        public void i(String stringArray) {
            for (String runtimeException : d0.x1(stringArray.trim(), "\\r?\\n")) {
                String[] stringArray2;
                if (runtimeException.startsWith("palette: ")) {
                    String[] stringArray3 = d0.x1(runtimeException.substring(9), ",");
                    this.d = new int[stringArray3.length];
                    for (int i8 = 0; i8 < stringArray3.length; ++i8) {
                        this.d[i8] = ax.V1.a$b.c(stringArray3[i8].trim());
                    }
                    continue;
                }
                if (!runtimeException.startsWith("size: ") || (stringArray2 = d0.x1(runtimeException.substring(6).trim(), "x")).length != 2) continue;
                try {
                    this.e = Integer.parseInt(stringArray2[0]);
                    this.f = Integer.parseInt(stringArray2[1]);
                    this.b = true;
                }
                catch (RuntimeException runtimeException2) {
                    u.i("VobsubParser", "Parsing IDX failed", runtimeException2);
                }
            }
        }

        public void l(G g8) {
            int[] nArray = this.d;
            if (nArray != null && this.b) {
                g8.c0(g8.U() - 2);
                this.d(nArray, g8, g8.U());
            }
        }

        public void m() {
            this.c = false;
            this.g = null;
            this.h = -1;
            this.i = -1;
        }

        private static final class a {
            public int a;
            public int b;

            private a() {
            }
        }
    }
}

