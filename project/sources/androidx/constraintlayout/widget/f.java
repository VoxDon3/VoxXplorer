package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class f extends ViewGroup {
    e a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public e getConstraintSet() {
        if (this.a == null) {
            this.a = new e();
        }
        this.a.g(this);
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;
        public float J0;
        public float x0;
        public boolean y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.x0 = 1.0f;
            this.y0 = false;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 1.0f;
            this.E0 = 1.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            this.J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.K4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.L4) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == ax.L.c.W4) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                    this.y0 = true;
                } else if (index == ax.L.c.T4) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == ax.L.c.U4) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == ax.L.c.S4) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == ax.L.c.Q4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == ax.L.c.R4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == ax.L.c.M4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == ax.L.c.N4) {
                    this.G0 = obtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == ax.L.c.O4) {
                    this.H0 = obtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == ax.L.c.P4) {
                    this.I0 = obtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == ax.L.c.V4) {
                    this.J0 = obtainStyledAttributes.getFloat(index, this.J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
