package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class BaseLicenseDetails extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("servicePlans")
    public List<Object> f;

    @InterfaceC3059a
    @InterfaceC3061c("skuId")
    public UUID g;

    @InterfaceC3059a
    @InterfaceC3061c("skuPartNumber")
    public String h;
    private transient C3003l i;
    private transient e j;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.j = eVar;
        this.i = c3003l;
    }
}
