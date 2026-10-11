/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.B;
import ax.S.h;
import ax.U.a;
import ax.c0.d0;
import ax.d0.H;
import ax.h0.j;
import ax.k6.e;
import ax.k6.f;
import ax.k6.i;
import ax.u.B;

public class NavigationMenuItemView
extends ax.F6.h
implements k.a {
    private static final int[] G = new int[]{0x10100A0};
    private FrameLayout A;
    private g B;
    private ColorStateList C;
    private boolean D;
    private Drawable E;
    private final ax.c0.a F;
    private int v;
    private boolean w;
    boolean x;
    boolean y = true;
    private final CheckedTextView z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet object, int n8) {
        super(context, (AttributeSet)object, n8);
        object = new ax.c0.a(this){
            final NavigationMenuItemView d;
            {
                this.d = navigationMenuItemView;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.k0(this.d.x);
            }
        };
        this.F = object;
        this.setOrientation(0);
        LayoutInflater.from((Context)context).inflate(i.f, (ViewGroup)this, true);
        this.setIconSize(context.getResources().getDimensionPixelSize(e.d));
        context = (CheckedTextView)this.findViewById(ax.k6.g.h);
        this.z = context;
        d0.l0((View)context, (ax.c0.a)object);
    }

    private void B() {
        if (this.D()) {
            this.z.setVisibility(8);
            Object object = this.A;
            if (object != null) {
                object = (B.a)object.getLayoutParams();
                object.width = -1;
                this.A.setLayoutParams((ViewGroup.LayoutParams)object);
                return;
            }
        } else {
            this.z.setVisibility(0);
            Object object = this.A;
            if (object != null) {
                object = (B.a)object.getLayoutParams();
                object.width = -2;
                this.A.setLayoutParams((ViewGroup.LayoutParams)object);
            }
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (this.getContext().getTheme().resolveAttribute(ax.m.a.w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(G, (Drawable)new ColorDrawable(typedValue.data));
            typedValue = new ColorDrawable(0);
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, (Drawable)typedValue);
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout)((ViewStub)this.findViewById(ax.k6.g.g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup)view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void e(g g8, int n8) {
        this.B = g8;
        if (g8.getItemId() > 0) {
            this.setId(g8.getItemId());
        }
        n8 = g8.isVisible() ? 0 : 8;
        this.setVisibility(n8);
        if (this.getBackground() == null) {
            this.setBackground((Drawable)this.C());
        }
        this.setCheckable(g8.isCheckable());
        this.setChecked(g8.isChecked());
        this.setEnabled(g8.isEnabled());
        this.setTitle(g8.getTitle());
        this.setIcon(g8.getIcon());
        this.setActionView(g8.getActionView());
        this.setContentDescription(g8.getContentDescription());
        ax.u.B.a((View)this, g8.getTooltipText());
        this.B();
    }

    @Override
    public g getItemData() {
        return this.B;
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 1);
        g g8 = this.B;
        if (g8 != null && g8.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates((int[])nArray, (int[])G);
        }
        return nArray;
    }

    public void setCheckable(boolean bl) {
        this.refreshDrawableState();
        if (this.x != bl) {
            this.x = bl;
            this.F.l((View)this.z, 2048);
        }
    }

    public void setChecked(boolean bl) {
        this.refreshDrawableState();
        this.z.setChecked(bl);
        CheckedTextView checkedTextView = this.z;
        Typeface typeface = checkedTextView.getTypeface();
        int n8 = bl && this.y ? 1 : 0;
        checkedTextView.setTypeface(typeface, n8);
    }

    public void setHorizontalPadding(int n8) {
        this.setPadding(n8, this.getPaddingTop(), n8, this.getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = drawable;
            if (this.D) {
                drawable2 = drawable.getConstantState();
                if (drawable2 != null) {
                    drawable = drawable2.newDrawable();
                }
                drawable2 = a.r(drawable).mutate();
                drawable2.setTintList(this.C);
            }
            int n8 = this.v;
            drawable2.setBounds(0, 0, n8, n8);
            drawable = drawable2;
        } else if (this.w) {
            if (this.E == null) {
                this.E = drawable = h.e(this.getResources(), f.l, this.getContext().getTheme());
                if (drawable != null) {
                    int n9 = this.v;
                    drawable.setBounds(0, 0, n9, n9);
                }
            }
            drawable = this.E;
        }
        this.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int n8) {
        this.z.setCompoundDrawablePadding(n8);
    }

    public void setIconSize(int n8) {
        this.v = n8;
    }

    void setIconTintList(ColorStateList object) {
        this.C = object;
        boolean bl = object != null;
        this.D = bl;
        object = this.B;
        if (object != null) {
            this.setIcon(((g)object).getIcon());
        }
    }

    public void setMaxLines(int n8) {
        this.z.setMaxLines(n8);
    }

    public void setNeedsEmptyIcon(boolean bl) {
        this.w = bl;
    }

    public void setTextAppearance(int n8) {
        j.m((TextView)this.z, n8);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}

