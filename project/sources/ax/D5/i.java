package ax.D5;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import ax.J5.C0747h;
import ax.J5.C0749j;
import ax.J5.C0750k;
import ax.J5.C0752m;
import ax.J5.ServiceConnectionC0741b;
import ax.M5.AbstractC0813h;
import ax.M5.C0821p;
import ax.W5.AbstractBinderC1052n0;
import ax.W5.C1030g;
import ax.W5.EnumC1036i;
import ax.W5.InterfaceC1050m1;
import ax.W5.N1;
import ax.W5.O;
import ax.W5.h2;
import ax.W5.k2;
import ax.j6.AbstractC2327j;
import ax.j6.m;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class i {
    public static final String[] a = {"com.google", "com.google.work", "cn.google"};

    @SuppressLint({"InlinedApi"})
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ax.P5.a d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws a, IOException {
        h(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, a {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, a {
        q(account);
        return e(context, account, str, bundle, 0L, null).k();
    }

    @Deprecated
    public static String d(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, a {
        return b(context, new Account(str, "com.google"), str2);
    }

    public static TokenData e(final Context context, final Account account, final String str, Bundle bundle, long j, Executor executor) throws IOException, a {
        C0821p.k("Calling this from your main thread can lead to deadlock");
        C0821p.g(str, "Scope cannot be empty or null.");
        q(account);
        m(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        o(context, bundle2);
        O.d(context);
        if (k2.d() && r(context)) {
            try {
                Bundle bundle3 = (Bundle) k(N1.a(context).a(account, str, bundle2), "token retrieval");
                l(bundle3);
                return i(context, "getTokenWithDetails", bundle3);
            } catch (ax.K5.b e) {
                n(e, "token retrieval");
            }
        }
        return (TokenData) j(context, c, new h() { // from class: ax.D5.f
            @Override // ax.D5.h
            public final Object a(IBinder iBinder) {
                return i.f(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData f(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws RemoteException, IOException, a {
        Bundle R = AbstractBinderC1052n0.w(iBinder).R(account, str, bundle);
        if (R != null) {
            return i(context, "getTokenWithDetails", R);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object g(Object obj) {
        l(obj);
        return obj;
    }

    public static void h(Context context, String str, long j) throws a, IOException {
        C0821p.k("Calling this from your main thread can lead to deadlock");
        m(context, 8400000);
        Bundle bundle = new Bundle();
        o(context, bundle);
        O.d(context);
        if (k2.d() && r(context)) {
            InterfaceC1050m1 a2 = N1.a(context);
            C1030g c1030g = new C1030g();
            c1030g.k(str);
            try {
                k(a2.c(c1030g), "clear token");
                return;
            } catch (ax.K5.b e) {
                n(e, "clear token");
            }
        }
        j(context, c, new g(str, bundle), 0L, null);
    }

    private static TokenData i(Context context, String str, Bundle bundle) throws a, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        p(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    private static Object j(Context context, ComponentName componentName, h hVar, long j, Executor executor) throws IOException, a {
        ServiceConnectionC0741b serviceConnectionC0741b = new ServiceConnectionC0741b();
        AbstractC0813h c2 = AbstractC0813h.c(context);
        try {
            try {
                if (!c2.a(componentName, serviceConnectionC0741b, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return hVar.a(serviceConnectionC0741b.a());
                } catch (RemoteException | InterruptedException | TimeoutException e) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                }
            } finally {
                c2.e(componentName, serviceConnectionC0741b, "GoogleAuthUtil");
            }
        } catch (SecurityException e2) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    private static Object k(AbstractC2327j abstractC2327j, String str) throws IOException, ax.K5.b {
        try {
            return m.a(abstractC2327j);
        } catch (InterruptedException e) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            d.e(format, new Object[0]);
            throw new IOException(format, e);
        } catch (CancellationException e2) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            d.e(format2, new Object[0]);
            throw new IOException(format2, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof ax.K5.b) {
                throw ((ax.K5.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            d.e(format3, new Object[0]);
            throw new IOException(format3, e3);
        }
    }

    private static Object l(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        d.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void m(Context context, int i) throws a {
        try {
            C0752m.a(context.getApplicationContext(), i);
        } catch (C0749j | GooglePlayServicesIncorrectManifestValueException e) {
            throw new a(e.getMessage(), e);
        } catch (C0750k e2) {
            throw new c(e2.b(), e2.getMessage(), e2.a());
        }
    }

    private static void n(ax.K5.b bVar, String str) {
        d.e("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void o(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void p(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws a, IOException {
        EnumC1036i d2 = EnumC1036i.d(str2);
        ax.P5.a aVar = d;
        aVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", d2, str), new Object[0]);
        if (!EnumC1036i.BAD_AUTHENTICATION.equals(d2) && !EnumC1036i.CAPTCHA.equals(d2) && !EnumC1036i.NEED_PERMISSION.equals(d2) && !EnumC1036i.NEED_REMOTE_CONSENT.equals(d2) && !EnumC1036i.NEEDS_BROWSER.equals(d2) && !EnumC1036i.USER_CANCEL.equals(d2) && !EnumC1036i.DEVICE_MANAGEMENT_REQUIRED.equals(d2) && !EnumC1036i.DM_INTERNAL_ERROR.equals(d2) && !EnumC1036i.DM_SYNC_DISABLED.equals(d2) && !EnumC1036i.DM_ADMIN_BLOCKED.equals(d2) && !EnumC1036i.DM_ADMIN_PENDING_APPROVAL.equals(d2) && !EnumC1036i.DM_STALE_SYNC_REQUIRED.equals(d2) && !EnumC1036i.DM_DEACTIVATED.equals(d2) && !EnumC1036i.DM_REQUIRED.equals(d2) && !EnumC1036i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(d2) && !EnumC1036i.DM_SCREENLOCK_REQUIRED.equals(d2)) {
            if (!EnumC1036i.NETWORK_ERROR.equals(d2) && !EnumC1036i.SERVICE_UNAVAILABLE.equals(d2) && !EnumC1036i.INTNERNAL_ERROR.equals(d2) && !EnumC1036i.AUTH_SECURITY_ERROR.equals(d2) && !EnumC1036i.ACCOUNT_NOT_PRESENT.equals(d2)) {
                throw new a(str2);
            }
            throw new IOException(str2);
        }
        O.d(context);
        if (!h2.c()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (C0747h.o().a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer valueOf = Integer.valueOf(SubsamplingScaleImageView.TILE_SIZE_AUTO);
            aVar.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", valueOf, str, valueOf), new Object[0]);
        }
        if (intent == null) {
            aVar.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void q(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean r(Context context) {
        if (C0747h.o().h(context, 17895000) != 0) {
            return false;
        }
        List s = k2.b().s();
        String str = context.getApplicationInfo().packageName;
        Iterator it = s.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
