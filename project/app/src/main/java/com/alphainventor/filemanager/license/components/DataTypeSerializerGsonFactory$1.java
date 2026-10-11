/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.license.components;

import ax.Fa.c;
import ax.Fa.d;
import ax.r8.w;
import ax.x8.a;
import com.alphainventor.filemanager.license.datatypes.LicensePurchasedImpl;
import com.alphainventor.filemanager.license.datatypes.ProductCatalogImpl;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

class DataTypeSerializerGsonFactory$1
implements w {
    DataTypeSerializerGsonFactory$1() {
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        if (c.class.equals(a8.c())) {
            return gson.n(LicensePurchasedImpl.class);
        }
        if (d.class.equals(a8.c())) {
            return gson.n(ProductCatalogImpl.class);
        }
        return null;
    }
}

