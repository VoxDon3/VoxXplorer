/*
 * Decompiled with CFR 0.152.
 */
package ax.Q6;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public final class d
implements View.OnClickListener {
    public final Snackbar a;
    public final View.OnClickListener b;

    public /* synthetic */ d(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.a = snackbar;
        this.b = onClickListener;
    }

    public final void onClick(View view) {
        Snackbar.i0(this.a, this.b, view);
    }
}

