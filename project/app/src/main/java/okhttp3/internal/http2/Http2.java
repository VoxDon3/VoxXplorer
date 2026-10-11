/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.l;
import ax.xc.h;
import okhttp3.internal.Util;

public final class Http2 {
    private static final String[] BINARY;
    public static final h CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        int n8;
        String[] stringArray;
        int n9;
        INSTANCE = new Http2();
        CONNECTION_PREFACE = h.e0.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        Object object = new String[256];
        Object object2 = 0;
        for (n9 = 0; n9 < 256; ++n9) {
            stringArray = Integer.toBinaryString(n9);
            l.e(stringArray, "toBinaryString(it)");
            object[n9] = ax.Ob.h.C(Util.format("%8s", new Object[]{stringArray}), ' ', '0', false, 4, null);
        }
        BINARY = object;
        Object object3 = FLAGS;
        object3[0] = "";
        object3[1] = "END_STREAM";
        stringArray = (String[])new int[1];
        stringArray[0] = true;
        object3[8] = "PADDED";
        n9 = (int)stringArray[0];
        object = new StringBuilder();
        ((StringBuilder)object).append(object3[n9]);
        ((StringBuilder)object).append("|PADDED");
        object3[n9 | 8] = ((StringBuilder)object).toString();
        object3[4] = "END_HEADERS";
        object3[32] = "PRIORITY";
        object3[36] = "END_HEADERS|PRIORITY";
        for (n9 = 0; n9 < 3; ++n9) {
            n8 = (new int[]{4, 32, 36})[n9];
            String string = stringArray[0];
            object = FLAGS;
            int n10 = string | n8;
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object[string]);
            ((StringBuilder)object3).append('|');
            ((StringBuilder)object3).append((String)object[n8]);
            object[n10] = ((StringBuilder)object3).toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object[string]);
            ((StringBuilder)object3).append('|');
            ((StringBuilder)object3).append((String)object[n8]);
            ((StringBuilder)object3).append("|PADDED");
            object[n10 | 8] = ((StringBuilder)object3).toString();
        }
        n8 = FLAGS.length;
        for (n9 = object2; n9 < n8; ++n9) {
            stringArray = FLAGS;
            if (stringArray[n9] != null) continue;
            stringArray[n9] = BINARY[n9];
        }
    }

    private Http2() {
    }

    public final String formatFlags(int n8, int n9) {
        if (n9 == 0) {
            return "";
        }
        if (n8 != 2 && n8 != 3) {
            if (n8 != 4 && n8 != 6) {
                if (n8 != 7 && n8 != 8) {
                    Object object = FLAGS;
                    if (n9 < ((String[])object).length) {
                        object = object[n9];
                        l.c(object);
                    } else {
                        object = BINARY[n9];
                    }
                    if (n8 == 5 && (n9 & 4) != 0) {
                        return ax.Ob.h.D((String)object, "HEADERS", "PUSH_PROMISE", false, 4, null);
                    }
                    if (n8 == 0 && (n9 & 0x20) != 0) {
                        return ax.Ob.h.D((String)object, "PRIORITY", "COMPRESSED", false, 4, null);
                    }
                    return object;
                }
            } else {
                if (n9 == 1) {
                    return "ACK";
                }
                return BINARY[n9];
            }
        }
        return BINARY[n9];
    }

    public final String formattedType$okhttp(int n8) {
        String[] stringArray = FRAME_NAMES;
        if (n8 < stringArray.length) {
            return stringArray[n8];
        }
        return Util.format("0x%02x", n8);
    }

    public final String frameLog(boolean bl, int n8, int n9, int n10, int n11) {
        String string = this.formattedType$okhttp(n10);
        String string2 = this.formatFlags(n10, n11);
        String string3 = bl ? "<<" : ">>";
        return Util.format("%s 0x%08x %5d %-13s %s", string3, n8, n9, string, string2);
    }
}

