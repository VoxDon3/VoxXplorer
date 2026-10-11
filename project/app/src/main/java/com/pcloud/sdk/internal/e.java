/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.i;
import ax.la.j;
import ax.ma.a;
import ax.ma.b;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

final class e<T>
implements i<T> {
    private final b<T> c0;
    private final Call q;

    e(Call call, b<T> b8) {
        this.q = call;
        this.c0 = b8;
    }

    private T c(Response response) throws IOException, ax.la.b {
        return this.c0.a(response);
    }

    @Override
    public void A(j<T> j8) {
        if (j8 != null) {
            this.q.enqueue(new Callback(){
                final j a;
                final e b;
                {
                    this.b = e8;
                    this.a = j8;
                }

                @Override
                public void onFailure(Call call, IOException iOException) {
                    this.a.a(this.b, iOException);
                }

                /*
                 * WARNING - void declaration
                 */
                @Override
                public void onResponse(Call object, Response response) {
                    Throwable var1_4;
                    try {
                        object = this.a;
                        e e8 = this.b;
                        object.b(e8, e8.c(response));
                        return;
                    }
                    catch (IOException iOException) {
                    }
                    catch (ax.la.b b8) {
                        // empty catch block
                    }
                    a.a(response);
                    this.a.a(this.b, (Throwable)var1_4);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Callback argument cannot be null.");
    }

    public e<T> d() {
        return new e<T>(this.q.clone(), this.c0);
    }

    @Override
    public T execute() throws IOException, ax.la.b {
        return this.c(this.q.execute());
    }
}

