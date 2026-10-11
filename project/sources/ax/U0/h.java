package ax.U0;

import java.io.IOException;

/* loaded from: classes.dex */
public class h extends IOException {
    public final int q;

    public h(int i) {
        this.q = i;
    }

    public static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof h) && ((h) iOException2).q == 2008) {
                return true;
            }
        }
        return false;
    }

    public h(Throwable th, int i) {
        super(th);
        this.q = i;
    }

    public h(String str, int i) {
        super(str);
        this.q = i;
    }

    public h(String str, Throwable th, int i) {
        super(str, th);
        this.q = i;
    }
}
