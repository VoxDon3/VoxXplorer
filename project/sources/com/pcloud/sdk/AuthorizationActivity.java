package com.pcloud.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import ax.la.h;
import ax.la.l;
import ax.la.s;
import ax.la.t;
import com.pcloud.sdk.b;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuthorizationActivity extends Activity {
    private static final Uri g = Uri.parse("https://my.pcloud.com/oauth2/authorize");
    private WebView b;
    private com.pcloud.sdk.b c;
    private BroadcastReceiver d;
    private final String a = "pcloud-oauth://";
    private l e = null;
    private boolean f = true;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(AuthorizationActivity.this, (Class<?>) AuthorizationActivity.class);
            intent2.setAction("AuthorizationActivity.REFRESH_ACTION");
            intent2.putExtra("AuthorizationActivity.EXTRA_URL", (Uri) intent.getParcelableExtra("AuthorizationActivity.EXTRA_URL"));
            intent2.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", AuthorizationActivity.this.c);
            intent2.addFlags(603979776);
            AuthorizationActivity.this.startActivity(intent2);
        }
    }

    private Uri d(com.pcloud.sdk.b bVar) {
        Uri.Builder appendQueryParameter = g.buildUpon().appendQueryParameter("response_type", bVar.q == b.c.CODE ? "code" : "token").appendQueryParameter("client_id", bVar.c0).appendQueryParameter("redirect_uri", "pcloud-oauth://" + getPackageName());
        if (bVar.f0) {
            appendQueryParameter.appendQueryParameter("force_reapprove", "true");
        }
        if (!bVar.d0.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = bVar.d0.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
            appendQueryParameter.appendQueryParameter("permissions", sb.toString());
        }
        return appendQueryParameter.build();
    }

    public static Intent e(Context context, com.pcloud.sdk.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null.");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("AuthorizationRequest argument cannot be null.");
        }
        Intent intent = new Intent(context, (Class<?>) AuthorizationActivity.class);
        intent.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", bVar);
        return intent;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void f(Uri uri) {
        this.b.setWebViewClient(j());
        this.b.setVisibility(0);
        WebSettings settings = this.b.getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        this.b.loadUrl(uri.toString());
    }

    private long g(Map<String, String> map, String str) {
        String i = i(map, str);
        try {
            return Long.parseLong(i);
        } catch (NumberFormatException unused) {
            throw new IllegalStateException("'" + i + "' is not a valid value for '" + str + "'.");
        }
    }

    public static com.pcloud.sdk.a h(Intent intent) {
        if (intent.hasExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT")) {
            return (com.pcloud.sdk.a) intent.getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT");
        }
        throw new IllegalArgumentException("Invalid intent provided.");
    }

    private String i(Map<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Missing '" + str + "' response parameter.");
    }

    private WebViewClient j() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(String str) {
        if (str == null) {
            return false;
        }
        if (!str.startsWith("pcloud-oauth://" + getPackageName())) {
            return false;
        }
        try {
            Map<String, String> b2 = c.b(str);
            if (!b2.containsKey("access_token") && !b2.containsKey("code")) {
                l(h.ACCESS_DENIED, null);
                return true;
            }
            String i = this.c.q == b.c.TOKEN ? i(b2, "access_token") : null;
            n(new com.pcloud.sdk.a(this.c, h.ACCESS_GRANTED, i, g(b2, "userid"), g(b2, "locationid"), this.c.q == b.c.CODE ? i(b2, "code") : null, i(b2, "hostname"), null));
            return true;
        } catch (Exception e) {
            l(h.AUTH_ERROR, e.getMessage());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(h hVar, String str) {
        n(new com.pcloud.sdk.a(this.c, hVar, null, 0L, 0L, null, null, str));
    }

    private void m(Uri uri, String str) {
        this.b.setVisibility(4);
        l lVar = new l(uri);
        this.e = lVar;
        lVar.e(this, str);
        this.f = false;
        this.d = new a();
        ax.L0.a.b(this).c(this.d, new IntentFilter("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION"));
    }

    private void n(com.pcloud.sdk.a aVar) {
        Intent intent = new Intent();
        intent.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT", aVar);
        setResult(aVar.c0 == h.CANCELLED ? 0 : -1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.b.canGoBack()) {
            this.b.goBack();
        } else {
            l(h.CANCELLED, null);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if ("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (intent == null || !intent.hasExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST")) {
            setResult(0);
            Toast.makeText(this, "Error", 1).show();
            finish();
            return;
        }
        this.c = (com.pcloud.sdk.b) intent.getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST");
        setContentView(t.a);
        this.b = (WebView) findViewById(s.a);
        Uri d = d(this.c);
        String a2 = c.a(this, this.c.e0);
        if (a2 == null) {
            f(d);
            return;
        }
        try {
            m(d, a2);
        } catch (ActivityNotFoundException unused) {
            f(d);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        l lVar = this.e;
        if (lVar != null) {
            lVar.d(this);
            this.e = null;
        }
        if (this.d != null) {
            ax.L0.a.b(this).f(this.d);
            this.d = null;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.pcloud.sdk.b bVar = (com.pcloud.sdk.b) getIntent().getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST");
        Uri uri = (Uri) intent.getParcelableExtra("AuthorizationActivity.EXTRA_URL");
        intent.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", bVar);
        setIntent(intent);
        if (bVar == null || uri == null) {
            l(h.AUTH_ERROR, bVar == null ? "Missing intent extra ARGUMENT_AUTH_REQUEST" : "Missing intent extra EXTRA_REDIRECT_URL");
            return;
        }
        if ("AuthorizationActivity.REFRESH_ACTION".equals(intent.getAction())) {
            ax.L0.a.b(this).d(new Intent("CustomTabActivity.DESTROY_ACTION"));
            k(uri.toString());
        } else if ("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION".equals(intent.getAction())) {
            k(uri.toString());
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.b.restoreState(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f && this.b.getVisibility() != 0) {
            l(h.CANCELLED, null);
        }
        this.f = true;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.saveState(bundle);
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int errorCode;
            CharSequence description;
            errorCode = webResourceError.getErrorCode();
            description = webResourceError.getDescription();
            onReceivedError(webView, errorCode, description.toString(), webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url = webResourceRequest.getUrl();
            if (url != null) {
                return shouldOverrideUrlLoading(webView, url.toString());
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return AuthorizationActivity.this.k(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (AuthorizationActivity.this.isFinishing()) {
                return;
            }
            AuthorizationActivity.this.l(h.AUTH_ERROR, String.format(Locale.US, "Error while loading url '%s':\n%d: %s", str2, Integer.valueOf(i), str));
        }
    }
}
