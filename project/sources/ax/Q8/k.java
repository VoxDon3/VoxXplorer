package ax.Q8;

/* loaded from: classes3.dex */
public enum k implements ax.Y8.c<k> {
    SMB2_GLOBAL_CAP_DFS(1),
    SMB2_GLOBAL_CAP_LEASING(2),
    SMB2_GLOBAL_CAP_LARGE_MTU(4),
    SMB2_GLOBAL_CAP_MULTI_CHANNEL(8),
    SMB2_GLOBAL_CAP_PERSISTENT_HANDLES(16),
    SMB2_GLOBAL_CAP_DIRECTORY_LEASING(32),
    SMB2_GLOBAL_CAP_ENCRYPTION(64);

    private long q;

    k(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
