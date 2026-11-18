/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import ax.x3.r;

public class FileListView
extends ListView
implements r {
    private boolean a;

    public FileListView(Context context, AttributeSet attributeSet) {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        if (this.a) {
            int n8 = motionEvent.getAction();
            if (n8 != 0) {
                if (n8 == 1) {
                    this.a = false;
                    return true;
                }
                if (n8 == 2) {
                    return true;
                }
            } else {
                this.a = false;
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
    }
}

