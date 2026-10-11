package com.pcloud.sdk.internal;

import ax.la.C2492b;
import ax.ma.C2544a;
import ax.ma.InterfaceC2545b;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.pcloud.sdk.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3786e<T> implements ax.la.i<T> {
    private final InterfaceC2545b<T> c0;
    private final Call q;

    /* renamed from: com.pcloud.sdk.internal.e$a */
    class a implements Callback {
        final /* synthetic */ ax.la.j a;

        a(ax.la.j jVar) {
            this.a = jVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.a.a(C3786e.this, iOException);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                ax.la.j jVar = this.a;
                C3786e c3786e = C3786e.this;
                jVar.b(c3786e, c3786e.c(response));
            } catch (C2492b | IOException e) {
                C2544a.a(response);
                this.a.a(C3786e.this, e);
            }
        }
    }

    C3786e(Call call, InterfaceC2545b<T> interfaceC2545b) {
        this.q = call;
        this.c0 = interfaceC2545b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public T c(Response response) throws IOException, C2492b {
        return this.c0.a(response);
    }

    @Override // ax.la.i
    public void A(ax.la.j<T> jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Callback argument cannot be null.");
        }
        this.q.enqueue(new a(jVar));
    }

    @Override // ax.la.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3786e<T> m5clone() {
        return new C3786e<>(this.q.clone(), this.c0);
    }

    @Override // ax.la.i
    public T execute() throws IOException, C2492b {
        return c(this.q.execute());
    }
}
