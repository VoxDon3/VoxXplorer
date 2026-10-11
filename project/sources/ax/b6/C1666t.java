package ax.b6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1666t extends AbstractC1619n implements InterfaceC1611m {
    private final List<String> d0;
    private final List<InterfaceC1658s> e0;
    private Z2 f0;

    private C1666t(C1666t c1666t) {
        super(c1666t.q);
        ArrayList arrayList = new ArrayList(c1666t.d0.size());
        this.d0 = arrayList;
        arrayList.addAll(c1666t.d0);
        ArrayList arrayList2 = new ArrayList(c1666t.e0.size());
        this.e0 = arrayList2;
        arrayList2.addAll(c1666t.e0);
        this.f0 = c1666t.f0;
    }

    @Override // ax.b6.AbstractC1619n
    public final InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list) {
        Z2 d = this.f0.d();
        for (int i = 0; i < this.d0.size(); i++) {
            if (i < list.size()) {
                d.e(this.d0.get(i), z2.b(list.get(i)));
            } else {
                d.e(this.d0.get(i), InterfaceC1658s.f);
            }
        }
        for (InterfaceC1658s interfaceC1658s : this.e0) {
            InterfaceC1658s b = d.b(interfaceC1658s);
            if (b instanceof C1682v) {
                b = d.b(interfaceC1658s);
            }
            if (b instanceof C1603l) {
                return ((C1603l) b).a();
            }
        }
        return InterfaceC1658s.f;
    }

    @Override // ax.b6.AbstractC1619n, ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return new C1666t(this);
    }

    public C1666t(String str, List<InterfaceC1658s> list, List<InterfaceC1658s> list2, Z2 z2) {
        super(str);
        this.d0 = new ArrayList();
        this.f0 = z2;
        if (!list.isEmpty()) {
            Iterator<InterfaceC1658s> it = list.iterator();
            while (it.hasNext()) {
                this.d0.add(it.next().g());
            }
        }
        this.e0 = new ArrayList(list2);
    }
}
