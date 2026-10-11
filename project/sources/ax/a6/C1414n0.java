package ax.a6;

import java.util.List;

/* renamed from: ax.a6.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1414n0 extends AbstractC1416o0 {
    final transient int e0;
    final transient int f0;
    final /* synthetic */ AbstractC1416o0 g0;

    C1414n0(AbstractC1416o0 abstractC1416o0, int i, int i2) {
        this.g0 = abstractC1416o0;
        this.e0 = i;
        this.f0 = i2;
    }

    @Override // ax.a6.AbstractC1410l0
    final int g() {
        return this.g0.h() + this.e0 + this.f0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C1400g0.a(i, this.f0, "index");
        return this.g0.get(i + this.e0);
    }

    @Override // ax.a6.AbstractC1410l0
    final int h() {
        return this.g0.h() + this.e0;
    }

    @Override // ax.a6.AbstractC1410l0
    final Object[] i() {
        return this.g0.i();
    }

    @Override // ax.a6.AbstractC1416o0
    /* renamed from: k */
    public final AbstractC1416o0 subList(int i, int i2) {
        C1400g0.c(i, i2, this.f0);
        int i3 = this.e0;
        return this.g0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f0;
    }

    @Override // ax.a6.AbstractC1416o0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
