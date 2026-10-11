package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.AbstractC3268k;
import java.util.Map;

/* renamed from: ax.v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3259b extends AbstractC3268k {
    private static final String[] O0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<i, PointF> P0 = new a(PointF.class, "topLeft");
    private static final Property<i, PointF> Q0 = new C0476b(PointF.class, "bottomRight");
    private static final Property<View, PointF> R0 = new c(PointF.class, "bottomRight");
    private static final Property<View, PointF> S0 = new d(PointF.class, "topLeft");
    private static final Property<View, PointF> T0 = new e(PointF.class, "position");
    private static final C3266i U0 = new C3266i();
    private boolean N0 = false;

    /* renamed from: ax.v2.b$a */
    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: ax.v2.b$b, reason: collision with other inner class name */
    class C0476b extends Property<i, PointF> {
        C0476b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: ax.v2.b$c */
    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C3252A.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: ax.v2.b$d */
    class d extends Property<View, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C3252A.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: ax.v2.b$e */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C3252A.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: ax.v2.b$f */
    class f extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        private final i mViewBounds;

        f(i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: ax.v2.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC3268k.f {
        private final View a;
        private final Rect b;
        private final boolean c;
        private final Rect d;
        private final boolean e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private boolean n;

        g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a = view;
            this.b = rect;
            this.c = z;
            this.d = rect2;
            this.e = z2;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.l = i7;
            this.m = i8;
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void b(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.a(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void c(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.b(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
            this.a.setTag(C3265h.b, this.a.getClipBounds());
            this.a.setClipBounds(this.e ? null : this.d);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
            this.n = true;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
            View view = this.a;
            int i = C3265h.b;
            Rect rect = (Rect) view.getTag(i);
            this.a.setTag(i, null);
            this.a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.n) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.c) {
                    rect = this.b;
                }
            } else if (!this.e) {
                rect = this.d;
            }
            this.a.setClipBounds(rect);
            if (z) {
                C3252A.d(this.a, this.f, this.g, this.h, this.i);
            } else {
                C3252A.d(this.a, this.j, this.k, this.l, this.m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int max = Math.max(this.h - this.f, this.l - this.j);
            int max2 = Math.max(this.i - this.g, this.m - this.k);
            int i = z ? this.j : this.f;
            int i2 = z ? this.k : this.g;
            C3252A.d(this.a, i, i2, max + i, max2 + i2);
            this.a.setClipBounds(z ? this.d : this.b);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
        }
    }

    /* renamed from: ax.v2.b$h */
    private static class h extends s {
        boolean a = false;
        final ViewGroup b;

        h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            if (!this.a) {
                z.b(this.b, false);
            }
            abstractC3268k.Z(this);
        }

        @Override // ax.v2.s, ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
            z.b(this.b, false);
        }

        @Override // ax.v2.s, ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
            z.b(this.b, false);
            this.a = true;
        }

        @Override // ax.v2.s, ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
            z.b(this.b, true);
        }
    }

    /* renamed from: ax.v2.b$i */
    private static class i {
        private int a;
        private int b;
        private int c;
        private int d;
        private final View e;
        private int f;
        private int g;

        i(View view) {
            this.e = view;
        }

        private void b() {
            C3252A.d(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    private void m0(x xVar) {
        View view = xVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.a.put("android:changeBounds:parent", xVar.b.getParent());
        if (this.N0) {
            xVar.a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // ax.v2.AbstractC3268k
    public String[] K() {
        return O0;
    }

    @Override // ax.v2.AbstractC3268k
    public void i(x xVar) {
        m0(xVar);
    }

    @Override // ax.v2.AbstractC3268k
    public void l(x xVar) {
        Rect rect;
        m0(xVar);
        if (!this.N0 || (rect = (Rect) xVar.b.getTag(C3265h.b)) == null) {
            return;
        }
        xVar.a.put("android:changeBounds:clip", rect);
    }

    @Override // ax.v2.AbstractC3268k
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        int i2;
        int i3;
        int i4;
        int i5;
        ObjectAnimator a2;
        int i6;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.a;
        Map<String, Object> map2 = xVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xVar2.b;
        Rect rect2 = (Rect) xVar.a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.a.get("android:changeBounds:bounds");
        int i7 = rect2.left;
        int i8 = rect3.left;
        int i9 = rect2.top;
        int i10 = rect3.top;
        int i11 = rect2.right;
        int i12 = rect3.right;
        int i13 = rect2.bottom;
        int i14 = rect3.bottom;
        int i15 = i11 - i7;
        int i16 = i13 - i9;
        int i17 = i12 - i8;
        int i18 = i14 - i10;
        Rect rect4 = (Rect) xVar.a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.a.get("android:changeBounds:clip");
        if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
            i2 = 0;
        } else {
            i2 = (i7 == i8 && i9 == i10) ? 0 : 1;
            if (i11 != i12 || i13 != i14) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.N0) {
            C3252A.d(view, i7, i9, Math.max(i15, i17) + i7, i9 + Math.max(i16, i18));
            if (i7 == i8 && i9 == i10) {
                a2 = null;
                i3 = i13;
                i4 = i14;
                i5 = i8;
            } else {
                i3 = i13;
                i4 = i14;
                i5 = i8;
                a2 = C3263f.a(view, T0, B().a(i7, i9, i8, i10));
            }
            boolean z = rect4 == null;
            if (z) {
                i6 = 0;
                rect = new Rect(0, 0, i15, i16);
            } else {
                i6 = 0;
                rect = rect4;
            }
            boolean z2 = rect5 == null;
            Rect rect6 = z2 ? new Rect(i6, i6, i17, i18) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect);
                C3266i c3266i = U0;
                Object[] objArr = new Object[2];
                objArr[i6] = rect;
                objArr[1] = rect6;
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", c3266i, objArr);
                g gVar = new g(view, rect, z, rect6, z2, i7, i9, i11, i3, i5, i10, i12, i4);
                objectAnimator.addListener(gVar);
                b(gVar);
            }
            c2 = w.c(a2, objectAnimator);
        } else {
            C3252A.d(view, i7, i9, i11, i13);
            if (i2 != 2) {
                c2 = (i7 == i8 && i9 == i10) ? C3263f.a(view, R0, B().a(i11, i13, i12, i14)) : C3263f.a(view, S0, B().a(i7, i9, i8, i10));
            } else if (i15 == i17 && i16 == i18) {
                c2 = C3263f.a(view, T0, B().a(i7, i9, i8, i10));
            } else {
                i iVar = new i(view);
                ObjectAnimator a3 = C3263f.a(iVar, P0, B().a(i7, i9, i8, i10));
                ObjectAnimator a4 = C3263f.a(iVar, Q0, B().a(i11, i13, i12, i14));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new f(iVar));
                c2 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            z.b(viewGroup4, true);
            D().b(new h(viewGroup4));
        }
        return c2;
    }
}
