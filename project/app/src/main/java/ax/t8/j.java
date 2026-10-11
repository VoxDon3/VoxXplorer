/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import java.lang.reflect.Type;

public final class j {
    public static boolean a(Type type) {
        return type instanceof Class && ((Class)type).isPrimitive();
    }

    public static <T> Class<T> b(Class<T> clazz) {
        if (clazz == Integer.TYPE) {
            return Integer.class;
        }
        if (clazz == Float.TYPE) {
            return Float.class;
        }
        if (clazz == Byte.TYPE) {
            return Byte.class;
        }
        if (clazz == Double.TYPE) {
            return Double.class;
        }
        if (clazz == Long.TYPE) {
            return Long.class;
        }
        if (clazz == Character.TYPE) {
            return Character.class;
        }
        if (clazz == Boolean.TYPE) {
            return Boolean.class;
        }
        if (clazz == Short.TYPE) {
            return Short.class;
        }
        Class<Object> clazz2 = clazz;
        if (clazz == Void.TYPE) {
            clazz2 = Void.class;
        }
        return clazz2;
    }
}

