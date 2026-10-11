/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import ax.K5.h;
import ax.K5.i;
import ax.L5.m;
import ax.M5.p;
import ax.P5.a;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class f
implements Runnable {
    private static final a d0 = new a("RevokeAccessOperation", new String[0]);
    private final m c0;
    private final String q;

    public f(String string) {
        this.q = p.f(string);
        this.c0 = new m(null);
    }

    public static h a(String object) {
        if (object == null) {
            return i.a(new Status(4), null);
        }
        object = new f((String)object);
        new Thread((Runnable)object).start();
        return ((f)object).c0;
    }

    @Override
    public final void run() {
        Status status;
        block22: {
            IOException iOException2;
            Status status2;
            block24: {
                int n8;
                Serializable serializable;
                Object object;
                Status status3;
                block21: {
                    block20: {
                        status3 = status = Status.i0;
                        status2 = status;
                        status3 = status;
                        status2 = status;
                        object = this.q;
                        status3 = status;
                        status2 = status;
                        status3 = status;
                        status2 = status;
                        StringBuilder stringBuilder = new StringBuilder();
                        status3 = status;
                        status2 = status;
                        stringBuilder.append("https://accounts.google.com/o/oauth2/revoke?token=");
                        status3 = status;
                        status2 = status;
                        stringBuilder.append((String)object);
                        status3 = status;
                        status2 = status;
                        serializable = new URL(stringBuilder.toString());
                        status3 = status;
                        status2 = status;
                        object = (HttpURLConnection)((URL)serializable).openConnection();
                        status3 = status;
                        status2 = status;
                        ((URLConnection)object).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        status3 = status;
                        status2 = status;
                        n8 = ((HttpURLConnection)object).getResponseCode();
                        if (n8 != 200) break block20;
                        status3 = status;
                        status2 = status;
                        status = Status.g0;
                        break block21;
                    }
                    status3 = status;
                    status2 = status;
                    d0.b("Unable to revoke access!", new Object[0]);
                }
                status3 = status;
                status2 = status;
                object = d0;
                status3 = status;
                status2 = status;
                status3 = status;
                status2 = status;
                serializable = new StringBuilder();
                status3 = status;
                status2 = status;
                ((StringBuilder)serializable).append("Response Code: ");
                status3 = status;
                status2 = status;
                ((StringBuilder)serializable).append(n8);
                status3 = status;
                status2 = status;
                try {
                    ((a)object).a(((StringBuilder)serializable).toString(), new Object[0]);
                    break block22;
                }
                catch (Exception exception) {
                }
                catch (IOException iOException2) {
                    break block24;
                }
                d0.b("Exception when revoking access: ".concat(String.valueOf(((Object)exception).toString())), new Object[0]);
                status = status3;
                break block22;
            }
            d0.b("IOException when revoking access: ".concat(String.valueOf(((Object)iOException2).toString())), new Object[0]);
            status = status2;
        }
        this.c0.f(status);
    }
}

