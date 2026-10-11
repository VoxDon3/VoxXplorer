/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.h;
import ax.Gb.i;
import ax.Gb.m;
import ax.Gb.o;
import ax.Gb.q;
import ax.Gb.x;
import ax.Mb.b;
import ax.Mb.c;
import ax.Mb.d;
import ax.Mb.e;
import ax.Mb.f;

public class w {
    private static final x a;
    private static final b[] b;

    static {
        x x8 = null;
        try {
            x x9;
            x8 = x9 = (x)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException exception) {
            // empty catch block
        }
        if (x8 == null) {
            x8 = new x();
        }
        a = x8;
        b = new b[0];
    }

    public static d a(i i8) {
        return a.a(i8);
    }

    public static b b(Class clazz) {
        return a.b(clazz);
    }

    public static c c(Class clazz) {
        return a.c(clazz, "");
    }

    public static e d(o o8) {
        return a.d(o8);
    }

    public static f e(q q8) {
        return a.e(q8);
    }

    public static String f(h h8) {
        return a.f(h8);
    }

    public static String g(m m8) {
        return a.g(m8);
    }
}

