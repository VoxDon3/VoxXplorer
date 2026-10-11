/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;

public final class p0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioTrack.StreamEventCallback streamEventCallback) {
        audioTrack.unregisterStreamEventCallback(streamEventCallback);
    }
}

