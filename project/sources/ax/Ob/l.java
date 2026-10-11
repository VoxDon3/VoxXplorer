package ax.Ob;

import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l extends i {
    private static final ax.Fb.l<String, String> d(final String str) {
        return str.length() == 0 ? new ax.Fb.l() { // from class: ax.Ob.j
            @Override // ax.Fb.l
            public final Object invoke(Object obj) {
                String e;
                e = l.e((String) obj);
                return e;
            }
        } : new ax.Fb.l() { // from class: ax.Ob.k
            @Override // ax.Fb.l
            public final Object invoke(Object obj) {
                String f;
                f = l.f(str, (String) obj);
                return f;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str) {
        ax.Gb.l.f(str, "line");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String str2) {
        ax.Gb.l.f(str2, "line");
        return str + str2;
    }

    private static final int g(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!b.c(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    public static final String h(String str, String str2) {
        String invoke;
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "newIndent");
        List<String> c0 = u.c0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c0) {
            if (!u.X((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3139o.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(Integer.valueOf(g((String) obj2)));
        }
        Integer num = (Integer) C3139o.N(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * c0.size());
        ax.Fb.l<String, String> d = d(str2);
        int k = C3139o.k(c0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : c0) {
            int i3 = i + 1;
            if (i < 0) {
                C3139o.r();
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == k) && u.X(str3)) {
                str3 = null;
            } else {
                String B0 = w.B0(str3, intValue);
                if (B0 != null && (invoke = d.invoke(B0)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i3;
        }
        return ((StringBuilder) C3139o.J(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, ax.m.j.K0, null)).toString();
    }

    public static final String i(String str, String str2, String str3) {
        String str4;
        String invoke;
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "newIndent");
        ax.Gb.l.f(str3, "marginPrefix");
        if (u.X(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> c0 = u.c0(str);
        int length = str.length() + (str2.length() * c0.size());
        ax.Fb.l<String, String> d = d(str2);
        int k = C3139o.k(c0);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : c0) {
            int i2 = i + 1;
            if (i < 0) {
                C3139o.r();
            }
            String str5 = (String) obj;
            String str6 = null;
            if ((i == 0 || i == k) && u.X(str5)) {
                str4 = str3;
                str5 = null;
            } else {
                int length2 = str5.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!b.c(str5.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    str4 = str3;
                } else {
                    int i4 = i3;
                    str4 = str3;
                    if (s.G(str5, str4, i4, false, 4, null)) {
                        int length3 = str4.length() + i4;
                        ax.Gb.l.d(str5, "null cannot be cast to non-null type java.lang.String");
                        str6 = str5.substring(length3);
                        ax.Gb.l.e(str6, "substring(...)");
                    }
                }
                if (str6 != null && (invoke = d.invoke(str6)) != null) {
                    str5 = invoke;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i = i2;
            str3 = str4;
        }
        return ((StringBuilder) C3139o.J(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, ax.m.j.K0, null)).toString();
    }

    public static String j(String str) {
        ax.Gb.l.f(str, "<this>");
        return h(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static final String k(String str, String str2) {
        ax.Gb.l.f(str, "<this>");
        ax.Gb.l.f(str2, "marginPrefix");
        return i(str, HttpUrl.FRAGMENT_ENCODE_SET, str2);
    }

    public static /* synthetic */ String l(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
