package ax.R;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y {

    class a extends BroadcastReceiver {
        final /* synthetic */ IntentSender a;

        a(IntentSender intentSender) {
            this.a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    public static Intent a(Context context, r rVar) {
        Intent intent;
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService((Class<Object>) s.a());
            intent = u.a(systemService).createShortcutResultIntent(rVar.d());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return rVar.a(intent);
    }

    public static boolean b(Context context) {
        Object systemService;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService((Class<Object>) s.a());
            isRequestPinShortcutSupported = u.a(systemService).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (ax.Q.b.a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context, r rVar, IntentSender intentSender) {
        Object systemService;
        boolean requestPinShortcut;
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && rVar.c(1)) {
            return false;
        }
        if (i >= 26) {
            systemService = context.getSystemService((Class<Object>) s.a());
            requestPinShortcut = u.a(systemService).requestPinShortcut(rVar.d(), intentSender);
            return requestPinShortcut;
        }
        if (!b(context)) {
            return false;
        }
        Intent a2 = rVar.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(a2);
            return true;
        }
        context.sendOrderedBroadcast(a2, null, new a(intentSender), null, -1, null, null);
        return true;
    }
}
