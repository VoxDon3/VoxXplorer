/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.A6.d;
import ax.A6.f;
import ax.k6.i;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.m;
import com.google.android.material.datepicker.t;
import java.util.Collection;
import java.util.Iterator;

class n
extends BaseAdapter {
    static final int g = t.r().getMaximum(4);
    private static final int h = t.r().getMaximum(5) + t.r().getMaximum(7) - 1;
    final m a;
    final d<?> b;
    private Collection<Long> c;
    c d;
    final a e;
    final f f;

    n(m m8, d<?> d8, a a8, f f8) {
        this.a = m8;
        this.b = d8;
        this.e = a8;
        this.f = f8;
        this.c = d8.w();
    }

    private String c(Context context, long l8) {
        return com.google.android.material.datepicker.g.e(context, l8, this.l(l8), this.k(l8), this.g(l8));
    }

    private void f(Context context) {
        if (this.d == null) {
            this.d = new c(context);
        }
    }

    private boolean j(long l8) {
        for (long l9 : this.b.w()) {
            if (t.a(l8) != t.a(l9)) continue;
            return true;
        }
        return false;
    }

    private boolean l(long l8) {
        return t.p().getTimeInMillis() == l8;
    }

    private void o(TextView textView, long l8, int n8) {
        b b8;
        boolean bl;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String string = this.c(context, l8);
        textView.setContentDescription((CharSequence)string);
        boolean bl2 = this.e.g().t(l8);
        if (bl2) {
            textView.setEnabled(true);
            bl = this.j(l8);
            textView.setSelected(bl);
            b8 = bl ? this.d.b : (this.l(l8) ? this.d.c : this.d.a);
        } else {
            textView.setEnabled(false);
            b8 = this.d.g;
            bl = false;
        }
        f f8 = this.f;
        if (f8 != null && n8 != -1) {
            m m8 = this.a;
            int n9 = m8.d0;
            int n10 = m8.c0;
            b8.e(textView, f8.a(context, n9, n10, n8, bl2, bl), this.f.g(context, n9, n10, n8, bl2, bl));
            textView.setCompoundDrawables(this.f.c(context, n9, n10, n8, bl2, bl), this.f.e(context, n9, n10, n8, bl2, bl), this.f.d(context, n9, n10, n8, bl2, bl), this.f.b(context, n9, n10, n8, bl2, bl));
            textView.setContentDescription(this.f.f(context, n9, n10, n8, bl2, bl, string));
            return;
        }
        b8.d(textView);
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long l8) {
        if (m.B(l8).equals(this.a)) {
            int n8 = this.a.F(l8);
            this.o((TextView)materialCalendarGridView.getChildAt(materialCalendarGridView.b().a(n8) - materialCalendarGridView.getFirstVisiblePosition()), l8, n8);
        }
    }

    int a(int n8) {
        return this.b() + (n8 - 1);
    }

    int b() {
        return this.a.D(this.e.j());
    }

    public Long d(int n8) {
        if (n8 >= this.b() && n8 <= this.m()) {
            return this.a.E(this.n(n8));
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public TextView e(int var1_1, View var2_2, ViewGroup var3_3) {
        this.f(var3_3.getContext());
        var5_4 = (TextView)var2_2;
        if (var2_2 == null) {
            var5_4 = (TextView)LayoutInflater.from((Context)var3_3.getContext()).inflate(i.p, var3_3, false);
        }
        if ((var4_5 = var1_1 - this.b()) < 0) ** GOTO lbl-1000
        var2_2 = this.a;
        if (var4_5 < var2_2.f0) {
            var5_4.setTag(var2_2);
            var5_4.setText((CharSequence)String.format(var5_4.getResources().getConfiguration().locale, "%d", new Object[]{++var4_5}));
            var5_4.setVisibility(0);
            var5_4.setEnabled(true);
        } else lbl-1000:
        // 2 sources

        {
            var5_4.setVisibility(8);
            var5_4.setEnabled(false);
            var4_5 = -1;
        }
        var2_2 = this.d(var1_1);
        if (var2_2 == null) {
            return var5_4;
        }
        this.o(var5_4, var2_2.longValue(), var4_5);
        return var5_4;
    }

    boolean g(long l8) {
        Iterator<ax.b0.c<Long, Long>> iterator = this.b.l().iterator();
        while (iterator.hasNext()) {
            Object s8 = iterator.next().b;
            if (s8 == null || (Long)s8 != l8) continue;
            return true;
        }
        return false;
    }

    public int getCount() {
        return h;
    }

    public long getItemId(int n8) {
        return n8 / this.a.e0;
    }

    boolean h(int n8) {
        return n8 % this.a.e0 == 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    boolean i(int n8) {
        return (n8 + 1) % this.a.e0 == 0;
    }

    boolean k(long l8) {
        Iterator<ax.b0.c<Long, Long>> iterator = this.b.l().iterator();
        while (iterator.hasNext()) {
            Object f8 = iterator.next().a;
            if (f8 == null || (Long)f8 != l8) continue;
            return true;
        }
        return false;
    }

    int m() {
        return this.b() + this.a.f0 - 1;
    }

    int n(int n8) {
        return n8 - this.b() + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Object object = this.c.iterator();
        while (object.hasNext()) {
            this.p(materialCalendarGridView, object.next());
        }
        object = this.b;
        if (object != null) {
            object = object.w().iterator();
            while (object.hasNext()) {
                this.p(materialCalendarGridView, object.next());
            }
            this.c = this.b.w();
        }
    }

    boolean r(int n8) {
        return n8 >= this.b() && n8 <= this.m();
    }
}

