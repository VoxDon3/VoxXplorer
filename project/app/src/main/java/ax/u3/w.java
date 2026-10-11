/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public final class w {
    public static /* synthetic */ FileChannel a(RandomAccessFile randomAccessFile) {
        return j.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary((FileChannel)randomAccessFile.getChannel());
    }
}

