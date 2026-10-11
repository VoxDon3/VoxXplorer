/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import ax.d8.d;
import ax.j6.k;
import com.google.firebase.installations.g;
import com.google.firebase.installations.h;
import com.google.firebase.installations.i;

class e
implements h {
    private final i a;
    private final k<g> b;

    public e(i i8, k<g> k8) {
        this.a = i8;
        this.b = k8;
    }

    @Override
    public boolean a(d d8) {
        if (d8.k() && !this.a.f(d8)) {
            this.b.c(g.a().b(d8.b()).d(d8.c()).c(d8.h()).a());
            return true;
        }
        return false;
    }

    @Override
    public boolean b(Exception exception) {
        this.b.d(exception);
        return true;
    }
}

