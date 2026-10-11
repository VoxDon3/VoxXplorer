package ax.U8;

/* loaded from: classes3.dex */
public enum a implements ax.Y8.c<a> {
    MsvAvEOL(0),
    MsvAvNbComputerName(1),
    MsvAvNbDomainName(2),
    MsvAvDnsComputerName(3),
    MsvAvDnsDomainName(4),
    MsvAvDnsTreeName(5),
    MsvAvFlags(6),
    MsvAvTimestamp(7),
    MsvAvSingleHost(8),
    MsvAvTargetName(9),
    MsvAvChannelBindings(10);

    private final long q;

    a(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
