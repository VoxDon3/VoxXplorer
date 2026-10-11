package com.microsoft.graph.generated;

import ax.N9.U0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseOperation extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("status")
    public U0 f;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar g;

    @InterfaceC3059a
    @InterfaceC3061c("lastActionDateTime")
    public Calendar h;
    private transient C3003l i;
    private transient e j;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.j = eVar;
        this.i = c3003l;
    }
}
