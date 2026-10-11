package ax.m3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import androidx.appcompat.app.a;
import ax.c3.C1832u;
import ax.t3.k;
import com.voxdon.xplorer.R;
import java.util.Random;

/* renamed from: ax.m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2514a {

    /* renamed from: ax.m3.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC0372a implements DialogInterface.OnClickListener {
        final /* synthetic */ SharedPreferences a;
        final /* synthetic */ Context b;

        DialogInterfaceOnClickListenerC0372a(SharedPreferences sharedPreferences, Context context) {
            this.a = sharedPreferences;
            this.b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("RATING_TIME", 1L);
            edit.commit();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.b.getPackageName()));
            intent.setFlags(524288);
            C1832u.o0(this.b, intent);
        }
    }

    /* renamed from: ax.m3.a$b */
    class b implements DialogInterface.OnClickListener {
        final /* synthetic */ SharedPreferences a;
        final /* synthetic */ Activity b;

        b(SharedPreferences sharedPreferences, Activity activity) {
            this.a = sharedPreferences;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("RATING_TIME", System.currentTimeMillis() + 3456000000L);
            edit.commit();
            this.b.finish();
        }
    }

    /* renamed from: ax.m3.a$c */
    class c implements DialogInterface.OnClickListener {
        final /* synthetic */ SharedPreferences a;
        final /* synthetic */ Activity b;

        c(SharedPreferences sharedPreferences, Activity activity) {
            this.a = sharedPreferences;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("RATING_TIME", 2L);
            edit.commit();
            this.b.finish();
        }
    }

    /* renamed from: ax.m3.a$d */
    class d implements DialogInterface.OnCancelListener {
        final /* synthetic */ SharedPreferences a;
        final /* synthetic */ Activity b;

        d(SharedPreferences sharedPreferences, Activity activity) {
            this.a = sharedPreferences;
            this.b = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("RATING_TIME", System.currentTimeMillis() + 1728000000);
            edit.commit();
            this.b.finish();
        }
    }

    public static boolean a(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static boolean b(Context context) {
        return a(context, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
    }

    public static boolean c(Activity activity) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
        long currentTimeMillis = System.currentTimeMillis();
        long j = defaultSharedPreferences.getLong("RATING_TIME", 0L);
        if (j == 0) {
            if (k.j() < new Random().nextInt(15) + 5) {
                return false;
            }
        }
        if (j == 1 || j == 2 || j > currentTimeMillis || !b(activity)) {
            return false;
        }
        a.C0006a c0006a = new a.C0006a(activity);
        c0006a.p(R.string.rate_title);
        c0006a.e(R.string.rate_message);
        c0006a.setPositiveButton(R.string.rate_yes, new DialogInterfaceOnClickListenerC0372a(defaultSharedPreferences, activity));
        c0006a.setNegativeButton(R.string.rate_not_now, new b(defaultSharedPreferences, activity));
        c0006a.i(R.string.rate_never, new c(defaultSharedPreferences, activity));
        c0006a.j(new d(defaultSharedPreferences, activity));
        c0006a.create().show();
        return true;
    }
}
