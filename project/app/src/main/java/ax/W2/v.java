/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.os.SystemClock;
import ax.W2.j;
import ax.c3.B;
import ax.c3.K;
import java.util.ArrayList;

public class v {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private long i;
    private long j;
    private long k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private boolean r;
    private int s;
    private int t;
    private a u;
    private boolean v;
    private ArrayList<String> w;
    private ArrayList<String> x;
    private j y;

    public v(j j8) {
        this.y = j8;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.h = 0;
        this.i = 0L;
        this.j = 0L;
        this.l = 0L;
        this.n = false;
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.r = false;
    }

    public String A(Context context) {
        if (this.r()) {
            return "";
        }
        if (this.i == -1L) {
            return String.format("%s", B.i(context, this.z()));
        }
        return String.format("%1$s / %2$s", B.i(context, this.z()), B.i(context, this.O()));
    }

    public long B() {
        if (this.n) {
            long l8 = this.h - this.b;
            long l9 = this.P();
            if (l9 == 0L) {
                return -1L;
            }
            return l8 * 1000L / l9;
        }
        long l10 = this.i;
        long l11 = this.j;
        long l12 = this.P();
        if (l12 == 0L) {
            return -1L;
        }
        return (l10 - l11) / l12;
    }

    public int C() {
        return this.e;
    }

    public long D() {
        return this.k;
    }

    public K E() {
        return this.y.H();
    }

    public String F() {
        return this.y.I();
    }

    public String G() {
        return this.y.J();
    }

    public int H() {
        return this.c;
    }

    public ArrayList<String> I() {
        return this.x;
    }

    public K J() {
        return this.y.K();
    }

    public String K() {
        return this.y.L();
    }

    public String L() {
        return this.y.M();
    }

    public int M() {
        return this.h;
    }

    public long N() {
        return this.i;
    }

    public long O() {
        return this.i - this.k;
    }

    public long P() {
        long l8 = SystemClock.uptimeMillis() - this.p;
        if (l8 <= 0L) {
            return 0L;
        }
        if (this.n) {
            return (long)(this.b * 1000000) / l8;
        }
        return this.j * 1000L / l8;
    }

    public boolean Q() {
        return this.v;
    }

    public boolean R() {
        return this.r;
    }

    public void S(boolean bl) {
        this.v = bl;
    }

    public void T(a a8) {
        this.u = a8;
        this.y.l0(true);
    }

    public void U(long l8) {
        this.l = l8;
    }

    public void V(int n8) {
        this.g = n8;
    }

    public void W(int n8) {
        this.d = n8;
    }

    public void X(boolean bl) {
        this.r = bl;
    }

    public void Y(int n8, int n9) {
        this.s = n8;
        this.t = n9;
    }

    public void Z(boolean bl) {
        this.m = bl;
    }

    public void a(int n8) {
        this.a += n8;
    }

    public void a0(boolean bl) {
        this.n = bl;
    }

    public void b(String string) {
        this.w.add(string);
    }

    public void b0() {
        long l8;
        this.p = l8 = SystemClock.uptimeMillis();
        this.q = l8;
    }

    public void c(b b8, int n8) {
        this.b += n8;
        int n9 = b8.ordinal();
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    return;
                }
                this.e += n8;
                return;
            }
            this.d += n8;
            return;
        }
        this.c += n8;
    }

    public void c0(long l8) {
        this.j = l8;
    }

    public void d(long l8) {
        this.j += l8;
    }

    public void d0(int n8) {
        this.h = n8;
    }

    public void e(long l8) {
        this.k += l8;
    }

    public void e0(long l8) {
        this.i = l8;
    }

    public void f(String string) {
        this.x.add(string);
    }

    public void f0(boolean bl) {
        this.f = bl;
    }

    public void g(int n8) {
        this.h += n8;
    }

    public void h(long l8) {
        this.i += l8;
    }

    public int i() {
        a a8 = this.u;
        if (a8 == ax.W2.v$a.d0) {
            return 2131952344;
        }
        if (a8 == ax.W2.v$a.f0) {
            return 2131952344;
        }
        if (a8 == ax.W2.v$a.e0) {
            return 2131952511;
        }
        boolean bl = a8 != null;
        ax.u3.b.d(bl);
        return 2131952556;
    }

    public int j() {
        if (this.f) {
            return this.a;
        }
        return this.b;
    }

    public int k() {
        if (this.f) {
            return this.g;
        }
        return this.h;
    }

    public long l() {
        return (SystemClock.uptimeMillis() - this.p) / 1000L;
    }

    public ArrayList<String> m() {
        return this.w;
    }

    public int n() {
        return this.d;
    }

    public int o() {
        return this.s;
    }

    public String p() {
        if (this.q() == 0) {
            return "";
        }
        return String.format("%1$d / %2$d", this.o(), this.q());
    }

    public int q() {
        return this.t;
    }

    public boolean r() {
        return this.m;
    }

    public boolean s() {
        return this.n;
    }

    public int t() {
        if (this.n) {
            return this.x();
        }
        long l8 = this.z() + this.D();
        if (this.o) {
            return (int)(l8 / 1024L);
        }
        return (int)l8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int u() {
        if (this.n) {
            return this.M();
        }
        long l8 = this.i;
        if (l8 > 0x100000L) {
            this.o = true;
            l8 /= 1024L;
            return (int)l8;
        }
        this.o = false;
        return (int)l8;
    }

    public String v() {
        return this.y.A();
    }

    public String w() {
        boolean bl = this.n;
        Integer n8 = 0;
        if (bl) {
            if ((long)this.h > 0L) {
                return String.format("%.2f%%", Float.valueOf((float)this.x() / (float)this.M() * 100.0f));
            }
            return String.format("%d%%", n8);
        }
        if (this.i > 0L) {
            return String.format("%.2f%%", Float.valueOf((float)this.z() / (float)this.O() * 100.0f));
        }
        return String.format("%d%%", n8);
    }

    public int x() {
        return this.b;
    }

    public String y() {
        return String.format("%1$d / %2$d", this.j(), this.k());
    }

    public long z() {
        return this.j;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = ax.W2.v$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final b[] e0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = ax.W2.v$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }
    }
}

