/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.installations;

import ax.d8.d;
import ax.j6.k;
import com.google.firebase.installations.h;

class f
implements h {
    final k<String> a;

    public f(k<String> k8) {
        this.a = k8;
    }

    @Override
    public boolean a(d d8) {
        if (!(d8.l() || d8.k() || d8.i())) {
            return false;
        }
        this.a.e(d8.d());
        return true;
    }

    @Override
    public boolean b(Exception exception) {
        return false;
    }
}

