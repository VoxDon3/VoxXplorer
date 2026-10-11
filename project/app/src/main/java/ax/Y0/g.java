/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.media.AudioDeviceCallback;
import android.media.AudioManager;

public final class g {
    public static /* bridge */ /* synthetic */ void a(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback) {
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}

