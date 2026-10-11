package ax.tb;

import java.lang.reflect.Array;

/* renamed from: ax.tb.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3134j {
    public static final <T> T[] a(T[] tArr, int i) {
        ax.Gb.l.f(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        ax.Gb.l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
