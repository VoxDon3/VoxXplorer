/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;

public final class z {
    public static /* bridge */ /* synthetic */ boolean a(Spatializer spatializer, AudioAttributes audioAttributes, AudioFormat audioFormat) {
        return spatializer.canBeSpatialized(audioAttributes, audioFormat);
    }
}

