/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

class JSchAuthCancelException
extends JSchException {
    String q;

    JSchAuthCancelException() {
    }

    JSchAuthCancelException(String string) {
        super(string);
        this.q = string;
    }
}

