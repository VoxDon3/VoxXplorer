package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes2.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        long time = date.getTime();
        Instant instant = Instant.c;
        long j = 1000;
        return Instant.L(j$.com.android.tools.r8.a.N(time, j), ((int) j$.com.android.tools.r8.a.W(time, j)) * 1000000);
    }
}
