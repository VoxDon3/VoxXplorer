package ax.y8;

/* renamed from: ax.y8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3514c extends RuntimeException {
    public C3514c(String str) {
        super(str);
    }

    public C3514c(Throwable th, String str, Object... objArr) {
        super(String.format(str, objArr), th);
    }

    public C3514c(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
