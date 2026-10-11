/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import ax.U0.h;
import ax.U0.k;
import ax.U0.r;
import ax.q7.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class s
extends h {
    public final k c0;
    public final int d0;

    public s(k k8, int n8, int n9) {
        super(s.b(n8, n9));
        this.c0 = k8;
        this.d0 = n9;
    }

    public s(IOException iOException, k k8, int n8, int n9) {
        super(iOException, s.b(n8, n9));
        this.c0 = k8;
        this.d0 = n9;
    }

    public s(String string, k k8, int n8, int n9) {
        super(string, s.b(n8, n9));
        this.c0 = k8;
        this.d0 = n9;
    }

    public s(String string, IOException iOException, k k8, int n8, int n9) {
        super(string, iOException, s.b(n8, n9));
        this.c0 = k8;
        this.d0 = n9;
    }

    private static int b(int n8, int n9) {
        int n10 = n8;
        if (n8 == 2000) {
            n10 = n8;
            if (n9 == 1) {
                n10 = 2001;
            }
        }
        return n10;
    }

    public static s c(IOException iOException, k k8, int n8) {
        String string = iOException.getMessage();
        int n9 = iOException instanceof SocketTimeoutException ? 2002 : (iOException instanceof InterruptedIOException ? 1004 : (string != null && c.e(string).matches("cleartext.*not permitted.*") ? 2007 : 2001));
        if (n9 == 2007) {
            return new r(iOException, k8);
        }
        return new s(iOException, k8, n9, n8);
    }
}

