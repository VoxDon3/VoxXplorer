package ax.B2;

/* loaded from: classes.dex */
public enum r {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean h() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
