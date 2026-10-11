package ax.U9;

import android.text.TextUtils;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
class w extends y {
    private final n d;
    private final String e;
    private final String f;

    public w(HttpClient httpClient, String str, String str2, String str3, q qVar) {
        super(httpClient, str, qVar);
        this.d = n.REFRESH_TOKEN;
        if (str2 == null) {
            throw new AssertionError();
        }
        if (TextUtils.isEmpty(str2)) {
            throw new AssertionError();
        }
        if (str3 == null) {
            throw new AssertionError();
        }
        if (TextUtils.isEmpty(str3)) {
            throw new AssertionError();
        }
        this.e = str2;
        this.f = str3;
    }

    @Override // ax.U9.y
    protected void a(List<NameValuePair> list) {
        list.add(new BasicNameValuePair("refresh_token", this.e));
        list.add(new BasicNameValuePair("scope", this.f));
        list.add(new BasicNameValuePair("grant_type", this.d.toString()));
    }
}
