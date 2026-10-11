package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ax.X1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154o implements InterfaceC1152m {
    private static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final O a;
    private final String b;
    private final ax.S0.G c;
    private final w f;
    private b g;
    private long h;
    private String i;
    private U j;
    private boolean k;
    private final boolean[] d = new boolean[4];
    private final a e = new a(128);
    private long l = -9223372036854775807L;

    /* renamed from: ax.X1.o$a */
    private static final class a {
        private static final byte[] f = {0, 0, 1};
        private boolean a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c;
                if (length < i4 + i3) {
                    this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean b(int i, int i2) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            C0987u.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i > 31) {
                        C0987u.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.b = 3;
                    }
                } else if (i != 181) {
                    C0987u.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.b = 2;
                }
            } else if (i == 176) {
                this.b = 1;
                this.a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    /* renamed from: ax.X1.o$b */
    private static final class b {
        private final U a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(U u) {
            this.a = u;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = i3 + (i2 - i);
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
        }

        public void b(long j, int i, boolean z) {
            C0968a.g(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.a.f(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void c(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    C1154o(O o, String str) {
        this.a = o;
        this.b = str;
        if (o != null) {
            this.f = new w(178, 128);
            this.c = new ax.S0.G();
        } else {
            this.f = null;
            this.c = null;
        }
    }

    private static C0912v a(a aVar, int i, String str, String str2) {
        byte[] copyOf = Arrays.copyOf(aVar.e, aVar.c);
        ax.S0.F f = new ax.S0.F(copyOf);
        f.s(i);
        f.s(4);
        f.q();
        f.r(8);
        if (f.g()) {
            f.r(4);
            f.r(3);
        }
        int h = f.h(4);
        float f2 = 1.0f;
        if (h == 15) {
            int h2 = f.h(8);
            int h3 = f.h(8);
            if (h3 == 0) {
                C0987u.h("H263Reader", "Invalid aspect ratio");
            } else {
                f2 = h2 / h3;
            }
        } else {
            float[] fArr = m;
            if (h < fArr.length) {
                f2 = fArr[h];
            } else {
                C0987u.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (f.g()) {
            f.r(2);
            f.r(1);
            if (f.g()) {
                f.r(15);
                f.q();
                f.r(15);
                f.q();
                f.r(15);
                f.q();
                f.r(3);
                f.r(11);
                f.q();
                f.r(15);
                f.q();
            }
        }
        if (f.h(2) != 0) {
            C0987u.h("H263Reader", "Unhandled video object layer shape");
        }
        f.q();
        int h4 = f.h(16);
        f.q();
        if (f.g()) {
            if (h4 == 0) {
                C0987u.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                f.r(i2);
            }
        }
        f.q();
        int h5 = f.h(13);
        f.q();
        int h6 = f.h(13);
        f.q();
        f.q();
        return new C0912v.b().j0(str).W(str2).y0("video/mp4v-es").F0(h5).h0(h6).u0(f2).k0(Collections.singletonList(copyOf)).P();
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        ax.T0.h.c(this.d);
        this.e.c();
        b bVar = this.g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f;
        if (wVar != null) {
            wVar.d();
        }
        this.h = 0L;
        this.l = -9223372036854775807L;
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        C0968a.i(this.g);
        C0968a.i(this.j);
        int g2 = g.g();
        int j = g.j();
        byte[] f = g.f();
        this.h += g.a();
        this.j.g(g, g.a());
        while (true) {
            int e = ax.T0.h.e(f, g2, j, this.d);
            if (e == j) {
                break;
            }
            int i = e + 3;
            int i2 = g.f()[i] & 255;
            int i3 = e - g2;
            int i4 = 0;
            if (!this.k) {
                if (i3 > 0) {
                    this.e.a(f, g2, e);
                }
                if (this.e.b(i2, i3 < 0 ? -i3 : 0)) {
                    U u = this.j;
                    a aVar = this.e;
                    u.e(a(aVar, aVar.d, (String) C0968a.e(this.i), this.b));
                    this.k = true;
                }
            }
            this.g.a(f, g2, e);
            w wVar = this.f;
            if (wVar != null) {
                if (i3 > 0) {
                    wVar.a(f, g2, e);
                } else {
                    i4 = -i3;
                }
                if (this.f.b(i4)) {
                    w wVar2 = this.f;
                    ((ax.S0.G) d0.i(this.c)).Z(this.f.d, ax.T0.h.L(wVar2.d, wVar2.e));
                    ((O) d0.i(this.a)).b(this.l, this.c);
                }
                if (i2 == 178 && g.f()[e + 2] == 1) {
                    this.f.e(i2);
                }
            }
            int i5 = j - e;
            this.g.b(this.h - i5, i5, this.k);
            this.g.c(i2, this.l);
            g2 = i;
        }
        if (!this.k) {
            this.e.a(f, g2, j);
        }
        this.g.a(f, g2, j);
        w wVar3 = this.f;
        if (wVar3 != null) {
            wVar3.a(f, g2, j);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.i = dVar.b();
        U u = interfaceC2859t.u(dVar.c(), 2);
        this.j = u;
        this.g = new b(u);
        O o = this.a;
        if (o != null) {
            o.c(interfaceC2859t, dVar);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        C0968a.i(this.g);
        if (z) {
            this.g.b(this.h, 0, this.k);
            this.g.d();
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.l = j;
    }
}
