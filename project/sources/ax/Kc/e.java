package ax.Kc;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes3.dex */
public class e extends c {
    private final SeekableByteChannel e0;

    public e(long j, long j2, SeekableByteChannel seekableByteChannel) {
        super(j, j2);
        this.e0 = seekableByteChannel;
    }

    @Override // ax.Kc.c
    protected int a(long j, ByteBuffer byteBuffer) throws IOException {
        int read;
        synchronized (this.e0) {
            this.e0.position(j);
            read = this.e0.read(byteBuffer);
        }
        byteBuffer.flip();
        return read;
    }
}
