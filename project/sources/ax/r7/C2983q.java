package ax.r7;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: ax.r7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2983q<E> extends AbstractC2987v<E> implements Serializable {
    final int c0;
    private final Queue<E> q;

    private C2983q(int i) {
        ax.q7.n.g(i >= 0, "maxSize (%s) must >= 0", i);
        this.q = new ArrayDeque(i);
        this.c0 = i;
    }

    public static <E> C2983q<E> l(int i) {
        return new C2983q<>(i);
    }

    @Override // java.util.Collection, java.util.Queue
    public boolean add(E e) {
        ax.q7.n.n(e);
        if (this.c0 == 0) {
            return true;
        }
        if (size() == this.c0) {
            this.q.remove();
        }
        this.q.add(e);
        return true;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.c0) {
            return i(collection);
        }
        clear();
        return F.a(this, F.k(collection, size - this.c0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.r7.AbstractC2984s
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Queue<E> g() {
        return this.q;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    @Override // ax.r7.AbstractC2984s, java.util.Collection
    public Object[] toArray() {
        return super.toArray();
    }
}
