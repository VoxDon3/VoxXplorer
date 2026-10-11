package ax.S0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: ax.S0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983p {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] c = {12445, 13120, 12344, 12344};
    private static final int[] d = {12445, 13632, 12344, 12344};
    private static final int[] e = {12344};

    /* renamed from: ax.S0.p$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a(int i, int i2, int i3) throws a {
        GLES20.glBindTexture(i, i2);
        b();
        GLES20.glTexParameteri(i, 10240, i3);
        b();
        GLES20.glTexParameteri(i, 10241, i3);
        b();
        GLES20.glTexParameteri(i, 10242, 33071);
        b();
        GLES20.glTexParameteri(i, 10243, 33071);
        b();
    }

    public static void b() throws a {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new a(sb.toString());
        }
    }

    public static void c(boolean z, String str) throws a {
        if (!z) {
            throw new a(str);
        }
    }

    private static FloatBuffer d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer e(float[] fArr) {
        return (FloatBuffer) d(fArr.length).put(fArr).flip();
    }

    public static int f() throws a {
        int g = g();
        a(36197, g, 9729);
        return g;
    }

    public static int g() throws a {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b();
        return iArr[0];
    }

    public static EGLDisplay h() throws a {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        c(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        b();
        return eglGetDisplay;
    }

    public static boolean i() throws a {
        return l("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean j() throws a {
        return Build.VERSION.SDK_INT >= 33 && l("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean k(int i) throws a {
        if (i == 6) {
            return j();
        }
        if (i == 7) {
            return i();
        }
        return true;
    }

    private static boolean l(String str) throws a {
        String eglQueryString = EGL14.eglQueryString(h(), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean m(Context context) throws a {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return l("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean n() throws a {
        return l("EGL_KHR_surfaceless_context");
    }

    public static void o(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
