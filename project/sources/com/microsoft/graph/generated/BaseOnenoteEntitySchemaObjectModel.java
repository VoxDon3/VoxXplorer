package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.OnenoteEntityBaseModel;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseOnenoteEntitySchemaObjectModel extends OnenoteEntityBaseModel implements d {

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseOnenoteEntityBaseModel, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
