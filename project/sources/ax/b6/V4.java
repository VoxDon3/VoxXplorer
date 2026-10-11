package ax.b6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class V4 {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(U4 u4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(u4, sb, 0);
        return sb.toString();
    }

    private static void b(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a8, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(ax.b6.U4 r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.V4.c(ax.b6.U4, java.lang.StringBuilder, int):void");
    }

    static void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C5.a(B3.l((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof B3) {
            sb.append(": \"");
            sb.append(C5.a((B3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1599k4) {
            sb.append(" {");
            c((AbstractC1599k4) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        d(sb, i3, "key", entry.getKey());
        d(sb, i3, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }
}
