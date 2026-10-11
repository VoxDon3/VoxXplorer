/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import ax.R.a;
import ax.R5.j;
import ax.i8.h;
import ax.i8.i;
import ax.i8.k;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {
    private static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;

    public ConfigFetchHttpClient(Context context, String string, String string2, String string3, long l8, long l9) {
        this.a = context;
        this.b = string;
        this.c = string2;
        this.d = ConfigFetchHttpClient.f(string);
        this.e = string3;
        this.f = l8;
        this.g = l9;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            boolean bl = jSONObject.get("state").equals("NO_CHANGE");
            return bl ^ true;
        }
        catch (JSONException jSONException) {
            return true;
        }
    }

    private String b(long l8) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
        return simpleDateFormat.format(l8);
    }

    private JSONObject c(String object, String string, Map<String, String> map, Long l8) throws h {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (object != null) {
            block5: {
                hashMap.put("appInstanceId", (String)object);
                hashMap.put("appInstanceIdToken", string);
                hashMap.put("appId", this.b);
                object = this.a.getResources().getConfiguration().locale;
                hashMap.put("countryCode", ((Locale)object).getCountry());
                int n8 = Build.VERSION.SDK_INT;
                hashMap.put("languageCode", ((Locale)object).toLanguageTag());
                hashMap.put("platformVersion", Integer.toString(n8));
                hashMap.put("timeZone", TimeZone.getDefault().getID());
                object = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                if (object == null) break block5;
                try {
                    hashMap.put("appVersion", ((PackageInfo)object).versionName);
                    hashMap.put("appBuild", Long.toString(ax.R.a.a((PackageInfo)object)));
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    // empty catch block
                }
            }
            hashMap.put("packageName", this.a.getPackageName());
            hashMap.put("sdkVersion", "22.0.0");
            hashMap.put("analyticsUserProperties", (String)new JSONObject(map));
            if (l8 != null) {
                hashMap.put("firstOpenTime", this.b(l8));
            }
            return new JSONObject(hashMap);
        }
        throw new h("Fetch failed: Firebase installation id is null.");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static c e(JSONObject var0, Date var1_3) throws h {
        block17: {
            try {
                var3_6 = com.google.firebase.remoteconfig.internal.c.l().d((Date)var1_3);
                var4_7 = null;
            }
            catch (JSONException var0_2) {
                throw new h("Fetch failed: fetch response could not be parsed.", var0_2);
            }
            try {
                var2_8 = var0 /* !! */ .getJSONObject("entries");
            }
            catch (JSONException var1_4) {
                var2_8 = null;
            }
            var1_3 = var3_6;
            if (var2_8 != null) {
                var1_3 = var3_6.b((JSONObject)var2_8);
            }
            try {
                var3_6 = var0 /* !! */ .getJSONArray("experimentDescriptions");
            }
            catch (JSONException var2_9) {
                var3_6 = null;
            }
            var2_8 = var1_3;
            if (var3_6 != null) {
                var2_8 = var1_3.c((JSONArray)var3_6);
            }
            try {
                var3_6 = var0 /* !! */ .getJSONObject("personalizationMetadata");
            }
            catch (JSONException var1_5) {
                var3_6 = null;
            }
            var1_3 = var2_8;
            if (var3_6 == null) ** GOTO lbl33
            var1_3 = var2_8.e((JSONObject)var3_6);
lbl33:
            // 2 sources

            if ((var2_8 = var0 /* !! */ .has("templateVersion") != false ? var0 /* !! */ .getString("templateVersion") : null) == null) break block17;
            var1_3.g(Long.parseLong((String)var2_8));
        }
        try {
            var0 /* !! */  = var0 /* !! */ .getJSONArray("rolloutMetadata");
        }
        catch (JSONException var0_1) {
            var0 /* !! */  = var4_7;
        }
        var2_8 = var1_3;
        if (var0 /* !! */  == null) ** GOTO lbl47
        var2_8 = var1_3.f((JSONArray)var0 /* !! */ );
lbl47:
        // 2 sources

        var0 /* !! */  = var2_8.a();
        return var0 /* !! */ ;
    }

    private static String f(String object) {
        if (((Matcher)(object = h.matcher((CharSequence)object))).matches()) {
            return ((Matcher)object).group(1);
        }
        return null;
    }

    private JSONObject g(URLConnection object) throws IOException, JSONException {
        int n8;
        object = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream(), "utf-8"));
        StringBuilder stringBuilder = new StringBuilder();
        while ((n8 = ((BufferedReader)object).read()) != -1) {
            stringBuilder.append((char)n8);
        }
        return new JSONObject(stringBuilder.toString());
    }

    private String h(String string, String string2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", string, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String i() {
        try {
            Object object = this.a;
            object = ax.R5.a.a((Context)object, object.getPackageName());
            if (object != null) return j.b((byte[])object, false);
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not get fingerprint hash for package: ");
            ((StringBuilder)object).append(this.a.getPackageName());
            Log.e((String)"FirebaseRemoteConfig", (String)((StringBuilder)object).toString());
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No such package: ");
        stringBuilder.append(this.a.getPackageName());
        Log.e((String)"FirebaseRemoteConfig", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
        return null;
    }

    private void j(HttpURLConnection httpURLConnection, String string) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", string);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void k(HttpURLConnection httpURLConnection, Map<String, String> object2) {
        for (Map.Entry entry : object2.entrySet()) {
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
    }

    private void l(HttpURLConnection object, byte[] byArray) throws IOException {
        ((HttpURLConnection)object).setFixedLengthStreamingMode(byArray.length);
        object = new BufferedOutputStream(((URLConnection)object).getOutputStream());
        ((OutputStream)object).write(byArray);
        ((OutputStream)object).flush();
        ((OutputStream)object).close();
    }

    private void m(HttpURLConnection httpURLConnection, String string, String string2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int)timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int)timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", string);
        this.j(httpURLConnection, string2);
        this.k(httpURLConnection, map);
    }

    HttpURLConnection d() throws i {
        try {
            Object object = new URL(this.h(this.d, this.e));
            object = (HttpURLConnection)((URL)object).openConnection();
            return object;
        }
        catch (IOException iOException) {
            throw new i(iOException.getMessage());
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Keep
    d.a fetch(HttpURLConnection object, String object2, String object3, Map<String, String> map, String string, Map<String, String> map2, Long l8, Date date) throws i {
        Throwable throwable222;
        block11: {
            Throwable var2_8;
            block12: {
                int n8;
                block10: {
                    this.m((HttpURLConnection)object, string, (String)object3, map2);
                    this.l((HttpURLConnection)object, this.c((String)object2, (String)object3, map, l8).toString().getBytes("utf-8"));
                    ((URLConnection)object).connect();
                    n8 = ((HttpURLConnection)object).getResponseCode();
                    if (n8 != 200) break block10;
                    object2 = ((URLConnection)object).getHeaderField("ETag");
                    object3 = this.g((URLConnection)object);
                    ((HttpURLConnection)object).disconnect();
                    try {
                        ((URLConnection)object).getInputStream().close();
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    object = ConfigFetchHttpClient.e((JSONObject)object3, date);
                    if (this.a((JSONObject)object3)) return d.a.b((c)object, (String)object2);
                    return d.a.a(date, (c)object);
                }
                try {
                    object2 = new k(n8, ((HttpURLConnection)object).getResponseMessage());
                    throw object2;
                }
                catch (Throwable throwable222) {
                    break block11;
                }
                catch (JSONException jSONException) {
                    break block12;
                }
                catch (IOException iOException) {}
            }
            object3 = new h("The client had an error while calling the backend!", (Throwable)var2_8);
            throw object3;
        }
        ((HttpURLConnection)object).disconnect();
        try {
            ((URLConnection)object).getInputStream().close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }
}

