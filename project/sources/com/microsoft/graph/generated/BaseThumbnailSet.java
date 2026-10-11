package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Thumbnail;

/* loaded from: classes3.dex */
public class BaseThumbnailSet extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("large")
    public Thumbnail f;

    @InterfaceC3059a
    @InterfaceC3061c("medium")
    public Thumbnail g;

    @InterfaceC3059a
    @InterfaceC3061c("small")
    public Thumbnail h;

    @InterfaceC3059a
    @InterfaceC3061c("source")
    public Thumbnail i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
