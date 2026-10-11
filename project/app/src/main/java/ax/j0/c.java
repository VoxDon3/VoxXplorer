/*
 * Decompiled with CFR 0.152.
 */
package ax.j0;

import ax.j0.b;
import ax.tb.o;
import java.util.ArrayList;

final class c {
    private final ArrayList<b> a = new ArrayList();

    public final void a() {
        for (int i8 = o.k(this.a); -1 < i8; --i8) {
            this.a.get(i8).a();
        }
    }
}

