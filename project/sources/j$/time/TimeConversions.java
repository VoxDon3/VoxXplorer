package j$.time;

/* loaded from: classes2.dex */
public class TimeConversions {
    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.a, duration.b);
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        long seconds = duration.getSeconds();
        long nano = duration.getNano();
        Duration duration2 = Duration.ZERO;
        return Duration.j(j$.com.android.tools.r8.a.X(seconds, j$.com.android.tools.r8.a.N(nano, 1000000000L)), (int) j$.com.android.tools.r8.a.W(nano, 1000000000L));
    }
}
