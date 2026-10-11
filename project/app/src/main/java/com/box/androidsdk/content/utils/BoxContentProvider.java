/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import ax.E3.g;

public class BoxContentProvider
extends ContentProvider {
    public int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        g.i = this.getContext();
        return true;
    }

    public Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

