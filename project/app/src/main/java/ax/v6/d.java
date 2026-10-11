/*
 * Decompiled with CFR 0.152.
 */
package ax.v6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.g;
import ax.C6.f;
import ax.F6.w;
import ax.F6.z;
import ax.R.t;
import ax.k6.k;
import ax.k6.l;
import ax.k6.m;
import ax.v6.a;
import ax.w2.e;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class d
extends g {
    private static final int[] A;
    private static final int[][] B;
    @SuppressLint(value={"DiscouragedApi"})
    private static final int C;
    private static final int y;
    private static final int[] z;
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
    private final e w;
    private final ax.w2.b x;

    static {
        y = ax.k6.l.x;
        z = new int[]{ax.k6.c.a0};
        int n8 = ax.k6.c.Z;
        A = new int[]{n8};
        B = new int[][]{{16842910, n8}, {16842910, 0x10100A0}, {16842910, -16842912}, {-16842910, 0x10100A0}, {-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.r);
    }

    public d(Context context, AttributeSet object, int n8) {
        int n9 = y;
        super(ax.V6.a.d(context, (AttributeSet)object, n8, n9), (AttributeSet)object, n8);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.w = ax.w2.e.a(this.getContext(), ax.k6.f.h);
        this.x = new ax.w2.b(this){
            final d b;
            {
                this.b = d8;
            }

            @Override
            public void b(Drawable drawable) {
                super.b(drawable);
                ColorStateList colorStateList = this.b.o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
            }

            @Override
            public void c(Drawable drawable) {
                super.c(drawable);
                d d8 = this.b;
                ColorStateList colorStateList = d8.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(d8.s, this.b.o.getDefaultColor()));
                }
            }
        };
        context = this.getContext();
        this.l = ax.h0.c.a((CompoundButton)this);
        this.o = this.getSuperButtonTintList();
        this.setSupportButtonTintList(null);
        object = ax.F6.w.j(context, (AttributeSet)object, ax.k6.m.z3, n8, n9, new int[0]);
        this.m = ((L)object).g(ax.k6.m.C3);
        if (this.l != null && ax.F6.w.g(context) && this.c((L)object)) {
            super.setButtonDrawable(null);
            this.l = ax.o.a.b(context, ax.k6.f.g);
            this.n = true;
            if (this.m == null) {
                this.m = ax.o.a.b(context, ax.k6.f.i);
            }
        }
        this.p = ax.K6.c.b(context, (L)object, ax.k6.m.D3);
        this.q = ax.F6.z.i(((L)object).k(ax.k6.m.E3, -1), PorterDuff.Mode.SRC_IN);
        this.h = ((L)object).a(ax.k6.m.J3, false);
        this.i = ((L)object).a(ax.k6.m.F3, true);
        this.j = ((L)object).a(ax.k6.m.I3, false);
        this.k = ((L)object).p(ax.k6.m.H3);
        n8 = ax.k6.m.G3;
        if (((L)object).s(n8)) {
            this.setCheckedState(((L)object).k(n8, 0));
        }
        ((L)object).x();
        this.e();
    }

    private boolean c(L l8) {
        int n8 = l8.n(ax.k6.m.A3, 0);
        int n9 = l8.n(ax.k6.m.B3, 0);
        return n8 == C && n9 == 0;
    }

    private void e() {
        this.l = ax.C6.f.c(this.l, this.o, ax.h0.c.c((CompoundButton)this));
        this.m = ax.C6.f.c(this.m, this.p, this.q);
        this.g();
        this.h();
        super.setButtonDrawable(ax.C6.f.a(this.l, this.m));
        this.refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.u == null) {
            super.setStateDescription((CharSequence)this.getButtonStateDescription());
        }
    }

    private void g() {
        if (this.n) {
            Drawable drawable;
            e e8 = this.w;
            if (e8 != null) {
                e8.g(this.x);
                this.w.c(this.x);
            }
            if (Build.VERSION.SDK_INT >= 24 && (drawable = this.l) instanceof AnimatedStateListDrawable && (e8 = this.w) != null) {
                drawable = (AnimatedStateListDrawable)drawable;
                int n8 = ax.k6.g.b;
                int n9 = ax.k6.g.X;
                drawable.addTransition(n8, n9, (Drawable)e8, false);
                ((AnimatedStateListDrawable)this.l).addTransition(ax.k6.g.j, n9, (Drawable)this.w, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int n8 = this.r;
        if (n8 == 1) {
            return this.getResources().getString(ax.k6.k.k);
        }
        if (n8 == 0) {
            return this.getResources().getString(ax.k6.k.m);
        }
        return this.getResources().getString(ax.k6.k.l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int[][] nArray = B;
            int[] nArray2 = new int[nArray.length];
            int n8 = ax.z6.a.d((View)this, ax.m.a.v);
            int n9 = ax.z6.a.d((View)this, ax.m.a.y);
            int n10 = ax.z6.a.d((View)this, ax.k6.c.i);
            int n11 = ax.z6.a.d((View)this, ax.k6.c.f);
            nArray2[0] = ax.z6.a.k(n10, n9, 1.0f);
            nArray2[1] = ax.z6.a.k(n10, n8, 1.0f);
            nArray2[2] = ax.z6.a.k(n10, n11, 0.54f);
            nArray2[3] = ax.z6.a.k(n10, n11, 0.38f);
            nArray2[4] = ax.z6.a.k(n10, n11, 0.38f);
            this.g = new ColorStateList(nArray, nArray2);
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return this.getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        Drawable drawable = this.l;
        if (drawable != null && (colorStateList = this.o) != null) {
            drawable.setTintList(colorStateList);
        }
        if ((colorStateList = this.m) != null && (drawable = this.p) != null) {
            colorStateList.setTintList((ColorStateList)drawable);
        }
    }

    public boolean d() {
        return this.j;
    }

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

    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    public boolean isChecked() {
        return this.r == 1;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.o == null && this.p == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 2);
        if (this.getCheckedState() == 2) {
            View.mergeDrawableStates((int[])nArray, (int[])z);
        }
        if (this.d()) {
            View.mergeDrawableStates((int[])nArray, (int[])A);
        }
        this.s = ax.C6.f.e(nArray);
        return nArray;
    }

    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.i && TextUtils.isEmpty((CharSequence)this.getText()) && (drawable = ax.h0.c.a((CompoundButton)this)) != null) {
            int n8 = ax.F6.z.h((View)this) ? -1 : 1;
            n8 = (this.getWidth() - drawable.getIntrinsicWidth()) / 2 * n8;
            int n9 = canvas.save();
            canvas.translate((float)n8, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(n9);
            if (this.getBackground() != null) {
                canvas = drawable.getBounds();
                this.getBackground().setHotspotBounds(canvas.left + n8, canvas.top, canvas.right + n8, canvas.bottom);
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.d()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)accessibilityNodeInfo.getText());
            stringBuilder.append(", ");
            stringBuilder.append((Object)this.k);
            accessibilityNodeInfo.setText((CharSequence)stringBuilder.toString());
        }
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof d)) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (d)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.setCheckedState(object.q);
    }

    public Parcelable onSaveInstanceState() {
        d d8 = new d(super.onSaveInstanceState());
        d8.q = this.getCheckedState();
        return d8;
    }

    @Override
    public void setButtonDrawable(int n8) {
        this.setButtonDrawable(ax.o.a.b(this.getContext(), n8));
    }

    @Override
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        this.e();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        this.e();
    }

    public void setButtonIconDrawableResource(int n8) {
        this.setButtonIconDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.p == colorStateList) {
            return;
        }
        this.p = colorStateList;
        this.e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.q == mode) {
            return;
        }
        this.q = mode;
        this.e();
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.o == colorStateList) {
            return;
        }
        this.o = colorStateList;
        this.e();
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        this.setSupportButtonTintMode(mode);
        this.e();
    }

    public void setCenterIfNoTextEnabled(boolean bl) {
        this.i = bl;
    }

    public void setChecked(boolean bl) {
        this.setCheckedState(bl ? 1 : 0);
    }

    public void setCheckedState(int n8) {
        if (this.r != n8) {
            this.r = n8;
            boolean bl = n8 == 1;
            super.setChecked(bl);
            this.refreshDrawableState();
            this.f();
            if (!this.t) {
                this.t = true;
                LinkedHashSet<b> linkedHashSet = this.f;
                if (linkedHashSet != null) {
                    linkedHashSet = ((AbstractCollection)linkedHashSet).iterator();
                    while (linkedHashSet.hasNext()) {
                        ((b)linkedHashSet.next()).a(this, this.r);
                    }
                }
                if (this.r != 2 && (linkedHashSet = this.v) != null) {
                    linkedHashSet.onCheckedChanged((CompoundButton)this, this.isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (linkedHashSet = ax.v6.b.a(ax.R.t.a(this.getContext(), a.a()))) != null) {
                    ax.v6.c.a((AutofillManager)linkedHashSet, (View)this);
                }
                this.t = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getResources().getText(n8) : null;
        this.setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean bl) {
        if (this.j != bl) {
            this.j = bl;
            this.refreshDrawableState();
            Iterator iterator = ((AbstractCollection)this.e).iterator();
            while (iterator.hasNext()) {
                ((c)iterator.next()).a(this, this.j);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            this.f();
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean bl) {
        this.h = bl;
        if (bl) {
            ax.h0.c.d((CompoundButton)this, this.getMaterialThemeColorsTintList());
            return;
        }
        ax.h0.c.d((CompoundButton)this, null);
    }

    public void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }

    public static interface b {
        public void a(d var1, int var2);
    }

    public static interface c {
        public void a(d var1, boolean var2);
    }

    static class d
    extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>(){

            public d a(Parcel parcel) {
                return new d(parcel);
            }

            public d[] b(int n8) {
                return new d[n8];
            }
        };
        int q;

        private d(Parcel parcel) {
            super(parcel);
            this.q = (Integer)parcel.readValue(((Object)((Object)this)).getClass().getClassLoader());
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private String a() {
            int n8 = this.q;
            if (n8 != 1) {
                if (n8 != 2) {
                    return "unchecked";
                }
                return "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MaterialCheckBox.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode((Object)this)));
            stringBuilder.append(" CheckedState=");
            stringBuilder.append(this.a());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeValue((Object)this.q);
        }
    }
}

