/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.g;
import ax.b6.h;
import ax.b6.k;
import ax.b6.q;
import ax.b6.r;
import ax.b6.s;
import ax.b6.u;
import ax.b6.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class y2 {
    public static double a(double d8) {
        double d9;
        double d10;
        if (Double.isNaN(d8)) {
            return 0.0;
        }
        if (!Double.isInfinite(d8) && (d10 = (d9 = d8 - 0.0) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) != false && d8 != 0.0) {
            d10 = d10 > 0 ? 1.0 : (double)-1;
            return (double)d10 * Math.floor(Math.abs(d8));
        }
        return d8;
    }

    public static int b(Z2 z22) {
        int n8 = y2.i(z22.c("runtime.counter").f() + 1.0);
        if (n8 <= 1000000) {
            z22.h("runtime.counter", new k(Double.valueOf(n8)));
            return n8;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static Z c(String string) {
        Z z8 = string != null && !string.isEmpty() ? Z.d(Integer.parseInt(string)) : null;
        if (z8 != null) {
            return z8;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", string));
    }

    public static Object d(s object) {
        if (s.g.equals(object)) {
            return null;
        }
        if (s.f.equals(object)) {
            return "";
        }
        if (object instanceof r) {
            return y2.e((r)object);
        }
        if (object instanceof g) {
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Iterator<s> iterator = ((g)object).iterator();
            while (iterator.hasNext()) {
                object = y2.d(iterator.next());
                if (object == null) continue;
                arrayList.add(object);
            }
            return arrayList;
        }
        if (!object.f().isNaN()) {
            return object.f();
        }
        return object.g();
    }

    public static Map<String, Object> e(r r8) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (String string : r8.a()) {
            Object object = y2.d(r8.h(string));
            if (object == null) continue;
            hashMap.put(string, object);
        }
        return hashMap;
    }

    public static void f(Z z8, int n8, List<s> list) {
        y2.g(z8.name(), n8, list);
    }

    public static void g(String string, int n8, List<s> list) {
        if (list.size() == n8) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", string, n8, list.size()));
    }

    public static boolean h(s s8, s s9) {
        if (!s8.getClass().equals(s9.getClass())) {
            return false;
        }
        if (!(s8 instanceof z) && !(s8 instanceof q)) {
            if (s8 instanceof k) {
                if (!Double.isNaN(s8.f()) && !Double.isNaN(s9.f())) {
                    return s8.f().equals(s9.f());
                }
                return false;
            }
            if (s8 instanceof u) {
                return s8.g().equals(s9.g());
            }
            if (s8 instanceof h) {
                return s8.e().equals(s9.e());
            }
            return s8 == s9;
        }
        return true;
    }

    public static int i(double d8) {
        double d9;
        double d10;
        if (!Double.isNaN(d8) && !Double.isInfinite(d8) && (d10 = (d9 = d8 - 0.0) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) != false) {
            d10 = d10 > 0 ? 1.0 : (double)-1;
            return (int)((double)d10 * Math.floor(Math.abs(d8)) % 4.294967296E9);
        }
        return 0;
    }

    public static void j(Z z8, int n8, List<s> list) {
        y2.k(z8.name(), n8, list);
    }

    public static void k(String string, int n8, List<s> list) {
        if (list.size() >= n8) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", string, n8, list.size()));
    }

    public static boolean l(s object) {
        if (object == null) {
            return false;
        }
        return !((Double)(object = object.f())).isNaN() && (Double)object >= 0.0 && ((Double)object).equals(Math.floor((Double)object));
    }

    public static long m(double d8) {
        return (long)y2.i(d8) & 0xFFFFFFFFL;
    }

    public static void n(String string, int n8, List<s> list) {
        if (list.size() <= n8) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", string, n8, list.size()));
    }
}

