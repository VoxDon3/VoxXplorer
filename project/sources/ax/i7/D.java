package ax.i7;

import ax.m7.C2524C;
import ax.m7.C2532g;
import ax.m7.C2535j;
import ax.n7.C2584a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class D {
    private static final Map<Character, a> a = new HashMap();

    private enum a {
        PLUS('+', HttpUrl.FRAGMENT_ENCODE_SET, ",", false, true),
        HASH('#', "#", ",", false, true),
        DOT('.', ".", ".", false, false),
        FORWARD_SLASH('/', "/", "/", false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', "?", "&", true, false),
        AMP('&', "&", "&", true, false),
        SIMPLE(null, HttpUrl.FRAGMENT_ENCODE_SET, ",", false, false);

        private final String c0;
        private final String d0;
        private final boolean e0;
        private final boolean f0;
        private final Character q;

        a(Character ch, String str, String str2, boolean z, boolean z2) {
            this.q = ch;
            this.c0 = (String) ax.m7.v.d(str);
            this.d0 = (String) ax.m7.v.d(str2);
            this.e0 = z;
            this.f0 = z2;
            if (ch != null) {
                D.a.put(ch, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String h(String str) {
            return this.f0 ? C2584a.f(str) : C2584a.d(str);
        }

        String j() {
            return this.d0;
        }

        String l() {
            return this.c0;
        }

        int n() {
            return this.q == null ? 0 : 1;
        }

        boolean p() {
            return this.e0;
        }
    }

    static {
        a.values();
    }

    public static String b(String str, Object obj, boolean z) {
        String e;
        Map<String, Object> f = f(obj);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int indexOf = str.indexOf(123, i);
            if (indexOf != -1) {
                sb.append(str.substring(i, indexOf));
                int indexOf2 = str.indexOf(ax.m.j.L0, indexOf + 2);
                int i2 = indexOf2 + 1;
                String substring = str.substring(indexOf + 1, indexOf2);
                a d = d(substring);
                ListIterator<String> listIterator = ax.q7.r.d(',').f(substring).listIterator();
                boolean z2 = true;
                while (listIterator.hasNext()) {
                    String next = listIterator.next();
                    boolean endsWith = next.endsWith("*");
                    int n = listIterator.nextIndex() == 1 ? d.n() : 0;
                    int length2 = next.length();
                    if (endsWith) {
                        length2--;
                    }
                    String substring2 = next.substring(n, length2);
                    Object remove = f.remove(substring2);
                    if (remove != null) {
                        if (z2) {
                            sb.append(d.l());
                            z2 = false;
                        } else {
                            sb.append(d.j());
                        }
                        if (remove instanceof Iterator) {
                            e = e(substring2, (Iterator) remove, endsWith, d);
                        } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                            e = e(substring2, C2524C.l(remove).iterator(), endsWith, d);
                        } else if (remove.getClass().isEnum()) {
                            String e2 = C2535j.j((Enum) remove).e();
                            if (e2 == null) {
                                e2 = remove.toString();
                            }
                            e = h(substring2, e2, d);
                        } else {
                            e = !C2532g.f(remove) ? g(substring2, f(remove), endsWith, d) : h(substring2, remove.toString(), d);
                        }
                        sb.append((Object) e);
                    }
                }
                i = i2;
            } else {
                if (i == 0 && !z) {
                    return str;
                }
                sb.append(str.substring(i));
            }
        }
        if (z) {
            g.i(f.entrySet(), sb, false);
        }
        return sb.toString();
    }

    public static String c(String str, String str2, Object obj, boolean z) {
        if (str2.startsWith("/")) {
            g gVar = new g(str);
            gVar.w(null);
            str2 = gVar.l() + str2;
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            str2 = str + str2;
        }
        return b(str2, obj, z);
    }

    static a d(String str) {
        a aVar = a.get(Character.valueOf(str.charAt(0)));
        return aVar == null ? a.SIMPLE : aVar;
    }

    private static String e(String str, Iterator<?> it, boolean z, a aVar) {
        String str2;
        if (!it.hasNext()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = aVar.j();
        } else {
            if (aVar.p()) {
                sb.append(C2584a.e(str));
                sb.append("=");
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && aVar.p()) {
                sb.append(C2584a.e(str));
                sb.append("=");
            }
            sb.append(aVar.h(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private static Map<String, Object> f(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : C2532g.g(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !C2532g.d(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    private static String g(String str, Map<String, Object> map, boolean z, a aVar) {
        String str2;
        if (map.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        String str3 = "=";
        if (z) {
            str2 = aVar.j();
        } else {
            if (aVar.p()) {
                sb.append(C2584a.e(str));
                sb.append("=");
            }
            str3 = ",";
            str2 = ",";
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            String h = aVar.h(next.getKey());
            String h2 = aVar.h(next.getValue().toString());
            sb.append(h);
            sb.append(str3);
            sb.append(h2);
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private static String h(String str, String str2, a aVar) {
        return aVar.p() ? String.format("%s=%s", str, aVar.h(str2)) : aVar.h(str2);
    }
}
