package ax.v6;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0576g;
import androidx.appcompat.widget.L;
import ax.C6.f;
import ax.F6.z;
import ax.k6.C2402c;
import ax.k6.C2406g;
import ax.k6.C2410k;
import ax.k6.l;
import ax.k6.m;
import ax.m.C2506a;
import ax.o.C2653a;
import ax.w2.AbstractC3330b;
import ax.w2.C3333e;
import ax.z6.C3555a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class d extends C0576g {
    private static final int[] A;
    private static final int[][] B;

    @SuppressLint({"DiscouragedApi"})
    private static final int C;
    private static final int y = l.x;
    private static final int[] z = {C2402c.a0};
    private final LinkedHashSet<c> e;
    private final LinkedHashSet<b> f;
    private ColorStateList g;
    private boolean h;
    private boolean i;
    private boolean j;
    private CharSequence k;
    private Drawable l;
    private Drawable m;
    private boolean n;
    ColorStateList o;
    ColorStateList p;
    private PorterDuff.Mode q;
    private int r;
    private int[] s;
    private boolean t;
    private CharSequence u;
    private CompoundButton.OnCheckedChangeListener v;
    private final C3333e w;
    private final AbstractC3330b x;

    class a extends AbstractC3330b {
        a() {
        }

        @Override // ax.w2.AbstractC3330b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = d.this.o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // ax.w2.AbstractC3330b
        public void c(Drawable drawable) {
            super.c(drawable);
            d dVar = d.this;
            ColorStateList colorStateList = dVar.o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(dVar.s, d.this.o.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(d dVar, int i);
    }

    public interface c {
        void a(d dVar, boolean z);
    }

    /* renamed from: ax.v6.d$d, reason: collision with other inner class name */
    static class C0481d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0481d> CREATOR = new a();
        int q;

        /* renamed from: ax.v6.d$d$a */
        class a implements Parcelable.Creator<C0481d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0481d createFromParcel(Parcel parcel) {
                return new C0481d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0481d[] newArray(int i) {
                return new C0481d[i];
            }
        }

        /* synthetic */ C0481d(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i = this.q;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.q));
        }

        C0481d(Parcelable parcelable) {
            super(parcelable);
        }

        private C0481d(Parcel parcel) {
            super(parcel);
            this.q = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = C2402c.Z;
        A = new int[]{i};
        B = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.r);
    }

    private boolean c(L l) {
        return l.n(m.A3, 0) == C && l.n(m.B3, 0) == 0;
    }

    private void e() {
        this.l = f.c(this.l, this.o, ax.h0.c.c(this));
        this.m = f.c(this.m, this.p, this.q);
        g();
        h();
        super.setButtonDrawable(f.a(this.l, this.m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        C3333e c3333e;
        if (this.n) {
            C3333e c3333e2 = this.w;
            if (c3333e2 != null) {
                c3333e2.g(this.x);
                this.w.c(this.x);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.l;
                if (!(drawable instanceof AnimatedStateListDrawable) || (c3333e = this.w) == null) {
                    return;
                }
                int i = C2406g.b;
                int i2 = C2406g.X;
                ((AnimatedStateListDrawable) drawable).addTransition(i, i2, c3333e, false);
                ((AnimatedStateListDrawable) this.l).addTransition(C2406g.j, i2, this.w, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i = this.r;
        return i == 1 ? getResources().getString(C2410k.k) : i == 0 ? getResources().getString(C2410k.m) : getResources().getString(C2410k.l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int d = C3555a.d(this, C2506a.v);
            int d2 = C3555a.d(this, C2506a.y);
            int d3 = C3555a.d(this, C2402c.i);
            int d4 = C3555a.d(this, C2402c.f);
            iArr2[0] = C3555a.k(d3, d2, 1.0f);
            iArr2[1] = C3555a.k(d3, d, 1.0f);
            iArr2[2] = C3555a.k(d3, d4, 0.54f);
            iArr2[3] = C3555a.k(d3, d4, 0.38f);
            iArr2[4] = C3555a.k(d3, d4, 0.38f);
            this.g = new ColorStateList(iArr, iArr2);
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.l;
        if (drawable != null && (colorStateList2 = this.o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.m;
        if (drawable2 == null || (colorStateList = this.p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public boolean d() {
        return this.j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, z);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        this.s = f.e(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = ax.h0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (z.h(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0481d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0481d c0481d = (C0481d) parcelable;
        super.onRestoreInstanceState(c0481d.getSuperState());
        setCheckedState(c0481d.q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C0481d c0481d = new C0481d(super.onSaveInstanceState());
        c0481d.q = getCheckedState();
        return c0481d;
    }

    @Override // androidx.appcompat.widget.C0576g, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C2653a.b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C2653a.b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i) {
            this.r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            f();
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet<b> linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.r);
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService((Class<Object>) C3287a.a());
                AutofillManager a2 = ax.v6.b.a(systemService);
                if (a2 != null) {
                    a2.notifyValueChanged(this);
                }
            }
            this.t = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        refreshDrawableState();
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.j);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            ax.h0.c.d(this, getMaterialThemeColorsTintList());
        } else {
            ax.h0.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = ax.v6.d.y
            android.content.Context r8 = ax.V6.a.d(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.e = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f = r8
            android.content.Context r8 = r7.getContext()
            int r0 = ax.k6.C2405f.h
            ax.w2.e r8 = ax.w2.C3333e.a(r8, r0)
            r7.w = r8
            ax.v6.d$a r8 = new ax.v6.d$a
            r8.<init>()
            r7.x = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = ax.h0.c.a(r7)
            r7.l = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.o = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            int[] r2 = ax.k6.m.z3
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            androidx.appcompat.widget.L r9 = ax.F6.w.j(r0, r1, r2, r3, r4, r5)
            int r10 = ax.k6.m.C3
            android.graphics.drawable.Drawable r10 = r9.g(r10)
            r7.m = r10
            android.graphics.drawable.Drawable r10 = r7.l
            r1 = 1
            if (r10 == 0) goto L7b
            boolean r10 = ax.F6.w.g(r0)
            if (r10 == 0) goto L7b
            boolean r10 = r7.c(r9)
            if (r10 == 0) goto L7b
            super.setButtonDrawable(r8)
            int r8 = ax.k6.C2405f.g
            android.graphics.drawable.Drawable r8 = ax.o.C2653a.b(r0, r8)
            r7.l = r8
            r7.n = r1
            android.graphics.drawable.Drawable r8 = r7.m
            if (r8 != 0) goto L7b
            int r8 = ax.k6.C2405f.i
            android.graphics.drawable.Drawable r8 = ax.o.C2653a.b(r0, r8)
            r7.m = r8
        L7b:
            int r8 = ax.k6.m.D3
            android.content.res.ColorStateList r8 = ax.K6.c.b(r0, r9, r8)
            r7.p = r8
            int r8 = ax.k6.m.E3
            r10 = -1
            int r8 = r9.k(r8, r10)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = ax.F6.z.i(r8, r10)
            r7.q = r8
            int r8 = ax.k6.m.J3
            boolean r8 = r9.a(r8, r6)
            r7.h = r8
            int r8 = ax.k6.m.F3
            boolean r8 = r9.a(r8, r1)
            r7.i = r8
            int r8 = ax.k6.m.I3
            boolean r8 = r9.a(r8, r6)
            r7.j = r8
            int r8 = ax.k6.m.H3
            java.lang.CharSequence r8 = r9.p(r8)
            r7.k = r8
            int r8 = ax.k6.m.G3
            boolean r10 = r9.s(r8)
            if (r10 == 0) goto Lc1
            int r8 = r9.k(r8, r6)
            r7.setCheckedState(r8)
        Lc1:
            r9.x()
            r7.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.v6.d.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.C0576g, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        e();
    }
}
