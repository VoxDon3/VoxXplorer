/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioAttributes;
import android.media.AudioManager;
import java.util.List;

public final class g {
    public static /* bridge */ /* synthetic */ List a(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }
}

