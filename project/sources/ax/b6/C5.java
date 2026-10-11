package ax.b6;

/* loaded from: classes3.dex */
final class C5 {
    static String a(B3 b3) {
        B5 b5 = new B5(b3);
        StringBuilder sb = new StringBuilder(b5.a());
        for (int i = 0; i < b5.a(); i++) {
            byte d = b5.d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
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
                        if (d < 32 || d > 126) {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        } else {
                            sb.append((char) d);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
