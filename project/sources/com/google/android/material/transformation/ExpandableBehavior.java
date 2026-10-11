package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View a;
        final /* synthetic */ int b;
        final /* synthetic */ ax.E6.a c;

        a(View view, int i, ax.E6.a aVar) {
            this.a = view;
            this.b = i;
            this.c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ax.E6.a aVar = this.c;
                expandableBehavior.L((View) aVar, this.a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    private boolean J(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ax.E6.a K(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (i(coordinatorLayout, view, view2)) {
                return (ax.E6.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean L(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ax.E6.a aVar = (ax.E6.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i) {
        ax.E6.a K;
        if (view.isLaidOut() || (K = K(coordinatorLayout, view)) == null || !J(K.a())) {
            return false;
        }
        int i2 = K.a() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
