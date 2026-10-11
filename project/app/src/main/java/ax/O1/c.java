/*
 * Decompiled with CFR 0.152.
 */
package ax.O1;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ax.N1.k;
import ax.N1.p;
import ax.O1.e;
import ax.O1.f;
import ax.R0.a;
import ax.S0.F;
import ax.S0.G;
import ax.S0.i;
import ax.S0.u;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c
extends e {
    private final G h = new G();
    private final F i = new F();
    private int j = -1;
    private final boolean k;
    private final int l;
    private final b[] m;
    private b n;
    private List<ax.R0.a> o;
    private List<ax.R0.a> p;
    private c q;
    private int r;

    public c(int n8, List<byte[]> list) {
        boolean bl = true;
        int n9 = n8;
        if (n8 == -1) {
            n9 = 1;
        }
        this.l = n9;
        if (list == null || !ax.S0.i.A(list)) {
            bl = false;
        }
        this.k = bl;
        this.m = new b[8];
        for (n8 = 0; n8 < 8; ++n8) {
            this.m[n8] = new b();
        }
        this.n = this.m[0];
    }

    private void A(int n8) {
        if (n8 != 32) {
            if (n8 != 33) {
                if (n8 != 37) {
                    if (n8 != 42) {
                        if (n8 != 44) {
                            if (n8 != 63) {
                                if (n8 != 57) {
                                    if (n8 != 58) {
                                        if (n8 != 60) {
                                            if (n8 != 61) {
                                                switch (n8) {
                                                    default: {
                                                        switch (n8) {
                                                            default: {
                                                                StringBuilder stringBuilder = new StringBuilder();
                                                                stringBuilder.append("Invalid G2 character: ");
                                                                stringBuilder.append(n8);
                                                                u.h("Cea708Decoder", stringBuilder.toString());
                                                                return;
                                                            }
                                                            case 127: {
                                                                this.n.a('\u250c');
                                                                return;
                                                            }
                                                            case 126: {
                                                                this.n.a('\u2518');
                                                                return;
                                                            }
                                                            case 125: {
                                                                this.n.a('\u2500');
                                                                return;
                                                            }
                                                            case 124: {
                                                                this.n.a('\u2514');
                                                                return;
                                                            }
                                                            case 123: {
                                                                this.n.a('\u2510');
                                                                return;
                                                            }
                                                            case 122: {
                                                                this.n.a('\u2502');
                                                                return;
                                                            }
                                                            case 121: {
                                                                this.n.a('\u215e');
                                                                return;
                                                            }
                                                            case 120: {
                                                                this.n.a('\u215d');
                                                                return;
                                                            }
                                                            case 119: {
                                                                this.n.a('\u215c');
                                                                return;
                                                            }
                                                            case 118: 
                                                        }
                                                        this.n.a('\u215b');
                                                        return;
                                                    }
                                                    case 53: {
                                                        this.n.a('\u2022');
                                                        return;
                                                    }
                                                    case 52: {
                                                        this.n.a('\u201d');
                                                        return;
                                                    }
                                                    case 51: {
                                                        this.n.a('\u201c');
                                                        return;
                                                    }
                                                    case 50: {
                                                        this.n.a('\u2019');
                                                        return;
                                                    }
                                                    case 49: {
                                                        this.n.a('\u2018');
                                                        return;
                                                    }
                                                    case 48: 
                                                }
                                                this.n.a('\u2588');
                                                return;
                                            }
                                            this.n.a('\u2120');
                                            return;
                                        }
                                        this.n.a('\u0153');
                                        return;
                                    }
                                    this.n.a('\u0161');
                                    return;
                                }
                                this.n.a('\u2122');
                                return;
                            }
                            this.n.a('\u0178');
                            return;
                        }
                        this.n.a('\u0152');
                        return;
                    }
                    this.n.a('\u0160');
                    return;
                }
                this.n.a('\u2026');
                return;
            }
            this.n.a('\u00a0');
            return;
        }
        this.n.a(' ');
    }

    private void B(int n8) {
        if (n8 == 160) {
            this.n.a('\u33c4');
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid G3 character: ");
        stringBuilder.append(n8);
        u.h("Cea708Decoder", stringBuilder.toString());
        this.n.a('_');
    }

    private void C() {
        int n8 = this.i.h(4);
        int n9 = this.i.h(2);
        int n10 = this.i.h(2);
        boolean bl = this.i.g();
        boolean bl2 = this.i.g();
        int n11 = this.i.h(3);
        int n12 = this.i.h(3);
        this.n.m(n8, n9, n10, bl, bl2, n11, n12);
    }

    private void D() {
        int n8 = this.i.h(2);
        n8 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n8);
        int n9 = this.i.h(2);
        int n10 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n9);
        this.i.r(2);
        n9 = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        this.n.n(n8, n10, n9);
    }

    private void E() {
        this.i.r(4);
        int n8 = this.i.h(4);
        this.i.r(2);
        int n9 = this.i.h(6);
        this.n.o(n8, n9);
    }

    private void F() {
        int n8 = this.i.h(2);
        int n9 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n8);
        int n10 = this.i.h(2);
        int n11 = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        n8 = n10;
        if (this.i.g()) {
            n8 = n10 | 4;
        }
        boolean bl = this.i.g();
        int n12 = this.i.h(2);
        n10 = this.i.h(2);
        int n13 = this.i.h(2);
        this.i.r(8);
        this.n.q(n9, n11, bl, n8, n12, n10, n13);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void G() {
        Object object = this.q;
        if (((c)object).d != ((c)object).b * 2 - 1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("DtvCcPacket ended prematurely; size is ");
            ((StringBuilder)object).append(this.q.b * 2 - 1);
            ((StringBuilder)object).append(", but current index is ");
            ((StringBuilder)object).append(this.q.d);
            ((StringBuilder)object).append(" (sequence number ");
            ((StringBuilder)object).append(this.q.a);
            ((StringBuilder)object).append(");");
            u.b("Cea708Decoder", ((StringBuilder)object).toString());
        }
        object = this.i;
        c c8 = this.q;
        ((F)object).o(c8.c, c8.d);
        int n8 = 0;
        block0: while (this.i.b() > 0) {
            int n9 = this.i.h(3);
            int n10 = this.i.h(5);
            int n11 = n9;
            if (n9 == 7) {
                this.i.r(2);
                n11 = n9 = this.i.h(6);
                if (n9 < 7) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid extended service number: ");
                    ((StringBuilder)object).append(n9);
                    u.h("Cea708Decoder", ((StringBuilder)object).toString());
                    n11 = n9;
                }
            }
            if (n10 == 0) {
                if (n11 == 0) break;
                object = new StringBuilder();
                ((StringBuilder)object).append("serviceNumber is non-zero (");
                ((StringBuilder)object).append(n11);
                ((StringBuilder)object).append(") when blockSize is 0");
                u.h("Cea708Decoder", ((StringBuilder)object).toString());
                break;
            }
            if (n11 != this.l) {
                this.i.s(n10);
                continue;
            }
            n9 = this.i.e();
            n11 = n8;
            while (true) {
                block23: {
                    block19: {
                        block22: {
                            block20: {
                                block21: {
                                    n8 = n11;
                                    if (this.i.e() >= n9 + n10 * 8) continue block0;
                                    n8 = this.i.h(8);
                                    if (n8 == 16) break block20;
                                    if (n8 <= 31) {
                                        this.t(n8);
                                        continue;
                                    }
                                    if (n8 > 127) break block21;
                                    this.y(n8);
                                    break block19;
                                }
                                if (n8 <= 159) {
                                    this.u(n8);
                                    break block19;
                                } else if (n8 <= 255) {
                                    this.z(n8);
                                    break block19;
                                } else {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Invalid base command: ");
                                    ((StringBuilder)object).append(n8);
                                    u.h("Cea708Decoder", ((StringBuilder)object).toString());
                                    continue;
                                }
                            }
                            n8 = this.i.h(8);
                            if (n8 <= 31) {
                                this.v(n8);
                                continue;
                            }
                            if (n8 > 127) break block22;
                            this.A(n8);
                            break block19;
                        }
                        if (n8 <= 159) {
                            this.w(n8);
                            continue;
                        }
                        if (n8 > 255) break block23;
                        this.B(n8);
                    }
                    n11 = 1;
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid extended command: ");
                ((StringBuilder)object).append(n8);
                u.h("Cea708Decoder", ((StringBuilder)object).toString());
            }
        }
        if (n8 != 0) {
            this.o = this.s();
        }
    }

    private void H() {
        for (int i8 = 0; i8 < 8; ++i8) {
            this.m[i8].l();
        }
    }

    private void r() {
        if (this.q == null) {
            return;
        }
        this.G();
        this.q = null;
    }

    private List<ax.R0.a> s() {
        Object object;
        int n8;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n9 = 0;
        for (n8 = 0; n8 < 8; ++n8) {
            if (this.m[n8].j() || !this.m[n8].k() || (object = this.m[n8].c()) == null) continue;
            arrayList.add(object);
        }
        Collections.sort(arrayList, a.c);
        object = new ArrayList<ax.R0.a>(arrayList.size());
        for (n8 = n9; n8 < arrayList.size(); ++n8) {
            object.add(((a)arrayList.get((int)n8)).a);
        }
        return java.util.DesugarCollections.unmodifiableList(object);
    }

    private void t(int n8) {
        if (n8 != 0) {
            if (n8 != 3) {
                if (n8 != 8) {
                    switch (n8) {
                        default: {
                            if (n8 >= 17 && n8 <= 23) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Currently unsupported COMMAND_EXT1 Command: ");
                                stringBuilder.append(n8);
                                u.h("Cea708Decoder", stringBuilder.toString());
                                this.i.r(8);
                                return;
                            }
                            if (n8 >= 24 && n8 <= 31) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Currently unsupported COMMAND_P16 Command: ");
                                stringBuilder.append(n8);
                                u.h("Cea708Decoder", stringBuilder.toString());
                                this.i.r(16);
                                return;
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid C0 command: ");
                            stringBuilder.append(n8);
                            u.h("Cea708Decoder", stringBuilder.toString());
                            return;
                        }
                        case 13: {
                            this.n.a('\n');
                            return;
                        }
                        case 12: {
                            this.H();
                            return;
                        }
                        case 14: {
                            return;
                        }
                    }
                }
                this.n.b();
                return;
            }
            this.o = this.s();
        }
    }

    private void u(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid C1 command: ");
                stringBuilder.append(n8);
                u.h("Cea708Decoder", stringBuilder.toString());
                return;
            }
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: {
                this.x(n8 -= 152);
                if (this.r == n8) break;
                this.r = n8;
                this.n = this.m[n8];
                return;
            }
            case 151: {
                if (!this.n.i()) {
                    this.i.r(32);
                    return;
                }
                this.F();
                return;
            }
            case 146: {
                if (!this.n.i()) {
                    this.i.r(16);
                    return;
                }
                this.E();
                return;
            }
            case 145: {
                if (!this.n.i()) {
                    this.i.r(24);
                    return;
                }
                this.D();
                return;
            }
            case 144: {
                if (!this.n.i()) {
                    this.i.r(16);
                    return;
                }
                this.C();
                return;
            }
            case 143: {
                this.H();
                return;
            }
            case 141: {
                this.i.r(8);
                return;
            }
            case 140: {
                for (int i8 = 1; i8 <= 8; ++i8) {
                    if (!this.i.g()) continue;
                    this.m[8 - i8].l();
                }
                break;
            }
            case 139: {
                for (n8 = 1; n8 <= 8; ++n8) {
                    if (!this.i.g()) continue;
                    b b8 = this.m[8 - n8];
                    b8.p(b8.k() ^ true);
                }
                break;
            }
            case 138: {
                for (int i9 = 1; i9 <= 8; ++i9) {
                    if (!this.i.g()) continue;
                    this.m[8 - i9].p(false);
                }
                break;
            }
            case 137: {
                for (n8 = 1; n8 <= 8; ++n8) {
                    if (!this.i.g()) continue;
                    this.m[8 - n8].p(true);
                }
                break;
            }
            case 136: {
                for (int i10 = 1; i10 <= 8; ++i10) {
                    if (!this.i.g()) continue;
                    this.m[8 - i10].e();
                }
                break;
            }
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: {
                if (this.r == (n8 -= 128)) break;
                this.r = n8;
                this.n = this.m[n8];
            }
            case 142: 
        }
    }

    private void v(int n8) {
        if (n8 > 7) {
            if (n8 <= 15) {
                this.i.r(8);
                return;
            }
            if (n8 <= 23) {
                this.i.r(16);
                return;
            }
            if (n8 <= 31) {
                this.i.r(24);
            }
        }
    }

    private void w(int n8) {
        if (n8 <= 135) {
            this.i.r(32);
            return;
        }
        if (n8 <= 143) {
            this.i.r(40);
            return;
        }
        if (n8 <= 159) {
            this.i.r(2);
            n8 = this.i.h(6);
            this.i.r(n8 * 8);
        }
    }

    private void x(int n8) {
        b b8 = this.m[n8];
        this.i.r(2);
        boolean bl = this.i.g();
        this.i.r(2);
        n8 = this.i.h(3);
        boolean bl2 = this.i.g();
        int n9 = this.i.h(7);
        int n10 = this.i.h(8);
        int n11 = this.i.h(4);
        int n12 = this.i.h(4);
        this.i.r(2);
        this.i.r(6);
        this.i.r(2);
        b8.f(bl, n8, bl2, n9, n10, n12, n11, this.i.h(3), this.i.h(3));
    }

    private void y(int n8) {
        if (n8 == 127) {
            this.n.a('\u266b');
            return;
        }
        this.n.a((char)(n8 & 0xFF));
    }

    private void z(int n8) {
        this.n.a((char)(n8 & 0xFF));
    }

    @Override
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        this.r = 0;
        this.n = this.m[0];
        this.H();
        this.q = null;
    }

    @Override
    public String getName() {
        return "Cea708Decoder";
    }

    @Override
    protected k h() {
        List<ax.R0.a> list = this.o;
        this.p = list;
        return new f(ax.S0.a.e(list));
    }

    @Override
    protected void i(p object) {
        Object object2 = ax.S0.a.e(((ax.V0.i)object).e0);
        object = ((ByteBuffer)object2).array();
        this.h.Z((byte[])object, ((Buffer)object2).limit());
        while (this.h.a() >= 3) {
            int n8 = this.h.M();
            int n9 = n8 & 3;
            boolean bl = false;
            n8 = (n8 & 4) == 4 ? 1 : 0;
            byte by = (byte)this.h.M();
            byte by2 = (byte)this.h.M();
            if (n9 != 2 && n9 != 3 || n8 == 0) continue;
            if (n9 == 3) {
                this.r();
                int n10 = (by & 0xC0) >> 6;
                n8 = this.j;
                if (n8 != -1 && n10 != (n8 + 1) % 4) {
                    this.H();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Sequence number discontinuity. previous=");
                    ((StringBuilder)object).append(this.j);
                    ((StringBuilder)object).append(" current=");
                    ((StringBuilder)object).append(n10);
                    u.h("Cea708Decoder", ((StringBuilder)object).toString());
                }
                this.j = n10;
                n8 = n9 = by & 0x3F;
                if (n9 == 0) {
                    n8 = 64;
                }
                this.q = object2 = new c(n10, n8);
                object = ((c)object2).c;
                n8 = ((c)object2).d;
                ((c)object2).d = n8 + 1;
                object[n8] = by2;
            } else {
                if (n9 == 2) {
                    bl = true;
                }
                ax.S0.a.a(bl);
                object = this.q;
                if (object == null) {
                    u.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    continue;
                }
                object2 = ((c)object).c;
                n8 = ((c)object).d;
                ((c)object).d = n9 = n8 + 1;
                object2[n8] = by;
                ((c)object).d = n8 + 2;
                object2[n9] = by2;
            }
            object = this.q;
            if (((c)object).d != ((c)object).b * 2 - 1) continue;
            this.r();
        }
    }

    @Override
    protected boolean n() {
        return this.o != this.p;
    }

    private static final class a {
        private static final Comparator<a> c = new ax.O1.b();
        public final ax.R0.a a;
        public final int b;

        public a(CharSequence object, Layout.Alignment alignment, float f8, int n8, int n9, float f9, int n10, float f10, boolean bl, int n11, int n12) {
            object = new a.b().o((CharSequence)object).p(alignment).h(f8, n8).i(n9).k(f9).l(n10).n(f10);
            if (bl) {
                ((a.b)object).s(n11);
            }
            this.a = ((a.b)object).a();
            this.b = n12;
        }

        public static /* synthetic */ int a(a a8, a a9) {
            return Integer.compare(a9.b, a8.b);
        }
    }

    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        public static final int v;
        public static final int w;
        public static final int x;
        private static final int[] y;
        private static final int[] z;
        private final List<SpannableString> a = new ArrayList<SpannableString>();
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
            int n8;
            int n9;
            v = ax.O1.c$b.h(2, 2, 2, 0);
            w = n9 = ax.O1.c$b.h(0, 0, 0, 0);
            x = n8 = ax.O1.c$b.h(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{n9, n8, n9, n9, n8, n9, n9};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{n9, n9, n9, n9, n9, n8, n8};
        }

        public b() {
            this.l();
        }

        public static int g(int n8, int n9, int n10) {
            return ax.O1.c$b.h(n8, n9, n10, 0);
        }

        /*
         * Unable to fully structure code
         */
        public static int h(int var0, int var1_1, int var2_2, int var3_3) {
            block5: {
                block4: {
                    var4_4 = 0;
                    ax.S0.a.c(var0, 0, 4);
                    ax.S0.a.c(var1_1, 0, 4);
                    ax.S0.a.c(var2_2, 0, 4);
                    ax.S0.a.c(var3_3, 0, 4);
                    if (var3_3 == 0 || var3_3 == 1) ** GOTO lbl-1000
                    if (var3_3 != 2) {
                        ** if (var3_3 == 3) goto lbl-1000
                    }
                    break block4;
lbl-1000:
                    // 2 sources

                    {
                        var3_3 = 255;
                        ** GOTO lbl20
                    }
lbl-1000:
                    // 1 sources

                    {
                        var3_3 = 0;
                    }
                    break block5;
                }
                var3_3 = 127;
            }
            var0 = var0 > 1 ? 255 : 0;
            var1_1 = var1_1 > 1 ? 255 : 0;
            if (var2_2 > 1) {
                var4_4 = 255;
            }
            return Color.argb((int)var3_3, (int)var0, (int)var1_1, (int)var4_4);
        }

        public void a(char c8) {
            if (c8 == '\n') {
                this.a.add(this.d());
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
            this.b.append(c8);
        }

        public void b() {
            int n8 = this.b.length();
            if (n8 > 0) {
                this.b.delete(n8 - 1, n8);
            }
        }

        public a c() {
            float f8;
            float f9;
            Layout.Alignment alignment;
            int n8;
            int n9;
            SpannableStringBuilder spannableStringBuilder;
            block11: {
                block8: {
                    block9: {
                        block10: {
                            if (this.j()) {
                                return null;
                            }
                            spannableStringBuilder = new SpannableStringBuilder();
                            for (n9 = 0; n9 < this.a.size(); ++n9) {
                                spannableStringBuilder.append((CharSequence)this.a.get(n9));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence)this.d());
                            n9 = this.k;
                            n8 = 2;
                            if (n9 == 0) break block8;
                            if (n9 == 1) break block9;
                            if (n9 == 2) break block10;
                            if (n9 != 3) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Unexpected justification value: ");
                                stringBuilder.append(this.k);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            break block8;
                        }
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break block11;
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break block11;
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.f) {
                f9 = (float)this.h / 99.0f;
                f8 = (float)this.g / 99.0f;
            } else {
                f9 = (float)this.h / 209.0f;
                f8 = (float)this.g / 74.0f;
            }
            f9 = f9 * 0.9f + 0.05f;
            int n10 = this.i;
            n9 = n10 / 3 == 0 ? 0 : (n10 / 3 == 1 ? 1 : 2);
            if (n10 % 3 == 0) {
                n8 = 0;
            } else if (n10 % 3 == 1) {
                n8 = 1;
            }
            boolean bl = this.n != w;
            return new a((CharSequence)spannableStringBuilder, alignment, f8 * 0.9f + 0.05f, 0, n9, f9, n8, -3.4028235E38f, bl, this.n, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.b);
            int n8 = spannableStringBuilder.length();
            if (n8 > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), this.o, n8, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), this.p, n8, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.r), this.q, n8, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(this.t), this.s, n8, 33);
                }
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
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

        public void f(boolean bl, int n8, boolean bl2, int n9, int n10, int n11, int n12, int n13, int n14) {
            this.c = true;
            this.d = bl;
            this.e = n8;
            this.f = bl2;
            this.g = n9;
            this.h = n10;
            this.i = n12;
            n8 = this.j;
            n9 = n11 + 1;
            if (n8 != n9) {
                this.j = n9;
                while (this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
            }
            if (n13 != 0 && this.l != n13) {
                this.l = n13;
                n8 = n13 - 1;
                this.q(C[n8], x, B[n8], 0, z[n8], A[n8], y[n8]);
            }
            if (n14 != 0 && this.m != n14) {
                this.m = n14;
                n8 = n14 - 1;
                this.m(0, 1, 1, false, false, E[n8], D[n8]);
                this.n(v, F[n8], w);
            }
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !this.i() || this.a.isEmpty() && this.b.length() == 0;
            {
            }
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            int n8;
            this.e();
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
            this.n = n8 = w;
            this.r = v;
            this.t = n8;
        }

        public void m(int n8, int n9, int n10, boolean bl, boolean bl2, int n11, int n12) {
            if (this.o != -1) {
                if (!bl) {
                    this.b.setSpan((Object)new StyleSpan(2), this.o, this.b.length(), 33);
                    this.o = -1;
                }
            } else if (bl) {
                this.o = this.b.length();
            }
            if (this.p != -1) {
                if (!bl2) {
                    this.b.setSpan((Object)new UnderlineSpan(), this.p, this.b.length(), 33);
                    this.p = -1;
                    return;
                }
            } else if (bl2) {
                this.p = this.b.length();
            }
        }

        public void n(int n8, int n9, int n10) {
            if (this.q != -1 && this.r != n8) {
                this.b.setSpan((Object)new ForegroundColorSpan(this.r), this.q, this.b.length(), 33);
            }
            if (n8 != v) {
                this.q = this.b.length();
                this.r = n8;
            }
            if (this.s != -1 && this.t != n9) {
                this.b.setSpan((Object)new BackgroundColorSpan(this.t), this.s, this.b.length(), 33);
            }
            if (n9 != w) {
                this.s = this.b.length();
                this.t = n9;
            }
        }

        public void o(int n8, int n9) {
            if (this.u != n8) {
                this.a('\n');
            }
            this.u = n8;
        }

        public void p(boolean bl) {
            this.d = bl;
        }

        public void q(int n8, int n9, boolean bl, int n10, int n11, int n12, int n13) {
            this.n = n8;
            this.k = n13;
        }
    }

    private static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        int d;

        public c(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = new byte[n9 * 2 - 1];
            this.d = 0;
        }
    }
}

