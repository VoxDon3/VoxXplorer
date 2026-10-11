package ax.La;

import com.socialnmobile.dav.gson.Multistatus;
import java.io.InputStream;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class a extends c<Multistatus> {
    protected Multistatus c(InputStream inputStream) throws ax.Ja.b {
        return (Multistatus) ax.Oa.a.e(Multistatus.class, inputStream);
    }

    @Override // ax.La.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Multistatus a(Response response) throws ax.Ja.a {
        super.b(response);
        ResponseBody body = response.body();
        if (body == null) {
            throw new ax.Ja.a("No entity found in response", response.code(), response.message());
        }
        try {
            return c(body.byteStream());
        } catch (ax.Ja.b e) {
            throw new ax.Ja.a(e, response.code(), response.message());
        } catch (ArrayIndexOutOfBoundsException e2) {
            ax.Ha.c.h().f().b("WEBDAV PARSE").l(e2).h();
            throw new ax.Ja.a(e2);
        }
    }
}
