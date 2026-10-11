/*
 * Decompiled with CFR 0.152.
 */
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

public final class p {
    public static final int[] a = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] c = new int[]{12445, 13120, 12344, 12344};
    private static final int[] d = new int[]{12445, 13632, 12344, 12344};
    private static final int[] e = new int[]{12344};

    public static void a(int n8, int n9, int n10) throws a {
        GLES20.glBindTexture((int)n8, (int)n9);
        p.b();
        GLES20.glTexParameteri((int)n8, (int)10240, (int)n10);
        p.b();
        GLES20.glTexParameteri((int)n8, (int)10241, (int)n10);
        p.b();
        GLES20.glTexParameteri((int)n8, (int)10242, (int)33071);
        p.b();
        GLES20.glTexParameteri((int)n8, (int)10243, (int)33071);
        p.b();
    }

    public static void b() throws a {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        while ((n8 = GLES20.glGetError()) != 0) {
            if (bl) {
                stringBuilder.append('\n');
            }
            String string = GLU.gluErrorString((int)n8);
            CharSequence charSequence = string;
            if (string == null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("error code: 0x");
                ((StringBuilder)charSequence).append(Integer.toHexString(n8));
                charSequence = ((StringBuilder)charSequence).toString();
            }
            stringBuilder.append("glError: ");
            stringBuilder.append((String)charSequence);
            bl = true;
        }
        if (!bl) {
            return;
        }
        throw new a(stringBuilder.toString());
    }

    public static void c(boolean bl, String string) throws a {
        if (bl) {
            return;
        }
        throw new a(string);
    }

    private static FloatBuffer d(int n8) {
        return ByteBuffer.allocateDirect(n8 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer e(float[] fArray) {
        return (FloatBuffer)p.d(fArray.length).put(fArray).flip();
    }

    public static int f() throws a {
        int n8 = p.g();
        p.a(36197, n8, 9729);
        return n8;
    }

    public static int g() throws a {
        int[] nArray = new int[1];
        GLES20.glGenTextures((int)1, (int[])nArray, (int)0);
        p.b();
        return nArray[0];
    }

    public static EGLDisplay h() throws a {
        EGLDisplay eGLDisplay = EGL14.eglGetDisplay((int)0);
        p.c(eGLDisplay.equals((Object)EGL14.EGL_NO_DISPLAY) ^ true, "No EGL display.");
        p.c(EGL14.eglInitialize((EGLDisplay)eGLDisplay, (int[])new int[1], (int)0, (int[])new int[1], (int)0), "Error in eglInitialize.");
        p.b();
        return eGLDisplay;
    }

    public static boolean i() throws a {
        return p.l("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean j() throws a {
        return Build.VERSION.SDK_INT >= 33 && p.l("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean k(int n8) throws a {
        if (n8 == 6) {
            return p.j();
        }
        if (n8 == 7) {
            return p.i();
        }
        return true;
    }

    private static boolean l(String string) throws a {
        String string2 = EGL14.eglQueryString((EGLDisplay)p.h(), (int)12373);
        return string2 != null && string2.contains(string);
    }

    public static boolean m(Context context) throws a {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 24) {
            return false;
        }
        if (n8 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (n8 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return false;
        }
        return p.l("EGL_EXT_protected_content");
    }

    public static boolean n() throws a {
        return p.l("EGL_KHR_surfaceless_context");
    }

    public static void o(float[] fArray) {
        Matrix.setIdentityM((float[])fArray, (int)0);
    }

    public static final class a
    extends Exception {
        public a(String string) {
            super(string);
        }
    }
}

