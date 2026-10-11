package ax.La;

import android.util.Log;
import java.io.IOException;
import okhttp3.Response;

/* loaded from: classes3.dex */
public abstract class c<T> {
    public abstract T a(Response response) throws ax.Ja.a;

    protected void b(Response response) throws ax.Ja.a {
        if (response.isSuccessful()) {
            return;
        }
        if (response.body() != null) {
            try {
                Log.e("WebDAV", "ValidateResponse failed  : " + response.code() + "," + response.message() + "," + new String(response.body().bytes()));
            } catch (IOException unused) {
            }
        }
        throw new ax.Ja.a("Unexpected response", response.code(), response.message());
    }
}
