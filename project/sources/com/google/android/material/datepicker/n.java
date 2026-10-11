package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ax.b0.C1442c;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
class n extends BaseAdapter {
    static final int g = t.r().getMaximum(4);
    private static final int h = (t.r().getMaximum(5) + t.r().getMaximum(7)) - 1;
    final m a;
    final ax.A6.d<?> b;
    private Collection<Long> c;
    c d;
    final a e;
    final ax.A6.f f;

    n(m mVar, ax.A6.d<?> dVar, a aVar, ax.A6.f fVar) {
        this.a = mVar;
        this.b = dVar;
        this.e = aVar;
        this.f = fVar;
        this.c = dVar.w();
    }

    private String c(Context context, long j) {
        return g.e(context, j, l(j), k(j), g(j));
    }

    private void f(Context context) {
        if (this.d == null) {
            this.d = new c(context);
        }
    }

    private boolean j(long j) {
        Iterator<Long> it = this.b.w().iterator();
        while (it.hasNext()) {
            if (t.a(j) == t.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j) {
        return t.p().getTimeInMillis() == j;
    }

    private void o(TextView textView, long j, int i) {
        b bVar;
        boolean z;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String c = c(context, j);
        textView.setContentDescription(c);
        boolean t = this.e.g().t(j);
        if (t) {
            textView.setEnabled(true);
            boolean j2 = j(j);
            textView.setSelected(j2);
            bVar = j2 ? this.d.b : l(j) ? this.d.c : this.d.a;
            z = j2;
        } else {
            textView.setEnabled(false);
            bVar = this.d.g;
            z = false;
        }
        ax.A6.f fVar = this.f;
        if (fVar == null || i == -1) {
            bVar.d(textView);
            return;
        }
        m mVar = this.a;
        int i2 = mVar.d0;
        int i3 = mVar.c0;
        bVar.e(textView, fVar.a(context, i2, i3, i, t, z), this.f.g(context, i2, i3, i, t, z));
        textView.setCompoundDrawables(this.f.c(context, i2, i3, i, t, z), this.f.e(context, i2, i3, i, t, z), this.f.d(context, i2, i3, i, t, z), this.f.b(context, i2, i3, i, t, z));
        textView.setContentDescription(this.f.f(context, i2, i3, i, t, z, c));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (m.B(j).equals(this.a)) {
            int F = this.a.F(j);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(F) - materialCalendarGridView.getFirstVisiblePosition()), j, F);
        }
    }

    int a(int i) {
        return b() + (i - 1);
    }

    int b() {
        return this.a.D(this.e.j());
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < b() || i > m()) {
            return null;
        }
        return Long.valueOf(this.a.E(n(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = ax.k6.C2408i.p
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.m r8 = r5.a
            int r3 = r8.f0
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.o(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j) {
        Iterator<C1442c<Long, Long>> it = this.b.l().iterator();
        while (it.hasNext()) {
            Long l = it.next().b;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.e0;
    }

    boolean h(int i) {
        return i % this.a.e0 == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i) {
        return (i + 1) % this.a.e0 == 0;
    }

    boolean k(long j) {
        Iterator<C1442c<Long, Long>> it = this.b.l().iterator();
        while (it.hasNext()) {
            Long l = it.next().a;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.a.f0) - 1;
    }

    int n(int i) {
        return (i - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.c.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        ax.A6.d<?> dVar = this.b;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.w().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.c = this.b.w();
        }
    }

    boolean r(int i) {
        return i >= b() && i <= m();
    }
}
