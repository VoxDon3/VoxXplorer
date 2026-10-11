/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.os.Handler;

public final class b {
    public static /* bridge */ /* synthetic */ void a(MediaCodec mediaCodec, MediaCodec.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        mediaCodec.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }
}

