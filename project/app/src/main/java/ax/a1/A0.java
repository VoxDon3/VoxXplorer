/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;

public final class A0 {
    public static /* bridge */ /* synthetic */ AudioTrack.Builder a(AudioTrack.Builder builder, boolean bl) {
        return builder.setOffloadedPlayback(bl);
    }
}

