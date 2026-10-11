/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Ob.b;
import ax.Ob.i;
import ax.Ob.j;
import ax.Ob.k;
import ax.Ob.s;
import ax.Ob.u;
import ax.Ob.w;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class l
extends i {
    public static /* synthetic */ String b(String string) {
        return l.e(string);
    }

    public static /* synthetic */ String c(String string, String string2) {
        return l.f(string, string2);
    }

    private static final ax.Fb.l<String, String> d(String string) {
        if (string.length() == 0) {
            return new j();
        }
        return new k(string);
    }

    private static final String e(String string) {
        ax.Gb.l.f(string, "line");
        return string;
    }

    private static final String f(String string, String string2) {
        ax.Gb.l.f(string2, "line");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static final int g(String string) {
        int n8;
        block3: {
            int n9 = string.length();
            for (n8 = 0; n8 < n9; ++n8) {
                if (b.c(string.charAt(n8))) {
                    continue;
                }
                break block3;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return string.length();
        }
        return n8;
    }

    public static final String h(String object, String string) {
        int n8;
        ax.Gb.l.f(object, "<this>");
        ax.Gb.l.f(string, "newIndent");
        List<String> list = u.c0((CharSequence)object);
        Object object2 = list;
        Object object3 = new ArrayList<Iterable>();
        Object object4 = object2.iterator();
        while (object4.hasNext()) {
            object2 = object4.next();
            if (u.X((String)object2)) continue;
            object3.add(object2);
        }
        object4 = new ArrayList(o.s(object3, 10));
        int n9 = ((ArrayList)object3).size();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            object2 = ((ArrayList)object3).get(n8);
            object4.add(l.g((String)object2));
        }
        object3 = (Integer)o.N(object4);
        n8 = object3 != null ? (Integer)object3 : 0;
        int n11 = ((String)object).length();
        int n12 = string.length();
        int n13 = list.size();
        object3 = l.d(string);
        n9 = o.k(list);
        object = list;
        list = new ArrayList<String>();
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = object2.next();
            if (n10 < 0) {
                o.r();
            }
            string = (String)object;
            if ((n10 == 0 || n10 == n9) && u.X(string)) {
                object = null;
            } else {
                object4 = w.B0(string, n8);
                object = string;
                if (object4 != null && (object = (String)object3.invoke(object4)) == null) {
                    object = string;
                }
            }
            if (object != null) {
                list.add((String)object);
            }
            ++n10;
        }
        return ((StringBuilder)o.J(list, new StringBuilder(n11 + n12 * n13), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static final String i(String object, String string, String string2) {
        ax.Gb.l.f(object, "<this>");
        ax.Gb.l.f(string, "newIndent");
        ax.Gb.l.f(string2, "marginPrefix");
        if (!u.X(string2)) {
            Object object2 = u.c0((CharSequence)object);
            int n8 = ((String)object).length();
            int n9 = string.length();
            int n10 = object2.size();
            ax.Fb.l<String, String> l8 = l.d(string);
            int n11 = o.k(object2);
            object = (Iterable)object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Iterator iterator = object.iterator();
            int n12 = 0;
            while (iterator.hasNext()) {
                object = iterator.next();
                if (n12 < 0) {
                    o.r();
                }
                object2 = (String)object;
                string = null;
                if ((n12 == 0 || n12 == n11) && u.X((CharSequence)object2)) {
                    object = null;
                } else {
                    int n13;
                    int n14;
                    block10: {
                        n14 = object2.length();
                        for (n13 = 0; n13 < n14; ++n13) {
                            if (b.c(object2.charAt(n13))) {
                                continue;
                            }
                            break block10;
                        }
                        n13 = -1;
                    }
                    if (n13 != -1 && s.G((String)object2, string2, n13, false, 4, null)) {
                        n14 = string2.length();
                        ax.Gb.l.d(object2, "null cannot be cast to non-null type java.lang.String");
                        string = ((String)object2).substring(n14 + n13);
                        ax.Gb.l.e(string, "substring(...)");
                    }
                    object = object2;
                    if (string != null && (object = l8.invoke(string)) == null) {
                        object = object2;
                    }
                }
                if (object != null) {
                    arrayList.add(object);
                }
                ++n12;
            }
            return ((StringBuilder)o.J(arrayList, new StringBuilder(n8 + n9 * n10), "\n", null, null, 0, null, null, 124, null)).toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static String j(String string) {
        ax.Gb.l.f(string, "<this>");
        return l.h(string, "");
    }

    public static final String k(String string, String string2) {
        ax.Gb.l.f(string, "<this>");
        ax.Gb.l.f(string2, "marginPrefix");
        return l.i(string, "", string2);
    }

    public static /* synthetic */ String l(String string, String string2, int n8, Object object) {
        if ((n8 & 1) != 0) {
            string2 = "|";
        }
        return l.k(string, string2);
    }
}

