/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.g;
import ax.m7.C;
import ax.m7.j;
import ax.m7.v;
import ax.q7.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

public class D {
    private static final Map<Character, a> a = new HashMap<Character, a>();

    static {
        ax.i7.D$a.values();
    }

    public static String b(String string, Object object, boolean bl) {
        Map<String, Object> map = D.f(object);
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = string.length();
        int n9 = 0;
        while (n9 < n8) {
            int n10 = string.indexOf(123, n9);
            if (n10 == -1) {
                if (n9 == 0 && !bl) {
                    return string;
                }
                stringBuilder.append(string.substring(n9));
                break;
            }
            stringBuilder.append(string.substring(n9, n10));
            int n11 = string.indexOf(125, n10 + 2);
            object = string.substring(n10 + 1, n11);
            a a8 = D.d((String)object);
            ListIterator<String> listIterator = r.d(',').f((CharSequence)object).listIterator();
            n9 = 1;
            while (listIterator.hasNext()) {
                String string2;
                Object object2;
                int n12;
                object = listIterator.next();
                boolean bl2 = ((String)object).endsWith("*");
                n10 = listIterator.nextIndex() == 1 ? a8.n() : 0;
                int n13 = n12 = ((String)object).length();
                if (bl2) {
                    n13 = n12 - 1;
                }
                if ((object2 = map.remove(string2 = ((String)object).substring(n10, n13))) == null) continue;
                if (n9 == 0) {
                    stringBuilder.append(a8.j());
                } else {
                    stringBuilder.append(a8.l());
                    n9 = 0;
                }
                if (object2 instanceof Iterator) {
                    object = D.e(string2, (Iterator)object2, bl2, a8);
                } else if (!(object2 instanceof Iterable) && !object2.getClass().isArray()) {
                    if (object2.getClass().isEnum()) {
                        object = j.j((Enum)object2).e();
                        if (object == null) {
                            object = object2.toString();
                        }
                        object = D.h(string2, (String)object, a8);
                    } else {
                        object = !ax.m7.g.f(object2) ? D.g(string2, D.f(object2), bl2, a8) : D.h(string2, object2.toString(), a8);
                    }
                } else {
                    object = D.e(string2, C.l(object2).iterator(), bl2, a8);
                }
                stringBuilder.append(object);
            }
            n9 = n11 + 1;
        }
        if (bl) {
            g.i(map.entrySet(), stringBuilder, false);
        }
        return stringBuilder.toString();
    }

    public static String c(String object, String string, Object object2, boolean bl) {
        CharSequence charSequence;
        if (string.startsWith("/")) {
            object = new g((String)object);
            ((g)object).w(null);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(((g)object).l());
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = string;
            if (!string.startsWith("http://")) {
                if (string.startsWith("https://")) {
                    charSequence = string;
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(string);
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
        }
        return D.b((String)charSequence, object2, bl);
    }

    static a d(String object) {
        a a8 = a.get(Character.valueOf(object.charAt(0)));
        object = a8;
        if (a8 == null) {
            object = ax.i7.D$a.n0;
        }
        return object;
    }

    private static String e(String string, Iterator<?> iterator, boolean bl, a a8) {
        String string2;
        if (!iterator.hasNext()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            string2 = a8.j();
        } else {
            if (a8.p()) {
                stringBuilder.append(ax.n7.a.e(string));
                stringBuilder.append("=");
            }
            string2 = ",";
        }
        while (iterator.hasNext()) {
            if (bl && a8.p()) {
                stringBuilder.append(ax.n7.a.e(string));
                stringBuilder.append("=");
            }
            stringBuilder.append(a8.h(iterator.next().toString()));
            if (!iterator.hasNext()) continue;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    private static Map<String, Object> f(Object iterator) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        for (Map.Entry<String, Object> entry : ax.m7.g.g(iterator).entrySet()) {
            Object object = entry.getValue();
            if (object == null || ax.m7.g.d(object)) continue;
            linkedHashMap.put(entry.getKey(), object);
        }
        return linkedHashMap;
    }

    private static String g(String string, Map<String, Object> object, boolean bl, a a8) {
        if (object.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = "=";
        if (bl) {
            string = a8.j();
        } else {
            if (a8.p()) {
                stringBuilder.append(ax.n7.a.e(string));
                stringBuilder.append("=");
            }
            string2 = ",";
            string = ",";
        }
        object = object.entrySet().iterator();
        while (object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string3 = a8.h((String)object2.getKey());
            object2 = a8.h(object2.getValue().toString());
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            if (!object.hasNext()) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    private static String h(String string, String string2, a a8) {
        if (a8.p()) {
            return String.format("%s=%s", string, a8.h(string2));
        }
        return a8.h(string2);
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        public static final /* enum */ a j0;
        public static final /* enum */ a k0;
        public static final /* enum */ a l0;
        public static final /* enum */ a m0;
        public static final /* enum */ a n0;
        private static final a[] o0;
        private final String c0;
        private final String d0;
        private final boolean e0;
        private final boolean f0;
        private final Character q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            g0 = a15 = new a(Character.valueOf('+'), "", ",", false, true);
            h0 = a14 = new a(Character.valueOf('#'), "#", ",", false, true);
            i0 = a13 = new a(Character.valueOf('.'), ".", ".", false, false);
            j0 = a12 = new a(Character.valueOf('/'), "/", "/", false, false);
            k0 = a11 = new a(Character.valueOf(';'), ";", ";", true, false);
            l0 = a10 = new a(Character.valueOf('?'), "?", "&", true, false);
            m0 = a9 = new a(Character.valueOf('&'), "&", "&", true, false);
            n0 = a8 = new a(null, "", ",", false, false);
            o0 = new a[]{a15, a14, a13, a12, a11, a10, a9, a8};
        }

        private a(Character c8, String string2, String string3, boolean bl, boolean bl2) {
            this.q = c8;
            this.c0 = v.d(string2);
            this.d0 = v.d(string3);
            this.e0 = bl;
            this.f0 = bl2;
            if (c8 != null) {
                a.put(c8, this);
            }
        }

        private String h(String string) {
            if (this.f0) {
                return ax.n7.a.f(string);
            }
            return ax.n7.a.d(string);
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])o0.clone();
        }

        String j() {
            return this.d0;
        }

        String l() {
            return this.c0;
        }

        int n() {
            if (this.q == null) {
                return 0;
            }
            return 1;
        }

        boolean p() {
            return this.e0;
        }
    }
}

