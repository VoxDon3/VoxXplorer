/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.c;
import ax.xc.p;
import ax.xc.q;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class B
extends c {
    private final Socket a;

    public B(Socket socket) {
        l.f(socket, "socket");
        this.a = socket;
    }

    @Override
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void timedOut() {
        Exception exception2;
        block3: {
            try {
                this.a.close();
                return;
            }
            catch (AssertionError assertionError) {
            }
            catch (Exception exception2) {
                break block3;
            }
            if (!p.e(assertionError)) throw assertionError;
            Logger logger = q.a();
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to close timed out socket ");
            stringBuilder.append(this.a);
            logger.log(level, stringBuilder.toString(), (Throwable)((Object)assertionError));
            return;
        }
        Logger logger = q.a();
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to close timed out socket ");
        stringBuilder.append(this.a);
        logger.log(level, stringBuilder.toString(), exception2);
    }
}

