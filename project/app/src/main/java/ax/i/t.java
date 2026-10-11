/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import ax.Fb.a;

public final class t
implements OnBackInvokedCallback {
    public final a a;

    public /* synthetic */ t(a a8) {
        this.a = a8;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.f.a(this.a);
    }
}

