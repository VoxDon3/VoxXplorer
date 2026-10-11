/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.c;
import ax.k6.l;
import ax.k6.m;
import ax.l6.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public class ExtendedFloatingActionButton
extends MaterialButton
implements CoordinatorLayout.b {
    private static final int T = l.z;
    static final Property<View, Float> U = new Property<View, Float>(Float.class, "width"){

        public Float a(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        public void b(View view, Float f8) {
            view.getLayoutParams().width = f8.intValue();
            view.requestLayout();
        }
    };
    static final Property<View, Float> V = new Property<View, Float>(Float.class, "height"){

        public Float a(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        public void b(View view, Float f8) {
            view.getLayoutParams().height = f8.intValue();
            view.requestLayout();
        }
    };
    static final Property<View, Float> W = new Property<View, Float>(Float.class, "paddingStart"){

        public Float a(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        public void b(View view, Float f8) {
            view.setPaddingRelative(f8.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    };
    static final Property<View, Float> a0 = new Property<View, Float>(Float.class, "paddingEnd"){

        public Float a(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        public void b(View view, Float f8) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f8.intValue(), view.getPaddingBottom());
        }
    };
    private boolean K;
    private final int L;
    private int M;
    private int N;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> O;
    private boolean P;
    private boolean Q;
    private boolean R;
    protected ColorStateList S;

    private void u(int n8, e object) {
        if (n8 != 0 && n8 != 1 && n8 != 2 && n8 != 3) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unknown strategy type: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw null;
    }

    private void v() {
        this.S = this.getTextColors();
    }

    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.O;
    }

    int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int n8;
        int n9 = n8 = this.L;
        if (n8 < 0) {
            n9 = Math.min(this.getPaddingStart(), this.getPaddingEnd()) * 2 + this.getIconSize();
        }
        return n9;
    }

    public h getExtendMotionSpec() {
        throw null;
    }

    public h getHideMotionSpec() {
        throw null;
    }

    public h getShowMotionSpec() {
        throw null;
    }

    public h getShrinkMotionSpec() {
        throw null;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.P && TextUtils.isEmpty((CharSequence)this.getText()) && this.getIcon() != null) {
            this.P = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean bl) {
        this.R = bl;
    }

    public void setAnimationEnabled(boolean bl) {
        this.K = bl;
    }

    public void setExtendMotionSpec(h h8) {
        throw null;
    }

    public void setExtendMotionSpecResource(int n8) {
        this.setExtendMotionSpec(h.c(this.getContext(), n8));
    }

    public void setExtended(boolean bl) {
        if (this.P == bl) {
            return;
        }
        throw null;
    }

    public void setHideMotionSpec(h h8) {
        throw null;
    }

    public void setHideMotionSpecResource(int n8) {
        this.setHideMotionSpec(h.c(this.getContext(), n8));
    }

    public void setPadding(int n8, int n9, int n10, int n11) {
        super.setPadding(n8, n9, n10, n11);
        if (this.P && !this.Q) {
            this.M = this.getPaddingStart();
            this.N = this.getPaddingEnd();
        }
    }

    public void setPaddingRelative(int n8, int n9, int n10, int n11) {
        super.setPaddingRelative(n8, n9, n10, n11);
        if (this.P && !this.Q) {
            this.M = n8;
            this.N = n10;
        }
    }

    public void setShowMotionSpec(h h8) {
        throw null;
    }

    public void setShowMotionSpecResource(int n8) {
        this.setShowMotionSpec(h.c(this.getContext(), n8));
    }

    public void setShrinkMotionSpec(h h8) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int n8) {
        this.setShrinkMotionSpec(h.c(this.getContext(), n8));
    }

    public void setTextColor(int n8) {
        super.setTextColor(n8);
        this.v();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.v();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton>
    extends CoordinatorLayout.c<T> {
        private Rect a;
        private boolean b;
        private boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, m.K1);
            this.b = context.getBoolean(m.L1, false);
            this.c = context.getBoolean(m.M1, true);
            context.recycle();
        }

        private static boolean K(View view) {
            if ((view = view.getLayoutParams()) instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f)view).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton object) {
            object = (CoordinatorLayout.f)object.getLayoutParams();
            if (!this.b && !this.c) {
                return false;
            }
            return ((CoordinatorLayout.f)((Object)object)).e() == view.getId();
        }

        private boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.N((View)appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ax.F6.c.a(coordinatorLayout, (View)appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                this.O(extendedFloatingActionButton);
            } else {
                this.I(extendedFloatingActionButton);
            }
            return true;
        }

        private boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.N(view, extendedFloatingActionButton)) {
                return false;
            }
            CoordinatorLayout.f f8 = (CoordinatorLayout.f)extendedFloatingActionButton.getLayoutParams();
            if (view.getTop() < extendedFloatingActionButton.getHeight() / 2 + f8.topMargin) {
                this.O(extendedFloatingActionButton);
            } else {
                this.I(extendedFloatingActionButton);
            }
            return true;
        }

        protected void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int n8 = this.c ? 3 : 0;
            extendedFloatingActionButton.u(n8, null);
        }

        public boolean J(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean L(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                this.P(coordinatorLayout, (AppBarLayout)view, extendedFloatingActionButton);
            } else if (ExtendedFloatingActionButtonBehavior.K(view)) {
                this.Q(view, extendedFloatingActionButton);
            }
            return false;
        }

        public boolean M(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int n8) {
            View view;
            List<View> list = coordinatorLayout.r((View)extendedFloatingActionButton);
            int n9 = list.size();
            for (int i8 = 0; i8 < n9 && !((view = list.get(i8)) instanceof AppBarLayout ? this.P(coordinatorLayout, (AppBarLayout)view, extendedFloatingActionButton) : ExtendedFloatingActionButtonBehavior.K(view) && this.Q(view, extendedFloatingActionButton)); ++i8) {
            }
            coordinatorLayout.I((View)extendedFloatingActionButton, n8);
            return true;
        }

        protected void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int n8 = this.c ? 2 : 1;
            extendedFloatingActionButton.u(n8, null);
        }

        @Override
        public void k(CoordinatorLayout.f f8) {
            if (f8.h == 0) {
                f8.h = 80;
            }
        }
    }

    public static abstract class e {
    }
}

