/*
 * Decompiled with CFR 0.152.
 */
package ax.a;

public final class b {
    private static final String a = "_COROUTINE";

    public static final /* synthetic */ StackTraceElement a(Throwable throwable, String string) {
        return b.b(throwable, string);
    }

    private static final StackTraceElement b(Throwable serializable, String string) {
        StackTraceElement stackTraceElement = ((Throwable)serializable).getStackTrace()[0];
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(a);
        ((StringBuilder)serializable).append('.');
        ((StringBuilder)serializable).append(string);
        return new StackTraceElement(((StringBuilder)serializable).toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}

