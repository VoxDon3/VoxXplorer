package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import ax.k6.C2402c;

/* loaded from: classes3.dex */
public class CircularProgressIndicator extends a<f> {
    public static final int q = ax.k6.l.w;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.e);
    }

    private void t() {
        c cVar = new c((f) this.a);
        setIndeterminateDrawable(k.v(getContext(), (f) this.a, cVar));
        setProgressDrawable(g.A(getContext(), (f) this.a, cVar));
    }

    public int getIndeterminateAnimationType() {
        return ((f) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((f) this.a).r;
    }

    public int getIndicatorInset() {
        return ((f) this.a).q;
    }

    public int getIndicatorSize() {
        return ((f) this.a).p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f i(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((f) this.a).o == i) {
            return;
        }
        if (r() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.a;
        ((f) s).o = i;
        ((f) s).h();
        getIndeterminateDrawable().A(i == 1 ? new e(getContext(), (f) this.a) : new d((f) this.a));
        o();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((f) this.a).r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.a;
        if (((f) s).q != i) {
            ((f) s).q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.a;
        if (((f) s).p != max) {
            ((f) s).p = max;
            ((f) s).h();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((f) this.a).h();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, q);
        t();
        this.k = true;
    }
}
