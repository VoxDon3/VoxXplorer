package ax.r7;

/* loaded from: classes3.dex */
final class X<E> extends AbstractC2964C<E> {
    private static final Object[] i0;
    static final X<Object> j0;
    final transient Object[] d0;
    private final transient int e0;
    final transient Object[] f0;
    private final transient int g0;
    private final transient int h0;

    static {
        Object[] objArr = new Object[0];
        i0 = objArr;
        j0 = new X<>(objArr, 0, objArr, 0, 0);
    }

    X(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d0 = objArr;
        this.e0 = i;
        this.f0 = objArr2;
        this.g0 = i2;
        this.h0 = i3;
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f0;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = C2988w.c(obj);
        while (true) {
            int i = c & this.g0;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    @Override // ax.r7.AbstractC2989x
    int g(Object[] objArr, int i) {
        System.arraycopy(this.d0, 0, objArr, i, this.h0);
        return i + this.h0;
    }

    @Override // ax.r7.AbstractC2989x
    Object[] h() {
        return this.d0;
    }

    @Override // ax.r7.AbstractC2964C, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.e0;
    }

    @Override // ax.r7.AbstractC2989x
    int i() {
        return this.h0;
    }

    @Override // ax.r7.AbstractC2989x
    int k() {
        return 0;
    }

    @Override // ax.r7.AbstractC2989x
    boolean l() {
        return false;
    }

    @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public j0<E> iterator() {
        return e().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.h0;
    }

    @Override // ax.r7.AbstractC2964C
    AbstractC2991z<E> w() {
        return AbstractC2991z.q(this.d0, this.h0);
    }

    @Override // ax.r7.AbstractC2964C
    boolean x() {
        return true;
    }
}
