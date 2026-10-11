/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import ax.S0.a;
import ax.f1.p;
import ax.f1.q;
import ax.f1.r;
import ax.f1.s;
import ax.f1.u;
import ax.v7.f;
import java.util.HashSet;
import java.util.Iterator;

public final class t {
    private final HashSet<MediaCodec> a = new HashSet();
    private final b b;
    private LoudnessCodecController c;

    public t() {
        this(ax.f1.t$b.a);
    }

    public t(b b8) {
        this.b = b8;
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null && !p.a(loudnessCodecController, mediaCodec)) {
            return;
        }
        ax.S0.a.g(this.a.add(mediaCodec));
    }

    public void c() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            r.a(loudnessCodecController);
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.a.remove(mediaCodec) && (loudnessCodecController = this.c) != null) {
            q.a(loudnessCodecController, mediaCodec);
        }
    }

    public void e(int n8) {
        LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            r.a(loudnessCodecController);
            this.c = null;
        }
        this.c = loudnessCodecController = s.a(n8, f.a(), new LoudnessCodecController.OnLoudnessCodecUpdateListener(this){
            final t a;
            {
                this.a = t8;
            }

            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                return this.a.b.a(bundle);
            }
        });
        Iterator<MediaCodec> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (p.a(loudnessCodecController, iterator.next())) continue;
            iterator.remove();
        }
    }

    public static interface b {
        public static final b a = new u();

        public Bundle a(Bundle var1);
    }
}

