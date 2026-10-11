/*
 * Decompiled with CFR 0.152.
 */
package ax.m3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import androidx.appcompat.app.a;
import ax.c3.u;
import ax.t3.k;
import java.util.Random;

public class a {
    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static boolean b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("market://details?id=");
        stringBuilder.append(context.getPackageName());
        return a.a(context, new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString())));
    }

    public static boolean c(Activity activity) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)activity);
        long l8 = System.currentTimeMillis();
        long l9 = sharedPreferences.getLong("RATING_TIME", 0L);
        if (l9 == 0L) {
            int n8 = new Random().nextInt(15);
            if (k.j() < (long)(n8 + 5)) {
                return false;
            }
        }
        if (l9 != 1L && l9 != 2L && l9 <= l8) {
            if (!a.b((Context)activity)) {
                return false;
            }
            a.a a8 = new a.a((Context)activity);
            a8.p(2131952527);
            a8.e(2131952524);
            a8.setPositiveButton(2131952528, new DialogInterface.OnClickListener(){
                final SharedPreferences a;
                final Context b;
                {
                    this.a = sharedPreferences;
                    this.b = context;
                }

                public void onClick(DialogInterface object, int n8) {
                    object = this.a.edit();
                    object.putLong("RATING_TIME", 1L);
                    object.commit();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("market://details?id=");
                    ((StringBuilder)object).append(this.b.getPackageName());
                    object = new Intent("android.intent.action.VIEW", Uri.parse((String)((StringBuilder)object).toString()));
                    object.setFlags(524288);
                    u.o0(this.b, (Intent)object);
                }
            });
            a8.setNegativeButton(2131952526, new DialogInterface.OnClickListener(){
                final SharedPreferences a;
                final Activity b;
                {
                    this.a = sharedPreferences;
                    this.b = activity;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                    dialogInterface = this.a.edit();
                    dialogInterface.putLong("RATING_TIME", System.currentTimeMillis() + 3456000000L);
                    dialogInterface.commit();
                    this.b.finish();
                }
            });
            a8.i(2131952525, new DialogInterface.OnClickListener(){
                final SharedPreferences a;
                final Activity b;
                {
                    this.a = sharedPreferences;
                    this.b = activity;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                    dialogInterface = this.a.edit();
                    dialogInterface.putLong("RATING_TIME", 2L);
                    dialogInterface.commit();
                    this.b.finish();
                }
            });
            a8.j(new DialogInterface.OnCancelListener(){
                final SharedPreferences a;
                final Activity b;
                {
                    this.a = sharedPreferences;
                    this.b = activity;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    dialogInterface = this.a.edit();
                    dialogInterface.putLong("RATING_TIME", System.currentTimeMillis() + 1728000000L);
                    dialogInterface.commit();
                    this.b.finish();
                }
            });
            a8.create().show();
            return true;
        }
        return false;
    }
}

