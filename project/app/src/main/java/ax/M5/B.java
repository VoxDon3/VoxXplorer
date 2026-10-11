/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import ax.B.k;
import ax.I5.b;
import ax.J5.l;
import ax.J5.o;
import ax.R5.i;
import ax.Y.e;
import java.util.Locale;

public final class B {
    private static final k a = new k();
    private static Locale b;

    public static String a(Context object) {
        String string = object.getPackageName();
        try {
            String string2 = ((Object)ax.S5.e.a(object).c(string)).toString();
            return string2;
        }
        catch (PackageManager.NameNotFoundException | NullPointerException throwable) {
            object = object.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)object)) {
                return string;
            }
            return object;
        }
    }

    public static String b(Context context, int n8) {
        context = context.getResources();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return context.getString(17039370);
                }
                return context.getString(ax.I5.b.a);
            }
            return context.getString(ax.I5.b.j);
        }
        return context.getString(ax.I5.b.d);
    }

    public static String c(Context context, int n8) {
        Resources resources = context.getResources();
        String string = B.a(context);
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 5) {
                        if (n8 != 7) {
                            if (n8 != 9) {
                                if (n8 != 20) {
                                    switch (n8) {
                                        default: {
                                            return resources.getString(o.a, new Object[]{string});
                                        }
                                        case 18: {
                                            return resources.getString(ax.I5.b.m, new Object[]{string});
                                        }
                                        case 17: {
                                            return B.g(context, "common_google_play_services_sign_in_failed_text", string);
                                        }
                                        case 16: 
                                    }
                                    return B.g(context, "common_google_play_services_api_unavailable_text", string);
                                }
                                return B.g(context, "common_google_play_services_restricted_profile_text", string);
                            }
                            return resources.getString(ax.I5.b.i, new Object[]{string});
                        }
                        return B.g(context, "common_google_play_services_network_error_text", string);
                    }
                    return B.g(context, "common_google_play_services_invalid_account_text", string);
                }
                return resources.getString(ax.I5.b.b, new Object[]{string});
            }
            if (i.d(context)) {
                return resources.getString(ax.I5.b.n);
            }
            return resources.getString(ax.I5.b.k, new Object[]{string});
        }
        return resources.getString(ax.I5.b.e, new Object[]{string});
    }

    public static String d(Context context, int n8) {
        if (n8 != 6 && n8 != 19) {
            return B.c(context, n8);
        }
        return B.g(context, "common_google_play_services_resolution_required_text", B.a(context));
    }

    public static String e(Context context, int n8) {
        String string = n8 == 6 ? B.h(context, "common_google_play_services_resolution_required_title") : B.f(context, n8);
        if (string == null) {
            return context.getResources().getString(ax.I5.b.h);
        }
        return string;
    }

    public static String f(Context object, int n8) {
        Resources resources = object.getResources();
        switch (n8) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected error code ");
                ((StringBuilder)object).append(n8);
                Log.e((String)"GoogleApiAvailability", (String)((StringBuilder)object).toString());
                return null;
            }
            case 20: {
                Log.e((String)"GoogleApiAvailability", (String)"The current user profile is restricted and could not use authenticated features.");
                return B.h((Context)object, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e((String)"GoogleApiAvailability", (String)"The specified account could not be signed in.");
                return B.h((Context)object, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e((String)"GoogleApiAvailability", (String)"One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e((String)"GoogleApiAvailability", (String)"The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e((String)"GoogleApiAvailability", (String)"Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e((String)"GoogleApiAvailability", (String)"Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e((String)"GoogleApiAvailability", (String)"Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e((String)"GoogleApiAvailability", (String)"Network error occurred. Please retry request later.");
                return B.h((Context)object, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e((String)"GoogleApiAvailability", (String)"An invalid account was specified when connecting. Please provide a valid account.");
                return B.h((Context)object, "common_google_play_services_invalid_account_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(ax.I5.b.c);
            }
            case 2: {
                return resources.getString(ax.I5.b.l);
            }
            case 1: 
        }
        return resources.getString(ax.I5.b.f);
    }

    private static String g(Context object, String string, String string2) {
        Resources resources = object.getResources();
        string = B.h(object, string);
        object = string;
        if (string == null) {
            object = resources.getString(o.a);
        }
        return String.format(resources.getConfiguration().locale, (String)object, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String h(Context object, String string) {
        k k8 = a;
        synchronized (k8) {
            Throwable throwable2;
            block8: {
                Object object2;
                block7: {
                    try {
                        object2 = e.a(object.getResources().getConfiguration()).d(0);
                        if (((Locale)object2).equals(b)) break block7;
                        k8.clear();
                        b = object2;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if ((object2 = (String)k8.get(string)) != null) {
                    return object2;
                }
                if ((object = l.e((Context)object)) == null) {
                    return null;
                }
                int n8 = object.getIdentifier(string, "string", "com.google.android.gms");
                if (n8 == 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Missing resource: ");
                    ((StringBuilder)object).append(string);
                    Log.w((String)"GoogleApiAvailability", (String)((StringBuilder)object).toString());
                    return null;
                }
                if (TextUtils.isEmpty((CharSequence)(object = object.getString(n8)))) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Got empty resource: ");
                    ((StringBuilder)object).append(string);
                    Log.w((String)"GoogleApiAvailability", (String)((StringBuilder)object).toString());
                    return null;
                }
                k8.put(string, object);
                return object;
            }
            throw throwable2;
        }
    }
}

