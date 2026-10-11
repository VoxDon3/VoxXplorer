/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import androidx.recyclerview.widget.RecyclerView;
import ax.d3.T;

public final class S
implements Runnable {
    public final RecyclerView.m c0;
    public final RecyclerView q;

    public /* synthetic */ S(RecyclerView recyclerView, RecyclerView.m m8) {
        this.q = recyclerView;
        this.c0 = m8;
    }

    @Override
    public final void run() {
        T.d3(this.q, this.c0);
    }
}

