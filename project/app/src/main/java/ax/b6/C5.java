/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.B5;

final class C5 {
    static String a(B3 serializable) {
        B5 b52 = new B5((B3)serializable);
        serializable = new StringBuilder(b52.a());
        for (int i8 = 0; i8 < b52.a(); ++i8) {
            byte by = b52.d(i8);
            if (by != 34) {
                if (by != 39) {
                    if (by != 92) {
                        switch (by) {
                            default: {
                                if (by >= 32 && by <= 126) {
                                    ((StringBuilder)serializable).append((char)by);
                                    break;
                                }
                                ((StringBuilder)serializable).append('\\');
                                ((StringBuilder)serializable).append((char)((by >>> 6 & 3) + 48));
                                ((StringBuilder)serializable).append((char)((by >>> 3 & 7) + 48));
                                ((StringBuilder)serializable).append((char)((by & 7) + 48));
                                break;
                            }
                            case 13: {
                                ((StringBuilder)serializable).append("\\r");
                                break;
                            }
                            case 12: {
                                ((StringBuilder)serializable).append("\\f");
                                break;
                            }
                            case 11: {
                                ((StringBuilder)serializable).append("\\v");
                                break;
                            }
                            case 10: {
                                ((StringBuilder)serializable).append("\\n");
                                break;
                            }
                            case 9: {
                                ((StringBuilder)serializable).append("\\t");
                                break;
                            }
                            case 8: {
                                ((StringBuilder)serializable).append("\\b");
                                break;
                            }
                            case 7: {
                                ((StringBuilder)serializable).append("\\a");
                                break;
                            }
                        }
                        continue;
                    }
                    ((StringBuilder)serializable).append("\\\\");
                    continue;
                }
                ((StringBuilder)serializable).append("\\'");
                continue;
            }
            ((StringBuilder)serializable).append("\\\"");
        }
        return ((StringBuilder)serializable).toString();
    }
}

