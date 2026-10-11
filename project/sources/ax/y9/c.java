package ax.y9;

import com.jcraft.jsch.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes3.dex */
public final /* synthetic */ class c {
    public static void a(Logger logger, int i, String str, Throwable th) {
        if (logger.isEnabled(i)) {
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.close();
                    str = str + System.lineSeparator() + stringWriter.toString();
                } catch (Throwable th2) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            logger.a(i, str);
        }
    }
}
