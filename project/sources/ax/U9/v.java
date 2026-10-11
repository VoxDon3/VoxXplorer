package ax.U9;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class v implements t {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final p f;

    public static class b {
        private final String a;
        private String b;
        private int c = -1;
        private String d;
        private String e;
        private final p f;

        public b(String str, p pVar) {
            if (str == null) {
                throw new AssertionError();
            }
            if (TextUtils.isEmpty(str)) {
                throw new AssertionError();
            }
            if (pVar == null) {
                throw new AssertionError();
            }
            this.a = str;
            this.f = pVar;
        }

        public b g(String str) {
            this.b = str;
            return this;
        }

        public v h() {
            return new v(this);
        }

        public b i(int i) {
            this.c = i;
            return this;
        }

        public b j(String str) {
            this.d = str;
            return this;
        }

        public b k(String str) {
            this.e = str;
            return this;
        }
    }

    public static v b(Map<String, String> map) throws f {
        String str = map.get("access_token");
        String str2 = map.get("token_type");
        if (str == null) {
            throw new AssertionError();
        }
        if (str2 == null) {
            throw new AssertionError();
        }
        try {
            b bVar = new b(str, p.valueOf(str2.toUpperCase()));
            String str3 = map.get("authentication_token");
            if (str3 != null) {
                bVar.g(str3);
            }
            String str4 = map.get("expires_in");
            if (str4 != null) {
                try {
                    bVar.i(Integer.parseInt(str4));
                } catch (NumberFormatException e) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", e);
                }
            }
            String str5 = map.get("scope");
            if (str5 != null) {
                bVar.k(str5);
            }
            return bVar.h();
        } catch (IllegalArgumentException e2) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", e2);
        }
    }

    public static v c(JSONObject jSONObject) throws f {
        if (!n(jSONObject)) {
            throw new AssertionError();
        }
        try {
            try {
                try {
                    b bVar = new b(jSONObject.getString("access_token"), p.valueOf(jSONObject.getString("token_type").toUpperCase()));
                    if (jSONObject.has("authentication_token")) {
                        try {
                            bVar.g(jSONObject.getString("authentication_token"));
                        } catch (JSONException e) {
                            throw new f("An error occured on the client during the operation.", e);
                        }
                    }
                    if (jSONObject.has("refresh_token")) {
                        try {
                            bVar.j(jSONObject.getString("refresh_token"));
                        } catch (JSONException e2) {
                            throw new f("An error occured on the client during the operation.", e2);
                        }
                    }
                    if (jSONObject.has("expires_in")) {
                        try {
                            bVar.i(jSONObject.getInt("expires_in"));
                        } catch (JSONException e3) {
                            throw new f("An error occured on the client during the operation.", e3);
                        }
                    }
                    if (jSONObject.has("scope")) {
                        try {
                            bVar.k(jSONObject.getString("scope"));
                        } catch (JSONException e4) {
                            throw new f("An error occured on the client during the operation.", e4);
                        }
                    }
                    return bVar.h();
                } catch (IllegalArgumentException e5) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", e5);
                } catch (NullPointerException e6) {
                    throw new f("An error occured while communicating with the server during the operation. Please try again later.", e6);
                }
            } catch (JSONException e7) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", e7);
            }
        } catch (JSONException e8) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", e8);
        }
    }

    public static boolean n(JSONObject jSONObject) {
        return jSONObject.has("access_token") && jSONObject.has("token_type");
    }

    @Override // ax.U9.t
    public void a(u uVar) {
        uVar.a(this);
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
        String str = this.b;
        return (str == null || TextUtils.isEmpty(str)) ? false : true;
    }

    public boolean k() {
        return this.c != -1;
    }

    public boolean l() {
        String str = this.d;
        return (str == null || TextUtils.isEmpty(str)) ? false : true;
    }

    public boolean m() {
        String str = this.e;
        return (str == null || TextUtils.isEmpty(str)) ? false : true;
    }

    public String toString() {
        return String.format("OAuthSuccessfulResponse [accessToken=%s, authenticationToken=%s, tokenType=%s, refreshToken=%s, expiresIn=%s, scope=%s]", this.a, this.b, this.f, this.d, Integer.valueOf(this.c), this.e);
    }

    private v(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f = bVar.f;
        this.d = bVar.d;
        this.c = bVar.c;
        this.e = bVar.e;
    }
}
