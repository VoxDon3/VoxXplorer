/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.os.Bundle;
import ax.V0.c;
import ax.f1.z;

class d0
implements z {
    private final MediaCodec a;

    public d0(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override
    public void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public void b(int n8, int n9, c c8, long l8, int n10) {
        this.a.queueSecureInputBuffer(n8, n9, c8.a(), l8, n10);
    }

    @Override
    public void c(int n8, int n9, int n10, long l8, int n11) {
        this.a.queueInputBuffer(n8, n9, n10, l8, n11);
    }

    @Override
    public void d() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }
}

