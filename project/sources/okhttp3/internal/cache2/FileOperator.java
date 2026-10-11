package okhttp3.internal.cache2;

import ax.Gb.l;
import ax.xc.C3487e;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        l.f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j, C3487e c3487e, long j2) {
        l.f(c3487e, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferTo = this.fileChannel.transferTo(j3, j4, c3487e);
            j3 += transferTo;
            j4 -= transferTo;
        }
    }

    public final void write(long j, C3487e c3487e, long j2) throws IOException {
        l.f(c3487e, "source");
        if (j2 < 0 || j2 > c3487e.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(c3487e, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
