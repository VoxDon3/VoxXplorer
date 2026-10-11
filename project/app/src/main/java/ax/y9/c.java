/*
 * Decompiled with CFR 0.152.
 */
package ax.y9;

import com.jcraft.jsch.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class c {
    public static void a(Logger logger, int n8, String string, Throwable serializable) {
        Object object;
        block7: {
            if (!logger.isEnabled(n8)) {
                return;
            }
            object = string;
            if (serializable != null) {
                StringWriter stringWriter = new StringWriter();
                object = new PrintWriter(stringWriter, true);
                ((Throwable)serializable).printStackTrace((PrintWriter)object);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(string);
                ((StringBuilder)serializable).append(System.lineSeparator());
                ((StringBuilder)serializable).append(stringWriter.toString());
                object = ((StringBuilder)serializable).toString();
                break block7;
                finally {
                    ((PrintWriter)object).close();
                }
            }
        }
        logger.a(n8, (String)object);
    }
}

