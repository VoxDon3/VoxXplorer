package ax.b6;

import java.util.List;

/* renamed from: ax.b6.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1539d7 extends AbstractC1619n {
    private final /* synthetic */ C6 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1539d7(A5 a5, String str, C6 c6) {
        super(str);
        this.d0 = c6;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        C1709y2.g("getValue", 2, list);
        InterfaceC1658s b = z2.b(list.get(0));
        InterfaceC1658s b2 = z2.b(list.get(1));
        String h = this.d0.h(b.g());
        return h != null ? new C1674u(h) : b2;
    }
}
