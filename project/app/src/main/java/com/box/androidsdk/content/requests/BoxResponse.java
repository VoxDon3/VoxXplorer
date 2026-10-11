/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.requests;

import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.requests.BoxRequest;
import java.io.Serializable;

public class BoxResponse<E extends BoxObject>
implements Serializable {
    protected final Exception mException;
    protected final BoxRequest mRequest;
    protected final E mResult;

    public BoxResponse(E e8, Exception exception, BoxRequest boxRequest) {
        this.mResult = e8;
        this.mException = exception;
        this.mRequest = boxRequest;
    }

    public Exception a() {
        return this.mException;
    }

    public E b() {
        return this.mResult;
    }

    public boolean c() {
        return this.mException == null;
    }
}

