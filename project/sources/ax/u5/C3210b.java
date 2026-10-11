package ax.u5;

/* renamed from: ax.u5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3210b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, InterfaceC3209a<TInput, TResult, TException> interfaceC3209a, InterfaceC3211c<TInput, TResult> interfaceC3211c) throws Throwable {
        TResult apply;
        if (i < 1) {
            return interfaceC3209a.apply(tinput);
        }
        do {
            apply = interfaceC3209a.apply(tinput);
            tinput = interfaceC3211c.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
