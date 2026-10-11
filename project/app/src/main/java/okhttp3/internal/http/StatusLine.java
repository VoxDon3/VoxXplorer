/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int n8, String string) {
        l.f((Object)protocol, "protocol");
        l.f(string, "message");
        this.protocol = protocol;
        this.code = n8;
        this.message = string;
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            charSequence.append("HTTP/1.0");
        } else {
            charSequence.append("HTTP/1.1");
        }
        charSequence.append(' ');
        charSequence.append(this.code);
        charSequence.append(' ');
        charSequence.append(this.message);
        charSequence = charSequence.toString();
        l.e(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final StatusLine get(Response response) {
            l.f(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final StatusLine parse(String string) throws IOException {
            Object object;
            int n8;
            int n9;
            block11: {
                block12: {
                    l.f(string, "statusLine");
                    if (!h.H(string, "HTTP/1.", false, 2, null)) break block12;
                    n9 = string.length();
                    n8 = 9;
                    if (n9 >= 9 && string.charAt(8) == ' ') {
                        n9 = string.charAt(7) - 48;
                        if (n9 != 0) {
                            if (n9 != 1) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Unexpected status line: ");
                                stringBuilder.append(string);
                                throw new ProtocolException(stringBuilder.toString());
                            }
                            object = Protocol.HTTP_1_1;
                            break block11;
                        } else {
                            object = Protocol.HTTP_1_0;
                        }
                        break block11;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected status line: ");
                        stringBuilder.append(string);
                        throw new ProtocolException(stringBuilder.toString());
                    }
                }
                if (!h.H(string, "ICY ", false, 2, null)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected status line: ");
                    stringBuilder.append(string);
                    throw new ProtocolException(stringBuilder.toString());
                }
                object = Protocol.HTTP_1_0;
                n8 = 4;
            }
            int n10 = string.length();
            n9 = n8 + 3;
            if (n10 < n9) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected status line: ");
                ((StringBuilder)object).append(string);
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            try {
                String string2 = string.substring(n8, n9);
                l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                n10 = Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected status line: ");
                stringBuilder.append(string);
                throw new ProtocolException(stringBuilder.toString());
            }
            if (string.length() <= n9) {
                string = "";
                return new StatusLine((Protocol)((Object)object), n10, string);
            }
            if (string.charAt(n9) == ' ') {
                string = string.substring(n8 + 4);
                l.e(string, "this as java.lang.String).substring(startIndex)");
                return new StatusLine((Protocol)((Object)object), n10, string);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected status line: ");
            ((StringBuilder)object).append(string);
            throw new ProtocolException(((StringBuilder)object).toString());
        }
    }
}

