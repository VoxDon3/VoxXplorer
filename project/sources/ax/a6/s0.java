package ax.a6;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class s0 extends p0 {
    private static final Object[] i0;
    static final s0 j0;
    final transient Object[] d0;
    private final transient int e0;
    final transient Object[] f0;
    private final transient int g0;
    private final transient int h0;

    static {
        Object[] objArr = new Object[0];
        i0 = objArr;
        j0 = new s0(objArr, 0, objArr, 0, 0);
    }

    s0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d0 = objArr;
        this.e0 = i;
        this.f0 = objArr2;
        this.g0 = i2;
        this.h0 = i3;
    }

    @Override // ax.a6.AbstractC1410l0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f0;
            if (objArr.length != 0) {
                int a = C1408k0.a(obj.hashCode());
                while (true) {
                    int i = a & this.g0;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a = i + 1;
                }
            }
        }
        return false;
    }

    @Override // ax.a6.AbstractC1410l0
    final int e(Object[] objArr, int i) {
        Object[] objArr2 = this.d0;
        int i2 = this.h0;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // ax.a6.AbstractC1410l0
    final int g() {
        return this.h0;
    }

    @Override // ax.a6.AbstractC1410l0
    final int h() {
        return 0;
    }

    @Override // ax.a6.p0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e0;
    }

    @Override // ax.a6.AbstractC1410l0
    final Object[] i() {
        return this.d0;
    }

    @Override // ax.a6.p0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // ax.a6.p0
    /* renamed from: k */
    public final u0 iterator() {
        return n().listIterator(0);
    }

    @Override // ax.a6.p0
    final AbstractC1416o0 p() {
        return AbstractC1416o0.l(this.d0, this.h0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h0;
    }

    @Override // ax.a6.p0
    final boolean t() {
        return true;
    }
}
