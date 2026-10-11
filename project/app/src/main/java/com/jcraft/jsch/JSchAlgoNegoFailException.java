/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;
import java.util.Locale;

public class JSchAlgoNegoFailException
extends JSchException {
    private final String c0;
    private final String d0;
    private final String q;

    JSchAlgoNegoFailException(int n8, String string, String string2) {
        super(JSchAlgoNegoFailException.b(n8, string, string2));
        this.q = JSchAlgoNegoFailException.a(n8);
        this.c0 = string;
        this.d0 = string2;
    }

    private static String a(int n8) {
        switch (n8) {
            default: {
                return "";
            }
            case 9: {
                return "lang.s2c";
            }
            case 8: {
                return "lang.c2s";
            }
            case 7: {
                return "compression.s2c";
            }
            case 6: {
                return "compression.c2s";
            }
            case 5: {
                return "mac.s2c";
            }
            case 4: {
                return "mac.c2s";
            }
            case 3: {
                return "cipher.s2c";
            }
            case 2: {
                return "cipher.c2s";
            }
            case 1: {
                return "server_host_key";
            }
            case 0: 
        }
        return "kex";
    }

    private static String b(int n8, String string, String string2) {
        return String.format(Locale.ROOT, "Algorithm negotiation fail: algorithmName=\"%s\" jschProposal=\"%s\" serverProposal=\"%s\"", JSchAlgoNegoFailException.a(n8), string, string2);
    }
}

