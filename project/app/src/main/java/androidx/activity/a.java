/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;

public final class a
implements Runnable {
    public final ComponentActivity.e q;

    public /* synthetic */ a(ComponentActivity.e e8) {
        this.q = e8;
    }

    @Override
    public final void run() {
        ComponentActivity.e.a(this.q);
    }
}

