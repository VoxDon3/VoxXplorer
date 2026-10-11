/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.d;

class c<V extends View>
extends CoordinatorLayout.c<V> {
    private d a;
    private int b = 0;
    private int c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int I() {
        d d8 = this.a;
        if (d8 != null) {
            return d8.b();
        }
        return 0;
    }

    protected void J(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        coordinatorLayout.I((View)v8, n8);
    }

    public boolean K(int n8) {
        d d8 = this.a;
        if (d8 != null) {
            return d8.e(n8);
        }
        this.b = n8;
        return false;
    }

    @Override
    public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        this.J(coordinatorLayout, v8, n8);
        if (this.a == null) {
            this.a = new d((View)v8);
        }
        this.a.c();
        this.a.a();
        n8 = this.b;
        if (n8 != 0) {
            this.a.e(n8);
            this.b = 0;
        }
        if ((n8 = this.c) != 0) {
            this.a.d(n8);
            this.c = 0;
        }
        return true;
    }
}

