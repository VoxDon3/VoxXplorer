package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class B implements Iterator<String> {
    private final /* synthetic */ C c0;
    private Iterator<String> q;

    B(C c) {
        Bundle bundle;
        this.c0 = c;
        bundle = c.q;
        this.q = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
