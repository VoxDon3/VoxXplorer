/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

public final class K {
    public static /* bridge */ /* synthetic */ int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        return AudioManager.getPlaybackOffloadSupport((AudioFormat)audioFormat, (AudioAttributes)audioAttributes);
    }
}

