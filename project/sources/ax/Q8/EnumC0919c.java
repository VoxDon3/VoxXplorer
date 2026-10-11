package ax.Q8;

/* renamed from: ax.Q8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0919c implements ax.Y8.c<EnumC0919c> {
    FILE_SUPERSEDED(0),
    FILE_OPENED(1),
    FILE_CREATED(2),
    FILE_OVERWRITTEN(3);

    private long q;

    EnumC0919c(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
