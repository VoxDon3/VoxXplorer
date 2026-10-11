/*
 * Decompiled with CFR 0.152.
 */
package ax.Eb;

import ax.Gb.d;
import ax.Gb.l;
import ax.Mb.b;

public final class a {
    public static final <T> Class<T> a(b<T> object) {
        l.f(object, "<this>");
        object = ((d)object).b();
        l.d(object, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final <T> Class<T> b(b<T> clazz) {
        l.f(clazz, "<this>");
        clazz = ((d)((Object)clazz)).b();
        if (!clazz.isPrimitive()) {
            l.d(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clazz;
        }
        switch (clazz.getName()) {
            default: {
                break;
            }
            case "short": {
                clazz = Short.class;
                break;
            }
            case "float": {
                clazz = Float.class;
                break;
            }
            case "boolean": {
                clazz = Boolean.class;
                break;
            }
            case "void": {
                clazz = Void.class;
                break;
            }
            case "long": {
                clazz = Long.class;
                break;
            }
            case "char": {
                clazz = Character.class;
                break;
            }
            case "byte": {
                clazz = Byte.class;
                break;
            }
            case "int": {
                clazz = Integer.class;
                break;
            }
            case "double": {
                clazz = Double.class;
            }
        }
        l.d(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clazz;
    }
}

