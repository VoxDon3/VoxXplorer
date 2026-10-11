package ax.k4;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ax.k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2397a {
    private static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* renamed from: ax.k4.a$b */
    static final class b {
        final int a;
        final int b;
        final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    public static ByteBuffer a(File file) throws IOException {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                try {
                    MappedByteBuffer load = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        convertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return load;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = convertMaybeLegacyFileChannelFromLibrary;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    private static b b(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static byte[] c(ByteBuffer byteBuffer) {
        b b2 = b(byteBuffer);
        if (b2 != null && b2.a == 0 && b2.b == b2.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static InputStream e(ByteBuffer byteBuffer) {
        return new C0352a(byteBuffer);
    }

    /* renamed from: ax.k4.a$a, reason: collision with other inner class name */
    private static class C0352a extends InputStream implements InputStreamRetargetInterface {
        private int c0 = -1;
        private final ByteBuffer q;

        public C0352a(ByteBuffer byteBuffer) {
            this.q = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.q.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.c0 = this.q.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.q.hasRemaining()) {
                return this.q.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.c0;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.q.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (!this.q.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            this.q.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.q.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.q.get(bArr, i, min);
            return min;
        }
    }
}
