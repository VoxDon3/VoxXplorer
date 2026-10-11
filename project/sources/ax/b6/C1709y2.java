package ax.b6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1709y2 {
    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == -0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int b(Z2 z2) {
        int i = i(z2.c("runtime.counter").f().doubleValue() + 1.0d);
        if (i > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        z2.h("runtime.counter", new C1594k(Double.valueOf(i)));
        return i;
    }

    public static Z c(String str) {
        Z d = (str == null || str.isEmpty()) ? null : Z.d(Integer.parseInt(str));
        if (d != null) {
            return d;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC1658s interfaceC1658s) {
        if (InterfaceC1658s.g.equals(interfaceC1658s)) {
            return null;
        }
        if (InterfaceC1658s.f.equals(interfaceC1658s)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (interfaceC1658s instanceof r) {
            return e((r) interfaceC1658s);
        }
        if (!(interfaceC1658s instanceof C1558g)) {
            return !interfaceC1658s.f().isNaN() ? interfaceC1658s.f() : interfaceC1658s.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1658s> it = ((C1558g) interfaceC1658s).iterator();
        while (it.hasNext()) {
            Object d = d(it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> e(r rVar) {
        HashMap hashMap = new HashMap();
        for (String str : rVar.a()) {
            Object d = d(rVar.h(str));
            if (d != null) {
                hashMap.put(str, d);
            }
        }
        return hashMap;
    }

    public static void f(Z z, int i, List<InterfaceC1658s> list) {
        g(z.name(), i, list);
    }

    public static void g(String str, int i, List<InterfaceC1658s> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC1658s interfaceC1658s, InterfaceC1658s interfaceC1658s2) {
        if (!interfaceC1658s.getClass().equals(interfaceC1658s2.getClass())) {
            return false;
        }
        if ((interfaceC1658s instanceof C1714z) || (interfaceC1658s instanceof C1643q)) {
            return true;
        }
        if (!(interfaceC1658s instanceof C1594k)) {
            return interfaceC1658s instanceof C1674u ? interfaceC1658s.g().equals(interfaceC1658s2.g()) : interfaceC1658s instanceof C1567h ? interfaceC1658s.e().equals(interfaceC1658s2.e()) : interfaceC1658s == interfaceC1658s2;
        }
        if (Double.isNaN(interfaceC1658s.f().doubleValue()) || Double.isNaN(interfaceC1658s2.f().doubleValue())) {
            return false;
        }
        return interfaceC1658s.f().equals(interfaceC1658s2.f());
    }

    public static int i(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static void j(Z z, int i, List<InterfaceC1658s> list) {
        k(z.name(), i, list);
    }

    public static void k(String str, int i, List<InterfaceC1658s> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC1658s interfaceC1658s) {
        if (interfaceC1658s == null) {
            return false;
        }
        Double f = interfaceC1658s.f();
        return !f.isNaN() && f.doubleValue() >= 0.0d && f.equals(Double.valueOf(Math.floor(f.doubleValue())));
    }

    public static long m(double d) {
        return i(d) & 4294967295L;
    }

    public static void n(String str, int i, List<InterfaceC1658s> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }
}
