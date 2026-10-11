/*
 * Decompiled with CFR 0.152.
 */
package ax.m2;

import android.annotation.SuppressLint;
import ax.Gb.g;
import ax.Ob.h;
import ax.k2.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class d {
    public static final b e = new b(null);
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<e> d;

    public d(String string, Map<String, a> map, Set<c> set, Set<e> set2) {
        ax.Gb.l.f(string, "name");
        ax.Gb.l.f(map, "columns");
        ax.Gb.l.f(set, "foreignKeys");
        this.a = string;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public static final d a(ax.o2.g g8, String string) {
        return e.a(g8, string);
    }

    public boolean equals(Object set) {
        if (this == set) {
            return true;
        }
        if (!(set instanceof d)) {
            return false;
        }
        Object object = this.a;
        d d8 = (d)((Object)set);
        if (!ax.Gb.l.a(object, d8.a)) {
            return false;
        }
        if (!ax.Gb.l.a(this.b, d8.b)) {
            return false;
        }
        if (!ax.Gb.l.a(this.c, d8.c)) {
            return false;
        }
        set = this.d;
        if (set != null && (object = d8.d) != null) {
            return ax.Gb.l.a(set, object);
        }
        return true;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + ((Object)this.b).hashCode()) * 31 + ((Object)this.c).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TableInfo{name='");
        stringBuilder.append(this.a);
        stringBuilder.append("', columns=");
        stringBuilder.append(this.b);
        stringBuilder.append(", foreignKeys=");
        stringBuilder.append(this.c);
        stringBuilder.append(", indices=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class ax.m2.d$a {
        public static final a h = new a(null);
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        public ax.m2.d$a(String string, String string2, boolean bl, int n8, String string3, int n9) {
            ax.Gb.l.f(string, "name");
            ax.Gb.l.f(string2, "type");
            this.a = string;
            this.b = string2;
            this.c = bl;
            this.d = n8;
            this.e = string3;
            this.f = n9;
            this.g = this.a(string2);
        }

        private final int a(String string) {
            if (string == null) {
                return 5;
            }
            Locale locale = Locale.US;
            ax.Gb.l.e(locale, "US");
            string = string.toUpperCase(locale);
            ax.Gb.l.e(string, "this as java.lang.String).toUpperCase(locale)");
            if (ax.Ob.h.M(string, "INT", false, 2, null)) {
                return 3;
            }
            if (!(ax.Ob.h.M(string, "CHAR", false, 2, null) || ax.Ob.h.M(string, "CLOB", false, 2, null) || ax.Ob.h.M(string, "TEXT", false, 2, null))) {
                if (ax.Ob.h.M(string, "BLOB", false, 2, null)) {
                    return 5;
                }
                if (!(ax.Ob.h.M(string, "REAL", false, 2, null) || ax.Ob.h.M(string, "FLOA", false, 2, null) || ax.Ob.h.M(string, "DOUB", false, 2, null))) {
                    return 1;
                }
                return 4;
            }
            return 2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ax.m2.d$a)) {
                return false;
            }
            if (this.d != ((ax.m2.d$a)object).d) {
                return false;
            }
            String string = this.a;
            object = (ax.m2.d$a)object;
            if (!ax.Gb.l.a(string, ((ax.m2.d$a)object).a)) {
                return false;
            }
            if (this.c != ((ax.m2.d$a)object).c) {
                return false;
            }
            if (this.f == 1 && ((ax.m2.d$a)object).f == 2 && (string = this.e) != null && !h.b(string, ((ax.m2.d$a)object).e)) {
                return false;
            }
            if (this.f == 2 && ((ax.m2.d$a)object).f == 1 && (string = ((ax.m2.d$a)object).e) != null && !h.b(string, this.e)) {
                return false;
            }
            int n8 = this.f;
            if (n8 != 0 && n8 == ((ax.m2.d$a)object).f && ((string = this.e) != null ? !h.b(string, ((ax.m2.d$a)object).e) : ((ax.m2.d$a)object).e != null)) {
                return false;
            }
            return this.g == ((ax.m2.d$a)object).g;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            int n9 = this.g;
            int n10 = this.c ? 1231 : 1237;
            return ((n8 * 31 + n9) * 31 + n10) * 31 + this.d;
        }

        public String toString() {
            String string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Column{name='");
            stringBuilder.append(this.a);
            stringBuilder.append("', type='");
            stringBuilder.append(this.b);
            stringBuilder.append("', affinity='");
            stringBuilder.append(this.g);
            stringBuilder.append("', notNull=");
            stringBuilder.append(this.c);
            stringBuilder.append(", primaryKeyPosition=");
            stringBuilder.append(this.d);
            stringBuilder.append(", defaultValue='");
            String string2 = string = this.e;
            if (string == null) {
                string2 = "undefined";
            }
            stringBuilder.append(string2);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }

            private final boolean a(String string) {
                if (string.length() == 0) {
                    return false;
                }
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                while (n8 < string.length()) {
                    int n11;
                    char c8 = string.charAt(n8);
                    if (n10 == 0 && c8 != '(') {
                        return false;
                    }
                    if (c8 == '(') {
                        n11 = n9 + 1;
                    } else {
                        n11 = n9--;
                        if (c8 == ')') {
                            n11 = n9;
                            if (n9 == 0) {
                                n11 = n9;
                                if (n10 != string.length() - 1) {
                                    return false;
                                }
                            }
                        }
                    }
                    ++n8;
                    ++n10;
                    n9 = n11;
                }
                return n9 == 0;
            }

            @SuppressLint(value={"SyntheticAccessor"})
            public final boolean b(String string, String string2) {
                ax.Gb.l.f(string, "current");
                if (ax.Gb.l.a(string, string2)) {
                    return true;
                }
                if (this.a(string)) {
                    string = string.substring(1, string.length() - 1);
                    ax.Gb.l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    return ax.Gb.l.a(((Object)ax.Ob.h.A0(string)).toString(), string2);
                }
                return false;
            }
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final d a(ax.o2.g g8, String string) {
            ax.Gb.l.f(g8, "database");
            ax.Gb.l.f(string, "tableName");
            return ax.m2.e.f(g8, string);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(String string, String string2, String string3, List<String> list, List<String> list2) {
            ax.Gb.l.f(string, "referenceTable");
            ax.Gb.l.f(string2, "onDelete");
            ax.Gb.l.f(string3, "onUpdate");
            ax.Gb.l.f(list, "columnNames");
            ax.Gb.l.f(list2, "referenceColumnNames");
            this.a = string;
            this.b = string2;
            this.c = string3;
            this.d = list;
            this.e = list2;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            String string = this.a;
            object = (c)object;
            if (!ax.Gb.l.a(string, ((c)object).a)) {
                return false;
            }
            if (!ax.Gb.l.a(this.b, ((c)object).b)) {
                return false;
            }
            if (!ax.Gb.l.a(this.c, ((c)object).c)) {
                return false;
            }
            if (!ax.Gb.l.a(this.d, ((c)object).d)) {
                return false;
            }
            return ax.Gb.l.a(this.e, ((c)object).e);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + ((Object)this.d).hashCode()) * 31 + ((Object)this.e).hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ForeignKey{referenceTable='");
            stringBuilder.append(this.a);
            stringBuilder.append("', onDelete='");
            stringBuilder.append(this.b);
            stringBuilder.append(" +', onUpdate='");
            stringBuilder.append(this.c);
            stringBuilder.append("', columnNames=");
            stringBuilder.append(this.d);
            stringBuilder.append(", referenceColumnNames=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static final class d
    implements Comparable<d> {
        private final int c0;
        private final String d0;
        private final String e0;
        private final int q;

        public d(int n8, int n9, String string, String string2) {
            ax.Gb.l.f(string, "from");
            ax.Gb.l.f(string2, "to");
            this.q = n8;
            this.c0 = n9;
            this.d0 = string;
            this.e0 = string2;
        }

        public int d(d d8) {
            int n8;
            ax.Gb.l.f(d8, "other");
            int n9 = n8 = this.q - d8.q;
            if (n8 == 0) {
                n9 = this.c0 - d8.c0;
            }
            return n9;
        }

        public final String h() {
            return this.d0;
        }

        public final int j() {
            return this.q;
        }

        public final String l() {
            return this.e0;
        }
    }

    public static final class e {
        public static final a e = new a(null);
        public final String a;
        public final boolean b;
        public final List<String> c;
        public List<String> d;

        public e(String list, boolean bl, List<String> list2, List<String> collection) {
            ax.Gb.l.f(list, "name");
            ax.Gb.l.f(list2, "columns");
            ax.Gb.l.f(collection, "orders");
            this.a = list;
            this.b = bl;
            this.c = list2;
            this.d = collection;
            collection = collection;
            list = collection;
            if (collection.isEmpty()) {
                int n8 = list2.size();
                list2 = new ArrayList<String>(n8);
                int n9 = 0;
                while (true) {
                    list = list2;
                    if (n9 >= n8) break;
                    ((ArrayList)list2).add(l.q.name());
                    ++n9;
                }
            }
            this.d = list;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof e)) {
                return false;
            }
            boolean bl = this.b;
            object = (e)object;
            if (bl != ((e)object).b) {
                return false;
            }
            if (!ax.Gb.l.a(this.c, ((e)object).c)) {
                return false;
            }
            if (!ax.Gb.l.a(this.d, ((e)object).d)) {
                return false;
            }
            if (h.H(this.a, "index_", false, 2, null)) {
                return h.H(((e)object).a, "index_", false, 2, null);
            }
            return ax.Gb.l.a(this.a, ((e)object).a);
        }

        public int hashCode() {
            int n8 = h.H(this.a, "index_", false, 2, null) ? -1184239155 : this.a.hashCode();
            return ((n8 * 31 + this.b) * 31 + ((Object)this.c).hashCode()) * 31 + ((Object)this.d).hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index{name='");
            stringBuilder.append(this.a);
            stringBuilder.append("', unique=");
            stringBuilder.append(this.b);
            stringBuilder.append(", columns=");
            stringBuilder.append(this.c);
            stringBuilder.append(", orders=");
            stringBuilder.append(this.d);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }
    }
}

