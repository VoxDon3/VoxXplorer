package ax.U9;

import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
abstract class y {
    protected final HttpClient a;
    protected final String b;
    protected final q c;

    public y(HttpClient httpClient, String str, q qVar) {
        if (httpClient == null) {
            throw new AssertionError();
        }
        if (str == null) {
            throw new AssertionError();
        }
        if (TextUtils.isEmpty(str)) {
            throw new AssertionError();
        }
        this.a = httpClient;
        this.b = str;
        this.c = qVar;
    }

    protected abstract void a(List<NameValuePair> list);

    public t b() throws f {
        HttpPost httpPost = new HttpPost(this.c.c().toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("client_id", this.b));
        a(arrayList);
        try {
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, "UTF-8");
            urlEncodedFormEntity.setContentType("application/x-www-form-urlencoded;charset=UTF-8");
            httpPost.setEntity(urlEncodedFormEntity);
            try {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(EntityUtils.toString(this.a.execute(httpPost).getEntity()));
                        if (r.f(jSONObject)) {
                            return r.b(jSONObject);
                        }
                        if (v.n(jSONObject)) {
                            return v.c(jSONObject);
                        }
                        throw new f("An error occured while communicating with the server during the operation. Please try again later.");
                    } catch (JSONException e) {
                        throw new f("An error occured while communicating with the server during the operation. Please try again later.", e);
                    }
                } catch (IOException e2) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", e2);
                }
            } catch (ClientProtocolException e3) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", e3);
            } catch (IOException e4) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", e4);
            }
        } catch (UnsupportedEncodingException e5) {
            throw new f("An error occured on the client during the operation.", e5);
        }
    }
}
