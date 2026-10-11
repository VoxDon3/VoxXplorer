package ax.Q8;

import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: ax.Q8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0921e implements ax.Y8.c<EnumC0921e> {
    FILE_DIRECTORY_FILE(1),
    FILE_WRITE_THROUGH(2),
    FILE_SEQUENTIAL_ONLY(4),
    FILE_NO_INTERMEDIATE_BUFFERING(8),
    FILE_SYNCHRONOUS_IO_ALERT(16),
    FILE_SYNCHRONOUS_IO_NONALERT(32),
    FILE_NON_DIRECTORY_FILE(64),
    FILE_COMPLETE_IF_OPLOCKED(256),
    FILE_NO_EA_KNOWLEDGE(512),
    FILE_RANDOM_ACCESS(2048),
    FILE_DELETE_ON_CLOSE(4096),
    FILE_OPEN_BY_FILE_ID(8192),
    FILE_OPEN_FOR_BACKUP_INTENT(Http2Stream.EMIT_BUFFER_SIZE),
    FILE_NO_COMPRESSION(32768),
    FILE_OPEN_REMOTE_INSTANCE(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE),
    FILE_OPEN_REQUIRING_OPLOCK(65536),
    FILE_DISALLOW_EXCLUSIVE(131072),
    FILE_RESERVE_OPFILTER(1048576),
    FILE_OPEN_REPARSE_POINT(2097152),
    FILE_OPEN_NO_RECALL(4194304),
    FILE_OPEN_FOR_FREE_SPACE_QUERY(8388608);

    private long q;

    EnumC0921e(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
