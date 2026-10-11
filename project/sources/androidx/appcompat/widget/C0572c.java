package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import ax.c0.AbstractC1755b;
import ax.m.C2506a;
import ax.s.C3034a;
import ax.t.InterfaceC3093e;
import ax.u.C3151B;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0572c extends androidx.appcompat.view.menu.a implements AbstractC1755b.a {
    RunnableC0010c A;
    private b B;
    final f C;
    int D;
    d k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x;
    e y;
    a z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, C2506a.l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C0572c.this.k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C0572c.this).i : view2);
            }
            j(C0572c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C0572c c0572c = C0572c.this;
            c0572c.z = null;
            c0572c.D = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC3093e a() {
            a aVar = C0572c.this.z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0010c implements Runnable {
        private e q;

        public RunnableC0010c(e eVar) {
            this.q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C0572c.this).c != null) {
                ((androidx.appcompat.view.menu.a) C0572c.this).c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C0572c.this).i;
            if (view != null && view.getWindowToken() != null && this.q.n()) {
                C0572c.this.y = this.q;
            }
            C0572c.this.A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends ax.u.s {
            final /* synthetic */ C0572c j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0572c c0572c) {
                super(view);
                this.j = c0572c;
            }

            @Override // ax.u.s
            public InterfaceC3093e b() {
                e eVar = C0572c.this.y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // ax.u.s
            public boolean c() {
                C0572c.this.K();
                return true;
            }

            @Override // ax.u.s
            public boolean d() {
                C0572c c0572c = C0572c.this;
                if (c0572c.A != null) {
                    return false;
                }
                c0572c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C2506a.k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C3151B.a(this, getContentDescription());
            setOnTouchListener(new a(this, C0572c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0572c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                ax.U.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, C2506a.l);
            h(8388613);
            j(C0572c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C0572c.this).c != null) {
                ((androidx.appcompat.view.menu.a) C0572c.this).c.close();
            }
            C0572c.this.y = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m = C0572c.this.m();
            if (m != null) {
                m.a(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C0572c.this).c) {
                return false;
            }
            C0572c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m = C0572c.this.m();
            if (m != null) {
                return m.b(eVar);
            }
            return false;
        }
    }

    public C0572c(Context context) {
        super(context, ax.m.g.c, ax.m.g.b);
        this.x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.m) {
            return this.l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0010c runnableC0010c = this.A;
        if (runnableC0010c != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(runnableC0010c);
            this.A = null;
            return true;
        }
        e eVar = this.y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.s) {
            this.r = C3034a.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z) {
        this.v = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.i = actionMenuView;
        actionMenuView.b(this.c);
    }

    public void I(Drawable drawable) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.m = true;
            this.l = drawable;
        }
    }

    public void J(boolean z) {
        this.n = z;
        this.o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.n || E() || (eVar = this.c) == null || this.i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0010c runnableC0010c = new RunnableC0010c(new e(this.b, this.c, this.k, true));
        this.A = runnableC0010c;
        ((View) this.i).post(runnableC0010c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        y();
        super.a(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z) {
        super.d(z);
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.c;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s = eVar.s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                AbstractC1755b b2 = s.get(i).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.c;
        ArrayList<androidx.appcompat.view.menu.g> z3 = eVar2 != null ? eVar2.z() : null;
        if (this.n && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                actionMenuView.addView(this.k, actionMenuView.F());
            }
        } else {
            d dVar = this.k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        C0572c c0572c = this;
        androidx.appcompat.view.menu.e eVar = c0572c.c;
        View view = null;
        int i5 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c0572c.r;
        int i7 = c0572c.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0572c.i;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i10);
            if (gVar.o()) {
                i8++;
            } else if (gVar.n()) {
                i9++;
            } else {
                z = true;
            }
            if (c0572c.v && gVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (c0572c.n && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = c0572c.x;
        sparseBooleanArray.clear();
        if (c0572c.t) {
            int i12 = c0572c.w;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i13);
            if (gVar2.o()) {
                View n = c0572c.n(gVar2, view, viewGroup);
                if (c0572c.t) {
                    i3 -= ActionMenuView.L(n, i2, i3, makeMeasureSpec, i5);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i4 = i;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!c0572c.t || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View n2 = c0572c.n(gVar2, null, viewGroup);
                    if (c0572c.t) {
                        int L = ActionMenuView.L(n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!c0572c.t ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i15);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i11++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                gVar2.u(z3);
            } else {
                i4 = i;
                gVar2.u(false);
                i13++;
                view = null;
                c0572c = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            c0572c = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        C3034a b2 = C3034a.b(context);
        if (!this.o) {
            this.n = b2.h();
        }
        if (!this.u) {
            this.p = b2.c();
        }
        if (!this.s) {
            this.r = b2.d();
        }
        int i = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.a);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i;
        this.w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.g0() != this.c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.g0();
        }
        View z2 = z(mVar2.getItem());
        if (z2 == null) {
            return false;
        }
        this.D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        a aVar = new a(this.b, mVar, z2);
        this.z = aVar;
        aVar.g(z);
        this.z.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.k) {
            return false;
        }
        return super.l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.i;
        androidx.appcompat.view.menu.k o = super.o(viewGroup);
        if (kVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
