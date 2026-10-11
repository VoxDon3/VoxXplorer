/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.k6.i;
import com.google.android.material.datepicker.g;
import com.google.android.material.datepicker.j;
import com.google.android.material.datepicker.m;
import com.google.android.material.datepicker.t;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

class u
extends RecyclerView.h<b> {
    private final j<?> d;

    u(j<?> j8) {
        this.d = j8;
    }

    private View.OnClickListener O(int n8) {
        return new View.OnClickListener(){
            final int a;
            final u b;
            {
                this.b = u8;
                this.a = n8;
            }

            public void onClick(View object) {
                object = m.j(this.a, ((u)this.b).d.Z2().c0);
                object = this.b.d.X2().f((m)object);
                this.b.d.h3((m)object);
                this.b.d.i3(j.l.q);
                this.b.d.g3();
            }
        };
    }

    int P(int n8) {
        return n8 - this.d.X2().o().d0;
    }

    int Q(int n8) {
        return this.d.X2().o().d0 + n8;
    }

    public void R(b b8, int n8) {
        n8 = this.Q(n8);
        Object object = b8.u;
        Object object2 = Locale.getDefault();
        boolean bl = true;
        object.setText((CharSequence)String.format((Locale)object2, "%d", n8));
        object2 = b8.u;
        object2.setContentDescription((CharSequence)g.k(object2.getContext(), n8));
        object = this.d.Y2();
        Calendar calendar = t.p();
        object2 = calendar.get(1) == n8 ? object.f : object.d;
        Iterator<Long> iterator = this.d.a3().w().iterator();
        while (iterator.hasNext()) {
            calendar.setTimeInMillis(iterator.next());
            if (calendar.get(1) != n8) continue;
            object2 = object.e;
        }
        ((com.google.android.material.datepicker.b)object2).d(b8.u);
        calendar = b8.u;
        if (object2 != object.e) {
            bl = false;
        }
        calendar.setSelected(bl);
        b8.u.setOnClickListener(this.O(n8));
    }

    public b S(ViewGroup viewGroup, int n8) {
        return new b((TextView)LayoutInflater.from((Context)viewGroup.getContext()).inflate(i.u, viewGroup, false));
    }

    @Override
    public int l() {
        return this.d.X2().v();
    }

    public static class b
    extends RecyclerView.F {
        final TextView u;

        b(TextView textView) {
            super((View)textView);
            this.u = textView;
        }
    }
}

