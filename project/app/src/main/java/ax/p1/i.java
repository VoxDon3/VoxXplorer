/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ax.P0.v;
import ax.S0.L;
import ax.S0.p;
import ax.S0.u;
import ax.o1.z;
import ax.p1.a;
import ax.p1.c;
import ax.p1.e;
import ax.p1.f;
import ax.p1.g;
import ax.p1.h;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class i
implements z,
a {
    private final AtomicBoolean c0;
    private final g d0;
    private final c e0;
    private final L<Long> f0;
    private final L<e> g0;
    private final float[] h0;
    private final float[] i0;
    private int j0;
    private SurfaceTexture k0;
    private volatile int l0 = 0;
    private int m0 = -1;
    private byte[] n0;
    private final AtomicBoolean q = new AtomicBoolean();

    public i() {
        this.c0 = new AtomicBoolean(true);
        this.d0 = new g();
        this.e0 = new c();
        this.f0 = new L();
        this.g0 = new L();
        this.h0 = new float[16];
        this.i0 = new float[16];
    }

    public static /* synthetic */ void a(i i8, SurfaceTexture surfaceTexture) {
        i8.q.set(true);
    }

    private void h(byte[] object, int n8, long l8) {
        byte[] byArray = this.n0;
        int n9 = this.m0;
        this.n0 = object;
        int n10 = n8;
        if (n8 == -1) {
            n10 = this.l0;
        }
        this.m0 = n10;
        if (n9 == n10 && Arrays.equals(byArray, this.n0)) {
            return;
        }
        object = this.n0;
        object = object != null ? (Object)f.a(object, this.m0) : null;
        if (object == null || !g.c((e)object)) {
            object = e.b(this.m0);
        }
        this.g0.a(l8, (e)object);
    }

    @Override
    public void b(long l8, float[] fArray) {
        this.e0.e(l8, fArray);
    }

    public void c(float[] fArray, boolean bl) {
        GLES20.glClear((int)16384);
        try {
            p.b();
        }
        catch (p.a a8) {
            u.d("SceneRenderer", "Failed to draw a frame", a8);
        }
        if (this.q.compareAndSet(true, false)) {
            long l8;
            Object object;
            ax.S0.a.e(this.k0).updateTexImage();
            try {
                p.b();
            }
            catch (p.a a9) {
                u.d("SceneRenderer", "Failed to draw a frame", a9);
            }
            if (this.c0.compareAndSet(true, false)) {
                p.o(this.h0);
            }
            if ((object = this.f0.g(l8 = this.k0.getTimestamp())) != null) {
                this.e0.c(this.h0, (Long)object);
            }
            if ((object = this.g0.j(l8)) != null) {
                this.d0.d((e)object);
            }
        }
        Matrix.multiplyMM((float[])this.i0, (int)0, (float[])fArray, (int)0, (float[])this.h0, (int)0);
        this.d0.a(this.j0, this.i0, bl);
    }

    public SurfaceTexture d() {
        SurfaceTexture surfaceTexture;
        try {
            GLES20.glClearColor((float)0.5f, (float)0.5f, (float)0.5f, (float)1.0f);
            p.b();
            this.d0.b();
            p.b();
            this.j0 = p.f();
        }
        catch (p.a a8) {
            u.d("SceneRenderer", "Failed to initialize the renderer", a8);
        }
        this.k0 = surfaceTexture = new SurfaceTexture(this.j0);
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)new h(this));
        return this.k0;
    }

    @Override
    public void e() {
        this.f0.c();
        this.e0.d();
        this.c0.set(true);
    }

    public void f(int n8) {
        this.l0 = n8;
    }

    @Override
    public void g(long l8, long l9, v v8, MediaFormat mediaFormat) {
        this.f0.a(l9, l8);
        this.h(v8.C, v8.D, l9);
    }
}

