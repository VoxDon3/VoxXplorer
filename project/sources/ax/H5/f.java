package ax.H5;

import ax.M5.C0821p;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class f implements Runnable {
    private static final ax.P5.a d0 = new ax.P5.a("RevokeAccessOperation", new String[0]);
    private final ax.L5.m c0 = new ax.L5.m(null);
    private final String q;

    public f(String str) {
        this.q = C0821p.f(str);
    }

    public static ax.K5.h a(String str) {
        if (str == null) {
            return ax.K5.i.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.i0;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.q).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.g0;
            } else {
                d0.b("Unable to revoke access!", new Object[0]);
            }
            d0.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            d0.b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            d0.b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.c0.f(status);
    }
}
