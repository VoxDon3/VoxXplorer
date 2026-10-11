package ax.O1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ax.N1.k;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.O1.c;
import ax.R0.a;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.S0.C0987u;
import ax.S0.F;
import ax.S0.G;
import ax.m.j;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends e {
    private final G h = new G();
    private final F i = new F();
    private int j = -1;
    private final boolean k;
    private final int l;
    private final b[] m;
    private b n;
    private List<ax.R0.a> o;
    private List<ax.R0.a> p;
    private C0159c q;
    private int r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private static final Comparator<a> c = new Comparator() { // from class: ax.O1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((c.a) obj2).b, ((c.a) obj).b);
                return compare;
            }
        };
        public final ax.R0.a a;
        public final int b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            a.b n = new a.b().o(charSequence).p(alignment).h(f, i).i(i2).k(f2).l(i3).n(f3);
            if (z) {
                n.s(i4);
            }
            this.a = n.a();
            this.b = i5;
        }
    }

    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        public static final int v = h(2, 2, 2, 0);
        public static final int w;
        public static final int x;
        private static final int[] y;
        private static final int[] z;
        private final List<SpannableString> a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;

        static {
            int h = h(0, 0, 0, 0);
            w = h;
            int h2 = h(0, 0, 0, 3);
            x = h2;
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{h, h2, h, h, h2, h, h};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{h, h, h, h, h, h2, h2};
        }

        public b() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                ax.S0.C0968a.c(r4, r0, r1)
                ax.S0.C0968a.c(r5, r0, r1)
                ax.S0.C0968a.c(r6, r0, r1)
                ax.S0.C0968a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r1) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r1) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r1) goto L32
                r0 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.O1.c.b.h(int, int, int, int):int");
        }

        public void a(char c) {
            if (c != '\n') {
                this.b.append(c);
                return;
            }
            this.a.add(d());
            this.b.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (this.a.size() < this.j && this.a.size() < 15) {
                    this.u = this.a.size();
                    return;
                }
                this.a.remove(0);
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.O1.c.a c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.O1.c.b.c():ax.O1.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
        }

        public void f(boolean z2, int i, boolean z3, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.c = true;
            this.d = z2;
            this.e = i;
            this.f = z3;
            this.g = i2;
            this.h = i3;
            this.i = i5;
            int i8 = i4 + 1;
            if (this.j != i8) {
                this.j = i8;
                while (true) {
                    if (this.a.size() < this.j && this.a.size() < 15) {
                        break;
                    } else {
                        this.a.remove(0);
                    }
                }
            }
            if (i6 != 0 && this.l != i6) {
                this.l = i6;
                int i9 = i6 - 1;
                q(C[i9], x, B[i9], 0, z[i9], A[i9], y[i9]);
            }
            if (i7 == 0 || this.m == i7) {
                return;
            }
            this.m = i7;
            int i10 = i7 - 1;
            m(0, 1, 1, false, false, E[i10], D[i10]);
            n(v, F[i10], w);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            if (i()) {
                return this.a.isEmpty() && this.b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            int i = w;
            this.n = i;
            this.r = v;
            this.t = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.o != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.o, this.b.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = this.b.length();
            }
            if (this.p == -1) {
                if (z3) {
                    this.p = this.b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.p, this.b.length(), 33);
                this.p = -1;
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.q != -1 && this.r != i) {
                this.b.setSpan(new ForegroundColorSpan(this.r), this.q, this.b.length(), 33);
            }
            if (i != v) {
                this.q = this.b.length();
                this.r = i;
            }
            if (this.s != -1 && this.t != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.t), this.s, this.b.length(), 33);
            }
            if (i2 != w) {
                this.s = this.b.length();
                this.t = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.u != i) {
                a('\n');
            }
            this.u = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.n = i;
            this.k = i6;
        }
    }

    /* renamed from: ax.O1.c$c, reason: collision with other inner class name */
    private static final class C0159c {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public C0159c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public c(int i, List<byte[]> list) {
        this.l = i == -1 ? 1 : i;
        this.k = list != null && C0976i.A(list);
        this.m = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.m[i2] = new b();
        }
        this.n = this.m[0];
    }

    private void A(int i) {
        if (i == 32) {
            this.n.a(' ');
            return;
        }
        if (i == 33) {
            this.n.a((char) 160);
            return;
        }
        if (i == 37) {
            this.n.a((char) 8230);
            return;
        }
        if (i == 42) {
            this.n.a((char) 352);
            return;
        }
        if (i == 44) {
            this.n.a((char) 338);
            return;
        }
        if (i == 63) {
            this.n.a((char) 376);
            return;
        }
        if (i == 57) {
            this.n.a((char) 8482);
            return;
        }
        if (i == 58) {
            this.n.a((char) 353);
            return;
        }
        if (i == 60) {
            this.n.a((char) 339);
            return;
        }
        if (i == 61) {
            this.n.a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.n.a((char) 9608);
                break;
            case 49:
                this.n.a((char) 8216);
                break;
            case 50:
                this.n.a((char) 8217);
                break;
            case 51:
                this.n.a((char) 8220);
                break;
            case 52:
                this.n.a((char) 8221);
                break;
            case 53:
                this.n.a((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.n.a((char) 8539);
                        break;
                    case 119:
                        this.n.a((char) 8540);
                        break;
                    case 120:
                        this.n.a((char) 8541);
                        break;
                    case 121:
                        this.n.a((char) 8542);
                        break;
                    case 122:
                        this.n.a((char) 9474);
                        break;
                    case 123:
                        this.n.a((char) 9488);
                        break;
                    case j.K0 /* 124 */:
                        this.n.a((char) 9492);
                        break;
                    case j.L0 /* 125 */:
                        this.n.a((char) 9472);
                        break;
                    case 126:
                        this.n.a((char) 9496);
                        break;
                    case 127:
                        this.n.a((char) 9484);
                        break;
                    default:
                        C0987u.h("Cea708Decoder", "Invalid G2 character: " + i);
                        break;
                }
        }
    }

    private void B(int i) {
        if (i == 160) {
            this.n.a((char) 13252);
            return;
        }
        C0987u.h("Cea708Decoder", "Invalid G3 character: " + i);
        this.n.a('_');
    }

    private void C() {
        this.n.m(this.i.h(4), this.i.h(2), this.i.h(2), this.i.g(), this.i.g(), this.i.h(3), this.i.h(3));
    }

    private void D() {
        int h = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        int h2 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        this.i.r(2);
        this.n.n(h, h2, b.g(this.i.h(2), this.i.h(2), this.i.h(2)));
    }

    private void E() {
        this.i.r(4);
        int h = this.i.h(4);
        this.i.r(2);
        this.n.o(h, this.i.h(6));
    }

    private void F() {
        int h = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        int h2 = this.i.h(2);
        int g = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        if (this.i.g()) {
            h2 |= 4;
        }
        boolean g2 = this.i.g();
        int h3 = this.i.h(2);
        int h4 = this.i.h(2);
        int h5 = this.i.h(2);
        this.i.r(8);
        this.n.q(h, g, g2, h2, h3, h4, h5);
    }

    private void G() {
        C0159c c0159c = this.q;
        if (c0159c.d != (c0159c.b * 2) - 1) {
            C0987u.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.q.b * 2) - 1) + ", but current index is " + this.q.d + " (sequence number " + this.q.a + ");");
        }
        F f = this.i;
        C0159c c0159c2 = this.q;
        f.o(c0159c2.c, c0159c2.d);
        boolean z = false;
        while (true) {
            if (this.i.b() <= 0) {
                break;
            }
            int h = this.i.h(3);
            int h2 = this.i.h(5);
            if (h == 7) {
                this.i.r(2);
                h = this.i.h(6);
                if (h < 7) {
                    C0987u.h("Cea708Decoder", "Invalid extended service number: " + h);
                }
            }
            if (h2 == 0) {
                if (h != 0) {
                    C0987u.h("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
                }
            } else if (h != this.l) {
                this.i.s(h2);
            } else {
                int e = this.i.e() + (h2 * 8);
                while (this.i.e() < e) {
                    int h3 = this.i.h(8);
                    if (h3 == 16) {
                        int h4 = this.i.h(8);
                        if (h4 <= 31) {
                            v(h4);
                        } else {
                            if (h4 <= 127) {
                                A(h4);
                            } else if (h4 <= 159) {
                                w(h4);
                            } else if (h4 <= 255) {
                                B(h4);
                            } else {
                                C0987u.h("Cea708Decoder", "Invalid extended command: " + h4);
                            }
                            z = true;
                        }
                    } else if (h3 <= 31) {
                        t(h3);
                    } else {
                        if (h3 <= 127) {
                            y(h3);
                        } else if (h3 <= 159) {
                            u(h3);
                        } else if (h3 <= 255) {
                            z(h3);
                        } else {
                            C0987u.h("Cea708Decoder", "Invalid base command: " + h3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.o = s();
        }
    }

    private void H() {
        for (int i = 0; i < 8; i++) {
            this.m[i].l();
        }
    }

    private void r() {
        if (this.q == null) {
            return;
        }
        G();
        this.q = null;
    }

    private List<ax.R0.a> s() {
        a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.m[i].j() && this.m[i].k() && (c = this.m[i].c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    private void t(int i) {
        if (i != 0) {
            if (i == 3) {
                this.o = s();
                return;
            }
            if (i == 8) {
                this.n.b();
                return;
            }
            switch (i) {
                case 12:
                    H();
                    break;
                case 13:
                    this.n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        C0987u.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.i.r(8);
                        break;
                    } else if (i >= 24 && i <= 31) {
                        C0987u.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.i.r(16);
                        break;
                    } else {
                        C0987u.h("Cea708Decoder", "Invalid C0 command: " + i);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void u(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.r != i3) {
                    this.r = i3;
                    this.n = this.m[i3];
                    break;
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - i2].e();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.i.g()) {
                        this.m[8 - i4].p(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - i2].p(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.i.g()) {
                        this.m[8 - i5].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - i2].l();
                    }
                    i2++;
                }
                break;
            case 141:
                this.i.r(8);
                break;
            case 142:
                break;
            case 143:
                H();
                break;
            case 144:
                if (this.n.i()) {
                    C();
                    break;
                } else {
                    this.i.r(16);
                    break;
                }
            case 145:
                if (this.n.i()) {
                    D();
                    break;
                } else {
                    this.i.r(24);
                    break;
                }
            case 146:
                if (this.n.i()) {
                    E();
                    break;
                } else {
                    this.i.r(16);
                    break;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C0987u.h("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case 151:
                if (this.n.i()) {
                    F();
                    break;
                } else {
                    this.i.r(32);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                x(i6);
                if (this.r != i6) {
                    this.r = i6;
                    this.n = this.m[i6];
                    break;
                }
                break;
        }
    }

    private void v(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.i.r(8);
        } else if (i <= 23) {
            this.i.r(16);
        } else if (i <= 31) {
            this.i.r(24);
        }
    }

    private void w(int i) {
        if (i <= 135) {
            this.i.r(32);
            return;
        }
        if (i <= 143) {
            this.i.r(40);
        } else if (i <= 159) {
            this.i.r(2);
            this.i.r(this.i.h(6) * 8);
        }
    }

    private void x(int i) {
        b bVar = this.m[i];
        this.i.r(2);
        boolean g = this.i.g();
        this.i.r(2);
        int h = this.i.h(3);
        boolean g2 = this.i.g();
        int h2 = this.i.h(7);
        int h3 = this.i.h(8);
        int h4 = this.i.h(4);
        int h5 = this.i.h(4);
        this.i.r(2);
        this.i.r(6);
        this.i.r(2);
        bVar.f(g, h, g2, h2, h3, h5, h4, this.i.h(3), this.i.h(3));
    }

    private void y(int i) {
        if (i == 127) {
            this.n.a((char) 9835);
        } else {
            this.n.a((char) (i & 255));
        }
    }

    private void z(int i) {
        this.n.a((char) (i & 255));
    }

    @Override // ax.O1.e, ax.V0.g
    public /* bridge */ /* synthetic */ void d() {
        super.d();
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
        this.r = 0;
        this.n = this.m[0];
        H();
        this.q = null;
    }

    @Override // ax.V0.g
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // ax.O1.e
    protected k h() {
        List<ax.R0.a> list = this.o;
        this.p = list;
        return new f((List) C0968a.e(list));
    }

    @Override // ax.O1.e
    protected void i(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(pVar.e0);
        this.h.Z(byteBuffer.array(), byteBuffer.limit());
        while (this.h.a() >= 3) {
            int M = this.h.M();
            int i = M & 3;
            boolean z = (M & 4) == 4;
            byte M2 = (byte) this.h.M();
            byte M3 = (byte) this.h.M();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        r();
                        int i2 = (M2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            H();
                            C0987u.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = M2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C0159c c0159c = new C0159c(i2, i4);
                        this.q = c0159c;
                        byte[] bArr = c0159c.c;
                        int i5 = c0159c.d;
                        c0159c.d = i5 + 1;
                        bArr[i5] = M3;
                    } else {
                        C0968a.a(i == 2);
                        C0159c c0159c2 = this.q;
                        if (c0159c2 == null) {
                            C0987u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0159c2.c;
                            int i6 = c0159c2.d;
                            int i7 = i6 + 1;
                            c0159c2.d = i7;
                            bArr2[i6] = M2;
                            c0159c2.d = i6 + 2;
                            bArr2[i7] = M3;
                        }
                    }
                    C0159c c0159c3 = this.q;
                    if (c0159c3.d == (c0159c3.b * 2) - 1) {
                        r();
                    }
                }
            }
        }
    }

    @Override // ax.O1.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ p f() throws m {
        return super.f();
    }

    @Override // ax.O1.e
    /* renamed from: k */
    public /* bridge */ /* synthetic */ q a() throws m {
        return super.a();
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
}
