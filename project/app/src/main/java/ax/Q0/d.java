/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

public final class d {
    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder a(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
    }
}

