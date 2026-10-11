package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends c {
    private int j;
    private int k;
    private ax.H.a l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(ax.H.e eVar, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (eVar instanceof ax.H.a) {
            ((ax.H.a) eVar).A1(this.k);
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

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.l = new ax.H.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.D1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == ax.L.c.C1) {
                    this.l.z1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == ax.L.c.E1) {
                    this.l.B1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.l;
        s();
    }

    @Override // androidx.constraintlayout.widget.c
    public void n(ax.H.e eVar, boolean z) {
        t(eVar, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.z1(z);
    }

    public void setDpMargin(int i) {
        this.l.B1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.B1(i);
    }

    public void setType(int i) {
        this.j = i;
    }
}
