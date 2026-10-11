/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.h;
import ax.xc.p;
import ax.xc.s;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.http1.HeadersReader;

public final class MultipartReader
implements Closeable,
AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final s afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final h crlfDashDashBoundary;
    private PartSource currentPart;
    private final h dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final ax.xc.g source;

    static {
        s.a a8 = s.e0;
        h.a a9 = h.e0;
        afterBoundaryOptions = a8.d(a9.d("\r\n"), a9.d("--"), a9.d(" "), a9.d("\t"));
    }

    public MultipartReader(ax.xc.g g8, String string) throws IOException {
        l.f(g8, "source");
        l.f(string, "boundary");
        this.source = g8;
        this.boundary = string;
        this.dashDashBoundary = new e().r1("--").r1(string).m0();
        this.crlfDashDashBoundary = new e().r1("\r\n--").r1(string).m0();
    }

    public MultipartReader(ResponseBody object) throws IOException {
        l.f(object, "response");
        ax.xc.g g8 = ((ResponseBody)object).source();
        object = ((ResponseBody)object).contentType();
        if (object != null && (object = ((MediaType)object).parameter("boundary")) != null) {
            this(g8, (String)object);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    private final long currentPartBytesRemaining(long l8) {
        this.source.P0(this.crlfDashDashBoundary.G());
        long l9 = this.source.k().H(this.crlfDashDashBoundary);
        if (l9 == -1L) {
            return Math.min(l8, this.source.k().size() - (long)this.crlfDashDashBoundary.G() + 1L);
        }
        return Math.min(l8, l9);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        if (!this.closed) {
            int n8;
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.x0(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.G());
            } else {
                long l8;
                while ((l8 = this.currentPartBytesRemaining(8192L)) != 0L) {
                    this.source.skip(l8);
                }
                this.source.skip(this.crlfDashDashBoundary.G());
            }
            boolean bl = false;
            while ((n8 = this.source.O0(afterBoundaryOptions)) != -1) {
                PartSource partSource;
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2 && n8 != 3) continue;
                        bl = true;
                        continue;
                    }
                    if (!bl) {
                        if (this.partCount != 0) {
                            this.noMoreParts = true;
                            return null;
                        }
                        throw new ProtocolException("expected at least 1 part");
                    }
                    throw new ProtocolException("unexpected characters after boundary");
                }
                ++this.partCount;
                Headers headers = new HeadersReader(this.source).readHeaders();
                this.currentPart = partSource = new PartSource(this);
                return new Part(headers, p.d(partSource));
            }
            throw new ProtocolException("unexpected characters after boundary");
        }
        throw new IllegalStateException("closed");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final s getAfterBoundaryOptions() {
            return afterBoundaryOptions;
        }
    }

    public static final class Part
    implements Closeable,
    AutoCloseable {
        private final ax.xc.g body;
        private final Headers headers;

        public Part(Headers headers, ax.xc.g g8) {
            l.f(headers, "headers");
            l.f(g8, "body");
            this.headers = headers;
            this.body = g8;
        }

        public final ax.xc.g body() {
            return this.body;
        }

        @Override
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    private final class PartSource
    implements C,
    AutoCloseable {
        final MultipartReader this$0;
        private final D timeout;

        public PartSource(MultipartReader multipartReader) {
            this.this$0 = multipartReader;
            this.timeout = new D();
        }

        @Override
        public void close() {
            if (l.a(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override
        public long read(e object, long l8) {
            l.f(object, "sink");
            if (l8 >= 0L) {
                if (l.a(this.this$0.currentPart, this)) {
                    TimeUnit timeUnit;
                    long l9;
                    MultipartReader multipartReader;
                    D d8;
                    D d9;
                    block16: {
                        d9 = this.this$0.source.timeout();
                        d8 = this.timeout;
                        multipartReader = this.this$0;
                        l9 = d9.timeoutNanos();
                        long l10 = D.Companion.a(d8.timeoutNanos(), d9.timeoutNanos());
                        timeUnit = TimeUnit.NANOSECONDS;
                        d9.timeout(l10, timeUnit);
                        if (d9.hasDeadline()) {
                            block15: {
                                l10 = d9.deadlineNanoTime();
                                if (d8.hasDeadline()) {
                                    d9.deadlineNanoTime(Math.min(d9.deadlineNanoTime(), d8.deadlineNanoTime()));
                                }
                                try {
                                    l8 = multipartReader.currentPartBytesRemaining(l8);
                                    if (l8 != 0L) break block15;
                                    l8 = -1L;
                                }
                                catch (Throwable throwable) {
                                    d9.timeout(l9, TimeUnit.NANOSECONDS);
                                    if (d8.hasDeadline()) {
                                        d9.deadlineNanoTime(l10);
                                    }
                                    throw throwable;
                                }
                            }
                            l8 = multipartReader.source.read((e)object, l8);
                            d9.timeout(l9, timeUnit);
                            if (d8.hasDeadline()) {
                                d9.deadlineNanoTime(l10);
                            }
                            return l8;
                        }
                        if (d8.hasDeadline()) {
                            d9.deadlineNanoTime(d8.deadlineNanoTime());
                        }
                        try {
                            l8 = multipartReader.currentPartBytesRemaining(l8);
                            if (l8 != 0L) break block16;
                            l8 = -1L;
                        }
                        catch (Throwable throwable) {
                            d9.timeout(l9, TimeUnit.NANOSECONDS);
                            if (d8.hasDeadline()) {
                                d9.clearDeadline();
                            }
                            throw throwable;
                        }
                    }
                    l8 = multipartReader.source.read((e)object, l8);
                    d9.timeout(l9, timeUnit);
                    if (d8.hasDeadline()) {
                        d9.clearDeadline();
                    }
                    return l8;
                }
                throw new IllegalStateException("closed");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        @Override
        public D timeout() {
            return this.timeout;
        }
    }
}

