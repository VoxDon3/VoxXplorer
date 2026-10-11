/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.KeyEvent;
import android.view.View;
import ax.c0.d0;

public final class e0
implements View.OnUnhandledKeyEventListener {
    public final d0.q a;

    public /* synthetic */ e0(d0.q q8) {
        this.a = q8;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.a.onUnhandledKeyEvent(view, keyEvent);
    }
}

