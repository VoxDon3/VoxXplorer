package ax.W5;

/* loaded from: classes3.dex */
final class K1 {
    static String a(AbstractC1069t0 abstractC1069t0) {
        StringBuilder sb = new StringBuilder(abstractC1069t0.h());
        for (int i = 0; i < abstractC1069t0.h(); i++) {
            byte e = abstractC1069t0.e(i);
            if (e == 34) {
                sb.append("\\\"");
            } else if (e == 39) {
                sb.append("\\'");
            } else if (e != 92) {
                switch (e) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (e < 32 || e > 126) {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            sb.append((char) ((e & 7) + 48));
                            break;
                        } else {
                            sb.append((char) e);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
