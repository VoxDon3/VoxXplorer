package com.jcraft.jsch;

/* loaded from: classes3.dex */
public class JSchSessionDisconnectException extends JSchException {
    private final String c0;
    private final String d0;
    private final int q;

    JSchSessionDisconnectException(String str, int i, String str2, String str3) {
        super(str);
        this.q = i;
        this.c0 = str2;
        this.d0 = str3;
    }
}
