package ax.S0;

import android.opengl.GLES20;
import ax.S0.C0983p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.S0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982o {
    private final int a;
    private final a[] b;
    private final b[] c;
    private final Map<String, a> d;
    private final Map<String, b> e;

    /* renamed from: ax.S0.o$a */
    private static final class a {
        public final String a;
        private final int b;

        private a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public static a a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C0982o.h(bArr));
            return new a(str, C0982o.f(i, str));
        }
    }

    /* renamed from: ax.S0.o$b */
    private static final class b {
        public final String a;
        private final int b;
        private final int c;
        private final float[] d = new float[16];
        private final int[] e = new int[4];
        private int f = 9729;

        private b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public static b a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C0982o.h(bArr));
            return new b(str, C0982o.i(i, str), iArr2[0]);
        }
    }

    public C0982o(String str, String str2) throws C0983p.a {
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        C0983p.b();
        d(glCreateProgram, 35633, str);
        d(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        C0983p.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a a2 = a.a(this.a, i);
            this.b[i] = a2;
            this.d.put(a2.a, a2);
        }
        this.e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr3, 0);
        this.c = new b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            b a3 = b.a(this.a, i2);
            this.c[i2] = a3;
            this.e.put(a3.a, a3);
        }
        C0983p.b();
    }

    private static void d(int i, int i2, String str) throws C0983p.a {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        C0983p.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        C0983p.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    private int g(String str) {
        return f(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public int e(String str) throws C0983p.a {
        int g = g(str);
        GLES20.glEnableVertexAttribArray(g);
        C0983p.b();
        return g;
    }

    public int j(String str) {
        return i(this.a, str);
    }
}
