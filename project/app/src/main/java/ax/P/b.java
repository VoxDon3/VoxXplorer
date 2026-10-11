/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ax.P.a;
import ax.P.v;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public class b
extends ax.Q.b {
    public static /* synthetic */ void n(Activity activity) {
        if (!activity.isFinishing() && !ax.P.d.i(activity)) {
            activity.recreate();
        }
    }

    public static void o(Activity activity) {
        activity.finishAffinity();
    }

    public static void p(Activity activity) {
        b.a(activity);
    }

    public static void q(Activity activity) {
        b.b(activity);
    }

    public static void r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return;
        }
        new Handler(activity.getMainLooper()).post((Runnable)new a(activity));
    }

    public static void s(Activity object, String[] stringArray, int n8) {
        int n9;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int n10 = 0;
        for (n9 = 0; n9 < stringArray.length; ++n9) {
            if (!TextUtils.isEmpty((CharSequence)stringArray[n9])) {
                if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals((CharSequence)stringArray[n9], (CharSequence)"android.permission.POST_NOTIFICATIONS")) continue;
                hashSet.add(n9);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Permission request for permissions ");
            ((StringBuilder)object).append(Arrays.toString(stringArray));
            ((StringBuilder)object).append(" must not contain null or empty values");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        n9 = hashSet.size();
        String[] stringArray2 = n9 > 0 ? new String[stringArray.length - n9] : stringArray;
        if (n9 > 0) {
            if (n9 != stringArray.length) {
                int n11 = 0;
                for (n9 = n10; n9 < stringArray.length; ++n9) {
                    n10 = n11;
                    if (!hashSet.contains(n9)) {
                        stringArray2[n11] = stringArray[n9];
                        n10 = n11 + 1;
                    }
                    n11 = n10;
                }
            }
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                if (object instanceof g) {
                    ((g)object).validateRequestPermissionsRequestCode(n8);
                }
                c.b((Activity)object, stringArray, n8);
                return;
            }
            if (object instanceof f) {
                new Handler(Looper.getMainLooper()).post(new Runnable(){
                    final Activity c0;
                    final int d0;
                    final String[] q;
                    {
                        this.q = stringArray;
                        this.c0 = activity;
                        this.d0 = n8;
                    }

                    @Override
                    public void run() {
                        int[] nArray = new int[this.q.length];
                        PackageManager packageManager = this.c0.getPackageManager();
                        String string = this.c0.getPackageName();
                        int n8 = this.q.length;
                        for (int i8 = 0; i8 < n8; ++i8) {
                            nArray[i8] = packageManager.checkPermission(this.q[i8], string);
                        }
                        ((f)this.c0).onRequestPermissionsResult(this.d0, this.q, nArray);
                    }
                });
            }
        }
    }

    public static void t(Activity activity, v v8) {
        b.c(activity, null);
    }

    public static void u(Activity activity, v v8) {
        b.d(activity, null);
    }

    public static boolean v(Activity activity, String string) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 33 && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string)) {
            return false;
        }
        if (n8 >= 32) {
            return e.a(activity, string);
        }
        if (n8 == 31) {
            return d.b(activity, string);
        }
        if (n8 >= 23) {
            return c.c(activity, string);
        }
        return false;
    }

    public static void w(Activity activity, Intent intent, int n8, Bundle bundle) {
        activity.startActivityForResult(intent, n8, bundle);
    }

    public static void x(Activity activity, IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11, bundle);
    }

    public static void y(Activity activity) {
        b.e(activity);
    }

    static class b {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class c {
        static void a(Object object) {
            ((SharedElementCallback.OnSharedElementsReadyListener)object).onSharedElementsReady();
        }

        static void b(Activity activity, String[] stringArray, int n8) {
            activity.requestPermissions(stringArray, n8);
        }

        static boolean c(Activity activity, String string) {
            return activity.shouldShowRequestPermissionRationale(string);
        }
    }

    static class d {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint(value={"BanUncheckedReflection"})
        static boolean b(Activity activity, String string) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                boolean bl = (Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(packageManager, string);
                return bl;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return activity.shouldShowRequestPermissionRationale(string);
            }
        }
    }

    static class e {
        static boolean a(Activity activity, String string) {
            return activity.shouldShowRequestPermissionRationale(string);
        }
    }

    public static interface f {
        public void onRequestPermissionsResult(int var1, String[] var2, int[] var3);
    }

    public static interface g {
        public void validateRequestPermissionsRequestCode(int var1);
    }
}

