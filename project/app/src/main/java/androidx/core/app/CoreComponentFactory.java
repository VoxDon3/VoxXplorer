/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory
extends AppComponentFactory {
    static <T> T a(T t8) {
        Object object;
        if (t8 instanceof a && (object = ((a)t8).a()) != null) {
            return (T)object;
        }
        return t8;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String string, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(super.instantiateActivity(classLoader, string, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String string) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(super.instantiateApplication(classLoader, string));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String string) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(super.instantiateProvider(classLoader, string));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String string, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(super.instantiateReceiver(classLoader, string, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String string, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.a(super.instantiateService(classLoader, string, intent));
    }

    public static interface a {
        public Object a();
    }
}

