package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.B;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
public class ActionMenuView extends B implements e.b, androidx.appcompat.view.menu.k {
    e A;
    private androidx.appcompat.view.menu.e p;
    private Context q;
    private int r;
    private boolean s;
    private C0572c t;
    private j.a u;
    e.a v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends B.a {

        @ViewDebug.ExportedProperty
        public boolean a;

        @ViewDebug.ExportedProperty
        public int b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;

        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int L(View view, int i, int i2, int i3, int i4) {
        int i5;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.s();
        if (i2 > 0) {
            i5 = 2;
            if (!z2 || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z2 || i6 >= 2) {
                    i5 = i6;
                }
                if (!cVar.a && z2) {
                    z = true;
                }
                cVar.d = z;
                cVar.b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!cVar.a) {
            z = true;
        }
        cVar.d = z;
        cVar.b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    private void M(int i, int i2) {
        long j;
        int i3;
        int i4;
        boolean z;
        ?? r3;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i6 = size - paddingLeft;
        int i7 = this.y;
        int i8 = i6 / i7;
        int i9 = i6 % i7;
        if (i8 == 0) {
            setMeasuredDimension(i6, 0);
            return;
        }
        int i10 = i7 + (i9 / i8);
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long j2 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            int i16 = size2;
            if (childAt.getVisibility() == 8) {
                i5 = i10;
            } else {
                boolean z3 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z3) {
                    int i17 = this.z;
                    z = z3;
                    r3 = 0;
                    childAt.setPadding(i17, 0, i17, 0);
                } else {
                    z = z3;
                    r3 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f = r3;
                cVar.c = r3;
                cVar.b = r3;
                cVar.d = r3;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r3;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r3;
                cVar.e = z && ((ActionMenuItemView) childAt).s();
                int L = L(childAt, i10, cVar.a ? 1 : i8, childMeasureSpec, paddingTop);
                i14 = Math.max(i14, L);
                i5 = i10;
                if (cVar.d) {
                    i15++;
                }
                if (cVar.a) {
                    z2 = true;
                }
                i8 -= L;
                i11 = Math.max(i11, childAt.getMeasuredHeight());
                if (L == 1) {
                    j2 |= 1 << i12;
                }
            }
            i12++;
            size2 = i16;
            i10 = i5;
        }
        int i18 = size2;
        int i19 = i10;
        boolean z4 = z2 && i13 == 2;
        boolean z5 = false;
        while (i15 > 0 && i8 > 0) {
            int i20 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            long j3 = 0;
            int i21 = 0;
            int i22 = 0;
            j = 1;
            while (i22 < childCount) {
                c cVar2 = (c) getChildAt(i22).getLayoutParams();
                boolean z6 = z4;
                if (cVar2.d) {
                    int i23 = cVar2.b;
                    if (i23 < i20) {
                        j3 = 1 << i22;
                        i20 = i23;
                        i21 = 1;
                    } else if (i23 == i20) {
                        j3 |= 1 << i22;
                        i21++;
                    }
                }
                i22++;
                z4 = z6;
            }
            boolean z7 = z4;
            j2 |= j3;
            if (i21 > i8) {
                break;
            }
            int i24 = i20 + 1;
            int i25 = 0;
            while (i25 < childCount) {
                View childAt2 = getChildAt(i25);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j4 = 1 << i25;
                if ((j3 & j4) == 0) {
                    if (cVar3.b == i24) {
                        j2 |= j4;
                    }
                    i4 = i25;
                } else {
                    if (z7 && cVar3.e && i8 == 1) {
                        int i26 = this.z;
                        i4 = i25;
                        childAt2.setPadding(i26 + i19, 0, i26, 0);
                    } else {
                        i4 = i25;
                    }
                    cVar3.b++;
                    cVar3.f = true;
                    i8--;
                }
                i25 = i4 + 1;
            }
            z4 = z7;
            z5 = true;
        }
        j = 1;
        boolean z8 = !z2 && i13 == 1;
        if (i8 <= 0 || j2 == 0 || (i8 >= i13 - 1 && !z8 && i14 <= 1)) {
            i3 = 0;
        } else {
            float bitCount = Long.bitCount(j2);
            if (z8) {
                i3 = 0;
            } else {
                if ((j2 & j) != 0) {
                    i3 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i3 = 0;
                }
                int i27 = childCount - 1;
                if ((j2 & (1 << i27)) != 0 && !((c) getChildAt(i27).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i28 = bitCount > 0.0f ? (int) ((i8 * i19) / bitCount) : 0;
            for (int i29 = 0; i29 < childCount; i29++) {
                if ((j2 & (1 << i29)) != 0) {
                    View childAt3 = getChildAt(i29);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i28;
                        cVar4.f = true;
                        if (i29 == 0 && !cVar4.e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i28) / 2;
                        }
                        z5 = true;
                    } else {
                        if (cVar4.a) {
                            cVar4.c = i28;
                            cVar4.f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i28) / 2;
                            z5 = true;
                        } else {
                            if (i29 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i28 / 2;
                            }
                            if (i29 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i28 / 2;
                            }
                        }
                    }
                }
            }
        }
        if (z5) {
            while (i3 < childCount) {
                View childAt4 = getChildAt(i3);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i19) + cVar5.c, 1073741824), childMeasureSpec);
                }
                i3++;
            }
        }
        setMeasuredDimension(i6, mode != 1073741824 ? i11 : i18);
    }

    public void B() {
        C0572c c0572c = this.t;
        if (c0572c != null) {
            c0572c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.B
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.B
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.B
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : ((a) childAt2).b() | z;
    }

    public boolean H() {
        C0572c c0572c = this.t;
        return c0572c != null && c0572c.B();
    }

    public boolean I() {
        C0572c c0572c = this.t;
        return c0572c != null && c0572c.D();
    }

    public boolean J() {
        C0572c c0572c = this.t;
        return c0572c != null && c0572c.E();
    }

    public boolean K() {
        return this.s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.u = aVar;
        this.v = aVar2;
    }

    public boolean P() {
        C0572c c0572c = this.t;
        return c0572c != null && c0572c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.p.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.p = eVar;
    }

    @Override // androidx.appcompat.widget.B, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.p = eVar;
            eVar.S(new d());
            C0572c c0572c = new C0572c(context);
            this.t = c0572c;
            c0572c.J(true);
            C0572c c0572c2 = this.t;
            j.a aVar = this.u;
            if (aVar == null) {
                aVar = new b();
            }
            c0572c2.h(aVar);
            this.p.c(this.t, this.q);
            this.t.H(this);
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.t.A();
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0572c c0572c = this.t;
        if (c0572c != null) {
            c0572c.d(false);
            if (this.t.E()) {
                this.t.B();
                this.t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.B, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = O.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.B, android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = this.w;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.w = z2;
        if (z != z2) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (eVar = this.p) != null && size != this.x) {
            this.x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.w && childCount > 0) {
            M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.G(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.t.I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0572c c0572c) {
        this.t = c0572c;
        c0572c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }
}
