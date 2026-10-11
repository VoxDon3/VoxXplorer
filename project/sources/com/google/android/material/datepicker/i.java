package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.k6.C2408i;
import ax.k6.C2410k;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
class i extends BaseAdapter {
    private static final int d;
    private final Calendar a;
    private final int b;
    private final int c;

    static {
        d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar r = t.r();
        this.a = r;
        this.b = r.getMaximum(7);
        this.c = r.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2408i.q, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C2410k.s), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i) {
        Calendar r = t.r();
        this.a = r;
        this.b = r.getMaximum(7);
        this.c = i;
    }
}
