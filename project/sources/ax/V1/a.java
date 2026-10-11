package ax.V1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.C0987u;
import ax.S0.F;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class a implements t {
    private final G a = new G();
    private final G b = new G();
    private final b c;
    private Inflater d;

    private static final class b {
        private boolean b;
        private boolean c;
        private int[] d;
        private int e;
        private int f;
        private Rect g;
        private final int[] a = new int[4];
        private int h = -1;
        private int i = -1;

        /* renamed from: ax.V1.a$b$a, reason: collision with other inner class name */
        private static final class C0212a {
            public int a;
            public int b;

            private C0212a() {
            }
        }

        private static int b(int[] iArr, int i) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        private static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void d(int[] iArr, G g, int i) {
            while (g.g() < i && g.a() > 0) {
                switch (g.M()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (g(iArr, g)) {
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (e(g)) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (f(g)) {
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (h(g)) {
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean e(G g) {
            if (g.a() < 2 || !this.c) {
                return false;
            }
            int M = g.M();
            int M2 = g.M();
            int[] iArr = this.a;
            iArr[3] = n(iArr[3], M >> 4);
            int[] iArr2 = this.a;
            iArr2[2] = n(iArr2[2], M & 15);
            int[] iArr3 = this.a;
            iArr3[1] = n(iArr3[1], M2 >> 4);
            int[] iArr4 = this.a;
            iArr4[0] = n(iArr4[0], M2 & 15);
            return true;
        }

        private boolean f(G g) {
            if (g.a() < 6) {
                return false;
            }
            int M = g.M();
            int M2 = g.M();
            int i = (M << 4) | (M2 >> 4);
            int M3 = ((M2 & 15) << 8) | g.M();
            int M4 = g.M();
            int M5 = g.M();
            this.g = new Rect(i, (M4 << 4) | (M5 >> 4), M3 + 1, (g.M() | ((M5 & 15) << 8)) + 1);
            return true;
        }

        private boolean g(int[] iArr, G g) {
            if (g.a() < 2) {
                return false;
            }
            int M = g.M();
            int M2 = g.M();
            this.a[3] = b(iArr, M >> 4);
            this.a[2] = b(iArr, M & 15);
            this.a[1] = b(iArr, M2 >> 4);
            this.a[0] = b(iArr, M2 & 15);
            this.c = true;
            return true;
        }

        private boolean h(G g) {
            if (g.a() < 4) {
                return false;
            }
            this.h = g.U();
            this.i = g.U();
            return true;
        }

        private void j(F f, boolean z, Rect rect, int[] iArr) {
            int width = rect.width();
            int height = rect.height();
            int i = !z ? 1 : 0;
            int i2 = i * width;
            C0212a c0212a = new C0212a();
            while (true) {
                int i3 = 0;
                do {
                    k(f, width, c0212a);
                    int min = Math.min(c0212a.b, width - i3);
                    if (min > 0) {
                        int i4 = i2 + min;
                        Arrays.fill(iArr, i2, i4, this.a[c0212a.a]);
                        i3 += min;
                        i2 = i4;
                    }
                } while (i3 < width);
                i += 2;
                if (i >= height) {
                    return;
                }
                i2 = i * width;
                f.c();
            }
        }

        private static void k(F f, int i, C0212a c0212a) {
            int i2 = 0;
            for (int i3 = 1; i2 < i3 && i3 <= 64; i3 <<= 2) {
                if (f.b() < 4) {
                    c0212a.a = -1;
                    c0212a.b = 0;
                    return;
                }
                i2 = (i2 << 4) | f.h(4);
            }
            c0212a.a = i2 & 3;
            if (i2 >= 4) {
                i = i2 >> 2;
            }
            c0212a.b = i;
        }

        private static int n(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public ax.R0.a a(G g) {
            Rect rect;
            if (this.d == null || !this.b || !this.c || (rect = this.g) == null || this.h == -1 || this.i == -1 || rect.width() < 2 || this.g.height() < 2) {
                return null;
            }
            Rect rect2 = this.g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            F f = new F();
            g.b0(this.h);
            f.m(g);
            j(f, true, rect2, iArr);
            g.b0(this.i);
            f.m(g);
            j(f, false, rect2, iArr);
            return new a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.e).l(0).h(rect2.top / this.f, 0).i(0).n(rect2.width() / this.e).g(rect2.height() / this.f).a();
        }

        public void i(String str) {
            for (String str2 : d0.x1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] x1 = d0.x1(str2.substring(9), ",");
                    this.d = new int[x1.length];
                    for (int i = 0; i < x1.length; i++) {
                        this.d[i] = c(x1[i].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] x12 = d0.x1(str2.substring(6).trim(), "x");
                    if (x12.length == 2) {
                        try {
                            this.e = Integer.parseInt(x12[0]);
                            this.f = Integer.parseInt(x12[1]);
                            this.b = true;
                        } catch (RuntimeException e) {
                            C0987u.i("VobsubParser", "Parsing IDX failed", e);
                        }
                    }
                }
            }
        }

        public void l(G g) {
            int[] iArr = this.d;
            if (iArr == null || !this.b) {
                return;
            }
            g.c0(g.U() - 2);
            d(iArr, g, g.U());
        }

        public void m() {
            this.c = false;
            this.g = null;
            this.h = -1;
            this.i = -1;
        }
    }

    public a(List<byte[]> list) {
        b bVar = new b();
        this.c = bVar;
        bVar.i(new String(list.get(0), StandardCharsets.UTF_8));
    }

    private ax.R0.a e() {
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (d0.V0(this.a, this.b, this.d)) {
            this.a.Z(this.b.f(), this.b.j());
        }
        this.c.m();
        int a = this.a.a();
        if (a < 2 || this.a.U() != a) {
            return null;
        }
        this.c.l(this.a);
        return this.c.a(this.a);
    }

    @Override // ax.N1.t
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override // ax.N1.t
    public /* synthetic */ k b(byte[] bArr, int i, int i2) {
        return s.a(this, bArr, i, i2);
    }

    @Override // ax.N1.t
    public void c(byte[] bArr, int i, int i2, t.b bVar, InterfaceC0979l<e> interfaceC0979l) {
        this.a.Z(bArr, i2 + i);
        this.a.b0(i);
        ax.R0.a e = e();
        interfaceC0979l.accept(new e(e != null ? AbstractC2991z.A(e) : AbstractC2991z.z(), -9223372036854775807L, 5000000L));
    }

    @Override // ax.N1.t
    public int d() {
        return 2;
    }
}
