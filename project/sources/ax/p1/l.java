package ax.p1;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import ax.S0.C0968a;
import ax.S0.C0983p;
import ax.o1.z;
import ax.p1.d;
import ax.p1.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class l extends GLSurfaceView {
    public static final /* synthetic */ int m = 0;
    private final CopyOnWriteArrayList<b> a;
    private final SensorManager b;
    private final Sensor c;
    private final d d;
    private final Handler e;
    private final m f;
    private final i g;
    private SurfaceTexture h;
    private Surface i;
    private boolean j;
    private boolean k;
    private boolean l;

    final class a implements GLSurfaceView.Renderer, m.a, d.a {
        private final i a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.a = iVar;
            C0983p.o(fArr);
            C0983p.o(fArr2);
            C0983p.o(fArr3);
            this.h = 3.1415927f;
        }

        private float c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(this.h), (float) Math.sin(this.h), 0.0f);
        }

        @Override // ax.p1.d.a
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.h = -f;
            d();
        }

        @Override // ax.p1.m.a
        public synchronized void b(PointF pointF) {
            this.g = pointF.y;
            d();
            Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.a.c(this.c, false);
        }

        @Override // ax.p1.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.b, 0, c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.a.d());
        }
    }

    public interface b {
        void E(Surface surface);

        void v(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.i;
        if (surface != null) {
            Iterator<b> it = lVar.a.iterator();
            while (it.hasNext()) {
                it.next().v(surface);
            }
        }
        f(lVar.h, surface);
        lVar.h = null;
        lVar.i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.h;
        Surface surface = lVar.i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.h = surfaceTexture;
        lVar.i = surface2;
        Iterator<b> it = lVar.a.iterator();
        while (it.hasNext()) {
            it.next().E(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.e.post(new Runnable() { // from class: ax.p1.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(l.this, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z = this.j && this.k;
        Sensor sensor = this.c;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.l = z;
    }

    public void d(b bVar) {
        this.a.add(bVar);
    }

    public void g(b bVar) {
        this.a.remove(bVar);
    }

    public InterfaceC2758a getCameraMotionListener() {
        return this.g;
    }

    public z getVideoFrameMetadataListener() {
        return this.g;
    }

    public Surface getVideoSurface() {
        return this.i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new Runnable() { // from class: ax.p1.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(l.this);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.k = true;
        h();
    }

    public void setDefaultStereoMode(int i) {
        this.g.f(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.j = z;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList<>();
        this.e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C0968a.e(context.getSystemService("sensor"));
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f = mVar;
        this.d = new d(((WindowManager) C0968a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
