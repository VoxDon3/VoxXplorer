/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodecInfo;
import android.util.Range;

public final class C {
    public static /* bridge */ /* synthetic */ Range a(MediaCodecInfo.VideoCapabilities videoCapabilities, int n8, int n9) {
        return videoCapabilities.getAchievableFrameRatesFor(n8, n9);
    }
}

