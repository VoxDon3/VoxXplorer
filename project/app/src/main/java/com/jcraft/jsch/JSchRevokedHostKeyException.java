/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchHostKeyException;

public class JSchRevokedHostKeyException
extends JSchHostKeyException {
    JSchRevokedHostKeyException() {
    }

    JSchRevokedHostKeyException(String string) {
        super(string);
    }
}

