/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import ax.S0.N;
import ax.f1.a;
import ax.f1.b0;
import ax.f1.c;
import ax.f1.t;
import ax.f1.w;
import ax.f1.x;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class c0
implements x {
    private final MediaCodec a;
    private final t b;

    private c0(MediaCodec mediaCodec, t t8) {
        this.a = mediaCodec;
        this.b = t8;
        if (Build.VERSION.SDK_INT >= 35 && t8 != null) {
            t8.b(mediaCodec);
        }
    }

    public static /* synthetic */ void r(c0 c02, x.d d8, MediaCodec mediaCodec, long l8, long l9) {
        c02.getClass();
        d8.a(c02, l8, l9);
    }

    @Override
    public void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override
    public void b(int n8, int n9, ax.V0.c c8, long l8, int n10) {
        this.a.queueSecureInputBuffer(n8, n9, c8.a(), l8, n10);
    }

    @Override
    public void c(int n8, int n9, int n10, long l8, int n11) {
        this.a.queueInputBuffer(n8, n9, n10, l8, n11);
    }

    @Override
    public void d() {
        t t8;
        Throwable throwable2;
        block6: {
            t t9;
            int n8;
            block5: {
                try {
                    n8 = Build.VERSION.SDK_INT;
                    if (n8 < 30 || n8 >= 33) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.a.stop();
            }
            if (n8 >= 35 && (t9 = this.b) != null) {
                t9.d(this.a);
            }
            this.a.release();
            return;
        }
        if (Build.VERSION.SDK_INT >= 35 && (t8 = this.b) != null) {
            t8.d(this.a);
        }
        this.a.release();
        throw throwable2;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public MediaFormat f() {
        return this.a.getOutputFormat();
    }

    @Override
    public void flush() {
        this.a.flush();
    }

    @Override
    public void g() {
        ax.f1.a.a(this.a);
    }

    @Override
    public /* synthetic */ boolean h(x.c c8) {
        return w.a(this, c8);
    }

    @Override
    public void i(int n8, long l8) {
        this.a.releaseOutputBuffer(n8, l8);
    }

    @Override
    public int j() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override
    public void k(x.d d8, Handler handler) {
        ax.f1.b.a(this.a, new b0(this, d8), handler);
    }

    @Override
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int n8;
        while ((n8 = this.a.dequeueOutputBuffer(bufferInfo, 0L)) == -3) {
        }
        return n8;
    }

    @Override
    public void m(int n8, boolean bl) {
        this.a.releaseOutputBuffer(n8, bl);
    }

    @Override
    public void n(int n8) {
        this.a.setVideoScalingMode(n8);
    }

    @Override
    public ByteBuffer o(int n8) {
        return this.a.getInputBuffer(n8);
    }

    @Override
    public void p(Surface surface) {
        c.a(this.a, surface);
    }

    @Override
    public ByteBuffer q(int n8) {
        return this.a.getOutputBuffer(n8);
    }

    public static class b
    implements x.b {
        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        @SuppressLint(value={"WrongConstant"})
        public x a(x.a object) throws IOException {
            RuntimeException var1_3;
            MediaCodec mediaCodec;
            block6: {
                int n8;
                Surface surface = null;
                try {
                    mediaCodec = this.b((x.a)object);
                }
                catch (RuntimeException runtimeException) {
                    mediaCodec = surface;
                    break block6;
                }
                catch (IOException iOException) {
                    mediaCodec = surface;
                    break block6;
                }
                try {
                    N.a("configureCodec");
                    surface = ((x.a)object).d;
                    n8 = surface == null && ((x.a)object).a.k && Build.VERSION.SDK_INT >= 35 ? 8 : 0;
                }
                catch (RuntimeException runtimeException) {
                    break block6;
                }
                catch (IOException iOException) {
                    break block6;
                }
                mediaCodec.configure(((x.a)object).b, surface, ((x.a)object).e, n8);
                N.b();
                N.a("startCodec");
                mediaCodec.start();
                N.b();
                return new c0(mediaCodec, ((x.a)object).f);
            }
            if (mediaCodec == null) throw var1_3;
            mediaCodec.release();
            throw var1_3;
        }

        protected MediaCodec b(x.a object) throws IOException {
            ax.S0.a.e(((x.a)object).a);
            object = ((x.a)object).a.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("createCodec:");
            stringBuilder.append((String)object);
            N.a(stringBuilder.toString());
            object = MediaCodec.createByCodecName((String)object);
            N.b();
            return object;
        }
    }
}

