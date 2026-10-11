/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

class JSchPartialAuthException
extends JSchException {
    String q;

    public JSchPartialAuthException() {
    }

    public JSchPartialAuthException(String string) {
        super(string);
        this.q = string;
    }

    public String a() {
        return this.q;
    }
}

