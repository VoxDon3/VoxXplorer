/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import ax.c0.d0;
import ax.c0.h0;
import ax.u.C;
import ax.u.D;
import ax.u.F;

class E
implements View.OnLongClickListener,
View.OnHoverListener,
View.OnAttachStateChangeListener {
    private static E k;
    private static E l;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new C(this);
    private final Runnable e = new D(this);
    private int f;
    private int g;
    private F h;
    private boolean i;
    private boolean j;

    private E(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = h0.g(ViewConfiguration.get((Context)view.getContext()));
        this.c();
        view.setOnLongClickListener((View.OnLongClickListener)this);
        view.setOnHoverListener((View.OnHoverListener)this);
    }

    public static /* synthetic */ void a(E e8) {
        e8.h(false);
    }

    private void b() {
        this.a.removeCallbacks(this.d);
    }

    private void c() {
        this.j = true;
    }

    private void e() {
        this.a.postDelayed(this.d, (long)ViewConfiguration.getLongPressTimeout());
    }

    private static void f(E e8) {
        E e9 = k;
        if (e9 != null) {
            e9.b();
        }
        k = e8;
        if (e8 != null) {
            e8.e();
        }
    }

    public static void g(View view, CharSequence object) {
        E e8 = k;
        if (e8 != null && e8.a == view) {
            E.f(null);
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            object = l;
            if (object != null && ((E)object).a == view) {
                ((E)object).d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new E(view, (CharSequence)object);
    }

    private boolean i(MotionEvent motionEvent) {
        int n8 = (int)motionEvent.getX();
        int n9 = (int)motionEvent.getY();
        if (!this.j && Math.abs(n8 - this.f) <= this.c && Math.abs(n9 - this.g) <= this.c) {
            return false;
        }
        this.f = n8;
        this.g = n9;
        this.j = false;
        return true;
    }

    void d() {
        if (l == this) {
            l = null;
            F f8 = this.h;
            if (f8 != null) {
                f8.c();
                this.h = null;
                this.c();
                this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            } else {
                Log.e((String)"TooltipCompatHandler", (String)"sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            E.f(null);
        }
        this.a.removeCallbacks(this.e);
    }

    /*
     * Enabled aggressive block sorting
     */
    void h(boolean bl) {
        long l8;
        if (!this.a.isAttachedToWindow()) {
            return;
        }
        E.f(null);
        Object object = l;
        if (object != null) {
            ((E)object).d();
        }
        l = this;
        this.i = bl;
        this.h = object = new F(this.a.getContext());
        ((F)object).e(this.a, this.f, this.g, this.i, this.b);
        this.a.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        if (this.i) {
            l8 = 2500L;
        } else {
            long l9;
            if ((d0.L(this.a) & 1) == 1) {
                l8 = ViewConfiguration.getLongPressTimeout();
                l9 = 3000L;
            } else {
                l8 = ViewConfiguration.getLongPressTimeout();
                l9 = 15000L;
            }
            l8 = l9 - l8;
        }
        this.a.removeCallbacks(this.e);
        this.a.postDelayed(this.e, l8);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.i) {
            return false;
        }
        view = (AccessibilityManager)this.a.getContext().getSystemService("accessibility");
        if (view.isEnabled() && view.isTouchExplorationEnabled()) {
            return false;
        }
        int n8 = motionEvent.getAction();
        if (n8 != 7) {
            if (n8 == 10) {
                this.c();
                this.d();
            }
        } else if (this.a.isEnabled() && this.h == null && this.i(motionEvent)) {
            E.f(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        this.h(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.d();
    }
}

