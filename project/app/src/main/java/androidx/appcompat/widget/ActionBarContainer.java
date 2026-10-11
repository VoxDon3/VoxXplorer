/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.b;
import ax.m.f;
import ax.m.j;

public class ActionBarContainer
extends FrameLayout {
    private boolean a;
    private View b;
    private View c;
    private View d;
    Drawable e;
    Drawable f;
    Drawable g;
    boolean h;
    boolean i;
    private int j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setBackground(new b(this));
        context = context.obtainStyledAttributes(attributeSet, ax.m.j.a);
        this.e = context.getDrawable(ax.m.j.b);
        this.f = context.getDrawable(ax.m.j.d);
        this.j = context.getDimensionPixelSize(ax.m.j.j, -1);
        int n8 = this.getId();
        int n9 = ax.m.f.z;
        boolean bl = true;
        if (n8 == n9) {
            this.h = true;
            this.g = context.getDrawable(ax.m.j.c);
        }
        context.recycle();
        if (!(this.h ? this.g == null : this.e == null && this.f == null)) {
            bl = false;
        }
        this.setWillNotDraw(bl);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
        {
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(this.getDrawableState());
        }
        if ((drawable = this.f) != null && drawable.isStateful()) {
            this.f.setState(this.getDrawableState());
        }
        if ((drawable = this.g) != null && drawable.isStateful()) {
            this.g.setState(this.getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.f) != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.g) != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = this.findViewById(ax.m.f.a);
        this.d = this.findViewById(ax.m.f.f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
        {
        }
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        FrameLayout.LayoutParams layoutParams;
        super.onLayout(bl, n8, n9, n10, n11);
        View view = this.b;
        n9 = 1;
        n11 = 0;
        bl = view != null && view.getVisibility() != 8;
        if (view != null && view.getVisibility() != 8) {
            int n12 = this.getMeasuredHeight();
            layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n13 = view.getMeasuredHeight();
            int n14 = layoutParams.bottomMargin;
            view.layout(n8, n12 - n13 - n14, n10, n12 - n14);
        }
        if (this.h) {
            view = this.g;
            if (view != null) {
                view.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                n8 = n9;
            } else {
                n8 = 0;
            }
        } else {
            n8 = n11;
            if (this.e != null) {
                if (this.c.getVisibility() == 0) {
                    this.e.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                } else {
                    layoutParams = this.d;
                    if (layoutParams != null && layoutParams.getVisibility() == 0) {
                        this.e.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
                    } else {
                        this.e.setBounds(0, 0, 0, 0);
                    }
                }
                n8 = 1;
            }
            this.i = bl;
            if (bl && (layoutParams = this.f) != null) {
                layoutParams.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                n8 = n9;
            }
        }
        if (n8 != 0) {
            this.invalidate();
        }
    }

    public void onMeasure(int n8, int n9) {
        int n10 = n9;
        if (this.c == null) {
            n10 = n9;
            if (View.MeasureSpec.getMode((int)n9) == Integer.MIN_VALUE) {
                int n11 = this.j;
                n10 = n9;
                if (n11 >= 0) {
                    n10 = View.MeasureSpec.makeMeasureSpec((int)Math.min(n11, View.MeasureSpec.getSize((int)n9)), (int)Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n8, n10);
        if (this.c != null) {
            n9 = View.MeasureSpec.getMode((int)n10);
            View view = this.b;
            if (view != null && view.getVisibility() != 8 && n9 != 0x40000000) {
                n8 = !this.b(this.c) ? this.a(this.c) : (!this.b(this.d) ? this.a(this.d) : 0);
                n9 = n9 == Integer.MIN_VALUE ? View.MeasureSpec.getSize((int)n10) : Integer.MAX_VALUE;
                this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(n8 + this.a(this.b), n9));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPrimaryBackground(Drawable drawable) {
        boolean bl;
        block7: {
            block8: {
                boolean bl2;
                block6: {
                    Drawable drawable2 = this.e;
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                        this.unscheduleDrawable(this.e);
                    }
                    this.e = drawable;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback)this);
                        drawable = this.c;
                        if (drawable != null) {
                            this.e.setBounds(drawable.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                        }
                    }
                    bl = this.h;
                    bl2 = false;
                    if (!bl) break block6;
                    bl = bl2;
                    if (this.g != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.e != null) break block7;
                bl = bl2;
                if (this.f != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        androidx.appcompat.widget.ActionBarContainer$a.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSplitBackground(Drawable drawable) {
        boolean bl;
        block7: {
            block8: {
                boolean bl2;
                block6: {
                    Drawable drawable2 = this.g;
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                        this.unscheduleDrawable(this.g);
                    }
                    this.g = drawable;
                    bl2 = false;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback)this);
                        if (this.h && (drawable = this.g) != null) {
                            drawable.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                        }
                    }
                    if (!this.h) break block6;
                    bl = bl2;
                    if (this.g != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.e != null) break block7;
                bl = bl2;
                if (this.f != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        androidx.appcompat.widget.ActionBarContainer$a.a(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setStackedBackground(Drawable drawable) {
        boolean bl;
        block7: {
            block8: {
                boolean bl2;
                block6: {
                    Drawable drawable2 = this.f;
                    if (drawable2 != null) {
                        drawable2.setCallback(null);
                        this.unscheduleDrawable(this.f);
                    }
                    this.f = drawable;
                    if (drawable != null) {
                        drawable.setCallback((Drawable.Callback)this);
                        if (this.i && (drawable = this.f) != null) {
                            drawable.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
                        }
                    }
                    bl = this.h;
                    bl2 = false;
                    if (!bl) break block6;
                    bl = bl2;
                    if (this.g != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.e != null) break block7;
                bl = bl2;
                if (this.f != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        androidx.appcompat.widget.ActionBarContainer$a.a(this);
    }

    public void setTabContainer(F f8) {
        View view = this.b;
        if (view != null) {
            this.removeView(view);
        }
        this.b = f8;
        if (f8 != null) {
            this.addView((View)f8);
            view = f8.getLayoutParams();
            view.width = -1;
            view.height = -2;
            f8.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean bl) {
        this.a = bl;
        int n8 = bl ? 393216 : 262144;
        this.setDescendantFocusability(n8);
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        boolean bl = n8 == 0;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(bl, false);
        }
        if ((drawable = this.f) != null) {
            drawable.setVisible(bl, false);
        }
        if ((drawable = this.g) != null) {
            drawable.setVisible(bl, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int n8) {
        if (n8 != 0) {
            return super.startActionModeForChild(view, callback, n8);
        }
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e && !this.h || drawable == this.f && this.i || drawable == this.g && this.h || super.verifyDrawable(drawable);
    }

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }
}

