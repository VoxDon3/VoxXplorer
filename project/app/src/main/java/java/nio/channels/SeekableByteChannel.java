/*
 * Decompiled with CFR 0.152.
 */
package java.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public interface SeekableByteChannel
extends ByteChannel {
    public long position();

    public SeekableByteChannel position(long var1);

    @Override
    public int read(ByteBuffer var1);

    public long size();

    @Override
    public int write(ByteBuffer var1);
}

