package ax.L8;

/* loaded from: classes3.dex */
public enum c implements ax.Y8.c<c> {
    FILE_ACTION_ADDED(1),
    FILE_ACTION_REMOVED(2),
    FILE_ACTION_MODIFIED(3),
    FILE_ACTION_RENAMED_OLD_NAME(4),
    FILE_ACTION_RENAMED_NEW_NAME(5),
    FILE_ACTION_ADDED_STREAM(6),
    FILE_ACTION_REMOVED_STREAM(7),
    FILE_ACTION_MODIFIED_STREAM(8),
    FILE_ACTION_REMOVED_BY_DELETE(9),
    FILE_ACTION_ID_NOT_TUNNELLED(10),
    FILE_ACTION_TUNNELLED_ID_COLLISION(11);

    private long q;

    c(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
