/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.view.View;
import ax.v2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class x {
    public final Map<String, Object> a = new HashMap<String, Object>();
    @SuppressLint(value={"UnknownNullness"})
    public View b;
    final ArrayList<k> c = new ArrayList();

    @Deprecated
    public x() {
    }

    public x(View view) {
        this.b = view;
    }

    public boolean equals(Object object) {
        if (object instanceof x) {
            View view = this.b;
            object = (x)object;
            if (view == ((x)object).b && this.a.equals(((x)object).a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("TransitionValues@");
        charSequence.append(Integer.toHexString(this.hashCode()));
        charSequence.append(":\n");
        charSequence = charSequence.toString();
        Object object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("    view = ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append("\n");
        charSequence = ((StringBuilder)object).toString();
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("    values:");
        charSequence = ((StringBuilder)object).toString();
        for (String string : this.a.keySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("    ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append(this.a.get(string));
            stringBuilder.append("\n");
            charSequence = stringBuilder.toString();
        }
        return charSequence;
    }
}

