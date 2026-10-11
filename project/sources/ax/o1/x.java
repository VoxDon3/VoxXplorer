package ax.o1;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import ax.S0.C0968a;
import ax.S0.C0982o;
import ax.S0.C0983p;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class x extends GLSurfaceView implements y {
    public static final /* synthetic */ int b = 0;
    private final a a;

    private static final class a implements GLSurfaceView.Renderer {
        private static final float[] k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] n = {"y_tex", "u_tex", "v_tex"};
        private static final FloatBuffer o = C0983p.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final GLSurfaceView a;
        private final int[] b = new int[3];
        private final int[] c = new int[3];
        private final int[] d = new int[3];
        private final int[] e = new int[3];
        private final AtomicReference<androidx.media3.decoder.b> f = new AtomicReference<>();
        private final FloatBuffer[] g = new FloatBuffer[3];
        private C0982o h;
        private int i;
        private androidx.media3.decoder.b j;

        public a(GLSurfaceView gLSurfaceView) {
            this.a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.b, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.h.j(n[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    C0983p.a(3553, this.b[i], 9729);
                }
                C0983p.b();
            } catch (C0983p.a e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        public void a(androidx.media3.decoder.b bVar) {
            androidx.media3.decoder.b andSet = this.f.getAndSet(bVar);
            if (andSet != null) {
                andSet.B();
            }
            this.a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            androidx.media3.decoder.b andSet = this.f.getAndSet(null);
            if (andSet == null && this.j == null) {
                return;
            }
            if (andSet != null) {
                androidx.media3.decoder.b bVar = this.j;
                if (bVar != null) {
                    bVar.B();
                }
                this.j = andSet;
            }
            androidx.media3.decoder.b bVar2 = (androidx.media3.decoder.b) C0968a.e(this.j);
            float[] fArr = l;
            int i = bVar2.j0;
            if (i == 1) {
                fArr = k;
            } else if (i == 3) {
                fArr = m;
            }
            GLES20.glUniformMatrix3fv(this.i, 1, false, fArr, 0);
            int[] iArr = (int[]) C0968a.e(bVar2.i0);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) C0968a.e(bVar2.h0);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = bVar2.g0;
                if (i2 != 0) {
                    i3 = (i3 + 1) / 2;
                }
                int i4 = i3;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.b[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i4, 0, 6409, 5121, byteBufferArr[i2]);
            }
            int i5 = bVar2.f0;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.d[i7] != iArr2[i7] || this.e[i7] != iArr[i7]) {
                    C0968a.g(iArr[i7] != 0);
                    float f = iArr2[i7] / iArr[i7];
                    this.g[i7] = C0983p.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.c[i7], 2, 5126, false, 0, (Buffer) this.g[i7]);
                    this.d[i7] = iArr2[i7];
                    this.e[i7] = iArr[i7];
                }
            }
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                C0983p.b();
            } catch (C0983p.a e) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C0982o c0982o = new C0982o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.h = c0982o;
                GLES20.glVertexAttribPointer(c0982o.e("in_pos"), 2, 5126, false, 0, (Buffer) o);
                this.c[0] = this.h.e("in_tc_y");
                this.c[1] = this.h.e("in_tc_u");
                this.c[2] = this.h.e("in_tc_v");
                this.i = this.h.j("mColorConversion");
                C0983p.b();
                b();
                C0983p.b();
            } catch (C0983p.a e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public x(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(androidx.media3.decoder.b bVar) {
        this.a.a(bVar);
    }

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public y getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
