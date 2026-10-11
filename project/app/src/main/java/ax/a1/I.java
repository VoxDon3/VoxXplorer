/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

public final class I {
    public static /* bridge */ /* synthetic */ boolean a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.isOffloadedPlaybackSupported((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }
}

