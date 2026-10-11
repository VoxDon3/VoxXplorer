/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import ax.M5.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;

public final class x
extends A {
    protected final b b;

    public x(int n8, b b8) {
        super(n8);
        this.b = p.m(b8, "Null methods are not runnable.");
    }

    @Override
    public final void a(Status status) {
        try {
            this.b.p(status);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Log.w((String)"ApiCallRunner", (String)"Exception reporting failure", (Throwable)illegalStateException);
            return;
        }
    }

    @Override
    public final void b(Exception object) {
        String string = object.getClass().getSimpleName();
        object = ((Throwable)object).getLocalizedMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        object = new Status(10, stringBuilder.toString());
        try {
            this.b.p((Status)object);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            Log.w((String)"ApiCallRunner", (String)"Exception reporting failure", (Throwable)illegalStateException);
            return;
        }
    }

    @Override
    public final void c(o o8) throws DeadObjectException {
        try {
            this.b.n(o8.u());
            return;
        }
        catch (RuntimeException runtimeException) {
            this.b(runtimeException);
            return;
        }
    }

    @Override
    public final void d(g g8, boolean bl) {
        g8.c(this.b, bl);
    }
}

