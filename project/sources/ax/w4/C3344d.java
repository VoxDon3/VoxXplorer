package ax.w4;

import java.util.Date;

/* renamed from: ax.w4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3344d {
    public static RuntimeException a(String str, Throwable th) {
        RuntimeException runtimeException = new RuntimeException(str + ": " + th.getMessage());
        runtimeException.initCause(th);
        return runtimeException;
    }

    public static Date b(Date date) {
        if (date == null) {
            return date;
        }
        long time = date.getTime();
        return new Date(time - (time % 1000));
    }
}
