package com.microsoft.graph.http;

import ax.P9.p;
import ax.T9.e;
import ax.r8.C3003l;
import com.microsoft.graph.serializer.a;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseCollectionPage<T1, T2 extends p> implements IBaseCollectionPage<T1, T2> {
    private transient a a = new a(this);
    private final List<T1> b;
    private final T2 c;
    private transient C3003l d;
    private transient e e;

    public BaseCollectionPage(List<T1> list, T2 t2) {
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = t2;
    }

    @Override // com.microsoft.graph.http.IBaseCollectionPage
    public T2 a() {
        return this.c;
    }

    @Override // com.microsoft.graph.http.IBaseCollectionPage
    public List<T1> b() {
        return this.b;
    }

    @Override // ax.T9.d
    public final a c() {
        return this.a;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.e = eVar;
        this.d = c3003l;
    }
}
