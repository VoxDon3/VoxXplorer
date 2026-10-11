package okhttp3;

import ax.xc.h;

/* loaded from: classes3.dex */
public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(h hVar);

    boolean send(String str);
}
