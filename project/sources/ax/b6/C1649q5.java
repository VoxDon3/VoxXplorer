package ax.b6;

import java.util.Iterator;

/* renamed from: ax.b6.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1649q5 extends C1704x5 {
    private final /* synthetic */ C1617m5 c0;

    @Override // ax.b6.C1704x5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1633o5(this.c0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C1649q5(C1617m5 c1617m5) {
        super(c1617m5);
        this.c0 = c1617m5;
    }
}
