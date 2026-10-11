package ax.j6;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
final class n implements InterfaceC2319b {
    final /* synthetic */ Collection a;

    n(Collection collection) {
        this.a = collection;
    }

    @Override // ax.j6.InterfaceC2319b
    public final /* bridge */ /* synthetic */ Object a(AbstractC2327j abstractC2327j) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return m.e(arrayList);
    }
}
