/*
 * Decompiled with CFR 0.152.
 */
package ax.La;

import android.util.Log;
import ax.Ja.a;
import java.io.IOException;
import okhttp3.Response;

public abstract class c<T> {
    public abstract T a(Response var1) throws a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void b(Response response) throws a {
        if (response.isSuccessful()) {
            return;
        }
        if (response.body() == null) throw new a("Unexpected response", response.code(), response.message());
        try {
            String string = new String(response.body().bytes());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ValidateResponse failed  : ");
            stringBuilder.append(response.code());
            stringBuilder.append(",");
            stringBuilder.append(response.message());
            stringBuilder.append(",");
            stringBuilder.append(string);
            Log.e((String)"WebDAV", (String)stringBuilder.toString());
            throw new a("Unexpected response", response.code(), response.message());
        }
        catch (IOException iOException) {
            throw new a("Unexpected response", response.code(), response.message());
        }
    }
}

