/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.V1;

public final class X1 {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final V1 d;

    X1(V1 v12, int n8, boolean bl, boolean bl2) {
        this.d = v12;
        this.a = n8;
        this.b = bl;
        this.c = bl2;
    }

    public final void a(String string) {
        this.d.z(this.a, this.b, this.c, string, null, null, null);
    }

    public final void b(String string, Object object) {
        this.d.z(this.a, this.b, this.c, string, object, null, null);
    }

    public final void c(String string, Object object, Object object2) {
        this.d.z(this.a, this.b, this.c, string, object, object2, null);
    }

    public final void d(String string, Object object, Object object2, Object object3) {
        this.d.z(this.a, this.b, this.c, string, object, object2, object3);
    }
}

