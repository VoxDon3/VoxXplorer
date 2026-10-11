package ax.Dc;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.FileAttribute;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public class T extends S {
    private final SeekableByteChannel y0;

    private static class a extends ax.Kc.c {
        private final FileChannel e0;

        a(long j, long j2, FileChannel fileChannel) {
            super(j, j2);
            this.e0 = fileChannel;
        }

        @Override // ax.Kc.c
        protected int a(long j, ByteBuffer byteBuffer) throws IOException {
            int read = this.e0.read(byteBuffer, j);
            byteBuffer.flip();
            return read;
        }
    }

    private T(SeekableByteChannel seekableByteChannel, String str) throws IOException {
        super(seekableByteChannel, str);
        this.y0 = seekableByteChannel;
    }

    private ax.Kc.c c(long j, long j2) {
        if (j < 0 || j2 < 0 || j + j2 < j) {
            throw new IllegalArgumentException("Corrupted archive, stream boundaries are out of range");
        }
        return this.y0 instanceof FileChannel ? new a(j, j2, (FileChannel) this.y0) : new ax.Kc.e(j, j2, this.y0);
    }

    public static T s0(File file, String str) throws IOException {
        SeekableByteChannel seekableByteChannel = null;
        try {
            seekableByteChannel = Files.newByteChannel(FileRetargetClass.toPath(file), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]);
            return new T(seekableByteChannel, str);
        } catch (IOException e) {
            ax.Kc.n.a(seekableByteChannel);
            throw e;
        }
    }

    public static T u0(SeekableByteChannel seekableByteChannel, String str) throws IOException {
        return new T(seekableByteChannel, str);
    }

    public InputStream A0(I i) throws IOException {
        return i.o().l() ? c(i.t(), i.getCompressedSize() + (i.k() - i.t())) : j(i);
    }
}
