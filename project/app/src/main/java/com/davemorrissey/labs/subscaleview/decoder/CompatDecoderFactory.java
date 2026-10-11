/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import java.lang.reflect.InvocationTargetException;

public class CompatDecoderFactory<T>
implements DecoderFactory<T> {
    private final Bitmap.Config bitmapConfig;
    private final Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> clazz) {
        this(clazz, null);
    }

    public CompatDecoderFactory(Class<? extends T> clazz, Bitmap.Config config) {
        this.clazz = clazz;
        this.bitmapConfig = config;
    }

    @Override
    public T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        if (this.bitmapConfig == null) {
            return this.clazz.newInstance();
        }
        return this.clazz.getConstructor(Bitmap.Config.class).newInstance(this.bitmapConfig);
    }
}

