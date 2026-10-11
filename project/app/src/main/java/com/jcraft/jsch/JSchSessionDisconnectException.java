/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

public class JSchSessionDisconnectException
extends JSchException {
    private final String c0;
    private final String d0;
    private final int q;

    JSchSessionDisconnectException(String string, int n8, String string2, String string3) {
        super(string);
        this.q = n8;
        this.c0 = string2;
        this.d0 = string3;
    }
}

