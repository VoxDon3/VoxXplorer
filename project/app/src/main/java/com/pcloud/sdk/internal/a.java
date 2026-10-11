/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import com.pcloud.sdk.internal.w;
import java.io.IOException;
import java.util.concurrent.Callable;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

final class a
extends w {
    private final Callable<String> a;

    a(Callable<String> callable) {
        if (callable != null) {
            this.a = callable;
            return;
        }
        throw new IllegalArgumentException("'tokenProvider' argument cannot be null.");
    }

    private Request a(Request object, String string) {
        Object object2 = object;
        if (string != null) {
            object2 = ((Request)object).newBuilder();
            object = new StringBuilder();
            ((StringBuilder)object).append("Bearer ");
            ((StringBuilder)object).append(string);
            object2 = ((Request.Builder)object2).header("Authorization", ((StringBuilder)object).toString()).build();
        }
        return object2;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Object object;
        try {
            object = this.a.call();
            object = object != null ? this.a(chain.request(), (String)object) : chain.request();
        }
        catch (Exception exception) {
            throw new IOException("Error while providing access token.", exception);
        }
        return chain.proceed((Request)object);
    }
}

