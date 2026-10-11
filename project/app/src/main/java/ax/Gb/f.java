/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.l;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class f {
    private static final Object[] a = new Object[0];

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] a(Collection<?> objectArray) {
        l.f(objectArray, "collection");
        int n8 = objectArray.size();
        if (n8 == 0) {
            return a;
        }
        Iterator iterator = objectArray.iterator();
        if (!iterator.hasNext()) {
            return a;
        }
        Object[] objectArray2 = new Object[n8];
        n8 = 0;
        while (true) {
            int n9 = n8 + 1;
            objectArray2[n8] = iterator.next();
            if (n9 >= objectArray2.length) {
                int n10;
                if (!iterator.hasNext()) {
                    return objectArray2;
                }
                n8 = n10 = n9 * 3 + 1 >>> 1;
                if (n10 <= n9) {
                    n8 = 0x7FFFFFFD;
                    if (n9 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                }
                objectArray = Arrays.copyOf(objectArray2, n8);
                l.e(objectArray, "copyOf(...)");
            } else {
                objectArray = objectArray2;
                if (!iterator.hasNext()) {
                    objectArray = Arrays.copyOf(objectArray2, n9);
                    l.e(objectArray, "copyOf(...)");
                    return objectArray;
                }
            }
            n8 = n9;
            objectArray2 = objectArray;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Object[] b(Collection<?> objectArray, Object[] objectArray2) {
        l.f(objectArray, "collection");
        objectArray2.getClass();
        int n8 = objectArray.size();
        int n9 = 0;
        if (n8 == 0) {
            if (objectArray2.length <= 0) return objectArray2;
            objectArray2[0] = null;
            return objectArray2;
        }
        Iterator iterator = objectArray.iterator();
        if (!iterator.hasNext()) {
            if (objectArray2.length <= 0) return objectArray2;
            objectArray2[0] = null;
            return objectArray2;
        }
        if (n8 <= objectArray2.length) {
            objectArray = objectArray2;
        } else {
            objectArray = Array.newInstance(objectArray2.getClass().getComponentType(), n8);
            l.d(objectArray, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        while (true) {
            Object[] objectArray3;
            n8 = n9 + 1;
            objectArray[n9] = iterator.next();
            if (n8 >= objectArray.length) {
                int n10;
                if (!iterator.hasNext()) {
                    return objectArray;
                }
                n9 = n10 = n8 * 3 + 1 >>> 1;
                if (n10 <= n8) {
                    n9 = 0x7FFFFFFD;
                    if (n8 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                }
                objectArray3 = Arrays.copyOf(objectArray, n9);
                l.e(objectArray3, "copyOf(...)");
            } else {
                objectArray3 = objectArray;
                if (!iterator.hasNext()) {
                    if (objectArray != objectArray2) break;
                    objectArray2[n8] = null;
                    return objectArray2;
                }
            }
            n9 = n8;
            objectArray = objectArray3;
        }
        objectArray = Arrays.copyOf(objectArray, n8);
        l.e(objectArray, "copyOf(...)");
        return objectArray;
    }
}

