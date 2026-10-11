/*
 * Decompiled with CFR 0.152.
 */
package ax.D5;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import ax.D5.a;
import ax.D5.c;
import ax.D5.d;
import ax.D5.f;
import ax.D5.g;
import ax.D5.h;
import ax.J5.k;
import ax.K5.b;
import ax.M5.p;
import ax.W5.N1;
import ax.W5.O;
import ax.W5.h2;
import ax.W5.k2;
import ax.W5.n0;
import ax.j6.j;
import ax.j6.m;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

public class i {
    public static final String[] a = new String[]{"com.google", "com.google.work", "cn.google"};
    @SuppressLint(value={"InlinedApi"})
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ax.P5.a d = ax.D5.d.a("GoogleAuthUtil");

    public static void a(Context context, String string) throws a, IOException {
        i.h(context, string, 0L);
    }

    public static String b(Context context, Account account, String string) throws IOException, UserRecoverableAuthException, a {
        return i.c(context, account, string, new Bundle());
    }

    public static String c(Context context, Account account, String string, Bundle bundle) throws IOException, UserRecoverableAuthException, a {
        i.q(account);
        return i.e(context, account, string, bundle, 0L, null).k();
    }

    @Deprecated
    public static String d(Context context, String string, String string2) throws IOException, UserRecoverableAuthException, a {
        return i.b(context, new Account(string, "com.google"), string2);
    }

    public static TokenData e(Context context, Account object, String string, Bundle bundle, long l8, Executor object2) throws IOException, a {
        p.k("Calling this from your main thread can lead to deadlock");
        p.g(string, "Scope cannot be empty or null.");
        i.q(object);
        i.m(context, 8400000);
        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
        i.o(context, bundle);
        O.d(context);
        if (k2.d() && i.r(context)) {
            object2 = N1.a(context).a((Account)object, string, bundle);
            try {
                object2 = (Bundle)i.k((j)object2, "token retrieval");
                i.l(object2);
                object2 = i.i(context, "getTokenWithDetails", (Bundle)object2);
                return object2;
            }
            catch (b b8) {
                i.n(b8, "token retrieval");
            }
        }
        object = new f((Account)object, string, bundle, context);
        return (TokenData)i.j(context, c, (h)object, 0L, null);
    }

    static /* synthetic */ TokenData f(Account account, String string, Bundle bundle, Context context, IBinder iBinder) throws RemoteException, IOException, a {
        account = n0.w(iBinder).R(account, string, bundle);
        if (account != null) {
            return i.i(context, "getTokenWithDetails", (Bundle)account);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object g(Object object) {
        i.l(object);
        return object;
    }

    public static void h(Context context, String object, long l8) throws a, IOException {
        p.k("Calling this from your main thread can lead to deadlock");
        i.m(context, 8400000);
        Bundle bundle = new Bundle();
        i.o(context, bundle);
        O.d(context);
        if (k2.d() && i.r(context)) {
            Object object2 = N1.a(context);
            ax.W5.g g8 = new ax.W5.g();
            g8.k((String)object);
            object2 = object2.c(g8);
            try {
                i.k((j)object2, "clear token");
                return;
            }
            catch (b b8) {
                i.n(b8, "clear token");
            }
        }
        object = new g((String)object, bundle);
        i.j(context, c, (h)object, 0L, null);
    }

    private static TokenData i(Context context, String object, Bundle bundle) throws a, IOException {
        object = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        if ((object = bundle.getBundle("tokenDetails")) == null) {
            object = null;
        } else {
            if (classLoader != null) {
                object.setClassLoader(classLoader);
            }
            object = (TokenData)object.getParcelable("TokenData");
        }
        if (object != null) {
            return object;
        }
        i.p(context, "getTokenWithDetails", bundle.getString("Error"), (Intent)bundle.getParcelable("userRecoveryIntent"), (PendingIntent)bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object j(Context object, ComponentName componentName, h object2, long l8, Executor object3) throws IOException, a {
        Throwable throwable2;
        ax.M5.h h8;
        block9: {
            block8: {
                object3 = new ax.J5.b();
                h8 = ax.M5.h.c(object);
                try {
                    boolean bl = h8.a(componentName, (ServiceConnection)object3, "GoogleAuthUtil", null);
                    if (!bl) break block8;
                }
                catch (SecurityException securityException) {
                    Log.w((String)"GoogleAuthUtil", (String)String.format("SecurityException while bind to auth service: %s", securityException.getMessage()));
                    throw new IOException("SecurityException while binding to Auth service.", securityException);
                }
                try {
                    object = object2.a(((ax.J5.b)object3).a());
                    h8.e(componentName, (ServiceConnection)object3, "GoogleAuthUtil");
                    return object;
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (RemoteException remoteException) {
                }
                catch (TimeoutException timeoutException) {
                    // empty catch block
                }
            }
            throw new IOException("Could not bind to service.");
            {
                Log.i((String)"GoogleAuthUtil", (String)"Error on service connection.", (Throwable)object);
                object2 = new IOException("Error on service connection.", (Throwable)object);
                throw object2;
            }
        }
        h8.e(componentName, (ServiceConnection)object3, "GoogleAuthUtil");
        throw throwable2;
    }

    private static Object k(j j8, String string) throws IOException, b {
        try {
            j8 = m.a(j8);
            return j8;
        }
        catch (CancellationException cancellationException) {
            string = String.format("Canceled while waiting for the task of %s to finish.", string);
            d.e(string, new Object[0]);
            throw new IOException(string, cancellationException);
        }
        catch (InterruptedException interruptedException) {
            string = String.format("Interrupted while waiting for the task of %s to finish.", string);
            d.e(string, new Object[0]);
            throw new IOException(string, interruptedException);
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable instanceof b) {
                throw (b)throwable;
            }
            string = String.format("Unable to get a result for %s due to ExecutionException.", string);
            d.e(string, new Object[0]);
            throw new IOException(string, executionException);
        }
    }

    private static Object l(Object object) throws IOException {
        if (object != null) {
            return object;
        }
        d.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void m(Context context, int n8) throws a {
        try {
            ax.J5.m.a(context.getApplicationContext(), n8);
            return;
        }
        catch (ax.J5.j | GooglePlayServicesIncorrectManifestValueException exception) {
            throw new a(exception.getMessage(), exception);
        }
        catch (k k8) {
            throw new c(k8.b(), k8.getMessage(), k8.a());
        }
    }

    private static void n(b b8, String string) {
        d.e("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", string, Log.getStackTraceString((Throwable)b8));
    }

    private static void o(Context object, Bundle bundle) {
        String string = object.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", string);
        object = b;
        if (TextUtils.isEmpty((CharSequence)bundle.getString((String)object))) {
            bundle.putString((String)object, string);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void p(Context object, String string, String string2, Intent intent, PendingIntent pendingIntent) throws a, IOException {
        ax.W5.i i8 = ax.W5.i.d(string2);
        ax.P5.a a8 = d;
        a8.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", new Object[]{i8, string}), new Object[0]);
        if (!(((Object)((Object)ax.W5.i.k0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.u0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.y0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.z0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.p0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.B0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.P0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.H0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.I0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.J0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.K0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.L0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.M0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.O0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.G0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.N0)).equals((Object)i8))) {
            if (!(((Object)((Object)ax.W5.i.g0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.h0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.i0)).equals((Object)i8) || ((Object)((Object)ax.W5.i.h1)).equals((Object)i8) || ((Object)((Object)ax.W5.i.j1)).equals((Object)i8))) {
                throw new a(string2);
            }
            throw new IOException(string2);
        }
        O.d(object);
        if (h2.c()) {
            if (pendingIntent != null && intent != null) {
                throw UserRecoverableAuthException.b(string2, intent, pendingIntent);
            }
            if (ax.J5.h.o().a((Context)object) >= Integer.MAX_VALUE && pendingIntent == null) {
                object = Integer.MAX_VALUE;
                a8.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", object, string, object), new Object[0]);
            }
            if (intent == null) {
                a8.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string2, string), new Object[0]);
            }
            throw new UserRecoverableAuthException(string2, intent);
        }
        throw new UserRecoverableAuthException(string2, intent);
    }

    private static void q(Account account) {
        if (account != null) {
            if (!TextUtils.isEmpty((CharSequence)account.name)) {
                String[] stringArray = a;
                for (int i8 = 0; i8 < 3; ++i8) {
                    if (!stringArray[i8].equals(account.type)) continue;
                    return;
                }
                throw new IllegalArgumentException("Account type not supported");
            }
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        throw new IllegalArgumentException("Account cannot be null");
    }

    private static boolean r(Context object) {
        if (ax.J5.h.o().h((Context)object, 17895000) != 0) {
            return false;
        }
        Object object2 = k2.b().s();
        object = object.getApplicationInfo().packageName;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            if (!((String)object2.next()).equals(object)) continue;
            return false;
        }
        return true;
    }
}

