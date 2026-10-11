/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import ax.J5.e;
import ax.L5.b;
import ax.L5.q;
import ax.M5.n;

final class p {
    private final b a;
    private final e b;

    /* synthetic */ p(b b8, e e8, q q8) {
        this.a = b8;
        this.b = e8;
    }

    static /* bridge */ /* synthetic */ e a(p p8) {
        return p8.b;
    }

    static /* bridge */ /* synthetic */ b b(p p8) {
        return p8.a;
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof p) {
            object = (p)object;
            if (n.b(this.a, ((p)object).a) && n.b(this.b, ((p)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return n.c(this.a, this.b);
    }

    public final String toString() {
        return n.d(this).a("key", this.a).a("feature", this.b).toString();
    }
}

