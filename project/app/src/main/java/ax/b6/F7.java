/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.C7;
import ax.b6.D7;
import ax.b6.Z2;
import ax.b6.n;
import ax.b6.s;
import ax.b6.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class F7
extends n {
    private boolean d0;
    private boolean e0;
    private final C7 f0;

    public F7(C7 c72, boolean bl, boolean bl2) {
        this.f0 = c72;
        super("log");
        this.d0 = bl;
        this.e0 = bl2;
    }

    @Override
    public final s a(Z2 z22, List<s> list) {
        y2.k("log", 1, list);
        if (list.size() == 1) {
            C7.d(this.f0).a(D7.d0, z22.b(list.get(0)).g(), Collections.EMPTY_LIST, this.d0, this.e0);
            return s.f;
        }
        D7 d72 = D7.d(y2.i(z22.b(list.get(0)).f()));
        String string = z22.b(list.get(1)).g();
        int n8 = list.size();
        if (n8 == 2) {
            C7.d(this.f0).a(d72, string, Collections.EMPTY_LIST, this.d0, this.e0);
            return s.f;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i8 = 2; i8 < Math.min(list.size(), 5); ++i8) {
            arrayList.add(z22.b(list.get(i8)).g());
        }
        C7.d(this.f0).a(d72, string, arrayList, this.d0, this.e0);
        return s.f;
    }
}

