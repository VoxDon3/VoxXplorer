package ax.U9;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class r implements t {
    private final m a;
    private final String b;
    private final String c;

    public static class b {
        private final m a;
        private String b;
        private String c;

        public b(m mVar) {
            if (mVar == null) {
                throw new AssertionError();
            }
            this.a = mVar;
        }

        public r d() {
            return new r(this);
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b f(String str) {
            this.c = str;
            return this;
        }
    }

    public static r b(JSONObject jSONObject) throws f {
        try {
            try {
                b bVar = new b(m.valueOf(jSONObject.getString("error").toUpperCase()));
                if (jSONObject.has("error_description")) {
                    try {
                        bVar.e(jSONObject.getString("error_description"));
                    } catch (JSONException e) {
                        throw new f("An error occured on the client during the operation.", e);
                    }
                }
                if (jSONObject.has("error_uri")) {
                    try {
                        bVar.f(jSONObject.getString("error_uri"));
                    } catch (JSONException e2) {
                        throw new f("An error occured on the client during the operation.", e2);
                    }
                }
                return bVar.d();
            } catch (IllegalArgumentException e3) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", e3);
            } catch (NullPointerException e4) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", e4);
            }
        } catch (JSONException e5) {
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", e5);
        }
    }

    public static boolean f(JSONObject jSONObject) {
        return jSONObject.has("error");
    }

    @Override // ax.U9.t
    public void a(u uVar) {
        uVar.b(this);
    }

    public m c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String toString() {
        return String.format("OAuthErrorResponse [error=%s, errorDescription=%s, errorUri=%s]", this.a.toString().toLowerCase(Locale.US), this.b, this.c);
    }

    private r(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
