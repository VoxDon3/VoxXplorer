/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.e;
import java.util.Arrays;

public final class j
extends e {
    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static int b(Object ... objectArray) {
        return Arrays.hashCode(objectArray);
    }
}

