/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchHostKeyException;

public class JSchChangedHostKeyException
extends JSchHostKeyException {
    JSchChangedHostKeyException() {
    }

    JSchChangedHostKeyException(String string) {
        super(string);
    }
}

