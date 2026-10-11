/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ax.A6.d;
import ax.F6.i;
import ax.K6.b;
import ax.b0.c;
import ax.k6.e;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.f;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.k;
import com.google.android.material.datepicker.t;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class q
implements d<c<Long, Long>> {
    public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator<q>(){

        public q a(Parcel parcel) {
            q q8 = new q();
            com.google.android.material.datepicker.q.d(q8, (Long)parcel.readValue(Long.class.getClassLoader()));
            com.google.android.material.datepicker.q.e(q8, (Long)parcel.readValue(Long.class.getClassLoader()));
            return q8;
        }

        public q[] b(int n8) {
            return new q[n8];
        }
    };
    private String c0;
    private final String d0;
    private Long e0 = null;
    private Long f0 = null;
    private Long g0 = null;
    private Long h0 = null;
    private SimpleDateFormat i0;
    private CharSequence q;

    public q() {
        this.d0 = " ";
    }

    static /* synthetic */ Long a(q q8, Long l8) {
        q8.g0 = l8;
        return l8;
    }

    static /* synthetic */ Long c(q q8, Long l8) {
        q8.h0 = l8;
        return l8;
    }

    static /* synthetic */ Long d(q q8, Long l8) {
        q8.e0 = l8;
        return l8;
    }

    static /* synthetic */ Long e(q q8, Long l8) {
        q8.f0 = l8;
        return l8;
    }

    private void f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.c0.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }

    private boolean i(long l8, long l9) {
        return l8 <= l9;
    }

    private void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.c0);
        textInputLayout2.setError(" ");
    }

    private void m(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty((CharSequence)textInputLayout.getError())) {
            this.q = textInputLayout.getError();
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)textInputLayout2.getError())) {
            this.q = textInputLayout2.getError();
            return;
        }
        this.q = null;
    }

    private void o(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ax.A6.k<c<Long, Long>> k8) {
        Long l8 = this.g0;
        if (l8 != null && this.h0 != null) {
            if (this.i(l8, this.h0)) {
                this.e0 = this.g0;
                this.f0 = this.h0;
                k8.b(this.g());
            } else {
                this.j(textInputLayout, textInputLayout2);
                k8.a();
            }
        } else {
            this.f(textInputLayout, textInputLayout2);
            k8.a();
        }
        this.m(textInputLayout, textInputLayout2);
    }

    @Override
    public void A(long l8) {
        Long l9 = this.e0;
        if (l9 == null) {
            this.e0 = l8;
            return;
        }
        if (this.f0 == null && this.i(l9, l8)) {
            this.f0 = l8;
            return;
        }
        this.f0 = null;
        this.e0 = l8;
    }

    public int describeContents() {
        return 0;
    }

    public c<Long, Long> g() {
        return new c<Long, Long>(this.e0, this.f0);
    }

    @Override
    public String h(Context context) {
        context = context.getResources();
        Object object = this.e0;
        if (object == null && this.f0 == null) {
            return context.getString(ax.k6.k.F);
        }
        Long l8 = this.f0;
        if (l8 == null) {
            return context.getString(ax.k6.k.C, new Object[]{g.c((Long)object)});
        }
        if (object == null) {
            return context.getString(ax.k6.k.B, new Object[]{g.c(l8)});
        }
        object = g.a((Long)object, l8);
        return context.getString(ax.k6.k.D, new Object[]{((c)object).a, ((c)object).b});
    }

    public void k(c<Long, Long> object) {
        Object object2 = ((c)object).a;
        if (object2 != null && ((c)object).b != null) {
            ax.b0.g.a(this.i((Long)object2, (Long)((c)object).b));
        }
        object2 = ((c)object).a;
        Object var3_3 = null;
        object2 = object2 == null ? null : Long.valueOf(t.a((Long)object2));
        this.e0 = object2;
        object = ((c)object).b;
        object = object == null ? var3_3 : Long.valueOf(t.a((Long)object));
        this.f0 = object;
    }

    @Override
    public Collection<c<Long, Long>> l() {
        ArrayList<c<Long, Long>> arrayList = new ArrayList<c<Long, Long>>();
        arrayList.add(new c<Long, Long>(this.e0, this.f0));
        return arrayList;
    }

    @Override
    public View p(LayoutInflater object, ViewGroup object2, Bundle bundle, a a8, ax.A6.k<c<Long, Long>> k8) {
        View view = object.inflate(ax.k6.i.z, object2, false);
        TextInputLayout textInputLayout = (TextInputLayout)view.findViewById(ax.k6.g.I);
        TextInputLayout textInputLayout2 = (TextInputLayout)view.findViewById(ax.k6.g.H);
        bundle = textInputLayout.getEditText();
        EditText editText = textInputLayout2.getEditText();
        object = ax.z6.a.f(view.getContext(), ax.k6.c.g);
        if (object != null) {
            bundle.setHintTextColor(((Integer)object).intValue());
            editText.setHintTextColor(((Integer)object).intValue());
        }
        if (i.b()) {
            bundle.setInputType(17);
            editText.setInputType(17);
        }
        this.c0 = view.getResources().getString(ax.k6.k.x);
        object = this.i0;
        boolean bl = object != null;
        if (!bl) {
            object = t.g();
        }
        object2 = this.e0;
        if (object2 != null) {
            bundle.setText((CharSequence)((Format)object).format(object2));
            this.g0 = this.e0;
        }
        if ((object2 = this.f0) != null) {
            editText.setText((CharSequence)((Format)object).format(object2));
            this.h0 = this.f0;
        }
        object2 = bl ? ((SimpleDateFormat)object).toPattern() : t.h(view.getResources(), (SimpleDateFormat)object);
        textInputLayout.setPlaceholderText((CharSequence)object2);
        textInputLayout2.setPlaceholderText((CharSequence)object2);
        bundle.addTextChangedListener((TextWatcher)new f(this, (String)object2, (DateFormat)object, textInputLayout, a8, textInputLayout, textInputLayout2, k8){
            final TextInputLayout i;
            final TextInputLayout j;
            final ax.A6.k k;
            final q l;
            {
                this.l = q8;
                this.i = textInputLayout2;
                this.j = textInputLayout3;
                this.k = k8;
                super(string, dateFormat, textInputLayout, a8);
            }

            @Override
            void d() {
                com.google.android.material.datepicker.q.a(this.l, null);
                this.l.o(this.i, this.j, this.k);
            }

            @Override
            void e(Long l8) {
                com.google.android.material.datepicker.q.a(this.l, l8);
                this.l.o(this.i, this.j, this.k);
            }
        });
        editText.addTextChangedListener((TextWatcher)new f(this, (String)object2, (DateFormat)object, textInputLayout2, a8, textInputLayout, textInputLayout2, k8){
            final TextInputLayout i;
            final TextInputLayout j;
            final ax.A6.k k;
            final q l;
            {
                this.l = q8;
                this.i = textInputLayout2;
                this.j = textInputLayout3;
                this.k = k8;
                super(string, dateFormat, textInputLayout, a8);
            }

            @Override
            void d() {
                com.google.android.material.datepicker.q.c(this.l, null);
                this.l.o(this.i, this.j, this.k);
            }

            @Override
            void e(Long l8) {
                com.google.android.material.datepicker.q.c(this.l, l8);
                this.l.o(this.i, this.j, this.k);
            }
        });
        if (!ax.A6.c.a(view.getContext())) {
            ax.A6.c.d(new EditText[]{bundle, editText});
        }
        return view;
    }

    @Override
    public int q() {
        return ax.k6.k.E;
    }

    @Override
    public String r(Context object) {
        Resources resources = object.getResources();
        Object object2 = g.a(this.e0, this.f0);
        object = ((c)object2).a;
        object = object == null ? resources.getString(ax.k6.k.r) : (String)object;
        object2 = ((c)object2).b;
        object2 = object2 == null ? resources.getString(ax.k6.k.r) : (String)object2;
        return resources.getString(ax.k6.k.q, new Object[]{object, object2});
    }

    @Override
    public int s(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int n8 = resources.getDimensionPixelSize(e.g0);
        n8 = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > n8 ? ax.k6.c.x : ax.k6.c.v;
        return b.f(context, n8, k.class.getCanonicalName());
    }

    @Override
    public boolean u() {
        Long l8 = this.e0;
        return l8 != null && this.f0 != null && this.i(l8, this.f0);
    }

    @Override
    public Collection<Long> w() {
        ArrayList<Long> arrayList = new ArrayList<Long>();
        Long l8 = this.e0;
        if (l8 != null) {
            arrayList.add(l8);
        }
        if ((l8 = this.f0) != null) {
            arrayList.add(l8);
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeValue((Object)this.e0);
        parcel.writeValue((Object)this.f0);
    }
}

