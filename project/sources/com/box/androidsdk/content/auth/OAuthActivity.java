package com.box.androidsdk.content.auth;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentTransaction;
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
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.auth.OAuthWebView;
import com.box.androidsdk.content.auth.a;
import com.box.androidsdk.content.models.BoxError;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class OAuthActivity extends Activity implements a.b, OAuthWebView.c.f, OAuthWebView.d {
    private static Dialog n;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    protected OAuthWebView g;
    protected OAuthWebView.c h;
    private BoxSession k;
    private boolean i = false;
    private int j = 0;
    private AtomicBoolean l = new AtomicBoolean(false);
    private BroadcastReceiver m = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && SdkUtils.m(context) && OAuthActivity.this.u()) {
                OAuthActivity.this.y();
            }
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            OAuthActivity.this.finish();
        }
    }

    class c extends Thread {
        final /* synthetic */ String q;

        c(String str) {
            this.q = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = BoxAuthentication.o().h(OAuthActivity.this.k, this.q).get();
                String stringExtra = OAuthActivity.this.getIntent().getStringExtra("restrictToUserId");
                if (!SdkUtils.l(stringExtra) && !boxAuthenticationInfo.K().G().equals(stringExtra)) {
                    throw new RuntimeException("Unexpected user logged in. Expected " + stringExtra + " received " + boxAuthenticationInfo.K().G());
                }
                OAuthActivity.this.p(boxAuthenticationInfo);
            } catch (Exception e) {
                e.printStackTrace();
                OAuthActivity.this.o(e);
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ BoxAuthentication.BoxAuthenticationInfo q;

        d(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            this.q = boxAuthenticationInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            OAuthActivity.this.n();
            Intent intent = new Intent();
            intent.putExtra("authinfo", this.q);
            OAuthActivity.this.setResult(-1, intent);
            OAuthActivity.this.i = true;
            OAuthActivity.this.finish();
        }
    }

    class e implements Runnable {
        final /* synthetic */ OAuthWebView.b q;

        e(OAuthWebView.b bVar) {
            this.q = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            OAuthActivity.this.n();
            OAuthActivity.this.c(this.q);
            OAuthActivity.this.setResult(0);
        }
    }

    private void i() {
        OAuthWebView oAuthWebView = this.g;
        if (oAuthWebView != null) {
            oAuthWebView.clearCache(true);
            this.g.clearFormData();
            this.g.clearHistory();
        }
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().removeAllCookie();
        deleteDatabase("webview.db");
        deleteDatabase("webviewCache.db");
        File cacheDir = getCacheDir();
        SdkUtils.g(cacheDir);
        cacheDir.mkdir();
    }

    public static Intent j(Context context, BoxSession boxSession, boolean z) {
        Intent k = k(context, boxSession.u(), boxSession.w(), boxSession.A(), z);
        k.putExtra("session", boxSession);
        if (!SdkUtils.l(boxSession.G())) {
            k.putExtra("restrictToUserId", boxSession.G());
        }
        return k;
    }

    public static Intent k(Context context, String str, String str2, String str3, boolean z) {
        Intent intent = new Intent(context, (Class<?>) OAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("client_secret", str2);
        if (!SdkUtils.l(str3)) {
            intent.putExtra("redirect_uri", str3);
        }
        intent.putExtra("loginviaboxapp", z);
        return intent;
    }

    private OAuthWebView.b q(Exception exc) {
        BoxException boxException;
        BoxError b2;
        String str;
        String string = getString(ax.I3.d.b);
        if (exc != null) {
            boolean z = exc instanceof ExecutionException;
            Object obj = exc;
            if (z) {
                obj = ((ExecutionException) exc).getCause();
            }
            if ((obj instanceof BoxException) && (b2 = (boxException = (BoxException) obj).b()) != null) {
                if (boxException.e() == 403 || boxException.e() == 401 || (b2.D() != null && b2.D().equals("unauthorized_device"))) {
                    str = string + ":" + ((Object) getResources().getText(ax.I3.d.c)) + "\n";
                } else {
                    str = string + ":";
                }
                return new OAuthWebView.b(3, str + b2.E());
            }
            string = string + ":" + obj;
        }
        return new OAuthWebView.b(-1, string);
    }

    @Override // com.box.androidsdk.content.auth.OAuthWebView.c.f
    public void a(String str, String str2) {
        if (this.j == 0) {
            this.g.setVisibility(4);
        }
        x(str, str2);
    }

    @Override // com.box.androidsdk.content.auth.a.b
    public void b(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (boxAuthenticationInfo != null) {
            BoxAuthentication.o().u(boxAuthenticationInfo, this);
            p(boxAuthenticationInfo);
        }
    }

    @Override // com.box.androidsdk.content.auth.OAuthWebView.c.f
    public boolean c(OAuthWebView.b bVar) {
        if (bVar.a == 2) {
            if (bVar.c.b() == -6 || bVar.c.b() == -2 || bVar.c.b() == -8) {
                return false;
            }
            Resources resources = getResources();
            Toast.makeText(this, String.format("%s\n%s: %s", resources.getString(ax.I3.d.b), resources.getString(ax.I3.d.n), bVar.c.b() + " " + bVar.c.a()), 1).show();
        } else if (SdkUtils.l(bVar.b)) {
            Toast.makeText(this, ax.I3.d.b, 1).show();
        } else {
            int i = bVar.a;
            if (i == 1) {
                Resources resources2 = getResources();
                Toast.makeText(this, String.format("%s\n%s: %s", resources2.getString(ax.I3.d.b), resources2.getString(ax.I3.d.n), resources2.getString(ax.I3.d.d)), 1).show();
            } else {
                if (i == 3) {
                    new AlertDialog.Builder(this).setTitle(ax.I3.d.b).setMessage(ax.I3.d.c).setPositiveButton(ax.I3.d.m, new b()).create().show();
                    return true;
                }
                Toast.makeText(this, ax.I3.d.b, 1).show();
            }
        }
        finish();
        return true;
    }

    @Override // com.box.androidsdk.content.auth.OAuthWebView.d
    public void d(WebView webView, String str) {
        n();
    }

    @Override // com.box.androidsdk.content.auth.OAuthWebView.c.f
    public void e(String str) {
        a(str, null);
    }

    @Override // com.box.androidsdk.content.auth.a.b
    public void f() {
        if (getFragmentManager().findFragmentByTag("choose_auth") != null) {
            getFragmentManager().popBackStack();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        i();
        if (!this.i) {
            BoxAuthentication.o().v(null, null);
        }
        super.finish();
    }

    protected OAuthWebView l() {
        OAuthWebView oAuthWebView = (OAuthWebView) findViewById(t());
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

    protected synchronized void n() {
        Dialog dialog = n;
        if (dialog != null && dialog.isShowing()) {
            try {
                n.dismiss();
            } catch (IllegalArgumentException unused) {
            }
            n = null;
        } else if (n != null) {
            n = null;
        }
    }

    protected void o(Exception exc) {
        runOnUiThread(new e(q(exc)));
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (-1 != i2 || 1 != i) {
            if (i2 == 0) {
                finish();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("userId");
        String stringExtra2 = intent.getStringExtra("authcode");
        if (!SdkUtils.k(stringExtra2) || SdkUtils.k(stringExtra)) {
            if (SdkUtils.k(stringExtra2)) {
                return;
            }
            x(stringExtra2, null);
        } else {
            BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = BoxAuthentication.o().r(this).get(stringExtra);
            if (boxAuthenticationInfo != null) {
                b(boxAuthenticationInfo);
            } else {
                c(new OAuthWebView.b(0, HttpUrl.FRAGMENT_ENCODE_SET));
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (getFragmentManager().findFragmentByTag("choose_auth") != null) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (g.k) {
            getWindow().addFlags(8192);
        }
        setContentView(s());
        registerReceiver(this.m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.a = intent.getStringExtra("client_id");
        this.b = intent.getStringExtra("client_secret");
        this.c = intent.getStringExtra("box_device_id");
        this.d = intent.getStringExtra("box_device_name");
        this.e = intent.getStringExtra("redirect_uri");
        this.j = intent.getBooleanExtra("loginviaboxapp", false) ? 1 : 0;
        this.l.getAndSet(false);
        this.k = (BoxSession) intent.getSerializableExtra("session");
        if (bundle != null) {
            this.f = bundle.getBoolean("loggingInViaBoxApp");
        }
        BoxSession boxSession = this.k;
        if (boxSession != null) {
            boxSession.M(getApplicationContext());
            return;
        }
        BoxSession boxSession2 = new BoxSession(this, null, this.a, this.b, this.e);
        this.k = boxSession2;
        boxSession2.P(this.c);
        this.k.Q(this.d);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.m);
        this.l.set(false);
        n();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (u()) {
            y();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("loggingInViaBoxApp", this.f);
        super.onSaveInstanceState(bundle);
    }

    protected void p(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        runOnUiThread(new d(boxAuthenticationInfo));
    }

    protected Intent r() {
        Intent intent = new Intent("com.box.android.action.AUTHENTICATE_VIA_BOX_APP");
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 65600);
        if (queryIntentActivities != null && queryIntentActivities.size() >= 1) {
            String string = getResources().getString(ax.I3.d.l);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (string.equals(getPackageManager().getPackageInfo(resolveInfo.activityInfo.packageName, 64).signatures[0].toCharsString())) {
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    Map<String, BoxAuthentication.BoxAuthenticationInfo> r = BoxAuthentication.o().r(this);
                    if (r != null && r.size() > 0) {
                        ArrayList<String> arrayList = new ArrayList<>(r.size());
                        for (Map.Entry<String, BoxAuthentication.BoxAuthenticationInfo> entry : r.entrySet()) {
                            if (entry.getValue().K() != null) {
                                arrayList.add(entry.getValue().K().A());
                            }
                        }
                        if (arrayList.size() > 0) {
                            intent.putStringArrayListExtra("boxusers", arrayList);
                        }
                    }
                    return intent;
                }
                continue;
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
    }

    protected Dialog v() {
        return ProgressDialog.show(this, getText(ax.I3.d.a), getText(ax.I3.d.f));
    }

    protected synchronized void w() {
        try {
            Dialog dialog = n;
            if (dialog == null) {
                n = v();
            } else if (dialog.isShowing()) {
            }
        } catch (Exception unused) {
            n = null;
        }
    }

    protected void x(String str, String str2) {
        if (this.l.getAndSet(true)) {
            return;
        }
        w();
        if (str2 != null) {
            this.k.r().O(str2);
            ax.H3.b.f("setting Base Domain", str2, new RuntimeException("base domain being used"));
        }
        new c(str).start();
    }

    protected void y() {
        if (this.j != 1 && !getIntent().getBooleanExtra("disableAccountChoosing", false) && getFragmentManager().findFragmentByTag("choose_auth") == null) {
            Map<String, BoxAuthentication.BoxAuthenticationInfo> r = BoxAuthentication.o().r(this);
            if (SdkUtils.l(getIntent().getStringExtra("restrictToUserId")) && r != null && r.size() > 0) {
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                beginTransaction.replace(ax.I3.b.l, com.box.androidsdk.content.auth.a.a(this), "choose_auth");
                beginTransaction.addToBackStack("choose_auth");
                beginTransaction.commit();
            }
        }
        int i = this.j;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            Intent r2 = r();
            if (r2 != null) {
                r2.putExtra("client_id", this.a);
                r2.putExtra("redirect_uri", this.e);
                if (!SdkUtils.l(getIntent().getStringExtra("restrictToUserId"))) {
                    r2.putExtra("restrictToUserId", getIntent().getStringExtra("restrictToUserId"));
                }
                this.f = true;
                startActivityForResult(r2, 1);
                return;
            }
        }
        w();
        this.g = l();
        OAuthWebView.c m = m();
        this.h = m;
        m.h(this);
        this.g.setWebViewClient(this.h);
        if (this.k.s() != null) {
            this.g.setBoxAccountEmail(this.k.s());
        }
        this.g.b(this.a, this.e);
    }
}
