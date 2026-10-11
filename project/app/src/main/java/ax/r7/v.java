/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.s;
import java.util.Queue;

public abstract class v<E>
extends s<E>
implements Queue<E> {
    protected v() {
    }

    @Override
    public E element() {
        return this.k().element();
    }

    protected abstract Queue<E> k();

    @Override
    public E peek() {
        return this.k().peek();
    }

    @Override
    public E poll() {
        return this.k().poll();
    }

    @Override
    public E remove() {
        return this.k().remove();
    }
}

