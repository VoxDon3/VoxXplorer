/*
 * Decompiled with CFR 0.152.
 */
package ax.N7;

import ax.G7.g;
import ax.N7.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class a {
    private final String a;
    private final Map<String, String> b;
    private final Map<String, String> c;

    public a(String string, Map<String, String> map) {
        this.a = string;
        this.b = map;
        this.c = new HashMap<String, String>();
    }

    private String a(Map<String, String> object) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = object.entrySet().iterator();
        object = iterator.next();
        stringBuilder.append((String)object.getKey());
        stringBuilder.append("=");
        object = object.getValue() != null ? j.URLEncoder.encode((String)((String)object.getValue()), (String)"UTF-8") : "";
        stringBuilder.append((String)object);
        while (iterator.hasNext()) {
            object = iterator.next();
            stringBuilder.append("&");
            stringBuilder.append(object.getKey());
            stringBuilder.append("=");
            object = object.getValue() != null ? j.URLEncoder.encode((String)object.getValue(), (String)"UTF-8") : "";
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }

    private String b(String string, Map<String, String> object) throws UnsupportedEncodingException {
        CharSequence charSequence = this.a((Map<String, String>)object);
        if (((String)charSequence).isEmpty()) {
            return string;
        }
        if (string.contains("?")) {
            object = charSequence;
            if (!string.endsWith("&")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("&");
                ((StringBuilder)object).append((String)charSequence);
                object = ((StringBuilder)object).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append((String)object);
            return ((StringBuilder)charSequence).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("?");
        ((StringBuilder)object).append((String)charSequence);
        return ((StringBuilder)object).toString();
    }

    private String e(InputStream object) throws IOException {
        int n8;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)object, "UTF-8"));
        object = new char[8192];
        StringBuilder stringBuilder = new StringBuilder();
        while ((n8 = bufferedReader.read((char[])object)) != -1) {
            stringBuilder.append((char[])object, 0, n8);
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c c() throws IOException {
        RuntimeException var2_6;
        Object object;
        Object object2;
        block11: {
            Object object3;
            object2 = null;
            String string = null;
            try {
                object = this.b(this.a, this.b);
                object3 = g.f();
                Object object4 = new StringBuilder();
                ((StringBuilder)object4).append("GET Request URL: ");
                ((StringBuilder)object4).append((String)object);
                ((g)object3).i(((StringBuilder)object4).toString());
                object3 = new URL((String)object);
                object = (HttpsURLConnection)((URL)object3).openConnection();
            }
            catch (Throwable throwable) {
                object = null;
                break block11;
            }
            try {
                ((URLConnection)object).setReadTimeout(10000);
                ((URLConnection)object).setConnectTimeout(10000);
                ((HttpURLConnection)object).setRequestMethod("GET");
                for (Object object4 : this.c.entrySet()) {
                    ((URLConnection)object).addRequestProperty((String)object4.getKey(), (String)object4.getValue());
                }
            }
            catch (Throwable throwable) {
                break block11;
            }
            ((URLConnection)object).connect();
            int n8 = ((HttpURLConnection)object).getResponseCode();
            object3 = ((URLConnection)object).getInputStream();
            if (object3 != null) {
                try {
                    string = this.e((InputStream)object3);
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block11;
                }
            }
            if (object3 != null) {
                ((InputStream)object3).close();
            }
            ((HttpURLConnection)object).disconnect();
            return new c(n8, string);
        }
        if (object2 != null) {
            ((InputStream)object2).close();
        }
        if (object != null) {
            ((HttpURLConnection)object).disconnect();
        }
        throw var2_6;
    }

    public a d(String string, String string2) {
        this.c.put(string, string2);
        return this;
    }
}

