/*
 * Decompiled with CFR 0.152.
 */
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
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import ax.I3.a;
import com.box.androidsdk.content.utils.SdkUtils;
import java.lang.ref.WeakReference;
import java.util.Date;

public class OAuthWebView
extends WebView {
    private String a;
    private String b;

    public OAuthWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(Uri.Builder builder) {
        String string;
        this.a = string = SdkUtils.i();
        builder.appendQueryParameter("state", string);
        this.loadUrl(builder.build().toString());
    }

    public void b(String string, String string2) {
        this.a(this.c(string, string2));
    }

    protected Uri.Builder c(String string, String string2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("account.box.com");
        builder.appendPath("api");
        builder.appendPath("oauth2");
        builder.appendPath("authorize");
        builder.appendQueryParameter("response_type", "code");
        builder.appendQueryParameter("client_id", string);
        builder.appendQueryParameter("redirect_uri", string2);
        string = this.b;
        if (string != null) {
            builder.appendQueryParameter("box_login", string);
        }
        return builder;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        String string = this.getUrl();
        if (string != null && string.contains("app.box.com")) {
            if (keyEvent.getKeyCode() == 20 && keyEvent.getAction() == 0) {
                this.dispatchKeyEvent(new KeyEvent(0, 61));
                return true;
            }
            if (keyEvent.getKeyCode() == 20 && keyEvent.getAction() == 1) {
                this.dispatchKeyEvent(new KeyEvent(1, 61));
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public String getStateString() {
        return this.a;
    }

    public void setBoxAccountEmail(String string) {
        this.b = string;
    }

    private static class InvalidUrlException
    extends Exception {
        private static final long serialVersionUID = 1L;

        private InvalidUrlException() {
        }
    }

    public static class WebViewException
    extends Exception {
        private final String mDescription;
        private final int mErrorCode;
        private final String mFailingUrl;

        public WebViewException(int n8, String string, String string2) {
            this.mErrorCode = n8;
            this.mDescription = string;
            this.mFailingUrl = string2;
        }

        public String a() {
            return this.mDescription;
        }

        public int b() {
            return this.mErrorCode;
        }
    }

    public static class b {
        public int a;
        public String b;
        public WebViewException c;

        public b(int n8, String string) {
            this.a = n8;
            this.b = string;
        }

        public b(WebViewException webViewException) {
            this(2, null);
            this.c = webViewException;
        }
    }

    public static class c
    extends WebViewClient {
        private boolean a;
        private f b;
        private String c;
        private d d;
        private g e;
        private Handler f = new Handler(Looper.getMainLooper());

        public c(f f8, String string) {
            this.b = f8;
            this.c = string;
        }

        static /* synthetic */ boolean c(c c8, boolean bl) {
            c8.a = bl;
            return bl;
        }

        private String d(Context context, Date date) {
            if (date == null) {
                return "";
            }
            return DateFormat.getDateFormat((Context)context).format(date);
        }

        private View e(Context object, SslCertificate sslCertificate) {
            View view = LayoutInflater.from((Context)object).inflate(ax.I3.c.h, null);
            Object object2 = sslCertificate.getIssuedTo();
            if (object2 != null) {
                ((TextView)view.findViewById(ax.I3.b.p)).setText((CharSequence)object2.getCName());
                ((TextView)view.findViewById(ax.I3.b.q)).setText((CharSequence)object2.getOName());
                ((TextView)view.findViewById(ax.I3.b.r)).setText((CharSequence)object2.getUName());
            }
            if ((object2 = sslCertificate.getIssuedBy()) != null) {
                ((TextView)view.findViewById(ax.I3.b.g)).setText((CharSequence)object2.getCName());
                ((TextView)view.findViewById(ax.I3.b.h)).setText((CharSequence)object2.getOName());
                ((TextView)view.findViewById(ax.I3.b.i)).setText((CharSequence)object2.getUName());
            }
            object2 = this.d((Context)object, sslCertificate.getValidNotBeforeDate());
            ((TextView)view.findViewById(ax.I3.b.k)).setText((CharSequence)object2);
            object = this.d((Context)object, sslCertificate.getValidNotAfterDate());
            ((TextView)view.findViewById(ax.I3.b.j)).setText((CharSequence)object);
            return view;
        }

        private Uri f(String string) {
            block2: {
                block3: {
                    Uri uri = Uri.parse((String)string);
                    string = uri;
                    if (SdkUtils.l(this.c)) break block2;
                    Uri uri2 = Uri.parse((String)this.c);
                    if (uri2.getScheme() == null || !uri2.getScheme().equals(uri.getScheme())) break block3;
                    string = uri;
                    if (uri2.getAuthority().equals(uri.getAuthority())) break block2;
                }
                string = null;
            }
            return string;
        }

        private String g(Uri object, String string) throws InvalidUrlException {
            if (object == null) {
                return null;
            }
            try {
                object = object.getQueryParameter(string);
                return object;
            }
            catch (Exception exception) {
                return null;
            }
        }

        public void h(d d8) {
            this.d = d8;
        }

        protected void i(Context context, SslError sslError) {
            new AlertDialog.Builder(context).setTitle(ax.I3.d.g).setView(this.e(context, sslError.getCertificate())).create().show();
        }

        public void onPageFinished(WebView webView, String string) {
            Object object = this.e;
            if (object != null) {
                this.f.removeCallbacks((Runnable)object);
            }
            super.onPageFinished(webView, string);
            object = this.d;
            if (object != null) {
                object.d(webView, string);
            }
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onPageStarted(WebView object, String string, Bitmap object2) {
            g g8;
            Object object3;
            String var2_3;
            block8: {
                try {
                    Object object4;
                    Uri uri = this.f((String)var2_3);
                    object3 = this.g(uri, "code");
                    if (!SdkUtils.l((String)object3) && object instanceof OAuthWebView && !SdkUtils.l(((OAuthWebView)((Object)object)).getStateString())) {
                        object4 = uri.getQueryParameter("state");
                        if (!((OAuthWebView)((Object)object)).getStateString().equals(object4)) {
                            object3 = new InvalidUrlException();
                            throw object3;
                        }
                    }
                    if (!SdkUtils.l(this.g(uri, "error"))) {
                        object3 = this.b;
                        object4 = new b(0, null);
                        object3.c((b)object4);
                        break block8;
                    }
                    if (SdkUtils.l((String)object3)) break block8;
                    object4 = this.g(uri, "base_domain");
                    if (object4 != null) {
                        this.b.a((String)object3, (String)object4);
                    } else {
                        this.b.e((String)object3);
                    }
                }
                catch (InvalidUrlException invalidUrlException) {
                    this.b.c(new b(1, null));
                }
            }
            object3 = this.e;
            if (object3 != null) {
                this.f.removeCallbacks((Runnable)object3);
            }
            this.e = g8 = new g(this, (WebView)object, (String)var2_3);
            this.f.postDelayed((Runnable)g8, 30000L);
        }

        /*
         * Exception decompiling
         */
        public void onReceivedError(WebView var1_1, int var2_2, String var3_3, String var4_4) {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String string, String string2) {
            string = LayoutInflater.from((Context)webView.getContext()).inflate(ax.I3.c.c, null);
            new AlertDialog.Builder(webView.getContext()).setTitle(ax.I3.d.k).setView((View)string).setPositiveButton(ax.I3.d.j, new DialogInterface.OnClickListener(){
                final View a;
                final HttpAuthHandler b;
                final c c;
                {
                    this.c = c8;
                    this.a = view;
                    this.b = httpAuthHandler;
                }

                public void onClick(DialogInterface object, int n8) {
                    object = ((EditText)this.a.findViewById(ax.I3.b.s)).getText().toString();
                    String string = ((EditText)this.a.findViewById(ax.I3.b.o)).getText().toString();
                    this.b.proceed((String)object, string);
                }
            }).setNegativeButton(ax.I3.d.i, new DialogInterface.OnClickListener(){
                final HttpAuthHandler a;
                final c b;
                {
                    this.b = c8;
                    this.a = httpAuthHandler;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                    this.a.cancel();
                    this.b.b.c(new b(0, null));
                }
            }).create().show();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Object object = this.e;
            if (object != null) {
                this.f.removeCallbacks((Runnable)object);
            }
            Resources resources = webView.getContext().getResources();
            StringBuilder stringBuilder = new StringBuilder(resources.getString(ax.I3.d.h));
            stringBuilder.append(" ");
            int n8 = sslError.getPrimaryError();
            object = n8 != 0 ? (n8 != 1 ? (n8 != 2 ? (n8 != 3 ? (n8 != 4 ? (n8 != 5 ? resources.getString(ax.I3.d.y) : resources.getString(ax.I3.d.y)) : webView.getResources().getString(ax.I3.d.v)) : resources.getString(ax.I3.d.A)) : resources.getString(ax.I3.d.x)) : resources.getString(ax.I3.d.w)) : resources.getString(ax.I3.d.z);
            stringBuilder.append((String)object);
            stringBuilder.append(" ");
            stringBuilder.append(resources.getString(ax.I3.d.B));
            this.a = false;
            sslErrorHandler = new AlertDialog.Builder(webView.getContext()).setTitle(ax.I3.d.g).setMessage((CharSequence)stringBuilder.toString()).setIcon(ax.I3.a.a).setNegativeButton(ax.I3.d.e, new DialogInterface.OnClickListener(){
                final SslErrorHandler a;
                final c b;
                {
                    this.b = c8;
                    this.a = sslErrorHandler;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                    com.box.androidsdk.content.auth.OAuthWebView$c.c(this.b, true);
                    this.a.cancel();
                    this.b.b.c(new b(0, null));
                }
            });
            sslErrorHandler.setNeutralButton(ax.I3.d.u, new DialogInterface.OnClickListener(){
                final WebView a;
                final SslError b;
                final c c;
                {
                    this.c = c8;
                    this.a = webView;
                    this.b = sslError;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                    this.c.i(this.a.getContext(), this.b);
                }
            });
            webView = sslErrorHandler.create();
            webView.setOnDismissListener(new DialogInterface.OnDismissListener(this){
                final c a;
                {
                    this.a = c8;
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    if (!this.a.a) {
                        this.a.b.c(new b(0, null));
                    }
                }
            });
            webView.show();
        }

        public static interface f {
            public void a(String var1, String var2);

            public boolean c(b var1);

            public void e(String var1);
        }

        class g
        implements Runnable {
            final WeakReference<WebView> c0;
            final c d0;
            final String q;

            public g(c c8, WebView webView, String string) {
                this.d0 = c8;
                this.q = string;
                this.c0 = new WeakReference<WebView>(webView);
            }

            @Override
            public void run() {
                this.d0.onReceivedError((WebView)this.c0.get(), -8, "loading timed out", this.q);
            }
        }
    }

    public static interface d {
        public void d(WebView var1, String var2);
    }
}

