/*
 * Decompiled with CFR 0.152.
 */
package ax.Q;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import ax.P.p;
import ax.Q.g;
import ax.S.h;
import java.io.File;
import java.util.HashMap;

@SuppressLint(value={"PrivateConstructorForUtilityClass"})
public class b {
    private static final Object a = new Object();

    public static int a(Context context, String string) {
        ax.b0.b.d(string, "permission must be non-null");
        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string)) {
            if (p.d(context).a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(string, Process.myPid(), Process.myUid());
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(context);
        }
        return null;
    }

    public static int c(Context context, int n8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(context, n8);
        }
        return context.getResources().getColor(n8);
    }

    public static ColorStateList d(Context context, int n8) {
        return h.d(context.getResources(), n8, context.getTheme());
    }

    public static Drawable e(Context context, int n8) {
        return ax.Q.b$a.b(context, n8);
    }

    public static <T> T f(Context context, Class<T> object) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(context, object);
        }
        if ((object = b.g(context, object)) != null) {
            return (T)context.getSystemService((String)object);
        }
        return null;
    }

    public static String g(Context context, Class<?> clazz) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.c(context, clazz);
        }
        return f.a.get(clazz);
    }

    static String h(Context object) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(object.getPackageName());
        charSequence.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
        charSequence = charSequence.toString();
        if (g.b((Context)object, (String)charSequence) == 0) {
            return charSequence;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Permission ");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(" is required by your application to receive broadcasts, please add it to your manifest");
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int n8) {
        return b.j(context, broadcastReceiver, intentFilter, null, null, n8);
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string, Handler handler, int n8) {
        int n9 = n8 & 1;
        if (n9 != 0 && (n8 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        int n10 = n8;
        if (n9 != 0) {
            n10 = n8 | 2;
        }
        if ((n8 = n10 & 2) == 0 && (n10 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (n8 != 0 && (n10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        n8 = Build.VERSION.SDK_INT;
        if (n8 >= 33) {
            return e.a(context, broadcastReceiver, intentFilter, string, handler, n10);
        }
        if (n8 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, string, handler, n10);
        }
        if ((n10 & 4) != 0 && string == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, b.h(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, string, handler);
    }

    public static boolean k(Context context, Intent[] intentArray, Bundle bundle) {
        context.startActivities(intentArray, bundle);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void m(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
            return;
        }
        context.startService(intent);
    }

    static class a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int n8) {
            return context.getDrawable(n8);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class b {
        static int a(Context context, int n8) {
            return context.getColor(n8);
        }

        static <T> T b(Context context, Class<T> clazz) {
            return (T)context.getSystemService(clazz);
        }

        static String c(Context context, Class<?> clazz) {
            return context.getSystemServiceName(clazz);
        }
    }

    static class c {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class d {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string, Handler handler, int n8) {
            if ((n8 & 4) != 0 && string == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, b.h(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, string, handler, n8 & 1);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string, Handler handler, int n8) {
            return context.registerReceiver(broadcastReceiver, intentFilter, string, handler, n8);
        }
    }

    private static final class f {
        static final HashMap<Class<?>, String> a;

        static {
            HashMap<Class, String> hashMap = new HashMap<Class, String>();
            a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(ax.Q.c.a(), "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }
}

