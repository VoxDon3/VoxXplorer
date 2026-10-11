/*
 * Decompiled with CFR 0.152.
 */
package ax.p6;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class a
implements Runnable {
    public final View q;

    public /* synthetic */ a(View view) {
        this.q = view;
    }

    @Override
    public final void run() {
        BottomAppBar.T(this.q);
    }
}

