/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import ax.C6.f;
import ax.F6.y;
import ax.Q.b;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.d0;
import ax.c0.e1;

public class z {
    public static /* synthetic */ void a(View view, boolean bl) {
        z.l(view, bl);
    }

    public static void b(View view, c c8) {
        d0.v0(view, new I(){
            final c a;
            final d b;
            {
                this.a = c8;
                this.b = d8;
            }

            @Override
            public F0 a(View view, F0 f02) {
                return this.a.a(view, f02, new d(this.b));
            }
        });
        z.j(view);
    }

    public static float c(Context context, int n8) {
        context = context.getResources();
        return TypedValue.applyDimension((int)1, (float)n8, (DisplayMetrics)context.getDisplayMetrics());
    }

    public static Integer d(View view) {
        if ((view = f.f(view.getBackground())) != null) {
            return view.getDefaultColor();
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return b.f(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        view = view.getParent();
        float f8 = 0.0f;
        while (view instanceof View) {
            f8 += view.getElevation();
            view = view.getParent();
        }
        return f8;
    }

    public static void g(View view, boolean bl) {
        e1 e12;
        if (bl && (e12 = d0.K(view)) != null) {
            e12.a(F0.m.c());
            return;
        }
        e12 = z.e(view);
        if (e12 != null) {
            e12.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean h(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode i(int n8, PorterDuff.Mode mode) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 9) {
                    switch (n8) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void j(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(){

            public void onViewAttachedToWindow(View view) {
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                view.requestApplyInsets();
            }

            public void onViewDetachedFromWindow(View view) {
            }
        });
    }

    public static void k(View view, boolean bl) {
        view.requestFocus();
        view.post((Runnable)new y(view, bl));
    }

    public static void l(View view, boolean bl) {
        e1 e12;
        if (bl && (e12 = d0.K(view)) != null) {
            e12.e(F0.m.c());
            return;
        }
        z.e(view).showSoftInput(view, 1);
    }

    public static interface c {
        public F0 a(View var1, F0 var2, d var3);
    }

    public static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        public d(int n8, int n9, int n10, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
        }

        public d(d d8) {
            this.a = d8.a;
            this.b = d8.b;
            this.c = d8.c;
            this.d = d8.d;
        }
    }
}

