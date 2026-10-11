/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import ax.f1.c0;
import ax.f1.x;

public final class b0
implements MediaCodec.OnFrameRenderedListener {
    public final c0 a;
    public final x.d b;

    public /* synthetic */ b0(c0 c02, x.d d8) {
        this.a = c02;
        this.b = d8;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long l8, long l9) {
        c0.r(this.a, this.b, mediaCodec, l8, l9);
    }
}

