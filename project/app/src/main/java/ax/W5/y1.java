/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.D0;
import ax.W5.I1;
import java.util.List;
import java.util.Map;

final class y1
extends I1 {
    y1(int n8) {
        super(n8, null);
    }

    @Override
    public final void a() {
        if (!this.k()) {
            for (int i8 = 0; i8 < this.b(); ++i8) {
                Map.Entry entry = this.g(i8);
                if (!((D0)entry.getKey()).c()) continue;
                entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
            }
            for (Map.Entry entry : this.c()) {
                if (!((D0)entry.getKey()).c()) continue;
                entry.setValue(java.util.DesugarCollections.unmodifiableList((List)((List)entry.getValue())));
            }
        }
        super.a();
    }
}

