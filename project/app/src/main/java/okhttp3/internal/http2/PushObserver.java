/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.l;
import ax.xc.g;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;

public interface PushObserver {
    public static final PushObserver CANCEL;
    public static final Companion Companion;

    static {
        Companion = okhttp3.internal.http2.PushObserver$Companion.$$INSTANCE;
        CANCEL = new Companion.PushObserverCancel();
    }

    public boolean onData(int var1, g var2, int var3, boolean var4) throws IOException;

    public boolean onHeaders(int var1, List<Header> var2, boolean var3);

    public boolean onRequest(int var1, List<Header> var2);

    public void onReset(int var1, ErrorCode var2);

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final class PushObserverCancel
        implements PushObserver {
            @Override
            public boolean onData(int n8, g g8, int n9, boolean bl) throws IOException {
                l.f(g8, "source");
                g8.skip(n9);
                return true;
            }

            @Override
            public boolean onHeaders(int n8, List<Header> list, boolean bl) {
                l.f(list, "responseHeaders");
                return true;
            }

            @Override
            public boolean onRequest(int n8, List<Header> list) {
                l.f(list, "requestHeaders");
                return true;
            }

            @Override
            public void onReset(int n8, ErrorCode errorCode) {
                l.f((Object)errorCode, "errorCode");
            }
        }
    }
}

