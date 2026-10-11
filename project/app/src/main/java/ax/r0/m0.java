/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.h;

final class m0 {
    static String a(h h8) {
        return m0.b(new b(h8){
            final h a;
            {
                this.a = h8;
            }

            @Override
            public byte a(int n8) {
                return this.a.g(n8);
            }

            @Override
            public int size() {
                return this.a.size();
            }
        });
    }

    static String b(b b8) {
        StringBuilder stringBuilder = new StringBuilder(b8.size());
        for (int i8 = 0; i8 < b8.size(); ++i8) {
            byte by = b8.a(i8);
            if (by != 34) {
                if (by != 39) {
                    if (by != 92) {
                        switch (by) {
                            default: {
                                if (by >= 32 && by <= 126) {
                                    stringBuilder.append((char)by);
                                    break;
                                }
                                stringBuilder.append('\\');
                                stringBuilder.append((char)((by >>> 6 & 3) + 48));
                                stringBuilder.append((char)((by >>> 3 & 7) + 48));
                                stringBuilder.append((char)((by & 7) + 48));
                                break;
                            }
                            case 13: {
                                stringBuilder.append("\\r");
                                break;
                            }
                            case 12: {
                                stringBuilder.append("\\f");
                                break;
                            }
                            case 11: {
                                stringBuilder.append("\\v");
                                break;
                            }
                            case 10: {
                                stringBuilder.append("\\n");
                                break;
                            }
                            case 9: {
                                stringBuilder.append("\\t");
                                break;
                            }
                            case 8: {
                                stringBuilder.append("\\b");
                                break;
                            }
                            case 7: {
                                stringBuilder.append("\\a");
                                break;
                            }
                        }
                        continue;
                    }
                    stringBuilder.append("\\\\");
                    continue;
                }
                stringBuilder.append("\\'");
                continue;
            }
            stringBuilder.append("\\\"");
        }
        return stringBuilder.toString();
    }

    static String c(String string) {
        return m0.a(h.n(string));
    }

    private static interface b {
        public byte a(int var1);

        public int size();
    }
}

