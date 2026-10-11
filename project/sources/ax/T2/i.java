package ax.T2;

import android.content.Context;
import ax.T2.h;
import ax.T2.l;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.d0;
import ax.u3.C3187e;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class i {
    private static final Logger a = ax.Q2.g.a(i.class);

    public static void a(C3596o c3596o, h.f fVar, l lVar, InterfaceC3185c interfaceC3185c) throws C1486a {
        List<A> q1;
        j e;
        C3604x c3604x = (C3604x) c3596o.u();
        C3605y c3605y = fVar.a;
        if (c3605y == null || (q1 = c3604x.q1(c3605y, false, 0L, 1048576L)) == null || (e = e(c3596o.t(), q1, fVar.a, false, false, lVar, interfaceC3185c)) == null) {
            return;
        }
        fVar.n = e;
    }

    public static void b(C3596o c3596o, h.f fVar, l lVar, InterfaceC3185c interfaceC3185c) throws C1486a {
        List<A> q1;
        j e;
        C3604x c3604x = (C3604x) c3596o.u();
        try {
            AbstractC3595n z = c3596o.z(d0.Q(fVar.a.E(), "Download"));
            if (!z.n() || (q1 = c3604x.q1(z, false, 0L, 0L)) == null || (e = e(c3596o.t(), q1, z, false, true, lVar, interfaceC3185c)) == null) {
                return;
            }
            fVar.m = e;
        } catch (C1495j e2) {
            e2.printStackTrace();
            fVar.m = null;
        }
    }

    private static Map<Long, ArrayList<A>> c(List<A> list, String str, boolean z, InterfaceC3185c interfaceC3185c) throws C1486a {
        HashMap hashMap = new HashMap();
        int length = str.length();
        for (A a2 : list) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (h(a2, str, length, z)) {
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(a2.d));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Long.valueOf(a2.d), arrayList);
                }
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((ArrayList) entry.getValue()).size() <= 1) {
                arrayList2.add((Long) entry.getKey());
            }
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            hashMap.remove((Long) obj);
        }
        return hashMap;
    }

    private static boolean d(k kVar, A a2, boolean z, String str) {
        if (!z) {
            return true;
        }
        for (A a3 : kVar.a) {
            if (a2.c().equals(a3.c()) && C3187e.c(a2.b(), a3.b(), str)) {
                return true;
            }
        }
        return false;
    }

    private static j e(Context context, List<A> list, AbstractC3595n abstractC3595n, boolean z, boolean z2, l lVar, InterfaceC3185c interfaceC3185c) throws C1486a {
        InterfaceC3185c interfaceC3185c2 = interfaceC3185c;
        long currentTimeMillis = System.currentTimeMillis();
        Map<Long, ArrayList<A>> c = c(list, abstractC3595n.E(), z, interfaceC3185c2);
        if (c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.copy_postfix);
        ArrayList arrayList2 = new ArrayList(c.keySet());
        Collections.sort(arrayList2, Collections.reverseOrder());
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Long l = (Long) arrayList2.get(i2);
            if (interfaceC3185c2 != null && interfaceC3185c2.isCancelled()) {
                throw new C1486a();
            }
            g(c.get(l), z2, string, lVar, arrayList, interfaceC3185c2);
            interfaceC3185c2 = interfaceC3185c;
            i2 = i3;
        }
        a.fine("duplicate analysis time :" + (System.currentTimeMillis() - currentTimeMillis));
        if (arrayList.size() <= 0) {
            return null;
        }
        A.a aVar = new A.a(string);
        int size2 = arrayList.size();
        long j = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            k kVar = (k) obj;
            kVar.e(aVar);
            j += kVar.c();
        }
        return new j(arrayList, j);
    }

    private static void f(ArrayList<A> arrayList, boolean z, String str, l lVar, List<k> list, InterfaceC3185c interfaceC3185c) throws C1486a {
        if (z) {
            Collections.sort(arrayList, new A.c());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            A a2 = arrayList.get(i2);
            i2++;
            A a3 = a2;
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    k kVar = new k();
                    kVar.a(a3);
                    arrayList2.add(kVar);
                    break;
                }
                Object obj = arrayList2.get(i3);
                i3++;
                k kVar2 = (k) obj;
                A d = kVar2.d();
                if (d != null && d(kVar2, a3, z, str) && lVar.a(a3, d, interfaceC3185c)) {
                    kVar2.a(a3);
                    break;
                }
            }
        }
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj2 = arrayList2.get(i);
            i++;
            k kVar3 = (k) obj2;
            if (kVar3.a.size() > 1) {
                list.add(kVar3);
            }
        }
    }

    private static void g(List<A> list, boolean z, String str, l lVar, List<k> list2, InterfaceC3185c interfaceC3185c) throws C1486a {
        String str2;
        if (list == null || list.size() <= 1) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (A a2 : list) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            l.b b = lVar.b(a2);
            if (b != null && (str2 = b.d) != null) {
                ArrayList arrayList = (ArrayList) hashMap.get(str2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(b.d, arrayList);
                }
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = (ArrayList) hashMap.get((String) obj);
            if (arrayList3.size() > 1) {
                f(arrayList3, z, str, lVar, list2, interfaceC3185c);
            }
        }
    }

    private static boolean h(A a2, String str, int i, boolean z) {
        if (a2 == null || a2.a == null || a2.b) {
            return false;
        }
        if ((z && !a2.c().equalsIgnoreCase(str)) || a2.d == 0 || ".folderimage".equals(a2.b())) {
            return false;
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        return ((a2.a.length() > i2 && a2.a.charAt(i2) == '.' && J.l2(a2.a.substring(i))) || J.k2(a2.b())) ? false : true;
    }
}
