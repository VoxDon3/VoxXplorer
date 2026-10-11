/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import android.net.Uri;
import ax.Fb.p;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.v;
import ax.Qb.J;
import ax.n8.b;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public final class d
implements ax.p8.a {
    public static final a d = new a(null);
    private final b a;
    private final i b;
    private final String c;

    public d(b b8, i i8, String string) {
        l.f(b8, "appInfo");
        l.f(i8, "blockingDispatcher");
        l.f(string, "baseUrl");
        this.a = b8;
        this.b = i8;
        this.c = string;
    }

    public /* synthetic */ d(b b8, i i8, String string, int n8, g g8) {
        if ((n8 & 4) != 0) {
            string = "firebase-settings.crashlytics.com";
        }
        this(b8, i8, string);
    }

    private final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.b()).appendPath("settings").appendQueryParameter("build_version", this.a.a().a()).appendQueryParameter("display_version", this.a.a().f()).build().toString());
    }

    @Override
    public Object a(Map<String, String> object, p<? super JSONObject, ? super e<? super t>, ? extends Object> p8, p<? super String, ? super e<? super t>, ? extends Object> p9, e<? super t> e8) {
        if ((object = ax.Qb.g.g(this.b, new p<J, e<? super t>, Object>(this, object, p8, p9, null){
            int f0;
            final d g0;
            final Map<String, String> h0;
            final p<JSONObject, e<? super t>, Object> i0;
            final p<String, e<? super t>, Object> j0;
            {
                this.g0 = d8;
                this.h0 = map;
                this.i0 = p8;
                this.j0 = p9;
                super(2, e8);
            }

            @Override
            public final e<t> a(Object object, e<?> e8) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Object p(Object object) {
                Exception exception2;
                Object object2 = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1 && n8 != 2) {
                        if (n8 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    }
                    try {
                        o.b(object);
                        return t.a;
                    }
                    catch (Exception exception2) {}
                } else {
                    o.b(object);
                    {
                        p<JSONObject, e<? super t>, Object> p82;
                        object = this.g0.c().openConnection();
                        l.d(object, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                        Object object3 = (HttpsURLConnection)object;
                        ((HttpURLConnection)object3).setRequestMethod("GET");
                        ((URLConnection)object3).setRequestProperty("Accept", "application/json");
                        for (p<JSONObject, e<? super t>, Object> p82 : this.h0.entrySet()) {
                            ((URLConnection)object3).setRequestProperty(p82.getKey(), p82.getValue());
                        }
                        n8 = ((HttpURLConnection)object3).getResponseCode();
                        if (n8 != 200) {
                            object = this.j0;
                            p82 = new p<JSONObject, e<? super t>, Object>();
                            ((StringBuilder)((Object)p82)).append("Bad response code: ");
                            ((StringBuilder)((Object)p82)).append(n8);
                            p82 = ((StringBuilder)((Object)p82)).toString();
                            this.f0 = 2;
                            object = object.j(p82, this);
                            if (object != object2) return t.a;
                            return object2;
                        }
                        p82 = ((URLConnection)object3).getInputStream();
                        object3 = new InputStreamReader((InputStream)((Object)p82));
                        object = new BufferedReader((Reader)object3);
                        object3 = new StringBuilder();
                        v v8 = new v();
                        while (true) {
                            String string = ((BufferedReader)object).readLine();
                            v8.q = string;
                            if (string == null) {
                                ((BufferedReader)object).close();
                                ((InputStream)((Object)p82)).close();
                                object = new JSONObject(((StringBuilder)object3).toString());
                                p82 = this.i0;
                                this.f0 = 1;
                                if (p82.j((JSONObject)object, this) != object2) return t.a;
                                return object2;
                            }
                            ((StringBuilder)object3).append(string);
                        }
                    }
                }
                p<String, e<? super t>, Object> p9 = this.j0;
                String string = exception2.getMessage();
                object = string;
                if (string == null) {
                    object = ((Object)exception2).toString();
                }
                this.f0 = 3;
                if (p9.j((String)object, this) != object2) return t.a;
                return object2;
            }

            public final Object u(J j8, e<? super t> e8) {
                return (this.a(j8, e8)).p(t.a);
            }
        }, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

