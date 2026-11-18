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
import ax.a3.DialogC1343B;
import ax.r8.C3003l;
import ax.r8.C3004m;
import ax.r8.C3006o;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;
import j$.net.URLDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: ax.j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2310b extends DialogC1343B {
    private static final Logger t = ax.Q2.g.a(DialogC2310b.class);
    private String f;
    private d g;
    private ProgressDialog h;
    private WebView i;
    private LinearLayout j;
    private View k;
    private boolean l;
    private Activity m;
    private boolean n;
    private String o;
    private String p;
    private String q;
    private String r;
    private c s;

    /* renamed from: ax.j3.b$a */
    class a implements DialogInterface.OnCancelListener {
        final /* synthetic */ d a;

        a(d dVar) {
            this.a = dVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.a.a();
        }
    }

    /* renamed from: ax.j3.b$b, reason: collision with other inner class name */
    class C0341b extends WebView {
        C0341b(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: ax.j3.b$c */
    public enum c {
        OAUTH,
        NEXT_CLOUD
    }

    /* renamed from: ax.j3.b$d */
    public interface d {
        void a();

        void b(Bundle bundle);

        void c(C2311c c2311c);
    }

    /* renamed from: ax.j3.b$e */
    private class e extends WebChromeClient {
        private e() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            DialogC2310b.t.fine("Receive Title: " + str);
            if (str == null) {
                return;
            }
            if (str.contains("code=")) {
                str.split("=");
                DialogC2310b.this.i.loadData(HttpUrl.FRAGMENT_ENCODE_SET, "text/html", "utf-8");
                DialogC2310b.this.l = true;
            } else if (str.contains("error=")) {
                DialogC2310b.this.g.a();
                DialogC2310b.this.dismiss();
            }
        }

        /* synthetic */ e(DialogC2310b dialogC2310b, a aVar) {
            this();
        }
    }

    /* renamed from: ax.j3.b$f */
    private class f extends WebViewClient {
        private f() {
        }

        public Bundle a(String str) {
            Bundle bundle = new Bundle();
            if (str != null) {
                for (String str2 : str.split("&")) {
                    String[] split = str2.split(":");
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                }
            }
            return bundle;
        }

        public Bundle b(String str) {
            Bundle bundle = new Bundle();
            if (str != null) {
                for (String str2 : str.split("&")) {
                    String[] split = str2.split("=");
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                }
            }
            return bundle;
        }

        public Bundle c(String str) {
            int indexOf = str.indexOf(38);
            return a(indexOf < 0 ? null : str.substring(indexOf + 1));
        }

        public Bundle d(String str) {
            int indexOf = str.indexOf(35);
            String substring = indexOf < 0 ? null : str.substring(indexOf + 1);
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            int lastIndexOf = str.lastIndexOf(63);
            Bundle b = b(lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : null);
            b.putAll(b(substring));
            return b;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            DialogC2310b.this.i.setVisibility(0);
            if (DialogC2310b.this.m.isFinishing() || DialogC2310b.this.l || !DialogC2310b.this.h.isShowing()) {
                return;
            }
            DialogC2310b.this.h.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (DialogC2310b.this.m.isFinishing()) {
                return;
            }
            DialogC2310b.this.h.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            DialogC2310b.this.g.c(new C2311c(str, i, str2));
            DialogC2310b.this.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (DialogC2310b.this.s != c.NEXT_CLOUD) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            DialogC2310b.this.k.setVisibility(0);
            DialogC2310b.this.n = true;
            sslErrorHandler.proceed();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            DialogC2310b.t.fine("Redirect URL: " + str);
            if (!str.startsWith(DialogC2310b.this.o)) {
                DialogC2310b.this.i.loadUrl(str);
                return true;
            }
            if (DialogC2310b.this.s == c.NEXT_CLOUD) {
                try {
                    Bundle c = c(str);
                    if (c.get("user") != null && c.get("password") != null) {
                        c.putBoolean("invalid_cert", DialogC2310b.this.n);
                        DialogC2310b.this.g.b(c);
                    }
                    DialogC2310b.this.g.c(new C2311c("NextCloud invalid redirect uri format"));
                } catch (Exception unused) {
                    DialogC2310b.this.g.c(new C2311c("NextCloud invalid redirect uri format"));
                }
            } else {
                Bundle d = d(str);
                String string = d.getString("error");
                if (string == null) {
                    string = d.getString("error_type");
                }
                if (string == null) {
                    if (d.containsKey("code")) {
                        new g(DialogC2310b.this, null).execute(d.getString("code"));
                    } else {
                        DialogC2310b.this.g.b(d);
                    }
                } else if (string.equals("access_denied") || string.equals("OAuthAccessDeniedException")) {
                    DialogC2310b.this.g.a();
                } else {
                    DialogC2310b.this.g.c(new C2311c(string));
                }
            }
            DialogC2310b.this.dismiss();
            return true;
        }

        /* synthetic */ f(DialogC2310b dialogC2310b, a aVar) {
            this();
        }
    }

    /* renamed from: ax.j3.b$g */
    private class g extends AsyncTask<String, Integer, String> {
        private g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return c(DialogC2310b.this.p, DialogC2310b.this.r, DialogC2310b.this.q, strArr[0], DialogC2310b.this.o);
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            DialogC2310b.this.l = false;
            if (!DialogC2310b.this.m.isFinishing()) {
                DialogC2310b.this.h.dismiss();
            }
            if (str != null) {
                try {
                    DialogC2310b.t.severe("RESULT : " + str);
                    C3003l c3003l = (C3003l) new com.google.gson.a().b().k(str, C3003l.class);
                    Bundle bundle = new Bundle();
                    C3006o w = c3003l.w("access_token");
                    if (w != null) {
                        bundle.putString("access_token", w.k());
                    }
                    C3006o w2 = c3003l.w("refresh_token");
                    if (w2 != null) {
                        bundle.putString("refresh_token", w2.k());
                    }
                    C3006o w3 = c3003l.w("expires_in");
                    if (w3 != null) {
                        bundle.putString("expires_in", w3.k());
                    }
                    DialogC2310b.this.g.b(bundle);
                } catch (C3004m unused) {
                    DialogC2310b.this.g.c(new C2311c("parse token error"));
                }
            } else {
                DialogC2310b.this.g.c(new C2311c("retrieve token error"));
            }
            if (DialogC2310b.this.m.isFinishing()) {
                return;
            }
            DialogC2310b.this.dismiss();
        }

        String c(String str, String str2, String str3, String str4, String str5) throws IOException {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(10L, TimeUnit.SECONDS);
            MultipartBody build = new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("client_id", str2).addFormDataPart("client_secret", str3).addFormDataPart("code", str4).addFormDataPart("redirect_uri", str5).addFormDataPart("grant_type", "authorization_code").build();
            Request.Builder builder2 = new Request.Builder();
            builder2.url(str);
            builder2.method("POST", build);
            Response execute = builder.build().newCall(builder2.build()).execute();
            if (execute.body() == null) {
                return null;
            }
            return execute.body().string();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            if (DialogC2310b.this.m.isFinishing()) {
                return;
            }
            DialogC2310b.this.h.show();
        }

        /* synthetic */ g(DialogC2310b dialogC2310b, a aVar) {
            this();
        }
    }

    public DialogC2310b(Activity activity, c cVar, String str, String str2, String str3, String str4, String str5, d dVar) {
        super(activity, DialogC1343B.b.FULLSCREEN_MIN_WIDTH);
        this.n = false;
        CookieSyncManager.createInstance(activity);
        this.s = cVar;
        this.f = str;
        this.g = dVar;
        this.l = false;
        this.m = activity;
        this.o = str5;
        this.r = str3;
        this.q = str4;
        this.p = str2;
        this.i = new C0341b(getContext());
        n(getLayoutInflater().inflate(R.layout.dialog_oauth, (ViewGroup) null, false));
    }

    public static DialogC2310b D(Activity activity, String str, String str2, String str3, String str4, String str5, d dVar) {
        DialogC2310b dialogC2310b = new DialogC2310b(activity, c.OAUTH, str, str2, str3, str4, str5, dVar);
        dialogC2310b.setOnCancelListener(new a(dVar));
        return dialogC2310b;
    }

    private void E() {
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setHorizontalScrollBarEnabled(false);
        a aVar = null;
        this.i.setWebViewClient(new f(this, aVar));
        this.i.setWebChromeClient(new e(this, aVar));
        this.i.getSettings().setJavaScriptEnabled(true);
        try {
            if (this.s == c.NEXT_CLOUD) {
                String str = this.f;
                if (str == null || !str.contains("arubadrive.com")) {
                    this.i.getSettings().setUserAgentString("Vox Xplorer (" + Build.MODEL + ")");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("OCS-APIREQUEST", "true");
                this.i.loadUrl(this.f, hashMap);
            } else {
                this.i.loadUrl(this.f);
            }
        } catch (SecurityException unused) {
        }
        this.i.getSettings().setSavePassword(false);
        this.i.getSettings().setSaveFormData(false);
        this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.i.setVisibility(4);
        this.j.addView(this.i);
    }

    public static int h(int i, float f2, int i2, int i3) {
        int i4 = (int) (i / f2);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    @Override // ax.a3.DialogC1343B
    protected void m(Context context, int i, int i2, View view) {
        int paddingTop = i2 - (view.getPaddingTop() + view.getPaddingBottom());
        int min = Math.min(h(paddingTop, C3180B.s(context), 800, 1280), paddingTop);
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        layoutParams.height = min;
        this.j.setLayoutParams(layoutParams);
    }

    @Override // ax.a3.DialogC1343B, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.h = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.h.setMessage(getContext().getString(R.string.loading));
        this.j = (LinearLayout) findViewById(R.id.content);
        this.k = findViewById(R.id.certificate_warning);
        E();
        if (getWindow() != null) {
            getWindow().setSoftInputMode(16);
        }
    }
}
