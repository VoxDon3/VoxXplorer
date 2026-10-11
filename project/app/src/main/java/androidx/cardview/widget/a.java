/*
 * Decompiled with CFR 0.152.
 */
package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.b;
import androidx.cardview.widget.c;
import androidx.cardview.widget.d;
import androidx.cardview.widget.e;

class a
implements c {
    a() {
    }

    private d o(b b8) {
        return (d)b8.f();
    }

    @Override
    public void a(b b8, Context context, ColorStateList colorStateList, float f8, float f9, float f10) {
        b8.c(new d(colorStateList, f8));
        context = b8.g();
        context.setClipToOutline(true);
        context.setElevation(f9);
        this.n(b8, f10);
    }

    @Override
    public void b(b b8, float f8) {
        this.o(b8).h(f8);
    }

    @Override
    public float c(b b8) {
        return b8.g().getElevation();
    }

    @Override
    public float d(b b8) {
        return this.o(b8).d();
    }

    @Override
    public void e(b b8) {
        this.n(b8, this.g(b8));
    }

    @Override
    public void f(b b8, float f8) {
        b8.g().setElevation(f8);
    }

    @Override
    public float g(b b8) {
        return this.o(b8).c();
    }

    @Override
    public ColorStateList h(b b8) {
        return this.o(b8).b();
    }

    @Override
    public void i() {
    }

    @Override
    public float j(b b8) {
        return this.d(b8) * 2.0f;
    }

    @Override
    public float k(b b8) {
        return this.d(b8) * 2.0f;
    }

    @Override
    public void l(b b8) {
        this.n(b8, this.g(b8));
    }

    @Override
    public void m(b b8, ColorStateList colorStateList) {
        this.o(b8).f(colorStateList);
    }

    @Override
    public void n(b b8, float f8) {
        this.o(b8).g(f8, b8.e(), b8.d());
        this.p(b8);
    }

    public void p(b b8) {
        if (!b8.e()) {
            b8.b(0, 0, 0, 0);
            return;
        }
        float f8 = this.g(b8);
        float f9 = this.d(b8);
        int n8 = (int)Math.ceil(e.a(f8, f9, b8.d()));
        int n9 = (int)Math.ceil(e.b(f8, f9, b8.d()));
        b8.b(n8, n9, n8, n9);
    }
}

