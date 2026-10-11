package ax.p4;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x extends C2773j {
    private final long c0;

    public x(String str, String str2) {
        this(str, str2, 0L, TimeUnit.MILLISECONDS);
    }

    public long a() {
        return this.c0;
    }

    public x(String str, String str2, long j, TimeUnit timeUnit) {
        super(str, str2);
        this.c0 = timeUnit.toMillis(j);
    }
}
