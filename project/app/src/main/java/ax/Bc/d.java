/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

class d
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final SeekableByteChannel c0;
    private long d0;
    private final ByteBuffer q;

    public d(SeekableByteChannel seekableByteChannel, long l8) {
        this.c0 = seekableByteChannel;
        this.d0 = l8;
        if (l8 < 8192L && l8 > 0L) {
            this.q = ByteBuffer.allocate((int)l8);
            return;
        }
        this.q = ByteBuffer.allocate(8192);
    }

    private int a(int n8) throws IOException {
        this.q.rewind().limit(n8);
        n8 = this.c0.read(this.q);
        this.q.flip();
        return n8;
    }

    @Override
    public void close() {
    }

    @Override
    public int read() throws IOException {
        long l8 = this.d0;
        if (l8 > 0L) {
            this.d0 = l8 - 1L;
            int n8 = this.a(1);
            if (n8 < 0) {
                return n8;
            }
            return this.q.get() & 0xFF;
        }
        return -1;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        ByteBuffer byteBuffer;
        if (n9 == 0) {
            return 0;
        }
        long l8 = this.d0;
        if (l8 <= 0L) {
            return -1;
        }
        int n10 = n9;
        if ((long)n9 > l8) {
            n10 = (int)l8;
        }
        if (n10 <= this.q.capacity()) {
            byteBuffer = this.q;
            n9 = this.a(n10);
        } else {
            byteBuffer = ByteBuffer.allocate(n10);
            n9 = this.c0.read(byteBuffer);
            byteBuffer.flip();
        }
        if (n9 >= 0) {
            byteBuffer.get(byArray, n8, n9);
            this.d0 -= (long)n9;
        }
        return n9;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

