package ax.c0;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class P {
    private final c a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {
        private final View a;

        a(View view) {
            this.a = view;
        }

        @Override // ax.c0.P.c
        void a() {
            View view = this.a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
        }

        @Override // ax.c0.P.c
        void b() {
            final View view = this.a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: ax.c0.O
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
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

    public P(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {
        private View b;
        private WindowInsetsController c;

        b(View view) {
            super(view);
            this.b = view;
        }

        @Override // ax.c0.P.a, ax.c0.P.c
        void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: ax.c0.X
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((r2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // ax.c0.P.a, ax.c0.P.c
        void b() {
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }
    }

    @Deprecated
    P(WindowInsetsController windowInsetsController) {
        this.a = new b(windowInsetsController);
    }
}
