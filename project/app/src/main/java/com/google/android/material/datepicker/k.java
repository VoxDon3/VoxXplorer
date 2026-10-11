/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.fragment.app.t;
import ax.F6.d;
import ax.F6.z;
import ax.K6.b;
import ax.O6.h;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.d0;
import ax.k6.f;
import ax.k6.g;
import ax.k6.i;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.j;
import com.google.android.material.datepicker.l;
import com.google.android.material.datepicker.m;
import com.google.android.material.datepicker.p;
import com.google.android.material.datepicker.q;
import com.google.android.material.internal.CheckableImageButton;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class k<S>
extends e {
    static final Object X0 = "CONFIRM_BUTTON_TAG";
    static final Object Y0 = "CANCEL_BUTTON_TAG";
    static final Object Z0 = "TOGGLE_BUTTON_TAG";
    private a A0;
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
    private h S0;
    private Button T0;
    private boolean U0;
    private CharSequence V0;
    private CharSequence W0;
    private final LinkedHashSet<ax.A6.j<? super S>> t0 = new LinkedHashSet();
    private final LinkedHashSet<View.OnClickListener> u0 = new LinkedHashSet();
    private final LinkedHashSet<DialogInterface.OnCancelListener> v0 = new LinkedHashSet();
    private final LinkedHashSet<DialogInterface.OnDismissListener> w0 = new LinkedHashSet();
    private int x0;
    private ax.A6.d<S> y0;
    private p<S> z0;

    private void A3() {
        int n8 = this.r3(this.p2());
        Object object = j.e3(this.l3(), n8, this.A0, this.B0);
        this.C0 = object;
        if (this.G0 == 1) {
            object = l.M2(this.l3(), n8, this.A0);
        }
        this.z0 = object;
        this.C3();
        this.B3(this.o3());
        object = this.k0().o();
        ((t)object).r(g.z, this.z0);
        ((t)object).k();
        this.z0.K2(new ax.A6.k<S>(this){
            final k a;
            {
                this.a = k8;
            }

            @Override
            public void a() {
                this.a.T0.setEnabled(false);
            }

            @Override
            public void b(S object) {
                object = this.a;
                ((k)object).B3(((k)object).o3());
                this.a.T0.setEnabled(this.a.l3().u());
            }
        });
    }

    private void C3() {
        TextView textView = this.P0;
        CharSequence charSequence = this.G0 == 1 && this.u3() ? this.W0 : this.V0;
        textView.setText(charSequence);
    }

    private void D3(CheckableImageButton object) {
        object = this.G0 == 1 ? object.getContext().getString(ax.k6.k.L) : object.getContext().getString(ax.k6.k.N);
        this.R0.setContentDescription((CharSequence)object);
    }

    public static /* synthetic */ void d3(k k8, View view) {
        k8.T0.setEnabled(k8.l3().u());
        k8.R0.toggle();
        int n8 = k8.G0;
        int n9 = 1;
        if (n8 == 1) {
            n9 = 0;
        }
        k8.G0 = n9;
        k8.D3(k8.R0);
        k8.A3();
    }

    private static Drawable j3(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = ax.o.a.b(context, f.e);
        stateListDrawable.addState(new int[]{0x10100A0}, drawable);
        context = ax.o.a.b(context, f.f);
        stateListDrawable.addState(new int[0], (Drawable)context);
        return stateListDrawable;
    }

    private void k3(Window window) {
        if (this.U0) {
            return;
        }
        View view = this.q2().findViewById(g.i);
        d.a(window, true, z.d(view), null);
        int n8 = view.getPaddingTop();
        int n9 = view.getPaddingLeft();
        int n10 = view.getPaddingRight();
        d0.v0(view, new I(){
            final int a;
            final View b;
            final int c;
            final int d;
            final int e;
            final k f;
            {
                this.f = k8;
                this.a = n8;
                this.b = view;
                this.c = n9;
                this.d = n10;
                this.e = n11;
            }

            @Override
            public F0 a(View object, F0 f02) {
                View view;
                object = f02.f(F0.m.h());
                if (this.a >= 0) {
                    this.b.getLayoutParams().height = this.a + object.b;
                    view = this.b;
                    view.setLayoutParams(view.getLayoutParams());
                }
                view = this.b;
                view.setPadding(this.c + object.a, this.d + object.b, this.e + object.c, view.getPaddingBottom());
                return f02;
            }
        });
        this.U0 = true;
    }

    private ax.A6.d<S> l3() {
        if (this.y0 == null) {
            this.y0 = (ax.A6.d)this.j0().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.y0;
    }

    private static CharSequence m3(CharSequence charSequence) {
        if (charSequence != null) {
            String[] stringArray = TextUtils.split((String)String.valueOf(charSequence), (String)"\n");
            if (stringArray.length > 1) {
                charSequence = stringArray[0];
            }
            return charSequence;
        }
        return null;
    }

    private String n3() {
        return this.l3().r(this.p2());
    }

    private static int p3(Context context) {
        context = context.getResources();
        int n8 = context.getDimensionPixelOffset(ax.k6.e.b0);
        int n9 = m.C().e0;
        return n8 * 2 + context.getDimensionPixelSize(ax.k6.e.d0) * n9 + (n9 - 1) * context.getDimensionPixelOffset(ax.k6.e.h0);
    }

    private int r3(Context context) {
        int n8 = this.x0;
        if (n8 != 0) {
            return n8;
        }
        return this.l3().s(context);
    }

    private void s3(Context object) {
        this.R0.setTag(Z0);
        this.R0.setImageDrawable(k.j3((Context)object));
        object = this.R0;
        boolean bl = this.G0 != 0;
        ((CheckableImageButton)((Object)object)).setChecked(bl);
        d0.l0((View)this.R0, null);
        this.D3(this.R0);
        this.R0.setOnClickListener(new ax.A6.i(this));
    }

    static boolean t3(Context context) {
        return k.z3(context, 16843277);
    }

    private boolean u3() {
        return this.G0().getConfiguration().orientation == 2;
    }

    static boolean v3(Context context) {
        return k.z3(context, ax.k6.c.Q);
    }

    static <S> k<S> w3(c<S> c8) {
        k<S> k8 = new k<S>();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", c8.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", c8.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)c8.c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable)c8.d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", c8.e);
        bundle.putCharSequence("TITLE_TEXT_KEY", c8.f);
        bundle.putInt("INPUT_MODE_KEY", c8.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", c8.g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", c8.h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", c8.i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", c8.j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", c8.k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", c8.l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", c8.m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", c8.n);
        k8.v2(bundle);
        return k8;
    }

    static boolean z3(Context context, int n8) {
        context = context.obtainStyledAttributes(b.f(context, ax.k6.c.w, j.class.getCanonicalName()), new int[]{n8});
        boolean bl = context.getBoolean(0, false);
        context.recycle();
        return bl;
    }

    void B3(String string) {
        this.Q0.setContentDescription((CharSequence)this.n3());
        this.Q0.setText((CharSequence)string);
    }

    @Override
    public final void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.y0);
        a.b b8 = new a.b(this.A0);
        Object object = this.C0;
        object = object == null ? null : ((j)object).Z2();
        if (object != null) {
            b8.b(((m)object).g0);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)b8.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable)this.B0);
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

    @Override
    public void J1() {
        super.J1();
        Window window = this.X2().getWindow();
        if (this.F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable((Drawable)this.S0);
            this.k3(window);
        } else {
            window.setLayout(-2, -2);
            int n8 = this.G0().getDimensionPixelOffset(ax.k6.e.f0);
            Rect rect = new Rect(n8, n8, n8, n8);
            window.setBackgroundDrawable((Drawable)new InsetDrawable((Drawable)this.S0, n8, n8, n8, n8));
            window.getDecorView().setOnTouchListener((View.OnTouchListener)new ax.B6.a(this.X2(), rect));
        }
        this.A3();
    }

    @Override
    public void K1() {
        this.z0.L2();
        super.K1();
    }

    @Override
    public final Dialog T2(Bundle bundle) {
        Dialog dialog = new Dialog(this.p2(), this.r3(this.p2()));
        bundle = dialog.getContext();
        this.F0 = k.t3((Context)bundle);
        int n8 = ax.k6.c.w;
        int n9 = ax.k6.l.C;
        this.S0 = new h((Context)bundle, null, n8, n9);
        TypedArray typedArray = bundle.obtainStyledAttributes(null, ax.k6.m.d3, n8, n9);
        n9 = typedArray.getColor(ax.k6.m.e3, 0);
        typedArray.recycle();
        this.S0.U((Context)bundle);
        this.S0.g0(ColorStateList.valueOf((int)n9));
        this.S0.f0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public boolean g3(DialogInterface.OnCancelListener onCancelListener) {
        return ((AbstractCollection)this.v0).add(onCancelListener);
    }

    public boolean h3(View.OnClickListener onClickListener) {
        return ((AbstractCollection)this.u0).add(onClickListener);
    }

    public boolean i3(ax.A6.j<? super S> j8) {
        return ((AbstractCollection)this.t0).add(j8);
    }

    @Override
    public final void n1(Bundle object) {
        super.n1((Bundle)object);
        Bundle bundle = object;
        if (object == null) {
            bundle = this.j0();
        }
        this.x0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.y0 = (ax.A6.d)bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A0 = (a)bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.B0 = (ax.A6.f)bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
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
        object = this.E0;
        if (object == null) {
            object = this.p2().getResources().getText(this.D0);
        }
        this.V0 = object;
        this.W0 = k.m3((CharSequence)object);
    }

    public String o3() {
        return this.l3().h(this.b());
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator iterator = ((AbstractCollection)this.v0).iterator();
        while (iterator.hasNext()) {
            ((DialogInterface.OnCancelListener)iterator.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        ViewGroup viewGroup = ((AbstractCollection)this.w0).iterator();
        while (viewGroup.hasNext()) {
            ((DialogInterface.OnDismissListener)viewGroup.next()).onDismiss(dialogInterface);
        }
        viewGroup = (ViewGroup)this.R0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final S q3() {
        return this.l3().x();
    }

    @Override
    public final View r1(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n8 = this.F0 ? i.y : i.x;
        layoutInflater = layoutInflater.inflate(n8, object);
        object = layoutInflater.getContext();
        object2 = this.B0;
        if (object2 != null) {
            ((ax.A6.f)object2).i((Context)object);
        }
        if (this.F0) {
            layoutInflater.findViewById(g.z).setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(k.p3((Context)object), -2));
        } else {
            layoutInflater.findViewById(g.A).setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(k.p3((Context)object), -1));
        }
        object2 = (TextView)layoutInflater.findViewById(g.F);
        this.Q0 = object2;
        object2.setAccessibilityLiveRegion(1);
        this.R0 = (CheckableImageButton)layoutInflater.findViewById(g.G);
        this.P0 = (TextView)layoutInflater.findViewById(g.J);
        this.s3((Context)object);
        this.T0 = (Button)layoutInflater.findViewById(g.d);
        if (this.l3().u()) {
            this.T0.setEnabled(true);
        } else {
            this.T0.setEnabled(false);
        }
        this.T0.setTag(X0);
        object = this.I0;
        if (object != null) {
            this.T0.setText((CharSequence)object);
        } else {
            n8 = this.H0;
            if (n8 != 0) {
                this.T0.setText(n8);
            }
        }
        object = this.K0;
        if (object != null) {
            this.T0.setContentDescription((CharSequence)object);
        } else if (this.J0 != 0) {
            this.T0.setContentDescription(this.b().getResources().getText(this.J0));
        }
        this.T0.setOnClickListener((View.OnClickListener)new ax.A6.g(this));
        object = (Button)layoutInflater.findViewById(g.a);
        object.setTag(Y0);
        object2 = this.M0;
        if (object2 != null) {
            object.setText((CharSequence)object2);
        } else {
            n8 = this.L0;
            if (n8 != 0) {
                object.setText(n8);
            }
        }
        object2 = this.O0;
        if (object2 != null) {
            object.setContentDescription((CharSequence)object2);
        } else if (this.N0 != 0) {
            object.setContentDescription(this.b().getResources().getText(this.N0));
        }
        object.setOnClickListener((View.OnClickListener)new ax.A6.h(this));
        return layoutInflater;
    }

    public void x3(View view) {
        Iterator iterator = ((AbstractCollection)this.u0).iterator();
        while (iterator.hasNext()) {
            ((View.OnClickListener)iterator.next()).onClick(view);
        }
        this.N2();
    }

    public void y3(View object) {
        object = ((AbstractCollection)this.t0).iterator();
        while (object.hasNext()) {
            ((ax.A6.j)object.next()).a(this.q3());
        }
        this.N2();
    }

    public static final class c<S> {
        final ax.A6.d<S> a;
        int b = 0;
        a c;
        ax.A6.f d;
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

        private c(ax.A6.d<S> d8) {
            this.a = d8;
        }

        private m b() {
            m m8;
            if (!this.a.w().isEmpty() && com.google.android.material.datepicker.k$c.d(m8 = com.google.android.material.datepicker.m.B(this.a.w().iterator().next()), this.c)) {
                return m8;
            }
            m8 = com.google.android.material.datepicker.m.C();
            if (com.google.android.material.datepicker.k$c.d(m8, this.c)) {
                return m8;
            }
            return this.c.o();
        }

        public static c<ax.b0.c<Long, Long>> c() {
            return new c<ax.b0.c<Long, Long>>(new q());
        }

        private static boolean d(m m8, a a8) {
            return m8.d(a8.o()) >= 0 && m8.d(a8.i()) <= 0;
        }

        public k<S> a() {
            S s8;
            if (this.c == null) {
                this.c = new a.b().a();
            }
            if (this.e == 0) {
                this.e = this.a.q();
            }
            if ((s8 = this.o) != null) {
                this.a.n(s8);
            }
            if (this.c.m() == null) {
                this.c.z(this.b());
            }
            return com.google.android.material.datepicker.k.w3(this);
        }
    }
}

