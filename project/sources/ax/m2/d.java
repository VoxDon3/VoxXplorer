package ax.m2;

import android.annotation.SuppressLint;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.k2.EnumC2381l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    public static final b e = new b(null);
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<e> d;

    public static final class a {
        public static final C0370a h = new C0370a(null);
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        /* renamed from: ax.m2.d$a$a, reason: collision with other inner class name */
        public static final class C0370a {
            public /* synthetic */ C0370a(g gVar) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            @SuppressLint({"SyntheticAccessor"})
            public final boolean b(String str, String str2) {
                l.f(str, "current");
                if (l.a(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return l.a(h.A0(substring).toString(), str2);
            }

            private C0370a() {
            }
        }

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            l.f(str, "name");
            l.f(str2, "type");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            this.g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            l.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            l.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (h.M(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (h.M(upperCase, "CHAR", false, 2, null) || h.M(upperCase, "CLOB", false, 2, null) || h.M(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (h.M(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (h.M(upperCase, "REAL", false, 2, null) || h.M(upperCase, "FLOA", false, 2, null) || h.M(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.d != ((a) obj).d) {
                return false;
            }
            a aVar = (a) obj;
            if (!l.a(this.a, aVar.a) || this.c != aVar.c) {
                return false;
            }
            if (this.f == 1 && aVar.f == 2 && (str3 = this.e) != null && !h.b(str3, aVar.e)) {
                return false;
            }
            if (this.f == 2 && aVar.f == 1 && (str2 = aVar.e) != null && !h.b(str2, this.e)) {
                return false;
            }
            int i = this.f;
            return (i == 0 || i != aVar.f || ((str = this.e) == null ? aVar.e == null : h.b(str, aVar.e))) && this.g == aVar.g;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final d a(ax.o2.g gVar, String str) {
            l.f(gVar, "database");
            l.f(str, "tableName");
            return ax.m2.e.f(gVar, str);
        }

        private b() {
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            l.f(str, "referenceTable");
            l.f(str2, "onDelete");
            l.f(str3, "onUpdate");
            l.f(list, "columnNames");
            l.f(list2, "referenceColumnNames");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (l.a(this.a, cVar.a) && l.a(this.b, cVar.b) && l.a(this.c, cVar.c) && l.a(this.d, cVar.d)) {
                return l.a(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* renamed from: ax.m2.d$d, reason: collision with other inner class name */
    public static final class C0371d implements Comparable<C0371d> {
        private final int c0;
        private final String d0;
        private final String e0;
        private final int q;

        public C0371d(int i, int i2, String str, String str2) {
            l.f(str, "from");
            l.f(str2, "to");
            this.q = i;
            this.c0 = i2;
            this.d0 = str;
            this.e0 = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0371d c0371d) {
            l.f(c0371d, "other");
            int i = this.q - c0371d.q;
            return i == 0 ? this.c0 - c0371d.c0 : i;
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

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String str, boolean z, List<String> list, List<String> list2) {
            l.f(str, "name");
            l.f(list, "columns");
            l.f(list2, "orders");
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            List<String> list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    list3.add(EnumC2381l.ASC.name());
                }
            }
            this.d = (List) list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.b == eVar.b && l.a(this.c, eVar.c) && l.a(this.d, eVar.d)) {
                return h.H(this.a, "index_", false, 2, null) ? h.H(eVar.a, "index_", false, 2, null) : l.a(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((h.H(this.a, "index_", false, 2, null) ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
        }
    }

    public d(String str, Map<String, a> map, Set<c> set, Set<e> set2) {
        l.f(str, "name");
        l.f(map, "columns");
        l.f(set, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public static final d a(ax.o2.g gVar, String str) {
        return e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set<e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!l.a(this.a, dVar.a) || !l.a(this.b, dVar.b) || !l.a(this.c, dVar.c)) {
            return false;
        }
        Set<e> set2 = this.d;
        if (set2 == null || (set = dVar.d) == null) {
            return true;
        }
        return l.a(set2, set);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
