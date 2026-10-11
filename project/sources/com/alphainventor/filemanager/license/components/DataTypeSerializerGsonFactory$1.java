package com.voxdon.xplorer.license.components;

import ax.Fa.c;
import ax.Fa.d;
import ax.r8.InterfaceC3014w;
import ax.x8.C3475a;
import com.voxdon.xplorer.license.datatypes.LicensePurchasedImpl;
import com.voxdon.xplorer.license.datatypes.ProductCatalogImpl;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* loaded from: classes.dex */
class DataTypeSerializerGsonFactory$1 implements InterfaceC3014w {
    DataTypeSerializerGsonFactory$1() {
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        if (c.class.equals(c3475a.c())) {
            return gson.n(LicensePurchasedImpl.class);
        }
        if (d.class.equals(c3475a.c())) {
            return gson.n(ProductCatalogImpl.class);
        }
        return null;
    }
}
