/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f {
    @Deprecated
    public static <T> List<T> a(T t8) {
        return Collections.singletonList(t8);
    }

    @Deprecated
    public static <T> List<T> b(T ... TArray) {
        int n8 = TArray.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return java.util.DesugarCollections.unmodifiableList(Arrays.asList(TArray));
            }
            return Collections.singletonList(TArray[0]);
        }
        return Collections.EMPTY_LIST;
    }
}

