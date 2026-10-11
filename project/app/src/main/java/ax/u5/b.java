/*
 * Decompiled with CFR 0.152.
 */
package ax.u5;

import ax.u5.a;
import ax.u5.c;

public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int n8, TInput object, a<TInput, TResult, TException> a8, c<TInput, TResult> c8) throws TException {
        int n9 = n8;
        TInput TInput = object;
        if (n8 < 1) {
            return a8.apply(object);
        }
        while ((TInput = c8.a(TInput, object = a8.apply(TInput))) != null) {
            n9 = n8 = n9 - 1;
            if (n8 >= 1) continue;
        }
        return (TResult)object;
    }
}

