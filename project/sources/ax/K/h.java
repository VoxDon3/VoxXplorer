package ax.K;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.K.j;

/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.c implements j.d {
    private boolean j;
    private boolean k;
    private float l;
    protected View[] m;

    public float getProgress() {
        return this.l;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ax.L.c.a7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.c7) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == ax.L.c.b7) {
                    this.k = obtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.b > 0) {
            this.m = l((ConstraintLayout) getParent());
            while (i < this.b) {
                x(this.m[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof h)) {
                x(childAt, f);
            }
            i++;
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

    @Override // ax.K.j.d
    public void c(j jVar, int i) {
    }

    public void x(View view, float f) {
    }

    @Override // ax.K.j.d
    public void a(j jVar, int i, int i2) {
    }

    @Override // ax.K.j.d
    public void b(j jVar, int i, int i2, float f) {
    }
}
