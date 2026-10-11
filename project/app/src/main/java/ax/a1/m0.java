/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioRouting;
import android.media.AudioTrack;

public final class m0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        audioTrack.removeOnRoutingChangedListener(onRoutingChangedListener);
    }
}

