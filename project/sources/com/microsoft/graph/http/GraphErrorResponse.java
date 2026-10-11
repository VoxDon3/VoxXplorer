package com.microsoft.graph.http;

import ax.P9.g;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.serializer.a;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public class GraphErrorResponse implements d {
    private transient a a = new a(this);

    @InterfaceC3061c("error")
    public g b;

    @InterfaceC3059a(deserialize = Util.assertionsEnabled, serialize = Util.assertionsEnabled)
    public C3003l c;

    @Override // ax.T9.d
    public final a c() {
        return this.a;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.c = c3003l;
    }
}
