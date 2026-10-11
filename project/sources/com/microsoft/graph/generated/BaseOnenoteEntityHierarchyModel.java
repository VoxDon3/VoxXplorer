package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.OnenoteEntitySchemaObjectModel;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseOnenoteEntityHierarchyModel extends OnenoteEntitySchemaObjectModel implements d {

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("createdBy")
    public IdentitySet m;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedBy")
    public IdentitySet n;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar o;
    private transient C3003l p;
    private transient e q;

    @Override // com.microsoft.graph.generated.BaseOnenoteEntitySchemaObjectModel, com.microsoft.graph.generated.BaseOnenoteEntityBaseModel, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.q = eVar;
        this.p = c3003l;
    }
}
