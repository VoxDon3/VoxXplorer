package okhttp3.internal.cache;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.D;
import ax.xc.InterfaceC3488f;
import ax.xc.g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements C, AutoCloseable {
    final /* synthetic */ InterfaceC3488f $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ g $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(g gVar, CacheRequest cacheRequest, InterfaceC3488f interfaceC3488f) {
        this.$source = gVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = interfaceC3488f;
    }

    @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    @Override // ax.xc.C
    public long read(C3487e c3487e, long j) throws IOException {
        l.f(c3487e, "sink");
        try {
            long read = this.$source.read(c3487e, j);
            if (read != -1) {
                c3487e.j(this.$cacheBody.k(), c3487e.size() - read, read);
                this.$cacheBody.R();
                return read;
            }
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheBody.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.cacheRequestClosed) {
                throw e;
            }
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
            throw e;
        }
    }

    @Override // ax.xc.C
    public D timeout() {
        return this.$source.timeout();
    }
}
