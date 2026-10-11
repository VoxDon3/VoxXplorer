/*
 * Decompiled with CFR 0.152.
 */
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
import ax.O1.e;
import ax.O1.f;
import ax.R0.a;
import ax.S0.G;
import ax.S0.u;
import ax.V0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
extends e {
    private static final int[] A;
    private static final int[] B;
    private static final int[] C;
    private static final int[] D;
    private static final int[] E;
    private static final int[] F;
    private static final boolean[] G;
    private static final int[] z;
    private final G h = new G();
    private final int i;
    private final int j;
    private final int k;
    private final long l;
    private final ArrayList<a> m = new ArrayList();
    private a n = new a(0, 4);
    private List<ax.R0.a> o;
    private List<ax.R0.a> p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private byte u;
    private byte v;
    private int w = 0;
    private boolean x;
    private long y;

    static {
        z = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        B = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        C = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        D = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        E = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        F = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        G = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public a(String string, int n8, long l8) {
        if (l8 != -9223372036854775807L) {
            boolean bl = l8 >= 16000L;
            ax.S0.a.a(bl);
            this.l = l8 * 1000L;
        } else {
            this.l = -9223372036854775807L;
        }
        int n9 = "application/x-mp4-cea-608".equals(string) ? 2 : 3;
        this.i = n9;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        ax.S0.u.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = 1;
                        this.j = 1;
                    }
                } else {
                    this.k = 0;
                    this.j = 1;
                }
            } else {
                this.k = 1;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        this.P(0);
        this.O();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void A(byte by) {
        if (by == 32) {
            this.P(2);
            return;
        }
        if (by == 41) {
            this.P(3);
            return;
        }
        switch (by) {
            default: {
                int n8 = this.q;
                if (n8 == 0) {
                    return;
                }
                if (by == 33) {
                    this.n.f();
                    return;
                }
                switch (by) {
                    default: {
                        return;
                    }
                    case 47: {
                        this.o = this.u();
                        this.O();
                        return;
                    }
                    case 46: {
                        this.O();
                        return;
                    }
                    case 45: {
                        if (n8 != 1) return;
                        if (this.n.i()) return;
                        this.n.k();
                        return;
                    }
                    case 44: 
                }
                this.o = Collections.EMPTY_LIST;
                if (n8 != 1) {
                    if (n8 != 3) return;
                }
                this.O();
                return;
            }
            case 39: {
                this.P(1);
                this.Q(4);
                return;
            }
            case 38: {
                this.P(1);
                this.Q(3);
                return;
            }
            case 37: 
        }
        this.P(1);
        this.Q(2);
    }

    private void B(byte by, byte by2) {
        a a8;
        int n8 = z[by & 7];
        by = (byte)n8;
        if ((by2 & 0x20) != 0) {
            by = (byte)(n8 + 1);
        }
        if (by != this.n.d) {
            if (this.q != 1 && !this.n.i()) {
                this.n = a8 = new a(this.q, this.r);
                this.m.add(a8);
            }
            a.c(this.n, by);
        }
        boolean bl = false;
        by = (by2 & 0x10) == 16 ? (byte)1 : 0;
        if ((by2 & 1) == 1) {
            bl = true;
        }
        n8 = by2 >> 1 & 7;
        a8 = this.n;
        by2 = by != 0 ? (byte)8 : (byte)n8;
        a8.p(by2, bl);
        if (by != 0) {
            a.d(this.n, A[n8]);
        }
    }

    private static boolean C(byte by) {
        return (by & 0xE0) == 0;
    }

    private static boolean D(byte by, byte by2) {
        return (by & 0xF6) == 18 && (by2 & 0xE0) == 32;
    }

    private static boolean E(byte by, byte by2) {
        return (by & 0xF7) == 17 && (by2 & 0xF0) == 32;
    }

    private static boolean F(byte by, byte by2) {
        return (by & 0xF6) == 20 && (by2 & 0xF0) == 32;
    }

    private static boolean G(byte by, byte by2) {
        return (by & 0xF0) == 16 && (by2 & 0xC0) == 64;
    }

    private static boolean H(byte by) {
        return (by & 0xF0) == 16;
    }

    private boolean I(boolean bl, byte by, byte by2) {
        if (bl && a.H(by)) {
            if (this.t && this.u == by && this.v == by2) {
                this.t = false;
                return true;
            }
            this.t = true;
            this.u = by;
            this.v = by2;
        } else {
            this.t = false;
        }
        return false;
    }

    private static boolean J(byte by) {
        return (by & 0xF6) == 20;
    }

    private static boolean K(byte by, byte by2) {
        return (by & 0xF7) == 17 && (by2 & 0xF0) == 48;
    }

    private static boolean L(byte by, byte by2) {
        return (by & 0xF7) == 23 && by2 >= 33 && by2 <= 35;
    }

    private static boolean M(byte by) {
        return 1 <= by && by <= 15;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void N(byte by, byte by2) {
        if (a.M(by)) {
            this.x = false;
            return;
        }
        if (!a.J(by)) return;
        if (by2 != 32 && by2 != 47) {
            switch (by2) {
                default: {
                    switch (by2) {
                        default: {
                            return;
                        }
                        case 42: 
                        case 43: {
                            this.x = false;
                            return;
                        }
                        case 41: 
                    }
                }
                case 37: 
                case 38: 
                case 39: 
            }
        }
        this.x = true;
    }

    private void O() {
        this.n.j(this.q);
        this.m.clear();
        this.m.add(this.n);
    }

    private void P(int n8) {
        block5: {
            block3: {
                int n9;
                block4: {
                    n9 = this.q;
                    if (n9 == n8) break block3;
                    this.q = n8;
                    if (n8 != 3) break block4;
                    for (n9 = 0; n9 < this.m.size(); ++n9) {
                        this.m.get(n9).l(n8);
                    }
                    break block3;
                }
                this.O();
                if (n9 == 3 || n8 == 1 || n8 == 0) break block5;
            }
            return;
        }
        this.o = Collections.EMPTY_LIST;
    }

    private void Q(int n8) {
        this.r = n8;
        this.n.m(n8);
    }

    private boolean R() {
        return this.l != -9223372036854775807L && this.y != -9223372036854775807L && this.m() - this.y >= this.l;
    }

    private boolean S(byte by) {
        if (a.C(by)) {
            this.w = a.t(by);
        }
        return this.w == this.k;
    }

    private static char s(byte by) {
        return (char)C[(by & 0x7F) - 32];
    }

    private static int t(byte by) {
        return by >> 3 & 1;
    }

    private List<ax.R0.a> u() {
        ax.R0.a a8;
        int n8;
        int n9 = this.m.size();
        ArrayList<ax.R0.a> arrayList = new ArrayList<ax.R0.a>(n9);
        int n10 = 2;
        int n11 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            a8 = this.m.get(n8).g(Integer.MIN_VALUE);
            arrayList.add(a8);
            int n12 = n10;
            if (a8 != null) {
                n12 = Math.min(n10, a8.i);
            }
            n10 = n12;
        }
        ArrayList<ax.R0.a> arrayList2 = new ArrayList<ax.R0.a>(n9);
        for (n8 = n11; n8 < n9; ++n8) {
            ax.R0.a a9 = (ax.R0.a)arrayList.get(n8);
            if (a9 == null) continue;
            a8 = a9;
            if (a9.i != n10) {
                a8 = ax.S0.a.e(this.m.get(n8).g(n10));
            }
            arrayList2.add(a8);
        }
        return arrayList2;
    }

    private static char v(byte by) {
        return (char)E[by & 0x1F];
    }

    private static char w(byte by) {
        return (char)F[by & 0x1F];
    }

    private static char x(byte by, byte by2) {
        if ((by & 1) == 0) {
            return a.v(by2);
        }
        return a.w(by2);
    }

    private static char y(byte by) {
        return (char)D[by & 0xF];
    }

    private void z(byte by) {
        this.n.e(' ');
        boolean bl = (by & 1) == 1;
        this.n.p(by >> 1 & 7, bl);
    }

    @Override
    public void d() {
    }

    @Override
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        this.P(0);
        this.Q(4);
        this.O();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override
    public String getName() {
        return "Cea608Decoder";
    }

    @Override
    protected k h() {
        List<ax.R0.a> list = this.o;
        this.p = list;
        return new f(ax.S0.a.e(list));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void i(p object) {
        int n8;
        int n9;
        object = ax.S0.a.e(((i)object).e0);
        this.h.Z(((ByteBuffer)object).array(), ((Buffer)object).limit());
        int n10 = 0;
        while ((n9 = this.h.a()) >= (n8 = this.i)) {
            block7: {
                byte by;
                byte by2;
                block8: {
                    block12: {
                        block11: {
                            block10: {
                                block9: {
                                    block6: {
                                        n8 = n8 == 2 ? -4 : this.h.M();
                                        n9 = this.h.M();
                                        int n11 = this.h.M();
                                        if ((n8 & 2) != 0 || (n8 & 1) != this.j) continue;
                                        by2 = (byte)(n9 & 0x7F);
                                        by = (byte)(n11 & 0x7F);
                                        if (by2 == 0 && by == 0) continue;
                                        boolean bl = this.s;
                                        boolean bl2 = (n8 & 4) == 4 && (object = (Object)G)[n9] != false && object[n11] != false;
                                        this.s = bl2;
                                        if (this.I(bl2, by2, by)) continue;
                                        if (this.s) break block6;
                                        if (!bl) continue;
                                        this.O();
                                        break block7;
                                    }
                                    this.N(by2, by);
                                    if (!this.x || !this.S(by2)) continue;
                                    if (!a.C(by2)) break block8;
                                    if (!a.K(by2, by)) break block9;
                                    this.n.e(a.y(by));
                                    break block7;
                                }
                                if (!a.D(by2, by)) break block10;
                                this.n.f();
                                this.n.e(a.x(by2, by));
                                break block7;
                            }
                            if (!a.E(by2, by)) break block11;
                            this.z(by);
                            break block7;
                        }
                        if (!a.G(by2, by)) break block12;
                        this.B(by2, by);
                        break block7;
                    }
                    if (a.L(by2, by)) {
                        a.a(this.n, by - 32);
                        break block7;
                    } else if (a.F(by2, by)) {
                        this.A(by);
                    }
                    break block7;
                }
                this.n.e(a.s(by2));
                if ((by & 0xE0) != 0) {
                    this.n.e(a.s(by));
                }
            }
            n10 = 1;
        }
        if (n10 != 0 && ((n10 = this.q) == 1 || n10 == 3)) {
            this.o = this.u();
            this.y = this.m();
        }
    }

    @Override
    public q k() throws m {
        q q8 = super.k();
        if (q8 != null) {
            return q8;
        }
        if (this.R() && (q8 = this.l()) != null) {
            this.o = Collections.EMPTY_LIST;
            this.y = -9223372036854775807L;
            k k8 = this.h();
            q8.C(this.m(), k8, Long.MAX_VALUE);
            return q8;
        }
        return null;
    }

    @Override
    protected boolean n() {
        return this.o != this.p;
    }

    private static final class ax.O1.a$a {
        private final List<a> a = new ArrayList<a>();
        private final List<SpannableString> b = new ArrayList<SpannableString>();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public ax.O1.a$a(int n8, int n9) {
            this.j(n8);
            this.h = n9;
        }

        static /* synthetic */ int a(ax.O1.a$a a8, int n8) {
            a8.f = n8;
            return n8;
        }

        static /* synthetic */ int c(ax.O1.a$a a8, int n8) {
            a8.d = n8;
            return n8;
        }

        static /* synthetic */ int d(ax.O1.a$a a8, int n8) {
            a8.e = n8;
            return n8;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.c);
            int n8 = spannableStringBuilder.length();
            int n9 = 0;
            int n10 = -1;
            int n11 = -1;
            int n12 = 0;
            int n13 = -1;
            int n14 = -1;
            int n15 = 0;
            while (n9 < this.a.size()) {
                int n16;
                int n17;
                int n18;
                a a8 = this.a.get(n9);
                boolean bl = a8.b;
                int n19 = a8.a;
                int n20 = n14;
                int n21 = n15;
                if (n19 != 8) {
                    n20 = n19 == 7 ? 1 : 0;
                    if (n19 != 7) {
                        n14 = B[n19];
                    }
                    n21 = n20;
                    n20 = n14;
                }
                if ((n19 = a8.c) == (n14 = (n18 = n9 + 1) < this.a.size() ? this.a.get((int)n18).c : n8)) {
                    n9 = n18;
                    n14 = n20;
                    n15 = n21;
                    continue;
                }
                if (n10 != -1 && !bl) {
                    ax.O1.a$a.q(spannableStringBuilder, n10, n19);
                    n17 = -1;
                } else {
                    n17 = n10;
                    if (n10 == -1) {
                        n17 = n10;
                        if (bl) {
                            n17 = n19;
                        }
                    }
                }
                if (n11 != -1 && n21 == 0) {
                    ax.O1.a$a.o(spannableStringBuilder, n11, n19);
                    n16 = -1;
                } else {
                    n16 = n11;
                    if (n11 == -1) {
                        n16 = n11;
                        if (n21 != 0) {
                            n16 = n19;
                        }
                    }
                }
                n9 = n18;
                n10 = n17;
                n11 = n16;
                n14 = n20;
                n15 = n21;
                if (n20 == n13) continue;
                ax.O1.a$a.n(spannableStringBuilder, n12, n19, n13);
                n13 = n20;
                n9 = n18;
                n10 = n17;
                n11 = n16;
                n12 = n19;
                n14 = n20;
                n15 = n21;
            }
            if (n10 != -1 && n10 != n8) {
                ax.O1.a$a.q(spannableStringBuilder, n10, n8);
            }
            if (n11 != -1 && n11 != n8) {
                ax.O1.a$a.o(spannableStringBuilder, n11, n8);
            }
            if (n12 != n8) {
                ax.O1.a$a.n(spannableStringBuilder, n12, n8, n13);
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10) {
            if (n10 == -1) {
                return;
            }
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n10), n8, n9, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int n8, int n9) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(2), n8, n9, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int n8, int n9) {
            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n8, n9, 33);
        }

        public void e(char c8) {
            if (this.c.length() < 32) {
                this.c.append(c8);
            }
        }

        public void f() {
            int n8 = this.c.length();
            if (n8 > 0) {
                this.c.delete(n8 - 1, n8);
                for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
                    a a8 = this.a.get(i8);
                    int n9 = a8.c;
                    if (n9 != n8) break;
                    a8.c = n9 - 1;
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public ax.R0.a g(int n8) {
            float f8;
            int n9;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (n9 = 0; n9 < this.b.size(); ++n9) {
                spannableStringBuilder.append((CharSequence)this.b.get(n9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence)this.h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            n9 = this.e + this.f;
            int n10 = 32 - n9 - spannableStringBuilder.length();
            int n11 = n9 - n10;
            if (n8 == Integer.MIN_VALUE) {
                n8 = this.g == 2 && (Math.abs(n11) < 3 || n10 < 0) ? 1 : (this.g == 2 && n11 > 0 ? 2 : 0);
            }
            if (n8 != 1) {
                if (n8 == 2) {
                    n9 = 32 - n10;
                }
                f8 = (float)n9 / 32.0f * 0.8f + 0.1f;
            } else {
                f8 = 0.5f;
            }
            n10 = this.d;
            if (n10 > 7) {
                n9 = n10 - 17;
                return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
            }
            n9 = n10;
            if (this.g != 1) return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
            n9 = n10 - (this.h - 1);
            return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int n8) {
            this.g = n8;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(this.h());
            this.c.setLength(0);
            this.a.clear();
            int n8 = Math.min(this.h, this.d);
            while (this.b.size() >= n8) {
                this.b.remove(0);
            }
        }

        public void l(int n8) {
            this.g = n8;
        }

        public void m(int n8) {
            this.h = n8;
        }

        public void p(int n8, boolean bl) {
            this.a.add(new a(n8, bl, this.c.length()));
        }

        private static class a {
            public final int a;
            public final boolean b;
            public int c;

            public a(int n8, boolean bl, int n9) {
                this.a = n8;
                this.b = bl;
                this.c = n9;
            }
        }
    }
}

