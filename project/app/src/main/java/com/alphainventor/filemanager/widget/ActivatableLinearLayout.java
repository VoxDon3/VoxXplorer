/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivatableLinearLayout
extends LinearLayout {
    public ActivatableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setActivated(boolean bl) {
        super.setActivated(bl);
    }

    public void setOnActivatedListener(a a8) {
    }

    public static interface a {
    }
}

