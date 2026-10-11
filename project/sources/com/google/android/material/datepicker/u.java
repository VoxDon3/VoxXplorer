package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.k6.C2408i;
import com.google.android.material.datepicker.j;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
class u extends RecyclerView.h<b> {
    private final j<?> d;

    class a implements View.OnClickListener {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u.this.d.h3(u.this.d.X2().f(m.j(this.a, u.this.d.Z2().c0)));
            u.this.d.i3(j.l.DAY);
            u.this.d.g3();
        }
    }

    public static class b extends RecyclerView.F {
        final TextView u;

        b(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    u(j<?> jVar) {
        this.d = jVar;
    }

    private View.OnClickListener O(int i) {
        return new a(i);
    }

    int P(int i) {
        return i - this.d.X2().o().d0;
    }

    int Q(int i) {
        return this.d.X2().o().d0 + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void B(b bVar, int i) {
        int Q = Q(i);
        bVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(Q)));
        TextView textView = bVar.u;
        textView.setContentDescription(g.k(textView.getContext(), Q));
        c Y2 = this.d.Y2();
        Calendar p = t.p();
        com.google.android.material.datepicker.b bVar2 = p.get(1) == Q ? Y2.f : Y2.d;
        Iterator<Long> it = this.d.a3().w().iterator();
        while (it.hasNext()) {
            p.setTimeInMillis(it.next().longValue());
            if (p.get(1) == Q) {
                bVar2 = Y2.e;
            }
        }
        bVar2.d(bVar.u);
        bVar.u.setSelected(bVar2 == Y2.e);
        bVar.u.setOnClickListener(O(Q));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b D(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2408i.u, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.d.X2().v();
    }
}
