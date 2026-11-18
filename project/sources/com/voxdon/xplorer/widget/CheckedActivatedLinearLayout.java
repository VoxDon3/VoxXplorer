package com.voxdon.xplorer.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class CheckedActivatedLinearLayout extends LinearLayout {
    private static final int[] a = {R.attr.state_checked};

    public CheckedActivatedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        for (int i2 : onCreateDrawableState) {
            if (i2 == 16843518) {
                View.mergeDrawableStates(onCreateDrawableState, a);
            }
        }
        return onCreateDrawableState;
    }
}
