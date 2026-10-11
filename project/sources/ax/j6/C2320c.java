package ax.j6;

/* renamed from: ax.j6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2320c extends IllegalStateException {
    private C2320c(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC2327j<?> abstractC2327j) {
        if (!abstractC2327j.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i = abstractC2327j.i();
        return new C2320c("Complete with: ".concat(i != null ? "failure" : abstractC2327j.m() ? "result ".concat(String.valueOf(abstractC2327j.j())) : abstractC2327j.k() ? "cancellation" : "unknown issue"), i);
    }
}
