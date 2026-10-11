/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.k6.k;
import com.google.android.material.datepicker.t;
import java.util.Calendar;
import java.util.Locale;

class i
extends BaseAdapter {
    private static final int d;
    private final Calendar a;
    private final int b;
    private final int c;

    static {
        int n8 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
        d = n8;
    }

    public i() {
        Calendar calendar;
        this.a = calendar = t.r();
        this.b = calendar.getMaximum(7);
        this.c = calendar.getFirstDayOfWeek();
    }

    public i(int n8) {
        Calendar calendar;
        this.a = calendar = t.r();
        this.b = calendar.getMaximum(7);
        this.c = n8;
    }

    private int b(int n8) {
        int n9 = n8 + this.c;
        int n10 = this.b;
        n8 = n9;
        if (n9 > n10) {
            n8 = n9 - n10;
        }
        return n8;
    }

    public Integer a(int n8) {
        if (n8 >= this.b) {
            return null;
        }
        return this.b(n8);
    }

    public int getCount() {
        return this.b;
    }

    public long getItemId(int n8) {
        return 0L;
    }

    @SuppressLint(value={"WrongConstant"})
    public View getView(int n8, View object, ViewGroup viewGroup) {
        TextView textView = (TextView)object;
        if (object == null) {
            textView = (TextView)LayoutInflater.from((Context)viewGroup.getContext()).inflate(ax.k6.i.q, viewGroup, false);
        }
        this.a.set(7, this.b(n8));
        object = textView.getResources().getConfiguration().locale;
        textView.setText((CharSequence)this.a.getDisplayName(7, d, (Locale)object));
        textView.setContentDescription((CharSequence)String.format(viewGroup.getContext().getString(k.s), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}

