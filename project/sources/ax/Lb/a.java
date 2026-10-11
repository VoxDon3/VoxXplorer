package ax.Lb;

import java.lang.Comparable;

/* loaded from: classes3.dex */
public interface a<T extends Comparable<? super T>> extends b<T> {
    boolean e(T t, T t2);

    @Override // ax.Lb.b
    boolean isEmpty();
}
