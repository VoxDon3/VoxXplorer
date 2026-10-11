package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import ax.H.g;
import ax.H.l;
import ax.L.c;
import ax.L.e;

/* loaded from: classes.dex */
public class Flow extends e {
    private g l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ax.L.e, androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.l = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c.o1) {
                    this.l.D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.p1) {
                    this.l.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.z1) {
                    this.l.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.A1) {
                    this.l.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.q1) {
                    this.l.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.r1) {
                    this.l.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.s1) {
                    this.l.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.t1) {
                    this.l.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.Z1) {
                    this.l.I2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.P1) {
                    this.l.x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.Y1) {
                    this.l.H2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.J1) {
                    this.l.r2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.R1) {
                    this.l.z2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.L1) {
                    this.l.t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.T1) {
                    this.l.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c.N1) {
                    this.l.v2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.I1) {
                    this.l.q2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.Q1) {
                    this.l.y2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.K1) {
                    this.l.s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.S1) {
                    this.l.A2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.W1) {
                    this.l.F2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c.M1) {
                    this.l.u2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == c.V1) {
                    this.l.E2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == c.O1) {
                    this.l.w2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.X1) {
                    this.l.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c.U1) {
                    this.l.C2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        s();
    }

    @Override // androidx.constraintlayout.widget.c
    public void n(ax.H.e eVar, boolean z) {
        this.l.t1(z);
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i, int i2) {
        t(this.l, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.q2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.r2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.s2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.t2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.u2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.v2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.w2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.x2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.y2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.z2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.A2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.C2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.D2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.I1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.J1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.L1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.M1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.O1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.E2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.F2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.G2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.H2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.I2(i);
        requestLayout();
    }

    @Override // ax.L.e
    public void t(l lVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.C1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.x1(), lVar.w1());
        }
    }
}
