package ax.b6;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class D3 implements Comparator<B3> {
    D3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(B3 b3, B3 b32) {
        B3 b33 = b3;
        B3 b34 = b32;
        H3 h3 = (H3) b33.iterator();
        H3 h32 = (H3) b34.iterator();
        while (h3.hasNext() && h32.hasNext()) {
            int compareTo = Integer.valueOf(B3.h(h3.a())).compareTo(Integer.valueOf(B3.h(h32.a())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(b33.s()).compareTo(Integer.valueOf(b34.s()));
    }
}
