/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout
extends FrameLayout {
    private Path a;
    private float[] b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void dispatchDraw(Canvas canvas) {
        if (this.a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int n8 = canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(n8);
    }

    public float[] getCornerRadii() {
        return this.b;
    }
}

