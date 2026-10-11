package ax.r7;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
final class U {
    static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    static <K, V> Map<K, V> c(int i) {
        return C2977k.w(i);
    }
}
