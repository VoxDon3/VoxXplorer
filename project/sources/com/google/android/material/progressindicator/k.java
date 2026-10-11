package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ax.k6.C2405f;
import ax.w2.AbstractC3330b;
import ax.w2.C3338j;
import com.google.android.material.progressindicator.b;

/* loaded from: classes3.dex */
public final class k<S extends b> extends h {
    private i<S> r;
    private j<ObjectAnimator> s;
    private Drawable t;

    k(Context context, b bVar, i<S> iVar, j<ObjectAnimator> jVar) {
        super(context, bVar);
        B(iVar);
        A(jVar);
    }

    static k<f> v(Context context, f fVar, c cVar) {
        k<f> kVar = new k<>(context, fVar, cVar, fVar.o == 1 ? new e(context, fVar) : new d(fVar));
        kVar.C(C3338j.b(context.getResources(), C2405f.c, null));
        return kVar;
    }

    static k<o> w(Context context, o oVar, l lVar) {
        return new k<>(context, oVar, lVar, oVar.o == 0 ? new m(oVar) : new n(context, oVar));
    }

    private boolean z() {
        ax.I6.a aVar = this.c;
        return aVar != null && aVar.a(this.a.getContentResolver()) == 0.0f;
    }

    void A(j<ObjectAnimator> jVar) {
        this.s = jVar;
        jVar.e(this);
    }

    void B(i<S> iVar) {
        this.r = iVar;
    }

    public void C(Drawable drawable) {
        this.t = drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.k.draw(android.graphics.Canvas):void");
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r.f();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ void o(AbstractC3330b abstractC3330b) {
        super.o(abstractC3330b);
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean s(boolean z, boolean z2, boolean z3) {
        return super.s(z, z2, z3);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.h, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.h
    boolean t(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean t = super.t(z, z2, z3);
        if (z() && (drawable = this.t) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.s.a();
        }
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && !z()))) {
            this.s.g();
        }
        return t;
    }

    @Override // com.google.android.material.progressindicator.h
    public /* bridge */ /* synthetic */ boolean u(AbstractC3330b abstractC3330b) {
        return super.u(abstractC3330b);
    }

    j<ObjectAnimator> x() {
        return this.s;
    }

    i<S> y() {
        return this.r;
    }
}
