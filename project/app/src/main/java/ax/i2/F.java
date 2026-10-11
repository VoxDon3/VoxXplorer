/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import androidx.recyclerview.widget.RecyclerView;
import ax.b0.a;

public final class F
implements a {
    public final RecyclerView a;

    public /* synthetic */ F(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void accept(Object object) {
        this.a.post((Runnable)object);
    }
}

