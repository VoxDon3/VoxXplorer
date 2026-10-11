package ax.r0;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ax.r0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2909F extends AbstractC2916c<String> implements InterfaceC2910G, RandomAccess {
    private static final C2909F d0;
    public static final InterfaceC2910G e0;
    private final List<Object> c0;

    static {
        C2909F c2909f = new C2909F();
        d0 = c2909f;
        c2909f.F();
        e0 = c2909f;
    }

    public C2909F() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2921h ? ((AbstractC2921h) obj).D() : C2904A.j((byte[]) obj);
    }

    @Override // ax.r0.InterfaceC2910G
    public InterfaceC2910G A0() {
        return G0() ? new r0(this) : this;
    }

    @Override // ax.r0.InterfaceC2910G
    public void C0(AbstractC2921h abstractC2921h) {
        e();
        this.c0.add(abstractC2921h);
        ((AbstractList) this).modCount++;
    }

    @Override // ax.r0.InterfaceC2910G
    public Object D0(int i) {
        return this.c0.get(i);
    }

    @Override // ax.r0.AbstractC2916c, ax.r0.C2904A.i
    public /* bridge */ /* synthetic */ boolean G0() {
        return super.G0();
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.c0.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ax.r0.InterfaceC2910G
    public List<?> d0() {
        return DesugarCollections.unmodifiableList(this.c0);
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        e();
        this.c0.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.c0.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2921h) {
            AbstractC2921h abstractC2921h = (AbstractC2921h) obj;
            String D = abstractC2921h.D();
            if (abstractC2921h.r()) {
                this.c0.set(i, D);
            }
            return D;
        }
        byte[] bArr = (byte[]) obj;
        String j = C2904A.j(bArr);
        if (C2904A.g(bArr)) {
            this.c0.set(i, j);
        }
        return j;
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2909F L(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c0);
        return new C2909F((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        e();
        Object remove = this.c0.remove(i);
        ((AbstractList) this).modCount++;
        return h(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        e();
        return h(this.c0.set(i, str));
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c0.size();
    }

    public C2909F(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        e();
        if (collection instanceof InterfaceC2910G) {
            collection = ((InterfaceC2910G) collection).d0();
        }
        boolean addAll = this.c0.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C2909F(ArrayList<Object> arrayList) {
        this.c0 = arrayList;
    }
}
