/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache2;

import ax.Gb.g;
import ax.Gb.l;
import ax.sb.t;
import ax.u3.w;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;
import okhttp3.internal.cache2.FileOperator;

public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32L;
    public static final h PREFIX_CLEAN;
    public static final h PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final e buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final h metadata;
    private int sourceCount;
    private C upstream;
    private final e upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    static {
        h.a a8 = h.e0;
        PREFIX_CLEAN = a8.d("OkHttp cache v1\n");
        PREFIX_DIRTY = a8.d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, C c8, long l8, h h8, long l9) {
        this.file = randomAccessFile;
        this.upstream = c8;
        this.upstreamPos = l8;
        this.metadata = h8;
        this.bufferMaxSize = l9;
        this.upstreamBuffer = new e();
        boolean bl = this.upstream == null;
        this.complete = bl;
        this.buffer = new e();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C c8, long l8, h h8, long l9, g g8) {
        this(randomAccessFile, c8, l8, h8, l9);
    }

    private final void writeHeader(h object, long l8, long l9) throws IOException {
        e e8 = new e();
        e8.f1((h)object);
        e8.n1(l8);
        e8.n1(l9);
        if (e8.size() == 32L) {
            object = this.file;
            l.c(object);
            object = w.a((RandomAccessFile)object);
            l.e(object, "file!!.channel");
            new FileOperator((FileChannel)object).write(0L, e8, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final void writeMetadata(long l8) throws IOException {
        e e8 = new e();
        e8.f1(this.metadata);
        Closeable closeable = this.file;
        l.c(closeable);
        closeable = w.a(closeable);
        l.e(closeable, "file!!.channel");
        new FileOperator((FileChannel)closeable).write(32L + l8, e8, this.metadata.G());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void commit(long l8) throws IOException {
        this.writeMetadata(l8);
        Object object = this.file;
        l.c(object);
        w.a((RandomAccessFile)object).force(false);
        this.writeHeader(PREFIX_CLEAN, l8, this.metadata.G());
        object = this.file;
        l.c(object);
        w.a((RandomAccessFile)object).force(false);
        synchronized (this) {
            this.complete = true;
            object = t.a;
        }
        object = this.upstream;
        if (object != null) {
            Util.closeQuietly((Closeable)object);
        }
        this.upstream = null;
    }

    public final e getBuffer() {
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

    public final e getUpstreamBuffer() {
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
            block4: {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) break block4;
                return null;
            }
            ++this.sourceCount;
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean bl) {
        this.complete = bl;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int n8) {
        this.sourceCount = n8;
    }

    public final void setUpstream(C c8) {
        this.upstream = c8;
    }

    public final void setUpstreamPos(long l8) {
        this.upstreamPos = l8;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Relay edit(File object, C object2, h h8, long l8) throws IOException {
            l.f(object, "file");
            l.f(object2, "upstream");
            l.f(h8, "metadata");
            object = new RandomAccessFile((File)object, "rw");
            object2 = new Relay((RandomAccessFile)object, (C)object2, 0L, h8, l8, null);
            ((RandomAccessFile)object).setLength(0L);
            ((Relay)object2).writeHeader(PREFIX_DIRTY, -1L, -1L);
            return object2;
        }

        public final Relay read(File object) throws IOException {
            l.f(object, "file");
            object = new RandomAccessFile((File)object, "rw");
            Object object2 = w.a((RandomAccessFile)object);
            l.e(object2, "randomAccessFile.channel");
            object2 = new FileOperator((FileChannel)object2);
            e e8 = new e();
            ((FileOperator)object2).read(0L, e8, 32L);
            Object object3 = PREFIX_CLEAN;
            if (l.a(e8.B(((h)object3).G()), object3)) {
                long l8 = e8.readLong();
                long l9 = e8.readLong();
                object3 = new e();
                ((FileOperator)object2).read(32L + l8, (e)object3, l9);
                return new Relay((RandomAccessFile)object, null, l8, ((e)object3).m0(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    public final class RelaySource
    implements C,
    AutoCloseable {
        private FileOperator fileOperator;
        private long sourcePos;
        final Relay this$0;
        private final D timeout;

        public RelaySource(Relay object) {
            this.this$0 = object;
            this.timeout = new D();
            object = ((Relay)object).getFile();
            l.c(object);
            object = w.a((RandomAccessFile)object);
            l.e(object, "file!!.channel");
            this.fileOperator = new FileOperator((FileChannel)object);
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
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.this$0;
            // MONITORENTER : relay
            relay.setSourceCount(relay.getSourceCount() - 1);
            if (relay.getSourceCount() == 0) {
                randomAccessFile = relay.getFile();
                relay.setFile(null);
            }
            t t8 = t.a;
            // MONITOREXIT : relay
            if (randomAccessFile == null) return;
            Util.closeQuietly(randomAccessFile);
        }

        /*
         * Exception decompiling
         */
        @Override
        public long read(e var1_1, long var2_3) throws IOException {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 82->90)] java.lang.Throwable
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

        @Override
        public D timeout() {
            return this.timeout;
        }
    }
}

