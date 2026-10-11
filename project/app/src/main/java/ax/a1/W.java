/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

public final class W {
    public static /* bridge */ /* synthetic */ int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int n8, int n9, long l8) {
        return audioTrack.write(byteBuffer, n8, n9, l8);
    }
}

