/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.decoder.b;
import ax.S0.o;
import ax.S0.p;
import ax.o1.y;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class x
extends GLSurfaceView
implements y {
    public static final int b = 0;
    private final a a;

    public x(Context context) {
        this(context, null);
    }

    public x(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        object = new a(this);
        this.a = object;
        this.setPreserveEGLContextOnPause(true);
        this.setEGLContextClientVersion(2);
        this.setRenderer((GLSurfaceView.Renderer)object);
        this.setRenderMode(0);
    }

    @Deprecated
    public y getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(b b8) {
        this.a.a(b8);
    }

    private static final class a
    implements GLSurfaceView.Renderer {
        private static final float[] k = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] l = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] m = new float[]{1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] n = new String[]{"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer o = p.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final GLSurfaceView a;
        private final int[] b;
        private final int[] c;
        private final int[] d;
        private final int[] e;
        private final AtomicReference<b> f;
        private final FloatBuffer[] g;
        private o h;
        private int i;
        private b j;

        public a(GLSurfaceView object) {
            this.a = object;
            this.b = new int[3];
            this.c = new int[3];
            this.d = new int[3];
            this.e = new int[3];
            this.f = new AtomicReference();
            this.g = new FloatBuffer[3];
            for (int i8 = 0; i8 < 3; ++i8) {
                object = this.d;
                this.e[i8] = -1;
                object[i8] = (GLSurfaceView)-1;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void b() {
            p.a a82;
            block4: {
                try {
                    int[] nArray = this.b;
                    GLES20.glGenTextures((int)3, (int[])nArray, (int)0);
                    for (int i8 = 0; i8 < 3; ++i8) {
                        GLES20.glUniform1i((int)this.h.j(n[i8]), (int)i8);
                        GLES20.glActiveTexture((int)(33984 + i8));
                        p.a(3553, this.b[i8], 9729);
                    }
                }
                catch (p.a a82) {
                    break block4;
                }
                {
                    p.b();
                    return;
                }
            }
            Log.e((String)"VideoDecoderGLSV", (String)"Failed to set up the textures", (Throwable)a82);
        }

        public void a(b b8) {
            if ((b8 = this.f.getAndSet(b8)) != null) {
                b8.B();
            }
            this.a.requestRender();
        }

        public void onDrawFrame(GL10 object) {
            b b8 = this.f.getAndSet(null);
            if (b8 != null || this.j != null) {
                if (b8 != null) {
                    object = this.j;
                    if (object != null) {
                        object.B();
                    }
                    this.j = b8;
                }
                b8 = ax.S0.a.e(this.j);
                object = l;
                int n8 = b8.j0;
                if (n8 != 1) {
                    if (n8 == 3) {
                        object = m;
                    }
                } else {
                    object = k;
                }
                GLES20.glUniformMatrix3fv((int)this.i, (int)1, (boolean)false, (float[])object, (int)0);
                object = ax.S0.a.e(b8.i0);
                Object[] objectArray = ax.S0.a.e(b8.h0);
                for (n8 = 0; n8 < 3; ++n8) {
                    int n9 = b8.g0;
                    if (n8 != 0) {
                        n9 = (n9 + 1) / 2;
                    }
                    GLES20.glActiveTexture((int)(33984 + n8));
                    GLES20.glBindTexture((int)3553, (int)this.b[n8]);
                    GLES20.glPixelStorei((int)3317, (int)1);
                    GLES20.glTexImage2D((int)3553, (int)0, (int)6409, (int)object[n8], (int)n9, (int)0, (int)6409, (int)5121, (Buffer)objectArray[n8]);
                }
                objectArray = new int[3];
                n8 = b8.f0;
                objectArray[0] = (ByteBuffer)n8;
                n8 = (n8 + 1) / 2;
                objectArray[2] = (ByteBuffer)n8;
                objectArray[1] = (ByteBuffer)n8;
                for (n8 = 0; n8 < 3; ++n8) {
                    if (this.d[n8] == objectArray[n8] && this.e[n8] == object[n8]) continue;
                    boolean bl = object[n8] != false;
                    ax.S0.a.g(bl);
                    float f8 = (float)objectArray[n8] / (float)object[n8];
                    this.g[n8] = p.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f8, 0.0f, f8, 1.0f});
                    GLES20.glVertexAttribPointer((int)this.c[n8], (int)2, (int)5126, (boolean)false, (int)0, (Buffer)this.g[n8]);
                    this.d[n8] = (int)objectArray[n8];
                    this.e[n8] = (int)object[n8];
                }
                GLES20.glClear((int)16384);
                GLES20.glDrawArrays((int)5, (int)0, (int)4);
                try {
                    p.b();
                    return;
                }
                catch (p.a a8) {
                    Log.e((String)"VideoDecoderGLSV", (String)"Failed to draw a frame", (Throwable)a8);
                }
            }
        }

        public void onSurfaceChanged(GL10 gL10, int n8, int n9) {
            GLES20.glViewport((int)0, (int)0, (int)n8, (int)n9);
        }

        public void onSurfaceCreated(GL10 object, EGLConfig eGLConfig) {
            try {
                object = new o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.h = object;
                GLES20.glVertexAttribPointer((int)((o)object).e("in_pos"), (int)2, (int)5126, (boolean)false, (int)0, (Buffer)o);
                this.c[0] = this.h.e("in_tc_y");
                this.c[1] = this.h.e("in_tc_u");
                this.c[2] = this.h.e("in_tc_v");
                this.i = this.h.j("mColorConversion");
                p.b();
                this.b();
                p.b();
                return;
            }
            catch (p.a a8) {
                Log.e((String)"VideoDecoderGLSV", (String)"Failed to set up the textures and program", (Throwable)a8);
                return;
            }
        }
    }
}

