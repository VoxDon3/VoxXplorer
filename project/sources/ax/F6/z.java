package ax.F6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import ax.c0.C1760d0;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.e1;

/* loaded from: classes3.dex */
public class z {

    class a implements I {
        final /* synthetic */ c a;
        final /* synthetic */ d b;

        a(c cVar, d dVar) {
            this.a = cVar;
            this.b = dVar;
        }

        @Override // ax.c0.I
        public F0 a(View view, F0 f0) {
            return this.a.a(view, f0, new d(this.b));
        }
    }

    public interface c {
        F0 a(View view, F0 f0, d dVar);
    }

    public static void b(View view, c cVar) {
        C1760d0.v0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList f = ax.C6.f.f(view.getBackground());
        if (f != null) {
            return Integer.valueOf(f.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) ax.Q.b.f(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        return f;
    }

    public static void g(View view, boolean z) {
        e1 K;
        if (z && (K = C1760d0.K(view)) != null) {
            K.a(F0.m.c());
            return;
        }
        InputMethodManager e = e(view);
        if (e != null) {
            e.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean h(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: ax.F6.y
            @Override // java.lang.Runnable
            public final void run() {
                z.l(view, z);
            }
        });
    }

    public static void l(View view, boolean z) {
        e1 K;
        if (!z || (K = C1760d0.K(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            K.e(F0.m.c());
        }
    }

    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.d = dVar.d;
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
