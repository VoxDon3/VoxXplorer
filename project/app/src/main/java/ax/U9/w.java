/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.text.TextUtils;
import ax.U9.n;
import ax.U9.q;
import ax.U9.y;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicNameValuePair;

class w
extends y {
    private final n d = n.e0;
    private final String e;
    private final String f;

    public w(HttpClient httpClient, String string, String string2, String string3, q q8) {
        super(httpClient, string, q8);
        if (string2 != null) {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                if (string3 != null) {
                    if (!TextUtils.isEmpty((CharSequence)string3)) {
                        this.e = string2;
                        this.f = string3;
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

    @Override
    protected void a(List<NameValuePair> list) {
        list.add((NameValuePair)new BasicNameValuePair("refresh_token", this.e));
        list.add((NameValuePair)new BasicNameValuePair("scope", this.f));
        list.add((NameValuePair)new BasicNameValuePair("grant_type", ((Object)((Object)this.d)).toString()));
    }
}

