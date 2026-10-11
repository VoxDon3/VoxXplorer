/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.opengl.GLES20;
import android.util.Log;
import ax.S0.o;
import ax.S0.p;
import ax.p1.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;

final class g {
    private static final float[] j = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] k = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] l = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = new float[]{0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] n = new float[]{0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    private int a;
    private a b;
    private a c;
    private o d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    g() {
    }

    public static boolean c(e object) {
        e.a a8 = ((e)object).a;
        object = ((e)object).b;
        return a8.b() == 1 && a8.a((int)0).a == 0 && ((e.a)object).b() == 1 && ((e.a)object).a((int)0).a == 0;
    }

    public void a(int n8, float[] fArray, boolean bl) {
        a a8 = bl ? this.c : this.b;
        if (a8 != null) {
            int n9 = this.a;
            float[] fArray2 = n9 == 1 ? (bl ? l : k) : (n9 == 2 ? (bl ? n : m) : j);
            GLES20.glUniformMatrix3fv((int)this.f, (int)1, (boolean)false, (float[])fArray2, (int)0);
            GLES20.glUniformMatrix4fv((int)this.e, (int)1, (boolean)false, (float[])fArray, (int)0);
            GLES20.glActiveTexture((int)33984);
            GLES20.glBindTexture((int)36197, (int)n8);
            GLES20.glUniform1i((int)this.i, (int)0);
            try {
                p.b();
            }
            catch (p.a a9) {
                Log.e((String)"ProjectionRenderer", (String)"Failed to bind uniforms", (Throwable)a9);
            }
            GLES20.glVertexAttribPointer((int)this.g, (int)3, (int)5126, (boolean)false, (int)12, (Buffer)a8.b);
            try {
                p.b();
            }
            catch (p.a a10) {
                Log.e((String)"ProjectionRenderer", (String)"Failed to load position data", (Throwable)a10);
            }
            GLES20.glVertexAttribPointer((int)this.h, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)a8.c);
            try {
                p.b();
            }
            catch (p.a a11) {
                Log.e((String)"ProjectionRenderer", (String)"Failed to load texture data", (Throwable)a11);
            }
            GLES20.glDrawArrays((int)a8.d, (int)0, (int)a8.a);
            try {
                p.b();
            }
            catch (p.a a12) {
                Log.e((String)"ProjectionRenderer", (String)"Failed to render", (Throwable)a12);
            }
        }
    }

    public void b() {
        try {
            o o8;
            this.d = o8 = new o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.e = o8.j("uMvpMatrix");
            this.f = this.d.j("uTexMatrix");
            this.g = this.d.e("aPosition");
            this.h = this.d.e("aTexCoords");
            this.i = this.d.j("uTexture");
            return;
        }
        catch (p.a a8) {
            Log.e((String)"ProjectionRenderer", (String)"Failed to initialize the program", (Throwable)a8);
            return;
        }
    }

    public void d(e object) {
        a a8;
        if (!ax.p1.g.c((e)object)) {
            return;
        }
        this.a = ((e)object).c;
        this.b = a8 = new a(((e)object).a.a(0));
        object = ((e)object).d ? a8 : new a(((e)object).b.a(0));
        this.c = object;
    }

    private static class a {
        private final int a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(e.b b8) {
            this.a = b8.a();
            this.b = p.e(b8.c);
            this.c = p.e(b8.d);
            int n8 = b8.b;
            if (n8 != 1) {
                if (n8 != 2) {
                    this.d = 4;
                    return;
                }
                this.d = 6;
                return;
            }
            this.d = 5;
        }
    }
}

