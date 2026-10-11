/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import ax.M5.p;
import ax.R5.a;
import ax.R5.j;
import ax.Z7.i;
import ax.a8.b;
import ax.e8.d;
import ax.e8.e;
import ax.e8.f;
import ax.j6.m;
import com.google.firebase.installations.d;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static final Pattern d = Pattern.compile("[0-9]+s");
    private static final Charset e = Charset.forName("UTF-8");
    private final Context a;
    private final b<i> b;
    private final e c;

    public c(Context context, b<i> b8) {
        this.a = context;
        this.b = b8;
        this.c = new e();
    }

    private static String a(String string, String string2, String string3) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(", ");
            stringBuilder.append(string);
            string = stringBuilder.toString();
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", string2, string3, string);
    }

    private static JSONObject b(String string, String string2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", (Object)string);
            jSONObject.put("appId", (Object)string2);
            jSONObject.put("authVersion", (Object)"FIS_v2");
            jSONObject.put("sdkVersion", (Object)"a:18.0.0");
            return jSONObject;
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException(jSONException);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", (Object)"a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", (Object)jSONObject);
            return jSONObject2;
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException(jSONException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String f() {
        try {
            Object object = this.a;
            object = ax.R5.a.a((Context)object, object.getPackageName());
            if (object != null) return j.b((byte[])object, false);
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not get fingerprint hash for package: ");
            ((StringBuilder)object).append(this.a.getPackageName());
            Log.e((String)"ContentValues", (String)((StringBuilder)object).toString());
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No such package: ");
        stringBuilder.append(this.a.getPackageName());
        Log.e((String)"ContentValues", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
        return null;
    }

    private URL g(String object) throws com.google.firebase.installations.d {
        try {
            object = new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", object));
            return object;
        }
        catch (MalformedURLException malformedURLException) {
            throw new com.google.firebase.installations.d(malformedURLException.getMessage(), d.a.c0);
        }
    }

    private static byte[] h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int n8) {
        return n8 >= 200 && n8 < 300;
    }

    private static void j() {
        Log.e((String)"Firebase-Installations", (String)"Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection object, String string, String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)(object = ax.e8.c.o((HttpURLConnection)object)))) {
            Log.w((String)"Firebase-Installations", (String)object);
            Log.w((String)"Firebase-Installations", (String)ax.e8.c.a(string, string2, string3));
        }
    }

    private HttpURLConnection l(URL object, String string) throws com.google.firebase.installations.d {
        block5: {
            ExecutionException executionException2;
            block6: {
                i i8;
                try {
                    object = (HttpURLConnection)((URL)object).openConnection();
                    ((URLConnection)object).setConnectTimeout(10000);
                    ((URLConnection)object).setUseCaches(false);
                    ((URLConnection)object).setReadTimeout(10000);
                    ((URLConnection)object).addRequestProperty("Content-Type", "application/json");
                    ((URLConnection)object).addRequestProperty("Accept", "application/json");
                    ((URLConnection)object).addRequestProperty("Content-Encoding", "gzip");
                    ((URLConnection)object).addRequestProperty("Cache-Control", "no-cache");
                    ((URLConnection)object).addRequestProperty("X-Android-Package", this.a.getPackageName());
                    i8 = this.b.get();
                    if (i8 == null) break block5;
                }
                catch (IOException iOException) {
                    throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
                }
                try {
                    ((URLConnection)object).addRequestProperty("x-firebase-client", m.a(i8.a()));
                    break block5;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (ExecutionException executionException2) {
                    break block6;
                }
                Thread.currentThread().interrupt();
                Log.w((String)"ContentValues", (String)"Failed to get heartbeats header", (Throwable)interruptedException);
                break block5;
            }
            Log.w((String)"ContentValues", (String)"Failed to get heartbeats header", (Throwable)executionException2);
        }
        ((URLConnection)object).addRequestProperty("X-Android-Cert", this.f());
        ((URLConnection)object).addRequestProperty("x-goog-api-key", string);
        return object;
    }

    static long m(String string) {
        p.b(d.matcher(string).matches(), "Invalid Expiration Timestamp.");
        if (string != null && string.length() != 0) {
            return Long.parseLong(string.substring(0, string.length() - 1));
        }
        return 0L;
    }

    private d n(HttpURLConnection object) throws AssertionError, IOException {
        InputStream inputStream = ((URLConnection)object).getInputStream();
        JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, e));
        object = f.a();
        d.a a8 = ax.e8.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            if (string.equals("name")) {
                a8.f(jsonReader.nextString());
                continue;
            }
            if (string.equals("fid")) {
                a8.c(jsonReader.nextString());
                continue;
            }
            if (string.equals("refreshToken")) {
                a8.d(jsonReader.nextString());
                continue;
            }
            if (string.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    string = jsonReader.nextName();
                    if (string.equals("token")) {
                        ((f.a)object).c(jsonReader.nextString());
                        continue;
                    }
                    if (string.equals("expiresIn")) {
                        ((f.a)object).d(ax.e8.c.m(jsonReader.nextString()));
                        continue;
                    }
                    jsonReader.skipValue();
                }
                a8.b(((f.a)object).a());
                jsonReader.endObject();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a8.e(d.b.q).a();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String o(HttpURLConnection object) {
        Throwable throwable2222222;
        Closeable closeable;
        block11: {
            StringBuilder stringBuilder;
            closeable = ((HttpURLConnection)object).getErrorStream();
            if (closeable == null) {
                return null;
            }
            closeable = new BufferedReader(new InputStreamReader((InputStream)closeable, e));
            try {
                String string;
                stringBuilder = new StringBuilder();
                while ((string = ((BufferedReader)closeable).readLine()) != null) {
                    stringBuilder.append(string);
                    stringBuilder.append('\n');
                }
            }
            catch (Throwable throwable2222222) {
                break block11;
            }
            object = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", ((HttpURLConnection)object).getResponseCode(), ((HttpURLConnection)object).getResponseMessage(), stringBuilder);
            ((BufferedReader)closeable).close();
            return object;
            {
                catch (IOException iOException) {
                    return object;
                }
            }
        }
        ((BufferedReader)closeable).close();
        {
            catch (IOException iOException) {
                throw throwable2222222;
            }
        }
        throw throwable2222222;
        catch (IOException iOException) {
            try {}
            catch (IOException iOException2) {
                return null;
            }
            ((BufferedReader)closeable).close();
            return null;
        }
    }

    private f p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        httpURLConnection = new JsonReader((Reader)new InputStreamReader(inputStream, e));
        f.a a8 = f.a();
        httpURLConnection.beginObject();
        while (httpURLConnection.hasNext()) {
            String string = httpURLConnection.nextName();
            if (string.equals("token")) {
                a8.c(httpURLConnection.nextString());
                continue;
            }
            if (string.equals("expiresIn")) {
                a8.d(ax.e8.c.m(httpURLConnection.nextString()));
                continue;
            }
            httpURLConnection.skipValue();
        }
        httpURLConnection.endObject();
        httpURLConnection.close();
        inputStream.close();
        return a8.b(f.b.q).a();
    }

    private void q(HttpURLConnection httpURLConnection, String string, String string2) throws IOException {
        ax.e8.c.s(httpURLConnection, ax.e8.c.h(ax.e8.c.b(string, string2)));
    }

    private void r(HttpURLConnection httpURLConnection) throws IOException {
        ax.e8.c.s(httpURLConnection, ax.e8.c.h(ax.e8.c.c()));
    }

    private static void s(URLConnection object, byte[] byArray) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if ((object = ((URLConnection)object).getOutputStream()) != null) {
            gZIPOutputStream = new GZIPOutputStream((OutputStream)object);
            ((OutputStream)gZIPOutputStream).write(byArray);
            return;
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        finally {
            ((OutputStream)gZIPOutputStream).close();
            ((OutputStream)object).close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d d(String object, String string, String string2, String string3, String string4) throws com.google.firebase.installations.d {
        int n8 = 0;
        if (!this.c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
        }
        URL uRL = this.g(String.format("projects/%s/installations", string2));
        while (true) {
            HttpURLConnection httpURLConnection;
            block12: {
                Throwable throwable222;
                block13: {
                    block11: {
                        block10: {
                            if (n8 > 1) {
                                throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
                            }
                            TrafficStats.setThreadStatsTag((int)32769);
                            httpURLConnection = this.l(uRL, (String)object);
                            try {
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setDoOutput(true);
                                if (string4 != null) {
                                    httpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", string4);
                                }
                                this.q(httpURLConnection, string, string3);
                                int n9 = httpURLConnection.getResponseCode();
                                this.c.f(n9);
                                if (ax.e8.c.i(n9)) {
                                    d d8 = this.n(httpURLConnection);
                                    object = d8;
                                    break block10;
                                }
                                ax.e8.c.k(httpURLConnection, string3, (String)object, string2);
                                if (n9 == 429) break block11;
                                if (n9 >= 500 && n9 < 600) break block12;
                                ax.e8.c.j();
                                d d9 = ax.e8.d.a().e(d.b.c0).a();
                                object = d9;
                            }
                            catch (Throwable throwable222) {
                                break block13;
                            }
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return object;
                    }
                    com.google.firebase.installations.d d10 = new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.d0);
                    throw d10;
                }
                httpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw throwable222;
                catch (IOException | AssertionError object2) {}
            }
            httpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++n8;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f e(String object, String object2, String string, String string2) throws com.google.firebase.installations.d {
        int n8 = 0;
        if (!this.c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
        }
        URL uRL = this.g(String.format("projects/%s/installations/%s/authTokens:generate", string, object2));
        while (true) {
            HttpURLConnection httpURLConnection;
            block12: {
                Throwable throwable222;
                block13: {
                    block9: {
                        block10: {
                            block11: {
                                if (n8 > 1) {
                                    throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.c0);
                                }
                                TrafficStats.setThreadStatsTag((int)32771);
                                httpURLConnection = this.l(uRL, (String)object);
                                try {
                                    httpURLConnection.setRequestMethod("POST");
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("FIS_v2 ");
                                    ((StringBuilder)object2).append(string2);
                                    httpURLConnection.addRequestProperty("Authorization", ((StringBuilder)object2).toString());
                                    httpURLConnection.setDoOutput(true);
                                    this.r(httpURLConnection);
                                    int n9 = httpURLConnection.getResponseCode();
                                    this.c.f(n9);
                                    if (ax.e8.c.i(n9)) {
                                        object = object2 = this.p(httpURLConnection);
                                        break block9;
                                    }
                                    ax.e8.c.k(httpURLConnection, null, (String)object, string);
                                    if (n9 == 401 || n9 == 404) break block10;
                                    if (n9 == 429) break block11;
                                    if (n9 >= 500 && n9 < 600) break block12;
                                    ax.e8.c.j();
                                    object = object2 = f.a().b(f.b.c0).a();
                                    break block9;
                                }
                                catch (Throwable throwable222) {
                                    break block13;
                                }
                            }
                            object2 = new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.d0);
                            throw object2;
                        }
                        object = object2 = f.a().b(f.b.d0).a();
                    }
                    httpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return object;
                }
                httpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw throwable222;
                catch (IOException | AssertionError object3) {}
            }
            httpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++n8;
        }
    }
}

