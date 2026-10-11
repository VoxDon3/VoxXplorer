/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.t0;

final class K1 {
    static String a(t0 t02) {
        StringBuilder stringBuilder = new StringBuilder(t02.h());
        for (int i8 = 0; i8 < t02.h(); ++i8) {
            byte by = t02.e(i8);
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
}

