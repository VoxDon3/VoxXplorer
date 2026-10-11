/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

public class k {
    public static Throwable a(Object[] object) {
        if (object != null && ((Object[])object).length != 0 && (object = object[((Object[])object).length - 1]) instanceof Throwable) {
            return (Throwable)object;
        }
        return null;
    }

    public static Object[] b(Object[] objectArray) {
        if (objectArray != null && objectArray.length != 0) {
            int n8 = objectArray.length - 1;
            Object[] objectArray2 = new Object[n8];
            if (n8 > 0) {
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            }
            return objectArray2;
        }
        throw new IllegalStateException("non-sensical empty or null argument array");
    }
}

