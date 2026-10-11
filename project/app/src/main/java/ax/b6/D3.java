/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.H3;
import java.util.Comparator;

final class D3
implements Comparator<B3> {
    D3() {
    }

    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (B3)object;
        B3 b32 = (B3)object2;
        H3 h32 = (H3)((B3)object).iterator();
        object2 = (H3)b32.iterator();
        while (h32.hasNext() && object2.hasNext()) {
            int n8 = Integer.valueOf(B3.h(h32.a())).compareTo(B3.h(object2.a()));
            if (n8 == 0) continue;
            return n8;
        }
        return Integer.valueOf(((B3)object).s()).compareTo(b32.s());
    }
}

