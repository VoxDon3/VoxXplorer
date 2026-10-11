package com.pcloud.sdk.internal;

import java.io.IOException;
import java.util.concurrent.Callable;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.pcloud.sdk.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3782a extends w {
    private final Callable<String> a;

    C3782a(Callable<String> callable) {
        if (callable == null) {
            throw new IllegalArgumentException("'tokenProvider' argument cannot be null.");
        }
        this.a = callable;
    }

    private Request a(Request request, String str) {
        if (str == null) {
            return request;
        }
        return request.newBuilder().header("Authorization", "Bearer " + str).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        try {
            String call = this.a.call();
            return chain.proceed(call != null ? a(chain.request(), call) : chain.request());
        } catch (Exception e) {
            throw new IOException("Error while providing access token.", e);
        }
    }
}
