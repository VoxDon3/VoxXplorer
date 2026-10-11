/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;

public final class c
implements Runnable {
    public final OnBackPressedDispatcher c0;
    public final ComponentActivity q;

    public /* synthetic */ c(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
        this.q = componentActivity;
        this.c0 = onBackPressedDispatcher;
    }

    @Override
    public final void run() {
        ComponentActivity.i.a(this.q, this.c0);
    }
}

