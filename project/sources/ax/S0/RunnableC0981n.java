package ax.S0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import ax.S0.C0983p;

/* renamed from: ax.S0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0981n implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] h0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final int[] c0;
    private EGLDisplay d0;
    private EGLContext e0;
    private EGLSurface f0;
    private SurfaceTexture g0;
    private final Handler q;

    /* renamed from: ax.S0.n$a */
    public interface a {
    }

    public RunnableC0981n(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws C0983p.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, h0, 0, eGLConfigArr, 0, 1, iArr, 0);
        C0983p.c(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, d0.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws C0983p.a {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C0983p.c(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws C0983p.a {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C0983p.c(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        C0983p.c(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    private static void e(int[] iArr) throws C0983p.a {
        GLES20.glGenTextures(1, iArr, 0);
        C0983p.b();
    }

    private static EGLDisplay f() throws C0983p.a {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C0983p.c(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C0983p.c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C0968a.e(this.g0);
    }

    public void h(int i) throws C0983p.a {
        EGLDisplay f = f();
        this.d0 = f;
        EGLConfig a2 = a(f);
        EGLContext b = b(this.d0, a2, i);
        this.e0 = b;
        this.f0 = c(this.d0, a2, b, i);
        e(this.c0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.c0[0]);
        this.g0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.q.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.g0;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.c0, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.d0;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.d0;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f0;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d0, this.f0);
            }
            EGLContext eGLContext = this.e0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.d0, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.d0;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.d0);
            }
            this.d0 = null;
            this.e0 = null;
            this.f0 = null;
            this.g0 = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.q.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.g0;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC0981n(Handler handler, a aVar) {
        this.q = handler;
        this.c0 = new int[1];
    }

    private void d() {
    }
}
