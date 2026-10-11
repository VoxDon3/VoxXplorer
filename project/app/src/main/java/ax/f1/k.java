/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.os.Handler;

public final class k {
    public static /* bridge */ /* synthetic */ void a(MediaCodec mediaCodec, MediaCodec.Callback callback, Handler handler) {
        mediaCodec.setCallback(callback, handler);
    }
}

