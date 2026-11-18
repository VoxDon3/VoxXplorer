/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import android.content.Context;
import ax.Q2.g;
import ax.T2.h;
import ax.T2.j;
import ax.T2.k;
import ax.T2.l;
import ax.b3.a;
import ax.c3.d0;
import ax.u3.c;
import ax.u3.e;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class i {
    private static final Logger a = g.a(i.class);

    public static void a(o object, h.f f8, l l8, c c8) throws a {
        Object object2 = (x)((o)object).u();
        y y8 = f8.a;
        if (y8 != null && (object2 = ((x)object2).q1(y8, false, 0L, 0x100000L)) != null && (object = i.e(((o)object).t(), (List<A>)object2, f8.a, false, false, l8, c8)) != null) {
            f8.n = object;
        }
    }

    public static void b(o object, h.f f8, l l8, c c8) throws a {
        ax.b3.j j82;
        block5: {
            block4: {
                Object object2 = (x)((o)object).u();
                Object object3 = d0.Q(f8.a.E(), "Download");
                try {
                    object3 = ((o)object).z((String)object3);
                    if (!object3.n() || (object2 = ((x)object2).q1((n)object3, false, 0L, 0L)) == null) break block4;
                }
                catch (ax.b3.j j82) {}
                object = i.e(((o)object).t(), (List<A>)object2, (n)object3, false, true, l8, c8);
                if (object == null) break block4;
                f8.m = object;
                return;
                break block5;
            }
            return;
        }
        j82.printStackTrace();
        f8.m = null;
    }

    private static Map<Long, ArrayList<A>> c(List<A> arrayList, String object, boolean bl, c object22) throws a {
        HashMap<Long, ArrayList<A>> hashMap = new HashMap<Long, ArrayList<A>>();
        int n8 = ((String)object).length();
        for (A a8 : arrayList) {
            if (object22 != null && object22.isCancelled()) {
                throw new a();
            }
            if (!i.h(a8, object, n8, bl)) continue;
            ArrayList arrayList2 = (ArrayList)hashMap.get(a8.d);
            arrayList = arrayList2;
            if (arrayList2 == null) {
                arrayList = new ArrayList();
                hashMap.put(a8.d, arrayList);
            }
            arrayList.add(a8);
        }
        arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((ArrayList)entry.getValue()).size() > 1) continue;
            arrayList.add((Long)entry.getKey());
        }
        int n9 = arrayList.size();
        for (n8 = 0; n8 < n9; ++n8) {
            object = arrayList.get(n8);
            hashMap.remove((Long)object);
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean d(k object2, A a8, boolean bl, String string) {
        Object var2_4;
        if (var2_4 == false) {
            return true;
        }
        for (A a9 : ((k)object2).a) {
            String var3_5;
            String var1_3;
            if (!var1_3.c().equals(a9.c()) || !e.c(var1_3.b(), a9.b(), (String)var3_5)) continue;
            return true;
        }
        return false;
    }

    private static j e(Context object, List<A> list, n object2, boolean bl, boolean bl2, l object3, c c8) throws a {
        int n8;
        long l8 = System.currentTimeMillis();
        if ((object2 = i.c(list, ((n)object2).E(), bl, c8)).isEmpty()) {
            return null;
        }
        list = new ArrayList<A>();
        object = object.getString(2131951795);
        ArrayList arrayList = new ArrayList(object2.keySet());
        Collections.sort(arrayList, Collections.reverseOrder());
        int n9 = arrayList.size();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            Long l9 = (Long)arrayList.get(n8);
            if (c8 != null && c8.isCancelled()) {
                throw new a();
            }
            i.g((List)object2.get(l9), bl2, (String)object, (l)object3, list, c8);
        }
        object3 = a;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("duplicate analysis time :");
        ((StringBuilder)object2).append(System.currentTimeMillis() - l8);
        ((Logger)object3).fine(((StringBuilder)object2).toString());
        if (list.size() > 0) {
            object = new A.a((String)object);
            n9 = ((ArrayList)list).size();
            l8 = 0L;
            n8 = n10;
            while (n8 < n9) {
                object2 = ((ArrayList)list).get(n8);
                ++n8;
                object2 = (k)object2;
                ((k)object2).e((Comparator<A>)object);
                l8 += ((k)object2).c();
            }
            return new j(list, l8);
        }
        return null;
    }

    private static void f(ArrayList<A> object, boolean bl, String string, l l8, List<k> list, c c8) throws a {
        int n8;
        if (bl) {
            Collections.sort(object, new A.c());
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n9 = ((ArrayList)object).size();
        int n10 = 0;
        int n11 = 0;
        block0: while (n11 < n9) {
            Object object2;
            A a8 = ((ArrayList)object).get(n11);
            n8 = n11 + 1;
            if (c8 != null && c8.isCancelled()) {
                throw new a();
            }
            int n12 = arrayList.size();
            for (n11 = 0; n11 < n12; ++n11) {
                object2 = arrayList.get(n11);
                k k8 = (k)object2;
                if ((object2 = k8.d()) == null || !i.d(k8, a8, bl, string) || !l8.a(a8, (A)object2, c8)) continue;
                k8.a(a8);
                n11 = n8;
                continue block0;
            }
            object2 = new k();
            ((k)object2).a(a8);
            arrayList.add(object2);
            n11 = n8;
        }
        n8 = arrayList.size();
        n11 = n10;
        while (n11 < n8) {
            object = arrayList.get(n11);
            n10 = n11 + 1;
            object = (k)object;
            n11 = n10;
            if (((k)object).a.size() <= 1) continue;
            list.add((k)object);
            n11 = n10;
        }
    }

    private static void g(List<A> arrayList, boolean bl, String string, l l8, List<k> list, c c8) throws a {
        if (arrayList != null && arrayList.size() > 1) {
            Object object;
            HashMap<String, ArrayList<A>> hashMap = new HashMap<String, ArrayList<A>>();
            for (A a8 : arrayList) {
                if (c8 != null && c8.isCancelled()) {
                    throw new a();
                }
                l.b b8 = l8.b(a8);
                if (b8 == null || (arrayList = b8.d) == null) continue;
                object = (ArrayList)hashMap.get(arrayList);
                arrayList = object;
                if (object == null) {
                    arrayList = new ArrayList<A>();
                    hashMap.put(b8.d, arrayList);
                }
                arrayList.add(a8);
            }
            arrayList = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList);
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = arrayList.get(i8);
                if (((ArrayList)(object = (ArrayList)hashMap.get((String)object))).size() <= 1) continue;
                i.f((ArrayList<A>)object, bl, string, l8, list, c8);
            }
        }
    }

    private static boolean h(A a8, String string, int n8, boolean bl) {
        if (a8 != null && a8.a != null) {
            if (a8.b) {
                return false;
            }
            if (bl && !a8.c().equalsIgnoreCase(string)) {
                return false;
            }
            if (a8.d == 0L) {
                return false;
            }
            if (".folderimage".equals(a8.b())) {
                return false;
            }
            if (!bl) {
                int n9;
                int n10 = a8.a.length();
                if (n10 > (n9 = n8 + 1) && a8.a.charAt(n9) == '.' && J.l2(a8.a.substring(n8))) {
                    return false;
                }
                if (J.k2(a8.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

