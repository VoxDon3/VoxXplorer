/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import java.io.IOException;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Response;

class c
implements Interceptor {
    private final String a;
    private final String b;

    c(String string, Map<String, String> map) {
        this.a = string;
        this.b = c.a(map);
    }

    private static String a(Map<String, String> object2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : object2.entrySet()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append("; ");
        }
        stringBuilder.append("Domain=api.pcloud.com; Path=/; Secure; HttpOnly");
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (c)object;
            return this.b.equals(((c)object).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.a).addHeader("Cookie", this.b).build());
    }
}

