package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.f();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        bVar.c(new d(colorStateList, f));
        View g = bVar.g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        n(bVar, f3);
    }

    @Override // androidx.cardview.widget.c
    public void b(b bVar, float f) {
        o(bVar).h(f);
    }

    @Override // androidx.cardview.widget.c
    public float c(b bVar) {
        return bVar.g().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void e(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void f(b bVar, float f) {
        bVar.g().setElevation(f);
    }

    @Override // androidx.cardview.widget.c
    public float g(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList h(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public void i() {
    }

    @Override // androidx.cardview.widget.c
    public float j(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float k(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void l(b bVar) {
        n(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f) {
        o(bVar).g(f, bVar.e(), bVar.d());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.e()) {
            bVar.b(0, 0, 0, 0);
            return;
        }
        float g = g(bVar);
        float d = d(bVar);
        int ceil = (int) Math.ceil(e.a(g, d, bVar.d()));
        int ceil2 = (int) Math.ceil(e.b(g, d, bVar.d()));
        bVar.b(ceil, ceil2, ceil, ceil2);
    }
}
