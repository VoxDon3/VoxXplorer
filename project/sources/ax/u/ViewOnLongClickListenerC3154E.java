package ax.u;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import ax.c0.C1760d0;
import ax.c0.C1768h0;

/* renamed from: ax.u.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC3154E implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static ViewOnLongClickListenerC3154E k;
    private static ViewOnLongClickListenerC3154E l;
    private final View a;
    private final CharSequence b;
    private final int c;
    private final Runnable d = new Runnable() { // from class: ax.u.C
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC3154E.this.h(false);
        }
    };
    private final Runnable e = new Runnable() { // from class: ax.u.D
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC3154E.this.d();
        }
    };
    private int f;
    private int g;
    private C3155F h;
    private boolean i;
    private boolean j;

    private ViewOnLongClickListenerC3154E(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.c = C1768h0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.a.removeCallbacks(this.d);
    }

    private void c() {
        this.j = true;
    }

    private void e() {
        this.a.postDelayed(this.d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(ViewOnLongClickListenerC3154E viewOnLongClickListenerC3154E) {
        ViewOnLongClickListenerC3154E viewOnLongClickListenerC3154E2 = k;
        if (viewOnLongClickListenerC3154E2 != null) {
            viewOnLongClickListenerC3154E2.b();
        }
        k = viewOnLongClickListenerC3154E;
        if (viewOnLongClickListenerC3154E != null) {
            viewOnLongClickListenerC3154E.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC3154E viewOnLongClickListenerC3154E = k;
        if (viewOnLongClickListenerC3154E != null && viewOnLongClickListenerC3154E.a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC3154E(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC3154E viewOnLongClickListenerC3154E2 = l;
        if (viewOnLongClickListenerC3154E2 != null && viewOnLongClickListenerC3154E2.a == view) {
            viewOnLongClickListenerC3154E2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.j && Math.abs(x - this.f) <= this.c && Math.abs(y - this.g) <= this.c) {
            return false;
        }
        this.f = x;
        this.g = y;
        this.j = false;
        return true;
    }

    void d() {
        if (l == this) {
            l = null;
            C3155F c3155f = this.h;
            if (c3155f != null) {
                c3155f.c();
                this.h = null;
                c();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            f(null);
        }
        this.a.removeCallbacks(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (this.a.isAttachedToWindow()) {
            f(null);
            ViewOnLongClickListenerC3154E viewOnLongClickListenerC3154E = l;
            if (viewOnLongClickListenerC3154E != null) {
                viewOnLongClickListenerC3154E.d();
            }
            l = this;
            this.i = z;
            C3155F c3155f = new C3155F(this.a.getContext());
            this.h = c3155f;
            c3155f.e(this.a, this.f, this.g, this.i, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                if ((C1760d0.L(this.a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h != null && this.i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.a.isEnabled() && this.h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
