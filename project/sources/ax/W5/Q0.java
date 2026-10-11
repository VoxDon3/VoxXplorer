package ax.W5;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class Q0 extends AbstractC1025e0 implements RandomAccess, R0 {
    private static final Q0 d0;

    @Deprecated
    public static final R0 e0;
    private final List c0;

    static {
        Q0 q0 = new Q0(false);
        d0 = q0;
        e0 = q0;
    }

    public Q0() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1069t0 ? ((AbstractC1069t0) obj).s(O0.b) : O0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        e();
        this.c0.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        if (collection instanceof R0) {
            collection = ((R0) collection).j();
        }
        boolean addAll = this.c0.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.c0.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ax.W5.R0
    public final R0 f() {
        return c() ? new S1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.c0.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1069t0) {
            AbstractC1069t0 abstractC1069t0 = (AbstractC1069t0) obj;
            String s = abstractC1069t0.s(O0.b);
            if (abstractC1069t0.n()) {
                this.c0.set(i, s);
            }
            return s;
        }
        byte[] bArr = (byte[]) obj;
        String d = O0.d(bArr);
        if (b2.b(bArr)) {
            this.c0.set(i, d);
        }
        return d;
    }

    @Override // ax.W5.R0
    public final List j() {
        return DesugarCollections.unmodifiableList(this.c0);
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        Object remove = this.c0.remove(i);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        e();
        return h(this.c0.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c0.size();
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c0);
        return new Q0(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.c0 = arrayList;
    }

    private Q0(ArrayList arrayList) {
        super(true);
        this.c0 = arrayList;
    }

    private Q0(boolean z) {
        super(false);
        this.c0 = Collections.EMPTY_LIST;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
