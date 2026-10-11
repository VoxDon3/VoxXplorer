/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.text.TextUtils;
import ax.U9.n;
import ax.U9.q;
import ax.U9.y;
import java.util.List;
import java.util.Locale;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicNameValuePair;

class a
extends y {
    private final String d;
    private final n e;

    public a(HttpClient httpClient, String string, String string2, q q8) {
        super(httpClient, string, q8);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            this.d = string2;
            this.e = n.q;
            return;
        }
        throw new AssertionError();
    }

    @Override
    protected void a(List<NameValuePair> list) {
        list.add((NameValuePair)new BasicNameValuePair("code", this.d));
        list.add((NameValuePair)new BasicNameValuePair("redirect_uri", this.c.b().toString()));
        list.add((NameValuePair)new BasicNameValuePair("grant_type", ((Object)((Object)this.e)).toString().toLowerCase(Locale.US)));
    }
}

