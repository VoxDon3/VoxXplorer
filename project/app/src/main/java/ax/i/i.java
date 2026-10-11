/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;

public final class i
implements f {
    public final ComponentActivity c0;
    public final OnBackPressedDispatcher q;

    public /* synthetic */ i(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity) {
        this.q = onBackPressedDispatcher;
        this.c0 = componentActivity;
    }

    @Override
    public final void b(h h8, d.a a8) {
        ComponentActivity.u(this.q, this.c0, h8, a8);
    }
}

