/*
 * Decompiled with CFR 0.152.
 */
package ax.Y8;

import java.util.Arrays;

public class f {
    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static int b(Object ... objectArray) {
        return Arrays.hashCode(objectArray);
    }
}

