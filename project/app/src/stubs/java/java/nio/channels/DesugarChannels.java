package java.nio.channels;

/** Stub: on minSdk 26 java.nio.channels is native, so the desugar retarget is a no-op. */
public final class DesugarChannels {
    private DesugarChannels() { }

    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        return fileChannel;
    }
}
