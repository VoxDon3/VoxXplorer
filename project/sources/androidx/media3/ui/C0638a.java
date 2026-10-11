package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import ax.R0.a;
import ax.a2.C1317a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.ui.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0638a extends View implements SubtitleView.a {
    private final List<C> a;
    private List<ax.R0.a> b;
    private int c;
    private float d;
    private C1317a e;
    private float f;

    public C0638a(Context context) {
        this(context, null);
    }

    private static ax.R0.a b(ax.R0.a aVar) {
        a.b p = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (aVar.f == 0) {
            p.h(1.0f - aVar.e, 0);
        } else {
            p.h((-aVar.e) - 1.0f, 1);
        }
        int i = aVar.g;
        if (i == 0) {
            p.i(2);
        } else if (i == 2) {
            p.i(0);
        }
        return p.a();
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<ax.R0.a> list, C1317a c1317a, float f, int i, float f2) {
        this.b = list;
        this.e = c1317a;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (this.a.size() < list.size()) {
            this.a.add(new C(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<ax.R0.a> list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float f = F.f(this.c, this.d, height, i);
        if (f <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ax.R0.a aVar = list.get(i2);
            if (aVar.p != Integer.MIN_VALUE) {
                aVar = b(aVar);
            }
            this.a.get(i2).b(aVar, this.e, f, F.f(aVar.n, aVar.o, height, i), this.f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public C0638a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0;
        this.d = 0.0533f;
        this.e = C1317a.g;
        this.f = 0.08f;
    }
}
