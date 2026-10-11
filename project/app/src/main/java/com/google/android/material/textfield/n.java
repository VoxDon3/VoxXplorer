/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.view.accessibility.AccessibilityManager;
import com.google.android.material.textfield.p;

public final class n
implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final p a;

    public /* synthetic */ n(p p8) {
        this.a = p8;
    }

    public final void onTouchExplorationStateChanged(boolean bl) {
        p.w(this.a, bl);
    }
}

