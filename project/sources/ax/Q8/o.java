package ax.Q8;

/* loaded from: classes3.dex */
public enum o implements ax.Y8.c<o> {
    SMB2_FLAGS_SERVER_TO_REDIR(1),
    SMB2_FLAGS_ASYNC_COMMAND(2),
    SMB2_FLAGS_RELATED_OPERATIONS(4),
    SMB2_FLAGS_SIGNED(8),
    SMB2_FLAGS_PRIORITY_MASK(112),
    SMB2_FLAGS_DFS_OPERATIONS(268435456),
    SMB2_FLAGS_REPLAY_OPERATION(536870912);

    private long q;

    o(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
