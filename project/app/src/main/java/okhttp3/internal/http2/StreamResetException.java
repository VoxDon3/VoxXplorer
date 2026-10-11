/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.l;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

public final class StreamResetException
extends IOException {
    public final ErrorCode errorCode;

    public StreamResetException(ErrorCode errorCode) {
        l.f((Object)errorCode, "errorCode");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stream was reset: ");
        stringBuilder.append((Object)errorCode);
        super(stringBuilder.toString());
        this.errorCode = errorCode;
    }
}

