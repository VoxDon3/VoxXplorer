/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import ax.S0.p;
import ax.o1.z;
import ax.p1.d;
import ax.p1.i;
import ax.p1.j;
import ax.p1.k;
import ax.p1.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class l
extends GLSurfaceView {
    public static final int m = 0;
    private final CopyOnWriteArrayList<b> a = new CopyOnWriteArrayList();
    private final SensorManager b;
    private final Sensor c;
    private final d d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final m f;
    private final i g;
    private SurfaceTexture h;
    private Surface i;
    private boolean j;
    private boolean k;
    private boolean l;

    public l(Context context) {
        this(context, null);
    }

    public l(Context context, AttributeSet object) {
        super(context, object);
        SensorManager sensorManager;
        this.b = sensorManager = (SensorManager)ax.S0.a.e(context.getSystemService("sensor"));
        Object object2 = sensorManager.getDefaultSensor(15);
        object = object2;
        if (object2 == null) {
            object = sensorManager.getDefaultSensor(11);
        }
        this.c = object;
        object = new i();
        this.g = object;
        object = new a(this, (i)object);
        object2 = new m(context, (m.a)object, 25.0f);
        this.f = object2;
        this.d = new d(ax.S0.a.e((WindowManager)context.getSystemService("window")).getDefaultDisplay(), new d.a[]{object2, object});
        this.j = true;
        this.setEGLContextClientVersion(2);
        this.setRenderer((GLSurfaceView.Renderer)object);
        this.setOnTouchListener((View.OnTouchListener)object2);
    }

    public static /* synthetic */ void a(l l8) {
        Surface surface = l8.i;
        if (surface != null) {
            Iterator<b> iterator = l8.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().v(surface);
            }
        }
        ax.p1.l.f(l8.h, surface);
        l8.h = null;
        l8.i = null;
    }

    public static /* synthetic */ void b(l object, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = ((l)((Object)object)).h;
        Surface surface = ((l)((Object)object)).i;
        Surface surface2 = new Surface(surfaceTexture);
        ((l)((Object)object)).h = surfaceTexture;
        ((l)((Object)object)).i = surface2;
        object = ((l)((Object)object)).a.iterator();
        while (object.hasNext()) {
            ((b)object.next()).E(surface2);
        }
        ax.p1.l.f(surfaceTexture2, surface);
    }

    private void e(SurfaceTexture surfaceTexture) {
        this.e.post((Runnable)new k(this, surfaceTexture));
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
        boolean bl = this.j && this.k;
        Sensor sensor = this.c;
        if (sensor != null && bl != this.l) {
            if (bl) {
                this.b.registerListener((SensorEventListener)this.d, sensor, 0);
            } else {
                this.b.unregisterListener((SensorEventListener)this.d);
            }
            this.l = bl;
        }
    }

    public void d(b b8) {
        this.a.add(b8);
    }

    public void g(b b8) {
        this.a.remove(b8);
    }

    public ax.p1.a getCameraMotionListener() {
        return this.g;
    }

    public z getVideoFrameMetadataListener() {
        return this.g;
    }

    public Surface getVideoSurface() {
        return this.i;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post((Runnable)new j(this));
    }

    public void onPause() {
        this.k = false;
        this.h();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.k = true;
        this.h();
    }

    public void setDefaultStereoMode(int n8) {
        this.g.f(n8);
    }

    public void setUseSensorRotation(boolean bl) {
        this.j = bl;
        this.h();
    }

    final class a
    implements GLSurfaceView.Renderer,
    m.a,
    d.a {
        private final i a;
        private final float[] b;
        private final float[] c;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] i;
        private final float[] j;
        final l k;

        public a(l object, i i8) {
            this.k = object;
            this.b = new float[16];
            this.c = new float[16];
            float[] fArray = new float[16];
            this.d = fArray;
            object = new float[16];
            this.e = (float[])object;
            float[] fArray2 = new float[16];
            this.f = fArray2;
            this.i = new float[16];
            this.j = new float[16];
            this.a = i8;
            p.o(fArray);
            p.o((float[])object);
            p.o(fArray2);
            this.h = (float)Math.PI;
        }

        private float c(float f8) {
            if (f8 > 1.0f) {
                return (float)(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0)) / (double)f8)) * 2.0);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM((float[])this.e, (int)0, (float)(-this.g), (float)((float)Math.cos(this.h)), (float)((float)Math.sin(this.h)), (float)0.0f);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(float[] fArray, float f8) {
            synchronized (this) {
                float[] fArray2 = this.d;
                System.arraycopy(fArray, 0, fArray2, 0, fArray2.length);
                this.h = -f8;
                this.d();
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void b(PointF pointF) {
            synchronized (this) {
                this.g = pointF.y;
                this.d();
                Matrix.setRotateM((float[])this.f, (int)0, (float)(-pointF.x), (float)0.0f, (float)1.0f, (float)0.0f);
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onDrawFrame(GL10 gL10) {
            synchronized (this) {
                Matrix.multiplyMM((float[])this.j, (int)0, (float[])this.d, (int)0, (float[])this.f, (int)0);
                Matrix.multiplyMM((float[])this.i, (int)0, (float[])this.e, (int)0, (float[])this.j, (int)0);
            }
            Matrix.multiplyMM((float[])this.c, (int)0, (float[])this.b, (int)0, (float[])this.i, (int)0);
            this.a.c(this.c, false);
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return this.k.performClick();
        }

        public void onSurfaceChanged(GL10 gL10, int n8, int n9) {
            GLES20.glViewport((int)0, (int)0, (int)n8, (int)n9);
            float f8 = (float)n8 / (float)n9;
            float f9 = this.c(f8);
            Matrix.perspectiveM((float[])this.b, (int)0, (float)f9, (float)f8, (float)0.1f, (float)100.0f);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onSurfaceCreated(GL10 gL10, EGLConfig eGLConfig) {
            synchronized (this) {
                this.k.e(this.a.d());
                return;
            }
        }
    }

    public static interface b {
        public void E(Surface var1);

        public void v(Surface var1);
    }
}

