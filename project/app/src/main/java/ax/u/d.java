/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.H;
import ax.m.a;
import ax.u.e;

public class d
extends SeekBar {
    private final e a;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.L);
    }

    public d(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new e(this);
        this.a = object;
        ((e)object).c(attributeSet, n8);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.a.g(canvas);
            return;
        }
    }
}

