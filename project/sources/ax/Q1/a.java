package ax.Q1;

import android.graphics.Bitmap;
import ax.N1.e;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class a implements t {
    private final G a = new G();
    private final G b = new G();
    private final C0174a c = new C0174a();
    private Inflater d;

    /* renamed from: ax.Q1.a$a, reason: collision with other inner class name */
    private static final class C0174a {
        private final G a = new G();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(G g, int i) {
            int P;
            if (i < 4) {
                return;
            }
            g.c0(3);
            int i2 = i - 4;
            if ((g.M() & 128) != 0) {
                if (i2 < 7 || (P = g.P()) < 4) {
                    return;
                }
                this.h = g.U();
                this.i = g.U();
                this.a.X(P - 4);
                i2 = i - 11;
            }
            int g2 = this.a.g();
            int j = this.a.j();
            if (g2 >= j || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, j - g2);
            g.q(this.a.f(), g2, min);
            this.a.b0(g2 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(G g, int i) {
            if (i < 19) {
                return;
            }
            this.d = g.U();
            this.e = g.U();
            g.c0(11);
            this.f = g.U();
            this.g = g.U();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(G g, int i) {
            if (i % 5 != 2) {
                return;
            }
            g.c0(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int M = g.M();
                int M2 = g.M();
                int M3 = g.M();
                int M4 = g.M();
                double d = M2;
                double d2 = M3 - 128;
                double d3 = M4 - 128;
                this.b[M] = (d0.p((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (g.M() << 24) | (d0.p((int) ((1.402d * d2) + d), 0, 255) << 16) | d0.p((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public ax.R0.a d() {
            int i;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.j() == 0 || this.a.g() != this.a.j() || !this.c) {
                return null;
            }
            this.a.b0(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int M = this.a.M();
                if (M != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.b[M];
                } else {
                    int M2 = this.a.M();
                    if (M2 != 0) {
                        i = ((M2 & 64) == 0 ? M2 & 63 : ((M2 & 63) << 8) | this.a.M()) + i3;
                        Arrays.fill(iArr, i3, i, (M2 & 128) == 0 ? this.b[0] : this.b[this.a.M()]);
                    }
                }
                i3 = i;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).k(this.f / this.d).l(0).h(this.g / this.e, 0).i(0).n(this.h / this.d).g(this.i / this.e).a();
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

    private static ax.R0.a e(G g, C0174a c0174a) {
        int j = g.j();
        int M = g.M();
        int U = g.U();
        int g2 = g.g() + U;
        ax.R0.a aVar = null;
        if (g2 > j) {
            g.b0(j);
            return null;
        }
        if (M != 128) {
            switch (M) {
                case 20:
                    c0174a.g(g, U);
                    break;
                case 21:
                    c0174a.e(g, U);
                    break;
                case 22:
                    c0174a.f(g, U);
                    break;
            }
        } else {
            aVar = c0174a.d();
            c0174a.h();
        }
        g.b0(g2);
        return aVar;
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
        if (this.d == null) {
            this.d = new Inflater();
        }
        if (d0.V0(this.a, this.b, this.d)) {
            this.a.Z(this.b.f(), this.b.j());
        }
        this.c.h();
        ArrayList arrayList = new ArrayList();
        while (this.a.a() >= 3) {
            ax.R0.a e = e(this.a, this.c);
            if (e != null) {
                arrayList.add(e);
            }
        }
        interfaceC0979l.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // ax.N1.t
    public int d() {
        return 2;
    }
}
