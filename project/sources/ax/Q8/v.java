package ax.Q8;

/* loaded from: classes3.dex */
public enum v implements ax.Y8.c<v> {
    SMB2_SHARE_CAP_DFS(8),
    SMB2_SHARE_CAP_CONTINUOUS_AVAILABILITY(16),
    SMB2_SHARE_CAP_SCALEOUT(32),
    SMB2_SHARE_CAP_CLUSTER(64),
    SMB2_SHARE_CAP_ASYMMETRIC(128);

    private long q;

    v(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
