/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.text.TextUtils;
import ax.U9.f;
import ax.U9.p;
import ax.U9.t;
import ax.U9.u;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class v
implements t {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final p f;

    private v(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.f = b8.f;
        this.d = b8.d;
        this.c = b8.c;
        this.e = b8.e;
    }

    public static v b(Map<String, String> object) throws f {
        Object object2 = object.get("access_token");
        Object object3 = object.get("token_type");
        if (object2 != null) {
            if (object3 != null) {
                try {
                    object3 = p.valueOf(object3.toUpperCase());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", illegalArgumentException);
                }
                object2 = new b((String)object2, (p)((Object)object3));
                object3 = object.get("authentication_token");
                if (object3 != null) {
                    ((b)object2).g((String)object3);
                }
                if ((object3 = object.get("expires_in")) != null) {
                    int n8;
                    try {
                        n8 = Integer.parseInt(object3);
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new f("An error occured while communicating with the server during the operation. Please try again later.", numberFormatException);
                    }
                    ((b)object2).i(n8);
                }
                if ((object = object.get("scope")) != null) {
                    ((b)object2).k((String)object);
                }
                return ((b)object2).h();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public static v c(JSONObject object) throws f {
        if (v.n(object)) {
            IllegalArgumentException illegalArgumentException2;
            block24: {
                Object object2;
                Object object3;
                try {
                    object3 = object.getString("access_token");
                }
                catch (JSONException jSONException) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", jSONException);
                }
                try {
                    object2 = object.getString("token_type");
                }
                catch (JSONException jSONException) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", jSONException);
                }
                try {
                    object2 = p.valueOf(object2.toUpperCase());
                }
                catch (NullPointerException nullPointerException) {
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block24;
                }
                object3 = new b((String)object3, (p)((Object)object2));
                if (object.has("authentication_token")) {
                    try {
                        object2 = object.getString("authentication_token");
                        ((b)object3).g((String)object2);
                    }
                    catch (JSONException jSONException) {
                        throw new f("An error occured on the client during the operation.", jSONException);
                    }
                }
                if (object.has("refresh_token")) {
                    try {
                        object2 = object.getString("refresh_token");
                        ((b)object3).j((String)object2);
                    }
                    catch (JSONException jSONException) {
                        throw new f("An error occured on the client during the operation.", jSONException);
                    }
                }
                if (object.has("expires_in")) {
                    try {
                        int n8 = object.getInt("expires_in");
                        ((b)object3).i(n8);
                    }
                    catch (JSONException jSONException) {
                        throw new f("An error occured on the client during the operation.", jSONException);
                    }
                }
                if (object.has("scope")) {
                    try {
                        object = object.getString("scope");
                        ((b)object3).k((String)object);
                    }
                    catch (JSONException jSONException) {
                        throw new f("An error occured on the client during the operation.", jSONException);
                    }
                }
                return ((b)object3).h();
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", nullPointerException);
            }
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", illegalArgumentException2);
        }
        throw new AssertionError();
    }

    public static boolean n(JSONObject jSONObject) {
        return jSONObject.has("access_token") && jSONObject.has("token_type");
    }

    @Override
    public void a(u u8) {
        u8.a(this);
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.e;
    }

    public p i() {
        return this.f;
    }

    public boolean j() {
        String string = this.b;
        return string != null && !TextUtils.isEmpty((CharSequence)string);
    }

    public boolean k() {
        return this.c != -1;
    }

    public boolean l() {
        String string = this.d;
        return string != null && !TextUtils.isEmpty((CharSequence)string);
    }

    public boolean m() {
        String string = this.e;
        return string != null && !TextUtils.isEmpty((CharSequence)string);
    }

    public String toString() {
        return String.format("OAuthSuccessfulResponse [accessToken=%s, authenticationToken=%s, tokenType=%s, refreshToken=%s, expiresIn=%s, scope=%s]", new Object[]{this.a, this.b, this.f, this.d, this.c, this.e});
    }

    public static class b {
        private final String a;
        private String b;
        private int c = -1;
        private String d;
        private String e;
        private final p f;

        public b(String string, p p8) {
            if (string != null) {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    if (p8 != null) {
                        this.a = string;
                        this.f = p8;
                        return;
                    }
                    throw new AssertionError();
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }

        public b g(String string) {
            this.b = string;
            return this;
        }

        public v h() {
            return new v(this);
        }

        public b i(int n8) {
            this.c = n8;
            return this;
        }

        public b j(String string) {
            this.d = string;
            return this;
        }

        public b k(String string) {
            this.e = string;
            return this;
        }
    }
}

