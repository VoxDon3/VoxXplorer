/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

public final class g0 {
    public static /* bridge */ /* synthetic */ boolean a(AudioTrack audioTrack, AudioDeviceInfo audioDeviceInfo) {
        return audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

