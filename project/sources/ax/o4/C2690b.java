package ax.o4;

import android.util.Log;
import ax.o4.C2695g;
import ax.o4.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.o4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2690b {
    private f a;
    private u b;
    private boolean c = false;

    /* renamed from: ax.o4.b$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.values().length];
            b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: ax.o4.b$b, reason: collision with other inner class name */
    private static class C0396b {
        public final String a;
        final c b;
        public final String c;

        C0396b(String str, c cVar, String str2) {
            this.a = str;
            this.b = cVar;
            this.c = str2;
        }
    }

    /* renamed from: ax.o4.b$c */
    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: ax.o4.b$d */
    private static class d extends k.i {

        /* renamed from: ax.o4.b$d$a */
        private static class a {
            public int a;
            public int b;

            a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", HttpUrl.FRAGMENT_ENCODE_SET));
        }

        private int C(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        private a D() throws C2689a {
            C2691c c2691c;
            a aVar;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            int i2 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i3 = (!f('+') && f('-')) ? -1 : 1;
                    C2691c c = C2691c.c(this.a, this.b, this.c, false);
                    if (c != null) {
                        this.b = c.a();
                    }
                    if (f('n') || f('N')) {
                        if (c == null) {
                            c = new C2691c(1L, this.b);
                        }
                        A();
                        boolean f = f('+');
                        if (!f && (f = f('-'))) {
                            i2 = -1;
                        }
                        if (f) {
                            A();
                            c2691c = C2691c.c(this.a, this.b, this.c, false);
                            if (c2691c == null) {
                                this.b = i;
                                return null;
                            }
                            this.b = c2691c.a();
                            int i4 = i2;
                            i2 = i3;
                            i3 = i4;
                        } else {
                            int i5 = i2;
                            i2 = i3;
                            i3 = i5;
                            c2691c = null;
                        }
                    } else {
                        c2691c = c;
                        c = null;
                    }
                    aVar = new a(c == null ? 0 : i2 * c.d(), c2691c != null ? i3 * c2691c.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.b = i;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String q = q();
            return q != null ? q : H();
        }

        private List<String> G() throws C2689a {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H = H();
                if (H == null) {
                    this.b = i;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.b = i;
            return null;
        }

        private List<s> K() throws C2689a {
            List<t> list;
            List<g> list2;
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            List<s> L = L();
            if (L == null) {
                this.b = i;
                return null;
            }
            if (!f(')')) {
                this.b = i;
                return null;
            }
            Iterator<s> it = L.iterator();
            while (it.hasNext() && (list = it.next().a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().d) != null) {
                    Iterator<g> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<s> L() throws C2689a {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void O(s sVar, t tVar) throws C2689a {
            g gVar;
            h hVar;
            h hVar2;
            String H = H();
            if (H == null) {
                throw new C2689a("Invalid pseudo class");
            }
            j d = j.d(H);
            a aVar = null;
            switch (a.b[d.ordinal()]) {
                case 1:
                    h hVar3 = new h(0, 1, true, false, null);
                    sVar.b();
                    hVar2 = hVar3;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    h hVar4 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 3:
                    gVar = new m(false, null);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    h hVar5 = new h(0, 1, false, true, tVar.b);
                    sVar.b();
                    gVar = hVar5;
                    tVar.b(gVar);
                    return;
                case 6:
                    gVar = new m(true, tVar.b);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 7:
                    gVar = new n(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 8:
                    gVar = new i(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = d == j.nth_child || d == j.nth_of_type;
                    boolean z2 = d == j.nth_of_type || d == j.nth_last_of_type;
                    a D = D();
                    if (D == null) {
                        throw new C2689a("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    hVar = new h(D.a, D.b, z, z2, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List<s> K = K();
                    if (K == null) {
                        throw new C2689a("Invalid or missing parameter section for pseudo class: " + H);
                    }
                    k kVar = new k(K);
                    sVar.b = kVar.b();
                    hVar2 = kVar;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    gVar = new o(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    gVar = new l(H);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    gVar = new l(H);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                default:
                    throw new C2689a("Unsupported pseudo class: " + H);
            }
        }

        private int P() {
            int i;
            if (h()) {
                return this.b;
            }
            int i2 = this.b;
            int charAt = this.a.charAt(i2);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int a2 = a();
                while (true) {
                    if ((a2 < 65 || a2 > 90) && ((a2 < 97 || a2 > 122) && !((a2 >= 48 && a2 <= 57) || a2 == 45 || a2 == 95))) {
                        break;
                    }
                    a2 = a();
                }
                i = this.b;
            }
            this.b = i2;
            return i;
        }

        String F() {
            int C;
            if (h()) {
                return null;
            }
            char charAt = this.a.charAt(this.b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.b++;
            int intValue = l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = l().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = l().intValue();
                        } else {
                            int C2 = C(intValue);
                            if (C2 != -1) {
                                for (int i = 1; i <= 5 && (C = C((intValue = l().intValue()))) != -1; i++) {
                                    C2 = (C2 * 16) + C;
                                }
                                sb.append((char) C2);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = l().intValue();
            }
            return sb.toString();
        }

        String H() {
            int P = P();
            int i = this.b;
            if (P == i) {
                return null;
            }
            String substring = this.a.substring(i, P);
            this.b = P;
            return substring;
        }

        String I() {
            char charAt;
            int C;
            StringBuilder sb = new StringBuilder();
            while (!h() && (charAt = this.a.charAt(this.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl((int) charAt)) {
                this.b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.a;
                        int i = this.b;
                        this.b = i + 1;
                        charAt = str.charAt(i);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int C2 = C(charAt);
                            if (C2 != -1) {
                                for (int i2 = 1; i2 <= 5 && !h() && (C = C(this.a.charAt(this.b))) != -1; i2++) {
                                    this.b++;
                                    C2 = (C2 * 16) + C;
                                }
                                sb.append((char) C2);
                            }
                        }
                    }
                }
                sb.append(charAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int charAt = this.a.charAt(i);
            int i2 = i;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i2 = this.b + 1;
                }
                charAt = a();
            }
            if (this.b > i) {
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean M(ax.o4.C2690b.s r11) throws ax.o4.C2689a {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2690b.d.M(ax.o4.b$s):boolean");
        }

        String N() {
            if (h()) {
                return null;
            }
            int i = this.b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F = F();
            if (F == null) {
                F = I();
            }
            if (F == null) {
                this.b = i;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F;
            }
            this.b = i;
            return null;
        }
    }

    /* renamed from: ax.o4.b$e */
    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: ax.o4.b$f */
    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* renamed from: ax.o4.b$g */
    private interface g {
        boolean a(q qVar, C2695g.L l);
    }

    /* renamed from: ax.o4.b$h */
    private static class h implements g {
        private int a;
        private int b;
        private boolean c;
        private boolean d;
        private String e;

        h(int i, int i2, boolean z, boolean z2, String str) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = z2;
            this.e = str;
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            int i;
            int i2;
            String o = (this.d && this.e == null) ? l.o() : this.e;
            C2695g.J j = l.b;
            if (j != null) {
                Iterator<C2695g.N> it = j.b().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    C2695g.L l2 = (C2695g.L) it.next();
                    if (l2 == l) {
                        i = i2;
                    }
                    if (o == null || l2.o().equals(o)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.c ? i + 1 : i2 - i;
            int i4 = this.a;
            if (i4 == 0) {
                return i3 == this.b;
            }
            int i5 = this.b;
            return (i3 - i5) % i4 == 0 && (Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.b) == Integer.signum(this.a));
        }

        public String toString() {
            String str = this.c ? HttpUrl.FRAGMENT_ENCODE_SET : "last-";
            return this.d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.a), Integer.valueOf(this.b), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    /* renamed from: ax.o4.b$i */
    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            return !(l instanceof C2695g.J) || ((C2695g.J) l).b().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* renamed from: ax.o4.b$j */
    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map<String, j> A0 = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    A0.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j d(String str) {
            j jVar = A0.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* renamed from: ax.o4.b$k */
    private static class k implements g {
        private List<s> a;

        k(List<s> list) {
            this.a = list;
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            Iterator<s> it = this.a.iterator();
            while (it.hasNext()) {
                if (C2690b.l(qVar, it.next(), l)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator<s> it = this.a.iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i2 = it.next().b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        public String toString() {
            return "not(" + this.a + ")";
        }
    }

    /* renamed from: ax.o4.b$l */
    private static class l implements g {
        private String a;

        l(String str) {
            this.a = str;
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    /* renamed from: ax.o4.b$m */
    private static class m implements g {
        private boolean a;
        private String b;

        public m(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            int i;
            String o = (this.a && this.b == null) ? l.o() : this.b;
            C2695g.J j = l.b;
            if (j != null) {
                Iterator<C2695g.N> it = j.b().iterator();
                i = 0;
                while (it.hasNext()) {
                    C2695g.L l2 = (C2695g.L) it.next();
                    if (o == null || l2.o().equals(o)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            return this.a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    /* renamed from: ax.o4.b$n */
    private static class n implements g {
        private n() {
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            return l.b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* renamed from: ax.o4.b$o */
    private static class o implements g {
        private o() {
        }

        @Override // ax.o4.C2690b.g
        public boolean a(q qVar, C2695g.L l) {
            return qVar != null && l == qVar.a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* renamed from: ax.o4.b$p */
    static class p {
        s a;
        C2695g.E b;
        u c;

        p(s sVar, C2695g.E e, u uVar) {
            this.a = sVar;
            this.b = e;
            this.c = uVar;
        }

        public String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    /* renamed from: ax.o4.b$q */
    static class q {
        C2695g.L a;

        q() {
        }

        public String toString() {
            C2695g.L l = this.a;
            return l != null ? String.format("<%s id=\"%s\">", l.o(), this.a.c) : HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: ax.o4.b$r */
    static class r {
        private List<p> a = null;

        r() {
        }

        void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i).a.b > pVar.a.b) {
                    this.a.add(i, pVar);
                    return;
                }
            }
            this.a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.a == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList(rVar.a.size());
            }
            Iterator<p> it = rVar.a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        List<p> c() {
            return this.a;
        }

        boolean d() {
            List<p> list = this.a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List<p> list = this.a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List<p> list = this.a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.a == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            StringBuilder sb = new StringBuilder();
            Iterator<p> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* renamed from: ax.o4.b$t */
    private static class t {
        e a;
        String b;
        List<C0396b> c = null;
        List<g> d = null;

        t(e eVar, String str) {
            this.a = null;
            this.b = null;
            this.a = eVar == null ? e.DESCENDANT : eVar;
            this.b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new C0396b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(gVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = this.a;
            if (eVar == e.CHILD) {
                sb.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C0396b> list = this.c;
            if (list != null) {
                for (C0396b c0396b : list) {
                    sb.append('[');
                    sb.append(c0396b.a);
                    int i = a.a[c0396b.b.ordinal()];
                    if (i == 1) {
                        sb.append('=');
                        sb.append(c0396b.c);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(c0396b.c);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(c0396b.c);
                    }
                    sb.append(']');
                }
            }
            List<g> list2 = this.d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: ax.o4.b$u */
    enum u {
        Document,
        RenderOptions
    }

    C2690b(f fVar, u uVar) {
        this.a = fVar;
        this.b = uVar;
    }

    private static int a(List<C2695g.J> list, int i2, C2695g.L l2) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        C2695g.J j2 = list.get(i2);
        C2695g.J j3 = l2.b;
        if (j2 != j3) {
            return -1;
        }
        Iterator<C2695g.N> it = j3.b().iterator();
        while (it.hasNext()) {
            if (it.next() == l2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List<f> list, f fVar) {
        for (f fVar2 : list) {
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws C2689a {
        String H = dVar.H();
        dVar.A();
        if (H == null) {
            throw new C2689a("Invalid '@' rule");
        }
        if (!this.c && H.equals("media")) {
            List<f> h2 = h(dVar);
            if (!dVar.f('{')) {
                throw new C2689a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(h2, this.a)) {
                this.c = true;
                rVar.b(j(dVar));
                this.c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new C2689a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.c || !H.equals("import")) {
            p("Ignoring @%s rule", H);
            o(dVar);
        } else {
            String N = dVar.N();
            if (N == null) {
                N = dVar.F();
            }
            if (N == null) {
                throw new C2689a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new C2689a("Invalid @media rule: expected '}' at end of rule set");
            }
            C2695g.k();
        }
        dVar.A();
    }

    public static List<String> f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String r2 = dVar.r();
            if (r2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r2);
                dVar.A();
            }
        }
        return arrayList;
    }

    private C2695g.E g(d dVar) throws C2689a {
        C2695g.E e2 = new C2695g.E();
        do {
            String H = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new C2689a("Expected ':'");
            }
            dVar.A();
            String J = dVar.J();
            if (J == null) {
                throw new C2689a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new C2689a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            ax.o4.k.S0(e2, H, J);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e2;
    }

    private static List<f> h(d dVar) {
        String w;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (w = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(w));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws C2689a {
        List L = dVar.L();
        if (L == null || L.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new C2689a("Malformed rule block: expected '{'");
        }
        dVar.A();
        C2695g.E g2 = g(dVar);
        dVar.A();
        Iterator it = L.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), g2, this.b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (C2689a e2) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e2.getMessage());
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i2, List<C2695g.J> list, int i3, C2695g.L l2) {
        t e2 = sVar.e(i2);
        if (!n(qVar, e2, list, i3, l2)) {
            return false;
        }
        e eVar = e2.a;
        if (eVar == e.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (m(qVar, sVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i2 - 1, list, i3);
        }
        int a2 = a(list, i3, l2);
        if (a2 <= 0) {
            return false;
        }
        return k(qVar, sVar, i2 - 1, list, i3, (C2695g.L) l2.b.b().get(a2 - 1));
    }

    static boolean l(q qVar, s sVar, C2695g.L l2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l2.b; obj != null; obj = ((C2695g.N) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l2) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l2);
    }

    private static boolean m(q qVar, s sVar, int i2, List<C2695g.J> list, int i3) {
        t e2 = sVar.e(i2);
        C2695g.L l2 = (C2695g.L) list.get(i3);
        if (!n(qVar, e2, list, i3, l2)) {
            return false;
        }
        e eVar = e2.a;
        if (eVar == e.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (m(qVar, sVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i2 - 1, list, i3 - 1);
        }
        int a2 = a(list, i3, l2);
        if (a2 <= 0) {
            return false;
        }
        return k(qVar, sVar, i2 - 1, list, i3, (C2695g.L) l2.b.b().get(a2 - 1));
    }

    private static boolean n(q qVar, t tVar, List<C2695g.J> list, int i2, C2695g.L l2) {
        List<String> list2;
        String str = tVar.b;
        if (str != null && !str.equals(l2.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0396b> list3 = tVar.c;
        if (list3 != null) {
            for (C0396b c0396b : list3) {
                String str2 = c0396b.a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0396b.c.equals(l2.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l2.g) == null || !list2.contains(c0396b.c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.d;
        if (list4 == null) {
            return true;
        }
        Iterator<g> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(qVar, l2)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i2 = 0;
        while (!dVar.h()) {
            int intValue = dVar.l().intValue();
            if (intValue == 59 && i2 == 0) {
                return;
            }
            if (intValue == 123) {
                i2++;
            } else if (intValue == 125 && i2 > 0 && i2 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.o4.b$s */
    static class s {
        List<t> a;
        int b;

        private s() {
            this.a = null;
            this.b = 0;
        }

        void a(t tVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(tVar);
        }

        void b() {
            this.b += 1000;
        }

        void c() {
            this.b++;
        }

        void d() {
            this.b += 1000000;
        }

        t e(int i) {
            return this.a.get(i);
        }

        boolean f() {
            List<t> list = this.a;
            return list == null || list.isEmpty();
        }

        int g() {
            List<t> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator<t> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
