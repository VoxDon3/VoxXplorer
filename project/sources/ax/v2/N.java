package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.AbstractC3268k;

/* loaded from: classes.dex */
public abstract class N extends AbstractC3268k {
    private static final String[] O0 = {"android:visibility:visibility", "android:visibility:parent"};
    private int N0 = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC3268k.f {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            i(true);
        }

        private void h() {
            if (!this.f) {
                C3252A.f(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            z.b(viewGroup, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            abstractC3268k.Z(this);
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
            i(false);
            if (this.f) {
                return;
            }
            C3252A.f(this.a, this.b);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
            i(true);
            if (this.f) {
                return;
            }
            C3252A.f(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                C3252A.f(this.a, 0);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC3268k.f {
        private final ViewGroup a;
        private final View b;
        private final View c;
        private boolean d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        private void h() {
            this.c.setTag(C3265h.a, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            abstractC3268k.Z(this);
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
        public void e(AbstractC3268k abstractC3268k) {
            if (this.d) {
                h();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.a.getOverlay().add(this.b);
            } else {
                N.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.c.setTag(C3265h.a, this.b);
                this.a.getOverlay().add(this.b);
                this.d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            h();
        }

        @Override // ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
        }
    }

    private static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    private void m0(x xVar) {
        xVar.a.put("android:visibility:visibility", Integer.valueOf(xVar.b.getVisibility()));
        xVar.a.put("android:visibility:parent", xVar.b.getParent());
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:visibility:screenLocation", iArr);
    }

    private c n0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (xVar == null || !xVar.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) xVar.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) xVar.a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) xVar2.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) xVar2.a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i != i2 || cVar.e != cVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (i2 == 0) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f == null) {
                        cVar.b = false;
                        cVar.a = true;
                        return cVar;
                    }
                    if (cVar.e == null) {
                        cVar.b = true;
                        cVar.a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (xVar == null && cVar.d == 0) {
                cVar.b = true;
                cVar.a = true;
                return cVar;
            }
            if (xVar2 == null && cVar.c == 0) {
                cVar.b = false;
                cVar.a = true;
            }
        }
        return cVar;
    }

    @Override // ax.v2.AbstractC3268k
    public String[] K() {
        return O0;
    }

    @Override // ax.v2.AbstractC3268k
    public boolean M(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.a.containsKey("android:visibility:visibility") != xVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c n0 = n0(xVar, xVar2);
        return n0.a && (n0.c == 0 || n0.d == 0);
    }

    @Override // ax.v2.AbstractC3268k
    public void i(x xVar) {
        m0(xVar);
    }

    @Override // ax.v2.AbstractC3268k
    public void l(x xVar) {
        m0(xVar);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    public Animator q0(ViewGroup viewGroup, x xVar, int i, x xVar2, int i2) {
        if ((this.N0 & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.b.getParent();
            if (n0(y(view, false), L(view, false)).a) {
                return null;
            }
        }
        return p0(viewGroup, xVar2.b, xVar, xVar2);
    }

    @Override // ax.v2.AbstractC3268k
    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        c n0 = n0(xVar, xVar2);
        if (!n0.a) {
            return null;
        }
        if (n0.e == null && n0.f == null) {
            return null;
        }
        return n0.b ? q0(viewGroup, xVar, n0.c, xVar2, n0.d) : s0(viewGroup, xVar, n0.c, xVar2, n0.d);
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r10.x0 != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator s0(android.view.ViewGroup r11, ax.v2.x r12, int r13, ax.v2.x r14, int r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.v2.N.s0(android.view.ViewGroup, ax.v2.x, int, ax.v2.x, int):android.animation.Animator");
    }

    public void t0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.N0 = i;
    }
}
