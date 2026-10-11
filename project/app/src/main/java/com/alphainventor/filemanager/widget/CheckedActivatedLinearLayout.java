/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class CheckedActivatedLinearLayout
extends LinearLayout {
    private static final int[] a = new int[]{0x10100A0};

    public CheckedActivatedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 1);
        for (n8 = 0; n8 < nArray.length; ++n8) {
            if (nArray[n8] != 16843518) continue;
            View.mergeDrawableStates((int[])nArray, (int[])a);
        }
        return nArray;
    }
}

