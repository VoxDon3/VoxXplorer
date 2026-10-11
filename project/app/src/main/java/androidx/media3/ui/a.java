/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.C;
import androidx.media3.ui.F;
import androidx.media3.ui.SubtitleView;
import ax.R0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class a
extends View
implements SubtitleView.a {
    private final List<C> a = new ArrayList<C>();
    private List<ax.R0.a> b = Collections.EMPTY_LIST;
    private int c = 0;
    private float d = 0.0533f;
    private ax.a2.a e = ax.a2.a.g;
    private float f = 0.08f;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static ax.R0.a b(ax.R0.a a8) {
        a.b b8 = a8.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (a8.f == 0) {
            b8.h(1.0f - a8.e, 0);
        } else {
            b8.h(-a8.e - 1.0f, 1);
        }
        int n8 = a8.g;
        if (n8 != 0) {
            if (n8 == 2) {
                b8.i(0);
            }
        } else {
            b8.i(2);
        }
        return b8.a();
    }

    @Override
    public void a(List<ax.R0.a> list, ax.a2.a a8, float f8, int n8, float f9) {
        this.b = list;
        this.e = a8;
        this.d = f8;
        this.c = n8;
        this.f = f9;
        while (this.a.size() < list.size()) {
            this.a.add(new C(this.getContext()));
        }
        this.invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<ax.R0.a> list = this.b;
        if (!list.isEmpty()) {
            int n8;
            float f8;
            int n9 = this.getHeight();
            int n10 = this.getPaddingLeft();
            int n11 = this.getPaddingTop();
            int n12 = this.getWidth() - this.getPaddingRight();
            int n13 = n9 - this.getPaddingBottom();
            if (n13 > n11 && n12 > n10 && !((f8 = F.f(this.c, this.d, n9, n8 = n13 - n11)) <= 0.0f)) {
                int n14 = list.size();
                for (int i8 = 0; i8 < n14; ++i8) {
                    ax.R0.a a8;
                    ax.R0.a a9 = a8 = list.get(i8);
                    if (a8.p != Integer.MIN_VALUE) {
                        a9 = androidx.media3.ui.a.b(a8);
                    }
                    float f9 = F.f(a9.n, a9.o, n9, n8);
                    this.a.get(i8).b(a9, this.e, f8, f9, this.f, canvas, n10, n11, n12, n13);
                }
            }
        }
    }
}

