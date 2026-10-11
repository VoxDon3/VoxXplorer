/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import ax.F6.g;
import ax.d0.H;
import ax.k6.l;
import com.google.android.material.chip.Chip;
import java.util.List;

public class b
extends g {
    private static final int i = l.u;
    private int e;
    private int f;
    private d g;
    private final int h;

    private boolean e(int n8) {
        return this.getChildAt(n8).getVisibility() == 0;
    }

    private int getVisibleChipCount() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n9 = n8;
            if (this.getChildAt(i8) instanceof Chip) {
                n9 = n8;
                if (this.e(i8)) {
                    n9 = n8 + 1;
                }
            }
            n8 = n9;
        }
        return n8;
    }

    @Override
    public boolean c() {
        return super.c();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && layoutParams instanceof b;
    }

    int d(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            View view2 = this.getChildAt(i8);
            int n9 = n8;
            if (view2 instanceof Chip) {
                n9 = n8;
                if (this.e(i8)) {
                    if ((Chip)view2 == view) {
                        return n8;
                    }
                    n9 = n8 + 1;
                }
            }
            n8 = n9;
        }
        return -1;
    }

    public boolean f() {
        throw null;
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.h == -1) {
            return;
        }
        throw null;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo object) {
        super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)object);
        object = H.Q0((AccessibilityNodeInfo)object);
        int n8 = this.c() ? this.getVisibleChipCount() : -1;
        int n9 = this.getRowCount();
        int n10 = this.f() ? 1 : 2;
        ((H)object).o0(H.e.a(n9, n8, false, n10));
    }

    public void setChipSpacing(int n8) {
        this.setChipSpacingHorizontal(n8);
        this.setChipSpacingVertical(n8);
    }

    public void setChipSpacingHorizontal(int n8) {
        if (this.e != n8) {
            this.e = n8;
            this.setItemSpacing(n8);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int n8) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(n8));
    }

    public void setChipSpacingResource(int n8) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(n8));
    }

    public void setChipSpacingVertical(int n8) {
        if (this.f != n8) {
            this.f = n8;
            this.setLineSpacing(n8);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int n8) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(n8));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int n8) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c c8) {
        if (c8 == null) {
            this.setOnCheckedStateChangeListener(null);
            return;
        }
        this.setOnCheckedStateChangeListener(new d(){
            final b a;
            {
                this.a = var1_1;
            }
        });
    }

    public void setOnCheckedStateChangeListener(d d8) {
        this.g = d8;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        com.google.android.material.chip.b$e.a(null, onHierarchyChangeListener);
    }

    public void setSelectionRequired(boolean bl) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int n8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int n8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int n8) {
        this.setSingleLine(this.getResources().getBoolean(n8));
    }

    @Override
    public void setSingleLine(boolean bl) {
        super.setSingleLine(bl);
    }

    public void setSingleSelection(int n8) {
        this.setSingleSelection(this.getResources().getBoolean(n8));
    }

    public void setSingleSelection(boolean bl) {
        throw null;
    }

    public static class b
    extends ViewGroup.MarginLayoutParams {
        public b(int n8, int n9) {
            super(n8, n9);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    public static interface c {
    }

    public static interface d {
    }

    private class e
    implements ViewGroup.OnHierarchyChangeListener {
        static /* synthetic */ ViewGroup.OnHierarchyChangeListener a(e e8, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            throw null;
        }
    }
}

