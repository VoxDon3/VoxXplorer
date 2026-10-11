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
import ax.c0.C1760d0;
import ax.k6.C2406g;
import ax.k6.C2408i;
import com.google.android.material.datepicker.j;

/* loaded from: classes3.dex */
class o extends RecyclerView.h<b> {
    private final com.google.android.material.datepicker.a d;
    private final ax.A6.d<?> e;
    private final ax.A6.f f;
    private final j.m g;
    private final int h;

    class a implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialCalendarGridView a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.a.getAdapter().r(i)) {
                o.this.g.a(this.a.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {
        final TextView u;
        final MaterialCalendarGridView v;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C2406g.w);
            this.u = textView;
            C1760d0.m0(textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(C2406g.s);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(Context context, ax.A6.d<?> dVar, com.google.android.material.datepicker.a aVar, ax.A6.f fVar, j.m mVar) {
        m o = aVar.o();
        m i = aVar.i();
        m m = aVar.m();
        if (o.compareTo(m) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (m.compareTo(i) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.h = (n.g * j.b3(context)) + (k.t3(context) ? j.b3(context) : 0);
        this.d = aVar;
        this.e = dVar;
        this.f = fVar;
        this.g = mVar;
        K(true);
    }

    m O(int i) {
        return this.d.o().I(i);
    }

    CharSequence P(int i) {
        return O(i).G();
    }

    int Q(m mVar) {
        return this.d.o().J(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void B(b bVar, int i) {
        m I = this.d.o().I(i);
        bVar.u.setText(I.G());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(C2406g.s);
        if (materialCalendarGridView.getAdapter() == null || !I.equals(materialCalendarGridView.getAdapter().a)) {
            n nVar = new n(I, this.e, this.d, this.f);
            materialCalendarGridView.setNumColumns(I.e0);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b D(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C2408i.s, viewGroup, false);
        if (!k.t3(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.d.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long m(int i) {
        return this.d.o().I(i).H();
    }
}
