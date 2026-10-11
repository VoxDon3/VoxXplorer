package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.ImageInfo;

/* loaded from: classes3.dex */
public class BaseVisualInfo implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("attribution")
    public ImageInfo c;

    @InterfaceC3059a
    @InterfaceC3061c("backgroundColor")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("description")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("displayText")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("content")
    public AbstractC3000i g;
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
