package ax.ka;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class e {

    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.substring(0, str.lastIndexOf("_")).compareTo(str2.substring(0, str2.lastIndexOf("_")));
        }
    }

    public static Comparator<String> a() {
        return new a();
    }

    public static String b(String str, ax.ca.e eVar) {
        return str + "_" + eVar.b() + "x" + eVar.a();
    }

    public static void c(String str, ax.Z9.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : aVar.a()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aVar.b((String) obj);
        }
    }
}
