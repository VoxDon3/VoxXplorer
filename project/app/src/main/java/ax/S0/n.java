/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import ax.S0.d0;
import ax.S0.p;

public final class n
implements SurfaceTexture.OnFrameAvailableListener,
Runnable {
    private static final int[] h0 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final int[] c0;
    private EGLDisplay d0;
    private EGLContext e0;
    private EGLSurface f0;
    private SurfaceTexture g0;
    private final Handler q;

    public n(Handler handler) {
        this(handler, null);
    }

    public n(Handler handler, a a8) {
        this.q = handler;
        this.c0 = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws p.a {
        EGLConfig[] eGLConfigArray = new EGLConfig[1];
        int[] nArray = new int[1];
        boolean bl = EGL14.eglChooseConfig((EGLDisplay)eGLDisplay, (int[])h0, (int)0, (EGLConfig[])eGLConfigArray, (int)0, (int)1, (int[])nArray, (int)0);
        boolean bl2 = bl && nArray[0] > 0 && eGLConfigArray[0] != null;
        p.c(bl2, ax.S0.d0.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", bl, nArray[0], eGLConfigArray[0]));
        return eGLConfigArray[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int n8) throws p.a {
        boolean bl = true;
        int[] nArray = n8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344};
        if ((eGLDisplay = EGL14.eglCreateContext((EGLDisplay)eGLDisplay, (EGLConfig)eGLConfig, (EGLContext)EGL14.EGL_NO_CONTEXT, (int[])nArray, (int)0)) == null) {
            bl = false;
        }
        p.c(bl, "eglCreateContext failed");
        return eGLDisplay;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int n8) throws p.a {
        boolean bl = true;
        if (n8 == 1) {
            eGLConfig = EGL14.EGL_NO_SURFACE;
        } else {
            int[] nArray = n8 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344};
            if ((eGLConfig = EGL14.eglCreatePbufferSurface((EGLDisplay)eGLDisplay, (EGLConfig)eGLConfig, (int[])nArray, (int)0)) == null) {
                bl = false;
            }
            p.c(bl, "eglCreatePbufferSurface failed");
        }
        p.c(EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay, (EGLSurface)eGLConfig, (EGLSurface)eGLConfig, (EGLContext)eGLContext), "eglMakeCurrent failed");
        return eGLConfig;
    }

    private void d() {
    }

    private static void e(int[] nArray) throws p.a {
        GLES20.glGenTextures((int)1, (int[])nArray, (int)0);
        p.b();
    }

    private static EGLDisplay f() throws p.a {
        EGLDisplay eGLDisplay = EGL14.eglGetDisplay((int)0);
        boolean bl = eGLDisplay != null;
        p.c(bl, "eglGetDisplay failed");
        int[] nArray = new int[2];
        p.c(EGL14.eglInitialize((EGLDisplay)eGLDisplay, (int[])nArray, (int)0, (int[])nArray, (int)1), "eglInitialize failed");
        return eGLDisplay;
    }

    public SurfaceTexture g() {
        return ax.S0.a.e(this.g0);
    }

    public void h(int n8) throws p.a {
        EGLDisplay eGLDisplay;
        this.d0 = eGLDisplay = n.f();
        EGLConfig eGLConfig = n.a(eGLDisplay);
        eGLDisplay = n.b(this.d0, eGLConfig, n8);
        this.e0 = eGLDisplay;
        this.f0 = n.c(this.d0, eGLConfig, (EGLContext)eGLDisplay, n8);
        n.e(this.c0);
        eGLDisplay = new SurfaceTexture(this.c0[0]);
        this.g0 = eGLDisplay;
        eGLDisplay.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)this);
    }

    public void i() {
        Throwable throwable2;
        block12: {
            SurfaceTexture surfaceTexture;
            block11: {
                this.q.removeCallbacks((Runnable)this);
                try {
                    surfaceTexture = this.g0;
                    if (surfaceTexture == null) break block11;
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                surfaceTexture.release();
                GLES20.glDeleteTextures((int)1, (int[])this.c0, (int)0);
            }
            if ((surfaceTexture = this.d0) != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay = this.d0;
                surfaceTexture = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay, (EGLSurface)surfaceTexture, (EGLSurface)surfaceTexture, (EGLContext)EGL14.EGL_NO_CONTEXT);
            }
            if ((surfaceTexture = this.f0) != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay)this.d0, (EGLSurface)this.f0);
            }
            if ((surfaceTexture = this.e0) != null) {
                EGL14.eglDestroyContext((EGLDisplay)this.d0, (EGLContext)surfaceTexture);
            }
            EGL14.eglReleaseThread();
            surfaceTexture = this.d0;
            if (surfaceTexture != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate((EGLDisplay)this.d0);
            }
            this.d0 = null;
            this.e0 = null;
            this.f0 = null;
            this.g0 = null;
            return;
        }
        EGLDisplay eGLDisplay = this.d0;
        if (eGLDisplay != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay2 = this.d0;
            eGLDisplay = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay2, (EGLSurface)eGLDisplay, (EGLSurface)eGLDisplay, (EGLContext)EGL14.EGL_NO_CONTEXT);
        }
        if ((eGLDisplay = this.f0) != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface((EGLDisplay)this.d0, (EGLSurface)this.f0);
        }
        if ((eGLDisplay = this.e0) != null) {
            EGL14.eglDestroyContext((EGLDisplay)this.d0, (EGLContext)eGLDisplay);
        }
        EGL14.eglReleaseThread();
        eGLDisplay = this.d0;
        if (eGLDisplay != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglTerminate((EGLDisplay)this.d0);
        }
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        throw throwable2;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.q.post((Runnable)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        this.d();
        SurfaceTexture surfaceTexture = this.g0;
        if (surfaceTexture == null) return;
        try {
            surfaceTexture.updateTexImage();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    public static interface a {
    }
}

