package ax.tb;

import java.util.AbstractList;
import java.util.List;

/* renamed from: ax.tb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3129e<E> extends AbstractList<E> implements List<E>, ax.Hb.b {
    protected AbstractC3129e() {
    }

    public abstract int e();

    public abstract E g(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return g(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
