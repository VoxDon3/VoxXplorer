package j$.nio.channels;

import j$.desugar.sun.nio.fs.e;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class DesugarChannels {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (j$.adapter.a.a) {
            return fileChannel;
        }
        int i = e.e;
        if (fileChannel instanceof e) {
            return (e) fileChannel;
        }
        return new e(fileChannel, false, false, null);
    }
}
