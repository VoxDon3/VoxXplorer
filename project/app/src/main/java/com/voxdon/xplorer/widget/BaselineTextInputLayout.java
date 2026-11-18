/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputLayout;

public class BaselineTextInputLayout
extends TextInputLayout {
    public BaselineTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public int getBaseline() {
        return this.getPaddingTop() + this.getEditText().getBaseline();
    }
}

