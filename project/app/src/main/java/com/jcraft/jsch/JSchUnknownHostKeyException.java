/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchHostKeyException;

public class JSchUnknownHostKeyException
extends JSchHostKeyException {
    JSchUnknownHostKeyException() {
    }

    JSchUnknownHostKeyException(String string) {
        super(string);
    }
}

