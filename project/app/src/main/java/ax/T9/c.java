/*
 * Decompiled with CFR 0.152.
 */
package ax.T9;

import ax.r8.o;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.EnumSet;
import java.util.Iterator;

public class c {
    public static EnumSet a(Type type, String string) {
        Gson gson = new Gson();
        CharSequence charSequence = new StringBuilder();
        charSequence.append("[");
        charSequence.append(string);
        charSequence.append("]");
        charSequence = charSequence.toString();
        if (string == null) {
            return null;
        }
        return (EnumSet)gson.l((String)charSequence, type);
    }

    public static o b(EnumSet<?> object) {
        Iterator iterator = ((AbstractCollection)object).iterator();
        object = "";
        while (iterator.hasNext()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(iterator.next().toString());
            stringBuilder.append(",");
            object = stringBuilder.toString();
        }
        return new o(((String)object).substring(0, ((String)object).length() - 1));
    }
}

