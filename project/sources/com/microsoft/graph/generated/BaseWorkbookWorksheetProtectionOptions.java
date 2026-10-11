package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseWorkbookWorksheetProtectionOptions implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("allowAutoFilter")
    public Boolean c;

    @InterfaceC3059a
    @InterfaceC3061c("allowDeleteColumns")
    public Boolean d;

    @InterfaceC3059a
    @InterfaceC3061c("allowDeleteRows")
    public Boolean e;

    @InterfaceC3059a
    @InterfaceC3061c("allowFormatCells")
    public Boolean f;

    @InterfaceC3059a
    @InterfaceC3061c("allowFormatColumns")
    public Boolean g;

    @InterfaceC3059a
    @InterfaceC3061c("allowFormatRows")
    public Boolean h;

    @InterfaceC3059a
    @InterfaceC3061c("allowInsertColumns")
    public Boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("allowInsertHyperlinks")
    public Boolean j;

    @InterfaceC3059a
    @InterfaceC3061c("allowInsertRows")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("allowPivotTables")
    public Boolean l;

    @InterfaceC3059a
    @InterfaceC3061c("allowSort")
    public Boolean m;
    private transient C3003l n;
    private transient e o;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.o = eVar;
        this.n = c3003l;
    }
}
