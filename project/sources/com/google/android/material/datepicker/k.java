package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax.F6.z;
import ax.b0.C1442c;
import ax.c0.C1760d0;
import ax.c0.F0;
import ax.c0.I;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.C2405f;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.C2410k;
import ax.o.C2653a;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class k<S> extends androidx.fragment.app.e {
    static final Object X0 = "CONFIRM_BUTTON_TAG";
    static final Object Y0 = "CANCEL_BUTTON_TAG";
    static final Object Z0 = "TOGGLE_BUTTON_TAG";
    private com.google.android.material.datepicker.a A0;
    private ax.A6.f B0;
    private j<S> C0;
    private int D0;
    private CharSequence E0;
    private boolean F0;
    private int G0;
    private int H0;
    private CharSequence I0;
    private int J0;
    private CharSequence K0;
    private int L0;
    private CharSequence M0;
    private int N0;
    private CharSequence O0;
    private TextView P0;
    private TextView Q0;
    private CheckableImageButton R0;
    private ax.O6.h S0;
    private Button T0;
    private boolean U0;
    private CharSequence V0;
    private CharSequence W0;
    private final LinkedHashSet<ax.A6.j<? super S>> t0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> u0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> v0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> w0 = new LinkedHashSet<>();
    private int x0;
    private ax.A6.d<S> y0;
    private p<S> z0;

    class a implements I {
        final /* synthetic */ int a;
        final /* synthetic */ View b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;
        final /* synthetic */ int e;

        a(int i, View view, int i2, int i3, int i4) {
            this.a = i;
            this.b = view;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // ax.c0.I
        public F0 a(View view, F0 f0) {
            ax.T.b f = f0.f(F0.m.h());
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + f.b;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(this.c + f.a, this.d + f.b, this.e + f.c, view3.getPaddingBottom());
            return f0;
        }
    }

    class b extends ax.A6.k<S> {
        b() {
        }

        @Override // ax.A6.k
        public void a() {
            k.this.T0.setEnabled(false);
        }

        @Override // ax.A6.k
        public void b(S s) {
            k kVar = k.this;
            kVar.B3(kVar.o3());
            k.this.T0.setEnabled(k.this.l3().u());
        }
    }

    public static final class c<S> {
        final ax.A6.d<S> a;
        com.google.android.material.datepicker.a c;
        ax.A6.f d;
        int b = 0;
        int e = 0;
        CharSequence f = null;
        int g = 0;
        CharSequence h = null;
        int i = 0;
        CharSequence j = null;
        int k = 0;
        CharSequence l = null;
        int m = 0;
        CharSequence n = null;
        S o = null;
        int p = 0;

        private c(ax.A6.d<S> dVar) {
            this.a = dVar;
        }

        private m b() {
            if (!this.a.w().isEmpty()) {
                m B = m.B(this.a.w().iterator().next().longValue());
                if (d(B, this.c)) {
                    return B;
                }
            }
            m C = m.C();
            return d(C, this.c) ? C : this.c.o();
        }

        public static c<C1442c<Long, Long>> c() {
            return new c<>(new q());
        }

        private static boolean d(m mVar, com.google.android.material.datepicker.a aVar) {
            return mVar.compareTo(aVar.o()) >= 0 && mVar.compareTo(aVar.i()) <= 0;
        }

        public k<S> a() {
            if (this.c == null) {
                this.c = new a.b().a();
            }
            if (this.e == 0) {
                this.e = this.a.q();
            }
            S s = this.o;
            if (s != null) {
                this.a.n(s);
            }
            if (this.c.m() == null) {
                this.c.z(b());
            }
            return k.w3(this);
        }
    }

    private void A3() {
        int r3 = r3(p2());
        l e3 = j.e3(l3(), r3, this.A0, this.B0);
        this.C0 = e3;
        if (this.G0 == 1) {
            e3 = l.M2(l3(), r3, this.A0);
        }
        this.z0 = e3;
        C3();
        B3(o3());
        androidx.fragment.app.t o = k0().o();
        o.r(C2406g.z, this.z0);
        o.k();
        this.z0.K2(new b());
    }

    private void C3() {
        this.P0.setText((this.G0 == 1 && u3()) ? this.W0 : this.V0);
    }

    private void D3(CheckableImageButton checkableImageButton) {
        this.R0.setContentDescription(this.G0 == 1 ? checkableImageButton.getContext().getString(C2410k.L) : checkableImageButton.getContext().getString(C2410k.N));
    }

    public static /* synthetic */ void d3(k kVar, View view) {
        kVar.T0.setEnabled(kVar.l3().u());
        kVar.R0.toggle();
        kVar.G0 = kVar.G0 == 1 ? 0 : 1;
        kVar.D3(kVar.R0);
        kVar.A3();
    }

    private static Drawable j3(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C2653a.b(context, C2405f.e));
        stateListDrawable.addState(new int[0], C2653a.b(context, C2405f.f));
        return stateListDrawable;
    }

    private void k3(Window window) {
        if (this.U0) {
            return;
        }
        View findViewById = q2().findViewById(C2406g.i);
        ax.F6.d.a(window, true, z.d(findViewById), null);
        int paddingTop = findViewById.getPaddingTop();
        C1760d0.v0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingLeft(), paddingTop, findViewById.getPaddingRight()));
        this.U0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.A6.d<S> l3() {
        if (this.y0 == null) {
            this.y0 = (ax.A6.d) j0().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.y0;
    }

    private static CharSequence m3(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String n3() {
        return l3().r(p2());
    }

    private static int p3(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C2404e.b0);
        int i = m.C().e0;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C2404e.d0) * i) + ((i - 1) * resources.getDimensionPixelOffset(C2404e.h0));
    }

    private int r3(Context context) {
        int i = this.x0;
        return i != 0 ? i : l3().s(context);
    }

    private void s3(Context context) {
        this.R0.setTag(Z0);
        this.R0.setImageDrawable(j3(context));
        this.R0.setChecked(this.G0 != 0);
        C1760d0.l0(this.R0, null);
        D3(this.R0);
        this.R0.setOnClickListener(new View.OnClickListener() { // from class: ax.A6.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.k.d3(com.google.android.material.datepicker.k.this, view);
            }
        });
    }

    static boolean t3(Context context) {
        return z3(context, R.attr.windowFullscreen);
    }

    private boolean u3() {
        return G0().getConfiguration().orientation == 2;
    }

    static boolean v3(Context context) {
        return z3(context, C2402c.Q);
    }

    static <S> k<S> w3(c<S> cVar) {
        k<S> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", cVar.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", cVar.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", cVar.d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", cVar.e);
        bundle.putCharSequence("TITLE_TEXT_KEY", cVar.f);
        bundle.putInt("INPUT_MODE_KEY", cVar.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", cVar.g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", cVar.h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", cVar.k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", cVar.l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.n);
        kVar.v2(bundle);
        return kVar;
    }

    static boolean z3(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ax.K6.b.f(context, C2402c.w, j.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    void B3(String str) {
        this.Q0.setContentDescription(n3());
        this.Q0.setText(str);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.y0);
        a.b bVar = new a.b(this.A0);
        j<S> jVar = this.C0;
        m Z2 = jVar == null ? null : jVar.Z2();
        if (Z2 != null) {
            bVar.b(Z2.g0);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.B0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.E0);
        bundle.putInt("INPUT_MODE_KEY", this.G0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.O0);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        Window window = X2().getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S0);
            k3(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = G0().getDimensionPixelOffset(C2404e.f0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ax.B6.a(X2(), rect));
        }
        A3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void K1() {
        this.z0.L2();
        super.K1();
    }

    @Override // androidx.fragment.app.e
    public final Dialog T2(Bundle bundle) {
        Dialog dialog = new Dialog(p2(), r3(p2()));
        Context context = dialog.getContext();
        this.F0 = t3(context);
        int i = C2402c.w;
        int i2 = ax.k6.l.C;
        this.S0 = new ax.O6.h(context, null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ax.k6.m.d3, i, i2);
        int color = obtainStyledAttributes.getColor(ax.k6.m.e3, 0);
        obtainStyledAttributes.recycle();
        this.S0.U(context);
        this.S0.g0(ColorStateList.valueOf(color));
        this.S0.f0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public boolean g3(DialogInterface.OnCancelListener onCancelListener) {
        return this.v0.add(onCancelListener);
    }

    public boolean h3(View.OnClickListener onClickListener) {
        return this.u0.add(onClickListener);
    }

    public boolean i3(ax.A6.j<? super S> jVar) {
        return this.t0.add(jVar);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public final void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) {
            bundle = j0();
        }
        this.x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.y0 = (ax.A6.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = (ax.A6.f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.G0 = bundle.getInt("INPUT_MODE_KEY");
        this.H0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.L0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.E0;
        if (charSequence == null) {
            charSequence = p2().getResources().getText(this.D0);
        }
        this.V0 = charSequence;
        this.W0 = m3(charSequence);
    }

    public String o3() {
        return l3().h(b());
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.v0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.w0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) R0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final S q3() {
        return l3().x();
    }

    @Override // androidx.fragment.app.Fragment
    public final View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.F0 ? C2408i.y : C2408i.x, viewGroup);
        Context context = inflate.getContext();
        ax.A6.f fVar = this.B0;
        if (fVar != null) {
            fVar.i(context);
        }
        if (this.F0) {
            inflate.findViewById(C2406g.z).setLayoutParams(new LinearLayout.LayoutParams(p3(context), -2));
        } else {
            inflate.findViewById(C2406g.A).setLayoutParams(new LinearLayout.LayoutParams(p3(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C2406g.F);
        this.Q0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.R0 = (CheckableImageButton) inflate.findViewById(C2406g.G);
        this.P0 = (TextView) inflate.findViewById(C2406g.J);
        s3(context);
        this.T0 = (Button) inflate.findViewById(C2406g.d);
        if (l3().u()) {
            this.T0.setEnabled(true);
        } else {
            this.T0.setEnabled(false);
        }
        this.T0.setTag(X0);
        CharSequence charSequence = this.I0;
        if (charSequence != null) {
            this.T0.setText(charSequence);
        } else {
            int i = this.H0;
            if (i != 0) {
                this.T0.setText(i);
            }
        }
        CharSequence charSequence2 = this.K0;
        if (charSequence2 != null) {
            this.T0.setContentDescription(charSequence2);
        } else if (this.J0 != 0) {
            this.T0.setContentDescription(b().getResources().getText(this.J0));
        }
        this.T0.setOnClickListener(new View.OnClickListener() { // from class: ax.A6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.k.this.y3(view);
            }
        });
        Button button = (Button) inflate.findViewById(C2406g.a);
        button.setTag(Y0);
        CharSequence charSequence3 = this.M0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.L0;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.O0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.N0 != 0) {
            button.setContentDescription(b().getResources().getText(this.N0));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: ax.A6.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.google.android.material.datepicker.k.this.x3(view);
            }
        });
        return inflate;
    }

    public void x3(View view) {
        Iterator<View.OnClickListener> it = this.u0.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        N2();
    }

    public void y3(View view) {
        Iterator<ax.A6.j<? super S>> it = this.t0.iterator();
        while (it.hasNext()) {
            it.next().a(q3());
        }
        N2();
    }
}
