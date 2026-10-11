/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

public final class j {
    public static Intent a(Activity activity) {
        Object object = activity.getParentActivityIntent();
        if (object != null) {
            return object;
        }
        object = j.c(activity);
        if (object == null) {
            return null;
        }
        ComponentName componentName = new ComponentName((Context)activity, (String)object);
        try {
            if (j.d((Context)activity, componentName) == null) {
                return Intent.makeMainActivity((ComponentName)componentName);
            }
            activity = new Intent();
            activity = activity.setComponent(componentName);
            return activity;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
            stringBuilder.append((String)object);
            stringBuilder.append("' in manifest");
            Log.e((String)"NavUtils", (String)stringBuilder.toString());
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string = j.d(context, componentName);
        if (string == null) {
            return null;
        }
        if (j.d(context, componentName = new ComponentName(componentName.getPackageName(), string)) == null) {
            return Intent.makeMainActivity((ComponentName)componentName);
        }
        return new Intent().setComponent(componentName);
    }

    public static String c(Activity object) {
        try {
            object = j.d((Context)object, object.getComponentName());
            return object;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new IllegalArgumentException(nameNotFoundException);
        }
    }

    public static String d(Context context, ComponentName object) throws PackageManager.NameNotFoundException {
        Object object2 = context.getPackageManager();
        int n8 = Build.VERSION.SDK_INT;
        n8 = n8 >= 29 ? 269222528 : (n8 >= 24 ? 787072 : 640);
        object = object2.getActivityInfo((ComponentName)object, n8);
        object2 = ((ActivityInfo)object).parentActivityName;
        if (object2 != null) {
            return object2;
        }
        object = ((ActivityInfo)object).metaData;
        if (object == null) {
            return null;
        }
        if ((object = object.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (((String)object).charAt(0) == '.') {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(context.getPackageName());
            ((StringBuilder)object2).append((String)object);
            return ((StringBuilder)object2).toString();
        }
        return object;
    }

    public static void e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static boolean f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

