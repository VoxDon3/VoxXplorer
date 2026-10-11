package ax.U9;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.apache.http.client.HttpClient;

/* loaded from: classes3.dex */
class b implements s {
    private final HttpClient c0;
    private final String d0;
    private final c e0;
    private final String f0;
    private final String g0;
    private final q h0;
    private final Activity q;

    private class a extends Dialog implements DialogInterface.OnCancelListener {
        private WebView a;
        private final Uri b;

        /* renamed from: ax.U9.b$a$a, reason: collision with other inner class name */
        private class C0208a extends WebViewClient {
            private final CookieManager a;
            private final Set<String> b;

            public C0208a() {
                CookieSyncManager.createInstance(a.this.getContext());
                this.a = CookieManager.getInstance();
                this.b = new HashSet();
            }

            private void a() {
                if (!a.this.isShowing() || b.this.q == null || b.this.q.isFinishing()) {
                    return;
                }
                a.this.dismiss();
            }

            private void b(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                for (String str2 : TextUtils.split(str, "; ")) {
                    this.b.add(str2.substring(0, str2.indexOf("=")));
                }
            }

            private void c() {
                SharedPreferences sharedPreferences = a.this.getContext().getSharedPreferences("com.microsoft.live", 0);
                this.b.addAll(Arrays.asList(TextUtils.split(sharedPreferences.getString("cookies", HttpUrl.FRAGMENT_ENCODE_SET), ",")));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("cookies", TextUtils.join(",", this.b));
                edit.commit();
                this.b.clear();
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                if (b.this.h0.a().getHost() != null && b.this.h0.a().getHost().equals(parse.getHost())) {
                    b(this.a.getCookie(str));
                }
                if (EnumC0209b.INSTANCE.compare(parse, b.this.h0.b()) == 0 && a.this.isShowing()) {
                    c();
                    b.this.m(parse);
                    a();
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (i == -10) {
                    return;
                }
                b.this.n(HttpUrl.FRAGMENT_ENCODE_SET, str, str2);
                a();
            }
        }

        public a(Uri uri) {
            super(b.this.q, R.style.Theme.Translucent.NoTitleBar);
            setOwnerActivity(b.this.q);
            if (uri == null) {
                throw new AssertionError();
            }
            this.b = uri;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            b.this.d(new f("The user cancelled the login operation."));
        }

        @Override // android.app.Dialog
        @SuppressLint({"SetJavaScriptEnabled"})
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setOnCancelListener(this);
            LinearLayout linearLayout = new LinearLayout(getContext());
            if (this.a == null) {
                WebView webView = new WebView(getContext());
                this.a = webView;
                webView.setWebViewClient(new C0208a());
                this.a.getSettings().setJavaScriptEnabled(true);
                this.a.loadUrl(this.b.toString());
                this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.a.setVisibility(0);
            }
            linearLayout.addView(this.a);
            linearLayout.setVisibility(0);
            linearLayout.forceLayout();
            linearLayout.setBackgroundColor(-1);
            linearLayout.setFitsSystemWindows(true);
            addContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* renamed from: ax.U9.b$b, reason: collision with other inner class name */
    private enum EnumC0209b implements Comparator<Uri> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compare(Uri uri, Uri uri2) {
            String[] strArr = {uri.getScheme(), uri.getAuthority(), uri.getPath()};
            String[] strArr2 = {uri2.getScheme(), uri2.getAuthority(), uri2.getPath()};
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                if (str == null && strArr2[i] == null) {
                    return 0;
                }
                int compareTo = str.compareTo(strArr2[i]);
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return 0;
        }
    }

    public b(Activity activity, HttpClient httpClient, String str, String str2, String str3, q qVar) {
        if (activity == null) {
            throw new AssertionError();
        }
        if (httpClient == null) {
            throw new AssertionError();
        }
        if (TextUtils.isEmpty(str)) {
            throw new AssertionError();
        }
        if (TextUtils.isEmpty(str2)) {
            throw new AssertionError();
        }
        this.q = activity;
        this.c0 = httpClient;
        this.d0 = str;
        this.h0 = qVar;
        this.e0 = new c();
        this.f0 = str2;
        this.g0 = str3;
    }

    private String i() {
        return x.h(this.q).j().h().toString().toLowerCase(Locale.US);
    }

    private static Map<String, String> j(Uri uri) {
        String[] split = TextUtils.split(uri.getFragment(), "&");
        HashMap hashMap = new HashMap();
        for (String str : split) {
            int indexOf = str.indexOf("=");
            hashMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        return hashMap;
    }

    private void k(Map<String, String> map) {
        if (map == null) {
            throw new AssertionError();
        }
        try {
            c(v.b(map));
        } catch (f e) {
            d(e);
        }
    }

    private void l(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new AssertionError();
        }
        z zVar = new z(new ax.U9.a(this.c0, this.d0, str, this.h0));
        zVar.a(this);
        zVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Uri uri) {
        boolean z = uri.getFragment() != null;
        boolean z2 = uri.getQuery() != null;
        boolean z3 = (z || z2) ? false : true;
        boolean isHierarchical = uri.isHierarchical();
        if (z3) {
            o();
            return;
        }
        if (z) {
            Map<String, String> j = j(uri);
            if (j.containsKey("access_token") && j.containsKey("token_type")) {
                k(j);
                return;
            }
            String str = j.get("error");
            if (str != null) {
                n(str, j.get("error_description"), j.get("error_uri"));
                return;
            }
        }
        if (z2 && isHierarchical) {
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter != null) {
                l(queryParameter);
                return;
            }
            String queryParameter2 = uri.getQueryParameter("error");
            if (queryParameter2 != null) {
                n(queryParameter2, uri.getQueryParameter("error_description"), uri.getQueryParameter("error_uri"));
                return;
            }
        }
        if (z2 && !isHierarchical) {
            String[] split = uri.getQuery().split("&|=");
            for (int i = 0; i < split.length; i += 2) {
                if (split[i].equals("code")) {
                    l(split[i + 1]);
                    return;
                }
            }
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, String str2, String str3) {
        d(new f(str, str2, str3));
    }

    private void o() {
        d(new f("An error occured while communicating with the server during the operation. Please try again later."));
    }

    @Override // ax.U9.s
    public void c(t tVar) {
        this.e0.c(tVar);
    }

    @Override // ax.U9.s
    public void d(f fVar) {
        this.e0.b(fVar);
    }

    public void g(s sVar) {
        this.e0.a(sVar);
    }

    public void h() {
        String i = i();
        String lowerCase = o.CODE.toString().toLowerCase(Locale.US);
        Locale.getDefault().toString();
        Uri.Builder appendQueryParameter = this.h0.d().buildUpon().appendQueryParameter("client_id", this.d0).appendQueryParameter("scope", this.f0).appendQueryParameter("display", i).appendQueryParameter("response_type", lowerCase).appendQueryParameter("redirect_uri", this.h0.b().toString());
        String str = this.g0;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("login_hint", str);
            appendQueryParameter.appendQueryParameter("username", this.g0);
        }
        try {
            new a(appendQueryParameter.build()).show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
