package ax.Sc;

import j$.time.Duration;

/* loaded from: classes3.dex */
class b {
    static int a(Duration duration) {
        long millis = duration.toMillis();
        return (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
    }
}
