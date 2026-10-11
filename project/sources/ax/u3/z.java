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
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.L;
import ax.X2.Q;
import ax.c0.F0;
import ax.n.ActivityC2561c;
import ax.s3.C3045a;
import ax.t.MenuItemC3091c;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.R;
import j$.nio.channels.DesugarChannels;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* loaded from: classes.dex */
public class z {
    private static final Object a = new Object();
    private static final int[] b = new int[1];
    static boolean c;
    static boolean d;
    private static Boolean e;

    public static void A(Context context) {
        synchronized (a) {
            if (!c && !d) {
                try {
                    WebSettings.getDefaultUserAgent(context);
                    d = true;
                } catch (NoClassDefFoundError | RuntimeException unused) {
                }
            }
        }
    }

    public static void B(Activity activity, int i) {
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (j(i) > 0.4f) {
            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
        } else {
            decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
        }
    }

    public static void C(Context context, MenuItem menuItem, int i) {
        ColorStateList d2 = ax.Q.b.d(context, i);
        if (menuItem instanceof ax.V.b) {
            ((ax.V.b) menuItem).setIconTintList(d2);
        } else if (menuItem instanceof MenuItemC3091c) {
            ((MenuItemC3091c) menuItem).setIconTintList(d2);
        } else if (Q.i1()) {
            menuItem.setIconTintList(d2);
        }
    }

    public static void D(Context context, int i, int i2) {
        boolean N = C3180B.N(context);
        if (!Q.b0() || N) {
            Toast.makeText(context, i, i2).show();
            return;
        }
        Toast toast = new Toast(context);
        toast.setDuration(i2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_toast_long, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.message)).setText(i);
        toast.setView(inflate);
        toast.show();
    }

    public static void E(Context context, View view) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            inputMethodManager.showSoftInput(view, 0);
            inputMethodManager.showSoftInputFromInputMethod(view.getWindowToken(), 0);
        } catch (NullPointerException unused) {
        }
    }

    public static boolean F(Context context) {
        boolean z = false;
        for (int i = 1; i <= 5 && (z = z(context)) && i != 5; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        return !z;
    }

    public static boolean a(Activity activity) {
        return Build.VERSION.SDK_INT <= 25 ? w(activity) || b(activity) : x(activity);
    }

    public static boolean b(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null) {
            return false;
        }
        int nightMode = uiModeManager.getNightMode();
        return nightMode == 2 || nightMode == 0 || nightMode == 3;
    }

    public static void c(ActivityC2561c activityC2561c) {
        int i = ax.t3.j.i(activityC2561c);
        boolean w = w(activityC2561c);
        if (!(i == 1 && w) && ((i != 2 || w) && (i != -1 || w(activityC2561c.getApplicationContext()) == w))) {
            return;
        }
        g(activityC2561c);
    }

    public static byte[] d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap e(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap f(Drawable drawable, int i, int i2) {
        return Bitmap.createScaledBitmap(e(drawable), i, i2, false);
    }

    public static void g(ActivityC2561c activityC2561c) {
        if (activityC2561c == null) {
            return;
        }
        if (activityC2561c instanceof com.voxdon.xplorer.activity.b) {
            activityC2561c.getDelegate().f();
            activityC2561c.getTheme().applyStyle(R.style.filemanager_AppTheme, true);
        } else {
            if (activityC2561c instanceof VideoPlayerActivity) {
                return;
            }
            C3184b.e("?");
        }
    }

    public static Drawable h(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return ax.Q.b.e(context, typedValue.resourceId);
    }

    public static float i(Context context, int i, float f) {
        int[] iArr = b;
        iArr[0] = i;
        L u = L.u(context, null, iArr);
        try {
            return u.i(0, f);
        } finally {
            u.x();
        }
    }

    public static float j(int i) {
        double red = Color.red(i) / 255.0d;
        double green = Color.green(i) / 255.0d;
        double blue = Color.blue(i) / 255.0d;
        return (float) (((red < 0.03928d ? red / 12.92d : Math.pow((red + 0.055d) / 1.055d, 2.4d)) * 0.2126d) + ((green < 0.03928d ? green / 12.92d : Math.pow((green + 0.055d) / 1.055d, 2.4d)) * 0.7152d) + ((blue < 0.03928d ? blue / 12.92d : Math.pow((blue + 0.055d) / 1.055d, 2.4d)) * 0.0722d));
    }

    public static LayerDrawable k(Context context, int i, int i2, int i3, int i4) {
        Drawable mutate = ax.U.a.r(C3045a.c(context, i)).mutate();
        if (i3 != 0) {
            ax.U.a.n(mutate, ax.Q.b.c(context, i3));
        }
        Drawable mutate2 = ax.U.a.r(C3045a.c(context, i2)).mutate();
        if (i4 != 0) {
            ax.U.a.n(mutate2, ax.Q.b.c(context, i4));
        }
        return new LayerDrawable(new Drawable[]{mutate, mutate2});
    }

    public static int l(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (((rotation == 0 || rotation == 2) && i2 > i) || ((rotation == 1 || rotation == 3) && i > i2)) {
            if (rotation == 0) {
                return 1;
            }
            if (rotation == 1) {
                return 0;
            }
            if (rotation != 2) {
                return rotation != 3 ? 1 : 8;
            }
            return 9;
        }
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 1;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 9;
        }
        return 8;
    }

    public static ax.T.b m(F0 f0) {
        return ax.T.b.a(f0.f(F0.m.h()), f0.f(F0.m.b()));
    }

    public static int n(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    public static int o(Context context, int i) {
        int[] iArr = b;
        iArr[0] = i;
        L u = L.u(context, null, iArr);
        try {
            return u.b(0, 0);
        } finally {
            u.x();
        }
    }

    public static Drawable p(Context context, int i) {
        Drawable r = ax.U.a.r(C3045a.c(context, i != 0 ? i != 1 ? i != 2 ? R.drawable.ic_ab_view_settings : R.drawable.ic_ab_gridview : R.drawable.ic_ab_detailview : R.drawable.ic_ab_listview).mutate());
        ax.U.a.n(r, o(context, R.attr.colorControlNormal));
        return r;
    }

    public static void q(Activity activity) {
        if (c) {
            return;
        }
        boolean w = w(activity);
        try {
            new WebView(activity).destroy();
            c = true;
        } catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException | VerifyError unused) {
        }
        if (w != w(activity)) {
            g((ActivityC2561c) activity);
        }
    }

    private static boolean r(Context context) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        if (!Q.B0()) {
            return false;
        }
        RandomAccessFile randomAccessFile = null;
        FileLock fileLock = null;
        RandomAccessFile randomAccessFile2 = null;
        RandomAccessFile randomAccessFile3 = null;
        RandomAccessFile randomAccessFile4 = null;
        RandomAccessFile randomAccessFile5 = null;
        try {
            try {
                File dataDir = Q.F0() ? context.getDataDir() : context.getFilesDir().getParentFile();
                if (dataDir == null) {
                    return false;
                }
                File file = new File(dataDir.getAbsolutePath() + "/app_webview/webview_data.lock");
                if (!file.exists()) {
                    return false;
                }
                RandomAccessFile randomAccessFile6 = new RandomAccessFile(file, "rw");
                try {
                    try {
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile6.getChannel());
                        try {
                            fileLock = convertMaybeLegacyFileChannelFromLibrary.tryLock();
                        } catch (IOException unused) {
                        }
                        if (fileLock == null) {
                            try {
                                randomAccessFile6.close();
                                return true;
                            } catch (Exception unused2) {
                                return true;
                            }
                        }
                        fileLock.release();
                        try {
                            randomAccessFile6.close();
                        } catch (Exception unused3) {
                        }
                        return false;
                    } catch (FileNotFoundException unused4) {
                        randomAccessFile3 = randomAccessFile6;
                        if (randomAccessFile3 != null) {
                            try {
                                randomAccessFile3.close();
                            } catch (Exception unused5) {
                            }
                        }
                        return false;
                    } catch (IOException unused6) {
                        randomAccessFile4 = randomAccessFile6;
                        if (randomAccessFile4 != null) {
                            try {
                                randomAccessFile4.close();
                            } catch (Exception unused7) {
                            }
                        }
                        return false;
                    }
                } catch (OverlappingFileLockException unused8) {
                    randomAccessFile5 = randomAccessFile6;
                    if (randomAccessFile5 != null) {
                        try {
                            randomAccessFile5.close();
                        } catch (Exception unused9) {
                        }
                    }
                    return false;
                } catch (RuntimeException e2) {
                    randomAccessFile = randomAccessFile6;
                    e = e2;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused10) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    randomAccessFile2 = randomAccessFile6;
                    th = th;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (Exception unused11) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused12) {
        } catch (IOException unused13) {
        } catch (OverlappingFileLockException unused14) {
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    public static boolean s(ViewGroup viewGroup, View view) {
        if (viewGroup != null && view != null) {
            ViewParent parent = view.getParent();
            while (viewGroup != parent && parent != null) {
                parent = parent.getParent();
            }
            if (parent == viewGroup) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.lowMemory;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean u(Context context) {
        return t(context) || v(context);
    }

    public static boolean v(Context context) {
        File cacheDir = context.getCacheDir();
        return cacheDir != null && cacheDir.getUsableSpace() <= 10485760;
    }

    public static boolean w(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean x(Activity activity) {
        if (activity == null) {
            return false;
        }
        boolean w = w(activity);
        boolean w2 = w(activity.getApplicationContext());
        int i = ax.t3.j.i(activity);
        if (i == 1 && w) {
            return true;
        }
        if (i == 2 && !w) {
            return true;
        }
        if (i == -1) {
            if (w2 != w) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return w != w2;
    }

    public static boolean y() {
        return c;
    }

    private static boolean z(Context context) {
        synchronized (a) {
            try {
                Boolean bool = e;
                if (bool != null && !bool.booleanValue()) {
                    return false;
                }
                Boolean valueOf = Boolean.valueOf(r(context));
                e = valueOf;
                return valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
