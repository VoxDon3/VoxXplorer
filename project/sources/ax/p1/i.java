package ax.p1;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0983p;
import ax.S0.C0987u;
import ax.S0.L;
import ax.o1.z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
final class i implements z, InterfaceC2758a {
    private int j0;
    private SurfaceTexture k0;
    private byte[] n0;
    private final AtomicBoolean q = new AtomicBoolean();
    private final AtomicBoolean c0 = new AtomicBoolean(true);
    private final g d0 = new g();
    private final c e0 = new c();
    private final L<Long> f0 = new L<>();
    private final L<e> g0 = new L<>();
    private final float[] h0 = new float[16];
    private final float[] i0 = new float[16];
    private volatile int l0 = 0;
    private int m0 = -1;

    private void h(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.n0;
        int i2 = this.m0;
        this.n0 = bArr;
        if (i == -1) {
            i = this.l0;
        }
        this.m0 = i;
        if (i2 == i && Arrays.equals(bArr2, this.n0)) {
            return;
        }
        byte[] bArr3 = this.n0;
        e a = bArr3 != null ? f.a(bArr3, this.m0) : null;
        if (a == null || !g.c(a)) {
            a = e.b(this.m0);
        }
        this.g0.a(j, a);
    }

    @Override // ax.p1.InterfaceC2758a
    public void b(long j, float[] fArr) {
        this.e0.e(j, fArr);
    }

    public void c(float[] fArr, boolean z) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            C0983p.b();
        } catch (C0983p.a e) {
            C0987u.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.q.compareAndSet(true, false)) {
            ((SurfaceTexture) C0968a.e(this.k0)).updateTexImage();
            try {
                C0983p.b();
            } catch (C0983p.a e2) {
                C0987u.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.c0.compareAndSet(true, false)) {
                C0983p.o(this.h0);
            }
            long timestamp = this.k0.getTimestamp();
            Long g = this.f0.g(timestamp);
            if (g != null) {
                this.e0.c(this.h0, g.longValue());
            }
            e j = this.g0.j(timestamp);
            if (j != null) {
                this.d0.d(j);
            }
        }
        Matrix.multiplyMM(this.i0, 0, fArr, 0, this.h0, 0);
        this.d0.a(this.j0, this.i0, z);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C0983p.b();
            this.d0.b();
            C0983p.b();
            this.j0 = C0983p.f();
        } catch (C0983p.a e) {
            C0987u.d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.j0);
        this.k0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ax.p1.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.q.set(true);
            }
        });
        return this.k0;
    }

    @Override // ax.p1.InterfaceC2758a
    public void e() {
        this.f0.c();
        this.e0.d();
        this.c0.set(true);
    }

    public void f(int i) {
        this.l0 = i;
    }

    @Override // ax.o1.z
    public void g(long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
        this.f0.a(j2, Long.valueOf(j));
        h(c0912v.C, c0912v.D, j2);
    }
}
