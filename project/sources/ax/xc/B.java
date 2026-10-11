package ax.xc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class B extends C3485c {
    private final Socket a;

    public B(Socket socket) {
        ax.Gb.l.f(socket, "socket");
        this.a = socket;
    }

    @Override // ax.xc.C3485c
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ax.xc.C3485c
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (!p.e(e)) {
                throw e;
            }
            logger2 = q.a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e);
        } catch (Exception e2) {
            logger = q.a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e2);
        }
    }
}
