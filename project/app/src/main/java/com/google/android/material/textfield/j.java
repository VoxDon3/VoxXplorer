/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.p;

public final class j
implements View.OnTouchListener {
    public final p a;

    public /* synthetic */ j(p p8) {
        this.a = p8;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return p.z(this.a, view, motionEvent);
    }
}

