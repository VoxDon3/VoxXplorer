/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import ax.u3.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    private static final AtomicReference<byte[]> a = new AtomicReference();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ByteBuffer a(File object) throws IOException {
        RandomAccessFile randomAccessFile;
        block17: {
            RuntimeException var0_4;
            AbstractInterruptibleChannel abstractInterruptibleChannel;
            block18: {
                block16: {
                    FileChannel fileChannel;
                    abstractInterruptibleChannel = null;
                    long l8 = ((File)object).length();
                    if (l8 > Integer.MAX_VALUE) break block16;
                    randomAccessFile = new RandomAccessFile((File)object, "r");
                    try {
                        fileChannel = w.a(randomAccessFile);
                    }
                    catch (Throwable throwable) {
                        break block18;
                    }
                    try {
                        object = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, l8).load();
                    }
                    catch (Throwable throwable) {
                        abstractInterruptibleChannel = fileChannel;
                        break block18;
                    }
                    try {
                        fileChannel.close();
                        break block17;
                    }
                    catch (IOException iOException) {}
                }
                try {
                    object = new IOException("File too large to map into memory");
                    throw object;
                }
                catch (Throwable throwable) {
                    randomAccessFile = null;
                }
            }
            if (abstractInterruptibleChannel != null) {
                try {
                    abstractInterruptibleChannel.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (randomAccessFile == null) throw var0_4;
            try {
                randomAccessFile.close();
            }
            catch (IOException iOException) {
                throw var0_4;
            }
            throw var0_4;
        }
        try {
            randomAccessFile.close();
            return object;
        }
        catch (IOException iOException) {
            return object;
        }
    }

    private static b b(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        Object object = ax.k4.a.b(byteBuffer);
        if (object != null && ((b)object).a == 0 && ((b)object).b == ((b)object).c.length) {
            return byteBuffer.array();
        }
        byteBuffer = byteBuffer.asReadOnlyBuffer();
        object = new byte[byteBuffer.limit()];
        byteBuffer.position(0);
        byteBuffer.get((byte[])object);
        return object;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(ByteBuffer byteBuffer, File object) throws IOException {
        RandomAccessFile randomAccessFile;
        block13: {
            RuntimeException var0_3;
            Object object2;
            block14: {
                byteBuffer.position(0);
                object2 = null;
                Object var4_10 = null;
                randomAccessFile = new RandomAccessFile((File)object, "rw");
                object = var4_10;
                object = object2 = w.a(randomAccessFile);
                ((FileChannel)object2).write(byteBuffer);
                object = object2;
                ((FileChannel)object2).force(false);
                object = object2;
                ((AbstractInterruptibleChannel)object2).close();
                object = object2;
                randomAccessFile.close();
                try {
                    ((AbstractInterruptibleChannel)object2).close();
                    break block13;
                }
                catch (IOException iOException) {}
                catch (Throwable throwable) {
                    object2 = object;
                    object = randomAccessFile;
                }
                break block14;
                catch (Throwable throwable) {
                    object = null;
                }
            }
            if (object2 != null) {
                try {
                    ((AbstractInterruptibleChannel)object2).close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (object == null) throw var0_3;
            try {
                ((RandomAccessFile)object).close();
            }
            catch (IOException iOException) {
                throw var0_3;
            }
            throw var0_3;
        }
        try {
            randomAccessFile.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static InputStream e(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    private static class a
    extends InputStream
    implements j.InputStreamRetargetInterface {
        private int c0 = -1;
        private final ByteBuffer q;

        public a(ByteBuffer byteBuffer) {
            this.q = byteBuffer;
        }

        @Override
        public int available() throws IOException {
            return this.q.remaining();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void mark(int n8) {
            synchronized (this) {
                this.c0 = this.q.position();
                return;
            }
        }

        @Override
        public boolean markSupported() {
            return true;
        }

        @Override
        public int read() throws IOException {
            if (!this.q.hasRemaining()) {
                return -1;
            }
            return this.q.get();
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            if (!this.q.hasRemaining()) {
                return -1;
            }
            n9 = Math.min(n9, this.available());
            this.q.get(byArray, n8, n9);
            return n9;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void reset() throws IOException {
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    try {
                        int n8 = this.c0;
                        if (n8 != -1) {
                            this.q.position(n8);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    IOException iOException = new IOException("Cannot reset to unset mark position");
                    throw iOException;
                }
                throw throwable2;
            }
        }

        @Override
        public long skip(long l8) throws IOException {
            if (!this.q.hasRemaining()) {
                return -1L;
            }
            l8 = Math.min(l8, (long)this.available());
            ByteBuffer byteBuffer = this.q;
            byteBuffer.position((int)((long)byteBuffer.position() + l8));
            return l8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }

    static final class b {
        final int a;
        final int b;
        final byte[] c;

        public b(byte[] byArray, int n8, int n9) {
            this.c = byArray;
            this.a = n8;
            this.b = n9;
        }
    }
}

