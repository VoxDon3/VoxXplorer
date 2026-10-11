package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import ax.F6.z;
import ax.b0.C1442c;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.k6.C2406g;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    class a extends C1753a {
        a() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.o0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().m());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public n getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a2;
        int d;
        int a3;
        int d2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n adapter = materialCalendarGridView.getAdapter();
        ax.A6.d<?> dVar = adapter.b;
        c cVar = adapter.d;
        int max = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.m(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<C1442c<Long, Long>> it = dVar.l().iterator();
        while (it.hasNext()) {
            C1442c<Long, Long> next = it.next();
            Long l = next.a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.b != null) {
                Long l2 = l;
                long longValue = l2.longValue();
                Long l3 = next.b;
                long longValue2 = l3.longValue();
                if (!e(item, item2, l2, l3)) {
                    boolean h = z.h(materialCalendarGridView);
                    if (longValue < item.longValue()) {
                        d = adapter.h(max) ? 0 : !h ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        a2 = max;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue);
                        a2 = adapter.a(materialCalendarGridView.a.get(5));
                        d = d(materialCalendarGridView.c(a2));
                    }
                    if (longValue2 > item2.longValue()) {
                        d2 = adapter.i(min) ? materialCalendarGridView.getWidth() : !h ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        a3 = min;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue2);
                        a3 = adapter.a(materialCalendarGridView.a.get(5));
                        d2 = d(materialCalendarGridView.c(a3));
                    }
                    int itemId = (int) adapter.getItemId(a2);
                    int i3 = max;
                    int i4 = min;
                    int itemId2 = (int) adapter.getItemId(a3);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        n nVar = adapter;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View c = materialCalendarGridView.c(numColumns);
                        int top = c.getTop() + cVar.a.c();
                        Iterator<C1442c<Long, Long>> it2 = it;
                        int bottom = c.getBottom() - cVar.a.b();
                        if (h) {
                            int i5 = a3 > numColumns2 ? 0 : d2;
                            int width = numColumns > a2 ? getWidth() : d;
                            i = i5;
                            i2 = width;
                        } else {
                            i = numColumns > a2 ? 0 : d;
                            i2 = a3 > numColumns2 ? getWidth() : d2;
                        }
                        canvas.drawRect(i, top, i2, bottom, cVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = nVar;
                        it = it2;
                    }
                    materialCalendarGridView = this;
                    max = i3;
                    min = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().m())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = t.r();
        if (k.t3(getContext())) {
            setNextFocusLeftId(C2406g.a);
            setNextFocusRightId(C2406g.d);
        }
        this.b = k.v3(getContext());
        C1760d0.l0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
