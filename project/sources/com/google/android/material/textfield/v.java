package com.google.android.material.textfield;

import android.R;
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
import androidx.appcompat.widget.C0573d;
import ax.k6.C2404e;
import ax.k6.C2408i;
import ax.m.C2506a;
import ax.z6.C3555a;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class v extends C0573d {
    private final ax.u.t e;
    private final AccessibilityManager f;
    private final Rect g;
    private final int h;
    private final float i;
    private ColorStateList j;
    private int k;
    private ColorStateList l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            v vVar = v.this;
            Object v = i < 0 ? vVar.e.v() : vVar.getAdapter().getItem(i);
            v vVar2 = v.this;
            vVar2.setText(vVar2.convertSelectionToString(v), false);
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = v.this.e.y();
                    i = v.this.e.x();
                    j = v.this.e.w();
                }
                onItemClickListener.onItemClick(v.this.e.j(), view, i, j);
            }
            v.this.e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {
        private ColorStateList a;
        private ColorStateList b;

        b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C3555a.j(v.this.k, v.this.l.getColorForState(iArr2, 0)), C3555a.j(v.this.k, v.this.l.getColorForState(iArr, 0)), v.this.k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.k);
            if (this.b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        private boolean c() {
            return v.this.k != 0;
        }

        private boolean d() {
            return v.this.l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.b = e();
            this.a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.p);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f = f();
        int i = 0;
        if (adapter == null || f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.e.x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable i3 = this.e.i();
        if (i3 != null) {
            i3.getPadding(this.g);
            Rect rect = this.g;
            i2 += rect.left + rect.right;
        }
        return i2 + f.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout f = f();
        if (f != null) {
            f.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f = f();
        return (f == null || !f.T()) ? super.getHint() : f.getHint();
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

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f = f();
        if (f != null && f.T() && super.getHint() == null && ax.F6.i.d()) {
            setHint(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ax.u.t tVar = this.e;
        if (tVar != null) {
            tVar.a(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ax.O6.h) {
            ((ax.O6.h) dropDownBackground).g0(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        k();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.k = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.e.c();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i) {
        super(ax.V6.a.d(context, attributeSet, i, 0), attributeSet, i);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray i2 = ax.F6.w.i(context2, attributeSet, ax.k6.m.l2, i, ax.m.i.f, new int[0]);
        int i3 = ax.k6.m.m2;
        if (i2.hasValue(i3) && i2.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.h = i2.getResourceId(ax.k6.m.p2, C2408i.o);
        this.i = i2.getDimensionPixelOffset(ax.k6.m.n2, C2404e.m0);
        int i4 = ax.k6.m.o2;
        if (i2.hasValue(i4)) {
            this.j = ColorStateList.valueOf(i2.getColor(i4, 0));
        }
        this.k = i2.getColor(ax.k6.m.q2, 0);
        this.l = ax.K6.c.a(context2, i2, ax.k6.m.r2);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        ax.u.t tVar = new ax.u.t(context2);
        this.e = tVar;
        tVar.J(true);
        tVar.D(this);
        tVar.I(2);
        tVar.p(getAdapter());
        tVar.L(new a());
        int i5 = ax.k6.m.s2;
        if (i2.hasValue(i5)) {
            setSimpleItems(i2.getResourceId(i5, 0));
        }
        i2.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.h, strArr));
    }
}
