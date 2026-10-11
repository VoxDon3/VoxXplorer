package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import ax.F6.v;
import ax.k6.C2410k;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
abstract class f extends v {
    private final TextInputLayout a;
    private final String b;
    private final DateFormat c;
    private final a d;
    private final String e;
    private final Runnable f;
    private Runnable g;
    private int h = 0;

    f(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, a aVar) {
        this.b = str;
        this.c = dateFormat;
        this.a = textInputLayout;
        this.d = aVar;
        this.e = textInputLayout.getContext().getString(C2410k.A);
        this.f = new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                f.b(f.this, str);
            }
        };
    }

    public static /* synthetic */ void a(f fVar, long j) {
        fVar.getClass();
        fVar.a.setError(String.format(fVar.e, fVar.g(g.c(j))));
        fVar.d();
    }

    public static /* synthetic */ void b(f fVar, String str) {
        TextInputLayout textInputLayout = fVar.a;
        DateFormat dateFormat = fVar.c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(C2410k.u) + "\n" + String.format(context.getString(C2410k.w), fVar.g(str)) + "\n" + String.format(context.getString(C2410k.v), fVar.g(dateFormat.format(new Date(t.p().getTimeInMillis())))));
        fVar.d();
    }

    private Runnable c(final long j) {
        return new Runnable() { // from class: com.google.android.material.datepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                f.a(f.this, j);
            }
        };
    }

    private String g(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.b.length() && editable.length() >= this.h) {
            char charAt = this.b.charAt(editable.length());
            if (Character.isLetterOrDigit(charAt)) {
                return;
            }
            editable.append(charAt);
        }
    }

    @Override // ax.F6.v, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.h = charSequence.length();
    }

    abstract void d();

    abstract void e(Long l);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // ax.F6.v, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.removeCallbacks(this.f);
        this.a.removeCallbacks(this.g);
        this.a.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.b.length()) {
            return;
        }
        try {
            Date parse = this.c.parse(charSequence.toString());
            this.a.setError(null);
            long time = parse.getTime();
            if (this.d.g().t(time) && this.d.y(time)) {
                e(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable c = c(time);
            this.g = c;
            f(this.a, c);
        } catch (ParseException unused) {
            f(this.a, this.f);
        }
    }
}
