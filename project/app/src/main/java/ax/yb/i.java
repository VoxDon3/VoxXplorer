/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.l;
import java.lang.reflect.Method;

final class i {
    public static final i a = new i();
    private static final a b = new a(null, null, null);
    private static a c;

    private i() {
    }

    private final a a(ax.yb.a object) {
        try {
            a a8;
            Method method = Class.class.getDeclaredMethod("getModule", null);
            Method method2 = object.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null);
            object = object.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null);
            c = a8 = new a(method, method2, (Method)object);
            return a8;
        }
        catch (Exception exception) {
            a a9;
            c = a9 = b;
            return a9;
        }
    }

    public final String b(ax.yb.a object) {
        Object object2;
        l.f(object, "continuation");
        Object object3 = object2 = c;
        if (object2 == null) {
            object3 = this.a((ax.yb.a)object);
        }
        if (object3 == b) {
            return null;
        }
        object2 = ((a)object3).a;
        if (object2 != null && (object2 = ((Method)object2).invoke(object.getClass(), null)) != null && (object = ((a)object3).b) != null && (object = ((Method)object).invoke(object2, null)) != null && (object = (object3 = ((a)object3).c) != null ? ((Method)object3).invoke(object, null) : null) instanceof String) {
            return (String)object;
        }
        return null;
    }

    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }
}

