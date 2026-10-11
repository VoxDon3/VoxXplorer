/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.Q.b;
import ax.b0.g;
import ax.i2.I;
import ax.i2.n;
import ax.i2.p;

final class d<K>
extends n.b<K> {
    private static final Rect e = new Rect(0, 0, 0, 0);
    private final RecyclerView a;
    private final Drawable b;
    private final p<K> c;
    private final I.c<K> d;

    d(RecyclerView recyclerView, int n8, p<K> p8, I.c<K> c8) {
        Drawable drawable;
        boolean bl = false;
        boolean bl2 = recyclerView != null;
        g.a(bl2);
        this.a = recyclerView;
        this.b = drawable = ax.Q.b.e(recyclerView.getContext(), n8);
        bl2 = drawable != null;
        g.a(bl2);
        bl2 = p8 != null;
        g.a(bl2);
        bl2 = bl;
        if (c8 != null) {
            bl2 = true;
        }
        g.a(bl2);
        this.c = p8;
        this.d = c8;
        recyclerView.j(new RecyclerView.o(this){
            final d a;
            {
                this.a = d8;
            }

            @Override
            public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
                this.a.l(canvas);
            }
        });
    }

    @Override
    void a(RecyclerView.u u8) {
        this.a.n(u8);
    }

    @Override
    n<K> b() {
        return new n<K>(this, this.c, this.d);
    }

    @Override
    void c() {
        this.b.setBounds(e);
        this.a.invalidate();
    }

    @Override
    void d(Rect rect) {
        this.b.setBounds(rect);
        this.a.invalidate();
    }

    @Override
    Point e(Point point) {
        return new Point(point.x + this.a.computeHorizontalScrollOffset(), point.y + this.a.computeVerticalScrollOffset());
    }

    @Override
    Rect f(int n8) {
        View view = this.a.getChildAt(n8);
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.left += this.a.computeHorizontalScrollOffset();
        rect.right += this.a.computeHorizontalScrollOffset();
        rect.top += this.a.computeVerticalScrollOffset();
        rect.bottom += this.a.computeVerticalScrollOffset();
        return rect;
    }

    @Override
    int g(int n8) {
        RecyclerView recyclerView = this.a;
        return recyclerView.k0(recyclerView.getChildAt(n8));
    }

    @Override
    int h() {
        RecyclerView.p p8 = this.a.getLayoutManager();
        if (p8 instanceof GridLayoutManager) {
            return ((GridLayoutManager)p8).Z2();
        }
        return 1;
    }

    @Override
    int i() {
        return this.a.getChildCount();
    }

    @Override
    boolean j(int n8) {
        return this.a.e0(n8) != null;
    }

    @Override
    void k(RecyclerView.u u8) {
        this.a.n1(u8);
    }

    void l(Canvas canvas) {
        this.b.draw(canvas);
    }
}

