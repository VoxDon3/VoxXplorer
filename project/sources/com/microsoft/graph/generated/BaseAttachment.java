package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseAttachment extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar f;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("contentType")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("size")
    public Integer i;

    @InterfaceC3059a
    @InterfaceC3061c("isInline")
    public Boolean j;
    private transient C3003l k;
    private transient e l;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.l = eVar;
        this.k = c3003l;
    }
}
