/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Stream;

public final class a
extends BufferedReader
implements j.BufferedReaderRetargetInterface {
    public a(Reader reader) {
        super(reader);
    }

    public /* synthetic */ j.Stream lines() {
        return j.DesugarBufferedReader.lines((BufferedReader)this);
    }

    public /* synthetic */ Stream lines() {
        return j.Stream.Wrapper.convert((j.Stream)this.lines());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String readLine() throws IOException {
        CharSequence charSequence = new StringBuilder();
        Object object = this.lock;
        synchronized (object) {
            boolean bl = false;
            try {
                int n8;
                while ((n8 = ((Reader)this).read()) != -1) {
                    if (bl && n8 == 10) {
                        return ((StringBuilder)charSequence).substring(0, ((StringBuilder)charSequence).length() - 1);
                    }
                    bl = n8 == 13;
                    ((StringBuilder)charSequence).append((char)n8);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl13 : MonitorExitStatement: MONITOREXIT : var3_3
                charSequence = ((StringBuilder)charSequence).toString();
                object = charSequence;
                if (!((String)charSequence).isEmpty()) return object;
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

