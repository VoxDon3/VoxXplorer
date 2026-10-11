/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

class Util {
    Util() {
    }

    static void a(byte[] byArray) {
        if (byArray != null) {
            for (int i8 = 0; i8 < byArray.length; ++i8) {
                byArray[i8] = 0;
            }
        }
    }
}

