package ax.Q8;

import j$.util.DesugarCollections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes3.dex */
public enum u implements ax.Y8.c<u> {
    FILE_SHARE_READ(1),
    FILE_SHARE_WRITE(2),
    FILE_SHARE_DELETE(4);

    public static final Set<u> f0 = DesugarCollections.unmodifiableSet(EnumSet.allOf(u.class));
    private long q;

    u(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
