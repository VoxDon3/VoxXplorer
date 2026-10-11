/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

public final class b {
    public static int a(AudioManager audioManager, androidx.media.a a8) {
        if (audioManager != null) {
            if (a8 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return a.a(audioManager, a8.c());
                }
                return audioManager.abandonAudioFocus(a8.e());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static int b(AudioManager audioManager, androidx.media.a a8) {
        if (audioManager != null) {
            if (a8 != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return a.b(audioManager, a8.c());
                }
                return audioManager.requestAudioFocus(a8.e(), a8.b().a(), a8.d());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    private static class a {
        static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }
}

