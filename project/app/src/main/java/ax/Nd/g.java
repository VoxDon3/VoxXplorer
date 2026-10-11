/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

public class g {
    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object2 != null && object.equals(object2);
        {
        }
    }

    public static int b(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}

