/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

import android.util.Log;
import ax.o4.g;
import ax.o4.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class b {
    private f a;
    private u b;
    private boolean c = false;

    b(f f8, u u8) {
        this.a = f8;
        this.b = u8;
    }

    private static int a(List<g.J> iterator, int n8, g.L l8) {
        g.J j8;
        int n9 = 0;
        if (n8 < 0) {
            return 0;
        }
        if ((iterator = iterator.get(n8)) != (j8 = l8.b)) {
            return -1;
        }
        iterator = j8.b().iterator();
        n8 = n9;
        while (iterator.hasNext()) {
            if (iterator.next() == l8) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    static boolean b(String object, f f8) {
        object = new d((String)object);
        ((k.i)object).A();
        return ax.o4.b.c(ax.o4.b.h((d)object), f8);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean c(List<f> object2, f f8) {
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            f var1_3;
            f f9 = (f)((Object)iterator.next());
            if (f9 != f.q && f9 != var1_3) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void e(r object, d d8) throws ax.o4.a {
        Object object2 = d8.H();
        d8.A();
        if (object2 == null) throw new ax.o4.a("Invalid '@' rule");
        if (!this.c && ((String)object2).equals("media")) {
            object2 = ax.o4.b.h(d8);
            if (!d8.f('{')) throw new ax.o4.a("Invalid @media rule: missing rule set");
            d8.A();
            if (ax.o4.b.c((List<f>)object2, this.a)) {
                this.c = true;
                ((r)object).b(this.j(d8));
                this.c = false;
            } else {
                this.j(d8);
            }
            if (!d8.h() && !d8.f('}')) {
                throw new ax.o4.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (!this.c && ((String)object2).equals("import")) {
            object = object2 = d8.N();
            if (object2 == null) {
                object = d8.F();
            }
            if (object == null) throw new ax.o4.a("Invalid @import rule: expected string or url()");
            d8.A();
            ax.o4.b.h(d8);
            if (!d8.h() && !d8.f(';')) {
                throw new ax.o4.a("Invalid @media rule: expected '}' at end of rule set");
            }
            ax.o4.g.k();
        } else {
            ax.o4.b.p("Ignoring @%s rule", object2);
            this.o(d8);
        }
        d8.A();
    }

    public static List<String> f(String object) {
        d d8 = new d((String)object);
        Object object2 = null;
        while (!d8.h()) {
            String string = d8.r();
            if (string == null) continue;
            object = object2;
            if (object2 == null) {
                object = new ArrayList();
            }
            object.add(string);
            d8.A();
            object2 = object;
        }
        return object2;
    }

    private g.E g(d d8) throws ax.o4.a {
        block4: {
            block5: {
                g.E e8 = new g.E();
                do {
                    String string = d8.H();
                    d8.A();
                    if (!d8.f(':')) break block4;
                    d8.A();
                    String string2 = d8.J();
                    if (string2 == null) break block5;
                    d8.A();
                    if (d8.f('!')) {
                        d8.A();
                        if (d8.g("important")) {
                            d8.A();
                        } else {
                            throw new ax.o4.a("Malformed rule set: found unexpected '!'");
                        }
                    }
                    d8.f(';');
                    ax.o4.k.S0(e8, string, string2);
                    d8.A();
                } while (!d8.h() && !d8.f('}'));
                return e8;
            }
            throw new ax.o4.a("Expected property value");
        }
        throw new ax.o4.a("Expected ':'");
    }

    private static List<f> h(d d8) {
        String string;
        ArrayList<f> arrayList = new ArrayList<f>();
        while (!d8.h() && (string = d8.w()) != null) {
            try {
                arrayList.add(f.valueOf(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
            if (d8.z()) continue;
        }
        return arrayList;
    }

    private boolean i(r r8, d object) throws ax.o4.a {
        List list = ((d)object).L();
        if (list != null && !list.isEmpty()) {
            if (((k.i)object).f('{')) {
                ((k.i)object).A();
                g.E e8 = this.g((d)object);
                ((k.i)object).A();
                object = list.iterator();
                while (object.hasNext()) {
                    r8.a(new p((s)object.next(), e8, this.b));
                }
                return true;
            }
            throw new ax.o4.a("Malformed rule block: expected '{'");
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private r j(d object) {
        ax.o4.a a82;
        r r8 = new r();
        while (true) {
            block6: {
                try {
                    while (!((k.i)object).h()) {
                        if (((k.i)object).g("<!--") || ((k.i)object).g("-->")) continue;
                        if (((k.i)object).f('@')) {
                            this.e(r8, (d)object);
                            continue;
                        }
                        break block6;
                    }
                    return r8;
                }
                catch (ax.o4.a a82) {
                    break;
                }
            }
            boolean bl = this.i(r8, (d)object);
            if (!bl) return r8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("CSS parser terminated early due to error: ");
        ((StringBuilder)object).append(a82.getMessage());
        Log.e((String)"CSSParser", (String)((StringBuilder)object).toString());
        return r8;
    }

    private static boolean k(q q8, s s8, int n8, List<g.J> list, int n9, g.L l8) {
        Object object = s8.e(n8);
        if (!ax.o4.b.n(q8, object, list, n9, l8)) {
            return false;
        }
        object = object.a;
        if (object == e.q) {
            if (n8 == 0) {
                return true;
            }
            while (n9 >= 0) {
                if (ax.o4.b.m(q8, s8, n8 - 1, list, n9)) {
                    return true;
                }
                --n9;
            }
            return false;
        }
        if (object == e.c0) {
            return ax.o4.b.m(q8, s8, n8 - 1, list, n9);
        }
        int n10 = ax.o4.b.a(list, n9, l8);
        if (n10 <= 0) {
            return false;
        }
        return ax.o4.b.k(q8, s8, n8 - 1, list, n9, (g.L)l8.b.b().get(n10 - 1));
    }

    static boolean l(q q8, s s8, g.L l8) {
        ArrayList<g.J> arrayList = new ArrayList<g.J>();
        g.J j8 = l8.b;
        while (j8 != null) {
            arrayList.add(0, j8);
            j8 = ((g.N)((Object)j8)).b;
        }
        int n8 = arrayList.size() - 1;
        if (s8.g() == 1) {
            return ax.o4.b.n(q8, s8.e(0), arrayList, n8, l8);
        }
        return ax.o4.b.k(q8, s8, s8.g() - 1, arrayList, n8, l8);
    }

    private static boolean m(q q8, s s8, int n8, List<g.J> list, int n9) {
        g.L l8;
        Object object = s8.e(n8);
        if (!ax.o4.b.n(q8, object, list, n9, l8 = (g.L)((Object)list.get(n9)))) {
            return false;
        }
        object = object.a;
        if (object == e.q) {
            if (n8 == 0) {
                return true;
            }
            while (n9 > 0) {
                int n10;
                n9 = n10 = n9 - 1;
                if (!ax.o4.b.m(q8, s8, n8 - 1, list, n10)) continue;
                return true;
            }
            return false;
        }
        if (object == e.c0) {
            return ax.o4.b.m(q8, s8, n8 - 1, list, n9 - 1);
        }
        int n11 = ax.o4.b.a(list, n9, l8);
        if (n11 <= 0) {
            return false;
        }
        return ax.o4.b.k(q8, s8, n8 - 1, list, n9, (g.L)l8.b.b().get(n11 - 1));
    }

    private static boolean n(q q8, t iterator, List<g.J> list, int n8, g.L l8) {
        list = ((t)((Object)iterator)).b;
        if (list != null && !((String)((Object)list)).equals(l8.o().toLowerCase(Locale.US))) {
            return false;
        }
        list = ((t)((Object)iterator)).c;
        if (list != null) {
            for (b b8 : list) {
                List<String> list2 = b8.a;
                list2.getClass();
                if (!((String)((Object)list2)).equals("id")) {
                    if (!((String)((Object)list2)).equals("class")) {
                        return false;
                    }
                    list2 = l8.g;
                    if (list2 == null) {
                        return false;
                    }
                    if (list2.contains(b8.c)) continue;
                    return false;
                }
                if (b8.c.equals(l8.c)) continue;
                return false;
            }
        }
        if ((iterator = ((t)((Object)iterator)).d) != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if (((g)iterator.next()).a(q8, l8)) continue;
                return false;
            }
        }
        return true;
    }

    private void o(d d8) {
        int n8;
        int n9 = 0;
        while (!(d8.h() || (n8 = d8.l().intValue()) == 59 && n9 == 0)) {
            if (n8 == 123) {
                ++n9;
                continue;
            }
            if (n8 != 125 || n9 <= 0) continue;
            n9 = n8 = n9 - 1;
            if (n8 != 0) continue;
        }
    }

    private static void p(String string, Object ... objectArray) {
        Log.w((String)"CSSParser", (String)String.format(string, objectArray));
    }

    r d(String object) {
        object = new d((String)object);
        ((k.i)object).A();
        return this.j((d)object);
    }

    private static class b {
        public final String a;
        final c b;
        public final String c;

        b(String string, c c8, String string2) {
            this.a = string;
            this.b = c8;
            this.c = string2;
        }
    }

    private static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        private static final c[] f0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            q = c11 = new c();
            c0 = c10 = new c();
            d0 = c9 = new c();
            e0 = c8 = new c();
            f0 = new c[]{c11, c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])f0.clone();
        }
    }

    private static class d
    extends k.i {
        d(String string) {
            super(string.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int n8) {
            if (n8 >= 48 && n8 <= 57) {
                return n8 - 48;
            }
            if (n8 >= 65 && n8 <= 70) {
                return n8 - 55;
            }
            if (n8 >= 97 && n8 <= 102) {
                return n8 - 87;
            }
            return -1;
        }

        /*
         * Enabled aggressive block sorting
         */
        private a D() throws ax.o4.a {
            Object object;
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            if (!this.f('(')) {
                return null;
            }
            this.A();
            boolean bl = this.g("odd");
            int n9 = 1;
            int n10 = 1;
            if (bl) {
                object = new a(2, 1);
            } else {
                bl = this.g("even");
                int n11 = 0;
                if (bl) {
                    object = new a(2, 0);
                } else {
                    Object object2;
                    int n12 = !this.f('+') && this.f('-') ? -1 : 1;
                    object = ax.o4.c.c(this.a, this.b, this.c, false);
                    if (object != null) {
                        this.b = ((ax.o4.c)object).a();
                    }
                    if (!this.f('n') && !this.f('N')) {
                        object2 = object;
                        object = null;
                    } else {
                        boolean bl2;
                        if (object == null) {
                            object = new ax.o4.c(1L, this.b);
                        }
                        this.A();
                        bl = bl2 = this.f('+');
                        n9 = n10;
                        if (!bl2) {
                            bl = bl2 = this.f('-');
                            n9 = n10;
                            if (bl2) {
                                n9 = -1;
                                bl = bl2;
                            }
                        }
                        if (bl) {
                            this.A();
                            object2 = ax.o4.c.c(this.a, this.b, this.c, false);
                            if (object2 == null) {
                                this.b = n8;
                                return null;
                            }
                            this.b = ((ax.o4.c)object2).a();
                            n10 = n12;
                            n12 = n9;
                            n9 = n10;
                        } else {
                            n10 = n12;
                            n12 = n9;
                            object2 = null;
                            n9 = n10;
                        }
                    }
                    n9 = object == null ? 0 : (n9 *= ((ax.o4.c)object).d());
                    n12 = object2 == null ? n11 : (n12 *= ((ax.o4.c)object2).d());
                    object = new a(n9, n12);
                }
            }
            this.A();
            if (this.f(')')) {
                return object;
            }
            this.b = n8;
            return null;
        }

        private String E() {
            if (this.h()) {
                return null;
            }
            String string = this.q();
            if (string != null) {
                return string;
            }
            return this.H();
        }

        private List<String> G() throws ax.o4.a {
            ArrayList<String> arrayList;
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            if (!this.f('(')) {
                return null;
            }
            this.A();
            ArrayList<String> arrayList2 = null;
            do {
                String string;
                if ((string = this.H()) == null) {
                    this.b = n8;
                    return null;
                }
                arrayList = arrayList2;
                if (arrayList2 == null) {
                    arrayList = new ArrayList<String>();
                }
                arrayList.add(string);
                this.A();
                arrayList2 = arrayList;
            } while (this.z());
            if (this.f(')')) {
                return arrayList;
            }
            this.b = n8;
            return null;
        }

        private List<s> K() throws ax.o4.a {
            Object object;
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            if (!this.f('(')) {
                return null;
            }
            this.A();
            List<s> list = this.L();
            if (list == null) {
                this.b = n8;
                return null;
            }
            if (!this.f(')')) {
                this.b = n8;
                return null;
            }
            Iterator<s> iterator = list.iterator();
            while (iterator.hasNext() && (object = iterator.next().a) != null) {
                Object object2;
                object = object.iterator();
                while (object.hasNext() && (object2 = ((t)object.next()).d) != null) {
                    object2 = object2.iterator();
                    while (object2.hasNext()) {
                        if (!((g)object2.next() instanceof k)) continue;
                        return null;
                    }
                }
            }
            return list;
        }

        private List<s> L() throws ax.o4.a {
            if (this.h()) {
                return null;
            }
            ArrayList<s> arrayList = new ArrayList<s>(1);
            s s8 = new s();
            while (!this.h() && this.M(s8)) {
                if (!this.z()) continue;
                arrayList.add(s8);
                s8 = new s();
            }
            if (!s8.f()) {
                arrayList.add(s8);
            }
            return arrayList;
        }

        private void O(s object, t t8) throws ax.o4.a {
            Object object2 = this.H();
            if (object2 != null) {
                Object object3 = j.d((String)object2);
                switch (ax.o4.b$a.b[object3.ordinal()]) {
                    default: {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unsupported pseudo class: ");
                        ((StringBuilder)object).append((String)object2);
                        throw new ax.o4.a(((StringBuilder)object).toString());
                    }
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: {
                        object2 = new l((String)object2);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 15: {
                        this.G();
                        object2 = new l((String)object2);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 14: {
                        object2 = new o();
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 13: {
                        object3 = this.K();
                        if (object3 != null) {
                            object2 = new k((List<s>)object3);
                            ((s)object).b = ((k)object2).b();
                            object = object2;
                            break;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid or missing parameter section for pseudo class: ");
                        ((StringBuilder)object).append((String)object2);
                        throw new ax.o4.a(((StringBuilder)object).toString());
                    }
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: {
                        boolean bl = object3 == j.d0 || object3 == j.f0;
                        boolean bl2 = object3 == j.f0 || object3 == j.g0;
                        object3 = this.D();
                        if (object3 != null) {
                            object2 = new h(((a)object3).a, ((a)object3).b, bl, bl2, t8.b);
                            ((s)object).b();
                            object = object2;
                            break;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid or missing parameter section for pseudo class: ");
                        ((StringBuilder)object).append((String)object2);
                        throw new ax.o4.a(((StringBuilder)object).toString());
                    }
                    case 8: {
                        object2 = new i();
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 7: {
                        object2 = new n();
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 6: {
                        object2 = new m(true, t8.b);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 5: {
                        object2 = new h(0, 1, false, true, t8.b);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 4: {
                        object2 = new h(0, 1, true, true, t8.b);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 3: {
                        object2 = new m(false, null);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 2: {
                        object2 = new h(0, 1, false, false, null);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                    case 1: {
                        object2 = new h(0, 1, true, false, null);
                        ((s)object).b();
                        object = object2;
                        break;
                    }
                }
                t8.b((g)object);
                return;
            }
            throw new ax.o4.a("Invalid pseudo class");
        }

        private int P() {
            int n8;
            int n9;
            block5: {
                int n10;
                if (this.h()) {
                    return this.b;
                }
                n9 = this.b;
                n8 = n10 = this.a.charAt(n9);
                if (n10 == 45) {
                    n8 = this.a();
                }
                if (n8 >= 65 && n8 <= 90 || n8 >= 97 && n8 <= 122 || n8 == 95) {
                    n8 = this.a();
                    while (true) {
                        if (!(n8 >= 65 && n8 <= 90 || n8 >= 97 && n8 <= 122 || n8 >= 48 && n8 <= 57 || n8 == 45 || n8 == 95)) {
                            n8 = this.b;
                            break block5;
                        }
                        n8 = this.a();
                    }
                }
                n8 = n9;
            }
            this.b = n9;
            return n8;
        }

        String F() {
            if (this.h()) {
                return null;
            }
            char c8 = this.a.charAt(this.b);
            if (c8 != '\'' && c8 != '\"') {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            ++this.b;
            int n8 = this.l();
            while (n8 != -1 && n8 != c8) {
                int n9 = n8;
                if (n8 == 92) {
                    n8 = this.l();
                    if (n8 == -1) continue;
                    if (n8 != 10 && n8 != 13 && n8 != 12) {
                        int n10 = this.C(n8);
                        n9 = n8;
                        if (n10 != -1) {
                            int n11;
                            for (n9 = 1; n9 <= 5 && (n11 = this.C(n8 = this.l().intValue())) != -1; ++n9) {
                                n10 = n10 * 16 + n11;
                            }
                            stringBuilder.append((char)n10);
                            continue;
                        }
                    } else {
                        n8 = this.l();
                        continue;
                    }
                }
                stringBuilder.append((char)n9);
                n8 = this.l();
            }
            return stringBuilder.toString();
        }

        String H() {
            int n8;
            int n9 = this.P();
            if (n9 == (n8 = this.b)) {
                return null;
            }
            String string = this.a.substring(n8, n9);
            this.b = n9;
            return string;
        }

        String I() {
            int n8;
            StringBuilder stringBuilder = new StringBuilder();
            while (!(this.h() || (n8 = this.a.charAt(this.b)) == 39 || n8 == 34 || n8 == 40 || n8 == 41 || this.k(n8) || Character.isISOControl(n8))) {
                ++this.b;
                int n9 = n8;
                if (n8 == 92) {
                    if (this.h()) continue;
                    String string = this.a;
                    n9 = this.b;
                    this.b = n9 + 1;
                    if ((n9 = (int)string.charAt(n9)) == 10 || n9 == 13 || n9 == 12) continue;
                    n8 = this.C(n9);
                    if (n8 != -1) {
                        int n10;
                        for (n9 = 1; n9 <= 5 && !this.h() && (n10 = this.C(this.a.charAt(this.b))) != -1; ++n9) {
                            ++this.b;
                            n8 = n8 * 16 + n10;
                        }
                        stringBuilder.append((char)n8);
                        continue;
                    }
                }
                stringBuilder.append((char)n9);
            }
            if (stringBuilder.length() == 0) {
                return null;
            }
            return stringBuilder.toString();
        }

        String J() {
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            int n9 = this.a.charAt(n8);
            int n10 = n8;
            while (n9 != -1 && n9 != 59 && n9 != 125 && n9 != 33 && !this.j(n9)) {
                if (!this.k(n9)) {
                    n10 = this.b + 1;
                }
                n9 = this.a();
            }
            if (this.b > n8) {
                return this.a.substring(n8, n10);
            }
            this.b = n8;
            return null;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        boolean M(s var1_1) throws ax.o4.a {
            if (this.h()) {
                return false;
            }
            var2_2 = this.b;
            if (var1_1.f()) ** GOTO lbl-1000
            if (this.f('>')) {
                var4_3 = e.c0;
                this.A();
            } else if (this.f('+')) {
                var4_3 = e.d0;
                this.A();
            } else lbl-1000:
            // 2 sources

            {
                var4_3 = null;
            }
            if (this.f('*')) {
                var3_4 /* !! */  = new t(var4_3, null);
            } else {
                var3_4 /* !! */  = this.H();
                if (var3_4 /* !! */  != null) {
                    var3_4 /* !! */  = new t(var4_3, (String)var3_4 /* !! */ );
                    var1_1.c();
                } else {
                    var3_4 /* !! */  = null;
                }
            }
            while (!this.h()) {
                block23: {
                    block24: {
                        if (this.f('.')) {
                            var5_5 = var3_4 /* !! */ ;
                            if (var3_4 /* !! */  == null) {
                                var5_5 = new t(var4_3, null);
                            }
                            if ((var3_4 /* !! */  = this.H()) != null) {
                                var5_5.a("class", ax.o4.b$c.c0, (String)var3_4 /* !! */ );
                                var1_1.b();
                                var3_4 /* !! */  = var5_5;
                                continue;
                            }
                            throw new ax.o4.a("Invalid \".class\" simpleSelectors");
                        }
                        if (this.f('#')) {
                            var5_5 = var3_4 /* !! */ ;
                            if (var3_4 /* !! */  == null) {
                                var5_5 = new t(var4_3, null);
                            }
                            if ((var3_4 /* !! */  = this.H()) != null) {
                                var5_5.a("id", ax.o4.b$c.c0, (String)var3_4 /* !! */ );
                                var1_1.d();
                                var3_4 /* !! */  = var5_5;
                                continue;
                            }
                            throw new ax.o4.a("Invalid \"#id\" simpleSelectors");
                        }
                        if (!this.f('[')) break block23;
                        var5_5 = var3_4 /* !! */ ;
                        if (var3_4 /* !! */  == null) {
                            var5_5 = new t(var4_3, null);
                        }
                        this.A();
                        var8_8 = this.H();
                        if (var8_8 == null) break block24;
                        this.A();
                        var3_4 /* !! */  = this.f('=') != false ? ax.o4.b$c.c0 : (this.g("~=") != false ? ax.o4.b$c.d0 : (this.g("|=") != false ? ax.o4.b$c.e0 : null));
                        if (var3_4 /* !! */  == null) ** GOTO lbl60
                        this.A();
                        var6_6 = this.E();
                        if (var6_6 != null) {
                            this.A();
                        } else {
                            throw new ax.o4.a("Invalid attribute simpleSelectors");
lbl60:
                            // 1 sources

                            var6_6 = null;
                        }
                        if (this.f(']')) {
                            var7_7 /* !! */  = var3_4 /* !! */ ;
                            if (var3_4 /* !! */  == null) {
                                var7_7 /* !! */  = ax.o4.b$c.q;
                            }
                            var5_5.a(var8_8, (c)var7_7 /* !! */ , var6_6);
                            var1_1.b();
                            var3_4 /* !! */  = var5_5;
                            continue;
                        }
                        throw new ax.o4.a("Invalid attribute simpleSelectors");
                    }
                    throw new ax.o4.a("Invalid attribute simpleSelectors");
                }
                if (!this.f(':')) break;
                var5_5 = var3_4 /* !! */ ;
                if (var3_4 /* !! */  == null) {
                    var5_5 = new t(var4_3, null);
                }
                this.O(var1_1, (t)var5_5);
                var3_4 /* !! */  = var5_5;
            }
            if (var3_4 /* !! */  != null) {
                var1_1.a((t)var3_4 /* !! */ );
                return true;
            }
            this.b = var2_2;
            return false;
        }

        String N() {
            String string;
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            if (!this.g("url(")) {
                return null;
            }
            this.A();
            String string2 = string = this.F();
            if (string == null) {
                string2 = this.I();
            }
            if (string2 == null) {
                this.b = n8;
                return null;
            }
            this.A();
            if (!this.h() && !this.g(")")) {
                this.b = n8;
                return null;
            }
            return string2;
        }

        private static class a {
            public int a;
            public int b;

            a(int n8, int n9) {
                this.a = n8;
                this.b = n9;
            }
        }
    }

    private static final class e
    extends Enum<e> {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        private static final e[] e0;
        public static final /* enum */ e q;

        static {
            e e8;
            e e9;
            e e10;
            q = e10 = new e();
            c0 = e9 = new e();
            d0 = e8 = new e();
            e0 = new e[]{e10, e9, e8};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])e0.clone();
        }
    }

    static final class f
    extends Enum<f> {
        public static final /* enum */ f c0;
        public static final /* enum */ f d0;
        public static final /* enum */ f e0;
        public static final /* enum */ f f0;
        public static final /* enum */ f g0;
        public static final /* enum */ f h0;
        public static final /* enum */ f i0;
        public static final /* enum */ f j0;
        public static final /* enum */ f k0;
        public static final /* enum */ f l0;
        private static final f[] m0;
        public static final /* enum */ f q;

        static {
            f f8;
            f f9;
            f f10;
            f f11;
            f f12;
            f f13;
            f f14;
            f f15;
            f f16;
            f f17;
            f f18;
            q = f18 = new f();
            c0 = f17 = new f();
            d0 = f16 = new f();
            e0 = f15 = new f();
            f0 = f14 = new f();
            g0 = f13 = new f();
            h0 = f12 = new f();
            i0 = f11 = new f();
            j0 = f10 = new f();
            k0 = f9 = new f();
            l0 = f8 = new f();
            m0 = new f[]{f18, f17, f16, f15, f14, f13, f12, f11, f10, f9, f8};
        }

        public static f valueOf(String string) {
            return Enum.valueOf(f.class, string);
        }

        public static f[] values() {
            return (f[])m0.clone();
        }
    }

    private static interface g {
        public boolean a(q var1, g.L var2);
    }

    private static class h
    implements g {
        private int a;
        private int b;
        private boolean c;
        private boolean d;
        private String e;

        h(int n8, int n9, boolean bl, boolean bl2, String string) {
            this.a = n8;
            this.b = n9;
            this.c = bl;
            this.d = bl2;
            this.e = string;
        }

        @Override
        public boolean a(q object, g.L l8) {
            int n8;
            int n9;
            int n10;
            int n11;
            object = this.d && this.e == null ? l8.o() : this.e;
            Object object2 = l8.b;
            if (object2 != null) {
                Iterator<g.N> iterator = object2.b().iterator();
                n11 = 0;
                n10 = 0;
                while (true) {
                    n9 = n11;
                    n8 = n10;
                    if (iterator.hasNext()) {
                        object2 = (g.L)iterator.next();
                        n8 = n11;
                        if (object2 == l8) {
                            n8 = n10;
                        }
                        if (object != null) {
                            n11 = n8;
                            if (!((g.N)object2).o().equals(object)) continue;
                        }
                        ++n10;
                        n11 = n8;
                        continue;
                    }
                    break;
                }
            } else {
                n9 = 0;
                n8 = 1;
            }
            n10 = this.c ? n9 + 1 : n8 - n9;
            n8 = this.a;
            if (n8 == 0) {
                return n10 == this.b;
            }
            n11 = this.b;
            return (n10 - n11) % n8 == 0 && (Integer.signum(n10 - n11) == 0 || Integer.signum(n10 - this.b) == Integer.signum(this.a));
        }

        public String toString() {
            String string = this.c ? "" : "last-";
            if (this.d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", string, this.a, this.b, this.e);
            }
            return String.format("nth-%schild(%dn%+d)", string, this.a, this.b);
        }
    }

    private static class i
    implements g {
        private i() {
        }

        @Override
        public boolean a(q q8, g.L l8) {
            if (l8 instanceof g.J) {
                return ((g.J)((Object)l8)).b().size() == 0;
            }
            return true;
        }

        public String toString() {
            return "empty";
        }
    }

    private static final class j
    extends Enum<j> {
        private static final Map<String, j> A0;
        private static final j[] B0;
        public static final /* enum */ j c0;
        public static final /* enum */ j d0;
        public static final /* enum */ j e0;
        public static final /* enum */ j f0;
        public static final /* enum */ j g0;
        public static final /* enum */ j h0;
        public static final /* enum */ j i0;
        public static final /* enum */ j j0;
        public static final /* enum */ j k0;
        public static final /* enum */ j l0;
        public static final /* enum */ j m0;
        public static final /* enum */ j n0;
        public static final /* enum */ j o0;
        public static final /* enum */ j p0;
        public static final /* enum */ j q;
        public static final /* enum */ j q0;
        public static final /* enum */ j r0;
        public static final /* enum */ j s0;
        public static final /* enum */ j t0;
        public static final /* enum */ j u0;
        public static final /* enum */ j v0;
        public static final /* enum */ j w0;
        public static final /* enum */ j x0;
        public static final /* enum */ j y0;
        public static final /* enum */ j z0;

        static {
            j j8;
            j j9;
            Object object;
            j j10;
            j j11;
            j j12;
            j j13;
            j j14;
            j j15;
            j j162;
            j j17;
            j j18;
            j j19;
            j j20;
            j j21;
            j j22;
            j j23;
            j j24;
            j j25;
            j j26;
            j j27;
            j j28;
            j j29;
            j j30;
            q = j30 = new j();
            c0 = j29 = new j();
            d0 = j28 = new j();
            e0 = j27 = new j();
            f0 = j26 = new j();
            g0 = j25 = new j();
            h0 = j24 = new j();
            i0 = j23 = new j();
            j0 = j22 = new j();
            k0 = j21 = new j();
            l0 = j20 = new j();
            m0 = j19 = new j();
            n0 = j18 = new j();
            j[] jArray = new j();
            o0 = jArray;
            p0 = j17 = new j();
            q0 = j162 = new j();
            r0 = j15 = new j();
            s0 = j14 = new j();
            t0 = j13 = new j();
            u0 = j12 = new j();
            v0 = j11 = new j();
            w0 = j10 = new j();
            x0 = object = new j();
            y0 = j9 = new j();
            z0 = j8 = new j();
            B0 = new j[]{j30, j29, j28, j27, j26, j25, j24, j23, j22, j21, j20, j19, j18, jArray, j17, j162, j15, j14, j13, j12, j11, j10, object, j9, j8};
            A0 = new HashMap<String, j>();
            for (j j162 : j.values()) {
                if (j162 == z0) continue;
                object = j162.name().replace('_', '-');
                A0.put((String)object, j162);
            }
        }

        public static j d(String object) {
            if ((object = A0.get(object)) != null) {
                return object;
            }
            return z0;
        }

        public static j valueOf(String string) {
            return Enum.valueOf(j.class, string);
        }

        public static j[] values() {
            return (j[])B0.clone();
        }
    }

    private static class k
    implements g {
        private List<s> a;

        k(List<s> list) {
            this.a = list;
        }

        @Override
        public boolean a(q q8, g.L l8) {
            Iterator<s> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (!ax.o4.b.l(q8, iterator.next(), l8)) continue;
                return false;
            }
            return true;
        }

        int b() {
            Iterator<s> iterator = this.a.iterator();
            int n8 = Integer.MIN_VALUE;
            while (iterator.hasNext()) {
                int n9 = iterator.next().b;
                if (n9 <= n8) continue;
                n8 = n9;
            }
            return n8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not(");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class l
    implements g {
        private String a;

        l(String string) {
            this.a = string;
        }

        @Override
        public boolean a(q q8, g.L l8) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    private static class m
    implements g {
        private boolean a;
        private String b;

        public m(boolean bl, String string) {
            this.a = bl;
            this.b = string;
        }

        @Override
        public boolean a(q object, g.L object2) {
            int n8;
            object = this.a && this.b == null ? ((g.N)object2).o() : this.b;
            object2 = ((g.N)object2).b;
            if (object2 != null) {
                object2 = object2.b().iterator();
                int n9 = 0;
                while (true) {
                    n8 = ++n9;
                    if (object2.hasNext()) {
                        g.L l8 = (g.L)object2.next();
                        if (object != null && !l8.o().equals(object)) continue;
                        continue;
                    }
                    break;
                }
            } else {
                n8 = 1;
            }
            return n8 == 1;
        }

        public String toString() {
            if (this.a) {
                return String.format("only-of-type <%s>", this.b);
            }
            return String.format("only-child", new Object[0]);
        }
    }

    private static class n
    implements g {
        private n() {
        }

        @Override
        public boolean a(q q8, g.L l8) {
            return l8.b == null;
        }

        public String toString() {
            return "root";
        }
    }

    private static class o
    implements g {
        private o() {
        }

        @Override
        public boolean a(q q8, g.L l8) {
            return q8 != null && l8 == q8.a;
        }

        public String toString() {
            return "target";
        }
    }

    static class p {
        s a;
        g.E b;
        u c;

        p(s s8, g.E e8, u u8) {
            this.a = s8;
            this.b = e8;
            this.c = u8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(this.a));
            stringBuilder.append(" {...} (src=");
            stringBuilder.append((Object)this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static class q {
        g.L a;

        q() {
        }

        public String toString() {
            g.L l8 = this.a;
            if (l8 != null) {
                return String.format("<%s id=\"%s\">", l8.o(), this.a.c);
            }
            return "";
        }
    }

    static class r {
        private List<p> a = null;

        r() {
        }

        void a(p p8) {
            if (this.a == null) {
                this.a = new ArrayList<p>();
            }
            for (int i8 = 0; i8 < this.a.size(); ++i8) {
                if (this.a.get((int)i8).a.b <= p8.a.b) continue;
                this.a.add(i8, p8);
                return;
            }
            this.a.add(p8);
        }

        void b(r object) {
            if (((r)object).a != null) {
                if (this.a == null) {
                    this.a = new ArrayList<p>(((r)object).a.size());
                }
                object = ((r)object).a.iterator();
                while (object.hasNext()) {
                    this.a((p)object.next());
                }
            }
        }

        List<p> c() {
            return this.a;
        }

        boolean d() {
            List<p> list = this.a;
            return list == null || list.isEmpty();
            {
            }
        }

        void e(u u8) {
            List<p> list = this.a;
            if (list != null) {
                list = list.iterator();
                while (list.hasNext()) {
                    if (((p)list.next()).c != u8) continue;
                    list.remove();
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
                return "";
            }
            StringBuilder stringBuilder = new StringBuilder();
            Iterator<p> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(iterator.next().toString());
                stringBuilder.append('\n');
            }
            return stringBuilder.toString();
        }
    }

    private static class s {
        List<t> a = null;
        int b = 0;

        private s() {
        }

        void a(t t8) {
            if (this.a == null) {
                this.a = new ArrayList<t>();
            }
            this.a.add(t8);
        }

        void b() {
            this.b += 1000;
        }

        void c() {
            ++this.b;
        }

        void d() {
            this.b += 1000000;
        }

        t e(int n8) {
            return this.a.get(n8);
        }

        boolean f() {
            List<t> list = this.a;
            return list == null || list.isEmpty();
            {
            }
        }

        int g() {
            List<t> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator<t> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(iterator.next());
                stringBuilder.append(' ');
            }
            stringBuilder.append('[');
            stringBuilder.append(this.b);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    private static class t {
        e a = null;
        String b = null;
        List<b> c = null;
        List<g> d = null;

        t(e e8, String string) {
            if (e8 == null) {
                e8 = e.q;
            }
            this.a = e8;
            this.b = string;
        }

        void a(String string, c c8, String string2) {
            if (this.c == null) {
                this.c = new ArrayList<b>();
            }
            this.c.add(new b(string, c8, string2));
        }

        void b(g g8) {
            if (this.d == null) {
                this.d = new ArrayList<g>();
            }
            this.d.add(g8);
        }

        public String toString() {
            Object object;
            StringBuilder stringBuilder = new StringBuilder();
            Object object2 = this.a;
            if (object2 == e.c0) {
                stringBuilder.append("> ");
            } else if (object2 == e.d0) {
                stringBuilder.append("+ ");
            }
            object2 = object = this.b;
            if (object == null) {
                object2 = "*";
            }
            stringBuilder.append((String)object2);
            object2 = this.c;
            if (object2 != null) {
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    object = (b)object2.next();
                    stringBuilder.append('[');
                    stringBuilder.append(((b)object).a);
                    int n8 = ax.o4.b$a.a[((b)object).b.ordinal()];
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 == 3) {
                                stringBuilder.append("|=");
                                stringBuilder.append(((b)object).c);
                            }
                        } else {
                            stringBuilder.append("~=");
                            stringBuilder.append(((b)object).c);
                        }
                    } else {
                        stringBuilder.append('=');
                        stringBuilder.append(((b)object).c);
                    }
                    stringBuilder.append(']');
                }
            }
            if ((object2 = this.d) != null) {
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    object = (g)object2.next();
                    stringBuilder.append(':');
                    stringBuilder.append(object);
                }
            }
            return stringBuilder.toString();
        }
    }

    static final class u
    extends Enum<u> {
        public static final /* enum */ u c0;
        private static final u[] d0;
        public static final /* enum */ u q;

        static {
            u u8;
            u u9;
            q = u9 = new u();
            c0 = u8 = new u();
            d0 = new u[]{u9, u8};
        }

        public static u valueOf(String string) {
            return Enum.valueOf(u.class, string);
        }

        public static u[] values() {
            return (u[])d0.clone();
        }
    }
}

