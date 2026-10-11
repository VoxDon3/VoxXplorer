package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ax.b0.C1442c;
import ax.b0.C1446g;
import ax.k6.C2402c;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.C2410k;
import ax.z6.C3555a;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public class q implements ax.A6.d<C1442c<Long, Long>> {
    public static final Parcelable.Creator<q> CREATOR = new c();
    private String c0;
    private final String d0 = " ";
    private Long e0 = null;
    private Long f0 = null;
    private Long g0 = null;
    private Long h0 = null;
    private SimpleDateFormat i0;
    private CharSequence q;

    class a extends f {
        final /* synthetic */ TextInputLayout i;
        final /* synthetic */ TextInputLayout j;
        final /* synthetic */ ax.A6.k k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ax.A6.k kVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.i = textInputLayout2;
            this.j = textInputLayout3;
            this.k = kVar;
        }

        @Override // com.google.android.material.datepicker.f
        void d() {
            q.this.g0 = null;
            q.this.o(this.i, this.j, this.k);
        }

        @Override // com.google.android.material.datepicker.f
        void e(Long l) {
            q.this.g0 = l;
            q.this.o(this.i, this.j, this.k);
        }
    }

    class b extends f {
        final /* synthetic */ TextInputLayout i;
        final /* synthetic */ TextInputLayout j;
        final /* synthetic */ ax.A6.k k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, ax.A6.k kVar) {
            super(str, dateFormat, textInputLayout, aVar);
            this.i = textInputLayout2;
            this.j = textInputLayout3;
            this.k = kVar;
        }

        @Override // com.google.android.material.datepicker.f
        void d() {
            q.this.h0 = null;
            q.this.o(this.i, this.j, this.k);
        }

        @Override // com.google.android.material.datepicker.f
        void e(Long l) {
            q.this.h0 = l;
            q.this.o(this.i, this.j, this.k);
        }
    }

    class c implements Parcelable.Creator<q> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q createFromParcel(Parcel parcel) {
            q qVar = new q();
            qVar.e0 = (Long) parcel.readValue(Long.class.getClassLoader());
            qVar.f0 = (Long) parcel.readValue(Long.class.getClassLoader());
            return qVar;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q[] newArray(int i) {
            return new q[i];
        }
    }

    private void f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.c0.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean i(long j, long j2) {
        return j <= j2;
    }

    private void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.c0);
        textInputLayout2.setError(" ");
    }

    private void m(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.q = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.q = null;
        } else {
            this.q = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, ax.A6.k<C1442c<Long, Long>> kVar) {
        Long l = this.g0;
        if (l == null || this.h0 == null) {
            f(textInputLayout, textInputLayout2);
            kVar.a();
        } else if (i(l.longValue(), this.h0.longValue())) {
            this.e0 = this.g0;
            this.f0 = this.h0;
            kVar.b(x());
        } else {
            j(textInputLayout, textInputLayout2);
            kVar.a();
        }
        m(textInputLayout, textInputLayout2);
    }

    @Override // ax.A6.d
    public void A(long j) {
        Long l = this.e0;
        if (l == null) {
            this.e0 = Long.valueOf(j);
        } else if (this.f0 == null && i(l.longValue(), j)) {
            this.f0 = Long.valueOf(j);
        } else {
            this.f0 = null;
            this.e0 = Long.valueOf(j);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // ax.A6.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1442c<Long, Long> x() {
        return new C1442c<>(this.e0, this.f0);
    }

    @Override // ax.A6.d
    public String h(Context context) {
        Resources resources = context.getResources();
        Long l = this.e0;
        if (l == null && this.f0 == null) {
            return resources.getString(C2410k.F);
        }
        Long l2 = this.f0;
        if (l2 == null) {
            return resources.getString(C2410k.C, g.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(C2410k.B, g.c(l2.longValue()));
        }
        C1442c<String, String> a2 = g.a(l, l2);
        return resources.getString(C2410k.D, a2.a, a2.b);
    }

    @Override // ax.A6.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void n(C1442c<Long, Long> c1442c) {
        Long l = c1442c.a;
        if (l != null && c1442c.b != null) {
            C1446g.a(i(l.longValue(), c1442c.b.longValue()));
        }
        Long l2 = c1442c.a;
        this.e0 = l2 == null ? null : Long.valueOf(t.a(l2.longValue()));
        Long l3 = c1442c.b;
        this.f0 = l3 != null ? Long.valueOf(t.a(l3.longValue())) : null;
    }

    @Override // ax.A6.d
    public Collection<C1442c<Long, Long>> l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1442c(this.e0, this.f0));
        return arrayList;
    }

    @Override // ax.A6.d
    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, com.google.android.material.datepicker.a aVar, ax.A6.k<C1442c<Long, Long>> kVar) {
        View inflate = layoutInflater.inflate(C2408i.z, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C2406g.I);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C2406g.H);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer f = C3555a.f(inflate.getContext(), C2402c.g);
        if (f != null) {
            editText.setHintTextColor(f.intValue());
            editText2.setHintTextColor(f.intValue());
        }
        if (ax.F6.i.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.c0 = inflate.getResources().getString(C2410k.x);
        SimpleDateFormat simpleDateFormat = this.i0;
        boolean z = simpleDateFormat != null;
        if (!z) {
            simpleDateFormat = t.g();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l = this.e0;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            this.g0 = this.e0;
        }
        Long l2 = this.f0;
        if (l2 != null) {
            editText2.setText(simpleDateFormat2.format(l2));
            this.h0 = this.f0;
        }
        String pattern = z ? simpleDateFormat2.toPattern() : t.h(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, aVar, textInputLayout, textInputLayout2, kVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat2, textInputLayout2, aVar, textInputLayout, textInputLayout2, kVar));
        if (!ax.A6.c.a(inflate.getContext())) {
            ax.A6.c.d(editText, editText2);
        }
        return inflate;
    }

    @Override // ax.A6.d
    public int q() {
        return C2410k.E;
    }

    @Override // ax.A6.d
    public String r(Context context) {
        Resources resources = context.getResources();
        C1442c<String, String> a2 = g.a(this.e0, this.f0);
        String str = a2.a;
        String string = str == null ? resources.getString(C2410k.r) : str;
        String str2 = a2.b;
        return resources.getString(C2410k.q, string, str2 == null ? resources.getString(C2410k.r) : str2);
    }

    @Override // ax.A6.d
    public int s(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return ax.K6.b.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C2404e.g0) ? C2402c.x : C2402c.v, k.class.getCanonicalName());
    }

    @Override // ax.A6.d
    public boolean u() {
        Long l = this.e0;
        return (l == null || this.f0 == null || !i(l.longValue(), this.f0.longValue())) ? false : true;
    }

    @Override // ax.A6.d
    public Collection<Long> w() {
        ArrayList arrayList = new ArrayList();
        Long l = this.e0;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f0;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.e0);
        parcel.writeValue(this.f0);
    }
}
