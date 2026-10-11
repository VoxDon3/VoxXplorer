/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.I;
import ax.Dc.S;
import ax.Kc.c;
import ax.Kc.e;
import ax.Kc.n;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.EnumSet;

public class T
extends S {
    private final SeekableByteChannel y0;

    private T(SeekableByteChannel seekableByteChannel, String string) throws IOException {
        super(seekableByteChannel, string);
        this.y0 = seekableByteChannel;
    }

    private c c(long l8, long l9) {
        if (l8 >= 0L && l9 >= 0L && l8 + l9 >= l8) {
            if (this.y0 instanceof FileChannel) {
                return new a(l8, l9, (FileChannel)this.y0);
            }
            return new e(l8, l9, this.y0);
        }
        throw new IllegalArgumentException("Corrupted archive, stream boundaries are out of range");
    }

    public static T s0(File object, String string) throws IOException {
        Object object2 = null;
        try {
            object2 = object = j.Files.newByteChannel((j.Path)j.FileRetargetClass.toPath((File)object), EnumSet.of(j.StandardOpenOption.READ), (j.FileAttribute[])new j.FileAttribute[0]);
        }
        catch (IOException iOException) {
            n.a(object2);
            throw iOException;
        }
        object = new T((SeekableByteChannel)object, string);
        return object;
    }

    public static T u0(SeekableByteChannel seekableByteChannel, String string) throws IOException {
        return new T(seekableByteChannel, string);
    }

    public InputStream A0(I i8) throws IOException {
        if (i8.o().l()) {
            return this.c(i8.t(), i8.getCompressedSize() + (i8.k() - i8.t()));
        }
        return this.j(i8);
    }

    private static class a
    extends c {
        private final FileChannel e0;

        a(long l8, long l9, FileChannel fileChannel) {
            super(l8, l9);
            this.e0 = fileChannel;
        }

        @Override
        protected int a(long l8, ByteBuffer byteBuffer) throws IOException {
            int n8 = this.e0.read(byteBuffer, l8);
            byteBuffer.flip();
            return n8;
        }
    }
}

