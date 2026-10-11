package com.dropbox.core.android;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import ax.Gb.g;
import ax.Gb.l;
import ax.p4.C2774k;
import ax.p4.m;
import ax.p4.n;
import ax.p4.q;
import ax.p4.z;
import ax.r4.C2950a;
import ax.r4.C2951b;
import ax.r4.C2952c;
import ax.r4.C2953d;
import ax.r4.C2954e;
import ax.tb.C3133i;
import ax.tb.C3139o;
import com.dropbox.core.android.AuthActivity;
import com.dropbox.core.android.b;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class AuthActivity extends Activity {
    public static final b c = new b(null);
    private static final String d = AuthActivity.class.getName();
    private static c e = new a();
    private static final Object f = new Object();
    public static Intent g;
    private static C2950a h;
    private boolean a;
    private Boolean b;

    public static final class a implements c {
        a() {
        }

        @Override // com.dropbox.core.android.AuthActivity.c
        public SecureRandom a() {
            return new SecureRandom();
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c e() {
            c cVar;
            synchronized (AuthActivity.f) {
                cVar = AuthActivity.e;
            }
            return cVar;
        }

        public final boolean c(Context context, String str, boolean z) {
            l.f(context, "context");
            l.f(str, "appKey");
            Intent intent = new Intent("android.intent.action.VIEW");
            String str2 = "db-" + str;
            intent.setData(Uri.parse(str2 + "://1/connect"));
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            l.e(queryIntentActivities, "queryIntentActivities(...)");
            if (queryIntentActivities.size() == 0) {
                throw new IllegalStateException(("URI scheme in your app's manifest is not set up correctly. You should have a " + AuthActivity.class.getName() + " with the scheme: " + str2).toString());
            }
            if (queryIntentActivities.size() <= 1) {
                ResolveInfo resolveInfo = queryIntentActivities.get(0);
                if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null && l.a(context.getPackageName(), resolveInfo.activityInfo.packageName)) {
                    return true;
                }
                throw new IllegalStateException(("There must be a " + AuthActivity.class.getName() + " within your app's package registered for your URI scheme (" + str2 + "). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.").toString());
            }
            if (z) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Security alert");
                builder.setMessage("Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: ax.q4.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AuthActivity.b.d(dialogInterface, i);
                    }
                });
                builder.show();
            } else {
                Log.w(AuthActivity.d, "There are multiple apps registered for the AuthActivity URI scheme (" + str2 + ").  Another app may be trying to  impersonate this app, so authentication will be disabled.");
            }
            return false;
        }

        public final Intent f(Context context, String str, String str2, String[] strArr, String str3, String str4, String str5, z zVar, m mVar, C2774k c2774k, String str6, q qVar) {
            if (str == null) {
                throw new IllegalArgumentException("'appKey' can't be null");
            }
            g(str, str2, strArr, str3, str4, str5, zVar, mVar, c2774k, str6, qVar);
            return new Intent(context, (Class<?>) AuthActivity.class);
        }

        public final void g(String str, String str2, String[] strArr, String str3, String str4, String str5, z zVar, m mVar, C2774k c2774k, String str6, q qVar) {
            List j;
            C2774k c2774k2;
            if (strArr == null || (j = C3133i.E(strArr)) == null) {
                j = C3139o.j();
            }
            List list = j;
            if (c2774k != null) {
                c2774k2 = c2774k;
            } else if (str4 != null) {
                C2774k c2774k3 = C2774k.e;
                c2774k2 = new C2774k(c2774k3.h(), c2774k3.i(), str4, c2774k3.j());
            } else {
                c2774k2 = C2774k.e;
            }
            AuthActivity.h = new C2950a(str, str5, str2, list, str3, zVar, mVar, c2774k2, str6, qVar);
        }

        private b() {
        }
    }

    public interface c {
        SecureRandom a();
    }

    private final void f(Intent intent) {
        g = intent;
        C2951b.a.a();
        finish();
    }

    private final C2951b.C0436b g() {
        return C2951b.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AuthActivity authActivity, Intent intent, String str) {
        Log.d(d, "running startActivity in handler");
        try {
            b.a aVar = com.dropbox.core.android.b.a;
            Context applicationContext = authActivity.getApplicationContext();
            l.e(applicationContext, "getApplicationContext(...)");
            if (aVar.a(applicationContext, intent) != null) {
                authActivity.startActivity(intent);
            } else {
                authActivity.j(str);
            }
            authActivity.g().m(str);
        } catch (ActivityNotFoundException e2) {
            Log.e(d, "Could not launch intent. User may have restricted profile", e2);
            authActivity.finish();
        }
    }

    private final void j(String str) {
        Locale locale = Locale.getDefault();
        Locale locale2 = new Locale(locale.getLanguage(), locale.getCountry());
        List n = C3139o.n("k", g().c(), "n", !g().a().isEmpty() ? g().a().get(0) : "0", "api", g().b(), "state", str);
        if (g().l() != null) {
            n.add("extra_query_params");
            C2954e c2954e = C2954e.a;
            z l = g().l();
            String j = g().j();
            q g2 = g().g();
            String c2 = g().h().c();
            l.e(c2, "getCodeChallenge(...)");
            n.add(c2954e.a(l, j, g2, c2));
        }
        String locale3 = locale2.toString();
        C2774k f2 = g().f();
        l.c(f2);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(n.g(locale3, f2.k(), "1/connect", (String[]) n.toArray(new String[0]))));
        if (h(this)) {
            intent.setComponent(new ComponentName(getPackageName(), "com.voxdon.xplorer.activity.WebViewActivity"));
        }
        startActivity(intent);
    }

    public final boolean h(Context context) {
        l.f(context, "context");
        if (this.b == null) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                this.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.software.leanback"));
            } else {
                this.b = Boolean.TRUE;
            }
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        C2951b.a aVar = C2951b.a;
        if (!aVar.c()) {
            aVar.d(C2951b.C0436b.n.a(h));
        }
        setTheme(R.style.Theme.Translucent.NoTitleBar);
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onNewIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.core.android.AuthActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 29) {
            onTopResumedActivityChanged(true);
        }
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z) {
        final String b2;
        if (isFinishing() || !z) {
            return;
        }
        if (g().d() != null || g().c() == null) {
            f(null);
            return;
        }
        g = null;
        if (this.a) {
            Log.w(d, "onResume called again before Handler run");
            return;
        }
        if (g().l() != null) {
            String c2 = g().h().c();
            l.e(c2, "getCodeChallenge(...)");
            b2 = C2952c.a(c2, String.valueOf(g().l()), g().j(), g().g());
        } else {
            b2 = C2952c.b(c.e());
        }
        final Intent b3 = C2953d.a.b(g(), b2, this);
        runOnUiThread(new Runnable() { // from class: ax.q4.a
            @Override // java.lang.Runnable
            public final void run() {
                AuthActivity.i(AuthActivity.this, b3, b2);
            }
        });
        this.a = true;
    }
}
