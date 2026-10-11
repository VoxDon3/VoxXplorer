/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.auth;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.Toast;
import ax.E3.g;
import ax.H3.b;
import ax.I3.c;
import ax.I3.d;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.auth.OAuthWebView;
import com.box.androidsdk.content.auth.a;
import com.box.androidsdk.content.models.BoxError;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public class OAuthActivity
extends Activity
implements a.b,
OAuthWebView.c.f,
OAuthWebView.d {
    private static Dialog n;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    protected OAuthWebView g;
    protected OAuthWebView.c h;
    private boolean i = false;
    private int j = 0;
    private BoxSession k;
    private AtomicBoolean l = new AtomicBoolean(false);
    private BroadcastReceiver m = new BroadcastReceiver(this){
        final OAuthActivity a;
        {
            this.a = oAuthActivity;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && SdkUtils.m(context) && this.a.u()) {
                this.a.y();
            }
        }
    };

    static /* synthetic */ boolean h(OAuthActivity oAuthActivity, boolean bl) {
        oAuthActivity.i = bl;
        return bl;
    }

    private void i() {
        Object object = this.g;
        if (object != null) {
            object.clearCache(true);
            this.g.clearFormData();
            this.g.clearHistory();
        }
        CookieSyncManager.createInstance((Context)this);
        CookieManager.getInstance().removeAllCookie();
        this.deleteDatabase("webview.db");
        this.deleteDatabase("webviewCache.db");
        object = this.getCacheDir();
        SdkUtils.g((File)object);
        ((File)object).mkdir();
    }

    public static Intent j(Context context, BoxSession boxSession, boolean bl) {
        context = OAuthActivity.k(context, boxSession.u(), boxSession.w(), boxSession.A(), bl);
        context.putExtra("session", (Serializable)boxSession);
        if (!SdkUtils.l(boxSession.G())) {
            context.putExtra("restrictToUserId", boxSession.G());
        }
        return context;
    }

    public static Intent k(Context context, String string, String string2, String string3, boolean bl) {
        context = new Intent(context, OAuthActivity.class);
        context.putExtra("client_id", string);
        context.putExtra("client_secret", string2);
        if (!SdkUtils.l(string3)) {
            context.putExtra("redirect_uri", string3);
        }
        context.putExtra("loginviaboxapp", bl);
        return context;
    }

    private OAuthWebView.b q(Exception object) {
        String string = this.getString(ax.I3.d.b);
        Object object2 = string;
        if (object != null) {
            BoxError boxError;
            object2 = object;
            if (object instanceof ExecutionException) {
                object2 = ((ExecutionException)object).getCause();
            }
            if (object2 instanceof BoxException && (boxError = ((BoxException)(object = (BoxException)object2)).b()) != null) {
                if (!(((BoxException)object).e() == 403 || ((BoxException)object).e() == 401 || boxError.D() != null && boxError.D().equals("unauthorized_device"))) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(":");
                    object = ((StringBuilder)object).toString();
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append((Object)this.getResources().getText(ax.I3.d.c));
                    ((StringBuilder)object).append("\n");
                    object = ((StringBuilder)object).toString();
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(boxError.E());
                return new OAuthWebView.b(3, ((StringBuilder)object2).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(object2);
            object2 = ((StringBuilder)object).toString();
        }
        return new OAuthWebView.b(-1, (String)object2);
    }

    @Override
    public void a(String string, String string2) {
        if (this.j == 0) {
            this.g.setVisibility(4);
        }
        this.x(string, string2);
    }

    @Override
    public void b(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (boxAuthenticationInfo != null) {
            BoxAuthentication.o().u(boxAuthenticationInfo, (Context)this);
            this.p(boxAuthenticationInfo);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean c(OAuthWebView.b b8) {
        if (b8.a == 2) {
            if (b8.c.b() == -6) return false;
            if (b8.c.b() == -2) return false;
            if (b8.c.b() == -8) {
                return false;
            }
            Resources resources = this.getResources();
            String string = resources.getString(ax.I3.d.b);
            String string2 = resources.getString(ax.I3.d.n);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b8.c.b());
            stringBuilder.append(" ");
            stringBuilder.append(b8.c.a());
            Toast.makeText((Context)this, (CharSequence)String.format("%s\n%s: %s", string, string2, stringBuilder.toString()), (int)1).show();
        } else if (SdkUtils.l(b8.b)) {
            Toast.makeText((Context)this, (int)ax.I3.d.b, (int)1).show();
        } else {
            int n8 = b8.a;
            if (n8 != 1) {
                if (n8 == 3) {
                    new AlertDialog.Builder((Context)this).setTitle(ax.I3.d.b).setMessage(ax.I3.d.c).setPositiveButton(ax.I3.d.m, new DialogInterface.OnClickListener(this){
                        final OAuthActivity a;
                        {
                            this.a = oAuthActivity;
                        }

                        public void onClick(DialogInterface dialogInterface, int n8) {
                            dialogInterface.dismiss();
                            this.a.finish();
                        }
                    }).create().show();
                    return true;
                }
                Toast.makeText((Context)this, (int)ax.I3.d.b, (int)1).show();
            } else {
                b8 = this.getResources();
                Toast.makeText((Context)this, (CharSequence)String.format("%s\n%s: %s", b8.getString(ax.I3.d.b), b8.getString(ax.I3.d.n), b8.getString(ax.I3.d.d)), (int)1).show();
            }
        }
        this.finish();
        return true;
    }

    @Override
    public void d(WebView webView, String string) {
        this.n();
    }

    @Override
    public void e(String string) {
        this.a(string, null);
    }

    @Override
    public void f() {
        if (this.getFragmentManager().findFragmentByTag("choose_auth") != null) {
            this.getFragmentManager().popBackStack();
        }
    }

    public void finish() {
        this.i();
        if (!this.i) {
            BoxAuthentication.o().v(null, null);
        }
        super.finish();
    }

    protected OAuthWebView l() {
        OAuthWebView oAuthWebView = (OAuthWebView)this.findViewById(this.t());
        oAuthWebView.setVisibility(0);
        oAuthWebView.getSettings().setJavaScriptEnabled(true);
        oAuthWebView.getSettings().setDomStorageEnabled(true);
        oAuthWebView.getSettings().setSaveFormData(false);
        oAuthWebView.getSettings().setSavePassword(false);
        return oAuthWebView;
    }

    protected OAuthWebView.c m() {
        return new OAuthWebView.c(this, this.e);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void n() {
        synchronized (this) {
            block8: {
                Throwable throwable2;
                block7: {
                    block6: {
                        try {
                            boolean bl;
                            Dialog dialog = n;
                            if (dialog == null || !(bl = dialog.isShowing())) break block6;
                            n.dismiss();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if (n != null) {
                        n = null;
                    }
                    break block8;
                }
                throw throwable2;
                catch (IllegalArgumentException illegalArgumentException) {}
                n = null;
            }
            return;
        }
    }

    protected void o(Exception exception) {
        this.runOnUiThread(new Runnable(){
            final OAuthActivity c0;
            final OAuthWebView.b q;
            {
                this.c0 = oAuthActivity;
                this.q = b8;
            }

            @Override
            public void run() {
                this.c0.n();
                this.c0.c(this.q);
                this.c0.setResult(0);
            }
        });
    }

    protected void onActivityResult(int n8, int n9, Intent object) {
        if (-1 == n9 && 1 == n8) {
            String string = object.getStringExtra("userId");
            if (SdkUtils.k((String)(object = object.getStringExtra("authcode"))) && !SdkUtils.k(string)) {
                object = BoxAuthentication.o().r((Context)this).get(string);
                if (object != null) {
                    this.b((BoxAuthentication.BoxAuthenticationInfo)object);
                    return;
                }
                this.c(new OAuthWebView.b(0, ""));
                return;
            }
            if (!SdkUtils.k((String)object)) {
                this.x((String)object, null);
                return;
            }
        } else if (n9 == 0) {
            this.finish();
        }
    }

    public void onBackPressed() {
        if (this.getFragmentManager().findFragmentByTag("choose_auth") != null) {
            this.finish();
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Intent intent = this.getIntent();
        if (ax.E3.g.k) {
            this.getWindow().addFlags(8192);
        }
        this.setContentView(this.s());
        this.registerReceiver(this.m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.a = intent.getStringExtra("client_id");
        this.b = intent.getStringExtra("client_secret");
        this.c = intent.getStringExtra("box_device_id");
        this.d = intent.getStringExtra("box_device_name");
        this.e = intent.getStringExtra("redirect_uri");
        this.j = intent.getBooleanExtra("loginviaboxapp", false) ? 1 : 0;
        this.l.getAndSet(false);
        this.k = (BoxSession)intent.getSerializableExtra("session");
        if (object != null) {
            this.f = object.getBoolean("loggingInViaBoxApp");
        }
        if ((object = this.k) != null) {
            ((BoxSession)object).M(this.getApplicationContext());
            return;
        }
        this.k = object = new BoxSession((Context)this, null, this.a, this.b, this.e);
        ((BoxSession)object).P(this.c);
        this.k.Q(this.d);
    }

    public void onDestroy() {
        this.unregisterReceiver(this.m);
        this.l.set(false);
        this.n();
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        if (this.u()) {
            this.y();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("loggingInViaBoxApp", this.f);
        super.onSaveInstanceState(bundle);
    }

    protected void p(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        this.runOnUiThread(new Runnable(){
            final OAuthActivity c0;
            final BoxAuthentication.BoxAuthenticationInfo q;
            {
                this.c0 = oAuthActivity;
                this.q = boxAuthenticationInfo;
            }

            @Override
            public void run() {
                this.c0.n();
                Intent intent = new Intent();
                intent.putExtra("authinfo", (Serializable)this.q);
                this.c0.setResult(-1, intent);
                OAuthActivity.h(this.c0, true);
                this.c0.finish();
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Intent r() {
        Intent intent = new Intent("com.box.android.action.AUTHENTICATE_VIA_BOX_APP");
        Object object = this.getPackageManager().queryIntentActivities(intent, 65600);
        if (object == null) return null;
        if (object.size() < 1) {
            return null;
        }
        String string = this.getResources().getString(ax.I3.d.l);
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (ResolveInfo)object.next();
            try {
                if (!string.equals(this.getPackageManager().getPackageInfo((String)((ResolveInfo)object2).activityInfo.packageName, (int)64).signatures[0].toCharsString())) continue;
                intent.setPackage(((ResolveInfo)object2).activityInfo.packageName);
                Object object3 = BoxAuthentication.o().r((Context)this);
                if (object3 == null) return intent;
                if (object3.size() <= 0) return intent;
                object2 = new ArrayList(object3.size());
                object3 = object3.entrySet().iterator();
                while (true) {
                    if (!object3.hasNext()) {
                        if (((ArrayList)object2).size() <= 0) return intent;
                        intent.putStringArrayListExtra("boxusers", (ArrayList)object2);
                        return intent;
                    }
                    Map.Entry entry = (Map.Entry)object3.next();
                    if (((BoxAuthentication.BoxAuthenticationInfo)entry.getValue()).K() == null) continue;
                    ((ArrayList)object2).add(((BoxAuthentication.BoxAuthenticationInfo)entry.getValue()).K().A());
                }
            }
            catch (Exception exception) {
            }
        }
        return null;
    }

    protected int s() {
        return ax.I3.c.b;
    }

    protected int t() {
        return ax.I3.b.m;
    }

    boolean u() {
        if (this.f) {
            return false;
        }
        OAuthWebView oAuthWebView = this.g;
        return oAuthWebView == null || oAuthWebView.getUrl() == null || !this.g.getUrl().startsWith("http");
        {
        }
    }

    protected Dialog v() {
        return ProgressDialog.show((Context)this, (CharSequence)this.getText(ax.I3.d.a), (CharSequence)this.getText(ax.I3.d.f));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void w() {
        synchronized (this) {
            block7: {
                try {
                    var2_1 = OAuthActivity.n;
                    if (var2_1 == null) ** GOTO lbl-1000
                    var1_4 = var2_1.isShowing();
                    if (var1_4) {
                    }
                    ** GOTO lbl16
                }
                catch (Exception var2_3) {
                    OAuthActivity.n = null;
                    return;
                }
                return;
                catch (Throwable var2_2) {
                    break block7;
                }
lbl-1000:
                // 1 sources

                {
                    OAuthActivity.n = this.v();
lbl16:
                    // 2 sources

                    return;
                }
            }
            throw var2_2;
        }
    }

    protected void x(String string, String string2) {
        if (this.l.getAndSet(true)) {
            return;
        }
        this.w();
        if (string2 != null) {
            this.k.r().O(string2);
            ax.H3.b.f("setting Base Domain", string2, new RuntimeException("base domain being used"));
        }
        new Thread(this, string){
            final OAuthActivity c0;
            final String q;
            {
                this.c0 = oAuthActivity;
                this.q = string;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void run() {
                Exception exception2;
                block3: {
                    BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo;
                    try {
                        boxAuthenticationInfo = BoxAuthentication.o().h(this.c0.k, this.q).get();
                        String string = this.c0.getIntent().getStringExtra("restrictToUserId");
                        if (!SdkUtils.l(string) && !boxAuthenticationInfo.K().G().equals(string)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected user logged in. Expected ");
                            stringBuilder.append(string);
                            stringBuilder.append(" received ");
                            stringBuilder.append(boxAuthenticationInfo.K().G());
                            RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
                            throw runtimeException;
                        }
                    }
                    catch (Exception exception2) {
                        break block3;
                    }
                    this.c0.p(boxAuthenticationInfo);
                    return;
                }
                exception2.printStackTrace();
                this.c0.o(exception2);
            }
        }.start();
    }

    protected void y() {
        int n8;
        Object object;
        if (this.j != 1 && !this.getIntent().getBooleanExtra("disableAccountChoosing", false) && this.getFragmentManager().findFragmentByTag("choose_auth") == null) {
            object = BoxAuthentication.o().r((Context)this);
            if (SdkUtils.l(this.getIntent().getStringExtra("restrictToUserId")) && object != null && object.size() > 0) {
                object = this.getFragmentManager().beginTransaction();
                object.replace(ax.I3.b.l, (Fragment)com.box.androidsdk.content.auth.a.a((Context)this), "choose_auth");
                object.addToBackStack("choose_auth");
                object.commit();
            }
        }
        if ((n8 = this.j) != 0) {
            if (n8 != 1) {
                return;
            }
            object = this.r();
            if (object != null) {
                object.putExtra("client_id", this.a);
                object.putExtra("redirect_uri", this.e);
                if (!SdkUtils.l(this.getIntent().getStringExtra("restrictToUserId"))) {
                    object.putExtra("restrictToUserId", this.getIntent().getStringExtra("restrictToUserId"));
                }
                this.f = true;
                this.startActivityForResult((Intent)object, 1);
                return;
            }
        }
        this.w();
        this.g = this.l();
        object = this.m();
        this.h = object;
        ((OAuthWebView.c)((Object)object)).h(this);
        this.g.setWebViewClient(this.h);
        if (this.k.s() != null) {
            this.g.setBoxAccountEmail(this.k.s());
        }
        this.g.b(this.a, this.e);
    }
}

