/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.c;
import ax.H.e;

public class a
extends c {
    private int j;
    private int k;
    private ax.H.a l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(e e8, int n8, boolean bl) {
        this.k = n8;
        if (bl) {
            n8 = this.j;
            if (n8 == 5) {
                this.k = 1;
            } else if (n8 == 6) {
                this.k = 0;
            }
        } else {
            n8 = this.j;
            if (n8 == 5) {
                this.k = 0;
            } else if (n8 == 6) {
                this.k = 1;
            }
        }
        if (e8 instanceof ax.H.a) {
            ((ax.H.a)e8).A1(this.k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.l.u1();
    }

    public int getMargin() {
        return this.l.w1();
    }

    public int getType() {
        return this.j;
    }

    @Override
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.l = new ax.H.a();
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int n8 = attributeSet.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = attributeSet.getIndex(i8);
                if (n9 == ax.L.c.D1) {
                    this.setType(attributeSet.getInt(n9, 0));
                    continue;
                }
                if (n9 == ax.L.c.C1) {
                    this.l.z1(attributeSet.getBoolean(n9, true));
                    continue;
                }
                if (n9 != ax.L.c.E1) continue;
                n9 = attributeSet.getDimensionPixelSize(n9, 0);
                this.l.B1(n9);
            }
            attributeSet.recycle();
        }
        this.d = this.l;
        this.s();
    }

    @Override
    public void n(e e8, boolean bl) {
        this.t(e8, this.j, bl);
    }

    public void setAllowsGoneWidget(boolean bl) {
        this.l.z1(bl);
    }

    public void setDpMargin(int n8) {
        float f8 = this.getResources().getDisplayMetrics().density;
        n8 = (int)((float)n8 * f8 + 0.5f);
        this.l.B1(n8);
    }

    public void setMargin(int n8) {
        this.l.B1(n8);
    }

    public void setType(int n8) {
        this.j = n8;
    }
}

