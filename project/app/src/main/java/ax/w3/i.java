/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.view.View;
import ax.P0.H;
import com.voxdon.xplorer.viewer.g;

public final class i
implements View.OnClickListener {
    public final g.b a;
    public final H b;

    public /* synthetic */ i(g.b b8, H h8) {
        this.a = b8;
        this.b = h8;
    }

    public final void onClick(View view) {
        g.b.U(this.a, this.b, view);
    }
}

