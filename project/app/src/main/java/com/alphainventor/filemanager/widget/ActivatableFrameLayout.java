/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ActivatableFrameLayout
extends FrameLayout {
    private a a;

    public ActivatableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setActivated(boolean bl) {
        super.setActivated(bl);
        a a8 = this.a;
        if (a8 != null) {
            a8.a(bl);
        }
    }

    public void setOnActivatedListener(a a8) {
        this.a = a8;
    }

    public static interface a {
        public void a(boolean var1);
    }
}

