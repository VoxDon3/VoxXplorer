/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.view.View;
import ax.P0.H;
import com.voxdon.xplorer.viewer.g;

public final class k
implements View.OnClickListener {
    public final g.g a;
    public final H b;
    public final g.f c;

    public /* synthetic */ k(g.g g8, H h8, g.f f8) {
        this.a = g8;
        this.b = h8;
        this.c = f8;
    }

    public final void onClick(View view) {
        g.g.N(this.a, this.b, this.c, view);
    }
}

