package ax.a6;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class t0 extends p0 {
    final transient Object d0;

    t0(Object obj) {
        obj.getClass();
        this.d0 = obj;
    }

    @Override // ax.a6.AbstractC1410l0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d0.equals(obj);
    }

    @Override // ax.a6.AbstractC1410l0
    final int e(Object[] objArr, int i) {
        objArr[0] = this.d0;
        return 1;
    }

    @Override // ax.a6.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d0.hashCode();
    }

    @Override // ax.a6.p0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new q0(this.d0);
    }

    @Override // ax.a6.p0
    /* renamed from: k */
    public final u0 iterator() {
        return new q0(this.d0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d0.toString() + "]";
    }
}
