/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    public c(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public long skip(long l8) throws IOException {
        long l9;
        long l10;
        for (l9 = 0L; l9 < l8; l9 += l10) {
            long l11;
            l10 = l11 = this.in.skip(l8 - l9);
            if (l11 != 0L) continue;
            if (((InputStream)this).read() < 0) break;
            l10 = 1L;
        }
        return l9;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

