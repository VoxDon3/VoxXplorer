/*
 * Decompiled with CFR 0.152.
 */
package ax.o6;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

public final class b
implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final HideViewOnScrollBehavior a;
    public final View b;

    public /* synthetic */ b(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view) {
        this.a = hideViewOnScrollBehavior;
        this.b = view;
    }

    public final void onTouchExplorationStateChanged(boolean bl) {
        HideViewOnScrollBehavior.I(this.a, this.b, bl);
    }
}

