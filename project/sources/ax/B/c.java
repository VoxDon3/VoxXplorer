package ax.B;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
class c {
    static <T> T[] a(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
