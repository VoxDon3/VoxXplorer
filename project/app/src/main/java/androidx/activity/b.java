/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;

public final class b
implements Runnable {
    public final ComponentActivity q;

    public /* synthetic */ b(ComponentActivity componentActivity) {
        this.q = componentActivity;
    }

    @Override
    public final void run() {
        ComponentActivity.i.b(this.q);
    }
}

