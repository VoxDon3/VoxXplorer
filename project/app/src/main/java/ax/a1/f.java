/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

public final class f {
    public static /* bridge */ /* synthetic */ boolean a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioTrack.isDirectPlaybackSupported((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }
}

