/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.view.View;
import ax.x3.x;

public final class w
implements View.OnClickListener {
    public final x a;
    public final View.OnClickListener b;

    public /* synthetic */ w(x x8, View.OnClickListener onClickListener) {
        this.a = x8;
        this.b = onClickListener;
    }

    public final void onClick(View view) {
        x.a(this.a, this.b, view);
    }
}

