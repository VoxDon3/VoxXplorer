/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.f4;
import ax.b6.m5;
import java.util.List;
import java.util.Map;

final class p5
extends m5 {
    p5() {
        super(null);
    }

    @Override
    public final void m() {
        if (!this.o()) {
            for (int i8 = 0; i8 < this.a(); ++i8) {
                Map.Entry entry = this.f(i8);
                if (!((f4)entry.getKey()).f()) continue;
                entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
            }
            for (Map.Entry entry : this.g()) {
                if (!((f4)entry.getKey()).f()) continue;
                entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
            }
        }
        super.m();
    }
}

