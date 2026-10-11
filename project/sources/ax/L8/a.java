package ax.L8;

import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public enum a implements ax.Y8.c<a> {
    FILE_ATTRIBUTE_ARCHIVE(32),
    FILE_ATTRIBUTE_COMPRESSED(2048),
    FILE_ATTRIBUTE_DIRECTORY(16),
    FILE_ATTRIBUTE_ENCRYPTED(Http2Stream.EMIT_BUFFER_SIZE),
    FILE_ATTRIBUTE_HIDDEN(2),
    FILE_ATTRIBUTE_NORMAL(128),
    FILE_ATTRIBUTE_NOT_CONTENT_INDEXED(8192),
    FILE_ATTRIBUTE_OFFLINE(4096),
    FILE_ATTRIBUTE_READONLY(1),
    FILE_ATTRIBUTE_REPARSE_POINT(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE),
    FILE_ATTRIBUTE_SPARSE_FILE(512),
    FILE_ATTRIBUTE_SYSTEM(4),
    FILE_ATTRIBUTE_TEMPORARY(256),
    FILE_ATTRIBUTE_INTEGRITY_STREAM(32768),
    FILE_ATTRIBUTE_NO_SCRUB_DATA(131072);

    private long q;

    a(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
