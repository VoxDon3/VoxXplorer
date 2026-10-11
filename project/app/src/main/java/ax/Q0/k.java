/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

public final class k {
    public static /* bridge */ /* synthetic */ int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }
}

