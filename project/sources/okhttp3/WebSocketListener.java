package okhttp3;

import ax.Gb.l;
import ax.xc.h;

/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        l.f(webSocket, "webSocket");
        l.f(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        l.f(webSocket, "webSocket");
        l.f(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        l.f(webSocket, "webSocket");
        l.f(th, "t");
    }

    public void onMessage(WebSocket webSocket, h hVar) {
        l.f(webSocket, "webSocket");
        l.f(hVar, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        l.f(webSocket, "webSocket");
        l.f(response, "response");
    }

    public void onMessage(WebSocket webSocket, String str) {
        l.f(webSocket, "webSocket");
        l.f(str, "text");
    }
}
