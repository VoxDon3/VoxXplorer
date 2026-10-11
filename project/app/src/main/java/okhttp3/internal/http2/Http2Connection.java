/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.u;
import ax.Gb.v;
import ax.sb.t;
import ax.xc.e;
import ax.xc.f;
import ax.xc.h;
import ax.xc.p;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;

public final class Http2Connection
implements Closeable,
AutoCloseable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 0x1000000;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder object) {
        TaskQueue taskQueue;
        String string;
        boolean bl;
        l.f(object, "builder");
        this.client = bl = ((Builder)object).getClient$okhttp();
        this.listener = ((Builder)object).getListener$okhttp();
        this.streams = new LinkedHashMap<Integer, Http2Stream>();
        this.connectionName = string = ((Builder)object).getConnectionName$okhttp();
        int n8 = ((Builder)object).getClient$okhttp() ? 3 : 2;
        this.nextStreamId = n8;
        Object object2 = ((Builder)object).getTaskRunner$okhttp();
        this.taskRunner = object2;
        this.writerQueue = taskQueue = ((TaskRunner)object2).newQueue();
        this.pushQueue = ((TaskRunner)object2).newQueue();
        this.settingsListenerQueue = ((TaskRunner)object2).newQueue();
        this.pushObserver = ((Builder)object).getPushObserver$okhttp();
        object2 = new Settings();
        if (((Builder)object).getClient$okhttp()) {
            ((Settings)object2).set(7, 0x1000000);
        }
        this.okHttpSettings = object2;
        this.peerSettings = object2 = DEFAULT_SETTINGS;
        this.writeBytesMaximum = ((Settings)object2).getInitialWindowSize();
        this.socket = ((Builder)object).getSocket$okhttp();
        this.writer = new Http2Writer(((Builder)object).getSink$okhttp(), bl);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(((Builder)object).getSource$okhttp(), bl));
        this.currentPushRequests = new LinkedHashSet<Integer>();
        if (((Builder)object).getPingIntervalMillis$okhttp() != 0) {
            long l8 = TimeUnit.MILLISECONDS.toNanos(((Builder)object).getPingIntervalMillis$okhttp());
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" ping");
            taskQueue.schedule(new Task(((StringBuilder)object).toString(), this, l8){
                final long $pingIntervalNanos$inlined;
                final Http2Connection this$0;
                {
                    this.this$0 = http2Connection;
                    this.$pingIntervalNanos$inlined = l8;
                    super(string, false, 2, null);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                public long runOnce() {
                    boolean bl;
                    Http2Connection http2Connection = this.this$0;
                    // MONITORENTER : http2Connection
                    if (Http2Connection.access$getIntervalPongsReceived$p(this.this$0) < Http2Connection.access$getIntervalPingsSent$p(this.this$0)) {
                        bl = true;
                    } else {
                        long l8 = Http2Connection.access$getIntervalPingsSent$p(this.this$0);
                        Http2Connection.access$setIntervalPingsSent$p(this.this$0, l8 + 1L);
                        bl = false;
                    }
                    // MONITOREXIT : http2Connection
                    if (bl) {
                        Http2Connection.access$failConnection(this.this$0, null);
                        return -1L;
                    }
                    this.this$0.writePing(false, 1, 0);
                    return this.$pingIntervalNanos$inlined;
                }
            }, l8);
        }
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.awaitPongsReceived;
    }

    public static final /* synthetic */ Set access$getCurrentPushRequests$p(Http2Connection http2Connection) {
        return http2Connection.currentPushRequests;
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.degradedPongsReceived;
    }

    public static final /* synthetic */ long access$getIntervalPingsSent$p(Http2Connection http2Connection) {
        return http2Connection.intervalPingsSent;
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.intervalPongsReceived;
    }

    public static final /* synthetic */ PushObserver access$getPushObserver$p(Http2Connection http2Connection) {
        return http2Connection.pushObserver;
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(Http2Connection http2Connection, long l8) {
        http2Connection.awaitPongsReceived = l8;
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(Http2Connection http2Connection, long l8) {
        http2Connection.degradedPongsReceived = l8;
    }

    public static final /* synthetic */ void access$setIntervalPingsSent$p(Http2Connection http2Connection, long l8) {
        http2Connection.intervalPingsSent = l8;
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(Http2Connection http2Connection, long l8) {
        http2Connection.intervalPongsReceived = l8;
    }

    private final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        this.close$okhttp(errorCode, errorCode, iOException);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Http2Stream newStream(int var1_1, List<Header> var2_2, boolean var3_10) throws IOException {
        var5_11 = 1;
        var7_12 = var3_10 ^ true;
        var8_13 = this.writer;
        synchronized (var8_13) {
            block25: {
                try {
                    synchronized (this) {
                    }
                }
                catch (Throwable var2_9) {
                    break block25;
                }
                {
                    var4_14 = this.nextStreamId;
                    if (var4_14 > 0x3FFFFFFF) {
                    }
                    ** GOTO lbl-1000
                    {
                        block28: {
                            block29: {
                                block27: {
                                    block26: {
                                        catch (Throwable var2_8) {
                                            break block28;
                                        }
                                        try {
                                            this.shutdown(ErrorCode.REFUSED_STREAM);
                                        }
                                        catch (Throwable var2_3) {
                                            break block28;
                                        }
lbl-1000:
                                        // 2 sources

                                        {
                                            if (this.isShutdown) ** GOTO lbl-1000
                                            var6_15 = this.nextStreamId;
                                            this.nextStreamId = var6_15 + 2;
                                        }
                                        {
                                            var10_16 = new Http2Stream(var6_15, this, var7_12, false, null);
                                            var4_14 = var5_11;
                                            if (var3_10) {
                                                var4_14 = var5_11;
                                                if (this.writeBytesTotal < this.writeBytesMaximum) {
                                                    var4_14 = var10_16.getWriteBytesTotal() >= var10_16.getWriteBytesMaximum() ? var5_11 : 0;
                                                }
                                            }
                                            if (var10_16.isOpen()) {
                                                this.streams.put(var6_15, var10_16);
                                            }
                                            var9_17 = t.a;
                                            // MONITOREXIT @DISABLED, blocks:[4, 6, 8, 9] lbl34 : MonitorExitStatement: MONITOREXIT : this
                                            if (var1_1 != 0) break block26;
                                        }
                                        try {
                                            this.writer.headers(var7_12, var6_15, (List<Header>)var2_2);
                                            break block27;
                                        }
                                        catch (Throwable var2_6) {
                                            break block25;
                                        }
                                    }
                                    if (this.client) break block29;
                                    this.writer.pushPromise(var1_1, var6_15, (List<Header>)var2_2);
                                }
                                // MONITOREXIT @DISABLED, blocks:[6, 8] lbl43 : MonitorExitStatement: MONITOREXIT : var8_13
                                if (var4_14 != 0) {
                                    this.writer.flush();
                                }
                                return var10_16;
                            }
                            var2_2 = new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                            throw var2_2;
lbl-1000:
                            // 1 sources

                            {
                                var2_2 = new ConnectionShutdownException();
                                throw var2_2;
                            }
                        }
                        throw var2_5;
                    }
                }
            }
            throw var2_7;
        }
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean bl, TaskRunner taskRunner, int n8, Object object) throws IOException {
        if ((n8 & 1) != 0) {
            bl = true;
        }
        if ((n8 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(bl, taskRunner);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    while (this.awaitPongsReceived < this.awaitPingsSent) {
                        l.d(this, "null cannot be cast to non-null type java.lang.Object");
                        this.wait();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void close() {
        this.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void close$okhttp(ErrorCode object, ErrorCode errorCode, IOException iOException) {
        int n8;
        block15: {
            block14: {
                l.f(object, "connectionCode");
                l.f((Object)errorCode, "streamCode");
                if (Util.assertionsEnabled && Thread.holdsLock(this)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Thread ");
                    ((StringBuilder)object).append(Thread.currentThread().getName());
                    ((StringBuilder)object).append(" MUST NOT hold lock on ");
                    ((StringBuilder)object).append(this);
                    throw new AssertionError((Object)((StringBuilder)object).toString());
                }
                try {
                    this.shutdown((ErrorCode)((Object)object));
                }
                catch (IOException iOException2) {}
                boolean bl = this.streams.isEmpty();
                n8 = 0;
                if (bl) break block14;
                object = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
                break block15;
            }
            object = null;
        }
        Object object2 = t.a;
        // MONITOREXIT : this
        object = (Http2Stream[])object;
        if (object != null) {
            int n9 = ((Object)object).length;
            while (n8 < n9) {
                object2 = object[n8];
                try {
                    ((Http2Stream)object2).close(errorCode, iOException);
                }
                catch (IOException iOException3) {}
                ++n8;
            }
        }
        try {
            this.writer.close();
        }
        catch (IOException iOException4) {}
        try {
            this.socket.close();
        }
        catch (IOException iOException5) {}
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Http2Stream getStream(int n8) {
        synchronized (this) {
            return this.streams.get(n8);
        }
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isHealthy(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                long l9;
                block5: {
                    try {
                        boolean bl = this.isShutdown;
                        if (!bl) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return false;
                }
                if (this.degradedPongsReceived >= this.degradedPingsSent || l8 < (l9 = this.degradedPongDeadlineNs)) break block6;
                return false;
            }
            return true;
            throw throwable2;
        }
    }

    public final Http2Stream newStream(List<Header> list, boolean bl) throws IOException {
        l.f(list, "requestHeaders");
        return this.newStream(0, list, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int openStreamCount() {
        synchronized (this) {
            return this.streams.size();
        }
    }

    public final void pushDataLater$okhttp(int n8, ax.xc.g object, int n9, boolean bl) throws IOException {
        l.f(object, "source");
        e e8 = new e();
        long l8 = n9;
        object.P0(l8);
        object.read(e8, l8);
        object = this.pushQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append('[');
        stringBuilder.append(n8);
        stringBuilder.append("] onData");
        ((TaskQueue)object).schedule(new Task(stringBuilder.toString(), true, this, n8, e8, n9, bl){
            final e $buffer$inlined;
            final int $byteCount$inlined;
            final boolean $inFinished$inlined;
            final int $streamId$inlined;
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                this.$streamId$inlined = n8;
                this.$buffer$inlined = e8;
                this.$byteCount$inlined = n9;
                this.$inFinished$inlined = bl2;
                super(string, bl);
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public long runOnce() {
                try {
                    boolean bl = Http2Connection.access$getPushObserver$p(this.this$0).onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                    if (bl) {
                        this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                    }
                    if (!bl) {
                        if (!this.$inFinished$inlined) return -1L;
                    }
                    Http2Connection http2Connection = this.this$0;
                    synchronized (http2Connection) {
                        Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(this.$streamId$inlined);
                    }
                }
                catch (IOException iOException) {
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(int n8, List<Header> list, boolean bl) {
        l.f(list, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append('[');
        stringBuilder.append(n8);
        stringBuilder.append("] onHeaders");
        taskQueue.schedule(new Task(stringBuilder.toString(), true, this, n8, list, bl){
            final boolean $inFinished$inlined;
            final List $requestHeaders$inlined;
            final int $streamId$inlined;
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                this.$streamId$inlined = n8;
                this.$requestHeaders$inlined = list;
                this.$inFinished$inlined = bl2;
                super(string, bl);
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public long runOnce() {
                var1_1 = Http2Connection.access$getPushObserver$p(this.this$0).onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
                if (!var1_1) ** GOTO lbl5
                try {
                    this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
lbl5:
                    // 2 sources

                    if (!var1_1) {
                        if (this.$inFinished$inlined == false) return -1L;
                    }
                    var2_2 = this.this$0;
                    synchronized (var2_2) {
                        Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(this.$streamId$inlined);
                    }
                }
                catch (IOException var2_3) {
                    return -1L;
                }
                return -1L;
            }
        }, 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushRequestLater$okhttp(int n8, List<Header> list) {
        l.f(list, "requestHeaders");
        synchronized (this) {
            boolean bl = this.currentPushRequests.contains(n8);
            if (!bl) {
                this.currentPushRequests.add(n8);
                // MONITOREXIT @DISABLED, blocks:[3, 5] lbl7 : MonitorExitStatement: MONITOREXIT : this
                TaskQueue taskQueue = this.pushQueue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.connectionName);
                stringBuilder.append('[');
                stringBuilder.append(n8);
                stringBuilder.append("] onRequest");
                taskQueue.schedule(new Task(stringBuilder.toString(), true, this, n8, list){
                    final List $requestHeaders$inlined;
                    final int $streamId$inlined;
                    final Http2Connection this$0;
                    {
                        this.this$0 = http2Connection;
                        this.$streamId$inlined = n8;
                        this.$requestHeaders$inlined = list;
                        super(string, bl);
                    }

                    /*
                     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public long runOnce() {
                        if (!Http2Connection.access$getPushObserver$p(this.this$0).onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) return -1L;
                        try {
                            this.this$0.getWriter().rstStream(this.$streamId$inlined, ErrorCode.CANCEL);
                            Http2Connection http2Connection = this.this$0;
                            synchronized (http2Connection) {
                                Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(this.$streamId$inlined);
                            }
                        }
                        catch (IOException iOException) {
                            return -1L;
                        }
                        return -1L;
                    }
                }, 0L);
                return;
            }
            try {
                this.writeSynResetLater$okhttp(n8, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void pushResetLater$okhttp(int n8, ErrorCode errorCode) {
        l.f((Object)errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append('[');
        stringBuilder.append(n8);
        stringBuilder.append("] onReset");
        taskQueue.schedule(new Task(stringBuilder.toString(), true, this, n8, errorCode){
            final ErrorCode $errorCode$inlined;
            final int $streamId$inlined;
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                this.$streamId$inlined = n8;
                this.$errorCode$inlined = errorCode;
                super(string, bl);
            }

            public long runOnce() {
                Http2Connection.access$getPushObserver$p(this.this$0).onReset(this.$streamId$inlined, this.$errorCode$inlined);
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    Http2Connection.access$getCurrentPushRequests$p(this.this$0).remove(this.$streamId$inlined);
                    t t8 = t.a;
                    return -1L;
                }
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int n8, List<Header> list, boolean bl) throws IOException {
        l.f(list, "requestHeaders");
        if (!this.client) {
            return this.newStream(n8, list, bl);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final boolean pushedStream$okhttp(int n8) {
        return n8 != 0 && (n8 & 1) == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Http2Stream removeStream$okhttp(int n8) {
        synchronized (this) {
            Http2Stream http2Stream = this.streams.remove(n8);
            l.d(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return http2Stream;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void sendDegradedPingLater$okhttp() {
        Object object;
        synchronized (this) {
            long l9 = this.degradedPongsReceived;
            long l8 = this.degradedPingsSent;
            if (l9 < l8) {
                return;
            }
            this.degradedPingsSent = l8 + 1L;
            this.degradedPongDeadlineNs = System.nanoTime() + (long)1000000000;
            object = t.a;
        }
        object = this.writerQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append(" ping");
        ((TaskQueue)object).schedule(new Task(stringBuilder.toString(), true, this){
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                super(string, bl);
            }

            public long runOnce() {
                this.this$0.writePing(false, 2, 0);
                return -1L;
            }
        }, 0L);
    }

    public final void setLastGoodStreamId$okhttp(int n8) {
        this.lastGoodStreamId = n8;
    }

    public final void setNextStreamId$okhttp(int n8) {
        this.nextStreamId = n8;
    }

    public final void setPeerSettings(Settings settings) {
        l.f(settings, "<set-?>");
        this.peerSettings = settings;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void setSettings(Settings object) throws IOException {
        block7: {
            l.f(object, "settings");
            Http2Writer http2Writer = this.writer;
            // MONITORENTER : http2Writer
            // MONITORENTER : this
            if (this.isShutdown) break block7;
            this.okHttpSettings.merge((Settings)object);
            t t8 = t.a;
            // MONITOREXIT : this
            this.writer.settings((Settings)object);
            // MONITOREXIT : http2Writer
            return;
        }
        object = new ConnectionShutdownException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void shutdown(ErrorCode errorCode) throws IOException {
        l.f((Object)errorCode, "statusCode");
        Http2Writer http2Writer = this.writer;
        synchronized (http2Writer) {
            Throwable throwable2;
            block8: {
                int n8;
                Object object;
                try {
                    object = new u();
                    synchronized (this) {
                        boolean bl = this.isShutdown;
                        if (!bl) break block7;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                {
                    block7: {
                        return;
                    }
                    this.isShutdown = true;
                    ((u)object).q = n8 = this.lastGoodStreamId;
                    object = t.a;
                }
                this.writer.goAway(n8, errorCode, Util.EMPTY_BYTE_ARRAY);
                return;
            }
            throw throwable2;
        }
    }

    public final void start() throws IOException {
        Http2Connection.start$default(this, false, null, 3, null);
    }

    public final void start(boolean bl) throws IOException {
        Http2Connection.start$default(this, bl, null, 2, null);
    }

    public final void start(boolean bl, TaskRunner taskRunner) throws IOException {
        l.f(taskRunner, "taskRunner");
        if (bl) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int n8 = this.okHttpSettings.getInitialWindowSize();
            if (n8 != 65535) {
                this.writer.windowUpdate(0, n8 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new Task(this.connectionName, true, this.readerRunnable){
            final a<t> $block;
            {
                this.$block = a8;
                super(string, bl);
            }

            public long runOnce() {
                this.$block.invoke();
                return -1L;
            }
        }, 0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void updateConnectionFlowControl$okhttp(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        this.readBytesTotal = l8 = this.readBytesTotal + l8;
                        if ((l8 -= this.readBytesAcknowledged) < (long)(this.okHttpSettings.getInitialWindowSize() / 2)) break block4;
                        this.writeWindowUpdateLater$okhttp(0, l8);
                        this.readBytesAcknowledged += l8;
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

    /*
     * Exception decompiling
     */
    public final void writeData(int var1_1, boolean var2_2, e var3_3, long var4_7) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [5 : 86->128)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void writeHeaders$okhttp(int n8, boolean bl, List<Header> list) throws IOException {
        l.f(list, "alternating");
        this.writer.headers(bl, n8, list);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            ++this.awaitPingsSent;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl4 : MonitorExitStatement: MONITOREXIT : this
            this.writePing(false, 3, 1330343787);
            return;
        }
    }

    public final void writePing(boolean bl, int n8, int n9) {
        try {
            this.writer.ping(bl, n8, n9);
            return;
        }
        catch (IOException iOException) {
            this.failConnection(iOException);
            return;
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        this.writePing();
        this.awaitPong();
    }

    public final void writeSynReset$okhttp(int n8, ErrorCode errorCode) throws IOException {
        l.f((Object)errorCode, "statusCode");
        this.writer.rstStream(n8, errorCode);
    }

    public final void writeSynResetLater$okhttp(int n8, ErrorCode errorCode) {
        l.f((Object)errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append('[');
        stringBuilder.append(n8);
        stringBuilder.append("] writeSynReset");
        taskQueue.schedule(new Task(stringBuilder.toString(), true, this, n8, errorCode){
            final ErrorCode $errorCode$inlined;
            final int $streamId$inlined;
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                this.$streamId$inlined = n8;
                this.$errorCode$inlined = errorCode;
                super(string, bl);
            }

            public long runOnce() {
                try {
                    this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                }
                catch (IOException iOException) {
                    Http2Connection.access$failConnection(this.this$0, iOException);
                }
                return -1L;
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int n8, long l8) {
        TaskQueue taskQueue = this.writerQueue;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.connectionName);
        stringBuilder.append('[');
        stringBuilder.append(n8);
        stringBuilder.append("] windowUpdate");
        taskQueue.schedule(new Task(stringBuilder.toString(), true, this, n8, l8){
            final int $streamId$inlined;
            final long $unacknowledgedBytesRead$inlined;
            final Http2Connection this$0;
            {
                this.this$0 = http2Connection;
                this.$streamId$inlined = n8;
                this.$unacknowledgedBytesRead$inlined = l8;
                super(string, bl);
            }

            public long runOnce() {
                try {
                    this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                }
                catch (IOException iOException) {
                    Http2Connection.access$failConnection(this.this$0, iOException);
                }
                return -1L;
            }
        }, 0L);
    }

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public f sink;
        public Socket socket;
        public ax.xc.g source;
        private final TaskRunner taskRunner;

        public Builder(boolean bl, TaskRunner taskRunner) {
            l.f(taskRunner, "taskRunner");
            this.client = bl;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String string, ax.xc.g g8, f f8, int n8, Object object) throws IOException {
            if ((n8 & 2) != 0) {
                string = Util.peerName(socket);
            }
            if ((n8 & 4) != 0) {
                g8 = p.d(p.l(socket));
            }
            if ((n8 & 8) != 0) {
                f8 = p.c(p.h(socket));
            }
            return builder.socket(socket, string, g8, f8);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String string = this.connectionName;
            if (string != null) {
                return string;
            }
            l.t("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final f getSink$okhttp() {
            f f8 = this.sink;
            if (f8 != null) {
                return f8;
            }
            l.t("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            l.t("socket");
            return null;
        }

        public final ax.xc.g getSource$okhttp() {
            ax.xc.g g8 = this.source;
            if (g8 != null) {
                return g8;
            }
            l.t("source");
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            l.f(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int n8) {
            this.pingIntervalMillis = n8;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            l.f(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean bl) {
            this.client = bl;
        }

        public final void setConnectionName$okhttp(String string) {
            l.f(string, "<set-?>");
            this.connectionName = string;
        }

        public final void setListener$okhttp(Listener listener) {
            l.f(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int n8) {
            this.pingIntervalMillis = n8;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            l.f(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(f f8) {
            l.f(f8, "<set-?>");
            this.sink = f8;
        }

        public final void setSocket$okhttp(Socket socket) {
            l.f(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(ax.xc.g g8) {
            l.f(g8, "<set-?>");
            this.source = g8;
        }

        public final Builder socket(Socket socket) throws IOException {
            l.f(socket, "socket");
            return Builder.socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String string) throws IOException {
            l.f(socket, "socket");
            l.f(string, "peerName");
            return Builder.socket$default(this, socket, string, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String string, ax.xc.g g8) throws IOException {
            l.f(socket, "socket");
            l.f(string, "peerName");
            l.f(g8, "source");
            return Builder.socket$default(this, socket, string, g8, null, 8, null);
        }

        public final Builder socket(Socket object, String string, ax.xc.g g8, f f8) throws IOException {
            l.f(object, "socket");
            l.f(string, "peerName");
            l.f(g8, "source");
            l.f(f8, "sink");
            this.setSocket$okhttp((Socket)object);
            if (this.client) {
                object = new StringBuilder();
                ((StringBuilder)object).append(Util.okHttpName);
                ((StringBuilder)object).append(' ');
                ((StringBuilder)object).append(string);
                object = ((StringBuilder)object).toString();
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("MockWebServer ");
                ((StringBuilder)object).append(string);
                object = ((StringBuilder)object).toString();
            }
            this.setConnectionName$okhttp((String)object);
            this.setSource$okhttp(g8);
            this.setSink$okhttp(f8);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return DEFAULT_SETTINGS;
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener(){

            public void onStream(Http2Stream http2Stream) throws IOException {
                l.f(http2Stream, "stream");
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            l.f(http2Connection, "connection");
            l.f(settings, "settings");
        }

        public abstract void onStream(Http2Stream var1) throws IOException;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g g8) {
                this();
            }
        }
    }

    public final class ReaderRunnable
    implements Http2Reader.Handler,
    a<t> {
        private final Http2Reader reader;
        final Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            l.f(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override
        public void ackSettings() {
        }

        @Override
        public void alternateService(int n8, String string, h h8, String string2, int n9, long l8) {
            l.f(string, "origin");
            l.f(h8, "protocol");
            l.f(string2, "host");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void applyAndAckSettings(boolean bl, Settings object) {
            Throwable throwable2;
            block16: {
                int n8;
                long l8;
                Object object2;
                Task task;
                Http2Connection http2Connection;
                Object object3;
                v v8;
                block15: {
                    block14: {
                        l.f(object, "settings");
                        v8 = new v();
                        object3 = this.this$0.getWriter();
                        http2Connection = this.this$0;
                        // MONITORENTER : object3
                        try {
                            task = http2Connection.getPeerSettings();
                            if (!bl) {
                                object2 = new Settings();
                                ((Settings)object2).merge((Settings)((Object)task));
                                ((Settings)object2).merge((Settings)object);
                                object = object2;
                            }
                            v8.q = object;
                            l8 = (long)((Settings)object).getInitialWindowSize() - (long)((Settings)((Object)task)).getInitialWindowSize();
                            n8 = 0;
                            if (l8 == 0L || http2Connection.getStreams$okhttp().isEmpty()) break block14;
                            object = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            break block15;
                        }
                        catch (Throwable throwable2) {
                            break block16;
                        }
                    }
                    object = null;
                }
                http2Connection.setPeerSettings((Settings)v8.q);
                object2 = http2Connection.settingsListenerQueue;
                task = new StringBuilder();
                ((StringBuilder)((Object)task)).append(http2Connection.getConnectionName$okhttp());
                ((StringBuilder)((Object)task)).append(" onSettings");
                String string = ((StringBuilder)((Object)task)).toString();
                task = new Task(string, true, http2Connection, v8){
                    final v $newPeerSettings$inlined;
                    final Http2Connection this$0;
                    {
                        this.this$0 = http2Connection;
                        this.$newPeerSettings$inlined = v8;
                        super(string, bl);
                    }

                    public long runOnce() {
                        this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings)this.$newPeerSettings$inlined.q);
                        return -1L;
                    }
                };
                ((TaskQueue)object2).schedule(task, 0L);
                object2 = t.a;
                // MONITOREXIT : http2Connection
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings)v8.q);
                }
                catch (IOException iOException) {
                    http2Connection.failConnection(iOException);
                }
                object2 = t.a;
                // MONITOREXIT : object3
                if (object == null) return;
                int n9 = ((Object)object).length;
                while (n8 < n9) {
                    object2 = object[n8];
                    // MONITORENTER : object2
                    ((Http2Stream)object2).addBytesToWriteWindow(l8);
                    object3 = t.a;
                    // MONITOREXIT : object2
                    ++n8;
                }
                return;
            }
            // MONITOREXIT : http2Connection
            throw throwable2;
        }

        @Override
        public void data(boolean bl, int n8, ax.xc.g g8, int n9) throws IOException {
            l.f(g8, "source");
            if (this.this$0.pushedStream$okhttp(n8)) {
                this.this$0.pushDataLater$okhttp(n8, g8, n9, bl);
                return;
            }
            Object object = this.this$0.getStream(n8);
            if (object == null) {
                this.this$0.writeSynResetLater$okhttp(n8, ErrorCode.PROTOCOL_ERROR);
                object = this.this$0;
                long l8 = n9;
                ((Http2Connection)object).updateConnectionFlowControl$okhttp(l8);
                g8.skip(l8);
                return;
            }
            ((Http2Stream)object).receiveData(g8, n9);
            if (bl) {
                ((Http2Stream)object).receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void goAway(int n8, ErrorCode object, h object2222) {
            int n9;
            l.f(object, "errorCode");
            l.f(object2222, "debugData");
            ((h)object2222).G();
            object = this.this$0;
            synchronized (object) {
                object2222 = ((Http2Connection)object).getStreams$okhttp().values();
                n9 = 0;
                object2222 = object2222.toArray(new Http2Stream[0]);
                ((Http2Connection)object).isShutdown = true;
                t t8 = t.a;
            }
            object = (Http2Stream[])object2222;
            int n10 = ((Object)object).length;
            while (n9 < n10) {
                object2222 = object[n9];
                if (((Http2Stream)object2222).getId() > n8 && ((Http2Stream)object2222).isLocallyInitiated()) {
                    ((Http2Stream)object2222).receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(((Http2Stream)object2222).getId());
                }
                ++n9;
            }
            return;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void headers(boolean bl, int n8, int n9, List<Header> object) {
            Task task;
            block7: {
                Http2Connection http2Connection;
                block10: {
                    block9: {
                        block8: {
                            l.f(object, "headerBlock");
                            if (this.this$0.pushedStream$okhttp(n8)) {
                                this.this$0.pushHeadersLater$okhttp(n8, (List<Header>)object, bl);
                                return;
                            }
                            http2Connection = this.this$0;
                            // MONITORENTER : http2Connection
                            task = http2Connection.getStream(n8);
                            if (task != null) break block7;
                            boolean bl2 = http2Connection.isShutdown;
                            if (!bl2) break block8;
                            return;
                        }
                        n9 = http2Connection.getLastGoodStreamId$okhttp();
                        if (n8 > n9) break block9;
                        // MONITOREXIT : http2Connection
                        return;
                    }
                    n9 = http2Connection.getNextStreamId$okhttp();
                    if (n8 % 2 != n9 % 2) break block10;
                    // MONITOREXIT : http2Connection
                    return;
                }
                Object object2 = Util.toHeaders((List<Header>)object);
                object = new Http2Stream(n8, http2Connection, false, bl, (Headers)object2);
                http2Connection.setLastGoodStreamId$okhttp(n8);
                http2Connection.getStreams$okhttp().put(n8, (Http2Stream)object);
                object2 = http2Connection.taskRunner.newQueue();
                task = new StringBuilder();
                ((StringBuilder)((Object)task)).append(http2Connection.getConnectionName$okhttp());
                ((StringBuilder)((Object)task)).append('[');
                ((StringBuilder)((Object)task)).append(n8);
                ((StringBuilder)((Object)task)).append("] onStream");
                String string = ((StringBuilder)((Object)task)).toString();
                task = new Task(string, true, http2Connection, (Http2Stream)object){
                    final Http2Stream $newStream$inlined;
                    final Http2Connection this$0;
                    {
                        this.this$0 = http2Connection;
                        this.$newStream$inlined = http2Stream;
                        super(string, bl);
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public long runOnce() {
                        try {
                            this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                            return -1L;
                        }
                        catch (IOException iOException) {
                            Platform platform = Platform.Companion.get();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Http2Connection.Listener failure for ");
                            stringBuilder.append(this.this$0.getConnectionName$okhttp());
                            platform.log(stringBuilder.toString(), 4, iOException);
                            try {
                                this.$newStream$inlined.close(ErrorCode.PROTOCOL_ERROR, iOException);
                                return -1L;
                            }
                            catch (IOException iOException2) {
                                return -1L;
                            }
                        }
                    }
                };
                ((TaskQueue)object2).schedule(task, 0L);
                // MONITOREXIT : http2Connection
                return;
            }
            t t8 = t.a;
            // MONITOREXIT : http2Connection
            ((Http2Stream)((Object)task)).receiveHeaders(Util.toHeaders((List<Header>)object), bl);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void invoke() {
            RuntimeException var3_11;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3;
            block10: {
                IOException var3_10;
                ErrorCode errorCode4;
                block11: {
                    block9: {
                        errorCode3 = ErrorCode.INTERNAL_ERROR;
                        errorCode2 = null;
                        errorCode = null;
                        this.reader.readConnectionPreface(this);
                        while (this.reader.nextFrame(false, this)) {
                        }
                        errorCode4 = ErrorCode.NO_ERROR;
                        errorCode2 = errorCode;
                        errorCode = errorCode4;
                        try {}
                        catch (IOException iOException) {
                            errorCode = errorCode4;
                        }
                        finally {
                            break block9;
                        }
                        catch (Throwable throwable) {
                            errorCode = errorCode3;
                            break block10;
                        }
                        catch (IOException iOException) {
                            errorCode = errorCode3;
                            break block11;
                        }
                    }
                    ErrorCode errorCode5 = ErrorCode.CANCEL;
                    this.this$0.close$okhttp(errorCode4, errorCode5, null);
                    Util.closeQuietly(this.reader);
                    return;
                }
                errorCode2 = var3_10;
                {
                    errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    this.this$0.close$okhttp(errorCode4, errorCode4, (IOException)var3_10);
                }
                Util.closeQuietly(this.reader);
                return;
            }
            this.this$0.close$okhttp(errorCode, errorCode3, (IOException)((Object)errorCode2));
            Util.closeQuietly(this.reader);
            throw var3_11;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void ping(boolean var1_1, int var2_2, int var3_3) {
            if (!var1_1) {
                var5_8 = Http2Connection.access$getWriterQueue$p(this.this$0);
                var4_5 = new StringBuilder();
                var4_5.append(this.this$0.getConnectionName$okhttp());
                var4_5.append(" ping");
                var5_8.schedule(new Task(var4_5.toString(), true, this.this$0, var2_2, var3_3){
                    final int $payload1$inlined;
                    final int $payload2$inlined;
                    final Http2Connection this$0;
                    {
                        this.this$0 = http2Connection;
                        this.$payload1$inlined = n8;
                        this.$payload2$inlined = n9;
                        super(string, bl);
                    }

                    public long runOnce() {
                        this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            var4_4 = this.this$0;
            synchronized (var4_4) {
                if (var2_2 == 1) ** GOTO lbl25
                if (var2_2 == 2) ** GOTO lbl23
                if (var2_2 == 3) ** GOTO lbl-1000
                try {}
                catch (Throwable var5_7) {}
                ** GOTO lbl21
lbl-1000:
                // 1 sources

                {
                    block4: {
                        Http2Connection.access$setAwaitPongsReceived$p(var4_4, Http2Connection.access$getAwaitPongsReceived$p(var4_4) + 1L);
                        l.d(var4_4, "null cannot be cast to non-null type java.lang.Object");
                        var4_4.notifyAll();
lbl21:
                        // 2 sources

                        var5_6 = t.a;
                        break block4;
lbl23:
                        // 1 sources

                        Http2Connection.access$setDegradedPongsReceived$p(var4_4, Http2Connection.access$getDegradedPongsReceived$p(var4_4) + 1L);
                        break block4;
lbl25:
                        // 1 sources

                        Http2Connection.access$setIntervalPongsReceived$p(var4_4, Http2Connection.access$getIntervalPongsReceived$p(var4_4) + 1L);
                    }
                    return;
                }
                throw var5_7;
            }
        }

        @Override
        public void priority(int n8, int n9, int n10, boolean bl) {
        }

        @Override
        public void pushPromise(int n8, int n9, List<Header> list) {
            l.f(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(n9, list);
        }

        @Override
        public void rstStream(int n8, ErrorCode errorCode) {
            l.f((Object)errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(n8)) {
                this.this$0.pushResetLater$okhttp(n8, errorCode);
                return;
            }
            Http2Stream http2Stream = this.this$0.removeStream$okhttp(n8);
            if (http2Stream != null) {
                http2Stream.receiveRstStream(errorCode);
            }
        }

        @Override
        public void settings(boolean bl, Settings settings) {
            l.f(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.this$0.getConnectionName$okhttp());
            stringBuilder.append(" applyAndAckSettings");
            taskQueue.schedule(new Task(stringBuilder.toString(), true, this, bl, settings){
                final boolean $clearPrevious$inlined;
                final Settings $settings$inlined;
                final ReaderRunnable this$0;
                {
                    this.this$0 = readerRunnable;
                    this.$clearPrevious$inlined = bl2;
                    this.$settings$inlined = settings;
                    super(string, bl);
                }

                public long runOnce() {
                    this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                    return -1L;
                }
            }, 0L);
        }

        @Override
        public void windowUpdate(int n8, long l8) {
            if (n8 == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + l8;
                    l.d(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    t t8 = t.a;
                    return;
                }
            }
            Http2Stream http2Stream = this.this$0.getStream(n8);
            if (http2Stream != null) {
                synchronized (http2Stream) {
                    http2Stream.addBytesToWriteWindow(l8);
                    t t9 = t.a;
                    return;
                }
            }
        }
    }
}

