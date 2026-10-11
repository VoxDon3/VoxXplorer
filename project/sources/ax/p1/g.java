package ax.p1;

import android.opengl.GLES20;
import android.util.Log;
import ax.S0.C0982o;
import ax.S0.C0983p;
import ax.p1.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class g {
    private static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    private int a;
    private a b;
    private a c;
    private C0982o d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    private static class a {
        private final int a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(e.b bVar) {
            this.a = bVar.a();
            this.b = C0983p.e(bVar.c);
            this.c = C0983p.e(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.a;
        e.a aVar2 = eVar.b;
        return aVar.b() == 1 && aVar.a(0).a == 0 && aVar2.b() == 1 && aVar2.a(0).a == 0;
    }

    public void a(int i, float[] fArr, boolean z) {
        a aVar = z ? this.c : this.b;
        if (aVar == null) {
            return;
        }
        int i2 = this.a;
        GLES20.glUniformMatrix3fv(this.f, 1, false, i2 == 1 ? z ? l : k : i2 == 2 ? z ? n : m : j, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.i, 0);
        try {
            C0983p.b();
        } catch (C0983p.a e) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e);
        }
        GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar.b);
        try {
            C0983p.b();
        } catch (C0983p.a e2) {
            Log.e("ProjectionRenderer", "Failed to load position data", e2);
        }
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar.c);
        try {
            C0983p.b();
        } catch (C0983p.a e3) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e3);
        }
        GLES20.glDrawArrays(aVar.d, 0, aVar.a);
        try {
            C0983p.b();
        } catch (C0983p.a e4) {
            Log.e("ProjectionRenderer", "Failed to render", e4);
        }
    }

    public void b() {
        try {
            C0982o c0982o = new C0982o("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.d = c0982o;
            this.e = c0982o.j("uMvpMatrix");
            this.f = this.d.j("uTexMatrix");
            this.g = this.d.e("aPosition");
            this.h = this.d.e("aTexCoords");
            this.i = this.d.j("uTexture");
        } catch (C0983p.a e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.a = eVar.c;
            a aVar = new a(eVar.a.a(0));
            this.b = aVar;
            if (!eVar.d) {
                aVar = new a(eVar.b.a(0));
            }
            this.c = aVar;
        }
    }
}
