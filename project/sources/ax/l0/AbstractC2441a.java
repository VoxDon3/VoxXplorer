package ax.l0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import ax.B.l;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.d0.K;
import ax.d0.L;
import ax.l0.b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2441a extends C1753a {
    private static final Rect n = new Rect(SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<H> o = new C0357a();
    private static final b.InterfaceC0358b<l<H>, H> p = new b();
    private final AccessibilityManager h;
    private final View i;
    private c j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* renamed from: ax.l0.a$a, reason: collision with other inner class name */
    class C0357a implements b.a<H> {
        C0357a() {
        }

        @Override // ax.l0.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(H h, Rect rect) {
            h.m(rect);
        }
    }

    /* renamed from: ax.l0.a$b */
    class b implements b.InterfaceC0358b<l<H>, H> {
        b() {
        }

        @Override // ax.l0.b.InterfaceC0358b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public H a(l<H> lVar, int i) {
            return lVar.n(i);
        }

        @Override // ax.l0.b.InterfaceC0358b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(l<H> lVar) {
            return lVar.m();
        }
    }

    /* renamed from: ax.l0.a$c */
    private class c extends K {
        c() {
        }

        @Override // ax.d0.K
        public H b(int i) {
            return H.b0(AbstractC2441a.this.H(i));
        }

        @Override // ax.d0.K
        public H d(int i) {
            int i2 = i == 2 ? AbstractC2441a.this.k : AbstractC2441a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // ax.d0.K
        public boolean f(int i, int i2, Bundle bundle) {
            return AbstractC2441a.this.P(i, i2, bundle);
        }
    }

    public AbstractC2441a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C1760d0.z(view) == 0) {
            C1760d0.s0(view, 1);
        }
    }

    private static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i, Rect rect) {
        H h;
        l<H> y = y();
        int i2 = this.l;
        H f = i2 == Integer.MIN_VALUE ? null : y.f(i2);
        if (i == 1 || i == 2) {
            h = (H) ax.l0.b.d(y, p, o, f, i, C1760d0.B(this.i) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.l;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            h = (H) ax.l0.b.c(y, p, o, f, rect2, i);
        }
        return T(h != null ? y.j(y.i(h)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    private boolean R(int i, Bundle bundle) {
        return C1760d0.a0(this.i, i, bundle);
    }

    private boolean S(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        U(i, 32768);
        return true;
    }

    private void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, 128);
        U(i2, 256);
    }

    private boolean n(int i) {
        if (this.k != i) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        U(i, 65536);
        return true;
    }

    private boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    private AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    private AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        H H = H(i);
        obtain.getText().add(H.B());
        obtain.setContentDescription(H.t());
        obtain.setScrollable(H.U());
        obtain.setPassword(H.T());
        obtain.setEnabled(H.N());
        obtain.setChecked(H.K());
        L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.q());
        L.c(obtain, this.i, i);
        obtain.setPackageName(this.i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private H t(int i) {
        H Z = H.Z();
        Z.s0(true);
        Z.u0(true);
        Z.m0("android.view.View");
        Rect rect = n;
        Z.i0(rect);
        Z.j0(rect);
        Z.C0(this.i);
        N(i, Z);
        if (Z.B() == null && Z.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Z.m(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int k = Z.k();
        if ((k & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((k & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        Z.A0(this.i.getContext().getPackageName());
        Z.K0(this.i, i);
        if (this.k == i) {
            Z.g0(true);
            Z.a(128);
        } else {
            Z.g0(false);
            Z.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            Z.a(2);
        } else if (Z.O()) {
            Z.a(1);
        }
        Z.v0(z);
        this.i.getLocationOnScreen(this.g);
        Z.n(this.d);
        if (this.d.equals(rect)) {
            Z.m(this.d);
            if (Z.b != -1) {
                H Z2 = H.Z();
                for (int i2 = Z.b; i2 != -1; i2 = Z2.b) {
                    Z2.D0(this.i, -1);
                    Z2.i0(n);
                    N(i2, Z2);
                    Z2.m(this.e);
                    Rect rect2 = this.d;
                    Rect rect3 = this.e;
                    rect2.offset(rect3.left, rect3.top);
                }
                Z2.d0();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                Z.j0(this.d);
                if (E(this.d)) {
                    Z.O0(true);
                }
            }
        }
        return Z;
    }

    private H u() {
        H a0 = H.a0(this.i);
        C1760d0.Y(this.i, a0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (a0.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a0.d(this.i, ((Integer) arrayList.get(i)).intValue());
        }
        return a0;
    }

    private l<H> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        l<H> lVar = new l<>();
        for (int i = 0; i < arrayList.size(); i++) {
            lVar.k(arrayList.get(i).intValue(), t(arrayList.get(i).intValue()));
        }
        return lVar;
    }

    private void z(int i, Rect rect) {
        H(i).m(rect);
    }

    public final int A() {
        return this.l;
    }

    protected abstract int B(float f, float f2);

    protected abstract void C(List<Integer> list);

    H H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    protected abstract boolean J(int i, int i2, Bundle bundle);

    protected abstract void M(H h);

    protected abstract void N(int i, H h);

    protected abstract void O(int i, boolean z);

    boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean T(int i) {
        int i2;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        O(i, true);
        U(i, 8);
        return true;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    @Override // ax.c0.C1753a
    public K b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // ax.c0.C1753a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // ax.c0.C1753a
    public void g(View view, H h) {
        super.g(view, h);
        M(h);
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && G(F, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i, AccessibilityEvent accessibilityEvent) {
    }
}
