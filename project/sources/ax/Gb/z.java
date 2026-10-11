package ax.Gb;

import ax.sb.InterfaceC3071c;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class z {
    public static List a(Object obj) {
        if ((obj instanceof ax.Hb.a) && !(obj instanceof ax.Hb.b)) {
            j(obj, "kotlin.collections.MutableList");
        }
        return d(obj);
    }

    public static Map b(Object obj) {
        if ((obj instanceof ax.Hb.a) && !(obj instanceof ax.Hb.c)) {
            j(obj, "kotlin.collections.MutableMap");
        }
        return e(obj);
    }

    public static Object c(Object obj, int i) {
        if (obj != null && !g(obj, i)) {
            j(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static List d(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw i(e);
        }
    }

    public static Map e(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw i(e);
        }
    }

    public static int f(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof ax.Fb.a) {
            return 0;
        }
        if (obj instanceof ax.Fb.l) {
            return 1;
        }
        if (obj instanceof ax.Fb.p) {
            return 2;
        }
        if (obj instanceof ax.Fb.q) {
            return 3;
        }
        if (obj instanceof ax.Fb.r) {
            return 4;
        }
        if (obj instanceof ax.Fb.s) {
            return 5;
        }
        if (obj instanceof ax.Fb.t) {
            return 6;
        }
        if (obj instanceof ax.Fb.u) {
            return 7;
        }
        if (obj instanceof ax.Fb.v) {
            return 8;
        }
        if (obj instanceof ax.Fb.w) {
            return 9;
        }
        if (obj instanceof ax.Fb.b) {
            return 10;
        }
        if (obj instanceof ax.Fb.c) {
            return 11;
        }
        if (obj instanceof ax.Fb.d) {
            return 12;
        }
        if (obj instanceof ax.Fb.e) {
            return 13;
        }
        if (obj instanceof ax.Fb.f) {
            return 14;
        }
        if (obj instanceof ax.Fb.g) {
            return 15;
        }
        if (obj instanceof ax.Fb.h) {
            return 16;
        }
        if (obj instanceof ax.Fb.i) {
            return 17;
        }
        if (obj instanceof ax.Fb.j) {
            return 18;
        }
        if (obj instanceof ax.Fb.k) {
            return 19;
        }
        if (obj instanceof ax.Fb.m) {
            return 20;
        }
        if (obj instanceof ax.Fb.n) {
            return 21;
        }
        return obj instanceof ax.Fb.o ? 22 : -1;
    }

    public static boolean g(Object obj, int i) {
        return (obj instanceof InterfaceC3071c) && f(obj) == i;
    }

    private static <T extends Throwable> T h(T t) {
        return (T) l.l(t, z.class.getName());
    }

    public static ClassCastException i(ClassCastException classCastException) {
        throw ((ClassCastException) h(classCastException));
    }

    public static void j(Object obj, String str) {
        k((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void k(String str) {
        throw i(new ClassCastException(str));
    }
}
