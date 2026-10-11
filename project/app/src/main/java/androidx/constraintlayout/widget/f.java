/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import ax.L.c;

public class f
extends ViewGroup {
    e a;

    protected a a() {
        return new a(-2, -2);
    }

    public a b(AttributeSet attributeSet) {
        return new a(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e getConstraintSet() {
        if (this.a == null) {
            this.a = new e();
        }
        this.a.g(this);
        return this.a;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
    }

    public static class a
    extends ConstraintLayout.b {
        public float A0 = 0.0f;
        public float B0 = 0.0f;
        public float C0 = 0.0f;
        public float D0 = 1.0f;
        public float E0 = 1.0f;
        public float F0 = 0.0f;
        public float G0 = 0.0f;
        public float H0 = 0.0f;
        public float I0 = 0.0f;
        public float J0 = 0.0f;
        public float x0 = 1.0f;
        public boolean y0 = false;
        public float z0 = 0.0f;

        public a(int n8, int n9) {
            super(n8, n9);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, c.K4);
            int n8 = context.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                if (n9 == c.L4) {
                    this.x0 = context.getFloat(n9, this.x0);
                    continue;
                }
                if (n9 == c.W4) {
                    this.z0 = context.getFloat(n9, this.z0);
                    this.y0 = true;
                    continue;
                }
                if (n9 == c.T4) {
                    this.B0 = context.getFloat(n9, this.B0);
                    continue;
                }
                if (n9 == c.U4) {
                    this.C0 = context.getFloat(n9, this.C0);
                    continue;
                }
                if (n9 == c.S4) {
                    this.A0 = context.getFloat(n9, this.A0);
                    continue;
                }
                if (n9 == c.Q4) {
                    this.D0 = context.getFloat(n9, this.D0);
                    continue;
                }
                if (n9 == c.R4) {
                    this.E0 = context.getFloat(n9, this.E0);
                    continue;
                }
                if (n9 == c.M4) {
                    this.F0 = context.getFloat(n9, this.F0);
                    continue;
                }
                if (n9 == c.N4) {
                    this.G0 = context.getFloat(n9, this.G0);
                    continue;
                }
                if (n9 == c.O4) {
                    this.H0 = context.getFloat(n9, this.H0);
                    continue;
                }
                if (n9 == c.P4) {
                    this.I0 = context.getFloat(n9, this.I0);
                    continue;
                }
                if (n9 != c.V4) continue;
                this.J0 = context.getFloat(n9, this.J0);
            }
            context.recycle();
        }
    }
}

