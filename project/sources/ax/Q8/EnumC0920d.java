package ax.Q8;

/* renamed from: ax.Q8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0920d implements ax.Y8.c<EnumC0920d> {
    FILE_SUPERSEDE(0),
    FILE_OPEN(1),
    FILE_CREATE(2),
    FILE_OPEN_IF(3),
    FILE_OVERWRITE(4),
    FILE_OVERWRITE_IF(5);

    private long q;

    EnumC0920d(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
