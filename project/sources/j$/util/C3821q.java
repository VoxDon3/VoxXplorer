package j$.util;

import j$.util.Collection;
import j$.util.stream.AbstractC3919t1;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3821q extends C3952t {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C3816l, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.a, new j$.nio.file.p(consumer, 2));
    }

    @Override // j$.util.C3816l, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new C3820p(Collection.EL.c(this.a));
    }

    @Override // j$.util.C3816l, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC3919t1.a0(spliterator(), false);
    }

    @Override // j$.util.C3816l, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC3919t1.a0(spliterator(), true);
    }

    @Override // j$.util.C3816l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3815k(this);
    }

    @Override // j$.util.C3816l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new C3819o((Map.Entry) array[i]);
        }
        return array;
    }

    @Override // j$.util.C3816l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new C3819o((Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C3816l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.a.contains(new C3819o((Map.Entry) obj));
    }

    @Override // j$.util.C3816l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C3952t, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
