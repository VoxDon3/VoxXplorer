/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import java.lang.reflect.InvocationTargetException;

public interface DecoderFactory<T> {
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;
}

