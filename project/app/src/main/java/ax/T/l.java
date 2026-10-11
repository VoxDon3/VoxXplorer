/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public final class l {
    public static /* synthetic */ FileChannel a(FileInputStream fileInputStream) {
        return j.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary((FileChannel)fileInputStream.getChannel());
    }
}

