package ax.r0;

/* loaded from: classes.dex */
final class m0 {

    static class a implements b {
        final /* synthetic */ AbstractC2921h a;

        a(AbstractC2921h abstractC2921h) {
            this.a = abstractC2921h;
        }

        @Override // ax.r0.m0.b
        public byte a(int i) {
            return this.a.g(i);
        }

        @Override // ax.r0.m0.b
        public int size() {
            return this.a.size();
        }
    }

    private interface b {
        byte a(int i);

        int size();
    }

    static String a(AbstractC2921h abstractC2921h) {
        return b(new a(abstractC2921h));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a2 = bVar.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
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
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
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

    static String c(String str) {
        return a(AbstractC2921h.n(str));
    }
}
