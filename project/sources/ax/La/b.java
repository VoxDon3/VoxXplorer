package ax.La;

import com.socialnmobile.dav.gson.Multistatus;
import com.socialnmobile.dav.gson.ServerType;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public class b extends c<ServerType> {
    private int a;

    protected ServerType c(byte[] bArr) throws ax.Ja.b {
        int i;
        String str = new String(bArr);
        try {
            ax.Oa.a.e(Multistatus.class, new ByteArrayInputStream(bArr));
            int i2 = ServerType.TYPE_COMMON;
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.contains("http://nextcloud.org/ns")) {
                    i2 = ServerType.TYPE_NEXTCLOUD;
                    break;
                }
                if (readLine.contains("http://owncloud.org/ns")) {
                    i2 = ServerType.TYPE_OWNCLOUD;
                    break;
                }
            }
            int i3 = ServerType.TYPE_COMMON;
            if (i2 == i3 && (i = this.a) != i3) {
                i2 = i;
            }
            return new ServerType(i2);
        } catch (IOException e) {
            throw new ax.Ja.b(e);
        }
    }

    @Override // ax.La.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ServerType a(Response response) throws ax.Ja.a {
        super.b(response);
        ResponseBody body = response.body();
        if (body == null) {
            throw new ax.Ja.a("No entity found in response", response.code(), response.message());
        }
        String str = response.headers().get("Server");
        if (str == null || !str.startsWith("nginx/")) {
            this.a = ServerType.TYPE_COMMON;
        } else {
            this.a = ServerType.TYPE_NGINX;
        }
        try {
            return c(body.bytes());
        } catch (IOException e) {
            throw new ax.Ja.a(e, response.code(), response.message());
        }
    }
}
