/*
 * Decompiled with CFR 0.152.
 */
package ax.j3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import ax.a3.B;
import ax.r8.l;
import ax.r8.m;
import ax.r8.o;
import com.google.gson.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class b
extends B {
    private static final Logger t = ax.Q2.g.a(b.class);
    private String f;
    private d g;
    private ProgressDialog h;
    private WebView i;
    private LinearLayout j;
    private View k;
    private boolean l;
    private Activity m;
    private boolean n = false;
    private String o;
    private String p;
    private String q;
    private String r;
    private c s;

    public b(Activity activity, c c8, String string, String string2, String string3, String string4, String string5, d d8) {
        super((Context)activity, B.b.e0);
        CookieSyncManager.createInstance((Context)activity);
        this.s = c8;
        this.f = string;
        this.g = d8;
        this.l = false;
        this.m = activity;
        this.o = string5;
        this.r = string3;
        this.q = string4;
        this.p = string2;
        this.i = new WebView(this, this.getContext()){
            final b a;
            {
                this.a = b8;
                super(context);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public void onWindowFocusChanged(boolean bl) {
                try {
                    super.onWindowFocusChanged(bl);
                    return;
                }
                catch (NullPointerException nullPointerException) {
                    return;
                }
            }
        };
        this.n(this.getLayoutInflater().inflate(2131558513, null, false));
    }

    public static b D(Activity object, String string, String string2, String string3, String string4, String string5, d d8) {
        object = new b((Activity)object, c.q, string, string2, string3, string4, string5, d8);
        object.setOnCancelListener(new DialogInterface.OnCancelListener(d8){
            final d a;
            {
                this.a = d8;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.a.a();
            }
        });
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void E() {
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setHorizontalScrollBarEnabled(false);
        this.i.setWebViewClient((WebViewClient)new f(this));
        this.i.setWebChromeClient((WebChromeClient)new e(this));
        this.i.getSettings().setJavaScriptEnabled(true);
        try {
            if (this.s == c.c0) {
                Object object = this.f;
                if (object == null || !((String)object).contains("arubadrive.com")) {
                    object = this.i.getSettings();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cx file explorer (");
                    stringBuilder.append(Build.MODEL);
                    stringBuilder.append(")");
                    object.setUserAgentString(stringBuilder.toString());
                }
                object = new Object();
                ((HashMap)object).put("OCS-APIREQUEST", "true");
                this.i.loadUrl(this.f, object);
            } else {
                this.i.loadUrl(this.f);
            }
        }
        catch (SecurityException securityException) {}
        this.i.getSettings().setSavePassword(false);
        this.i.getSettings().setSaveFormData(false);
        this.i.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
        this.i.setVisibility(4);
        this.j.addView((View)this.i);
    }

    public static int h(int n8, float f8, int n9, int n10) {
        int n11 = (int)((float)n8 / f8);
        double d8 = n11 <= n9 ? 1.0 : (n11 >= n10 ? 0.5 : (double)(n10 - n11) / (double)(n10 - n9) * 0.5 + 0.5);
        return (int)((double)n8 * d8);
    }

    static /* synthetic */ boolean s(b b8, boolean bl) {
        b8.n = bl;
        return bl;
    }

    static /* synthetic */ boolean x(b b8, boolean bl) {
        b8.l = bl;
        return bl;
    }

    @Override
    protected void m(Context context, int n8, int n9, View view) {
        n8 = n9 - (view.getPaddingTop() + view.getPaddingBottom());
        n8 = Math.min(b.h(n8, ax.u3.B.s(context), 800, 1280), n8);
        context = this.j.getLayoutParams();
        context.height = n8;
        this.j.setLayoutParams((ViewGroup.LayoutParams)context);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new ProgressDialog(this.getContext());
        this.h = bundle;
        bundle.requestWindowFeature(1);
        this.h.setMessage((CharSequence)this.getContext().getString(2131952143));
        this.j = (LinearLayout)this.findViewById(2131362057);
        this.k = this.findViewById(2131362022);
        this.E();
        if (this.getWindow() != null) {
            this.getWindow().setSoftInputMode(16);
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        private static final c[] d0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])d0.clone();
        }
    }

    public static interface d {
        public void a();

        public void b(Bundle var1);

        public void c(ax.j3.c var1);
    }

    private class e
    extends WebChromeClient {
        final b a;

        private e(b b8) {
            this.a = b8;
        }

        public void onReceivedTitle(WebView object, String string) {
            super.onReceivedTitle((WebView)object, string);
            Logger logger = t;
            object = new StringBuilder();
            ((StringBuilder)object).append("Receive Title: ");
            ((StringBuilder)object).append(string);
            logger.fine(((StringBuilder)object).toString());
            if (string != null) {
                if (string.contains("code=")) {
                    string.split("=");
                    this.a.i.loadData("", "text/html", "utf-8");
                    b.x(this.a, true);
                    return;
                }
                if (string.contains("error=")) {
                    this.a.g.a();
                    this.a.dismiss();
                }
            }
        }
    }

    private class f
    extends WebViewClient {
        final b a;

        private f(b b8) {
            this.a = b8;
        }

        public Bundle a(String stringArray) {
            Bundle bundle = new Bundle();
            if (stringArray != null) {
                String[] stringArray2 = stringArray.split("&");
                int n8 = stringArray2.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    stringArray = stringArray2[i8].split(":");
                    bundle.putString(j.URLDecoder.decode((String)stringArray[0]), j.URLDecoder.decode((String)stringArray[1]));
                }
            }
            return bundle;
        }

        public Bundle b(String stringArray) {
            Bundle bundle = new Bundle();
            if (stringArray != null) {
                String[] stringArray2 = stringArray.split("&");
                int n8 = stringArray2.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    stringArray = stringArray2[i8].split("=");
                    bundle.putString(j.URLDecoder.decode((String)stringArray[0]), j.URLDecoder.decode((String)stringArray[1]));
                }
            }
            return bundle;
        }

        public Bundle c(String string) {
            int n8 = string.indexOf(38);
            string = n8 < 0 ? null : string.substring(n8 + 1);
            return this.a(string);
        }

        public Bundle d(String string) {
            int n8 = string.indexOf(35);
            Object var4_3 = null;
            String string2 = n8 < 0 ? null : string.substring(n8 + 1);
            if (n8 >= 0) {
                string = string.substring(0, n8);
            }
            n8 = string.lastIndexOf(63);
            string = n8 < 0 ? var4_3 : string.substring(n8 + 1);
            string = this.b(string);
            string.putAll(this.b(string2));
            return string;
        }

        public void onPageFinished(WebView webView, String string) {
            super.onPageFinished(webView, string);
            this.a.i.setVisibility(0);
            if (!this.a.m.isFinishing() && !this.a.l && this.a.h.isShowing()) {
                this.a.h.dismiss();
            }
        }

        public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
            super.onPageStarted(webView, string, bitmap);
            if (!this.a.m.isFinishing()) {
                this.a.h.show();
            }
        }

        public void onReceivedError(WebView webView, int n8, String string, String string2) {
            super.onReceivedError(webView, n8, string, string2);
            this.a.g.c(new ax.j3.c(string, n8, string2));
            this.a.dismiss();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.a.s == c.c0) {
                this.a.k.setVisibility(0);
                b.s(this.a, true);
                sslErrorHandler.proceed();
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        public boolean shouldOverrideUrlLoading(WebView object, String object2) {
            Logger logger = t;
            object = new StringBuilder();
            ((StringBuilder)object).append("Redirect URL: ");
            ((StringBuilder)object).append((String)object2);
            logger.fine(((StringBuilder)object).toString());
            if (((String)object2).startsWith(this.a.o)) {
                block13: {
                    if (this.a.s == c.c0) {
                        try {
                            object = this.c((String)object2);
                            if (object.get("user") != null && object.get("password") != null) {
                                object.putBoolean("invalid_cert", this.a.n);
                                this.a.g.b((Bundle)object);
                                break block13;
                            }
                            object = this.a.g;
                            object2 = new ax.j3.c("NextCloud invalid redirect uri format");
                            object.c((ax.j3.c)object2);
                        }
                        catch (Exception exception) {
                            this.a.g.c(new ax.j3.c("NextCloud invalid redirect uri format"));
                        }
                    } else {
                        logger = this.d((String)object2);
                        object = object2 = logger.getString("error");
                        if (object2 == null) {
                            object = logger.getString("error_type");
                        }
                        if (object == null) {
                            if (logger.containsKey("code")) {
                                new g(this.a).execute(new String[]{logger.getString("code")});
                            } else {
                                this.a.g.b((Bundle)logger);
                            }
                        } else if (!((String)object).equals("access_denied") && !((String)object).equals("OAuthAccessDeniedException")) {
                            this.a.g.c(new ax.j3.c((String)object));
                        } else {
                            this.a.g.a();
                        }
                    }
                }
                this.a.dismiss();
                return true;
            }
            this.a.i.loadUrl((String)object2);
            return true;
        }
    }

    private class g
    extends AsyncTask<String, Integer, String> {
        final b a;

        private g(b b8) {
            this.a = b8;
        }

        protected String a(String ... object) {
            object = object[0];
            try {
                object = this.c(this.a.p, this.a.r, this.a.q, (String)object, this.a.o);
                return object;
            }
            catch (IOException iOException) {
                return null;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void b(String string) {
            b.x(this.a, false);
            if (!this.a.m.isFinishing()) {
                this.a.h.dismiss();
            }
            if (string != null) {
                try {
                    Object object = t;
                    Object object2 = new StringBuilder();
                    ((StringBuilder)object2).append("RESULT : ");
                    ((StringBuilder)object2).append(string);
                    ((Logger)object).severe(((StringBuilder)object2).toString());
                    object = new a();
                    object = ((a)object).b().k(string, l.class);
                    string = new Bundle();
                    object2 = ((l)object).w("access_token");
                    if (object2 != null) {
                        string.putString("access_token", ((o)object2).k());
                    }
                    if ((object2 = ((l)object).w("refresh_token")) != null) {
                        string.putString("refresh_token", ((o)object2).k());
                    }
                    if ((object = ((l)object).w("expires_in")) != null) {
                        string.putString("expires_in", ((o)object).k());
                    }
                    this.a.g.b((Bundle)string);
                }
                catch (m m8) {
                    this.a.g.c(new ax.j3.c("parse token error"));
                }
            } else {
                this.a.g.c(new ax.j3.c("retrieve token error"));
            }
            if (!this.a.m.isFinishing()) {
                this.a.dismiss();
            }
        }

        String c(String object, String object2, String object3, String string, String string2) throws IOException {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(10L, TimeUnit.SECONDS);
            object2 = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("client_id", (String)object2).addFormDataPart("client_secret", (String)object3).addFormDataPart("code", string).addFormDataPart("redirect_uri", string2).addFormDataPart("grant_type", "authorization_code").build();
            object3 = new Request.Builder();
            ((Request.Builder)object3).url((String)object);
            ((Request.Builder)object3).method("POST", (RequestBody)object2);
            object = ((Request.Builder)object3).build();
            object = builder.build().newCall((Request)object).execute();
            if (((Response)object).body() == null) {
                return null;
            }
            return ((Response)object).body().string();
        }

        protected void onPreExecute() {
            if (!this.a.m.isFinishing()) {
                this.a.h.show();
            }
        }
    }
}

