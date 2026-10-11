/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;
import ax.P0.D;
import ax.P0.v;
import ax.Q0.o;
import ax.S0.N;
import ax.S0.d0;
import ax.W0.a;
import ax.a1.B;
import ax.a1.H;
import ax.a1.f0;
import ax.a1.z;

public final class b
extends H<a> {
    private static int V0;
    public static final int W0 = 0;

    public b() {
        this(null, null, new o[0]);
    }

    public b(Handler handler, z z8, B b8) {
        super(handler, z8, b8);
    }

    public b(Handler handler, z z8, o ... oArray) {
        this(handler, z8, new f0.g().m(oArray).k());
    }

    public static int G0() {
        return V0;
    }

    public static void I0(int n8) {
        V0 = n8;
    }

    private boolean J0(v v8) {
        if (!this.K0(v8, 2)) {
            return true;
        }
        if (this.s0(d0.l0(4, v8.G, v8.H)) != 2) {
            return false;
        }
        return "audio/ac3".equals(v8.o) ^ true;
    }

    private boolean K0(v v8, int n8) {
        return this.C0(d0.l0(n8, v8.G, v8.H));
    }

    private boolean L0(String string) {
        if (ax.P2.b.i()) {
            return FfmpegLibrary.e(string);
        }
        if (ax.P2.b.a() == 1) {
            return com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.g(string);
        }
        return false;
    }

    @Override
    public int A() {
        return 8;
    }

    @Override
    protected int D0(v v8) {
        String string = ax.S0.a.e(v8.o);
        if (ax.P2.b.b() && D.o(string)) {
            if (this.L0(string) && (this.K0(v8, 2) || this.K0(v8, 4))) {
                if (v8.P != 0) {
                    return 2;
                }
                return 4;
            }
            return 1;
        }
        return 0;
    }

    protected a F0(v object, ax.V0.b b8) throws ax.W0.b {
        N.a("createFfmpegAudioDecoder");
        int n8 = ((v)object).p;
        if (n8 == -1) {
            n8 = 5760;
        }
        object = ax.P2.b.i() ? new FfmpegAudioDecoder((v)object, 16, 16, n8, this.J0((v)object)) : new com.google.android.exoplayer2.ext.ffmpeg.a(ax.P2.b.f(), (v)object, 16, 16, n8, this.J0((v)object), V0);
        N.b();
        return object;
    }

    protected v H0(a a8) {
        ax.S0.a.e(a8);
        int n8 = a8.y();
        int n9 = b.G0();
        int n10 = n8;
        if (n9 > 0) {
            n10 = n8;
            if (n8 > n9) {
                n10 = n9;
            }
        }
        return new v.b().y0("audio/raw").T(n10).z0(a8.A()).s0(a8.z()).P();
    }

    @Override
    public String getName() {
        return "FfmpegAudioRenderer";
    }
}

