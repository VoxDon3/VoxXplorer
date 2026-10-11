/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final Companion Companion;
    private final String javaName;

    static {
        Companion = new Companion(null);
    }

    private TlsVersion(String string2) {
        this.javaName = string2;
    }

    public static final TlsVersion forJavaName(String string) {
        return Companion.forJavaName(string);
    }

    public final String -deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final TlsVersion forJavaName(String string) {
            block12: {
                block10: {
                    block11: {
                        l.f(string, "javaName");
                        int n8 = string.hashCode();
                        if (n8 == 79201641) break block10;
                        if (n8 == 79923350) break block11;
                        switch (n8) {
                            default: {
                                break block12;
                            }
                            case -503070501: {
                                if (string.equals("TLSv1.3")) {
                                    return TLS_1_3;
                                }
                                break block12;
                            }
                            case -503070502: {
                                if (string.equals("TLSv1.2")) {
                                    return TLS_1_2;
                                }
                                break block12;
                            }
                            case -503070503: {
                                if (string.equals("TLSv1.1")) {
                                    return TLS_1_1;
                                }
                                break block12;
                            }
                        }
                    }
                    if (string.equals("TLSv1")) {
                        return TLS_1_0;
                    }
                    break block12;
                }
                if (string.equals("SSLv3")) {
                    return SSL_3_0;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected TLS version: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}

