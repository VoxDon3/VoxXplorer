/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import ax.U9.c;
import ax.U9.f;
import ax.U9.o;
import ax.U9.q;
import ax.U9.s;
import ax.U9.t;
import ax.U9.v;
import ax.U9.x;
import ax.U9.z;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.HttpClient;

class b
implements s {
    private final HttpClient c0;
    private final String d0;
    private final c e0;
    private final String f0;
    private final String g0;
    private final q h0;
    private final Activity q;

    public b(Activity activity, HttpClient httpClient, String string, String string2, String string3, q q8) {
        if (activity != null) {
            if (httpClient != null) {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    if (!TextUtils.isEmpty((CharSequence)string2)) {
                        this.q = activity;
                        this.c0 = httpClient;
                        this.d0 = string;
                        this.h0 = q8;
                        this.e0 = new c();
                        this.f0 = string2;
                        this.g0 = string3;
                        return;
                    }
                    throw new AssertionError();
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private String i() {
        return ((Object)((Object)x.h(this.q).j().h())).toString().toLowerCase(Locale.US);
    }

    private static Map<String, String> j(Uri object2) {
        String[] stringArray = TextUtils.split((String)object2.getFragment(), (String)"&");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : stringArray) {
            int n8 = string.indexOf("=");
            hashMap.put(string.substring(0, n8), string.substring(n8 + 1));
        }
        return hashMap;
    }

    private void k(Map<String, String> object) {
        if (object != null) {
            try {
                object = v.b(object);
            }
            catch (f f8) {
                this.d(f8);
                return;
            }
            this.c((t)object);
            return;
        }
        throw new AssertionError();
    }

    private void l(String object) {
        if (!TextUtils.isEmpty((CharSequence)object)) {
            object = new z(new ax.U9.a(this.c0, this.d0, (String)object, this.h0));
            ((z)((Object)object)).a(this);
            object.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
            return;
        }
        throw new AssertionError();
    }

    private void m(Uri stringArray) {
        Object object = stringArray.getFragment();
        int n8 = 0;
        int n9 = object != null ? 1 : 0;
        boolean bl = stringArray.getQuery() != null;
        boolean bl2 = n9 == 0 && !bl;
        boolean bl3 = stringArray.isHierarchical();
        if (bl2) {
            this.o();
            return;
        }
        if (n9 != 0) {
            object = b.j((Uri)stringArray);
            if (object.containsKey("access_token") && object.containsKey("token_type")) {
                this.k((Map<String, String>)object);
                return;
            }
            String string = (String)object.get("error");
            if (string != null) {
                this.n(string, (String)object.get("error_description"), (String)object.get("error_uri"));
                return;
            }
        }
        if (bl && bl3) {
            object = stringArray.getQueryParameter("code");
            if (object != null) {
                this.l((String)object);
                return;
            }
            object = stringArray.getQueryParameter("error");
            if (object != null) {
                this.n((String)object, stringArray.getQueryParameter("error_description"), stringArray.getQueryParameter("error_uri"));
                return;
            }
        }
        if (bl && !bl3) {
            stringArray = stringArray.getQuery().split("&|=");
            for (n9 = n8; n9 < stringArray.length; n9 += 2) {
                if (!stringArray[n9].equals("code")) continue;
                this.l(stringArray[n9 + 1]);
                return;
            }
        }
        this.o();
    }

    private void n(String string, String string2, String string3) {
        this.d(new f(string, string2, string3));
    }

    private void o() {
        this.d(new f("An error occured while communicating with the server during the operation. Please try again later."));
    }

    @Override
    public void c(t t8) {
        this.e0.c(t8);
    }

    @Override
    public void d(f f8) {
        this.e0.b(f8);
    }

    public void g(s s8) {
        this.e0.a(s8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void h() {
        String string = this.i();
        String string2 = ((Object)((Object)o.q)).toString().toLowerCase(Locale.US);
        Locale.getDefault().toString();
        string = this.h0.d().buildUpon().appendQueryParameter("client_id", this.d0).appendQueryParameter("scope", this.f0).appendQueryParameter("display", string).appendQueryParameter("response_type", string2).appendQueryParameter("redirect_uri", this.h0.b().toString());
        String string3 = this.g0;
        if (string3 != null) {
            string.appendQueryParameter("login_hint", string3);
            string.appendQueryParameter("username", this.g0);
        }
        string = string.build();
        try {
            a a8 = new a(this, (Uri)string);
            a8.show();
            return;
        }
        catch (WindowManager.BadTokenException badTokenException) {
            return;
        }
    }

    private class ax.U9.b$a
    extends Dialog
    implements DialogInterface.OnCancelListener {
        private WebView a;
        private final Uri b;
        final b c;

        public ax.U9.b$a(b b8, Uri uri) {
            this.c = b8;
            super((Context)b8.q, 0x1030010);
            this.setOwnerActivity(b8.q);
            if (uri != null) {
                this.b = uri;
                return;
            }
            throw new AssertionError();
        }

        public void onCancel(DialogInterface object) {
            object = new f("The user cancelled the login operation.");
            this.c.d((f)object);
        }

        @SuppressLint(value={"SetJavaScriptEnabled"})
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.setOnCancelListener(this);
            LinearLayout linearLayout = new LinearLayout(this.getContext());
            if (this.a == null) {
                bundle = new WebView(this.getContext());
                this.a = bundle;
                bundle.setWebViewClient((WebViewClient)new a(this));
                this.a.getSettings().setJavaScriptEnabled(true);
                this.a.loadUrl(this.b.toString());
                this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.a.setVisibility(0);
            }
            linearLayout.addView((View)this.a);
            linearLayout.setVisibility(0);
            linearLayout.forceLayout();
            linearLayout.setBackgroundColor(-1);
            linearLayout.setFitsSystemWindows(true);
            this.addContentView((View)linearLayout, new ViewGroup.LayoutParams(-1, -1));
        }

        private class a
        extends WebViewClient {
            private final CookieManager a;
            private final Set<String> b;
            final ax.U9.b$a c;

            public a(ax.U9.b$a a8) {
                this.c = a8;
                CookieSyncManager.createInstance((Context)a8.getContext());
                this.a = CookieManager.getInstance();
                this.b = new HashSet<String>();
            }

            private void a() {
                if (this.c.isShowing() && this.c.c.q != null && !this.c.c.q.isFinishing()) {
                    this.c.dismiss();
                }
            }

            private void b(String stringArray) {
                if (!TextUtils.isEmpty((CharSequence)stringArray)) {
                    for (String string : TextUtils.split((String)stringArray, (String)"; ")) {
                        string = string.substring(0, string.indexOf("="));
                        this.b.add(string);
                    }
                }
            }

            private void c() {
                SharedPreferences sharedPreferences = this.c.getContext().getSharedPreferences("com.microsoft.live", 0);
                String[] stringArray = TextUtils.split((String)sharedPreferences.getString("cookies", ""), (String)",");
                this.b.addAll(Arrays.asList(stringArray));
                sharedPreferences = sharedPreferences.edit();
                sharedPreferences.putString("cookies", TextUtils.join((CharSequence)",", this.b));
                sharedPreferences.commit();
                this.b.clear();
            }

            public void onPageFinished(WebView webView, String string) {
                webView = Uri.parse((String)string);
                if (this.c.c.h0.a().getHost() != null && this.c.c.h0.a().getHost().equals(webView.getHost())) {
                    this.b(this.a.getCookie(string));
                }
                if (ax.U9.b$b.q.h((Uri)webView, (Uri)(string = this.c.c.h0.b())) == 0) {
                    if (!this.c.isShowing()) {
                        return;
                    }
                    this.c();
                    this.c.c.m((Uri)webView);
                    this.a();
                }
            }

            public void onReceivedError(WebView webView, int n8, String string, String string2) {
                if (n8 == -10) {
                    return;
                }
                this.c.c.n("", string, string2);
                this.a();
            }
        }
    }

    private static final class b
    extends Enum<b>
    implements Comparator<Uri> {
        private static final b[] c0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])c0.clone();
        }

        public int h(Uri object, Uri stringArray) {
            String string = object.getScheme();
            String string2 = object.getAuthority();
            object = object.getPath();
            String string3 = stringArray.getScheme();
            String string4 = stringArray.getAuthority();
            String string5 = stringArray.getPath();
            stringArray = new String[]{string3, string4, string5};
            for (int i8 = 0; i8 < 3; ++i8) {
                string4 = (new String[]{string, string2, object})[i8];
                if (string4 == null && stringArray[i8] == null) {
                    return 0;
                }
                int n8 = string4.compareTo(stringArray[i8]);
                if (n8 == 0) continue;
                return n8;
            }
            return 0;
        }
    }
}

