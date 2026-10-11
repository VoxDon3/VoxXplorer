/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import ax.sb.a;
import java.io.IOException;

public final class RouteException
extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
        l.f(iOException, "firstConnectException");
        super(iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        l.f(iOException, "e");
        a.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}

