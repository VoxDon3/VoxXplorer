/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import java.lang.reflect.Array;

class j {
    public static final <T> T[] a(T[] object, int n8) {
        l.f(object, "reference");
        object = Array.newInstance(object.getClass().getComponentType(), n8);
        l.d(object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return object;
    }

    public static final void b(int n8, int n9) {
        if (n8 <= n9) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("toIndex (");
        stringBuilder.append(n8);
        stringBuilder.append(") is greater than size (");
        stringBuilder.append(n9);
        stringBuilder.append(").");
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }
}

