package com.jcraft.jsch;

/* loaded from: classes3.dex */
class JSchPartialAuthException extends JSchException {
    String q;

    public JSchPartialAuthException() {
    }

    public String a() {
        return this.q;
    }

    public JSchPartialAuthException(String str) {
        super(str);
        this.q = str;
    }
}
