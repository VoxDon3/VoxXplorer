/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import ax.x3.r;

public class FileGridView
extends GridView
implements r {
    private boolean a;

    public FileGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public void a() {
        this.a = true;
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int n8, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfoForItem(view, n8, accessibilityNodeInfo);
        if (accessibilityNodeInfo.isSelected()) {
            accessibilityNodeInfo.setSelected(false);
        }
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_SELECTION);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SELECT);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        if (!this.a) return super.onTouchEvent(motionEvent);
        int n8 = motionEvent.getAction();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) return super.onTouchEvent(motionEvent);
                return true;
            }
            this.a = false;
            return true;
        }
        this.a = false;
        return super.onTouchEvent(motionEvent);
    }
}

