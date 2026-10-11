package ax.r7;

import java.util.Queue;

/* renamed from: ax.r7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2987v<E> extends AbstractC2984s<E> implements Queue<E> {
    protected AbstractC2987v() {
    }

    @Override // java.util.Queue
    public E element() {
        return k().element();
    }

    protected abstract Queue<E> k();

    @Override // java.util.Queue
    public E peek() {
        return k().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return k().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return k().remove();
    }
}
