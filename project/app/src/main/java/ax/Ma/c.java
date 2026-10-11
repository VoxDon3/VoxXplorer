/*
 * Decompiled with CFR 0.152.
 */
package ax.Ma;

import ax.Ma.a;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Response;

public class c
extends a {
    private static final Logger d0 = Logger.getLogger(c.class.getName());
    private Response c0;

    public c(Response response) throws IOException {
        super(response.body().byteStream());
        this.c0 = response;
    }

    @Override
    public void close() throws IOException {
        if (this.a().longValue() == this.c0.body().contentLength()) {
            super.close();
            return;
        }
        Logger logger = d0;
        if (logger.isLoggable(Level.WARNING)) {
            logger.warning(String.format("Abort connection for response %s", this.c0));
        }
        this.c0.close();
    }
}

