/*
 * Decompiled with CFR 0.152.
 */
package com.dropbox.core.android;

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
import ax.p4.h;
import ax.p4.k;
import ax.p4.m;
import ax.p4.n;
import ax.p4.q;
import ax.p4.z;
import ax.q4.a;
import ax.r4.b;
import ax.r4.d;
import ax.r4.e;
import ax.r4.f;
import ax.sb.t;
import ax.tb.i;
import ax.tb.o;
import com.dropbox.core.android.b;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class AuthActivity
extends Activity {
    public static final b c = new b(null);
    private static final String d = AuthActivity.class.getName();
    private static c e = new c(){

        @Override
        public SecureRandom a() {
            return new SecureRandom();
        }
    };
    private static final Object f = new Object();
    public static Intent g;
    private static ax.r4.a h;
    private boolean a;
    private Boolean b;

    public static /* synthetic */ void a(AuthActivity authActivity, Intent intent, String string) {
        AuthActivity.i(authActivity, intent, string);
    }

    private final void f(Intent intent) {
        g = intent;
        ax.r4.b.a.a();
        this.finish();
    }

    private final b.b g() {
        return ax.r4.b.a.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void i(AuthActivity authActivity, Intent intent, String string) {
        ActivityNotFoundException activityNotFoundException2;
        block4: {
            block3: {
                block2: {
                    Log.d((String)d, (String)"running startActivity in handler");
                    try {
                        b.a a8 = com.dropbox.core.android.b.a;
                        Context context = authActivity.getApplicationContext();
                        l.e(context, "getApplicationContext(...)");
                        if (a8.a(context, intent) == null) break block2;
                        authActivity.startActivity(intent);
                        break block3;
                    }
                    catch (ActivityNotFoundException activityNotFoundException2) {
                        break block4;
                    }
                }
                authActivity.j(string);
            }
            authActivity.g().m(string);
            return;
        }
        Log.e((String)d, (String)"Could not launch intent. User may have restricted profile", (Throwable)activityNotFoundException2);
        authActivity.finish();
    }

    private final void j(String object) {
        Object object2 = Locale.getDefault();
        Object object3 = new Locale(((Locale)object2).getLanguage(), ((Locale)object2).getCountry());
        object2 = !((Collection)this.g().a()).isEmpty() ? this.g().a().get(0) : "0";
        object = o.n("k", this.g().c(), "n", object2, "api", this.g().b(), "state", object);
        if (this.g().l() != null) {
            object.add("extra_query_params");
            e e8 = ax.r4.e.a;
            z z8 = this.g().l();
            String string = this.g().j();
            q q8 = this.g().g();
            object2 = this.g().h().c();
            l.e(object2, "getCodeChallenge(...)");
            object.add(e8.a(z8, string, q8, (String)object2));
        }
        object3 = ((Locale)object3).toString();
        object2 = this.g().f();
        l.c(object2);
        object = new Intent("android.intent.action.VIEW", Uri.parse((String)n.g((String)object3, ((k)object2).k(), "1/connect", ((Collection)object).toArray(new String[0]))));
        if (this.h((Context)this)) {
            object.setComponent(new ComponentName(this.getPackageName(), "com.alphainventor.filemanager.activity.WebViewActivity"));
        }
        this.startActivity((Intent)object);
    }

    public final boolean h(Context object) {
        l.f(object, "context");
        if (this.b == null) {
            Object object2 = object.getSystemService("uimode");
            object2 = object2 instanceof UiModeManager ? (UiModeManager)object2 : null;
            this.b = object2 != null && object2.getCurrentModeType() == 4 ? Boolean.TRUE : Boolean.valueOf(object.getPackageManager().hasSystemFeature("android.software.leanback"));
        }
        if ((object = this.b) != null) {
            return (Boolean)object;
        }
        return false;
    }

    protected void onCreate(Bundle bundle) {
        b.a a8 = ax.r4.b.a;
        if (!a8.c()) {
            a8.d(b.b.n.a(h));
        }
        this.setTheme(0x1030010);
        super.onCreate(bundle);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onNewIntent(Intent var1_1) {
        block30: {
            block29: {
                block25: {
                    block28: {
                        block27: {
                            l.f(var1_1, "intent");
                            var2_7 = this.g().d();
                            var6_8 = null;
                            if (var2_7 == null) {
                                this.f(null);
                                return;
                            }
                            if (!var1_1.hasExtra("ACCESS_TOKEN")) break block27;
                            var2_7 = var1_1.getStringExtra("ACCESS_TOKEN");
                            var4_9 /* !! */  = var1_1.getStringExtra("ACCESS_SECRET");
                            var5_11 = var1_1.getStringExtra("UID");
                            var3_12 = var1_1.getStringExtra("AUTH_STATE");
                            var1_1 = var5_11;
                            break block28;
                        }
                        var4_9 /* !! */  = var1_1.getData();
                        if (var4_9 /* !! */  == null || !l.a("/connect", var4_9 /* !! */ .getPath())) break block29;
                        var2_7 = var4_9 /* !! */ .getQueryParameter("oauth_token");
                        try {
                            var3_12 = var4_9 /* !! */ .getQueryParameter("oauth_token_secret");
                        }
                        catch (UnsupportedOperationException var1_3) {}
                        try {
                            var1_1 = var4_9 /* !! */ .getQueryParameter("uid");
                        }
                        catch (UnsupportedOperationException var1_2) {
                            var1_1 = null;
                            break block25;
                        }
                        try {
                            var5_11 = var4_9 /* !! */ .getQueryParameter("state");
                            var4_9 /* !! */  = var3_12;
                            var3_12 = var5_11;
                        }
                        catch (UnsupportedOperationException var4_10) {}
                    }
                    var5_11 = var4_9 /* !! */ ;
                    var4_9 /* !! */  = var1_1;
                    var1_1 = var5_11;
                    break block30;
                    break block25;
                    ** GOTO lbl-1000
                    catch (UnsupportedOperationException var1_4) {
                        var2_7 = null;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var3_12 = null;
                        var1_1 = null;
                    }
                }
                var5_11 = null;
                var4_9 /* !! */  = var1_1;
                var1_1 = var3_12;
                var3_12 = var5_11;
                break block30;
            }
            var3_12 = null;
            var2_7 = null;
            var4_9 /* !! */  = var2_7;
            var1_1 = var4_9 /* !! */ ;
        }
        var5_11 = var6_8;
        if (var2_7 != null) {
            var5_11 = var6_8;
            if (!l.a(var2_7, "")) {
                var5_11 = var6_8;
                if (var1_1 != null) {
                    var5_11 = var6_8;
                    if (!l.a(var1_1, "")) {
                        var5_11 = var6_8;
                        if (var4_9 /* !! */  != null) {
                            var5_11 = var6_8;
                            if (!l.a(var4_9 /* !! */ , "")) {
                                var5_11 = var6_8;
                                if (var3_12 != null) {
                                    var5_11 = var6_8;
                                    if (!l.a(var3_12, "")) {
                                        if (!l.a(this.g().d(), var3_12)) {
                                            this.f(null);
                                            return;
                                        }
                                        if (l.a(var2_7, ax.r4.g.c0.toString())) {
                                            var5_11 = new Intent();
                                            var5_11.putExtra("ACCESS_TOKEN", (String)var2_7);
                                            var5_11.putExtra("ACCESS_SECRET", (String)var1_1);
                                            l.c(var5_11.putExtra("UID", (String)var4_9 /* !! */ ));
                                        } else {
                                            var5_11 = var6_8;
                                            if (l.a(var2_7, ax.r4.g.d0.toString())) {
                                                var2_7 = this.g().h();
                                                var5_11 = this.g().i();
                                                l.c(var5_11);
                                                var3_12 = this.g().c();
                                                l.c(var3_12);
                                                var4_9 /* !! */  = this.g().f();
                                                l.c(var4_9 /* !! */ );
                                                var1_1 = new f((String)var1_1, (ax.p4.l)var2_7, (m)var5_11, var3_12, (k)var4_9 /* !! */ );
                                                try {
                                                    var2_7 = (h)var1_1.execute((Object[])new Void[0]).get();
                                                    if (var2_7 == null) {
                                                        var1_1 = t.a;
                                                        var5_11 = var6_8;
                                                    } else {
                                                        var5_11 = new Intent();
                                                        var5_11.putExtra("ACCESS_TOKEN", var2_7.a());
                                                        var5_11.putExtra("ACCESS_SECRET", var2_7.a());
                                                        var5_11.putExtra("REFRESH_TOKEN", var2_7.c());
                                                        var1_1 = var2_7.b();
                                                        l.e(var1_1, "getExpiresAt(...)");
                                                        var5_11.putExtra("EXPIRES_AT", var1_1.longValue());
                                                        var5_11.putExtra("UID", var2_7.e());
                                                        var5_11.putExtra("CONSUMER_KEY", this.g().c());
                                                        l.c(var5_11.putExtra("SCOPE", var2_7.d()));
                                                    }
                                                }
                                                catch (Exception var1_5) {
                                                    var1_6 = t.a;
                                                    var5_11 = var6_8;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f((Intent)var5_11);
    }

    protected void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 29) {
            this.onTopResumedActivityChanged(true);
        }
    }

    public void onTopResumedActivityChanged(boolean bl) {
        if (!this.isFinishing() && bl) {
            if (this.g().d() == null && this.g().c() != null) {
                String string;
                g = null;
                if (this.a) {
                    Log.w((String)d, (String)"onResume called again before Handler run");
                    return;
                }
                if (this.g().l() != null) {
                    string = this.g().h().c();
                    l.e(string, "getCodeChallenge(...)");
                    string = ax.r4.c.a(string, String.valueOf((Object)this.g().l()), this.g().j(), this.g().g());
                } else {
                    string = ax.r4.c.b(AuthActivity.c.e());
                }
                this.runOnUiThread(new a(this, ax.r4.d.a.b(this.g(), string, this), string));
                this.a = true;
                return;
            }
            this.f(null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public static /* synthetic */ void a(DialogInterface dialogInterface, int n8) {
            com.dropbox.core.android.AuthActivity$b.d(dialogInterface, n8);
        }

        private static final void d(DialogInterface dialogInterface, int n8) {
            dialogInterface.dismiss();
        }

        private final c e() {
            Object object = f;
            synchronized (object) {
                c c8 = e;
                return c8;
            }
        }

        public final boolean c(Context object, String object2, boolean bl) {
            l.f(object, "context");
            l.f(object2, "appKey");
            Intent intent = new Intent("android.intent.action.VIEW");
            CharSequence charSequence = new StringBuilder();
            charSequence.append("db-");
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append("://1/connect");
            intent.setData(Uri.parse((String)((StringBuilder)object2).toString()));
            object2 = object.getPackageManager().queryIntentActivities(intent, 0);
            l.e(object2, "queryIntentActivities(...)");
            if (object2.size() != 0) {
                if (object2.size() > 1) {
                    if (bl) {
                        object = new AlertDialog.Builder((Context)object);
                        object.setTitle((CharSequence)"Security alert");
                        object.setMessage((CharSequence)"Another app on your phone may be trying to pose as the app you are currently using. The malicious app can't access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com.");
                        object.setPositiveButton((CharSequence)"OK", (DialogInterface.OnClickListener)new ax.q4.b());
                        object.show();
                    } else {
                        object2 = d;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("There are multiple apps registered for the AuthActivity URI scheme (");
                        ((StringBuilder)object).append((String)charSequence);
                        ((StringBuilder)object).append(").  Another app may be trying to  impersonate this app, so authentication will be disabled.");
                        Log.w((String)object2, (String)((StringBuilder)object).toString());
                    }
                    return false;
                }
                intent = (ResolveInfo)object2.get(0);
                if ((object2 = intent != null ? intent.activityInfo : null) != null && l.a(object.getPackageName(), intent.activityInfo.packageName)) {
                    return true;
                }
                object2 = AuthActivity.class.getName();
                object = new StringBuilder();
                ((StringBuilder)object).append("There must be a ");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" within your app's package registered for your URI scheme (");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append("). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it.");
                throw new IllegalStateException(((StringBuilder)object).toString().toString());
            }
            object2 = AuthActivity.class.getName();
            object = new StringBuilder();
            ((StringBuilder)object).append("URI scheme in your app's manifest is not set up correctly. You should have a ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" with the scheme: ");
            ((StringBuilder)object).append((String)charSequence);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }

        public final Intent f(Context context, String string, String string2, String[] stringArray, String string3, String string4, String string5, z z8, m m8, k k8, String string6, q q8) {
            if (string != null) {
                this.g(string, string2, stringArray, string3, string4, string5, z8, m8, k8, string6, q8);
                return new Intent(context, AuthActivity.class);
            }
            throw new IllegalArgumentException("'appKey' can't be null");
        }

        public final void g(String string, String string2, String[] object, String string3, String string4, String string5, z z8, m m8, k k8, String string6, q q8) {
            Object object2;
            block8: {
                block7: {
                    if (object == null) break block7;
                    object = i.E(object);
                    object2 = object;
                    if (object != null) break block8;
                }
                object2 = o.j();
            }
            if (k8 == null) {
                if (string4 != null) {
                    object = k.e;
                    object = new k(((k)object).h(), ((k)object).i(), string4, ((k)object).j());
                } else {
                    object = k.e;
                }
            } else {
                object = k8;
            }
            h = new ax.r4.a(string, string5, string2, (List<String>)object2, string3, z8, m8, (k)object, string6, q8);
        }
    }

    public static interface c {
        public SecureRandom a();
    }
}

