package ax.ke;

import ax.xc.C3487e;
import j$.util.Objects;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
final class q<T> implements InterfaceC2430b<T> {
    private final Object[] c0;
    private final Call.Factory d0;
    private final InterfaceC2437i<ResponseBody, T> e0;
    private volatile boolean f0;
    private Call g0;
    private Throwable h0;
    private boolean i0;
    private final C q;

    class a implements Callback {
        final /* synthetic */ InterfaceC2432d a;

        a(InterfaceC2432d interfaceC2432d) {
            this.a = interfaceC2432d;
        }

        private void a(Throwable th) {
            try {
                this.a.b(q.this, th);
            } catch (Throwable th2) {
                I.s(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.a.a(q.this, q.this.f(response));
                } catch (Throwable th) {
                    I.s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                I.s(th2);
                a(th2);
            }
        }
    }

    static final class b extends ResponseBody {
        private final ax.xc.g c0;
        IOException d0;
        private final ResponseBody q;

        class a extends ax.xc.k {
            a(ax.xc.C c) {
                super(c);
            }

            @Override // ax.xc.k, ax.xc.C
            public long read(C3487e c3487e, long j) throws IOException {
                try {
                    return super.read(c3487e, j);
                } catch (IOException e) {
                    b.this.d0 = e;
                    throw e;
                }
            }
        }

        b(ResponseBody responseBody) {
            this.q = responseBody;
            this.c0 = ax.xc.p.d(new a(responseBody.source()));
        }

        void a() throws IOException {
            IOException iOException = this.d0;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.q.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.q.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.q.contentType();
        }

        @Override // okhttp3.ResponseBody
        public ax.xc.g source() {
            return this.c0;
        }
    }

    static final class c extends ResponseBody {
        private final long c0;
        private final MediaType q;

        c(MediaType mediaType, long j) {
            this.q = mediaType;
            this.c0 = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.c0;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.q;
        }

        @Override // okhttp3.ResponseBody
        public ax.xc.g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    q(C c2, Object[] objArr, Call.Factory factory, InterfaceC2437i<ResponseBody, T> interfaceC2437i) {
        this.q = c2;
        this.c0 = objArr;
        this.d0 = factory;
        this.e0 = interfaceC2437i;
    }

    private Call c() throws IOException {
        Call newCall = this.d0.newCall(this.q.a(this.c0));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private Call d() throws IOException {
        Call call = this.g0;
        if (call != null) {
            return call;
        }
        Throwable th = this.h0;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call c2 = c();
            this.g0 = c2;
            return c2;
        } catch (IOException | Error | RuntimeException e) {
            I.s(e);
            this.h0 = e;
            throw e;
        }
    }

    @Override // ax.ke.InterfaceC2430b
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q<T> m1clone() {
        return new q<>(this.q, this.c0, this.d0, this.e0);
    }

    @Override // ax.ke.InterfaceC2430b
    public void cancel() {
        Call call;
        this.f0 = true;
        synchronized (this) {
            call = this.g0;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // ax.ke.InterfaceC2430b
    public D<T> execute() throws IOException {
        Call d;
        synchronized (this) {
            if (this.i0) {
                throw new IllegalStateException("Already executed.");
            }
            this.i0 = true;
            d = d();
        }
        if (this.f0) {
            d.cancel();
        }
        return f(d.execute());
    }

    D<T> f(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return D.c(I.a(body), build);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return D.g(null, build);
        }
        b bVar = new b(body);
        try {
            return D.g(this.e0.a(bVar), build);
        } catch (RuntimeException e) {
            bVar.a();
            throw e;
        }
    }

    @Override // ax.ke.InterfaceC2430b
    public boolean isCanceled() {
        boolean z = true;
        if (this.f0) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.g0;
                if (call == null || !call.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // ax.ke.InterfaceC2430b
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().request();
    }

    @Override // ax.ke.InterfaceC2430b
    public void u(InterfaceC2432d<T> interfaceC2432d) {
        Call call;
        Throwable th;
        Objects.requireNonNull(interfaceC2432d, "callback == null");
        synchronized (this) {
            try {
                if (this.i0) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i0 = true;
                call = this.g0;
                th = this.h0;
                if (call == null && th == null) {
                    try {
                        Call c2 = c();
                        this.g0 = c2;
                        call = c2;
                    } catch (Throwable th2) {
                        th = th2;
                        I.s(th);
                        this.h0 = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC2432d.b(this, th);
            return;
        }
        if (this.f0) {
            call.cancel();
        }
        call.enqueue(new a(interfaceC2432d));
    }
}
