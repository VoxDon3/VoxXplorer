/*
 * Decompiled with CFR 0.152.
 */
package ax.t4;

import ax.T4.g;
import ax.t4.b;
import ax.w4.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.TimeZone;

public abstract class c<T> {
    private static final TimeZone a = java.util.DesugarTimeZone.getTimeZone((String)"UTC");
    private static final String[] b = new String[]{null, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String[] c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", null};

    public abstract void a(T var1, g var2) throws IOException;

    public final String b(T t8) {
        return this.c(t8, true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(T t8, boolean bl) {
        g g8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g g9;
            g8 = g9 = ax.t4.b.l.p(byteArrayOutputStream);
            if (bl) {
                g8 = g9.f();
            }
        }
        catch (IOException iOException) {
            throw d.a("Impossible", iOException);
        }
        try {
            this.a(t8, g8);
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        }
        finally {
            g8.flush();
        }
    }
}

