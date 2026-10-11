/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import ax.P0.c;
import ax.S0.d0;
import ax.a1.A0;
import ax.a1.B;
import ax.a1.f0;
import ax.a1.j0;
import ax.a1.s0;
import ax.a1.t0;
import ax.a1.u0;
import ax.a1.v0;
import ax.a1.w0;
import ax.a1.x0;
import ax.a1.y0;
import ax.a1.z0;

public class B0
implements f0.f {
    private AudioTrack c(B.a a8, c c8, int n8) {
        return new AudioTrack(this.f(c8, a8.d), d0.L(a8.b, a8.c, a8.a), a8.f, 1, n8);
    }

    private AudioTrack d(B.a a8, c c8, int n8, Context context) {
        AudioFormat audioFormat = d0.L(a8.b, a8.c, a8.a);
        c8 = this.f(c8, a8.d);
        c8 = x0.a(w0.a(v0.a(u0.a(t0.a(s0.a(), (AudioAttributes)c8), audioFormat), 1), a8.f), n8);
        n8 = Build.VERSION.SDK_INT;
        if (n8 >= 29) {
            this.h((AudioTrack.Builder)c8, a8.e);
        }
        if (n8 >= 34 && context != null) {
            y0.a((AudioTrack.Builder)c8, context);
        }
        return z0.a(this.e((AudioTrack.Builder)c8));
    }

    private AudioAttributes f(c c8, boolean bl) {
        if (bl) {
            return this.g();
        }
        return c8.a().a;
    }

    private AudioAttributes g() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void h(AudioTrack.Builder builder, boolean bl) {
        A0.a(builder, bl);
    }

    @Override
    public /* synthetic */ int a(int n8) {
        return j0.a(this, n8);
    }

    @Override
    public final AudioTrack b(B.a a8, c c8, int n8, Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.d(a8, c8, n8, context);
        }
        return this.c(a8, c8, n8);
    }

    protected AudioTrack.Builder e(AudioTrack.Builder builder) {
        return builder;
    }
}

