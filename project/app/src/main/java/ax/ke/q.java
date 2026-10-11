/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.C;
import ax.ke.D;
import ax.ke.I;
import ax.ke.d;
import ax.ke.i;
import ax.xc.e;
import ax.xc.g;
import ax.xc.k;
import ax.xc.p;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

final class q<T>
implements ax.ke.b<T> {
    private final Object[] c0;
    private final Call.Factory d0;
    private final i<ResponseBody, T> e0;
    private volatile boolean f0;
    private Call g0;
    private Throwable h0;
    private boolean i0;
    private final C q;

    q(C c8, Object[] objectArray, Call.Factory factory2, i<ResponseBody, T> i8) {
        this.q = c8;
        this.c0 = objectArray;
        this.d0 = factory2;
        this.e0 = i8;
    }

    private Call c() throws IOException {
        Call call = this.d0.newCall(this.q.a(this.c0));
        if (call != null) {
            return call;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /*
     * WARNING - void declaration
     */
    private Call d() throws IOException {
        RuntimeException var1_5;
        Object object = this.g0;
        if (object != null) {
            return object;
        }
        object = this.h0;
        if (object != null) {
            if (!(object instanceof IOException)) {
                if (object instanceof RuntimeException) {
                    throw (RuntimeException)object;
                }
                throw (Error)object;
            }
            throw (IOException)object;
        }
        try {
            this.g0 = object = this.c();
            return object;
        }
        catch (IOException iOException) {
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        I.s((Throwable)var1_5);
        this.h0 = var1_5;
        throw var1_5;
    }

    public q<T> b() {
        return new q<T>(this.q, this.c0, this.d0, this.e0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void cancel() {
        this.f0 = true;
        // MONITORENTER : this
        Call call = this.g0;
        // MONITOREXIT : this
        if (call == null) return;
        call.cancel();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public D<T> execute() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (!this.i0) {
                        this.i0 = true;
                        Call call = this.d();
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4] lbl6 : MonitorExitStatement: MONITOREXIT : this
                        if (!this.f0) return this.f(call.execute());
                        call.cancel();
                        return this.f(call.execute());
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    IllegalStateException illegalStateException = new IllegalStateException("Already executed.");
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    D<T> f(Response object) throws IOException {
        Object object2 = ((Response)object).body();
        Response response = ((Response)object).newBuilder().body(new c(((ResponseBody)object2).contentType(), ((ResponseBody)object2).contentLength())).build();
        int n8 = response.code();
        if (n8 >= 200 && n8 < 300) {
            if (n8 != 204 && n8 != 205) {
                object = new b((ResponseBody)object2);
                try {
                    object2 = D.g(this.e0.a((ResponseBody)object), response);
                    return object2;
                }
                catch (RuntimeException runtimeException) {
                    ((b)object).a();
                    throw runtimeException;
                }
            }
            ((ResponseBody)object2).close();
            return D.g(null, response);
        }
        try {
            object = D.c(I.a((ResponseBody)object2), response);
            return object;
        }
        finally {
            ((ResponseBody)object2).close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isCanceled() {
        boolean bl = this.f0;
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Call call = this.g0;
                    if (call == null) return false;
                    if (!call.isCanceled()) return false;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Request request() {
        synchronized (this) {
            try {
                try {
                    return this.d().request();
                }
                catch (IOException iOException) {
                    RuntimeException runtimeException = new RuntimeException("Unable to create request.", iOException);
                    throw runtimeException;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void u(d<T> var1_1) {
        j.Objects.requireNonNull((Object)var1_1, (String)"callback == null");
        synchronized (this) {
            if (this.i0) ** GOTO lbl34
            this.i0 = true;
            var4_3 = this.g0;
            var5_4 = this.h0;
            var2_5 = var4_3;
            var3_6 = var5_4;
            if (var4_3 != null) ** GOTO lbl25
            var2_5 = var4_3;
            var3_6 = var5_4;
            if (var5_4 != null) ** GOTO lbl25
            {
                catch (Throwable var1_2) {}
            }
            try {
                this.g0 = var2_5 = this.c();
                var3_6 = var5_4;
                ** GOTO lbl25
            }
            catch (Throwable var3_7) {
                I.s(var3_7);
                this.h0 = var3_7;
                var2_5 = var4_3;
lbl25:
                // 4 sources

                // MONITOREXIT @DISABLED, blocks:[2, 4, 5] lbl24 : MonitorExitStatement: MONITOREXIT : this
                if (var3_6 != null) {
                    var1_1.b(this, var3_6);
                    return;
                }
                if (this.f0) {
                    var2_5.cancel();
                }
                var2_5.enqueue(new Callback(){
                    final d a;
                    final q b;
                    {
                        this.b = q8;
                        this.a = d8;
                    }

                    private void a(Throwable throwable) {
                        try {
                            this.a.b(this.b, throwable);
                            return;
                        }
                        catch (Throwable throwable2) {
                            I.s(throwable2);
                            throwable2.printStackTrace();
                            return;
                        }
                    }

                    @Override
                    public void onFailure(Call call, IOException iOException) {
                        this.a(iOException);
                    }

                    @Override
                    public void onResponse(Call object, Response response) {
                        try {
                            object = this.b.f(response);
                        }
                        catch (Throwable throwable) {
                            I.s(throwable);
                            this.a(throwable);
                            return;
                        }
                        try {
                            this.a.a(this.b, object);
                            return;
                        }
                        catch (Throwable throwable) {
                            I.s(throwable);
                            throwable.printStackTrace();
                            return;
                        }
                    }
                });
                return;
lbl34:
                // 2 sources

                var1_1 = new IllegalStateException("Already executed.");
                throw var1_1;
            }
            throw var1_2;
        }
    }

    static final class b
    extends ResponseBody {
        private final g c0;
        IOException d0;
        private final ResponseBody q;

        b(ResponseBody responseBody) {
            this.q = responseBody;
            this.c0 = p.d(new k(this, responseBody.source()){
                final b q;
                {
                    this.q = b8;
                    super(c8);
                }

                @Override
                public long read(e e8, long l8) throws IOException {
                    try {
                        l8 = super.read(e8, l8);
                        return l8;
                    }
                    catch (IOException iOException) {
                        this.q.d0 = iOException;
                        throw iOException;
                    }
                }
            });
        }

        void a() throws IOException {
            IOException iOException = this.d0;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        @Override
        public void close() {
            this.q.close();
        }

        @Override
        public long contentLength() {
            return this.q.contentLength();
        }

        @Override
        public MediaType contentType() {
            return this.q.contentType();
        }

        @Override
        public g source() {
            return this.c0;
        }
    }

    static final class c
    extends ResponseBody {
        private final long c0;
        private final MediaType q;

        c(MediaType mediaType, long l8) {
            this.q = mediaType;
            this.c0 = l8;
        }

        @Override
        public long contentLength() {
            return this.c0;
        }

        @Override
        public MediaType contentType() {
            return this.q;
        }

        @Override
        public g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }
}

