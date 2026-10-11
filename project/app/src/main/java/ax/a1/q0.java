/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;
import java.util.concurrent.Executor;

public final class q0 {
    public static /* bridge */ /* synthetic */ void a(AudioTrack audioTrack, Executor executor, AudioTrack.StreamEventCallback streamEventCallback) {
        audioTrack.registerStreamEventCallback(executor, streamEventCallback);
    }
}

