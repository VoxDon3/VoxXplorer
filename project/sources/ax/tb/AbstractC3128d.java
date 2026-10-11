package ax.tb;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: ax.tb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3128d<E> extends AbstractCollection<E> implements Collection<E>, ax.Hb.a {
    protected AbstractC3128d() {
    }

    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }
}
