/*
 * Decompiled with CFR 0.152.
 */
package ax.Q9;

import android.util.Log;
import ax.Q9.b;
import ax.Q9.c;

public class a
implements b {
    private c a = c.q;

    private String d() {
        try {
            CharSequence charSequence = new StringBuilder();
            String string = Thread.currentThread().getStackTrace()[4].getClassName();
            charSequence.append(string.substring(string.lastIndexOf(".") + 1));
            charSequence.append("[");
            charSequence.append(Thread.currentThread().getStackTrace()[4].getMethodName());
            charSequence.append("] - ");
            charSequence.append(Thread.currentThread().getStackTrace()[4].getLineNumber());
            charSequence = charSequence.toString();
            return charSequence;
        }
        catch (Exception exception) {
            Log.e((String)"DefaultLogger", (String)exception.getMessage());
            return null;
        }
    }

    @Override
    public void a(String string2) {
        for (String string2 : string2.split("\n")) {
            Log.d((String)this.d(), (String)string2);
        }
    }

    @Override
    public void b(String string2, Throwable throwable) {
        int n8 = ax.Q9.a$a.a[this.a.ordinal()];
        for (String string2 : string2.split("\n")) {
            Log.e((String)this.d(), (String)string2);
        }
        Log.e((String)this.d(), (String)"Throwable detail: ", (Throwable)throwable);
    }

    @Override
    public c c() {
        return this.a;
    }
}

