package com.box.androidsdk.content.auth;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import com.box.androidsdk.content.utils.SdkUtils;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Formatter;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class OAuthWebView extends WebView {
    private String a;
    private String b;

    private static class InvalidUrlException extends Exception {
        private static final long serialVersionUID = 1;

        private InvalidUrlException() {
        }
    }

    public static class WebViewException extends Exception {
        private final String mDescription;
        private final int mErrorCode;
        private final String mFailingUrl;

        public WebViewException(int i, String str, String str2) {
            this.mErrorCode = i;
            this.mDescription = str;
            this.mFailingUrl = str2;
        }

        public String a() {
            return this.mDescription;
        }

        public int b() {
            return this.mErrorCode;
        }
    }

    public static class c extends WebViewClient {
        private boolean a;
        private f b;
        private String c;
        private d d;
        private g e;
        private Handler f = new Handler(Looper.getMainLooper());

        class a implements DialogInterface.OnClickListener {
            final /* synthetic */ HttpAuthHandler a;

            a(HttpAuthHandler httpAuthHandler) {
                this.a = httpAuthHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.cancel();
                c.this.b.c(new b(0, null));
            }
        }

        class b implements DialogInterface.OnClickListener {
            final /* synthetic */ View a;
            final /* synthetic */ HttpAuthHandler b;

            b(View view, HttpAuthHandler httpAuthHandler) {
                this.a = view;
                this.b = httpAuthHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                this.b.proceed(((EditText) this.a.findViewById(ax.I3.b.s)).getText().toString(), ((EditText) this.a.findViewById(ax.I3.b.o)).getText().toString());
            }
        }

        /* renamed from: com.box.androidsdk.content.auth.OAuthWebView$c$c, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0542c implements DialogInterface.OnClickListener {
            final /* synthetic */ SslErrorHandler a;

            DialogInterfaceOnClickListenerC0542c(SslErrorHandler sslErrorHandler) {
                this.a = sslErrorHandler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                c.this.a = true;
                this.a.cancel();
                c.this.b.c(new b(0, null));
            }
        }

        class d implements DialogInterface.OnClickListener {
            final /* synthetic */ WebView a;
            final /* synthetic */ SslError b;

            d(WebView webView, SslError sslError) {
                this.a = webView;
                this.b = sslError;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                c.this.i(this.a.getContext(), this.b);
            }
        }

        class e implements DialogInterface.OnDismissListener {
            e() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (c.this.a) {
                    return;
                }
                c.this.b.c(new b(0, null));
            }
        }

        public interface f {
            void a(String str, String str2);

            boolean c(b bVar);

            void e(String str);
        }

        class g implements Runnable {
            final WeakReference<WebView> c0;
            final String q;

            public g(WebView webView, String str) {
                this.q = str;
                this.c0 = new WeakReference<>(webView);
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.onReceivedError(this.c0.get(), -8, "loading timed out", this.q);
            }
        }

        public c(f fVar, String str) {
            this.b = fVar;
            this.c = str;
        }

        private String d(Context context, Date date) {
            return date == null ? HttpUrl.FRAGMENT_ENCODE_SET : DateFormat.getDateFormat(context).format(date);
        }

        private View e(Context context, SslCertificate sslCertificate) {
            View inflate = LayoutInflater.from(context).inflate(ax.I3.c.h, (ViewGroup) null);
            SslCertificate.DName issuedTo = sslCertificate.getIssuedTo();
            if (issuedTo != null) {
                ((TextView) inflate.findViewById(ax.I3.b.p)).setText(issuedTo.getCName());
                ((TextView) inflate.findViewById(ax.I3.b.q)).setText(issuedTo.getOName());
                ((TextView) inflate.findViewById(ax.I3.b.r)).setText(issuedTo.getUName());
            }
            SslCertificate.DName issuedBy = sslCertificate.getIssuedBy();
            if (issuedBy != null) {
                ((TextView) inflate.findViewById(ax.I3.b.g)).setText(issuedBy.getCName());
                ((TextView) inflate.findViewById(ax.I3.b.h)).setText(issuedBy.getOName());
                ((TextView) inflate.findViewById(ax.I3.b.i)).setText(issuedBy.getUName());
            }
            ((TextView) inflate.findViewById(ax.I3.b.k)).setText(d(context, sslCertificate.getValidNotBeforeDate()));
            ((TextView) inflate.findViewById(ax.I3.b.j)).setText(d(context, sslCertificate.getValidNotAfterDate()));
            return inflate;
        }

        private Uri f(String str) {
            Uri parse = Uri.parse(str);
            if (SdkUtils.l(this.c)) {
                return parse;
            }
            Uri parse2 = Uri.parse(this.c);
            if (parse2.getScheme() != null && parse2.getScheme().equals(parse.getScheme()) && parse2.getAuthority().equals(parse.getAuthority())) {
                return parse;
            }
            return null;
        }

        private String g(Uri uri, String str) throws InvalidUrlException {
            if (uri == null) {
                return null;
            }
            try {
                return uri.getQueryParameter(str);
            } catch (Exception unused) {
                return null;
            }
        }

        public void h(d dVar) {
            this.d = dVar;
        }

        protected void i(Context context, SslError sslError) {
            new AlertDialog.Builder(context).setTitle(ax.I3.d.g).setView(e(context, sslError.getCertificate())).create().show();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            g gVar = this.e;
            if (gVar != null) {
                this.f.removeCallbacks(gVar);
            }
            super.onPageFinished(webView, str);
            d dVar = this.d;
            if (dVar != null) {
                dVar.d(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                Uri f2 = f(str);
                String g2 = g(f2, "code");
                if (!SdkUtils.l(g2) && (webView instanceof OAuthWebView) && !SdkUtils.l(((OAuthWebView) webView).getStateString())) {
                    if (!((OAuthWebView) webView).getStateString().equals(f2.getQueryParameter("state"))) {
                        throw new InvalidUrlException();
                    }
                }
                if (!SdkUtils.l(g(f2, "error"))) {
                    this.b.c(new b(0, null));
                } else if (!SdkUtils.l(g2)) {
                    String g3 = g(f2, "base_domain");
                    if (g3 != null) {
                        this.b.a(g2, g3);
                    } else {
                        this.b.e(g2);
                    }
                }
            } catch (InvalidUrlException unused) {
                this.b.c(new b(1, null));
            }
            g gVar = this.e;
            if (gVar != null) {
                this.f.removeCallbacks(gVar);
            }
            g gVar2 = new g(webView, str);
            this.e = gVar2;
            this.f.postDelayed(gVar2, 30000L);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            g gVar = this.e;
            if (gVar != null) {
                this.f.removeCallbacks(gVar);
            }
            if (this.b.c(new b(new WebViewException(i, str, str2)))) {
                return;
            }
            if (i != -8) {
                if (i == -6 || i == -2) {
                    if (!SdkUtils.m(webView.getContext())) {
                        String j = SdkUtils.j(webView.getContext(), "offline.html");
                        Formatter formatter = new Formatter();
                        formatter.format(j, webView.getContext().getString(ax.I3.d.r), webView.getContext().getString(ax.I3.d.s), webView.getContext().getString(ax.I3.d.t));
                        webView.loadDataWithBaseURL(null, formatter.toString(), "text/html", "UTF-8", null);
                        formatter.close();
                    }
                }
                super.onReceivedError(webView, i, str, str2);
            }
            String j2 = SdkUtils.j(webView.getContext(), "offline.html");
            Formatter formatter2 = new Formatter();
            formatter2.format(j2, webView.getContext().getString(ax.I3.d.C), webView.getContext().getString(ax.I3.d.D), webView.getContext().getString(ax.I3.d.E));
            webView.loadDataWithBaseURL(null, formatter2.toString(), "text/html", "UTF-8", null);
            formatter2.close();
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            View inflate = LayoutInflater.from(webView.getContext()).inflate(ax.I3.c.c, (ViewGroup) null);
            new AlertDialog.Builder(webView.getContext()).setTitle(ax.I3.d.k).setView(inflate).setPositiveButton(ax.I3.d.j, new b(inflate, httpAuthHandler)).setNegativeButton(ax.I3.d.i, new a(httpAuthHandler)).create().show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            g gVar = this.e;
            if (gVar != null) {
                this.f.removeCallbacks(gVar);
            }
            Resources resources = webView.getContext().getResources();
            StringBuilder sb = new StringBuilder(resources.getString(ax.I3.d.h));
            sb.append(" ");
            int primaryError = sslError.getPrimaryError();
            sb.append(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? resources.getString(ax.I3.d.y) : resources.getString(ax.I3.d.y) : webView.getResources().getString(ax.I3.d.v) : resources.getString(ax.I3.d.A) : resources.getString(ax.I3.d.x) : resources.getString(ax.I3.d.w) : resources.getString(ax.I3.d.z));
            sb.append(" ");
            sb.append(resources.getString(ax.I3.d.B));
            this.a = false;
            AlertDialog.Builder negativeButton = new AlertDialog.Builder(webView.getContext()).setTitle(ax.I3.d.g).setMessage(sb.toString()).setIcon(ax.I3.a.a).setNegativeButton(ax.I3.d.e, new DialogInterfaceOnClickListenerC0542c(sslErrorHandler));
            negativeButton.setNeutralButton(ax.I3.d.u, new d(webView, sslError));
            AlertDialog create = negativeButton.create();
            create.setOnDismissListener(new e());
            create.show();
        }
    }

    public interface d {
        void d(WebView webView, String str);
    }

    public OAuthWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(Uri.Builder builder) {
        String i = SdkUtils.i();
        this.a = i;
        builder.appendQueryParameter("state", i);
        loadUrl(builder.build().toString());
    }

    public void b(String str, String str2) {
        a(c(str, str2));
    }

    protected Uri.Builder c(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("account.box.com");
        builder.appendPath("api");
        builder.appendPath("oauth2");
        builder.appendPath("authorize");
        builder.appendQueryParameter("response_type", "code");
        builder.appendQueryParameter("client_id", str);
        builder.appendQueryParameter("redirect_uri", str2);
        String str3 = this.b;
        if (str3 != null) {
            builder.appendQueryParameter("box_login", str3);
        }
        return builder;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        String url = getUrl();
        if (url != null && url.contains("app.box.com")) {
            if (keyEvent.getKeyCode() == 20 && keyEvent.getAction() == 0) {
                dispatchKeyEvent(new KeyEvent(0, 61));
                return true;
            }
            if (keyEvent.getKeyCode() == 20 && keyEvent.getAction() == 1) {
                dispatchKeyEvent(new KeyEvent(1, 61));
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public String getStateString() {
        return this.a;
    }

    public void setBoxAccountEmail(String str) {
        this.b = str;
    }

    public static class b {
        public int a;
        public String b;
        public WebViewException c;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public b(WebViewException webViewException) {
            this(2, null);
            this.c = webViewException;
        }
    }
}
