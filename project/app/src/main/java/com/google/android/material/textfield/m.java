/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.view.View;
import com.google.android.material.textfield.p;

public final class m
implements View.OnFocusChangeListener {
    public final p a;

    public /* synthetic */ m(p p8) {
        this.a = p8;
    }

    public final void onFocusChange(View view, boolean bl) {
        p.y(this.a, view, bl);
    }
}

