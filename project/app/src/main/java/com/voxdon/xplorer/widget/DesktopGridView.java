/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;

public class DesktopGridView
extends GridView {
    public DesktopGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int n8, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfoForItem(view, n8, accessibilityNodeInfo);
        if (accessibilityNodeInfo.isSelected()) {
            accessibilityNodeInfo.setSelected(false);
        }
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_SELECTION);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SELECT);
    }
}

