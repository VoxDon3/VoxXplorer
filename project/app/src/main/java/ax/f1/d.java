/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import ax.f1.e;
import ax.f1.x;

public final class d
implements MediaCodec.OnFrameRenderedListener {
    public final e a;
    public final x.d b;

    public /* synthetic */ d(e e8, x.d d8) {
        this.a = e8;
        this.b = d8;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long l8, long l9) {
        e.r(this.a, this.b, mediaCodec, l8, l9);
    }
}

