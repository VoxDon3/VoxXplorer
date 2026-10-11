/*
 * Decompiled with CFR 0.152.
 */
package ax.h5;

import android.util.Log;
import ax.h5.e;
import java.io.IOException;

public abstract class a
implements e {
    private static final String q = "a";

    private e a(String string) throws IOException {
        for (e e8 : this.B0()) {
            if (!e8.getName().equalsIgnoreCase(string)) continue;
            return e8;
        }
        return null;
    }

    @Override
    public e H0(String charSequence) throws IOException {
        int n8;
        String string = q;
        CharSequence charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("search file: ");
        ((StringBuilder)charSequence2).append((String)charSequence);
        Log.d((String)string, (String)((StringBuilder)charSequence2).toString());
        if (this.q0() && ((String)charSequence).equals("/")) {
            return this;
        }
        charSequence2 = charSequence;
        if (this.q0()) {
            charSequence2 = charSequence;
            if (((String)charSequence).startsWith("/")) {
                charSequence2 = ((String)charSequence).substring(1);
            }
        }
        charSequence = charSequence2;
        if (((String)charSequence2).endsWith("/")) {
            charSequence = ((String)charSequence2).substring(0, ((String)charSequence2).length() - 1);
        }
        if ((n8 = ((String)charSequence).indexOf("/")) < 0) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("search entry: ");
            ((StringBuilder)charSequence2).append((String)charSequence);
            Log.d((String)string, (String)((StringBuilder)charSequence2).toString());
            return this.a((String)charSequence);
        }
        charSequence2 = ((String)charSequence).substring(n8 + 1);
        String string2 = ((String)charSequence).substring(0, n8);
        Object object = new StringBuilder();
        ((StringBuilder)object).append("search recursively ");
        ((StringBuilder)object).append((String)charSequence2);
        ((StringBuilder)object).append(" in ");
        ((StringBuilder)object).append(string2);
        Log.d((String)string, (String)((StringBuilder)object).toString());
        object = this.a(string2);
        if (object != null && object.isDirectory()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("found directory ");
            ((StringBuilder)charSequence).append(string2);
            Log.d((String)string, (String)((StringBuilder)charSequence).toString());
            return object.H0((String)charSequence2);
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("not found ");
        ((StringBuilder)charSequence2).append((String)charSequence);
        Log.d((String)string, (String)((StringBuilder)charSequence2).toString());
        return null;
    }

    @Override
    public String K() {
        if (this.getParent().q0()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/");
            stringBuilder.append(this.getName());
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getParent().K());
        stringBuilder.append("/");
        stringBuilder.append(this.getName());
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        return object instanceof e && this.K().equals(((e)object).K());
    }

    public int hashCode() {
        return this.K().hashCode();
    }

    public String toString() {
        return this.getName();
    }
}

