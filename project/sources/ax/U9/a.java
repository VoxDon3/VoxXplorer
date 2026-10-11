package ax.U9;

import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
class a extends y {
    private final String d;
    private final n e;

    public a(HttpClient httpClient, String str, String str2, q qVar) {
        super(httpClient, str, qVar);
        if (TextUtils.isEmpty(str2)) {
            throw new AssertionError();
        }
        this.d = str2;
        this.e = n.AUTHORIZATION_CODE;
    }

    @Override // ax.U9.y
    protected void a(List<NameValuePair> list) {
        list.add(new BasicNameValuePair("code", this.d));
        list.add(new BasicNameValuePair("redirect_uri", this.c.b().toString()));
        list.add(new BasicNameValuePair("grant_type", this.e.toString().toLowerCase(Locale.US)));
    }
}
