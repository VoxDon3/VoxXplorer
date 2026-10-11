/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.xc.h;
import okhttp3.Request;
import okhttp3.WebSocketListener;

public interface WebSocket {
    public void cancel();

    public boolean close(int var1, String var2);

    public long queueSize();

    public Request request();

    public boolean send(h var1);

    public boolean send(String var1);

    public static interface Factory {
        public WebSocket newWebSocket(Request var1, WebSocketListener var2);
    }
}

