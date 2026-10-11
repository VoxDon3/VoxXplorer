/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.sb.t;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.c;
import ax.xc.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.StreamResetException;

public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384L;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public Http2Stream(int n8, Http2Connection http2Connection, boolean bl, boolean bl2, Headers headers) {
        l.f(http2Connection, "connection");
        this.id = n8;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<Headers>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(this, http2Connection.getOkHttpSettings().getInitialWindowSize(), bl2);
        this.sink = new FramingSink(this, bl);
        this.readTimeout = new StreamTimeout(this);
        this.writeTimeout = new StreamTimeout(this);
        if (headers != null) {
            if (!this.isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (this.isLocallyInitiated()) {
            return;
        }
        throw new IllegalStateException("remotely-initiated streams should have headers");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean closeInternal(ErrorCode object, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl;
                block6: {
                    try {
                        ErrorCode errorCode = this.errorCode;
                        if (errorCode == null) break block6;
                    }
                    catch (Throwable throwable2) {}
                    return false;
                }
                this.errorCode = object;
                this.errorException = iOException;
                l.d(this, "null cannot be cast to non-null type java.lang.Object");
                this.notifyAll();
                if (!this.source.getFinished$okhttp() || !(bl = this.sink.getFinished())) break block7;
                return false;
            }
            object = t.a;
            // MONITOREXIT @DISABLED, blocks:[2, 3] lbl28 : MonitorExitStatement: MONITOREXIT : this
            this.connection.removeStream$okhttp(this.id);
            return true;
            throw throwable2;
        }
    }

    public final void addBytesToWriteWindow(long l8) {
        this.writeBytesMaximum += l8;
        if (l8 > 0L) {
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean bl;
        block6: {
            block5: {
                if (Util.assertionsEnabled && Thread.holdsLock(this)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Thread ");
                    stringBuilder.append(Thread.currentThread().getName());
                    stringBuilder.append(" MUST NOT hold lock on ");
                    stringBuilder.append(this);
                    throw new AssertionError((Object)stringBuilder.toString());
                }
                // MONITORENTER : this
                if (this.source.getFinished$okhttp() || !this.source.getClosed$okhttp() || !this.sink.getFinished() && !this.sink.getClosed()) break block5;
                bl = true;
                break block6;
            }
            bl = false;
        }
        boolean bl2 = this.isOpen();
        t t8 = t.a;
        // MONITOREXIT : this
        if (bl) {
            this.close(ErrorCode.CANCEL, null);
            return;
        }
        if (bl2) return;
        this.connection.removeStream$okhttp(this.id);
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    Object object = this.errorException;
                    if (object == null) {
                        object = this.errorCode;
                        l.c(object);
                        object = new StreamResetException((ErrorCode)((Object)object));
                    }
                    throw object;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
        l.f((Object)errorCode, "rstStatusCode");
        if (!this.closeInternal(errorCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        l.f((Object)errorCode, "errorCode");
        if (!this.closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void enqueueTrailers(Headers object) {
        l.f(object, "trailers");
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.sink.getFinished()) {
                        object = new IllegalStateException("already finished");
                        throw object;
                    }
                    if (((Headers)object).size() != 0) {
                        this.sink.setTrailers((Headers)object);
                        object = t.a;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = new IllegalArgumentException("trailers.size() == 0");
                throw object;
            }
            throw throwable2;
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ErrorCode getErrorCode$okhttp() {
        synchronized (this) {
            return this.errorCode;
        }
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final A getSink() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.hasResponseHeaders && !this.isLocallyInitiated()) {
                        IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                        throw illegalStateException;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                t t8 = t.a;
                return this.sink;
            }
            throw throwable2;
        }
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final C getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean bl = (this.id & 1) == 1;
        return this.connection.getClient$okhttp() == bl;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isOpen() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl;
                block6: {
                    try {
                        ErrorCode errorCode = this.errorCode;
                        if (errorCode == null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return false;
                }
                return !this.source.getFinished$okhttp() && !this.source.getClosed$okhttp() || !this.sink.getFinished() && !this.sink.getClosed() || !(bl = this.hasResponseHeaders);
                {
                }
            }
            throw throwable2;
        }
    }

    public final D readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(ax.xc.g object, int n8) throws IOException {
        l.f(object, "source");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        this.source.receive$okhttp((ax.xc.g)object, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void receiveHeaders(Headers object, boolean bl) {
        l.f(object, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && bl) {
                    this.source.setTrailers((Headers)object);
                } else {
                    this.hasResponseHeaders = true;
                    this.headersQueue.add((Headers)object);
                }
                if (bl) {
                    this.source.setFinished$okhttp(true);
                }
                bl = this.isOpen();
                l.d(this, "null cannot be cast to non-null type java.lang.Object");
                this.notifyAll();
                object = t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl27 : MonitorExitStatement: MONITOREXIT : this
                if (bl) return;
                this.connection.removeStream$okhttp(this.id);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void receiveRstStream(ErrorCode errorCode) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        l.f((Object)errorCode, "errorCode");
                        if (this.errorCode != null) break block4;
                        this.errorCode = errorCode;
                        l.d(this, "null cannot be cast to non-null type java.lang.Object");
                        this.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long l8) {
        this.readBytesAcknowledged = l8;
    }

    public final void setReadBytesTotal$okhttp(long l8) {
        this.readBytesTotal = l8;
    }

    public final void setWriteBytesMaximum$okhttp(long l8) {
        this.writeBytesMaximum = l8;
    }

    public final void setWriteBytesTotal$okhttp(long l8) {
        this.writeBytesTotal = l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Headers takeHeaders() throws IOException {
        synchronized (this) {
            Throwable throwable3;
            block9: {
                Throwable throwable22;
                block10: {
                    try {
                        this.readTimeout.enter();
                    }
                    catch (Throwable throwable3) {
                        break block9;
                    }
                    try {
                        while (this.headersQueue.isEmpty() && this.errorCode == null) {
                            this.waitForIo$okhttp();
                        }
                    }
                    catch (Throwable throwable22) {
                        break block10;
                    }
                    this.readTimeout.exitAndThrowIfTimedOut();
                    if (!this.headersQueue.isEmpty()) {
                        Headers headers = this.headersQueue.removeFirst();
                        l.e(headers, "headersQueue.removeFirst()");
                        return headers;
                    }
                    Object object = this.errorException;
                    if (object != null) {
                        throw object;
                    }
                    object = this.errorCode;
                    l.c(object);
                    object = new StreamResetException((ErrorCode)((Object)object));
                    throw object;
                }
                this.readTimeout.exitAndThrowIfTimedOut();
                throw throwable22;
            }
            throw throwable3;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Headers trailers() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().P() && this.source.getReadBuffer().P()) {
                        Headers headers;
                        Headers headers2 = headers = this.source.getTrailers();
                        if (headers != null) return headers2;
                        return Util.EMPTY_HEADERS;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                {
                    if (this.errorCode == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("too early; can't read the trailers yet");
                        throw illegalStateException;
                    }
                    Object object = this.errorException;
                    if (object != null) {
                        throw object;
                    }
                    object = this.errorCode;
                    l.c(object);
                    object = new StreamResetException((ErrorCode)((Object)object));
                    throw object;
                }
            }
            throw throwable2;
        }
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void writeHeaders(List<Header> object, boolean bl, boolean bl2) throws IOException {
        l.f(object, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        // MONITORENTER : this
        boolean bl3 = true;
        this.hasResponseHeaders = true;
        if (bl) {
            this.sink.setFinished(true);
        }
        Object object2 = t.a;
        // MONITOREXIT : this
        boolean bl4 = bl2;
        if (!bl2) {
            object2 = this.connection;
            // MONITORENTER : object2
            long l8 = this.connection.getWriteBytesTotal();
            long l9 = this.connection.getWriteBytesMaximum();
            bl2 = l8 >= l9 ? bl3 : false;
            // MONITOREXIT : object2
            bl4 = bl2;
        }
        this.connection.writeHeaders$okhttp(this.id, bl, (List<Header>)object);
        if (!bl4) return;
        this.connection.flush();
    }

    public final D writeTimeout() {
        return this.writeTimeout;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

    public final class FramingSink
    implements A,
    AutoCloseable {
        private boolean closed;
        private boolean finished;
        private final e sendBuffer;
        final Http2Stream this$0;
        private Headers trailers;

        public FramingSink(Http2Stream http2Stream, boolean bl) {
            this.this$0 = http2Stream;
            this.finished = bl;
            this.sendBuffer = new e();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean bl, int n8, g g8) {
            if ((n8 & 1) != 0) {
                bl = false;
            }
            this(http2Stream, bl);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        private final void emitFrame(boolean bl) throws IOException {
            Throwable throwable2;
            Http2Stream http2Stream;
            block11: {
                http2Stream = this.this$0;
                // MONITORENTER : http2Stream
                http2Stream.getWriteTimeout$okhttp().enter();
                try {
                    while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                        http2Stream.waitForIo$okhttp();
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                long l8 = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.size());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + l8);
                bl = bl && l8 == this.sendBuffer.size();
                t t8 = t.a;
                // MONITOREXIT : http2Stream
                this.this$0.getWriteTimeout$okhttp().enter();
                try {
                    this.this$0.getConnection().writeData(this.this$0.getId(), bl, this.sendBuffer, l8);
                    return;
                }
                finally {
                    this.this$0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                }
            }
            http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            throw throwable2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void close() throws IOException {
            Object object2 = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(object2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST NOT hold lock on ");
                stringBuilder.append(object2);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            Object object = this.this$0;
            // MONITORENTER : object
            boolean bl = this.closed;
            if (bl) {
                // MONITOREXIT : object
                return;
            }
            bl = ((Http2Stream)object).getErrorCode$okhttp() == null;
            object2 = t.a;
            // MONITOREXIT : object
            if (!this.this$0.getSink$okhttp().finished) {
                int n8 = this.sendBuffer.size() > 0L ? 1 : 0;
                if (this.trailers != null) {
                    while (this.sendBuffer.size() > 0L) {
                        this.emitFrame(false);
                    }
                    object2 = this.this$0.getConnection();
                    n8 = this.this$0.getId();
                    object = this.trailers;
                    l.c(object);
                    ((Http2Connection)object2).writeHeaders$okhttp(n8, bl, Util.toHeaderList((Headers)object));
                } else if (n8 != 0) {
                    while (this.sendBuffer.size() > 0L) {
                        this.emitFrame(true);
                    }
                } else if (bl) {
                    this.this$0.getConnection().writeData(this.this$0.getId(), true, null, 0L);
                }
            }
            object = this.this$0;
            // MONITORENTER : object
            this.closed = true;
            object2 = t.a;
            // MONITOREXIT : object
            this.this$0.getConnection().flush();
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void flush() throws IOException {
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST NOT hold lock on ");
                stringBuilder.append(http2Stream);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            http2Stream = this.this$0;
            synchronized (http2Stream) {
                http2Stream.checkOutNotClosed$okhttp();
                t t8 = t.a;
            }
            while (this.sendBuffer.size() > 0L) {
                this.emitFrame(false);
                this.this$0.getConnection().flush();
            }
            return;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean bl) {
            this.closed = bl;
        }

        public final void setFinished(boolean bl) {
            this.finished = bl;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override
        public D timeout() {
            return this.this$0.getWriteTimeout$okhttp();
        }

        @Override
        public void write(e object, long l8) throws IOException {
            l.f(object, "source");
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread ");
                ((StringBuilder)object).append(Thread.currentThread().getName());
                ((StringBuilder)object).append(" MUST NOT hold lock on ");
                ((StringBuilder)object).append(http2Stream);
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            this.sendBuffer.write((e)object, l8);
            while (this.sendBuffer.size() >= 16384L) {
                this.emitFrame(false);
            }
        }
    }

    public final class FramingSource
    implements C,
    AutoCloseable {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final e readBuffer;
        private final e receiveBuffer;
        final Http2Stream this$0;
        private Headers trailers;

        public FramingSource(Http2Stream http2Stream, long l8, boolean bl) {
            this.this$0 = http2Stream;
            this.maxByteCount = l8;
            this.finished = bl;
            this.receiveBuffer = new e();
            this.readBuffer = new e();
        }

        private final void updateConnectionFlowControl(long l8) {
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST NOT hold lock on ");
                stringBuilder.append(http2Stream);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            this.this$0.getConnection().updateConnectionFlowControl$okhttp(l8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void close() throws IOException {
            Http2Stream http2Stream = this.this$0;
            // MONITORENTER : http2Stream
            this.closed = true;
            long l8 = this.readBuffer.size();
            this.readBuffer.b();
            l.d(http2Stream, "null cannot be cast to non-null type java.lang.Object");
            http2Stream.notifyAll();
            t t8 = t.a;
            // MONITOREXIT : http2Stream
            if (l8 > 0L) {
                this.updateConnectionFlowControl(l8);
            }
            this.this$0.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final e getReadBuffer() {
            return this.readBuffer;
        }

        public final e getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /*
         * Exception decompiling
         */
        @Override
        public long read(e var1_1, long var2_4) throws IOException {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 94->110)] java.lang.Throwable
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void receive$okhttp(ax.xc.g object, long l8) throws IOException {
            l.f(object, "source");
            Http2Stream http2Stream = this.this$0;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread ");
                ((StringBuilder)object).append(Thread.currentThread().getName());
                ((StringBuilder)object).append(" MUST NOT hold lock on ");
                ((StringBuilder)object).append(http2Stream);
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            long l9 = l8;
            while (true) {
                block13: {
                    boolean bl;
                    boolean bl2;
                    block12: {
                        if (l9 <= 0L) {
                            this.updateConnectionFlowControl(l8);
                            return;
                        }
                        http2Stream = this.this$0;
                        // MONITORENTER : http2Stream
                        boolean bl3 = this.finished;
                        long l10 = this.readBuffer.size();
                        long l11 = this.maxByteCount;
                        bl2 = false;
                        bl = l10 + l9 > l11;
                        t t8 = t.a;
                        // MONITOREXIT : http2Stream
                        if (bl) {
                            object.skip(l9);
                            this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                            return;
                        }
                        if (bl3) {
                            object.skip(l9);
                            return;
                        }
                        l10 = object.read(this.receiveBuffer, l9);
                        if (l10 == -1L) throw new EOFException();
                        l9 -= l10;
                        http2Stream = this.this$0;
                        // MONITORENTER : http2Stream
                        if (!this.closed) break block12;
                        this.receiveBuffer.b();
                        break block13;
                    }
                    bl = bl2;
                    if (this.readBuffer.size() == 0L) {
                        bl = true;
                    }
                    this.readBuffer.M(this.receiveBuffer);
                    if (bl) {
                        l.d(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                        http2Stream.notifyAll();
                    }
                }
                // MONITOREXIT : http2Stream
            }
        }

        public final void setClosed$okhttp(boolean bl) {
            this.closed = bl;
        }

        public final void setFinished$okhttp(boolean bl) {
            this.finished = bl;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override
        public D timeout() {
            return this.this$0.getReadTimeout$okhttp();
        }
    }

    public final class StreamTimeout
    extends c {
        final Http2Stream this$0;

        public StreamTimeout(Http2Stream http2Stream) {
            this.this$0 = http2Stream;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!this.exit()) {
                return;
            }
            throw this.newTimeoutException(null);
        }

        @Override
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override
        protected void timedOut() {
            this.this$0.closeLater(ErrorCode.CANCEL);
            this.this$0.getConnection().sendDegradedPingLater$okhttp();
        }
    }
}

