/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache2;

import ax.Gb.l;
import ax.xc.e;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        l.f(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long l8, e e8, long l9) {
        l.f(e8, "sink");
        if (l9 >= 0L) {
            long l10 = l8;
            l8 = l9;
            l9 = l10;
            while (l8 > 0L) {
                l10 = this.fileChannel.transferTo(l9, l8, e8);
                l9 += l10;
                l8 -= l10;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long l8, e e8, long l9) throws IOException {
        l.f(e8, "source");
        if (l9 >= 0L && l9 <= e8.size()) {
            long l10 = l8;
            for (l8 = l9; l8 > 0L; l8 -= l9) {
                l9 = this.fileChannel.transferFrom(e8, l10, l8);
                l10 += l9;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

