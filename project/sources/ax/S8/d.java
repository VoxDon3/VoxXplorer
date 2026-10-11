package ax.S8;

/* loaded from: classes3.dex */
public enum d implements ax.Y8.c<d> {
    SMB2_PREAUTH_INTEGRITY_CAPABILITIES(1),
    SMB2_ENCRYPTION_CAPABILITIES(2),
    SMB2_COMPRESSION_CAPABILITIES(4),
    SMB2_NETNAME_NEGOTIATE_CONTEXT_ID(5);

    private long q;

    d(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
