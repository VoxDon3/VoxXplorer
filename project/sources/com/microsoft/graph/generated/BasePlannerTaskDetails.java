package com.microsoft.graph.generated;

import ax.N9.V0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlannerChecklistItems;
import com.microsoft.graph.extensions.PlannerExternalReferences;

/* loaded from: classes3.dex */
public class BasePlannerTaskDetails extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("description")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("previewType")
    public V0 g;

    @InterfaceC3059a
    @InterfaceC3061c("references")
    public PlannerExternalReferences h;

    @InterfaceC3059a
    @InterfaceC3061c("checklist")
    public PlannerChecklistItems i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
