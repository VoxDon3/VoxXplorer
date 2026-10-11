package ax.tb;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: ax.tb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3130f<E> extends AbstractSet<E> implements Set<E>, ax.Hb.a {
    protected AbstractC3130f() {
    }

    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
