/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class x {
    private static final Object a;
    private static final Method b;
    private static final Method c;

    static {
        Object object;
        a = object = x.b();
        Object var1_1 = null;
        Method method = object == null ? null : x.a();
        b = method;
        method = object == null ? var1_1 : x.d(object);
        c = method;
    }

    private static Method a() {
        return x.c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object b() {
        Object object = null;
        try {
            Object object2 = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
            return object2;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
        catch (Throwable throwable) {
            return object;
        }
    }

    private static Method c(String object, Class<?> ... classArray) throws ThreadDeath {
        try {
            object = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod((String)object, classArray);
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
    }

    private static Method d(Object object) {
        Method method;
        block3: {
            method = x.c("getStackTraceDepth", Throwable.class);
            if (method != null) break block3;
            return null;
        }
        try {
            Throwable throwable = new Throwable();
            method.invoke(object, throwable);
            return method;
        }
        catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException exception) {
            return null;
        }
    }

    @Deprecated
    public static RuntimeException e(Throwable throwable) {
        x.f(throwable);
        throw new RuntimeException(throwable);
    }

    public static void f(Throwable throwable) {
        n.n(throwable);
        if (!(throwable instanceof RuntimeException)) {
            if (!(throwable instanceof Error)) {
                return;
            }
            throw (Error)throwable;
        }
        throw (RuntimeException)throwable;
    }
}

