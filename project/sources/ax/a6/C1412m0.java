package ax.a6;

/* renamed from: ax.a6.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1412m0 extends AbstractC1404i0 {
    private final AbstractC1416o0 d0;

    C1412m0(AbstractC1416o0 abstractC1416o0, int i) {
        super(abstractC1416o0.size(), i);
        this.d0 = abstractC1416o0;
    }

    @Override // ax.a6.AbstractC1404i0
    protected final Object b(int i) {
        return this.d0.get(i);
    }
}
