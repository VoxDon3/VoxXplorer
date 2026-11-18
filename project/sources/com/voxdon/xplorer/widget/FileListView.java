package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import ax.x3.r;

/* loaded from: classes.dex */
public class FileListView extends ListView implements r {
    private boolean a;

    public FileListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ax.x3.r
    public void a() {
        this.a = true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
        if (accessibilityNodeInfo.isSelected()) {
            accessibilityNodeInfo.setSelected(false);
        }
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_SELECTION);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SELECT);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        if (this.a) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.a = false;
            } else {
                if (action == 1) {
                    this.a = false;
                    return true;
                }
                if (action == 2) {
                    return true;
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
