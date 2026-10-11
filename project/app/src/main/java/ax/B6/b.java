/*
 * Decompiled with CFR 0.152.
 */
package ax.B6;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.B6.a;
import ax.B6.c;
import ax.O6.h;
import ax.k6.l;
import ax.k6.m;

public class b
extends a.a {
    private static final int e = ax.m.a.n;
    private static final int f = l.a;
    private static final int g = ax.k6.c.r;
    private Drawable c;
    private final Rect d;

    public b(Context context, int n8) {
        super(b.q(context), b.s(context, n8));
        Context context2 = this.getContext();
        context = context2.getTheme();
        int n9 = e;
        n8 = f;
        this.d = ax.B6.c.a(context2, n9, n8);
        int n10 = ax.z6.a.c(context2, ax.k6.c.i, this.getClass().getCanonicalName());
        Object object = context2.obtainStyledAttributes(null, m.e2, n9, n8);
        n10 = object.getColor(m.j2, n10);
        object.recycle();
        object = new h(context2, null, n9, n8);
        ((h)object).U(context2);
        ((h)object).g0(ColorStateList.valueOf((int)n10));
        if (Build.VERSION.SDK_INT >= 28) {
            context2 = new TypedValue();
            context.resolveAttribute(16844145, (TypedValue)context2, true);
            float f8 = context2.getDimension(this.getContext().getResources().getDisplayMetrics());
            if (context2.type == 5 && f8 >= 0.0f) {
                ((h)object).c0(f8);
            }
        }
        this.c = object;
    }

    private static Context q(Context context) {
        int n8 = b.r(context);
        context = ax.V6.a.d(context, null, e, f);
        if (n8 == 0) {
            return context;
        }
        return new ax.s.c(context, n8);
    }

    private static int r(Context context) {
        if ((context = ax.K6.b.a(context, g)) == null) {
            return 0;
        }
        return context.data;
    }

    private static int s(Context context, int n8) {
        if (n8 == 0) {
            return b.r(context);
        }
        return n8;
    }

    public b A(int n8, DialogInterface.OnClickListener onClickListener) {
        return (b)super.setNegativeButton(n8, onClickListener);
    }

    public b B(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b)super.h(charSequence, onClickListener);
    }

    public b C(int n8, DialogInterface.OnClickListener onClickListener) {
        return (b)super.i(n8, onClickListener);
    }

    public b D(DialogInterface.OnCancelListener onCancelListener) {
        return (b)super.j(onCancelListener);
    }

    public b E(DialogInterface.OnKeyListener onKeyListener) {
        return (b)super.k(onKeyListener);
    }

    public b F(int n8, DialogInterface.OnClickListener onClickListener) {
        return (b)super.setPositiveButton(n8, onClickListener);
    }

    public b G(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b)super.l(charSequence, onClickListener);
    }

    public b H(int n8, int n9, DialogInterface.OnClickListener onClickListener) {
        return (b)super.m(n8, n9, onClickListener);
    }

    public b I(ListAdapter listAdapter, int n8, DialogInterface.OnClickListener onClickListener) {
        return (b)super.n(listAdapter, n8, onClickListener);
    }

    public b J(CharSequence[] charSequenceArray, int n8, DialogInterface.OnClickListener onClickListener) {
        return (b)super.o(charSequenceArray, n8, onClickListener);
    }

    public b K(int n8) {
        return (b)super.p(n8);
    }

    public b L(CharSequence charSequence) {
        return (b)super.setTitle(charSequence);
    }

    public b M(View view) {
        return (b)super.setView(view);
    }

    @Override
    public androidx.appcompat.app.a create() {
        androidx.appcompat.app.a a8 = super.create();
        Window window = a8.getWindow();
        View view = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof h) {
            ((h)drawable).f0(view.getElevation());
        }
        window.setBackgroundDrawable((Drawable)ax.B6.c.b(this.c, this.d));
        view.setOnTouchListener((View.OnTouchListener)new a(a8, this.d));
        return a8;
    }

    public b t(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b)super.a(listAdapter, onClickListener);
    }

    public b u(boolean bl) {
        return (b)super.b(bl);
    }

    public b v(View view) {
        return (b)super.c(view);
    }

    public b w(Drawable drawable) {
        return (b)super.d(drawable);
    }

    public b x(int n8) {
        return (b)super.e(n8);
    }

    public b y(CharSequence charSequence) {
        return (b)super.f(charSequence);
    }

    public b z(CharSequence[] charSequenceArray, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b)super.g(charSequenceArray, blArray, onMultiChoiceClickListener);
    }
}

