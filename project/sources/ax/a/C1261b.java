package ax.a;

/* renamed from: ax.a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261b {
    private static final String a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
