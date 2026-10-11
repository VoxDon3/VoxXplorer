/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.opengl.GLES20;
import ax.S0.p;
import java.util.HashMap;
import java.util.Map;

public final class o {
    private final int a;
    private final a[] b;
    private final b[] c;
    private final Map<String, a> d;
    private final Map<String, b> e;

    public o(String object, String object2) throws p.a {
        int n8;
        this.a = n8 = GLES20.glCreateProgram();
        p.b();
        o.d(n8, 35633, (String)object);
        o.d(n8, 35632, (String)object2);
        GLES20.glLinkProgram((int)n8);
        object = new int[1];
        object[0] = false;
        GLES20.glGetProgramiv((int)n8, (int)35714, (int[])object, (int)0);
        boolean bl = object[0] == true;
        object = new StringBuilder();
        ((StringBuilder)object).append("Unable to link shader program: \n");
        ((StringBuilder)object).append(GLES20.glGetProgramInfoLog((int)n8));
        p.c(bl, ((StringBuilder)object).toString());
        GLES20.glUseProgram((int)n8);
        this.d = new HashMap<String, a>();
        object = new int[1];
        GLES20.glGetProgramiv((int)n8, (int)35721, (int[])object, (int)0);
        this.b = new a[object[0]];
        for (n8 = 0; n8 < object[0]; ++n8) {
            this.b[n8] = object2 = ax.S0.o$a.a(this.a, n8);
            this.d.put(((a)object2).a, (a)object2);
        }
        this.e = new HashMap<String, b>();
        object = new int[1];
        GLES20.glGetProgramiv((int)this.a, (int)35718, (int[])object, (int)0);
        this.c = new b[object[0]];
        for (n8 = 0; n8 < object[0]; ++n8) {
            this.c[n8] = object2 = ax.S0.o$b.a(this.a, n8);
            this.e.put(((b)object2).a, (b)object2);
        }
        p.b();
    }

    private static void d(int n8, int n9, String string) throws p.a {
        n9 = GLES20.glCreateShader((int)n9);
        GLES20.glShaderSource((int)n9, (String)string);
        GLES20.glCompileShader((int)n9);
        boolean bl = false;
        Object object = new int[]{0};
        GLES20.glGetShaderiv((int)n9, (int)35713, (int[])object, (int)0);
        if (object[0] == 1) {
            bl = true;
        }
        object = new StringBuilder();
        object.append(GLES20.glGetShaderInfoLog((int)n9));
        object.append(", source: \n");
        object.append(string);
        p.c(bl, object.toString());
        GLES20.glAttachShader((int)n8, (int)n9);
        GLES20.glDeleteShader((int)n9);
        p.b();
    }

    private static int f(int n8, String string) {
        return GLES20.glGetAttribLocation((int)n8, (String)string);
    }

    private int g(String string) {
        return o.f(this.a, string);
    }

    private static int h(byte[] byArray) {
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            if (byArray[i8] != 0) continue;
            return i8;
        }
        return byArray.length;
    }

    private static int i(int n8, String string) {
        return GLES20.glGetUniformLocation((int)n8, (String)string);
    }

    public int e(String string) throws p.a {
        int n8 = this.g(string);
        GLES20.glEnableVertexAttribArray((int)n8);
        p.b();
        return n8;
    }

    public int j(String string) {
        return o.i(this.a, string);
    }

    private static final class a {
        public final String a;
        private final int b;

        private a(String string, int n8) {
            this.a = string;
            this.b = n8;
        }

        public static a a(int n8, int n9) {
            Object object = new int[1];
            GLES20.glGetProgramiv((int)n8, (int)35722, (int[])object, (int)0);
            int n10 = object[0];
            object = new byte[n10];
            GLES20.glGetActiveAttrib((int)n8, (int)n9, (int)n10, (int[])new int[1], (int)0, (int[])new int[1], (int)0, (int[])new int[1], (int)0, (byte[])object, (int)0);
            object = new String((byte[])object, 0, o.h((byte[])object));
            return new a((String)object, o.f(n8, (String)object));
        }
    }

    private static final class b {
        public final String a;
        private final int b;
        private final int c;
        private final float[] d;
        private final int[] e;
        private int f;

        private b(String string, int n8, int n9) {
            this.a = string;
            this.b = n8;
            this.c = n9;
            this.d = new float[16];
            this.e = new int[4];
            this.f = 9729;
        }

        public static b a(int n8, int n9) {
            Object object = new int[1];
            GLES20.glGetProgramiv((int)n8, (int)35719, (int[])object, (int)0);
            int[] nArray = new int[1];
            int n10 = object[0];
            object = new byte[n10];
            GLES20.glGetActiveUniform((int)n8, (int)n9, (int)n10, (int[])new int[1], (int)0, (int[])new int[1], (int)0, (int[])nArray, (int)0, (byte[])object, (int)0);
            object = new String((byte[])object, 0, o.h((byte[])object));
            return new b((String)object, o.i(n8, (String)object), nArray[0]);
        }
    }
}

