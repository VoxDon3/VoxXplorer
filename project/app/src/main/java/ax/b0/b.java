/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

public class b {
    public static boolean a(Object object, Object object2) {
        return j.Objects.equals((Object)object, (Object)object2);
    }

    public static int b(Object ... objectArray) {
        return j.Objects.hash((Object[])objectArray);
    }

    public static <T> T c(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T d(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }

    public static String e(Object object, String string) {
        if (object != null) {
            return object.toString();
        }
        return string;
    }
}

