package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.OnenoteOperationError;
import com.microsoft.graph.extensions.Operation;

/* loaded from: classes3.dex */
public class BaseOnenoteOperation extends Operation implements d {

    @InterfaceC3059a
    @InterfaceC3061c("resourceLocation")
    public String k;

    @InterfaceC3059a
    @InterfaceC3061c("resourceId")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("error")
    public OnenoteOperationError m;

    @InterfaceC3059a
    @InterfaceC3061c("percentComplete")
    public String n;
    private transient C3003l o;
    private transient e p;

    @Override // com.microsoft.graph.generated.BaseOperation, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.p = eVar;
        this.o = c3003l;
    }
}
