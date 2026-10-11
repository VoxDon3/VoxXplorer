/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ax.H.e;
import ax.H.g;
import ax.H.l;
import ax.L.c;

public class Flow
extends ax.L.e {
    private g l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.l = new g();
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int n8 = attributeSet.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = attributeSet.getIndex(i8);
                if (n9 == ax.L.c.o1) {
                    this.l.D2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.p1) {
                    this.l.I1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.z1) {
                    this.l.N1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.A1) {
                    this.l.K1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.q1) {
                    this.l.L1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.r1) {
                    this.l.O1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.s1) {
                    this.l.M1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.t1) {
                    this.l.J1(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.Z1) {
                    this.l.I2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.P1) {
                    this.l.x2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.Y1) {
                    this.l.H2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.J1) {
                    this.l.r2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.R1) {
                    this.l.z2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.L1) {
                    this.l.t2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.T1) {
                    this.l.B2(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.N1) {
                    this.l.v2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.I1) {
                    this.l.q2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.Q1) {
                    this.l.y2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.K1) {
                    this.l.s2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.S1) {
                    this.l.A2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.W1) {
                    this.l.F2(attributeSet.getFloat(n9, 0.5f));
                    continue;
                }
                if (n9 == ax.L.c.M1) {
                    this.l.u2(attributeSet.getInt(n9, 2));
                    continue;
                }
                if (n9 == ax.L.c.V1) {
                    this.l.E2(attributeSet.getInt(n9, 2));
                    continue;
                }
                if (n9 == ax.L.c.O1) {
                    this.l.w2(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.X1) {
                    this.l.G2(attributeSet.getDimensionPixelSize(n9, 0));
                    continue;
                }
                if (n9 != ax.L.c.U1) continue;
                this.l.C2(attributeSet.getInt(n9, -1));
            }
            attributeSet.recycle();
        }
        this.d = this.l;
        this.s();
    }

    @Override
    public void n(e e8, boolean bl) {
        this.l.t1(bl);
    }

    @Override
    @SuppressLint(value={"WrongCall"})
    protected void onMeasure(int n8, int n9) {
        this.t(this.l, n8, n9);
    }

    public void setFirstHorizontalBias(float f8) {
        this.l.q2(f8);
        this.requestLayout();
    }

    public void setFirstHorizontalStyle(int n8) {
        this.l.r2(n8);
        this.requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.l.s2(f8);
        this.requestLayout();
    }

    public void setFirstVerticalStyle(int n8) {
        this.l.t2(n8);
        this.requestLayout();
    }

    public void setHorizontalAlign(int n8) {
        this.l.u2(n8);
        this.requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.l.v2(f8);
        this.requestLayout();
    }

    public void setHorizontalGap(int n8) {
        this.l.w2(n8);
        this.requestLayout();
    }

    public void setHorizontalStyle(int n8) {
        this.l.x2(n8);
        this.requestLayout();
    }

    public void setLastHorizontalBias(float f8) {
        this.l.y2(f8);
        this.requestLayout();
    }

    public void setLastHorizontalStyle(int n8) {
        this.l.z2(n8);
        this.requestLayout();
    }

    public void setLastVerticalBias(float f8) {
        this.l.A2(f8);
        this.requestLayout();
    }

    public void setLastVerticalStyle(int n8) {
        this.l.B2(n8);
        this.requestLayout();
    }

    public void setMaxElementsWrap(int n8) {
        this.l.C2(n8);
        this.requestLayout();
    }

    public void setOrientation(int n8) {
        this.l.D2(n8);
        this.requestLayout();
    }

    public void setPadding(int n8) {
        this.l.I1(n8);
        this.requestLayout();
    }

    public void setPaddingBottom(int n8) {
        this.l.J1(n8);
        this.requestLayout();
    }

    public void setPaddingLeft(int n8) {
        this.l.L1(n8);
        this.requestLayout();
    }

    public void setPaddingRight(int n8) {
        this.l.M1(n8);
        this.requestLayout();
    }

    public void setPaddingTop(int n8) {
        this.l.O1(n8);
        this.requestLayout();
    }

    public void setVerticalAlign(int n8) {
        this.l.E2(n8);
        this.requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.l.F2(f8);
        this.requestLayout();
    }

    public void setVerticalGap(int n8) {
        this.l.G2(n8);
        this.requestLayout();
    }

    public void setVerticalStyle(int n8) {
        this.l.H2(n8);
        this.requestLayout();
    }

    public void setWrapMode(int n8) {
        this.l.I2(n8);
        this.requestLayout();
    }

    @Override
    public void t(l l8, int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n8);
        n8 = View.MeasureSpec.getSize((int)n8);
        int n11 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (l8 != null) {
            l8.C1(n10, n8, n11, n9);
            this.setMeasuredDimension(l8.x1(), l8.w1());
            return;
        }
        this.setMeasuredDimension(0, 0);
    }
}

