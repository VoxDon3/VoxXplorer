/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class l0
extends AbstractCollection
implements Serializable,
j.Collection {
    private static final Object[] q = new Object[0];

    l0() {
    }

    @Override
    @Deprecated
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public abstract boolean contains(Object var1);

    int e(Object[] objectArray, int n8) {
        throw null;
    }

    @Override
    public /* synthetic */ void forEach(Consumer consumer) {
        j.Iterable._CC.$default$forEach((Iterable)this, (Consumer)consumer);
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    Object[] i() {
        return null;
    }

    public /* synthetic */ j.Stream parallelStream() {
        return j.Collection._CC.$default$parallelStream((Collection)this);
    }

    @Override
    public /* synthetic */ Stream parallelStream() {
        return j.Stream.Wrapper.convert((j.Stream)this.parallelStream());
    }

    @Override
    @Deprecated
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return j.Collection._CC.$default$removeIf((Collection)this, (Predicate)predicate);
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final j.Spliterator spliterator() {
        return j.Spliterators.spliterator((Collection)this, (int)1296);
    }

    @Override
    public /* synthetic */ Spliterator spliterator() {
        return j.Spliterator.Wrapper.convert((j.Spliterator)this.spliterator());
    }

    public /* synthetic */ j.Stream stream() {
        return j.Collection._CC.$default$stream((Collection)this);
    }

    @Override
    public /* synthetic */ Stream stream() {
        return j.Stream.Wrapper.convert((j.Stream)this.stream());
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(q);
    }

    @Override
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return j.Collection._CC.$default$toArray((Collection)this, (IntFunction)intFunction);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2;
        objectArray.getClass();
        int n8 = this.size();
        int n9 = objectArray.length;
        if (n9 < n8) {
            objectArray2 = this.i();
            if (objectArray2 != null) return Arrays.copyOfRange(objectArray2, this.h(), this.g(), objectArray.getClass());
            objectArray2 = objectArray;
            if (n9 != 0) {
                objectArray2 = Arrays.copyOf(objectArray, 0);
            }
            objectArray2 = Arrays.copyOf(objectArray2, n8);
        } else {
            objectArray2 = objectArray;
            if (n9 > n8) {
                objectArray[n8] = null;
                objectArray2 = objectArray;
            }
        }
        this.e(objectArray2, 0);
        return objectArray2;
    }
}

