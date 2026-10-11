/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import ax.J5.j;
import ax.J5.k;
import ax.J5.m;
import ax.S5.e;
import ax.Z5.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public class i {
    public static final int a = m.a;
    private static final i b = new i();

    i() {
    }

    public static i f() {
        return b;
    }

    public int a(Context context) {
        return m.b(context);
    }

    public Intent b(Context context, int n8, String string) {
        if (n8 != 1 && n8 != 2) {
            if (n8 != 3) {
                return null;
            }
            string = Uri.fromParts((String)"package", (String)"com.google.android.gms", null);
            context = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            context.setData((Uri)string);
            return context;
        }
        if (context != null && ax.R5.i.d(context)) {
            context = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            context.setPackage("com.google.android.wearable.app");
            return context;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(a);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            stringBuilder.append(string);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(e.a((Context)context).d((String)context.getPackageName(), (int)0).versionCode);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
        }
        string = stringBuilder.toString();
        stringBuilder = new Intent("android.intent.action.VIEW");
        context = Uri.parse((String)"market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            context.appendQueryParameter("pcampaignid", string);
        }
        stringBuilder.setData(context.build());
        stringBuilder.setPackage("com.android.vending");
        stringBuilder.addFlags(524288);
        return stringBuilder;
    }

    public PendingIntent c(Context context, int n8, int n9) {
        return this.d(context, n8, n9, null);
    }

    public PendingIntent d(Context context, int n8, int n9, String string) {
        if ((string = this.b(context, n8, string)) == null) {
            return null;
        }
        return PendingIntent.getActivity((Context)context, (int)n9, (Intent)string, (int)(d.a | 0x8000000));
    }

    public String e(int n8) {
        return m.c(n8);
    }

    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return this.h(context, a);
    }

    public int h(Context context, int n8) {
        if (m.h(context, n8 = m.g(context, n8))) {
            return 18;
        }
        return n8;
    }

    public boolean i(Context context, String string) {
        return m.l(context, string);
    }

    public boolean j(int n8) {
        return m.j(n8);
    }

    public void k(Context context, int n8) throws k, j {
        m.a(context, n8);
    }
}

