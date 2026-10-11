/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.A6.d;
import ax.A6.f;
import ax.c0.d0;
import ax.k6.g;
import ax.k6.i;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.j;
import com.google.android.material.datepicker.k;
import com.google.android.material.datepicker.m;
import com.google.android.material.datepicker.n;

class o
extends RecyclerView.h<b> {
    private final a d;
    private final d<?> e;
    private final f f;
    private final j.m g;
    private final int h;

    o(Context context, d<?> d8, a a8, f f8, j.m m8) {
        m m9 = a8.o();
        m m10 = a8.i();
        m m11 = a8.m();
        if (m9.d(m11) <= 0) {
            if (m11.d(m10) <= 0) {
                int n8 = n.g;
                int n9 = j.b3(context);
                int n10 = k.t3(context) ? j.b3(context) : 0;
                this.h = n8 * n9 + n10;
                this.d = a8;
                this.e = d8;
                this.f = f8;
                this.g = m8;
                this.K(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    m O(int n8) {
        return this.d.o().I(n8);
    }

    CharSequence P(int n8) {
        return this.O(n8).G();
    }

    int Q(m m8) {
        return this.d.o().J(m8);
    }

    public void R(b object, int n8) {
        m m8 = this.d.o().I(n8);
        ((b)object).u.setText((CharSequence)m8.G());
        object = (MaterialCalendarGridView)((b)object).v.findViewById(ax.k6.g.s);
        if (((MaterialCalendarGridView)((Object)object)).b() != null && m8.equals(((MaterialCalendarGridView)((Object)object)).b().a)) {
            object.invalidate();
            ((MaterialCalendarGridView)((Object)object)).b().q((MaterialCalendarGridView)((Object)object));
        } else {
            n n9 = new n(m8, this.e, this.d, this.f);
            object.setNumColumns(m8.e0);
            ((MaterialCalendarGridView)((Object)object)).setAdapter((ListAdapter)n9);
        }
        object.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            final MaterialCalendarGridView a;
            final o b;
            {
                this.b = o8;
                this.a = materialCalendarGridView;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                if (this.a.b().r(n8)) {
                    this.b.g.a(this.a.b().d(n8));
                }
            }
        });
    }

    public b S(ViewGroup viewGroup, int n8) {
        LinearLayout linearLayout = (LinearLayout)LayoutInflater.from((Context)viewGroup.getContext()).inflate(i.s, viewGroup, false);
        if (k.t3(viewGroup.getContext())) {
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.q(-1, this.h));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override
    public int l() {
        return this.d.k();
    }

    @Override
    public long m(int n8) {
        return this.d.o().I(n8).H();
    }

    public static class b
    extends RecyclerView.F {
        final TextView u;
        final MaterialCalendarGridView v;

        b(LinearLayout linearLayout, boolean bl) {
            super((View)linearLayout);
            TextView textView;
            this.u = textView = (TextView)linearLayout.findViewById(ax.k6.g.w);
            d0.m0((View)textView, true);
            this.v = (MaterialCalendarGridView)linearLayout.findViewById(ax.k6.g.s);
            if (!bl) {
                textView.setVisibility(8);
            }
        }
    }
}

