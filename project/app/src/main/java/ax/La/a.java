/*
 * Decompiled with CFR 0.152.
 */
package ax.La;

import ax.Ja.b;
import ax.La.c;
import com.socialnmobile.dav.gson.Multistatus;
import java.io.InputStream;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class a
extends c<Multistatus> {
    protected Multistatus c(InputStream inputStream) throws b {
        return ax.Oa.a.e(Multistatus.class, inputStream);
    }

    public Multistatus d(Response response) throws ax.Ja.a {
        super.b(response);
        Object object = response.body();
        if (object != null) {
            b b82;
            block4: {
                try {
                    object = this.c(((ResponseBody)object).byteStream());
                    return object;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                }
                catch (b b82) {
                    break block4;
                }
                ax.Ha.c.h().f().b("WEBDAV PARSE").l(arrayIndexOutOfBoundsException).h();
                throw new ax.Ja.a(arrayIndexOutOfBoundsException);
            }
            throw new ax.Ja.a(b82, response.code(), response.message());
        }
        throw new ax.Ja.a("No entity found in response", response.code(), response.message());
    }
}

