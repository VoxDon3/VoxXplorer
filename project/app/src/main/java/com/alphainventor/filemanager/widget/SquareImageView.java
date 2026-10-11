/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView
extends AppCompatImageView {
    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredWidth());
    }
}

