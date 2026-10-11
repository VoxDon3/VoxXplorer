package ax.f1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import ax.S0.C0968a;
import ax.f1.InterfaceC2029x;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c0 implements InterfaceC2029x {
    private final MediaCodec a;
    private final C2025t b;

    public static class b implements InterfaceC2029x.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [ax.f1.c0$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // ax.f1.InterfaceC2029x.b
        @android.annotation.SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ax.f1.InterfaceC2029x a(ax.f1.InterfaceC2029x.a r7) throws java.io.IOException {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.b(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                ax.S0.N.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                ax.f1.D r3 = r7.a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                ax.S0.N.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                ax.S0.N.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                ax.S0.N.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                ax.f1.c0 r2 = new ax.f1.c0     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                ax.f1.t r7 = r7.f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.f1.c0.b.a(ax.f1.x$a):ax.f1.x");
        }

        protected MediaCodec b(InterfaceC2029x.a aVar) throws IOException {
            C0968a.e(aVar.a);
            String str = aVar.a.a;
            ax.S0.N.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            ax.S0.N.b();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void r(c0 c0Var, InterfaceC2029x.d dVar, MediaCodec mediaCodec, long j, long j2) {
        c0Var.getClass();
        dVar.a(c0Var, j, j2);
    }

    @Override // ax.f1.InterfaceC2029x
    public void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // ax.f1.InterfaceC2029x
    public void b(int i, int i2, ax.V0.c cVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, i2, cVar.a(), j, i3);
    }

    @Override // ax.f1.InterfaceC2029x
    public void c(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // ax.f1.InterfaceC2029x
    public void d() {
        C2025t c2025t;
        C2025t c2025t2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.a.stop();
            }
            if (i >= 35 && (c2025t2 = this.b) != null) {
                c2025t2.d(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (c2025t = this.b) != null) {
                c2025t.d(this.a);
            }
            this.a.release();
            throw th;
        }
    }

    @Override // ax.f1.InterfaceC2029x
    public boolean e() {
        return false;
    }

    @Override // ax.f1.InterfaceC2029x
    public MediaFormat f() {
        return this.a.getOutputFormat();
    }

    @Override // ax.f1.InterfaceC2029x
    public void flush() {
        this.a.flush();
    }

    @Override // ax.f1.InterfaceC2029x
    public void g() {
        this.a.detachOutputSurface();
    }

    @Override // ax.f1.InterfaceC2029x
    public /* synthetic */ boolean h(InterfaceC2029x.c cVar) {
        return C2028w.a(this, cVar);
    }

    @Override // ax.f1.InterfaceC2029x
    public void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // ax.f1.InterfaceC2029x
    public int j() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // ax.f1.InterfaceC2029x
    public void k(final InterfaceC2029x.d dVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: ax.f1.b0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                c0.r(c0.this, dVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // ax.f1.InterfaceC2029x
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // ax.f1.InterfaceC2029x
    public void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // ax.f1.InterfaceC2029x
    public void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // ax.f1.InterfaceC2029x
    public ByteBuffer o(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // ax.f1.InterfaceC2029x
    public void p(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // ax.f1.InterfaceC2029x
    public ByteBuffer q(int i) {
        return this.a.getOutputBuffer(i);
    }

    private c0(MediaCodec mediaCodec, C2025t c2025t) {
        this.a = mediaCodec;
        this.b = c2025t;
        if (Build.VERSION.SDK_INT < 35 || c2025t == null) {
            return;
        }
        c2025t.b(mediaCodec);
    }
}
