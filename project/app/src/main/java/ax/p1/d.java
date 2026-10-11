/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import ax.p1.c;

final class d
implements SensorEventListener {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final float[] c = new float[16];
    private final float[] d = new float[3];
    private final Display e;
    private final a[] f;
    private boolean g;

    public d(Display display, a ... aArray) {
        this.e = display;
        this.f = aArray;
    }

    private float a(float[] fArray) {
        SensorManager.remapCoordinateSystem((float[])fArray, (int)1, (int)131, (float[])this.b);
        SensorManager.getOrientation((float[])this.b, (float[])this.d);
        return this.d[2];
    }

    private void b(float[] fArray, float f8) {
        a[] aArray = this.f;
        int n8 = aArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            aArray[i8].a(fArray, f8);
        }
    }

    private void c(float[] fArray) {
        if (!this.g) {
            ax.p1.c.a(this.c, fArray);
            this.g = true;
        }
        float[] fArray2 = this.b;
        System.arraycopy(fArray, 0, fArray2, 0, fArray2.length);
        Matrix.multiplyMM((float[])fArray, (int)0, (float[])this.b, (int)0, (float[])this.c, (int)0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d(float[] fArray, int n8) {
        if (n8 == 0) return;
        int n9 = 129;
        int n10 = 1;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) throw new IllegalStateException();
                n8 = 130;
            } else {
                n10 = 130;
                n8 = n9;
            }
        } else {
            n8 = 2;
            n10 = 129;
        }
        float[] fArray2 = this.b;
        System.arraycopy(fArray, 0, fArray2, 0, fArray2.length);
        SensorManager.remapCoordinateSystem((float[])this.b, (int)n8, (int)n10, (float[])fArray);
    }

    private static void e(float[] fArray) {
        Matrix.rotateM((float[])fArray, (int)0, (float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int n8) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector((float[])this.a, (float[])sensorEvent.values);
        this.d(this.a, this.e.getRotation());
        float f8 = this.a(this.a);
        ax.p1.d.e(this.a);
        this.c(this.a);
        this.b(this.a, f8);
    }

    public static interface a {
        public void a(float[] var1, float var2);
    }
}

