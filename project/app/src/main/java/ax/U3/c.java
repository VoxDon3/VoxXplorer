/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.util.Log;
import ax.M3.d;
import ax.M3.j;
import ax.k4.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c
implements d<ByteBuffer> {
    public boolean c(ByteBuffer byteBuffer, File file, j j8) {
        try {
            a.d(byteBuffer, file);
            return true;
        }
        catch (IOException iOException) {
            if (Log.isLoggable((String)"ByteBufferEncoder", (int)3)) {
                Log.d((String)"ByteBufferEncoder", (String)"Failed to write data", (Throwable)iOException);
            }
            return false;
        }
    }
}

