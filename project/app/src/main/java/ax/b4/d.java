/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.util.Log;
import ax.M3.j;
import ax.M3.l;
import ax.P3.s;
import ax.b4.c;
import ax.k4.a;
import java.io.File;
import java.io.IOException;

public class d
implements l<c> {
    @Override
    public ax.M3.c b(j j8) {
        return ax.M3.c.q;
    }

    public boolean c(s<c> object, File file, j j8) {
        object = object.get();
        try {
            a.d(((c)object).b(), file);
            return true;
        }
        catch (IOException iOException) {
            if (Log.isLoggable((String)"GifEncoder", (int)5)) {
                Log.w((String)"GifEncoder", (String)"Failed to encode GIF drawable data", (Throwable)iOException);
            }
            return false;
        }
    }
}

