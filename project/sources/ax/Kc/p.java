package ax.Kc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class p implements SeekableByteChannel, AutoCloseable {
    private long c0;
    private int d0;
    private final List<SeekableByteChannel> q;

    public synchronized SeekableByteChannel a(long j, long j2) throws IOException {
        try {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            for (int i = 0; i < j; i++) {
                j2 += this.q.get(i).size();
            }
        } catch (Throwable th) {
            throw th;
        }
        return position(j2);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<SeekableByteChannel> it = this.q.iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                }
            }
        }
        if (iOException != null) {
            throw new IOException("failed to close wrapped channel", iOException);
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        Iterator<SeekableByteChannel> it = this.q.iterator();
        while (it.hasNext()) {
            if (!it.next().isOpen()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
        return this.c0;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        try {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            int i = 0;
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            while (byteBuffer.hasRemaining() && this.d0 < this.q.size()) {
                SeekableByteChannel seekableByteChannel = this.q.get(this.d0);
                int read = seekableByteChannel.read(byteBuffer);
                if (read == -1) {
                    this.d0++;
                } else {
                    if (seekableByteChannel.position() >= seekableByteChannel.size()) {
                        this.d0++;
                    }
                    i += read;
                }
            }
            if (i <= 0) {
                return -1;
            }
            this.c0 += i;
            return i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        Iterator<SeekableByteChannel> it = this.q.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().size();
        }
        return j;
    }

    public SeekableByteChannel truncate(long j) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized SeekableByteChannel position(long j) throws IOException {
        try {
            if (j < 0) {
                throw new IOException("Negative position: " + j);
            }
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            this.c0 = j;
            int i = 0;
            while (i < this.q.size()) {
                SeekableByteChannel seekableByteChannel = this.q.get(i);
                long size = seekableByteChannel.size();
                long j2 = -1;
                if (j == -1) {
                    j2 = j;
                    j = 0;
                } else if (j <= size) {
                    this.d0 = i;
                } else {
                    j2 = j - size;
                    j = size;
                }
                seekableByteChannel.position(j);
                i++;
                j = j2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
