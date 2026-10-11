/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.g;
import ax.Gb.l;
import ax.Lb.e;
import ax.Ob.h;
import ax.sb.t;
import ax.tb.o;
import ax.xc.f;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketExtensions;
import okhttp3.internal.ws.WebSocketProtocol;
import okhttp3.internal.ws.WebSocketReader;
import okhttp3.internal.ws.WebSocketWriter;

public final class RealWebSocket
implements WebSocket,
WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000L;
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024L;
    private static final long MAX_QUEUE_SIZE = 0x1000000L;
    private static final List<Protocol> ONLY_HTTP1 = o.d(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ax.xc.h> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;

    public RealWebSocket(TaskRunner object, Request object2, WebSocketListener object3, Random random, long l8, WebSocketExtensions webSocketExtensions, long l9) {
        l.f(object, "taskRunner");
        l.f(object2, "originalRequest");
        l.f(object3, "listener");
        l.f(random, "random");
        this.originalRequest = object2;
        this.listener = object3;
        this.random = random;
        this.pingIntervalMillis = l8;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = l9;
        this.taskQueue = ((TaskRunner)object).newQueue();
        this.pongQueue = new ArrayDeque();
        this.messageAndCloseQueue = new ArrayDeque();
        this.receivedCloseCode = -1;
        if (l.a("GET", ((Request)object2).method())) {
            object2 = ax.xc.h.e0;
            object = new byte[16];
            random.nextBytes((byte[])object);
            object3 = t.a;
            this.key = h.a.f((h.a)object2, (byte[])object, 0, 0, 3, null).d();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Request must be GET: ");
        ((StringBuilder)object).append(((Request)object2).method());
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public static final /* synthetic */ ArrayDeque access$getMessageAndCloseQueue$p(RealWebSocket realWebSocket) {
        return realWebSocket.messageAndCloseQueue;
    }

    public static final /* synthetic */ boolean access$isValid(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        return realWebSocket.isValid(webSocketExtensions);
    }

    public static final /* synthetic */ void access$setExtensions$p(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        realWebSocket.extensions = webSocketExtensions;
    }

    private final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues) {
            return false;
        }
        if (webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        return webSocketExtensions.serverMaxWindowBits == null || new e(8, 15).r(webSocketExtensions.serverMaxWindowBits);
    }

    private final void runWriter() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean send(ax.xc.h h8, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        if (this.failed || this.enqueuedClose) break block5;
                        if (this.queueSize + (long)h8.G() > 0x1000000L) {
                            this.close(1001, null);
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.queueSize += (long)h8.G();
                    ArrayDeque<Object> arrayDeque = this.messageAndCloseQueue;
                    Message message = new Message(n8, h8);
                    arrayDeque.add(message);
                    this.runWriter();
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final void awaitTermination(long l8, TimeUnit timeUnit) throws InterruptedException {
        l.f((Object)timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(l8, timeUnit);
    }

    @Override
    public void cancel() {
        Call call = this.call;
        l.c(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response object, Exchange object2) throws IOException {
        l.f(object, "response");
        if (((Response)object).code() == 101) {
            Object object3 = Response.header$default((Response)object, "Connection", null, 2, null);
            if (h.v("Upgrade", (String)object3, true)) {
                object3 = Response.header$default((Response)object, "Upgrade", null, 2, null);
                if (h.v("websocket", (String)object3, true)) {
                    object = Response.header$default((Response)object, "Sec-WebSocket-Accept", null, 2, null);
                    object3 = ax.xc.h.e0;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.key);
                    stringBuilder.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    object3 = ((h.a)object3).d(stringBuilder.toString()).E().d();
                    if (l.a(object3, object)) {
                        if (object2 != null) {
                            return;
                        }
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Expected 'Sec-WebSocket-Accept' header value '");
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append("' but was '");
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append('\'');
                    throw new ProtocolException(((StringBuilder)object2).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected 'Upgrade' header value 'websocket' but was '");
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append('\'');
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Expected 'Connection' header value 'Upgrade' but was '");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append('\'');
            throw new ProtocolException(((StringBuilder)object).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected HTTP 101 response but was '");
        ((StringBuilder)object2).append(((Response)object).code());
        ((StringBuilder)object2).append(' ');
        ((StringBuilder)object2).append(((Response)object).message());
        ((StringBuilder)object2).append('\'');
        throw new ProtocolException(((StringBuilder)object2).toString());
    }

    @Override
    public boolean close(int n8, String string) {
        return this.close(n8, string, 60000L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean close(int n8, String object, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Serializable serializable;
                block7: {
                    block6: {
                        try {
                            WebSocketProtocol.INSTANCE.validateCloseCode(n8);
                            if (object == null) break block6;
                            serializable = ax.xc.h.e0.d((String)object);
                            if ((long)((ax.xc.h)serializable).G() > 123L) {
                                serializable = new StringBuilder();
                                ((StringBuilder)serializable).append("reason.size() > 123: ");
                                ((StringBuilder)serializable).append((String)object);
                                object = ((StringBuilder)serializable).toString();
                                serializable = new IllegalArgumentException(object.toString());
                                throw serializable;
                            }
                            object = serializable;
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object = null;
                }
                if (!this.failed && !this.enqueuedClose) {
                    this.enqueuedClose = true;
                    serializable = this.messageAndCloseQueue;
                    Close close = new Close(n8, (ax.xc.h)object, l8);
                    ((ArrayDeque)serializable).add(close);
                    this.runWriter();
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final void connect(OkHttpClient object) {
        l.f(object, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            this.failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        Cloneable cloneable = ((OkHttpClient)object).newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        object = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        cloneable = new RealCall((OkHttpClient)cloneable, (Request)object, true);
        this.call = cloneable;
        l.c(cloneable);
        cloneable.enqueue(new Callback(this, (Request)object){
            final Request $request;
            final RealWebSocket this$0;
            {
                this.this$0 = realWebSocket;
                this.$request = request;
            }

            public void onFailure(Call call, IOException iOException) {
                l.f(call, "call");
                l.f(iOException, "e");
                this.this$0.failWebSocket(iOException, null);
            }

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onResponse(Call object, Response response) {
                Closeable var2_4;
                l.f(object, "call");
                l.f(var2_4, "response");
                Object object2 = var2_4.exchange();
                try {
                    this.this$0.checkUpgradeSuccess$okhttp((Response)var2_4, (Exchange)object2);
                    l.c(object2);
                    object = ((Exchange)object2).newWebSocketStreams();
                }
                catch (IOException exception) {
                    this.this$0.failWebSocket(exception, (Response)var2_4);
                    Util.closeQuietly((Closeable)var2_4);
                    if (object2 == null) return;
                    ((Exchange)object2).webSocketUpgradeFailed();
                    return;
                }
                object2 = WebSocketExtensions.Companion.parse(var2_4.headers());
                RealWebSocket.access$setExtensions$p(this.this$0, (WebSocketExtensions)object2);
                if (!RealWebSocket.access$isValid(this.this$0, (WebSocketExtensions)object2)) {
                    object2 = this.this$0;
                    synchronized (object2) {
                        RealWebSocket.access$getMessageAndCloseQueue$p((RealWebSocket)object2).clear();
                        ((RealWebSocket)object2).close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(Util.okHttpName);
                    ((StringBuilder)object2).append(" WebSocket ");
                    ((StringBuilder)object2).append(this.$request.url().redact());
                    object2 = ((StringBuilder)object2).toString();
                    this.this$0.initReaderAndWriter((String)object2, (Streams)object);
                    this.this$0.getListener$okhttp().onOpen(this.this$0, (Response)var2_4);
                    this.this$0.loopReader();
                    return;
                }
                catch (Exception exception) {
                    this.this$0.failWebSocket(exception, null);
                    return;
                }
            }
        });
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void failWebSocket(Exception exception, Response response) {
        WebSocketWriter webSocketWriter;
        WebSocketReader webSocketReader;
        Streams streams;
        l.f(exception, "e");
        synchronized (this) {
            boolean bl = this.failed;
            if (bl) {
                return;
            }
            this.failed = true;
            streams = this.streams;
            this.streams = null;
            webSocketReader = this.reader;
            this.reader = null;
            webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            t t8 = t.a;
        }
        try {
            Response var2_3;
            this.listener.onFailure(this, exception, (Response)var2_3);
            return;
        }
        finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void initReaderAndWriter(String object, Streams streams) throws IOException {
        WebSocketExtensions webSocketExtensions;
        block8: {
            boolean bl;
            l.f(object, "name");
            l.f(streams, "streams");
            webSocketExtensions = this.extensions;
            l.c(webSocketExtensions);
            // MONITORENTER : this
            this.name = object;
            this.streams = streams;
            Object object2 = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writer = object2;
            this.writerTask = object2 = new WriterTask(this);
            long l8 = this.pingIntervalMillis;
            if (l8 != 0L) {
                l8 = TimeUnit.MILLISECONDS.toNanos(l8);
                object2 = this.taskQueue;
                Task task = new StringBuilder();
                ((StringBuilder)((Object)task)).append((String)object);
                ((StringBuilder)((Object)task)).append(" ping");
                object = ((StringBuilder)((Object)task)).toString();
                task = new Task((String)object, this, l8){
                    final long $pingIntervalNanos$inlined;
                    final RealWebSocket this$0;
                    {
                        this.this$0 = realWebSocket;
                        this.$pingIntervalNanos$inlined = l8;
                        super(string, false, 2, null);
                    }

                    public long runOnce() {
                        this.this$0.writePingFrame$okhttp();
                        return this.$pingIntervalNanos$inlined;
                    }
                };
                ((TaskQueue)object2).schedule(task, l8);
            }
            if (bl = this.messageAndCloseQueue.isEmpty()) break block8;
            this.runWriter();
        }
        object = t.a;
        // MONITOREXIT : this
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient() ^ true));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            l.c(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void onReadClose(int n8, String object) {
        block12: {
            Throwable throwable2;
            WebSocketWriter webSocketWriter;
            WebSocketReader webSocketReader;
            Streams streams;
            block14: {
                block13: {
                    l.f(object, "reason");
                    if (n8 == -1) throw new IllegalArgumentException("Failed requirement.");
                    // MONITORENTER : this
                    if (this.receivedCloseCode != -1) break block12;
                    this.receivedCloseCode = n8;
                    this.receivedCloseReason = object;
                    boolean bl = this.enqueuedClose;
                    streams = null;
                    if (bl && this.messageAndCloseQueue.isEmpty()) {
                        streams = this.streams;
                        this.streams = null;
                        webSocketReader = this.reader;
                        this.reader = null;
                        webSocketWriter = this.writer;
                        this.writer = null;
                        this.taskQueue.shutdown();
                    } else {
                        webSocketReader = null;
                        webSocketWriter = null;
                    }
                    t t8 = t.a;
                    // MONITOREXIT : this
                    try {
                        this.listener.onClosing(this, n8, (String)object);
                        if (streams == null) break block13;
                        this.listener.onClosed(this, n8, (String)object);
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                }
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter == null) return;
                Util.closeQuietly(webSocketWriter);
                return;
            }
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter == null) throw throwable2;
            Util.closeQuietly(webSocketWriter);
            throw throwable2;
        }
        object = new IllegalStateException("already closed");
        throw object;
    }

    @Override
    public void onReadMessage(ax.xc.h h8) throws IOException {
        l.f(h8, "bytes");
        this.listener.onMessage((WebSocket)this, h8);
    }

    @Override
    public void onReadMessage(String string) throws IOException {
        l.f(string, "text");
        this.listener.onMessage((WebSocket)this, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onReadPing(ax.xc.h h8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            l.f(h8, "payload");
                            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) break block3;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.pongQueue.add(h8);
                    this.runWriter();
                    ++this.receivedPingCount;
                    return;
                }
                return;
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
    public void onReadPong(ax.xc.h h8) {
        synchronized (this) {
            l.f(h8, "payload");
            ++this.receivedPongCount;
            this.awaitingPong = false;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean pong(ax.xc.h h8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            l.f(h8, "payload");
                            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) break block4;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.pongQueue.add(h8);
                    this.runWriter();
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final boolean processNextFrame() throws IOException {
        boolean bl = false;
        try {
            WebSocketReader webSocketReader = this.reader;
            l.c(webSocketReader);
            webSocketReader.processNextFrame();
            int n8 = this.receivedCloseCode;
            if (n8 == -1) {
                bl = true;
            }
            return bl;
        }
        catch (Exception exception) {
            this.failWebSocket(exception, null);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long queueSize() {
        synchronized (this) {
            return this.queueSize;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int receivedPingCount() {
        synchronized (this) {
            return this.receivedPingCount;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int receivedPongCount() {
        synchronized (this) {
            return this.receivedPongCount;
        }
    }

    @Override
    public Request request() {
        return this.originalRequest;
    }

    @Override
    public boolean send(ax.xc.h h8) {
        l.f(h8, "bytes");
        return this.send(h8, 2);
    }

    @Override
    public boolean send(String string) {
        l.f(string, "text");
        return this.send(ax.xc.h.e0.d(string), 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int sentPingCount() {
        synchronized (this) {
            return this.sentPingCount;
        }
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean writeOneFrame$okhttp() throws IOException {
        block25: {
            block24: {
                block28: {
                    block23: {
                        synchronized (this) {
                            block26: {
                                block27: {
                                    block21: {
                                        try {
                                            var4_1 = this.failed;
                                            if (!var4_1) break block21;
                                        }
                                        catch (Throwable var5_5) {
                                            ** break block22
                                        }
                                        return false;
                                    }
                                    var11_2 = this.writer;
                                    var12_3 = this.pongQueue.poll();
                                    var5_4 = null;
                                    if (var12_3 != null) break block26;
                                    var8_6 = this.messageAndCloseQueue.poll();
                                    if (!(var8_6 instanceof Close)) break block27;
                                    var1_8 = this.receivedCloseCode;
                                    var9_9 = this.receivedCloseReason;
                                    if (var1_8 != -1) {
                                        var7_10 = this.streams;
                                        this.streams = null;
                                        var6_11 = this.reader;
                                        this.reader = null;
                                        var5_4 = this.writer;
                                        this.writer = null;
                                        this.taskQueue.shutdown();
                                    } else {
                                        var2_12 = ((Close)var8_6).getCancelAfterCloseMillis();
                                        var5_4 = this.taskQueue;
                                        var6_11 = new StringBuilder();
                                        var6_11.append(this.name);
                                        var6_11.append(" cancel");
                                        var7_10 = var6_11.toString();
                                        var2_12 = TimeUnit.MILLISECONDS.toNanos(var2_12);
                                        var6_11 = new Task((String)var7_10, true, this){
                                            final RealWebSocket this$0;
                                            {
                                                this.this$0 = realWebSocket;
                                                super(string, bl);
                                            }

                                            public long runOnce() {
                                                this.this$0.cancel();
                                                return -1L;
                                            }
                                        };
                                        var5_4.schedule(var6_11, var2_12);
                                        var7_10 = null;
                                        var6_11 = null;
                                        var5_4 = var6_11;
                                    }
                                    ** GOTO lbl-1000
                                }
                                if (var8_6 == null) {
                                    return false;
                                }
                                var5_4 = var8_6;
                            }
                            var10_13 = null;
                            var6_11 = null;
                            var9_9 = null;
                            var7_10 = null;
                            var1_8 = -1;
                            var8_6 = var5_4;
                            var5_4 = var10_13;
lbl-1000:
                            // 3 sources

                            {
                                var10_13 = t.a;
                                // MONITOREXIT @DISABLED, blocks:[2, 7] lbl54 : MonitorExitStatement: MONITOREXIT : this
                                if (var12_3 == null) break block23;
                            }
                        }
                        try {
                            l.c(var11_2);
                            var11_2.writePong(var12_3);
                            break block24;
                        }
                        catch (Throwable var8_7) {
                            break block25;
                        }
                    }
                    if (!(var8_6 instanceof Message)) break block28;
                    var8_6 = (Message)var8_6;
                    l.c(var11_2);
                    var11_2.writeMessageFrame(var8_6.getFormatOpcode(), var8_6.getData());
                    synchronized (this) {
                        this.queueSize -= (long)var8_6.getData().G();
                        break block24;
                    }
                }
                if (!(var8_6 instanceof Close)) ** GOTO lbl-1000
                var8_6 = (Close)var8_6;
                l.c(var11_2);
                var11_2.writeClose(var8_6.getCode(), var8_6.getReason());
                if (var7_10 != null) {
                    var8_6 = this.listener;
                    l.c(var9_9);
                    var8_6.onClosed(this, var1_8, var9_9);
                }
            }
            if (var7_10 != null) {
                Util.closeQuietly((Closeable)var7_10);
            }
            if (var6_11 != null) {
                Util.closeQuietly((Closeable)var6_11);
            }
            if (var5_4 != null) {
                Util.closeQuietly((Closeable)var5_4);
            }
            return true;
lbl-1000:
            // 1 sources

            {
                var8_6 = new AssertionError();
                throw var8_6;
            }
        }
        if (var7_10 != null) {
            Util.closeQuietly((Closeable)var7_10);
        }
        if (var6_11 != null) {
            Util.closeQuietly((Closeable)var6_11);
        }
        if (var5_4 != null) {
            Util.closeQuietly((Closeable)var5_4);
        }
        throw var8_7;
lbl-1000:
        // 1 sources

        {
            throw var5_5;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void writePingFrame$okhttp() {
        Object object;
        block9: {
            block8: {
                // MONITORENTER : this
                boolean bl = this.failed;
                if (!bl) break block8;
                return;
            }
            object = this.writer;
            if (object != null) break block9;
            // MONITOREXIT : this
            return;
        }
        int n8 = this.awaitingPong ? this.sentPingCount : -1;
        ++this.sentPingCount;
        this.awaitingPong = true;
        t t8 = t.a;
        // MONITOREXIT : this
        if (n8 != -1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("sent ping but didn't receive pong within ");
            ((StringBuilder)object).append(this.pingIntervalMillis);
            ((StringBuilder)object).append("ms (after ");
            ((StringBuilder)object).append(n8 - 1);
            ((StringBuilder)object).append(" successful ping/pongs)");
            this.failWebSocket(new SocketTimeoutException(((StringBuilder)object).toString()), null);
            return;
        }
        try {
            ((WebSocketWriter)object).writePing(ax.xc.h.f0);
            return;
        }
        catch (IOException iOException) {
            this.failWebSocket(iOException, null);
            return;
        }
    }

    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ax.xc.h reason;

        public Close(int n8, ax.xc.h h8, long l8) {
            this.code = n8;
            this.reason = h8;
            this.cancelAfterCloseMillis = l8;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ax.xc.h getReason() {
            return this.reason;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

    public static final class Message {
        private final ax.xc.h data;
        private final int formatOpcode;

        public Message(int n8, ax.xc.h h8) {
            l.f(h8, "data");
            this.formatOpcode = n8;
            this.data = h8;
        }

        public final ax.xc.h getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    public static abstract class Streams
    implements Closeable {
        private final boolean client;
        private final f sink;
        private final ax.xc.g source;

        public Streams(boolean bl, ax.xc.g g8, f f8) {
            l.f(g8, "source");
            l.f(f8, "sink");
            this.client = bl;
            this.source = g8;
            this.sink = f8;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final f getSink() {
            return this.sink;
        }

        public final ax.xc.g getSource() {
            return this.source;
        }
    }

    private final class WriterTask
    extends Task {
        final RealWebSocket this$0;

        public WriterTask(RealWebSocket realWebSocket) {
            this.this$0 = realWebSocket;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(realWebSocket.name);
            stringBuilder.append(" writer");
            super(stringBuilder.toString(), false, 2, null);
        }

        @Override
        public long runOnce() {
            try {
                boolean bl = this.this$0.writeOneFrame$okhttp();
                if (bl) {
                    return 0L;
                }
            }
            catch (IOException iOException) {
                this.this$0.failWebSocket(iOException, null);
            }
            return -1L;
        }
    }
}

