package com.jcraft.jsch;

import java.util.Locale;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class JSchAlgoNegoFailException extends JSchException {
    private final String c0;
    private final String d0;
    private final String q;

    JSchAlgoNegoFailException(int i, String str, String str2) {
        super(b(i, str, str2));
        this.q = a(i);
        this.c0 = str;
        this.d0 = str2;
    }

    private static String a(int i) {
        switch (i) {
            case 0:
                return "kex";
            case 1:
                return "server_host_key";
            case 2:
                return "cipher.c2s";
            case 3:
                return "cipher.s2c";
            case 4:
                return "mac.c2s";
            case 5:
                return "mac.s2c";
            case 6:
                return "compression.c2s";
            case 7:
                return "compression.s2c";
            case 8:
                return "lang.c2s";
            case 9:
                return "lang.s2c";
            default:
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private static String b(int i, String str, String str2) {
        return String.format(Locale.ROOT, "Algorithm negotiation fail: algorithmName=\"%s\" jschProposal=\"%s\" serverProposal=\"%s\"", a(i), str, str2);
    }
}
