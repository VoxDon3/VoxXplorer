/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.xc.D;
import java.io.IOException;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

public interface Call
extends Cloneable {
    public void cancel();

    public Call clone();

    public void enqueue(Callback var1);

    public Response execute() throws IOException;

    public boolean isCanceled();

    public boolean isExecuted();

    public Request request();

    public D timeout();

    public static interface Factory {
        public Call newCall(Request var1);
    }
}

