/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import ax.c0.O;
import ax.c0.Q;
import ax.c0.S;
import ax.c0.T;
import ax.c0.U;
import ax.c0.V;
import ax.c0.W;
import ax.c0.X;
import java.util.concurrent.atomic.AtomicBoolean;

public final class P {
    private final c a;

    public P(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
            return;
        }
        this.a = new a(view);
    }

    @Deprecated
    P(WindowInsetsController windowInsetsController) {
        this.a = new b(windowInsetsController);
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }

    private static class a
    extends c {
        private final View a;

        a(View view) {
            this.a = view;
        }

        public static /* synthetic */ void c(View view) {
            ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override
        void a() {
            View view = this.a;
            if (view != null) {
                ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
        }

        @Override
        void b() {
            View view = this.a;
            if (view != null) {
                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                    view = view.getRootView().findFocus();
                } else {
                    view.requestFocus();
                }
                View view2 = view;
                if (view == null) {
                    view2 = this.a.getRootView().findViewById(0x1020002);
                }
                if (view2 != null && view2.hasWindowFocus()) {
                    view2.post((Runnable)new O(view2));
                }
            }
        }
    }

    private static class b
    extends a {
        private View b;
        private WindowInsetsController c;

        b(View view) {
            super(view);
            this.b = view;
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }

        public static /* synthetic */ void d(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int n8) {
            boolean bl = (n8 & 8) != 0;
            atomicBoolean.set(bl);
        }

        @Override
        void a() {
            Object object = this.c;
            if (object == null) {
                object = this.b;
                object = object != null ? Q.a((View)object) : null;
            }
            if (object != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                X x8 = new X(atomicBoolean);
                U.a(object, x8);
                if (!atomicBoolean.get() && (atomicBoolean = this.b) != null) {
                    ((InputMethodManager)atomicBoolean.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
                }
                V.a(object, x8);
                W.a(object, S.a());
                return;
            }
            super.a();
        }

        @Override
        void b() {
            Object object = this.b;
            if (object != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager)object.getContext().getSystemService("input_method")).isActive();
            }
            if ((object = this.c) == null) {
                object = this.b;
                object = object != null ? Q.a(object) : null;
            }
            if (object != null) {
                T.a((WindowInsetsController)object, S.a());
            }
            super.b();
        }
    }

    private static class c {
        c() {
        }

        void a() {
            throw null;
        }

        void b() {
            throw null;
        }
    }
}

