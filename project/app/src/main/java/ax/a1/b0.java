/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTrack;
import android.os.Handler;
import ax.a1.B;
import ax.a1.f0;

public final class b0
implements Runnable {
    public final B.d c0;
    public final Handler d0;
    public final B.a e0;
    public final AudioTrack q;

    public /* synthetic */ b0(AudioTrack audioTrack, B.d d8, Handler handler, B.a a8) {
        this.q = audioTrack;
        this.c0 = d8;
        this.d0 = handler;
        this.e0 = a8;
    }

    @Override
    public final void run() {
        f0.H(this.q, this.c0, this.d0, this.e0);
    }
}

