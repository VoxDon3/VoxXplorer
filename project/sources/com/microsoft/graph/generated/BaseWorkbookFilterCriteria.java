package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.WorkbookIcon;

/* loaded from: classes3.dex */
public class BaseWorkbookFilterCriteria implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("color")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("criterion1")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("criterion2")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("dynamicCriteria")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("filterOn")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("icon")
    public WorkbookIcon h;

    @InterfaceC3059a
    @InterfaceC3061c("operator")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("values")
    public AbstractC3000i j;
    private transient C3003l k;
    private transient e l;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.l = eVar;
        this.k = c3003l;
    }
}
