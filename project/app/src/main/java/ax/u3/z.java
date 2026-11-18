/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.L;
import ax.X2.Q;
import ax.c0.F0;
import ax.s3.a;
import ax.t.c;
import ax.t3.j;
import ax.u3.B;
import ax.u3.b;
import ax.u3.w;
import ax.u3.x;
import ax.u3.y;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

public class z {
    private static final Object a = new Object();
    private static final int[] b = new int[1];
    static boolean c;
    static boolean d;
    private static Boolean e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void A(Context context) {
        Object object = a;
        synchronized (object) {
            try {
                boolean bl;
                if (!c && !(bl = d)) {
                    try {
                        WebSettings.getDefaultUserAgent((Context)context);
                        d = true;
                    }
                    catch (NoClassDefFoundError | RuntimeException throwable) {}
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
            return;
        }
    }

    public static void B(Activity activity, int n8) {
        activity = activity.getWindow().getDecorView();
        int n9 = activity.getSystemUiVisibility();
        if (z.j(n8) > 0.4f) {
            activity.setSystemUiVisibility(n9 | 0x2000);
            return;
        }
        activity.setSystemUiVisibility(n9 & 0xFFFFDFFF);
    }

    public static void C(Context context, MenuItem menuItem, int n8) {
        context = ax.Q.b.d(context, n8);
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b)menuItem).setIconTintList((ColorStateList)context);
            return;
        }
        if (menuItem instanceof c) {
            ((c)menuItem).setIconTintList((ColorStateList)context);
            return;
        }
        if (Q.i1()) {
            x.a(menuItem, (ColorStateList)context);
        }
    }

    public static void D(Context context, int n8, int n9) {
        boolean bl = B.N(context);
        if (Q.b0() && !bl) {
            Toast toast = new Toast(context);
            toast.setDuration(n9);
            context = LayoutInflater.from((Context)context).inflate(2131558712, null);
            ((TextView)context.findViewById(2131362552)).setText(n8);
            toast.setView((View)context);
            toast.show();
            return;
        }
        Toast.makeText((Context)context, (int)n8, (int)n9).show();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void E(Context context, View view) {
        try {
            context = (InputMethodManager)context.getSystemService("input_method");
            context.showSoftInput(view, 0);
            context.showSoftInputFromInputMethod(view.getWindowToken(), 0);
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean F(Context context) {
        boolean bl = false;
        int n8 = 1;
        while (n8 <= 5) {
            bl = z.z(context);
            if (!bl) {
                return bl ^ true;
            }
            if (n8 == 5) {
                return bl ^ true;
            }
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {}
            ++n8;
        }
        return bl ^ true;
    }

    public static boolean a(Activity activity) {
        if (Build.VERSION.SDK_INT <= 25) {
            return z.w((Context)activity) || z.b((Context)activity);
            {
            }
        }
        return z.x(activity);
    }

    public static boolean b(Context context) {
        if ((context = (UiModeManager)context.getSystemService("uimode")) == null) {
            return false;
        }
        int n8 = context.getNightMode();
        return n8 == 2 || n8 == 0 || n8 == 3;
        {
        }
    }

    public static void c(ax.n.c c8) {
        int n8 = j.i((Context)c8);
        boolean bl = z.w((Context)c8);
        if (n8 == 1 && bl || n8 == 2 && !bl || n8 == -1 && z.w(c8.getApplicationContext()) != bl) {
            z.g(c8);
        }
    }

    public static byte[] d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap e(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        if (drawable instanceof BitmapDrawable && (bitmapDrawable = (BitmapDrawable)drawable).getBitmap() != null) {
            return bitmapDrawable.getBitmap();
        }
        bitmapDrawable = drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0 ? Bitmap.createBitmap((int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888) : Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas((Bitmap)bitmapDrawable);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapDrawable;
    }

    public static Bitmap f(Drawable drawable, int n8, int n9) {
        return Bitmap.createScaledBitmap((Bitmap)z.e(drawable), (int)n8, (int)n9, (boolean)false);
    }

    public static void g(ax.n.c c8) {
        if (c8 == null) {
            return;
        }
        if (c8 instanceof com.voxdon.xplorer.activity.b) {
            c8.getDelegate().f();
            c8.getTheme().applyStyle(2132018521, true);
            return;
        }
        if (c8 instanceof VideoPlayerActivity) {
            return;
        }
        ax.u3.b.e("?");
    }

    public static Drawable h(Context context, int n8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n8, typedValue, true);
        return ax.Q.b.e(context, typedValue.resourceId);
    }

    public static float i(Context context, int n8, float f8) {
        Object object = b;
        object[0] = n8;
        object = L.u(context, null, (int[])object);
        try {
            f8 = ((L)object).i(0, f8);
            return f8;
        }
        finally {
            ((L)object).x();
        }
    }

    public static float j(int n8) {
        double d8 = (double)Color.red((int)n8) / 255.0;
        d8 = d8 < 0.03928 ? (d8 /= 12.92) : Math.pow((d8 + 0.055) / 1.055, 2.4);
        double d9 = (double)Color.green((int)n8) / 255.0;
        d9 = d9 < 0.03928 ? (d9 /= 12.92) : Math.pow((d9 + 0.055) / 1.055, 2.4);
        double d10 = (double)Color.blue((int)n8) / 255.0;
        d10 = d10 < 0.03928 ? (d10 /= 12.92) : Math.pow((d10 + 0.055) / 1.055, 2.4);
        return (float)(d8 * 0.2126 + d9 * 0.7152 + d10 * 0.0722);
    }

    public static LayerDrawable k(Context context, int n8, int n9, int n10, int n11) {
        Drawable drawable = ax.U.a.r(ax.s3.a.c(context, n8)).mutate();
        if (n10 != 0) {
            ax.U.a.n(drawable, ax.Q.b.c(context, n10));
        }
        Drawable drawable2 = ax.U.a.r(ax.s3.a.c(context, n9)).mutate();
        if (n11 != 0) {
            ax.U.a.n(drawable2, ax.Q.b.c(context, n11));
        }
        return new LayerDrawable(new Drawable[]{drawable, drawable2});
    }

    public static int l(Activity activity) {
        int n8 = activity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int n9 = displayMetrics.widthPixels;
        int n10 = displayMetrics.heightPixels;
        if ((n8 != 0 && n8 != 2 || n10 <= n9) && (n8 != 1 && n8 != 3 || n9 <= n10)) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return 0;
                        }
                        return 9;
                    }
                    return 8;
                }
                return 1;
            }
            return 0;
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return 1;
                    }
                    return 8;
                }
                return 9;
            }
            return 0;
        }
        return 1;
    }

    public static ax.T.b m(F0 f02) {
        return ax.T.b.a(f02.f(F0.m.h()), f02.f(F0.m.b()));
    }

    public static int n(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968854, typedValue, true);
        return typedValue.data;
    }

    public static int o(Context object, int n8) {
        int[] nArray = b;
        nArray[0] = n8;
        object = L.u((Context)object, null, nArray);
        try {
            n8 = ((L)object).b(0, 0);
            return n8;
        }
        finally {
            ((L)object).x();
        }
    }

    public static Drawable p(Context context, int n8) {
        n8 = n8 != 0 ? (n8 != 1 ? (n8 != 2 ? 2131231085 : 2131231066) : 2131231059) : 2131231070;
        Drawable drawable = ax.U.a.r(ax.s3.a.c(context, n8).mutate());
        ax.U.a.n(drawable, z.o(context, 2130968862));
        return drawable;
    }

    public static void q(Activity activity) {
        if (!c) {
            boolean bl = z.w((Context)activity);
            try {
                WebView webView = new WebView((Context)activity);
                webView.destroy();
                c = true;
            }
            catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException | VerifyError throwable) {
                // empty catch block
            }
            if (bl != z.w((Context)activity)) {
                z.g((ax.n.c)activity);
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean r(Context object) {
        block41: {
            block40: {
                block39: {
                    Object object2;
                    block37: {
                        block38: {
                            Object var5_19;
                            Object var4_18;
                            Object var6_17;
                            Object var3_16;
                            block36: {
                                Object object3;
                                if (!Q.B0()) {
                                    return false;
                                }
                                Object var2_11 = null;
                                var3_16 = null;
                                var6_17 = null;
                                var4_18 = null;
                                var5_19 = null;
                                object2 = object3 = null;
                                if (Q.F0()) {
                                    object2 = object3;
                                    object = y.a((Context)object);
                                } else {
                                    object2 = object3;
                                    object = object.getFilesDir().getParentFile();
                                }
                                if (object == null) {
                                    return false;
                                }
                                object2 = object3;
                                object2 = object3;
                                object2 = object3;
                                StringBuilder stringBuilder = new StringBuilder();
                                object2 = object3;
                                stringBuilder.append(((File)object).getAbsolutePath());
                                object2 = object3;
                                stringBuilder.append("/app_webview/webview_data.lock");
                                object2 = object3;
                                File file = new File(stringBuilder.toString());
                                object2 = object3;
                                if (!file.exists()) {
                                    return false;
                                }
                                object2 = object3;
                                object2 = object3;
                                object = new RandomAccessFile(file, "rw");
                                object2 = w.a((RandomAccessFile)object);
                                try {
                                    object2 = ((FileChannel)object2).tryLock();
                                }
                                catch (IOException iOException) {
                                    object2 = var2_11;
                                }
                                if (object2 != null) break block36;
                                try {
                                    ((RandomAccessFile)object).close();
                                    return true;
                                }
                                catch (Exception exception) {
                                    return true;
                                }
                            }
                            try {
                                ((FileLock)object2).release();
                            }
                            catch (Throwable throwable) {
                                object2 = object;
                                object = throwable;
                                break block37;
                            }
                            catch (RuntimeException runtimeException) {
                                break block38;
                            }
                            catch (OverlappingFileLockException overlappingFileLockException) {
                                break block39;
                            }
                            try {
                                ((RandomAccessFile)object).close();
                                return false;
                            }
                            catch (Exception exception) {
                                return false;
                            }
                            catch (IOException iOException) {
                                break block40;
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                break block41;
                            }
                            catch (Throwable throwable) {
                                break block37;
                            }
                            catch (RuntimeException runtimeException) {
                                object = var3_16;
                            }
                            catch (OverlappingFileLockException overlappingFileLockException) {
                                object = var6_17;
                                break block39;
                            }
                            catch (IOException iOException) {
                                object = var4_18;
                                break block40;
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                object = var5_19;
                                break block41;
                            }
                        }
                        object2 = object;
                        {
                            RuntimeException var2_15;
                            var2_15.printStackTrace();
                            if (object == null) return false;
                        }
                        try {
                            ((RandomAccessFile)object).close();
                            return false;
                        }
                        catch (Exception exception) {
                            return false;
                        }
                    }
                    if (object2 == null) throw object;
                    try {
                        ((RandomAccessFile)object2).close();
                    }
                    catch (Exception exception) {
                        throw object;
                    }
                    throw object;
                }
                if (object == null) return false;
                try {
                    ((RandomAccessFile)object).close();
                    return false;
                }
                catch (Exception exception) {
                    return false;
                }
            }
            if (object == null) return false;
            try {
                ((RandomAccessFile)object).close();
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        if (object == null) return false;
        try {
            ((RandomAccessFile)object).close();
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean s(ViewGroup viewGroup, View view) {
        if (viewGroup != null && view != null) {
            for (view = view.getParent(); viewGroup != view && view != null; view = view.getParent()) {
            }
            if (view == viewGroup) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(Context context) {
        if ((context = (ActivityManager)context.getSystemService("activity")) == null) {
            return false;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            context.getMemoryInfo(memoryInfo);
            boolean bl = memoryInfo.lowMemory;
            return bl;
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
    }

    public static boolean u(Context context) {
        return z.t(context) || z.v(context);
        {
        }
    }

    public static boolean v(Context object) {
        if ((object = object.getCacheDir()) == null) {
            return false;
        }
        return ((File)object).getUsableSpace() <= 0xA00000L;
    }

    public static boolean w(Context context) {
        return (context.getResources().getConfiguration().uiMode & 0x30) == 32;
    }

    public static boolean x(Activity activity) {
        if (activity == null) {
            return false;
        }
        boolean bl = z.w((Context)activity);
        boolean bl2 = z.w(activity.getApplicationContext());
        int n8 = j.i((Context)activity);
        if (n8 == 1 && bl) {
            return true;
        }
        if (n8 == 2 && !bl) {
            return true;
        }
        if (n8 == -1 ? bl2 != bl : n8 == 0) {
            return true;
        }
        return bl != bl2;
    }

    public static boolean y() {
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean z(Context object) {
        Object object2 = a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    Boolean bl = e;
                    if (bl != null && !bl.booleanValue()) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = z.r((Context)object);
                e = object;
                return (Boolean)object;
            }
            throw throwable2;
        }
    }
}

