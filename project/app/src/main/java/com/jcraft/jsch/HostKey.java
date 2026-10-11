/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Util;

public class HostKey {
    private static final byte[][] f = new byte[][]{Util.v("ssh-dss"), Util.v("ssh-rsa"), Util.v("ecdsa-sha2-nistp256"), Util.v("ecdsa-sha2-nistp384"), Util.v("ecdsa-sha2-nistp521"), Util.v("ssh-ed25519"), Util.v("ssh-ed448")};
    protected String a;
    protected String b;
    protected int c;
    protected byte[] d;
    protected String e;

    public HostKey(String string, int n8, byte[] byArray) throws JSchException {
        this(string, n8, byArray, null);
    }

    public HostKey(String string, int n8, byte[] byArray, String string2) throws JSchException {
        this("", string, n8, byArray, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public HostKey(String string, String string2, int n8, byte[] byArray, String string3) throws JSchException {
        this.a = string;
        this.b = string2;
        if (n8 == 0) {
            n8 = byArray[8];
            if (n8 == 100) {
                this.c = 1;
            } else if (n8 == 114) {
                this.c = 2;
            } else if (n8 == 101 && byArray[10] == 50) {
                this.c = 6;
            } else if (n8 == 101 && byArray[10] == 52) {
                this.c = 7;
            } else if (n8 == 97 && byArray[20] == 50) {
                this.c = 3;
            } else if (n8 == 97 && byArray[20] == 51) {
                this.c = 4;
            } else {
                if (n8 != 97 || byArray[20] != 53) throw new JSchException("invalid key type");
                this.c = 5;
            }
        } else {
            this.c = n8;
        }
        this.d = byArray;
        this.e = string3;
    }

    public HostKey(String string, byte[] byArray) throws JSchException {
        this(string, 0, byArray);
    }

    public static byte[] a(String string) throws JSchException {
        return Util.k(Util.v(string), 0, string.length());
    }

    private boolean g(String string) {
        String string2 = this.b;
        int n8 = string2.length();
        int n9 = string.length();
        int n10 = 0;
        while (n10 < n8) {
            int n11 = string2.indexOf(44, n10);
            if (n11 == -1) {
                if (n9 != n8 - n10) {
                    return false;
                }
                return string2.regionMatches(true, n10, string, 0, n9);
            }
            if (n9 == n11 - n10 && string2.regionMatches(true, n10, string, 0, n9)) {
                return true;
            }
            n10 = n11 + 1;
        }
        return false;
    }

    public static int i(String string) {
        byte[][] byArray;
        for (int i8 = 0; i8 < (byArray = f).length; ++i8) {
            if (!Util.c(byArray[i8]).equals(string)) continue;
            return i8 + 1;
        }
        return -1;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        byte[] byArray = this.d;
        return Util.c(Util.x(byArray, 0, byArray.length, true));
    }

    public String e() {
        return this.a;
    }

    public String f() {
        int n8 = this.c;
        if (n8 != 1 && n8 != 2 && n8 != 6 && n8 != 7 && n8 != 3 && n8 != 4 && n8 != 5) {
            return "UNKNOWN";
        }
        return Util.c(f[n8 - 1]);
    }

    boolean h(String string) {
        return this.g(string);
    }
}

