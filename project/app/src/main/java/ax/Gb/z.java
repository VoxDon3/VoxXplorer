/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Fb.a;
import ax.Fb.d;
import ax.Fb.e;
import ax.Fb.f;
import ax.Fb.g;
import ax.Fb.i;
import ax.Fb.j;
import ax.Fb.k;
import ax.Fb.m;
import ax.Fb.n;
import ax.Fb.o;
import ax.Fb.p;
import ax.Fb.q;
import ax.Fb.r;
import ax.Fb.s;
import ax.Fb.t;
import ax.Fb.u;
import ax.Fb.v;
import ax.Fb.w;
import ax.Gb.h;
import ax.Gb.l;
import ax.Hb.b;
import ax.sb.c;
import java.util.List;
import java.util.Map;

public class z {
    public static List a(Object object) {
        if (object instanceof ax.Hb.a && !(object instanceof b)) {
            z.j(object, "kotlin.collections.MutableList");
        }
        return z.d(object);
    }

    public static Map b(Object object) {
        if (object instanceof ax.Hb.a && !(object instanceof ax.Hb.c)) {
            z.j(object, "kotlin.collections.MutableMap");
        }
        return z.e(object);
    }

    public static Object c(Object object, int n8) {
        if (object != null && !z.g(object, n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.functions.Function");
            stringBuilder.append(n8);
            z.j(object, stringBuilder.toString());
        }
        return object;
    }

    public static List d(Object object) {
        try {
            object = (List)object;
            return object;
        }
        catch (ClassCastException classCastException) {
            throw z.i(classCastException);
        }
    }

    public static Map e(Object object) {
        try {
            object = (Map)object;
            return object;
        }
        catch (ClassCastException classCastException) {
            throw z.i(classCastException);
        }
    }

    public static int f(Object object) {
        if (object instanceof h) {
            return ((h)object).getArity();
        }
        if (object instanceof a) {
            return 0;
        }
        if (object instanceof ax.Fb.l) {
            return 1;
        }
        if (object instanceof p) {
            return 2;
        }
        if (object instanceof q) {
            return 3;
        }
        if (object instanceof r) {
            return 4;
        }
        if (object instanceof s) {
            return 5;
        }
        if (object instanceof t) {
            return 6;
        }
        if (object instanceof u) {
            return 7;
        }
        if (object instanceof v) {
            return 8;
        }
        if (object instanceof w) {
            return 9;
        }
        if (object instanceof ax.Fb.b) {
            return 10;
        }
        if (object instanceof ax.Fb.c) {
            return 11;
        }
        if (object instanceof d) {
            return 12;
        }
        if (object instanceof e) {
            return 13;
        }
        if (object instanceof f) {
            return 14;
        }
        if (object instanceof g) {
            return 15;
        }
        if (object instanceof ax.Fb.h) {
            return 16;
        }
        if (object instanceof i) {
            return 17;
        }
        if (object instanceof j) {
            return 18;
        }
        if (object instanceof k) {
            return 19;
        }
        if (object instanceof m) {
            return 20;
        }
        if (object instanceof n) {
            return 21;
        }
        if (object instanceof o) {
            return 22;
        }
        return -1;
    }

    public static boolean g(Object object, int n8) {
        return object instanceof c && z.f(object) == n8;
    }

    private static <T extends Throwable> T h(T t8) {
        return l.l(t8, z.class.getName());
    }

    public static ClassCastException i(ClassCastException classCastException) {
        throw z.h(classCastException);
    }

    public static void j(Object object, String string) {
        object = object == null ? "null" : object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(string);
        z.k(stringBuilder.toString());
    }

    public static void k(String string) {
        throw z.i(new ClassCastException(string));
    }
}

