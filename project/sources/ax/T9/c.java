package ax.T9;

import ax.r8.C3006o;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class c {
    public static EnumSet a(Type type, String str) {
        Gson gson = new Gson();
        String str2 = "[" + str + "]";
        if (str == null) {
            return null;
        }
        return (EnumSet) gson.l(str2, type);
    }

    public static C3006o b(EnumSet<?> enumSet) {
        Iterator<E> it = enumSet.iterator();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (it.hasNext()) {
            str = str + it.next().toString() + ",";
        }
        return new C3006o(str.substring(0, str.length() - 1));
    }
}
