package okhttp3.internal.cache2;

import ax.Gb.g;
import ax.Gb.l;
import ax.sb.t;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.D;
import ax.xc.h;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final h PREFIX_CLEAN;
    public static final h PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C3487e buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final h metadata;
    private int sourceCount;
    private C upstream;
    private final C3487e upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Relay edit(File file, C c, h hVar, long j) throws IOException {
            l.f(file, "file");
            l.f(c, "upstream");
            l.f(hVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, c, 0L, hVar, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            l.f(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
            l.e(convertMaybeLegacyFileChannelFromLibrary, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(convertMaybeLegacyFileChannelFromLibrary);
            C3487e c3487e = new C3487e();
            fileOperator.read(0L, c3487e, Relay.FILE_HEADER_SIZE);
            if (!l.a(c3487e.B(r11.G()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = c3487e.readLong();
            long readLong2 = c3487e.readLong();
            C3487e c3487e2 = new C3487e();
            fileOperator.read(Relay.FILE_HEADER_SIZE + readLong, c3487e2, readLong2);
            return new Relay(randomAccessFile, null, readLong, c3487e2.m0(), 0L, null);
        }

        private Companion() {
        }
    }

    public final class RelaySource implements C, AutoCloseable {
        private FileOperator fileOperator;
        private long sourcePos;
        private final D timeout = new D();

        public RelaySource() {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            RandomAccessFile file = Relay.this.getFile();
            l.c(file);
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(file.getChannel());
            l.e(convertMaybeLegacyFileChannelFromLibrary, "file!!.channel");
            this.fileOperator = new FileOperator(convertMaybeLegacyFileChannelFromLibrary);
        }

        @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    t tVar = t.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r4 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = java.lang.Math.min(r23, r21.this$0.getUpstreamPos() - r21.sourcePos);
            r2 = r21.fileOperator;
            ax.Gb.l.c(r2);
            r2.read(r21.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r6);
            r21.sourcePos += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            r0 = r21.this$0.getUpstream();
            ax.Gb.l.c(r0);
            r13 = r0.read(r21.this$0.getUpstreamBuffer(), r21.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r13 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            r0 = r21.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        
            r2.setUpstreamReader(null);
            ax.Gb.l.d(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = ax.sb.t.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        
            r6 = java.lang.Math.min(r13, r23);
            r21.this$0.getUpstreamBuffer().j(r22, 0, r6);
            r21.sourcePos += r6;
            r13 = r21.fileOperator;
            ax.Gb.l.c(r13);
            r13.write(r21.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.getUpstreamBuffer().clone(), r13);
            r4 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
        
            r4.getBuffer().write(r4.getUpstreamBuffer(), r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
        
            if (r4.getBuffer().size() <= r4.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
        
            r4.getBuffer().skip(r4.getBuffer().size() - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        
            r4.setUpstreamPos(r4.getUpstreamPos() + r13);
            r0 = ax.sb.t.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
        
            r2.setUpstreamReader(null);
            ax.Gb.l.d(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        
            r2.setUpstreamReader(null);
            ax.Gb.l.d(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = ax.sb.t.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
        
            throw r0;
         */
        @Override // ax.xc.C
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(ax.xc.C3487e r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(ax.xc.e, long):long");
        }

        @Override // ax.xc.C
        public D timeout() {
            return this.timeout;
        }
    }

    static {
        h.a aVar = h.e0;
        PREFIX_CLEAN = aVar.d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.d("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C c, long j, h hVar, long j2, g gVar) {
        this(randomAccessFile, c, j, hVar, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(h hVar, long j, long j2) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        C3487e c3487e = new C3487e();
        c3487e.I0(hVar);
        c3487e.n1(j);
        c3487e.n1(j2);
        if (c3487e.size() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        l.c(randomAccessFile);
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        l.e(convertMaybeLegacyFileChannelFromLibrary, "file!!.channel");
        new FileOperator(convertMaybeLegacyFileChannelFromLibrary).write(0L, c3487e, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        C3487e c3487e = new C3487e();
        c3487e.I0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        l.c(randomAccessFile);
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        l.e(convertMaybeLegacyFileChannelFromLibrary, "file!!.channel");
        new FileOperator(convertMaybeLegacyFileChannelFromLibrary).write(FILE_HEADER_SIZE + j, c3487e, this.metadata.G());
    }

    public final void commit(long j) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        FileChannel convertMaybeLegacyFileChannelFromLibrary2;
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        l.c(randomAccessFile);
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        convertMaybeLegacyFileChannelFromLibrary.force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.G());
        RandomAccessFile randomAccessFile2 = this.file;
        l.c(randomAccessFile2);
        convertMaybeLegacyFileChannelFromLibrary2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile2.getChannel());
        convertMaybeLegacyFileChannelFromLibrary2.force(false);
        synchronized (this) {
            this.complete = true;
            t tVar = t.a;
        }
        C c = this.upstream;
        if (c != null) {
            Util.closeQuietly(c);
        }
        this.upstream = null;
    }

    public final C3487e getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final C getUpstream() {
        return this.upstream;
    }

    public final C3487e getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final h metadata() {
        return this.metadata;
    }

    public final C newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(C c) {
        this.upstream = c;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, C c, long j, h hVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = c;
        this.upstreamPos = j;
        this.metadata = hVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C3487e();
        this.complete = this.upstream == null;
        this.buffer = new C3487e();
    }
}
