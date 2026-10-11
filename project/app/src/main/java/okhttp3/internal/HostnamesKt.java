/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal;

import ax.Gb.l;
import ax.Ob.h;
import ax.xc.e;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.internal.Util;

public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String string) {
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = string.charAt(i8);
            if (l.h(c8, 31) > 0 && l.h(c8, 127) < 0) {
                if (h.U(" #%/:?@[\\]", c8, 0, false, 6, null) == -1) continue;
                return true;
            }
            return true;
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String string, int n8, int n9, byte[] byArray, int n10) {
        int n11 = n10;
        int n12 = n8;
        while (n12 < n9) {
            char c8;
            if (n11 == byArray.length) {
                return false;
            }
            n8 = n12;
            if (n11 != n10) {
                if (string.charAt(n12) != '.') {
                    return false;
                }
                n8 = n12 + 1;
            }
            int n13 = 0;
            for (n12 = n8; n12 < n9 && l.h(c8 = string.charAt(n12), 48) >= 0 && l.h(c8, 57) <= 0; ++n12) {
                if (n13 == 0 && n8 != n12) {
                    return false;
                }
                if ((n13 = n13 * 10 + c8 - 48) <= 255) continue;
                return false;
            }
            if (n12 - n8 == 0) {
                return false;
            }
            byArray[n11] = (byte)n13;
            ++n11;
        }
        return n11 == n10 + 4;
    }

    private static final InetAddress decodeIpv6(String string, int n8, int n9) {
        int n10;
        byte[] byArray;
        block14: {
            byArray = new byte[16];
            int n11 = 0;
            int n12 = -1;
            int n13 = -1;
            int n14 = n8;
            while (true) {
                n8 = n11;
                n10 = n12;
                if (n14 >= n9) break block14;
                if (n11 == 16) {
                    return null;
                }
                n10 = n14 + 2;
                if (n10 <= n9 && h.G(string, "::", n14, false, 4, null)) {
                    if (n12 != -1) {
                        return null;
                    }
                    n8 = n11 + 2;
                    if (n10 == n9) {
                        n10 = n8;
                        break block14;
                    }
                    n12 = n8;
                    n14 = n10;
                    n11 = n8;
                    n8 = n14;
                } else {
                    n8 = n14;
                    if (n11 != 0) {
                        if (h.G(string, ":", n14, false, 4, null)) {
                            n8 = n14 + 1;
                        } else {
                            if (h.G(string, ".", n14, false, 4, null)) {
                                if (!HostnamesKt.decodeIpv4Suffix(string, n13, n9, byArray, n11 - 2)) {
                                    return null;
                                }
                                n8 = n11 + 2;
                                n10 = n12;
                                break block14;
                            }
                            return null;
                        }
                    }
                }
                n13 = 0;
                for (n14 = n8; n14 < n9 && (n10 = Util.parseHexDigit(string.charAt(n14))) != -1; ++n14) {
                    n13 = (n13 << 4) + n10;
                }
                n10 = n14 - n8;
                if (n10 == 0 || n10 > 4) break;
                byArray[n11] = (byte)(n13 >>> 8 & 0xFF);
                n10 = n11 + 2;
                byArray[n11 + 1] = (byte)(n13 & 0xFF);
                n11 = n10;
                n13 = n8;
            }
            return null;
        }
        if (n8 != 16) {
            if (n10 == -1) {
                return null;
            }
            n9 = n8 - n10;
            System.arraycopy(byArray, n10, byArray, 16 - n9, n9);
            Arrays.fill(byArray, n10, 16 - n8 + n10, (byte)0);
        }
        return InetAddress.getByAddress(byArray);
    }

    private static final String inet6AddressToAscii(byte[] byArray) {
        int n8;
        int n9 = -1;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        while (n11 < byArray.length) {
            int n13;
            for (n13 = n11; n13 < 16 && byArray[n13] == 0 && byArray[n13 + 1] == 0; n13 += 2) {
            }
            int n14 = n13 - n11;
            int n15 = n9;
            n8 = n12;
            if (n14 > n12) {
                n15 = n9;
                n8 = n12;
                if (n14 >= 4) {
                    n8 = n14;
                    n15 = n11;
                }
            }
            n11 = n13 + 2;
            n9 = n15;
            n12 = n8;
        }
        e e8 = new e();
        n11 = n10;
        while (n11 < byArray.length) {
            if (n11 == n9) {
                e8.j1(58);
                n11 = n8 = n11 + n12;
                if (n8 != 16) continue;
                e8.j1(58);
                n11 = n8;
                continue;
            }
            if (n11 > 0) {
                e8.j1(58);
            }
            e8.l1(Util.and(byArray[n11], 255) << 8 | Util.and(byArray[n11 + 1], 255));
            n11 += 2;
        }
        return e8.Z0();
    }

    public static final String toCanonicalHost(String string) {
        block8: {
            l.f(string, "<this>");
            if (h.M(string, ":", false, 2, null)) {
                Serializable serializable = h.H(string, "[", false, 2, null) && h.u(string, "]", false, 2, null) ? HostnamesKt.decodeIpv6(string, 1, string.length() - 1) : HostnamesKt.decodeIpv6(string, 0, string.length());
                if (serializable == null) {
                    return null;
                }
                byte[] byArray = ((InetAddress)serializable).getAddress();
                if (byArray.length == 16) {
                    l.e(byArray, "address");
                    return HostnamesKt.inet6AddressToAscii(byArray);
                }
                if (byArray.length == 4) {
                    return ((InetAddress)serializable).getHostAddress();
                }
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Invalid IPv6 address: '");
                ((StringBuilder)serializable).append(string);
                ((StringBuilder)serializable).append('\'');
                throw new AssertionError((Object)((StringBuilder)serializable).toString());
            }
            try {
                string = IDN.toASCII(string);
                l.e(string, "toASCII(host)");
                Locale locale = Locale.US;
                l.e(locale, "US");
                string = string.toLowerCase(locale);
                l.e(string, "this as java.lang.String).toLowerCase(locale)");
                if (string.length() != 0) break block8;
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        boolean bl = HostnamesKt.containsInvalidHostnameAsciiCodes(string);
        if (bl) {
            return null;
        }
        return string;
    }
}

