/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C;
import java.util.Iterator;

final class B
implements Iterator<String> {
    private final C c0;
    private Iterator<String> q;

    B(C c8) {
        this.c0 = c8;
        this.q = C.y(c8).keySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final /* synthetic */ Object next() {
        return this.q.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

