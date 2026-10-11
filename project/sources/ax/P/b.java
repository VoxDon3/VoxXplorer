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
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class b extends ax.Q.b {

    class a implements Runnable {
        final /* synthetic */ Activity c0;
        final /* synthetic */ int d0;
        final /* synthetic */ String[] q;

        a(String[] strArr, Activity activity, int i) {
            this.q = strArr;
            this.c0 = activity;
            this.d0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.q.length];
            PackageManager packageManager = this.c0.getPackageManager();
            String packageName = this.c0.getPackageName();
            int length = this.q.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.q[i], packageName);
            }
            ((f) this.c0).onRequestPermissionsResult(this.d0, this.q, iArr);
        }
    }

    /* renamed from: ax.P.b$b, reason: collision with other inner class name */
    static class C0162b {
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
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class d {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface f {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface g {
        void validateRequestPermissionsRequestCode(int i);
    }

    public static /* synthetic */ void n(Activity activity) {
        if (activity.isFinishing() || ax.P.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void o(Activity activity) {
        activity.finishAffinity();
    }

    public static void p(Activity activity) {
        C0162b.a(activity);
    }

    public static void q(Activity activity) {
        C0162b.b(activity);
    }

    public static void r(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: ax.P.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.n(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof g) {
                ((g) activity).validateRequestPermissionsRequestCode(i);
            }
            c.b(activity, strArr, i);
        } else if (activity instanceof f) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i));
        }
    }

    public static void t(Activity activity, v vVar) {
        C0162b.c(activity, null);
    }

    public static void u(Activity activity, v vVar) {
        C0162b.d(activity, null);
    }

    public static boolean v(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return e.a(activity, str);
        }
        if (i == 31) {
            return d.b(activity, str);
        }
        if (i >= 23) {
            return c.c(activity, str);
        }
        return false;
    }

    public static void w(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void x(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void y(Activity activity) {
        C0162b.e(activity);
    }
}
