/*
 * Decompiled with CFR 0.152.
 */
package ax.B6;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a
implements View.OnTouchListener {
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;

    public a(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get((Context)dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int n8;
        View view2 = view.findViewById(0x1020002);
        int n9 = this.b + view2.getLeft();
        int n10 = view2.getWidth();
        int n11 = this.c + view2.getTop();
        if (new RectF((float)n9, (float)n11, (float)(n10 + n9), (float)((n8 = view2.getHeight()) + n11)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        view2 = MotionEvent.obtain((MotionEvent)motionEvent);
        if (motionEvent.getAction() == 1) {
            view2.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            view2.setAction(0);
            n8 = this.d;
            view2.setLocation((float)(-n8 - 1), (float)(-n8 - 1));
        }
        view.performClick();
        return this.a.onTouchEvent((MotionEvent)view2);
    }
}

