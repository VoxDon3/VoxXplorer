/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

public final class k0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }
}

