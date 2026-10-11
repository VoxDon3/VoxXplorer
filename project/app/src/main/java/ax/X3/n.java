/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import ax.Q3.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class n {
    private static final Paint a = new Paint(6);
    private static final Paint b = new Paint(7);
    private static final Paint c;
    private static final List<String> d;
    private static final Lock e;

    static {
        Object object = Arrays.asList("XT1097", "XT1085");
        d = object;
        object = object.contains(Build.MODEL) && Build.VERSION.SDK_INT == 22 ? new ReentrantLock() : new a();
        e = object;
        object = new Paint(7);
        c = object;
        object.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            n.b(canvas);
            lock.unlock();
            return;
        }
        catch (Throwable throwable) {
            e.unlock();
            throw throwable;
        }
    }

    private static void b(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Lock c() {
        return e;
    }

    public static int d(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 7: 
            case 8: {
                return 270;
            }
            case 5: 
            case 6: {
                return 90;
            }
            case 3: 
            case 4: 
        }
        return 180;
    }

    private static Bitmap.Config e(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    static void f(int n8, Matrix matrix) {
        switch (n8) {
            default: {
                return;
            }
            case 8: {
                matrix.setRotate(-90.0f);
                return;
            }
            case 7: {
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            }
            case 6: {
                matrix.setRotate(90.0f);
                return;
            }
            case 5: {
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            }
            case 4: {
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            }
            case 3: {
                matrix.setRotate(180.0f);
                return;
            }
            case 2: 
        }
        matrix.setScale(-1.0f, 1.0f);
    }

    public static boolean g(int n8) {
        switch (n8) {
            default: {
                return false;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        return true;
    }

    public static Bitmap h(d d8, Bitmap bitmap, int n8) {
        if (!n.g(n8)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        n.f(n8, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        matrix.mapRect(rectF);
        d8 = d8.d(Math.round(rectF.width()), Math.round(rectF.height()), n.e(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        n.a(bitmap, (Bitmap)d8, matrix);
        return d8;
    }

    private static final class a
    implements Lock {
        a() {
        }

        @Override
        public void lock() {
        }

        @Override
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override
        public boolean tryLock() {
            return true;
        }

        @Override
        public boolean tryLock(long l8, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override
        public void unlock() {
        }
    }
}

