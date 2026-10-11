/*
 * Decompiled with CFR 0.152.
 */
package ax.R7;

import ax.R7.d;
import java.util.AbstractCollection;
import java.util.Stack;

public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    private e(String string, String string2, StackTraceElement[] stackTraceElementArray, e e8) {
        this.a = string;
        this.b = string2;
        this.c = stackTraceElementArray;
        this.d = e8;
    }

    public static e a(Throwable object, d d8) {
        Stack<Throwable> stack = new Stack<Throwable>();
        while (object != null) {
            stack.push((Throwable)object);
            object = ((Throwable)object).getCause();
        }
        object = null;
        while (!((AbstractCollection)stack).isEmpty()) {
            Throwable throwable = (Throwable)stack.pop();
            object = new e(throwable.getLocalizedMessage(), throwable.getClass().getName(), d8.a(throwable.getStackTrace()), (e)object);
        }
        return object;
    }
}

