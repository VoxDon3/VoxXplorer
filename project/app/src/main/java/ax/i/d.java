/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import androidx.activity.ComponentActivity;

public final class d
implements Runnable {
    public final ComponentActivity q;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.q = componentActivity;
    }

    @Override
    public final void run() {
        ComponentActivity.w(this.q);
    }
}

