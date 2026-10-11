/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.xc.h;
import okhttp3.Response;
import okhttp3.WebSocket;

public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int n8, String string) {
        l.f(webSocket, "webSocket");
        l.f(string, "reason");
    }

    public void onClosing(WebSocket webSocket, int n8, String string) {
        l.f(webSocket, "webSocket");
        l.f(string, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
        l.f(webSocket, "webSocket");
        l.f(throwable, "t");
    }

    public void onMessage(WebSocket webSocket, h h8) {
        l.f(webSocket, "webSocket");
        l.f(h8, "bytes");
    }

    public void onMessage(WebSocket webSocket, String string) {
        l.f(webSocket, "webSocket");
        l.f(string, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        l.f(webSocket, "webSocket");
        l.f(response, "response");
    }
}

