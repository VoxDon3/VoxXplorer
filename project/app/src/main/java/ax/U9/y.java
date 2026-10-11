/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.text.TextUtils;
import ax.U9.f;
import ax.U9.q;
import ax.U9.r;
import ax.U9.t;
import ax.U9.v;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

abstract class y {
    protected final HttpClient a;
    protected final String b;
    protected final q c;

    public y(HttpClient httpClient, String string, q q8) {
        if (httpClient != null) {
            if (string != null) {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    this.a = httpClient;
                    this.b = string;
                    this.c = q8;
                    return;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    protected abstract void a(List<NameValuePair> var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public t b() throws f {
        HttpPost httpPost = new HttpPost(this.c.c().toString());
        Object object = new ArrayList();
        object.add(new BasicNameValuePair("client_id", this.b));
        this.a((List<NameValuePair>)object);
        try {
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(object, "UTF-8");
            urlEncodedFormEntity.setContentType("application/x-www-form-urlencoded;charset=UTF-8");
            httpPost.setEntity((HttpEntity)urlEncodedFormEntity);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new f("An error occured on the client during the operation.", unsupportedEncodingException);
        }
        try {
            object = this.a.execute((HttpUriRequest)httpPost);
        }
        catch (IOException iOException) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", iOException);
        }
        catch (ClientProtocolException clientProtocolException22) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", clientProtocolException22);
        }
        object = object.getEntity();
        try {
            object = EntityUtils.toString((HttpEntity)object);
        }
        catch (IOException iOException) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", iOException);
        }
        try {
            object = new JSONObject((String)object);
        }
        catch (JSONException jSONException) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", jSONException);
        }
        if (r.f((JSONObject)object)) {
            return r.b((JSONObject)object);
        }
        if (!v.n((JSONObject)object)) throw new f("An error occured while communicating with the server during the operation. Please try again later.");
        return v.c((JSONObject)object);
    }
}

