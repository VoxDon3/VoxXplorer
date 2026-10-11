package ax.x9;

import ax.Y8.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.x9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3476a {
    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(List<String> list, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(c);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static byte[] c(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(b.e), 0, bArr, 0, str.length());
        return bArr;
    }

    public static List<String> d(String str, char c) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(c, i);
            if (indexOf == -1) {
                arrayList.add(str.substring(i));
                return arrayList;
            }
            arrayList.add(str.substring(i, indexOf));
            i = indexOf + 1;
        }
    }
}
