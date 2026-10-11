package ax.J5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: ax.J5.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0748i {
    public static final int a = C0752m.a;
    private static final C0748i b = new C0748i();

    C0748i() {
    }

    public static C0748i f() {
        return b;
    }

    public int a(Context context) {
        return C0752m.b(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && ax.R5.i.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(ax.S5.e.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b2, ax.Z5.d.a | 134217728);
    }

    public String e(int i) {
        return C0752m.c(i);
    }

    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int g = C0752m.g(context, i);
        if (C0752m.h(context, g)) {
            return 18;
        }
        return g;
    }

    public boolean i(Context context, String str) {
        return C0752m.l(context, str);
    }

    public boolean j(int i) {
        return C0752m.j(i);
    }

    public void k(Context context, int i) throws C0750k, C0749j {
        C0752m.a(context, i);
    }
}
