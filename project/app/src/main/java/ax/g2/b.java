/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public final class b {
    public static /* synthetic */ FileChannel a(FileOutputStream fileOutputStream) {
        return j.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary((FileChannel)fileOutputStream.getChannel());
    }
}

