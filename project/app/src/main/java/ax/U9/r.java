/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import ax.U9.f;
import ax.U9.m;
import ax.U9.t;
import ax.U9.u;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

class r
implements t {
    private final m a;
    private final String b;
    private final String c;

    private r(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
    }

    public static r b(JSONObject object) throws f {
        IllegalArgumentException illegalArgumentException2;
        block13: {
            Object object2;
            try {
                object2 = object.getString("error");
            }
            catch (JSONException jSONException) {
                throw new f("An error occured while communicating with the server during the operation. Please try again later.", jSONException);
            }
            try {
                object2 = m.valueOf(((String)object2).toUpperCase());
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                break block13;
            }
            object2 = new b((m)((Object)object2));
            if (object.has("error_description")) {
                try {
                    String string = object.getString("error_description");
                    ((b)object2).e(string);
                }
                catch (JSONException jSONException) {
                    throw new f("An error occured on the client during the operation.", jSONException);
                }
            }
            if (object.has("error_uri")) {
                try {
                    object = object.getString("error_uri");
                    ((b)object2).f((String)object);
                }
                catch (JSONException jSONException) {
                    throw new f("An error occured on the client during the operation.", jSONException);
                }
            }
            return ((b)object2).d();
            throw new f("An error occured while communicating with the server during the operation. Please try again later.", nullPointerException);
        }
        throw new f("An error occured while communicating with the server during the operation. Please try again later.", illegalArgumentException2);
    }

    public static boolean f(JSONObject jSONObject) {
        return jSONObject.has("error");
    }

    @Override
    public void a(u u8) {
        u8.b(this);
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
        return String.format("OAuthErrorResponse [error=%s, errorDescription=%s, errorUri=%s]", ((Object)((Object)this.a)).toString().toLowerCase(Locale.US), this.b, this.c);
    }

    public static class b {
        private final m a;
        private String b;
        private String c;

        public b(m m8) {
            if (m8 != null) {
                this.a = m8;
                return;
            }
            throw new AssertionError();
        }

        public r d() {
            return new r(this);
        }

        public b e(String string) {
            this.b = string;
            return this;
        }

        public b f(String string) {
            this.c = string;
            return this;
        }
    }
}

