/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.f;

public final class b
implements View.OnFocusChangeListener {
    public final f a;

    public /* synthetic */ b(f f8) {
        this.a = f8;
    }

    public final void onFocusChange(View view, boolean bl) {
        f.w(this.a, view, bl);
    }
}

