package java.nio.channels;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface SeekableByteChannel extends ByteChannel {
    long position();

    SeekableByteChannel position(long j);

    @Override // java.nio.channels.ReadableByteChannel
    int read(ByteBuffer byteBuffer);

    long size();

    int write(ByteBuffer byteBuffer);
}
