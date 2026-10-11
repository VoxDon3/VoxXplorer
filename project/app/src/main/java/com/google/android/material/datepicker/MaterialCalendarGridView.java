/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import ax.A6.d;
import ax.F6.z;
import ax.c0.a;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.g;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.k;
import com.google.android.material.datepicker.n;
import com.google.android.material.datepicker.t;
import java.util.Calendar;

final class MaterialCalendarGridView
extends GridView {
    private final Calendar a = t.r();
    private final boolean b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        if (k.t3(this.getContext())) {
            this.setNextFocusLeftId(g.a);
            this.setNextFocusRightId(g.d);
        }
        this.b = k.v3(this.getContext());
        d0.l0((View)this, new a(this){
            final MaterialCalendarGridView d;
            {
                this.d = materialCalendarGridView;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.o0(null);
            }
        });
    }

    private void a(int n8, Rect rect) {
        if (n8 == 33) {
            this.setSelection(this.b().m());
            return;
        }
        if (n8 == 130) {
            this.setSelection(this.b().b());
            return;
        }
        super.onFocusChanged(true, n8, rect);
    }

    private View c(int n8) {
        return this.getChildAt(n8 - this.getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + view.getWidth() / 2;
    }

    private static boolean e(Long l8, Long l9, Long l10, Long l11) {
        return l8 == null || l9 == null || l10 == null || l11 == null || l10 > l9 || l11 < l8;
        {
        }
    }

    public n b() {
        return (n)super.getAdapter();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b().notifyDataSetChanged();
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n n8 = this.b();
        d<?> d8 = n8.b;
        c c8 = n8.d;
        int n9 = Math.max(n8.b(), this.getFirstVisiblePosition());
        int n10 = Math.min(n8.m(), this.getLastVisiblePosition());
        Long l8 = n8.d(n9);
        Long l9 = n8.d(n10);
        for (ax.b0.c c9 : d8.l()) {
            int n11;
            int n12;
            int n13;
            int n14;
            Object object2 = c9.a;
            if (object2 == null || c9.b == null) continue;
            object2 = (Long)object2;
            long l10 = (Long)object2;
            Long l11 = (Long)c9.b;
            long l112 = l11;
            if (MaterialCalendarGridView.e(l8, l9, (Long)object2, l11)) continue;
            boolean bl = z.h((View)this);
            if (l10 < l8) {
                n14 = n8.h(n9) ? 0 : (!bl ? this.c(n9 - 1).getRight() : this.c(n9 - 1).getLeft());
                n13 = n9;
            } else {
                this.a.setTimeInMillis(l10);
                n13 = n8.a(this.a.get(5));
                n14 = MaterialCalendarGridView.d(this.c(n13));
            }
            if (l112 > l9) {
                n12 = n8.i(n10) ? this.getWidth() : (!bl ? this.c(n10).getRight() : this.c(n10).getLeft());
                n11 = n10;
            } else {
                this.a.setTimeInMillis(l112);
                n11 = n8.a(this.a.get(5));
                n12 = MaterialCalendarGridView.d(this.c(n11));
            }
            int n15 = (int)n8.getItemId(n11);
            for (int i8 = (int)n8.getItemId(n13); i8 <= n15; ++i8) {
                int n16;
                int n17 = this.getNumColumns() * i8;
                int n18 = n17 + this.getNumColumns() - 1;
                object2 = this.c(n17);
                int n19 = object2.getTop();
                int n20 = c8.a.c();
                int n21 = object2.getBottom();
                int n22 = c8.a.b();
                if (!bl) {
                    n16 = n17 > n13 ? 0 : n14;
                    n17 = n11 > n18 ? this.getWidth() : n12;
                } else {
                    n16 = n11 > n18 ? 0 : n12;
                    n17 = n17 > n13 ? this.getWidth() : n14;
                }
                canvas.drawRect((float)n16, (float)(n19 + n20), (float)n17, (float)(n21 - n22), c8.h);
            }
        }
    }

    protected void onFocusChanged(boolean bl, int n8, Rect rect) {
        if (bl) {
            this.a(n8, rect);
            return;
        }
        super.onFocusChanged(false, n8, rect);
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (!super.onKeyDown(n8, keyEvent)) {
            return false;
        }
        int n9 = this.getSelectedItemPosition();
        if (n9 != -1 && (n9 < this.b().b() || n9 > this.b().m())) {
            if (19 == n8) {
                this.setSelection(this.b().b());
                return true;
            }
            return false;
        }
        return true;
    }

    public void onMeasure(int n8, int n9) {
        if (this.b) {
            super.onMeasure(n8, View.MeasureSpec.makeMeasureSpec((int)0xFFFFFF, (int)Integer.MIN_VALUE));
            this.getLayoutParams().height = this.getMeasuredHeight();
            return;
        }
        super.onMeasure(n8, n9);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
    }

    public void setSelection(int n8) {
        if (n8 < this.b().b()) {
            super.setSelection(this.b().b());
            return;
        }
        super.setSelection(n8);
    }
}

