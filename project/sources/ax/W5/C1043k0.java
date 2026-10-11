package ax.W5;

import java.util.Comparator;

/* renamed from: ax.W5.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1043k0 implements Comparator {
    C1043k0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC1069t0 abstractC1069t0 = (AbstractC1069t0) obj;
        AbstractC1069t0 abstractC1069t02 = (AbstractC1069t0) obj2;
        C1040j0 c1040j0 = new C1040j0(abstractC1069t0);
        C1040j0 c1040j02 = new C1040j0(abstractC1069t02);
        while (c1040j0.hasNext() && c1040j02.hasNext()) {
            int compareTo = Integer.valueOf(c1040j0.a() & 255).compareTo(Integer.valueOf(c1040j02.a() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC1069t0.h()).compareTo(Integer.valueOf(abstractC1069t02.h()));
    }
}
