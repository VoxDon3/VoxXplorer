/*
 * Decompiled with CFR 0.152.
 */
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
import android.os.Parcelable;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import ax.la.f;
import ax.la.g;
import ax.la.h;
import ax.la.l;
import ax.la.s;
import ax.la.t;
import com.pcloud.sdk.a;
import com.pcloud.sdk.b;
import com.pcloud.sdk.c;
import java.util.Locale;
import java.util.Map;

public final class AuthorizationActivity
extends Activity {
    private static final Uri g = Uri.parse((String)"https://my.pcloud.com/oauth2/authorize");
    private final String a;
    private WebView b;
    private b c;
    private BroadcastReceiver d;
    private l e = null;
    private boolean f = true;

    public AuthorizationActivity() {
        this.a = "pcloud-oauth://";
    }

    private Uri d(b object) {
        String string = ((b)object).q == b.c.c0 ? "code" : "token";
        string = g.buildUpon().appendQueryParameter("response_type", string).appendQueryParameter("client_id", ((b)object).c0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pcloud-oauth://");
        stringBuilder.append(this.getPackageName());
        string = string.appendQueryParameter("redirect_uri", stringBuilder.toString());
        if (((b)object).f0) {
            string.appendQueryParameter("force_reapprove", "true");
        }
        if (!((b)object).d0.isEmpty()) {
            stringBuilder = new StringBuilder();
            object = ((b)object).d0.iterator();
            while (object.hasNext()) {
                stringBuilder.append((String)object.next());
                if (!object.hasNext()) continue;
                stringBuilder.append(",");
            }
            string.appendQueryParameter("permissions", stringBuilder.toString());
        }
        return string.build();
    }

    public static Intent e(Context context, b b8) {
        if (context != null) {
            if (b8 != null) {
                context = new Intent(context, AuthorizationActivity.class);
                context.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", (Parcelable)b8);
                return context;
            }
            throw new IllegalArgumentException("AuthorizationRequest argument cannot be null.");
        }
        throw new IllegalArgumentException("Context argument cannot be null.");
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void f(Uri uri) {
        WebViewClient webViewClient = this.j();
        this.b.setWebViewClient(webViewClient);
        this.b.setVisibility(0);
        webViewClient = this.b.getSettings();
        webViewClient.setCacheMode(2);
        webViewClient.setJavaScriptEnabled(true);
        webViewClient.setDomStorageEnabled(true);
        webViewClient.setJavaScriptCanOpenWindowsAutomatically(true);
        this.b.loadUrl(uri.toString());
    }

    private long g(Map<String, String> object, String string) {
        object = this.i((Map<String, String>)object, string);
        try {
            long l8 = Long.parseLong((String)object);
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("'");
            stringBuilder.append((String)object);
            stringBuilder.append("' is not a valid value for '");
            stringBuilder.append(string);
            stringBuilder.append("'.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static a h(Intent intent) {
        if (intent.hasExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT")) {
            return (a)intent.getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT");
        }
        throw new IllegalArgumentException("Invalid intent provided.");
    }

    private String i(Map<String, String> object, String string) {
        if ((object = object.get(string)) != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Missing '");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("' response parameter.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private WebViewClient j() {
        return new WebViewClient(this){
            final AuthorizationActivity a;
            {
                this.a = authorizationActivity;
            }

            public void onReceivedError(WebView object, int n8, String string, String string2) {
                if (!this.a.isFinishing()) {
                    object = String.format(Locale.US, "Error while loading url '%s':\n%d: %s", string2, n8, string);
                    this.a.l(h.f0, (String)object);
                }
            }

            @TargetApi(value=23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                this.onReceivedError(webView, ax.la.f.a(webResourceError), ax.la.g.a(webResourceError).toString(), webResourceRequest.getUrl().toString());
            }

            @TargetApi(value=21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if ((webResourceRequest = webResourceRequest.getUrl()) != null) {
                    return this.shouldOverrideUrlLoading(webView, webResourceRequest.toString());
                }
                return false;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String string) {
                return this.a.k(string);
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean k(String string) {
        Exception exception2;
        block4: {
            Object object;
            if (string == null) return false;
            CharSequence charSequence = new StringBuilder();
            charSequence.append("pcloud-oauth://");
            charSequence.append(this.getPackageName());
            if (!string.startsWith(charSequence.toString())) return false;
            try {
                object = com.pcloud.sdk.c.b(string);
                boolean bl = object.containsKey("access_token");
                charSequence = null;
                if (!bl && !object.containsKey("code")) {
                    this.l(h.e0, null);
                    return true;
                }
            }
            catch (Exception exception2) {
                break block4;
            }
            string = this.c.q == b.c.d0 ? this.i((Map<String, String>)object, "access_token") : null;
            if (this.c.q == b.c.c0) {
                charSequence = this.i((Map<String, String>)object, "code");
            }
            long l8 = this.g((Map<String, String>)object, "userid");
            long l9 = this.g((Map<String, String>)object, "locationid");
            String string2 = this.i((Map<String, String>)object, "hostname");
            object = new a(this.c, h.c0, string, l8, l9, (String)charSequence, string2, null);
            this.n((a)object);
            return true;
        }
        this.l(h.f0, exception2.getMessage());
        return true;
    }

    private void l(h h8, String string) {
        this.n(new a(this.c, h8, null, 0L, 0L, null, null, string));
    }

    private void m(Uri object, String string) {
        this.b.setVisibility(4);
        object = new l((Uri)object);
        this.e = object;
        ((l)object).e(this, string);
        this.f = false;
        this.d = new BroadcastReceiver(this){
            final AuthorizationActivity a;
            {
                this.a = authorizationActivity;
            }

            public void onReceive(Context context, Intent intent) {
                context = new Intent((Context)this.a, AuthorizationActivity.class);
                context.setAction("AuthorizationActivity.REFRESH_ACTION");
                context.putExtra("AuthorizationActivity.EXTRA_URL", (Parcelable)((Uri)intent.getParcelableExtra("AuthorizationActivity.EXTRA_URL")));
                context.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", (Parcelable)this.a.c);
                context.addFlags(0x24000000);
                this.a.startActivity((Intent)context);
            }
        };
        ax.L0.a.b((Context)this).c(this.d, new IntentFilter("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION"));
    }

    private void n(a a8) {
        Intent intent = new Intent();
        intent.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_RESULT", (Parcelable)a8);
        int n8 = a8.c0 == h.d0 ? 0 : -1;
        this.setResult(n8, intent);
        this.finish();
    }

    public void onBackPressed() {
        if (this.b.canGoBack()) {
            this.b.goBack();
            return;
        }
        this.l(h.d0, null);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getIntent();
        if ("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION".equals(this.getIntent().getAction())) {
            this.setResult(0);
            this.finish();
            return;
        }
        if (bundle != null && bundle.hasExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST")) {
            this.c = (b)bundle.getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST");
            this.setContentView(t.a);
            this.b = (WebView)this.findViewById(s.a);
            bundle = this.d(this.c);
            String string = com.pcloud.sdk.c.a((Context)this, this.c.e0);
            if (string != null) {
                try {
                    this.m((Uri)bundle, string);
                    return;
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    this.f((Uri)bundle);
                    return;
                }
            }
            this.f((Uri)bundle);
            return;
        }
        this.setResult(0);
        Toast.makeText((Context)this, (CharSequence)"Error", (int)1).show();
        this.finish();
    }

    protected void onDestroy() {
        super.onDestroy();
        l l8 = this.e;
        if (l8 != null) {
            l8.d(this);
            this.e = null;
        }
        if (this.d != null) {
            ax.L0.a.b((Context)this).f(this.d);
            this.d = null;
        }
    }

    protected void onNewIntent(Intent object) {
        super.onNewIntent(object);
        b b8 = (b)this.getIntent().getParcelableExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST");
        Uri uri = (Uri)object.getParcelableExtra("AuthorizationActivity.EXTRA_URL");
        object.putExtra("com.pcloud.authentication.AuthorizationActivity.ARGUMENT_AUTH_REQUEST", (Parcelable)b8);
        this.setIntent((Intent)object);
        if (b8 != null && uri != null) {
            if ("AuthorizationActivity.REFRESH_ACTION".equals(object.getAction())) {
                object = new Intent("CustomTabActivity.DESTROY_ACTION");
                ax.L0.a.b((Context)this).d((Intent)object);
                this.k(uri.toString());
                return;
            }
            if ("CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION".equals(object.getAction())) {
                this.k(uri.toString());
            }
            return;
        }
        object = b8 == null ? "Missing intent extra ARGUMENT_AUTH_REQUEST" : "Missing intent extra EXTRA_REDIRECT_URL";
        this.l(h.f0, (String)object);
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.b.restoreState(bundle);
        }
    }

    protected void onResume() {
        super.onResume();
        if (this.f && this.b.getVisibility() != 0) {
            this.l(h.d0, null);
        }
        this.f = true;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.saveState(bundle);
    }
}

