package ax.M5;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import ax.J5.C0751l;
import ax.J5.C0754o;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class B {
    private static final ax.B.k a = new ax.B.k();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return ax.S5.e.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(ax.I5.b.a) : resources.getString(ax.I5.b.j) : resources.getString(ax.I5.b.d);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(ax.I5.b.e, a2);
        }
        if (i == 2) {
            return ax.R5.i.d(context) ? resources.getString(ax.I5.b.n) : resources.getString(ax.I5.b.k, a2);
        }
        if (i == 3) {
            return resources.getString(ax.I5.b.b, a2);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(ax.I5.b.i, a2);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(ax.I5.b.m, a2);
            default:
                return resources.getString(C0754o.a, a2);
        }
    }

    public static String d(Context context, int i) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i);
    }

    public static String e(Context context, int i) {
        String h = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i);
        return h == null ? context.getResources().getString(ax.I5.b.h) : h;
    }

    public static String f(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(ax.I5.b.f);
            case 2:
                return resources.getString(ax.I5.b.l);
            case 3:
                return resources.getString(ax.I5.b.c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = h(context, str);
        if (h == null) {
            h = resources.getString(C0754o.a);
        }
        return String.format(resources.getConfiguration().locale, h, str2);
    }

    private static String h(Context context, String str) {
        ax.B.k kVar = a;
        synchronized (kVar) {
            try {
                Locale d = ax.Y.e.a(context.getResources().getConfiguration()).d(0);
                if (!d.equals(b)) {
                    kVar.clear();
                    b = d;
                }
                String str2 = (String) kVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources e = C0751l.e(context);
                if (e == null) {
                    return null;
                }
                int identifier = e.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = e.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    kVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
