package ax.O1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ax.N1.k;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.m.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends e {
    private final int i;
    private final int j;
    private final int k;
    private final long l;
    private List<ax.R0.a> o;
    private List<ax.R0.a> p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private byte u;
    private byte v;
    private boolean x;
    private long y;
    private static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, ax.L.c.d3, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, j.L0, 92, 94, 95, j.K0, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final G h = new G();
    private final ArrayList<C0157a> m = new ArrayList<>();
    private C0157a n = new C0157a(0, 4);
    private int w = 0;

    /* renamed from: ax.O1.a$a, reason: collision with other inner class name */
    private static final class C0157a {
        private final List<C0158a> a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        /* renamed from: ax.O1.a$a$a, reason: collision with other inner class name */
        private static class C0158a {
            public final int a;
            public final boolean b;
            public int c;

            public C0158a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public C0157a(int i, int i2) {
            j(i);
            this.h = i2;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.a.size()) {
                C0158a c0158a = this.a.get(i);
                boolean z2 = c0158a.b;
                int i7 = c0158a.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = a.B[i7];
                    }
                    z = z3;
                }
                int i8 = c0158a.c;
                i++;
                if (i8 != (i < this.a.size() ? this.a.get(i).c : length)) {
                    if (i2 != -1 && !z2) {
                        q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                q(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void e(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0158a c0158a = this.a.get(size);
                    int i = c0158a.c;
                    if (i != length) {
                        return;
                    }
                    c0158a.c = i - 1;
                }
            }
        }

        public ax.R0.a g(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.b.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            return new a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i5, 1).k(f).l(i).a();
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int i) {
            this.g = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void l(int i) {
            this.g = i;
        }

        public void m(int i) {
            this.h = i;
        }

        public void p(int i, boolean z) {
            this.a.add(new C0158a(i, z, this.c.length()));
        }
    }

    public a(String str, int i, long j) {
        if (j != -9223372036854775807L) {
            C0968a.a(j >= 16000);
            this.l = j * 1000;
        } else {
            this.l = -9223372036854775807L;
        }
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            C0987u.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        P(0);
        O();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    private void A(byte b) {
        if (b == 32) {
            P(2);
            return;
        }
        if (b == 41) {
            P(3);
            return;
        }
        switch (b) {
            case 37:
                P(1);
                Q(2);
                break;
            case 38:
                P(1);
                Q(3);
                break;
            case 39:
                P(1);
                Q(4);
                break;
            default:
                int i = this.q;
                if (i != 0) {
                    if (b == 33) {
                        this.n.f();
                        break;
                    } else {
                        switch (b) {
                            case 44:
                                this.o = Collections.EMPTY_LIST;
                                if (i == 1 || i == 3) {
                                    O();
                                    break;
                                }
                            case 45:
                                if (i == 1 && !this.n.i()) {
                                    this.n.k();
                                    break;
                                }
                                break;
                            case 46:
                                O();
                                break;
                            case 47:
                                this.o = u();
                                O();
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void B(byte b, byte b2) {
        int i = z[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.n.d) {
            if (this.q != 1 && !this.n.i()) {
                C0157a c0157a = new C0157a(this.q, this.r);
                this.n = c0157a;
                this.m.add(c0157a);
            }
            this.n.d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        boolean z3 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.n.p(z2 ? 8 : i2, z3);
        if (z2) {
            this.n.e = A[i2];
        }
    }

    private static boolean C(byte b) {
        return (b & 224) == 0;
    }

    private static boolean D(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean E(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean F(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean G(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean H(byte b) {
        return (b & 240) == 16;
    }

    private boolean I(boolean z2, byte b, byte b2) {
        if (!z2 || !H(b)) {
            this.t = false;
        } else {
            if (this.t && this.u == b && this.v == b2) {
                this.t = false;
                return true;
            }
            this.t = true;
            this.u = b;
            this.v = b2;
        }
        return false;
    }

    private static boolean J(byte b) {
        return (b & 246) == 20;
    }

    private static boolean K(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean L(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean M(byte b) {
        return 1 <= b && b <= 15;
    }

    private void N(byte b, byte b2) {
        if (M(b)) {
            this.x = false;
            return;
        }
        if (J(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.x = false;
                                break;
                        }
                        return;
                }
            }
            this.x = true;
        }
    }

    private void O() {
        this.n.j(this.q);
        this.m.clear();
        this.m.add(this.n);
    }

    private void P(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.m.size(); i3++) {
                this.m.get(i3).l(i);
            }
            return;
        }
        O();
        if (i2 == 3 || i == 1 || i == 0) {
            this.o = Collections.EMPTY_LIST;
        }
    }

    private void Q(int i) {
        this.r = i;
        this.n.m(i);
    }

    private boolean R() {
        return (this.l == -9223372036854775807L || this.y == -9223372036854775807L || m() - this.y < this.l) ? false : true;
    }

    private boolean S(byte b) {
        if (C(b)) {
            this.w = t(b);
        }
        return this.w == this.k;
    }

    private static char s(byte b) {
        return (char) C[(b & Byte.MAX_VALUE) - 32];
    }

    private static int t(byte b) {
        return (b >> 3) & 1;
    }

    private List<ax.R0.a> u() {
        int size = this.m.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            ax.R0.a g = this.m.get(i2).g(Integer.MIN_VALUE);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            ax.R0.a aVar = (ax.R0.a) arrayList.get(i3);
            if (aVar != null) {
                if (aVar.i != i) {
                    aVar = (ax.R0.a) C0968a.e(this.m.get(i3).g(i));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char v(byte b) {
        return (char) E[b & 31];
    }

    private static char w(byte b) {
        return (char) F[b & 31];
    }

    private static char x(byte b, byte b2) {
        return (b & 1) == 0 ? v(b2) : w(b2);
    }

    private static char y(byte b) {
        return (char) D[b & 15];
    }

    private void z(byte b) {
        this.n.e(' ');
        this.n.p((b >> 1) & 7, (b & 1) == 1);
    }

    @Override // ax.O1.e, ax.N1.l
    public /* bridge */ /* synthetic */ void e(long j) {
        super.e(j);
    }

    @Override // ax.O1.e, ax.V0.g
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        P(0);
        Q(4);
        O();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // ax.V0.g
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // ax.O1.e
    protected k h() {
        List<ax.R0.a> list = this.o;
        this.p = list;
        return new f((List) C0968a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // ax.O1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void i(ax.N1.p r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.O1.a.i(ax.N1.p):void");
    }

    @Override // ax.O1.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ p f() throws m {
        return super.f();
    }

    @Override // ax.O1.e, ax.V0.g
    /* renamed from: k */
    public q a() throws m {
        q l;
        q a = super.a();
        if (a != null) {
            return a;
        }
        if (!R() || (l = l()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        l.C(m(), h(), Long.MAX_VALUE);
        return l;
    }

    @Override // ax.O1.e
    protected boolean n() {
        return this.o != this.p;
    }

    @Override // ax.O1.e
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void g(p pVar) throws m {
        super.g(pVar);
    }

    @Override // ax.O1.e, ax.V0.g
    public void d() {
    }
}
