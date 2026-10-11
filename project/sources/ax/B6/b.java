package ax.B6;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.O6.h;
import ax.k6.C2402c;
import ax.k6.l;
import ax.k6.m;
import ax.m.C2506a;
import ax.s.C3036c;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class b extends a.C0006a {
    private static final int e = C2506a.n;
    private static final int f = l.a;
    private static final int g = C2402c.r;
    private Drawable c;
    private final Rect d;

    public b(Context context, int i) {
        super(q(context), s(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = e;
        int i3 = f;
        this.d = c.a(context2, i2, i3);
        int c = C3555a.c(context2, C2402c.i, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, m.e2, i2, i3);
        int color = obtainStyledAttributes.getColor(m.j2, c);
        obtainStyledAttributes.recycle();
        h hVar = new h(context2, null, i2, i3);
        hVar.U(context2);
        hVar.g0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                hVar.c0(dimension);
            }
        }
        this.c = hVar;
    }

    private static Context q(Context context) {
        int r = r(context);
        Context d = ax.V6.a.d(context, null, e, f);
        return r == 0 ? d : new C3036c(d, r);
    }

    private static int r(Context context) {
        TypedValue a = ax.K6.b.a(context, g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    private static int s(Context context, int i) {
        return i == 0 ? r(context) : i;
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.h(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b i(int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.i(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b j(DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.j(onCancelListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public b k(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.k(onKeyListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b m(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return (b) super.m(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b n(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.n(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public b o(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        return (b) super.o(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b p(int i) {
        return (b) super.p(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b setView(View view) {
        return (b) super.setView(view);
    }

    @Override // androidx.appcompat.app.a.C0006a
    public androidx.appcompat.app.a create() {
        androidx.appcompat.app.a create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof h) {
            ((h) drawable).f0(decorView.getElevation());
        }
        window.setBackgroundDrawable(c.b(this.c, this.d));
        decorView.setOnTouchListener(new a(create, this.d));
        return create;
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.a(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public b b(boolean z) {
        return (b) super.b(z);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public b c(View view) {
        return (b) super.c(view);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public b d(Drawable drawable) {
        return (b) super.d(drawable);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public b e(int i) {
        return (b) super.e(i);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b f(CharSequence charSequence) {
        return (b) super.f(charSequence);
    }

    @Override // androidx.appcompat.app.a.C0006a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.g(charSequenceArr, zArr, onMultiChoiceClickListener);
    }
}
