/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import ax.F6.v;
import ax.k6.k;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.e;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.t;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

abstract class f
extends v {
    private final TextInputLayout a;
    private final String b;
    private final DateFormat c;
    private final a d;
    private final String e;
    private final Runnable f;
    private Runnable g;
    private int h = 0;

    f(String string, DateFormat dateFormat, TextInputLayout textInputLayout, a a8) {
        this.b = string;
        this.c = dateFormat;
        this.a = textInputLayout;
        this.d = a8;
        this.e = textInputLayout.getContext().getString(k.A);
        this.f = new d(this, string);
    }

    public static /* synthetic */ void a(f f8, long l8) {
        f8.getClass();
        String string = com.google.android.material.datepicker.g.c(l8);
        f8.a.setError(String.format(f8.e, f8.g(string)));
        f8.d();
    }

    public static /* synthetic */ void b(f f8, String string) {
        TextInputLayout textInputLayout = f8.a;
        Serializable serializable = f8.c;
        Object object = textInputLayout.getContext();
        String string2 = object.getString(k.u);
        string = String.format(object.getString(k.w), f8.g(string));
        object = String.format(object.getString(k.v), f8.g(((DateFormat)serializable).format(new Date(t.p().getTimeInMillis()))));
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("\n");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append("\n");
        ((StringBuilder)serializable).append((String)object);
        textInputLayout.setError(((StringBuilder)serializable).toString());
        f8.d();
    }

    private Runnable c(long l8) {
        return new e(this, l8);
    }

    private String g(String string) {
        return string.replace(' ', '\u00a0');
    }

    public void afterTextChanged(Editable editable) {
        char c8;
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.b.length() && editable.length() >= this.h && !Character.isLetterOrDigit(c8 = this.b.charAt(editable.length()))) {
            editable.append(c8);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
        this.h = charSequence.length();
    }

    abstract void d();

    abstract void e(Long var1);

    public void f(View view, Runnable runnable2) {
        view.post(runnable2);
    }

    @Override
    public void onTextChanged(CharSequence object, int n8, int n9, int n10) {
        this.a.removeCallbacks(this.f);
        this.a.removeCallbacks(this.g);
        this.a.setError(null);
        this.e(null);
        if (!TextUtils.isEmpty((CharSequence)object) && object.length() >= this.b.length()) {
            try {
                object = this.c.parse(object.toString());
                this.a.setError(null);
                long l8 = ((Date)object).getTime();
                if (this.d.g().t(l8) && this.d.y(l8)) {
                    this.e(((Date)object).getTime());
                    return;
                }
                this.g = object = this.c(l8);
                this.f((View)this.a, (Runnable)object);
                return;
            }
            catch (ParseException parseException) {
                this.f((View)this.a, this.f);
            }
        }
    }
}

