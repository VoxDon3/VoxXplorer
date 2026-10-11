/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import ax.Kc.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

public class e
extends c {
    private final SeekableByteChannel e0;

    public e(long l8, long l9, SeekableByteChannel seekableByteChannel) {
        super(l8, l9);
        this.e0 = seekableByteChannel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected int a(long l8, ByteBuffer byteBuffer) throws IOException {
        int n8;
        SeekableByteChannel seekableByteChannel = this.e0;
        synchronized (seekableByteChannel) {
            this.e0.position(l8);
            n8 = this.e0.read(byteBuffer);
        }
        byteBuffer.flip();
        return n8;
    }
}

