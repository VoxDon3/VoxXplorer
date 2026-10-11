package ax.a6;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class r0 extends AbstractC1416o0 {
    static final AbstractC1416o0 g0 = new r0(new Object[0], 0);
    final transient Object[] e0;
    private final transient int f0;

    r0(Object[] objArr, int i) {
        this.e0 = objArr;
        this.f0 = i;
    }

    @Override // ax.a6.AbstractC1416o0, ax.a6.AbstractC1410l0
    final int e(Object[] objArr, int i) {
        Object[] objArr2 = this.e0;
        int i2 = this.f0;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // ax.a6.AbstractC1410l0
    final int g() {
        return this.f0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C1400g0.a(i, this.f0, "index");
        Object obj = this.e0[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ax.a6.AbstractC1410l0
    final int h() {
        return 0;
    }

    @Override // ax.a6.AbstractC1410l0
    final Object[] i() {
        return this.e0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f0;
    }
}
