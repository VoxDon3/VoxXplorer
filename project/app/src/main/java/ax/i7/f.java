/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.j;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class f
implements j {
    @Override
    public void a(y y8, OutputStream outputStream) throws IOException {
        outputStream = new GZIPOutputStream((OutputStream)new AutoCloseable(this, outputStream){
            final f q;
            {
                this.q = f8;
                super(outputStream);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void close() throws IOException {
                try {
                    ((OutputStream)this).flush();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
            }
        });
        y8.b(outputStream);
        outputStream.close();
    }

    @Override
    public String getName() {
        return "gzip";
    }
}

