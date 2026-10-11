/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.F;
import ax.D7.e;
import ax.a8.a;
import ax.a8.b;
import java.util.Set;

public final class d {
    public static Object a(e object, F f8) {
        if ((object = object.g(f8)) == null) {
            return null;
        }
        return object.get();
    }

    public static Object b(e e8, Class clazz) {
        return e8.c(F.b(clazz));
    }

    public static a c(e e8, Class clazz) {
        return e8.h(F.b(clazz));
    }

    public static b d(e e8, Class clazz) {
        return e8.g(F.b(clazz));
    }

    public static Set e(e e8, F f8) {
        return e8.b(f8).get();
    }

    public static Set f(e e8, Class clazz) {
        return e8.e(F.b(clazz));
    }
}

