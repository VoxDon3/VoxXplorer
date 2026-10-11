/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;

public final class e {
    public static /* bridge */ /* synthetic */ void a(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }
}

