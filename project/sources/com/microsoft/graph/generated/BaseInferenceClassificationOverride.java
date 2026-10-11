package com.microsoft.graph.generated;

import ax.N9.P0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Entity;

/* loaded from: classes3.dex */
public class BaseInferenceClassificationOverride extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("classifyAs")
    public P0 f;

    @InterfaceC3059a
    @InterfaceC3061c("senderEmailAddress")
    public EmailAddress g;
    private transient C3003l h;
    private transient e i;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.i = eVar;
        this.h = c3003l;
    }
}
