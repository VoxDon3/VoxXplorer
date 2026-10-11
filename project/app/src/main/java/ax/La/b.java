/*
 * Decompiled with CFR 0.152.
 */
package ax.La;

import ax.Ja.a;
import ax.La.c;
import com.socialnmobile.dav.gson.Multistatus;
import com.socialnmobile.dav.gson.ServerType;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class b
extends c<ServerType> {
    private int a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected ServerType c(byte[] object) throws ax.Ja.b {
        int n8;
        int n9;
        block3: {
            String string = new String((byte[])object);
            try {
                Closeable closeable = new ByteArrayInputStream((byte[])object);
                ax.Oa.a.e(Multistatus.class, closeable);
                n9 = ServerType.TYPE_COMMON;
                object = new BufferedReader;
                closeable = new StringReader(string);
                ((BufferedReader)object)((Reader)closeable);
            }
            catch (IOException iOException) {
                throw new ax.Ja.b(iOException);
            }
            do {
                string = ((BufferedReader)object).readLine();
                n8 = n9;
                if (string == null) break block3;
                if (!string.contains("http://nextcloud.org/ns")) continue;
                n8 = ServerType.TYPE_NEXTCLOUD;
                break block3;
            } while (!string.contains("http://owncloud.org/ns"));
            n8 = ServerType.TYPE_OWNCLOUD;
        }
        int n10 = ServerType.TYPE_COMMON;
        n9 = n8;
        if (n8 != n10) return new ServerType(n9);
        int n11 = this.a;
        n9 = n8;
        if (n11 == n10) return new ServerType(n9);
        n9 = n11;
        return new ServerType(n9);
    }

    public ServerType d(Response response) throws a {
        super.b(response);
        Object object = response.body();
        if (object != null) {
            String string = response.headers().get("Server");
            this.a = string != null && string.startsWith("nginx/") ? ServerType.TYPE_NGINX : ServerType.TYPE_COMMON;
            try {
                object = ((ResponseBody)object).bytes();
                return this.c((byte[])object);
            }
            catch (IOException iOException) {
                throw new a(iOException, response.code(), response.message());
            }
        }
        throw new a("No entity found in response", response.code(), response.message());
    }
}

