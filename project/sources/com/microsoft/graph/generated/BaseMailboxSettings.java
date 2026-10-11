package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.AutomaticRepliesSetting;
import com.microsoft.graph.extensions.LocaleInfo;
import com.microsoft.graph.extensions.WorkingHours;

/* loaded from: classes3.dex */
public class BaseMailboxSettings implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("automaticRepliesSetting")
    public AutomaticRepliesSetting c;

    @InterfaceC3059a
    @InterfaceC3061c("archiveFolder")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("timeZone")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("language")
    public LocaleInfo f;

    @InterfaceC3059a
    @InterfaceC3061c("workingHours")
    public WorkingHours g;
    private transient C3003l h;
    private transient e i;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.i = eVar;
        this.h = c3003l;
    }
}
