/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.http;

import ax.P9.p;
import ax.T9.e;
import ax.r8.l;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.serializer.a;
import java.util.List;

public abstract class BaseCollectionPage<T1, T2 extends p>
implements IBaseCollectionPage<T1, T2> {
    private transient a a = new a(this);
    private final List<T1> b;
    private final T2 c;
    private transient l d;
    private transient e e;

    public BaseCollectionPage(List<T1> list, T2 T22) {
        this.b = java.util.DesugarCollections.unmodifiableList(list);
        this.c = T22;
    }

    @Override
    public T2 a() {
        return this.c;
    }

    @Override
    public List<T1> b() {
        return this.b;
    }

    @Override
    public final a c() {
        return this.a;
    }

    @Override
    public void d(e e8, l l8) {
        this.e = e8;
        this.d = l8;
    }
}

