package ax.R5;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {
    @Deprecated
    public static <T> List<T> a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? DesugarCollections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.EMPTY_LIST;
    }
}
