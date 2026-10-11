/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.e;
import ax.xc.h;

public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123L;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125L;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535L;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String string) {
        l.f(string, "key");
        h.a a8 = h.e0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(ACCEPT_MAGIC);
        return a8.d(stringBuilder.toString()).E().d();
    }

    public final String closeCodeExceptionMessage(int n8) {
        if (n8 >= 1000 && n8 < 5000) {
            if (1004 <= n8 && n8 < 1007 || 1015 <= n8 && n8 < 3000) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Code ");
                stringBuilder.append(n8);
                stringBuilder.append(" is reserved and may not be used.");
                return stringBuilder.toString();
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Code must be in range [1000,5000): ");
        stringBuilder.append(n8);
        return stringBuilder.toString();
    }

    public final void toggleMask(e.a a8, byte[] byArray) {
        l.f(a8, "cursor");
        l.f(byArray, "key");
        int n8 = byArray.length;
        int n9 = 0;
        do {
            byte[] byArray2 = a8.f0;
            int n10 = a8.g0;
            int n11 = a8.h0;
            int n12 = n9;
            if (byArray2 != null) {
                while (true) {
                    n12 = ++n9;
                    if (n10 >= n11) break;
                    byArray2[n10] = (byte)(byArray2[n10] ^ byArray[n9 %= n8]);
                    ++n10;
                }
            }
            n9 = n12;
        } while (a8.b() != -1);
    }

    public final void validateCloseCode(int n8) {
        String string = this.closeCodeExceptionMessage(n8);
        if (string == null) {
            return;
        }
        l.c(string);
        throw new IllegalArgumentException(string.toString());
    }
}

