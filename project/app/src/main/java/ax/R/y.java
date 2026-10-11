/*
 * Decompiled with CFR 0.152.
 */
package ax.R;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import ax.Q.b;
import ax.R.r;
import ax.R.s;
import ax.R.t;
import ax.R.u;
import ax.R.v;
import ax.R.w;
import ax.R.x;

public class y {
    public static Intent a(Context object, r r8) {
        object = Build.VERSION.SDK_INT >= 26 ? v.a(u.a(t.a(object, s.a())), r8.d()) : null;
        Context context = object;
        if (object == null) {
            context = new Intent();
        }
        return r8.a((Intent)context);
    }

    public static boolean b(Context object) {
        if (Build.VERSION.SDK_INT >= 26) {
            return x.a(u.a(t.a((Context)object, s.a())));
        }
        if (b.a((Context)object, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        object = object.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (object.hasNext()) {
            String string = ((ResolveInfo)object.next()).activityInfo.permission;
            if (!TextUtils.isEmpty((CharSequence)string) && !"com.android.launcher.permission.INSTALL_SHORTCUT".equals(string)) continue;
            return true;
        }
        return false;
    }

    public static boolean c(Context context, r r8, IntentSender intentSender) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 <= 32 && r8.c(1)) {
            return false;
        }
        if (n8 >= 26) {
            return w.a(u.a(t.a(context, s.a())), r8.d(), intentSender);
        }
        if (!y.b(context)) {
            return false;
        }
        r8 = r8.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast((Intent)r8);
            return true;
        }
        context.sendOrderedBroadcast((Intent)r8, null, new BroadcastReceiver(intentSender){
            final IntentSender a;
            {
                this.a = intentSender;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public void onReceive(Context context, Intent intent) {
                try {
                    this.a.sendIntent(context, 0, null, null, null);
                    return;
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    return;
                }
            }
        }, null, -1, null, null);
        return true;
    }
}

