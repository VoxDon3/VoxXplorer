/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

public final class j {
    public static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static boolean b(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == null) {
            return objectArray2 == null;
        }
        if (objectArray2 != null && objectArray.length == objectArray2.length) {
            for (int i8 = 0; i8 < objectArray.length; ++i8) {
                if (j.a(objectArray[i8], objectArray2[i8])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static int c(int n8, int n9) {
        return n8 * 37 + n9;
    }

    public static int d(int n8, Object object) {
        int n9 = object != null ? object.hashCode() : 0;
        return j.c(n8, n9);
    }
}

