package okhttp3;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.D;
import ax.xc.g;
import ax.xc.h;
import ax.xc.p;
import ax.xc.s;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final s afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final h crlfDashDashBoundary;
    private PartSource currentPart;
    private final h dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final g source;

    public static final class Companion {
        public /* synthetic */ Companion(ax.Gb.g gVar) {
            this();
        }

        public final s getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable, AutoCloseable {
        private final g body;
        private final Headers headers;

        public Part(Headers headers, g gVar) {
            l.f(headers, "headers");
            l.f(gVar, "body");
            this.headers = headers;
            this.body = gVar;
        }

        public final g body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    private final class PartSource implements C, AutoCloseable {
        private final D timeout = new D();

        public PartSource() {
        }

        @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (l.a(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // ax.xc.C
        public long read(C3487e c3487e, long j) {
            long j2;
            l.f(c3487e, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (!l.a(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            D timeout = MultipartReader.this.source.timeout();
            D d = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.timeoutNanos();
            long a = D.Companion.a(d.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(a, timeUnit);
            if (!timeout.hasDeadline()) {
                if (d.hasDeadline()) {
                    timeout.deadlineNanoTime(d.deadlineNanoTime());
                }
                try {
                    long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j);
                    long read = currentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(c3487e, currentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (d.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (d.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (d.hasDeadline()) {
                j2 = 0;
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), d.deadlineNanoTime()));
            } else {
                j2 = 0;
            }
            try {
                long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j);
                long read2 = currentPartBytesRemaining2 == j2 ? -1L : multipartReader.source.read(c3487e, currentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (d.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th2) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (d.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // ax.xc.C
        public D timeout() {
            return this.timeout;
        }
    }

    static {
        s.a aVar = s.e0;
        h.a aVar2 = h.e0;
        afterBoundaryOptions = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    public MultipartReader(g gVar, String str) throws IOException {
        l.f(gVar, "source");
        l.f(str, "boundary");
        this.source = gVar;
        this.boundary = str;
        this.dashDashBoundary = new C3487e().f0("--").f0(str).m0();
        this.crlfDashDashBoundary = new C3487e().f0("\r\n--").f0(str).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.P0(this.crlfDashDashBoundary.G());
        long H = this.source.k().H(this.crlfDashDashBoundary);
        return H == -1 ? Math.min(j, (this.source.k().size() - this.crlfDashDashBoundary.G()) + 1) : Math.min(j, H);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.x0(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.G());
        } else {
            while (true) {
                long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (currentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(currentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.G());
        }
        boolean z = false;
        while (true) {
            int O0 = this.source.O0(afterBoundaryOptions);
            if (O0 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (O0 == 0) {
                this.partCount++;
                Headers readHeaders = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(readHeaders, p.d(partSource));
            }
            if (O0 == 1) {
                if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (O0 == 2 || O0 == 3) {
                z = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            ax.Gb.l.f(r3, r0)
            ax.xc.g r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
