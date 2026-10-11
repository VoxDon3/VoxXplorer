/*
 * Decompiled with CFR 0.152.
 */
package ax.l0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import ax.B.l;
import ax.c0.d0;
import ax.d0.H;
import ax.d0.K;
import ax.d0.L;
import ax.l0.b;
import java.util.ArrayList;
import java.util.List;

public abstract class a
extends ax.c0.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<H> o = new b.a<H>(){

        public void b(H h8, Rect rect) {
            h8.m(rect);
        }
    };
    private static final b.b<l<H>, H> p = new b.b<l<H>, H>(){

        public H c(l<H> l8, int n8) {
            return l8.n(n8);
        }

        public int d(l<H> l8) {
            return l8.m();
        }
    };
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    private final AccessibilityManager h;
    private final View i;
    private c j;
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager)view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (d0.z(view) == 0) {
                d0.s0(view, 1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int n8, Rect rect) {
        int n9 = view.getWidth();
        int n10 = view.getHeight();
        if (n8 != 17) {
            if (n8 != 33) {
                if (n8 != 66) {
                    if (n8 == 130) {
                        rect.set(0, -1, n9, -1);
                        return rect;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect.set(-1, 0, -1, n10);
                return rect;
            }
            rect.set(0, n10, n9, n10);
            return rect;
        }
        rect.set(n9, 0, n9, n10);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect != null && !rect.isEmpty()) {
            if (this.i.getWindowVisibility() != 0) {
                return false;
            }
            rect = this.i.getParent();
            while (rect instanceof View) {
                if (!((rect = (View)rect).getAlpha() <= 0.0f) && rect.getVisibility() == 0) {
                    rect = rect.getParent();
                    continue;
                }
                return false;
            }
            if (rect != null) {
                return true;
            }
        }
        return false;
    }

    private static int F(int n8) {
        if (n8 != 19) {
            if (n8 != 21) {
                if (n8 != 22) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean G(int n8, Rect object) {
        l<H> l8 = this.y();
        int n9 = this.l;
        int n10 = Integer.MIN_VALUE;
        H h8 = n9 == Integer.MIN_VALUE ? null : l8.f(n9);
        if (n8 != 1 && n8 != 2) {
            if (n8 != 17 && n8 != 33 && n8 != 66 && n8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect = new Rect();
            n9 = this.l;
            if (n9 != Integer.MIN_VALUE) {
                this.z(n9, rect);
            } else if (object != null) {
                rect.set(object);
            } else {
                a.D(this.i, n8, rect);
            }
            object = b.c(l8, p, o, h8, rect, n8);
        } else {
            boolean bl = d0.B(this.i) == 1;
            object = b.d(l8, p, o, h8, n8, bl, false);
        }
        n8 = object == null ? n10 : l8.j(l8.i((H)object));
        return this.T(n8);
    }

    private boolean Q(int n8, int n9, Bundle bundle) {
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 64) {
                    if (n9 != 128) {
                        return this.J(n8, n9, bundle);
                    }
                    return this.n(n8);
                }
                return this.S(n8);
            }
            return this.o(n8);
        }
        return this.T(n8);
    }

    private boolean R(int n8, Bundle bundle) {
        return d0.a0(this.i, n8, bundle);
    }

    private boolean S(int n8) {
        int n9;
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled() && (n9 = this.k) != n8) {
            if (n9 != Integer.MIN_VALUE) {
                this.n(n9);
            }
            this.k = n8;
            this.i.invalidate();
            this.U(n8, 32768);
            return true;
        }
        return false;
    }

    private void V(int n8) {
        int n9 = this.m;
        if (n9 == n8) {
            return;
        }
        this.m = n8;
        this.U(n8, 128);
        this.U(n9, 256);
    }

    private boolean n(int n8) {
        if (this.k == n8) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            this.U(n8, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int n8 = this.l;
        return n8 != Integer.MIN_VALUE && this.J(n8, 16, null);
    }

    private AccessibilityEvent q(int n8, int n9) {
        if (n8 != -1) {
            return this.r(n8, n9);
        }
        return this.s(n9);
    }

    private AccessibilityEvent r(int n8, int n9) {
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n9);
        H h8 = this.H(n8);
        accessibilityEvent.getText().add(h8.B());
        accessibilityEvent.setContentDescription(h8.t());
        accessibilityEvent.setScrollable(h8.U());
        accessibilityEvent.setPassword(h8.T());
        accessibilityEvent.setEnabled(h8.N());
        accessibilityEvent.setChecked(h8.K());
        this.L(n8, accessibilityEvent);
        if (accessibilityEvent.getText().isEmpty() && accessibilityEvent.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEvent.setClassName(h8.q());
        L.c((AccessibilityRecord)accessibilityEvent, this.i, n8);
        accessibilityEvent.setPackageName((CharSequence)this.i.getContext().getPackageName());
        return accessibilityEvent;
    }

    private AccessibilityEvent s(int n8) {
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n8);
        this.i.onInitializeAccessibilityEvent(accessibilityEvent);
        return accessibilityEvent;
    }

    private H t(int n8) {
        H h8 = H.Z();
        h8.s0(true);
        h8.u0(true);
        h8.m0("android.view.View");
        Rect rect = n;
        h8.i0(rect);
        h8.j0(rect);
        h8.C0(this.i);
        this.N(n8, h8);
        if (h8.B() == null && h8.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        h8.m(this.e);
        if (!this.e.equals((Object)rect)) {
            int n9 = h8.k();
            if ((n9 & 0x40) == 0) {
                if ((n9 & 0x80) == 0) {
                    h8.A0(this.i.getContext().getPackageName());
                    h8.K0(this.i, n8);
                    if (this.k == n8) {
                        h8.g0(true);
                        h8.a(128);
                    } else {
                        h8.g0(false);
                        h8.a(64);
                    }
                    boolean bl = this.l == n8;
                    if (bl) {
                        h8.a(2);
                    } else if (h8.O()) {
                        h8.a(1);
                    }
                    h8.v0(bl);
                    this.i.getLocationOnScreen(this.g);
                    h8.n(this.d);
                    if (this.d.equals((Object)rect)) {
                        h8.m(this.d);
                        if (h8.b != -1) {
                            H h9 = H.Z();
                            n8 = h8.b;
                            while (n8 != -1) {
                                h9.D0(this.i, -1);
                                h9.i0(n);
                                this.N(n8, h9);
                                h9.m(this.e);
                                Rect rect2 = this.d;
                                rect = this.e;
                                rect2.offset(rect.left, rect.top);
                                n8 = h9.b;
                            }
                            h9.d0();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            h8.j0(this.d);
                            if (this.E(this.d)) {
                                h8.O0(true);
                            }
                        }
                    }
                    return h8;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private H u() {
        H h8 = H.a0(this.i);
        d0.Y(this.i, h8);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        this.C(arrayList);
        if (h8.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            h8.d(this.i, arrayList.get(i8));
        }
        return h8;
    }

    private l<H> y() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        this.C(arrayList);
        l<H> l8 = new l<H>();
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            H h8 = this.t((Integer)arrayList.get(i8));
            l8.k((Integer)arrayList.get(i8), h8);
        }
        return l8;
    }

    private void z(int n8, Rect rect) {
        this.H(n8).m(rect);
    }

    public final int A() {
        return this.l;
    }

    protected abstract int B(float var1, float var2);

    protected abstract void C(List<Integer> var1);

    H H(int n8) {
        if (n8 == -1) {
            return this.u();
        }
        return this.t(n8);
    }

    public final void I(boolean bl, int n8, Rect rect) {
        int n9 = this.l;
        if (n9 != Integer.MIN_VALUE) {
            this.o(n9);
        }
        if (bl) {
            this.G(n8, rect);
        }
    }

    protected abstract boolean J(int var1, int var2, Bundle var3);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int n8, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(H var1);

    protected abstract void N(int var1, H var2);

    protected abstract void O(int var1, boolean var2);

    boolean P(int n8, int n9, Bundle bundle) {
        if (n8 != -1) {
            return this.Q(n8, n9, bundle);
        }
        return this.R(n9, bundle);
    }

    public final boolean T(int n8) {
        if (!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        int n9 = this.l;
        if (n9 == n8) {
            return false;
        }
        if (n9 != Integer.MIN_VALUE) {
            this.o(n9);
        }
        if (n8 == Integer.MIN_VALUE) {
            return false;
        }
        this.l = n8;
        this.O(n8, true);
        this.U(n8, 8);
        return true;
    }

    public final boolean U(int n8, int n9) {
        if (n8 != Integer.MIN_VALUE && this.h.isEnabled()) {
            ViewParent viewParent = this.i.getParent();
            if (viewParent == null) {
                return false;
            }
            AccessibilityEvent accessibilityEvent = this.q(n8, n9);
            return viewParent.requestSendAccessibilityEvent(this.i, accessibilityEvent);
        }
        return false;
    }

    @Override
    public K b(View view) {
        if (this.j == null) {
            this.j = new c(this);
        }
        return this.j;
    }

    @Override
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        this.K(accessibilityEvent);
    }

    @Override
    public void g(View view, H h8) {
        super.g(view, h8);
        this.M(h8);
    }

    public final boolean o(int n8) {
        if (this.l != n8) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        this.O(n8, false);
        this.U(n8, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int n8 = motionEvent.getAction();
            if (n8 != 7 && n8 != 9) {
                if (n8 != 10) {
                    return false;
                }
                if (this.m != Integer.MIN_VALUE) {
                    this.V(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            n8 = this.B(motionEvent.getX(), motionEvent.getY());
            this.V(n8);
            if (n8 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean w(KeyEvent keyEvent) {
        int n8 = keyEvent.getAction();
        int n9 = 0;
        if (n8 == 1) return false;
        n8 = keyEvent.getKeyCode();
        if (n8 != 61) {
            if (n8 != 66) {
                switch (n8) {
                    default: {
                        return false;
                    }
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: {
                        if (!keyEvent.hasNoModifiers()) return false;
                        int n10 = a.F(n8);
                        n8 = keyEvent.getRepeatCount();
                        boolean bl = false;
                        while (n9 < n8 + 1) {
                            if (!this.G(n10, null)) return bl;
                            ++n9;
                            bl = true;
                        }
                        return bl;
                    }
                    case 23: 
                }
            }
            if (!keyEvent.hasNoModifiers()) return false;
            if (keyEvent.getRepeatCount() != 0) return false;
            this.p();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return this.G(2, null);
        }
        if (!keyEvent.hasModifiers(1)) return false;
        return this.G(1, null);
    }

    public final int x() {
        return this.k;
    }

    private class c
    extends K {
        final a b;

        c(a a8) {
            this.b = a8;
        }

        @Override
        public H b(int n8) {
            return H.b0(this.b.H(n8));
        }

        @Override
        public H d(int n8) {
            if ((n8 = n8 == 2 ? this.b.k : this.b.l) == Integer.MIN_VALUE) {
                return null;
            }
            return this.b(n8);
        }

        @Override
        public boolean f(int n8, int n9, Bundle bundle) {
            return this.b.P(n8, n9, bundle);
        }
    }
}

