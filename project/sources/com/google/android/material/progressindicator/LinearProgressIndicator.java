package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import ax.k6.C2402c;
import j$.util.Objects;

/* loaded from: classes3.dex */
public class LinearProgressIndicator extends a<o> {
    public static final int q = ax.k6.l.A;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.q);
    }

    private void t() {
        l lVar = new l((o) this.a);
        setIndeterminateDrawable(k.w(getContext(), (o) this.a, lVar));
        setProgressDrawable(g.B(getContext(), (o) this.a, lVar));
    }

    public int getIndeterminateAnimationType() {
        return ((o) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((o) this.a).p;
    }

    public int getTrackInnerCornerRadius() {
        return ((o) this.a).t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((o) this.a).s;
    }

    public int getTrackStopIndicatorSize() {
        return ((o) this.a).r;
    }

    @Override // com.google.android.material.progressindicator.a, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.a;
        o oVar = (o) s;
        boolean z2 = true;
        if (((o) s).p != 1 && ((getLayoutDirection() != 1 || ((o) this.a).p != 2) && (getLayoutDirection() != 0 || ((o) this.a).p != 3))) {
            z2 = false;
        }
        oVar.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        k<o> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        g<o> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void p(int i, boolean z) {
        S s = this.a;
        if (s != 0 && ((o) s).o == 0 && isIndeterminate()) {
            return;
        }
        super.p(i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public o i(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((o) this.a).o == i) {
            return;
        }
        if (r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.a;
        ((o) s).o = i;
        ((o) s).h();
        if (i == 0) {
            getIndeterminateDrawable().A(new m((o) this.a));
        } else {
            getIndeterminateDrawable().A(new n(getContext(), (o) this.a));
        }
        o();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((o) this.a).h();
    }

    public void setIndicatorDirection(int i) {
        S s = this.a;
        ((o) s).p = i;
        o oVar = (o) s;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((o) this.a).p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        oVar.q = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((o) this.a).h();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        S s = this.a;
        if (((o) s).t != i) {
            ((o) s).t = Math.round(Math.min(i, ((o) s).a / 2.0f));
            S s2 = this.a;
            ((o) s2).v = false;
            ((o) s2).w = true;
            ((o) s2).h();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        S s = this.a;
        if (((o) s).u != f) {
            ((o) s).u = Math.min(f, 0.5f);
            S s2 = this.a;
            ((o) s2).v = true;
            ((o) s2).w = true;
            ((o) s2).h();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        if (Objects.equals(((o) this.a).s, num)) {
            return;
        }
        ((o) this.a).s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        S s = this.a;
        if (((o) s).r != i) {
            ((o) s).r = Math.min(i, ((o) s).a);
            ((o) this.a).h();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, q);
        t();
        this.k = true;
    }
}
