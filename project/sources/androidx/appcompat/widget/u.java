package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import ax.b0.C1441b;
import ax.m.C2506a;
import ax.o.C2653a;
import ax.t.InterfaceC3093e;
import ax.u.C3161f;
import ax.u.C3162g;

/* loaded from: classes.dex */
public class u extends Spinner {

    @SuppressLint({"ResourceType"})
    private static final int[] i = {R.attr.spinnerMode};
    private final C0574e a;
    private final Context b;
    private ax.u.s c;
    private SpinnerAdapter d;
    private final boolean e;
    private h f;
    int g;
    final Rect h;

    class a extends ax.u.s {
        final /* synthetic */ f j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.j = fVar;
        }

        @Override // ax.u.s
        public InterfaceC3093e b() {
            return this.j;
        }

        @Override // ax.u.s
        public boolean c() {
            if (u.this.getInternalPopup().b()) {
                return true;
            }
            u.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!u.this.getInternalPopup().b()) {
                u.this.b();
            }
            ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C1441b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {
        androidx.appcompat.app.a a;
        private ListAdapter b;
        private CharSequence c;

        d() {
        }

        @Override // androidx.appcompat.widget.u.h
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.u.h
        public boolean b() {
            androidx.appcompat.app.a aVar = this.a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.u.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.u.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.a;
            if (aVar != null) {
                aVar.dismiss();
                this.a = null;
            }
        }

        @Override // androidx.appcompat.widget.u.h
        public void f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.u.h
        public CharSequence g() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.u.h
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.u.h
        public void k(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.u.h
        public void l(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.u.h
        public void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.u.h
        public void n(int i, int i2) {
            if (this.b == null) {
                return;
            }
            a.C0006a c0006a = new a.C0006a(u.this.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                c0006a.setTitle(charSequence);
            }
            androidx.appcompat.app.a create = c0006a.n(this.b, u.this.getSelectedItemPosition(), this).create();
            this.a = create;
            ListView j = create.j();
            j.setTextDirection(i);
            j.setTextAlignment(i2);
            this.a.show();
        }

        @Override // androidx.appcompat.widget.u.h
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            u.this.setSelection(i);
            if (u.this.getOnItemClickListener() != null) {
                u.this.performItemClick(null, i, this.b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.u.h
        public void p(ListAdapter listAdapter) {
            this.b = listAdapter;
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && C3161f.a(spinnerAdapter)) {
                    c.a(C3162g.a(spinnerAdapter), theme);
                } else if (spinnerAdapter instanceof ax.u.x) {
                    ax.u.x xVar = (ax.u.x) spinnerAdapter;
                    if (xVar.getDropDownViewTheme() == null) {
                        xVar.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends ax.u.t implements h {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;

        class a implements AdapterView.OnItemClickListener {
            final /* synthetic */ u a;

            a(u uVar) {
                this.a = uVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                u.this.setSelection(i);
                if (u.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    u.this.performItemClick(view, i, fVar.K.getItemId(i));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(u.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.c();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = u.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.L = new Rect();
            D(u.this);
            J(true);
            P(0);
            L(new a(u.this));
        }

        void T() {
            int i;
            Drawable i2 = i();
            if (i2 != null) {
                i2.getPadding(u.this.h);
                i = O.b(u.this) ? u.this.h.right : -u.this.h.left;
            } else {
                Rect rect = u.this.h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = u.this.getPaddingLeft();
            int paddingRight = u.this.getPaddingRight();
            int width = u.this.getWidth();
            u uVar = u.this;
            int i3 = uVar.g;
            if (i3 == -2) {
                int a2 = uVar.a((SpinnerAdapter) this.K, i());
                int i4 = u.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = u.this.h;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                F(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i3);
            }
            f(O.b(u.this) ? i + (((width - paddingRight) - z()) - U()) : i + paddingLeft + U());
        }

        public int U() {
            return this.M;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.u.h
        public CharSequence g() {
            return this.J;
        }

        @Override // androidx.appcompat.widget.u.h
        public void k(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.u.h
        public void m(int i) {
            this.M = i;
        }

        @Override // androidx.appcompat.widget.u.h
        public void n(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            T();
            I(2);
            super.c();
            ListView j = j();
            j.setChoiceMode(1);
            j.setTextDirection(i);
            j.setTextAlignment(i2);
            Q(u.this.getSelectedItemPosition());
            if (b2 || (viewTreeObserver = u.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // ax.u.t, androidx.appcompat.widget.u.h
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.K = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();
        boolean q;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.q = parcel.readByte() != 0;
        }
    }

    interface h {
        void a(Drawable drawable);

        boolean b();

        int d();

        void dismiss();

        void f(int i);

        CharSequence g();

        Drawable i();

        void k(CharSequence charSequence);

        void l(int i);

        void m(int i);

        void n(int i, int i2);

        int o();

        void p(ListAdapter listAdapter);
    }

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.M);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.h);
        Rect rect = this.h;
        return i3 + rect.left + rect.right;
    }

    void b() {
        this.f.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f;
        return hVar != null ? hVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f;
        return hVar != null ? hVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f;
        if (hVar == null || !hVar.b()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.q || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f;
        gVar.q = hVar != null && hVar.b();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ax.u.s sVar = this.c;
        if (sVar == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        h hVar = this.f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            hVar.m(i2);
            this.f.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        h hVar = this.f;
        if (hVar != null) {
            hVar.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f;
        if (hVar != null) {
            hVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(C2653a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f;
        if (hVar != null) {
            hVar.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.j(mode);
        }
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.f.p(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public u(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
