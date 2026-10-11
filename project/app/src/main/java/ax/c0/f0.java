/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.ViewConfiguration;
import ax.b0.h;

public final class f0
implements h {
    public final ViewConfiguration a;

    public /* synthetic */ f0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    public final Object get() {
        return this.a.getScaledMaximumFlingVelocity();
    }
}

