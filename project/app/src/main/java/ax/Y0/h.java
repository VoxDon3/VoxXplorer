/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

public final class h {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo[] a(AudioManager audioManager, int n8) {
        return audioManager.getDevices(n8);
    }
}

