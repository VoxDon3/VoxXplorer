/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import ax.K.j;

public class h
extends c
implements j.d {
    private boolean j;
    private boolean k;
    private float l;
    protected View[] m;

    @Override
    public void a(j j8, int n8, int n9) {
    }

    @Override
    public void b(j j8, int n8, int n9, float f8) {
    }

    @Override
    public void c(j j8, int n8) {
    }

    public float getProgress() {
        return this.l;
    }

    @Override
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.a7);
            int n8 = attributeSet.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = attributeSet.getIndex(i8);
                if (n9 == ax.L.c.c7) {
                    this.j = attributeSet.getBoolean(n9, this.j);
                    continue;
                }
                if (n9 != ax.L.c.b7) continue;
                this.k = attributeSet.getBoolean(n9, this.k);
            }
            attributeSet.recycle();
        }
    }

    public void setProgress(float f8) {
        int n8;
        this.l = f8;
        int n9 = this.b;
        int n10 = 0;
        if (n9 > 0) {
            this.m = this.l((ConstraintLayout)this.getParent());
            for (n8 = n10; n8 < this.b; ++n8) {
                this.x(this.m[n8], f8);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup)this.getParent();
            n10 = viewGroup.getChildCount();
            for (n8 = 0; n8 < n10; ++n8) {
                View view = viewGroup.getChildAt(n8);
                if (view instanceof h) continue;
                this.x(view, f8);
            }
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.k;
    }

    public boolean v() {
        return this.j;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f8) {
    }
}

