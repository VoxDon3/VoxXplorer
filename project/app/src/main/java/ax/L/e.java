/*
 * Decompiled with CFR 0.152.
 */
package ax.L;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.H.l;
import ax.L.c;

public abstract class e
extends androidx.constraintlayout.widget.c {
    private boolean j;
    private boolean k;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void i(ConstraintLayout constraintLayout) {
        this.h(constraintLayout);
    }

    @Override
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int n8 = attributeSet.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = attributeSet.getIndex(i8);
                if (n9 == ax.L.c.u1) {
                    this.j = true;
                    continue;
                }
                if (n9 != ax.L.c.B1) continue;
                this.k = true;
            }
            attributeSet.recycle();
        }
    }

    @Override
    public void onAttachedToWindow() {
        Object object;
        super.onAttachedToWindow();
        if ((this.j || this.k) && (object = this.getParent()) instanceof ConstraintLayout) {
            object = (ConstraintLayout)((Object)object);
            int n8 = this.getVisibility();
            float f8 = this.getElevation();
            for (int i8 = 0; i8 < this.b; ++i8) {
                View view = ((ConstraintLayout)((Object)object)).m(this.a[i8]);
                if (view == null) continue;
                if (this.j) {
                    view.setVisibility(n8);
                }
                if (!this.k || !(f8 > 0.0f)) continue;
                view.setTranslationZ(view.getTranslationZ() + f8);
            }
        }
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        this.g();
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        this.g();
    }

    public void t(l l8, int n8, int n9) {
    }
}

