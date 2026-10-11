package ax.Sa;

import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.InterfaceC3488f;
import ax.xc.p;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
abstract class f {
    private static final ax.Xd.d a = ax.Xd.f.k(f.class);

    class a extends RequestBody {
        final /* synthetic */ d a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ MediaType d;
        final /* synthetic */ k e;

        a(d dVar, long j, long j2, MediaType mediaType, k kVar) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = mediaType;
            this.e = kVar;
        }

        private void a(long j) throws ax.Ta.a {
            d dVar = this.a;
            if (dVar != null) {
                if (dVar.a()) {
                    throw new ax.Ta.a();
                }
                this.a.b(j + this.b, this.c);
            }
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            long j = this.c;
            if (j < 0) {
                return -1L;
            }
            return j - this.b;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.d;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC3488f interfaceC3488f) throws IOException {
            InputStream a = this.e.a(this.b);
            try {
                C k = p.k(a);
                long j = 0;
                try {
                    a(0L);
                    C3487e c3487e = new C3487e();
                    while (true) {
                        long read = k.read(c3487e, 8192L);
                        if (read == -1) {
                            break;
                        }
                        interfaceC3488f.write(c3487e, read);
                        j += read;
                        a(j);
                    }
                    f.a.n("loaded: " + j);
                    k.close();
                    if (a != null) {
                        a.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    f() {
    }

    static RequestBody b(MediaType mediaType, k kVar, long j, d dVar) {
        if (kVar == null) {
            throw new NullPointerException("source == null");
        }
        long length = kVar.length();
        if (j >= 0) {
            return new a(dVar, j, length, mediaType, kVar);
        }
        throw new IllegalArgumentException("Invalid startOffset: " + j);
    }
}
