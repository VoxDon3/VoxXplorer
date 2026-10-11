package j$.util;

import j$.util.stream.AbstractC3919t1;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static h0 a(Object[] objArr, int i, int i2) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new h0(objArr, i, i2, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return AbstractC3919t1.a0(a(tArr, 0, tArr.length), false);
    }
}
