/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.D;
import ax.ke.d;
import java.io.IOException;
import okhttp3.Request;

public interface b<T>
extends Cloneable {
    public void cancel();

    public b<T> clone();

    public D<T> execute() throws IOException;

    public boolean isCanceled();

    public Request request();

    public void u(d<T> var1);
}

