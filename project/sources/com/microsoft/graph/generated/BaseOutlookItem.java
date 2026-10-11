package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseOutlookItem extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar f;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar g;

    @InterfaceC3059a
    @InterfaceC3061c("changeKey")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("categories")
    public List<String> i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
