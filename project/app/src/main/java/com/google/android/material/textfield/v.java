/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import ax.F6.i;
import ax.F6.w;
import ax.K6.c;
import ax.O6.h;
import ax.k6.e;
import ax.k6.m;
import ax.u.t;
import ax.z6.a;
import com.google.android.material.textfield.TextInputLayout;

public class v
extends d {
    private final t e;
    private final AccessibilityManager f;
    private final Rect g = new Rect();
    private final int h;
    private final float i;
    private ColorStateList j;
    private int k;
    private ColorStateList l;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.p);
    }

    public v(Context context, AttributeSet object, int n8) {
        super(ax.V6.a.d(context, (AttributeSet)object, n8, 0), (AttributeSet)object, n8);
        Context context2 = this.getContext();
        context = w.i(context2, (AttributeSet)object, m.l2, n8, ax.m.i.f, new int[0]);
        n8 = m.m2;
        if (context.hasValue(n8) && context.getInt(n8, 0) == 0) {
            this.setKeyListener(null);
        }
        this.h = context.getResourceId(m.p2, ax.k6.i.o);
        this.i = context.getDimensionPixelOffset(m.n2, ax.k6.e.m0);
        n8 = m.o2;
        if (context.hasValue(n8)) {
            this.j = ColorStateList.valueOf((int)context.getColor(n8, 0));
        }
        this.k = context.getColor(m.q2, 0);
        this.l = c.a(context2, (TypedArray)context, m.r2);
        this.f = (AccessibilityManager)context2.getSystemService("accessibility");
        object = new t(context2);
        this.e = object;
        ((t)object).J(true);
        ((t)object).D((View)this);
        ((t)object).I(2);
        ((t)object).p(this.getAdapter());
        ((t)object).L(new AdapterView.OnItemClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                block2: {
                    int n9;
                    block4: {
                        block3: {
                            object = this.a;
                            object = n8 < 0 ? ((v)object).e.v() : object.getAdapter().getItem(n8);
                            v v8 = this.a;
                            v8.setText(v8.convertSelectionToString(object), false);
                            object = this.a.getOnItemClickListener();
                            if (object == null) break block2;
                            if (view == null) break block3;
                            n9 = n8;
                            if (n8 >= 0) break block4;
                        }
                        view = this.a.e.y();
                        n9 = this.a.e.x();
                        l8 = this.a.e.w();
                    }
                    object.onItemClick((AdapterView)this.a.e.j(), view, n9, l8);
                }
                this.a.e.dismiss();
            }
        });
        n8 = m.s2;
        if (context.hasValue(n8)) {
            this.setSimpleItems(context.getResourceId(n8, 0));
        }
        context.recycle();
    }

    private TextInputLayout f() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (!(viewParent instanceof TextInputLayout)) continue;
            return (TextInputLayout)viewParent;
        }
        return null;
    }

    private boolean g() {
        return this.i() || this.h();
        {
        }
    }

    private boolean h() {
        Object object = this.f;
        if (object != null && object.isEnabled() && (object = this.f.getEnabledAccessibilityServiceList(16)) != null) {
            object = object.iterator();
            while (object.hasNext()) {
                AccessibilityServiceInfo accessibilityServiceInfo = (AccessibilityServiceInfo)object.next();
                if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) continue;
                return true;
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter listAdapter = this.getAdapter();
        TextInputLayout textInputLayout = this.f();
        int n8 = 0;
        if (listAdapter != null && textInputLayout != null) {
            int n9;
            int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
            int n11 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
            int n12 = Math.max(0, this.e.x());
            int n13 = Math.min(listAdapter.getCount(), n12 + 15);
            Drawable drawable = null;
            n12 = 0;
            for (n9 = Math.max(0, n13 - 15); n9 < n13; ++n9) {
                int n14 = listAdapter.getItemViewType(n9);
                int n15 = n8;
                if (n14 != n8) {
                    drawable = null;
                    n15 = n14;
                }
                if ((drawable = listAdapter.getView(n9, (View)drawable, (ViewGroup)textInputLayout)).getLayoutParams() == null) {
                    drawable.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                drawable.measure(n10, n11);
                n12 = Math.max(n12, drawable.getMeasuredWidth());
                n8 = n15;
            }
            drawable = this.e.i();
            n9 = n12;
            if (drawable != null) {
                drawable.getPadding(this.g);
                drawable = this.g;
                n9 = n12 + (drawable.left + drawable.right);
            }
            return n9 + textInputLayout.getEndIconView().getMeasuredWidth();
        }
        return 0;
    }

    private void k() {
        TextInputLayout textInputLayout = this.f();
        if (textInputLayout != null) {
            textInputLayout.s0();
        }
    }

    public void dismissDropDown() {
        if (this.g()) {
            this.e.dismiss();
            return;
        }
        super.dismissDropDown();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = this.f();
        if (textInputLayout != null && textInputLayout.T()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = this.f();
        if (textInputLayout != null && textInputLayout.T() && super.getHint() == null && ax.F6.i.d()) {
            this.setHint("");
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (View.MeasureSpec.getMode((int)n8) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.j()), View.MeasureSpec.getSize((int)n8)), this.getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean bl) {
        if (this.g()) {
            return;
        }
        super.onWindowFocusChanged(bl);
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.e.p(this.getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        t t8 = this.e;
        if (t8 != null) {
            t8.a(drawable);
        }
    }

    public void setDropDownBackgroundTint(int n8) {
        this.setDropDownBackgroundTintList(ColorStateList.valueOf((int)n8));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        colorStateList = this.getDropDownBackground();
        if (colorStateList instanceof h) {
            ((h)colorStateList).g0(this.j);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.M(this.getOnItemSelectedListener());
    }

    public void setRawInputType(int n8) {
        super.setRawInputType(n8);
        this.k();
    }

    public void setSimpleItemSelectedColor(int n8) {
        this.k = n8;
        if (this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (this.getAdapter() instanceof b) {
            ((b)this.getAdapter()).f();
        }
    }

    public void setSimpleItems(int n8) {
        this.setSimpleItems(this.getResources().getStringArray(n8));
    }

    public void setSimpleItems(String[] stringArray) {
        this.setAdapter((ListAdapter & Filterable)new b(this, this.getContext(), this.h, stringArray));
    }

    public void showDropDown() {
        if (this.g()) {
            this.e.c();
            return;
        }
        super.showDropDown();
    }

    private class b<T>
    extends ArrayAdapter<String> {
        private ColorStateList a;
        private ColorStateList b;
        final v c;

        b(v v8, Context context, int n8, String[] stringArray) {
            this.c = v8;
            super(context, n8, (Object[])stringArray);
            this.f();
        }

        private ColorStateList a() {
            if (this.c() && this.d()) {
                int[] nArray = new int[]{16843623, -16842919};
                int[] nArray2 = new int[]{0x10100A1, -16842919};
                int n8 = this.c.l.getColorForState(nArray2, 0);
                int n9 = this.c.l.getColorForState(nArray, 0);
                n8 = ax.z6.a.j(this.c.k, n8);
                n9 = ax.z6.a.j(this.c.k, n9);
                int n10 = this.c.k;
                return new ColorStateList((int[][])new int[][]{nArray2, nArray, new int[0]}, new int[]{n8, n9, n10});
            }
            return null;
        }

        private Drawable b() {
            if (!this.c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(this.c.k);
            if (this.b != null) {
                colorDrawable.setTintList(this.a);
                return new RippleDrawable(this.b, (Drawable)colorDrawable, null);
            }
            return colorDrawable;
        }

        private boolean c() {
            return this.c.k != 0;
        }

        private boolean d() {
            return this.c.l != null;
        }

        private ColorStateList e() {
            if (!this.d()) {
                return null;
            }
            int[] nArray = new int[]{16842919};
            int n8 = this.c.l.getColorForState(nArray, 0);
            return new ColorStateList((int[][])new int[][]{nArray, new int[0]}, new int[]{n8, 0});
        }

        void f() {
            this.b = this.e();
            this.a = this.a();
        }

        public View getView(int n8, View object, ViewGroup viewGroup) {
            View view = super.getView(n8, object, viewGroup);
            if (view instanceof TextView) {
                viewGroup = (TextView)view;
                object = this.c.getText().toString().contentEquals(viewGroup.getText()) ? this.b() : null;
                viewGroup.setBackground((Drawable)object);
            }
            return view;
        }
    }
}

