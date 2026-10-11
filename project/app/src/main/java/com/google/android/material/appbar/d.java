/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.view.View;
import ax.c0.d0;

class d {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public d(View view) {
        this.a = view;
    }

    void a() {
        View view = this.a;
        d0.W(view, this.d - (view.getTop() - this.b));
        view = this.a;
        d0.V(view, this.e - (view.getLeft() - this.c));
    }

    public int b() {
        return this.d;
    }

    void c() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean d(int n8) {
        if (this.g && this.e != n8) {
            this.e = n8;
            this.a();
            return true;
        }
        return false;
    }

    public boolean e(int n8) {
        if (this.f && this.d != n8) {
            this.d = n8;
            this.a();
            return true;
        }
        return false;
    }
}

