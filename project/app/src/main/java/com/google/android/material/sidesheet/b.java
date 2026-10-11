/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.d;
import com.google.android.material.sidesheet.e;

final class b
extends d {
    final SideSheetBehavior<? extends View> a;

    b(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override
    float b(int n8) {
        float f8 = this.e();
        float f9 = this.d();
        return (f8 - (float)n8) / (f8 - f9);
    }

    @Override
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override
    int d() {
        return Math.max(0, this.e() - this.a.d0() - this.a.k0());
    }

    @Override
    int e() {
        return this.a.n0();
    }

    @Override
    int f() {
        return this.a.n0();
    }

    @Override
    int g() {
        return this.d();
    }

    @Override
    <V extends View> int h(V v8) {
        return v8.getLeft() - this.a.k0();
    }

    @Override
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override
    int j() {
        return 0;
    }

    @Override
    boolean k(float f8) {
        return f8 < 0.0f;
    }

    @Override
    boolean l(View view) {
        return view.getLeft() > (this.e() + this.d()) / 2;
    }

    @Override
    boolean m(float f8, float f9) {
        return e.a(f8, f9) && Math.abs(f8) > (float)this.a.o0();
    }

    @Override
    boolean n(View view, float f8) {
        return Math.abs((float)view.getRight() + f8 * this.a.i0()) > this.a.j0();
    }

    @Override
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int n8) {
        marginLayoutParams.rightMargin = n8;
    }

    @Override
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int n8, int n9) {
        n9 = this.a.n0();
        if (n8 <= n9) {
            marginLayoutParams.rightMargin = n9 - n8;
        }
    }
}

