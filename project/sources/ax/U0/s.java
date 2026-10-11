package ax.U0;

import ax.q7.C2876c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class s extends h {
    public final k c0;
    public final int d0;

    public s(k kVar, int i, int i2) {
        super(b(i, i2));
        this.c0 = kVar;
        this.d0 = i2;
    }

    private static int b(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static s c(IOException iOException, k kVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C2876c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new r(iOException, kVar) : new s(iOException, kVar, i2, i);
    }

    public s(String str, k kVar, int i, int i2) {
        super(str, b(i, i2));
        this.c0 = kVar;
        this.d0 = i2;
    }

    public s(IOException iOException, k kVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.c0 = kVar;
        this.d0 = i2;
    }

    public s(String str, IOException iOException, k kVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.c0 = kVar;
        this.d0 = i2;
    }
}
