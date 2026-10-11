package ax.i2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;
import ax.i2.C2263n;

/* renamed from: ax.i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2253d<K> extends C2263n.b<K> {
    private static final Rect e = new Rect(0, 0, 0, 0);
    private final RecyclerView a;
    private final Drawable b;
    private final p<K> c;
    private final AbstractC2244I.c<K> d;

    /* renamed from: ax.i2.d$a */
    class a extends RecyclerView.o {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b) {
            C2253d.this.l(canvas);
        }
    }

    C2253d(RecyclerView recyclerView, int i, p<K> pVar, AbstractC2244I.c<K> cVar) {
        C1446g.a(recyclerView != null);
        this.a = recyclerView;
        Drawable e2 = ax.Q.b.e(recyclerView.getContext(), i);
        this.b = e2;
        C1446g.a(e2 != null);
        C1446g.a(pVar != null);
        C1446g.a(cVar != null);
        this.c = pVar;
        this.d = cVar;
        recyclerView.j(new a());
    }

    @Override // ax.i2.C2252c.AbstractC0333c
    void a(RecyclerView.u uVar) {
        this.a.n(uVar);
    }

    @Override // ax.i2.C2252c.AbstractC0333c
    C2263n<K> b() {
        return new C2263n<>(this, this.c, this.d);
    }

    @Override // ax.i2.C2252c.AbstractC0333c
    void c() {
        this.b.setBounds(e);
        this.a.invalidate();
    }

    @Override // ax.i2.C2252c.AbstractC0333c
    void d(Rect rect) {
        this.b.setBounds(rect);
        this.a.invalidate();
    }

    @Override // ax.i2.C2263n.b
    Point e(Point point) {
        return new Point(point.x + this.a.computeHorizontalScrollOffset(), point.y + this.a.computeVerticalScrollOffset());
    }

    @Override // ax.i2.C2263n.b
    Rect f(int i) {
        View childAt = this.a.getChildAt(i);
        Rect rect = new Rect();
        childAt.getHitRect(rect);
        rect.left += this.a.computeHorizontalScrollOffset();
        rect.right += this.a.computeHorizontalScrollOffset();
        rect.top += this.a.computeVerticalScrollOffset();
        rect.bottom += this.a.computeVerticalScrollOffset();
        return rect;
    }

    @Override // ax.i2.C2263n.b
    int g(int i) {
        RecyclerView recyclerView = this.a;
        return recyclerView.k0(recyclerView.getChildAt(i));
    }

    @Override // ax.i2.C2263n.b
    int h() {
        RecyclerView.p layoutManager = this.a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).Z2();
        }
        return 1;
    }

    @Override // ax.i2.C2263n.b
    int i() {
        return this.a.getChildCount();
    }

    @Override // ax.i2.C2263n.b
    boolean j(int i) {
        return this.a.e0(i) != null;
    }

    @Override // ax.i2.C2263n.b
    void k(RecyclerView.u uVar) {
        this.a.n1(uVar);
    }

    void l(Canvas canvas) {
        this.b.draw(canvas);
    }
}
