/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import ax.Gb.l;
import ax.Y.a;
import ax.sb.m;
import java.io.Serializable;

public final class c {
    public static final Bundle a(m<String, ? extends Object> ... object) {
        Object object2 = new Bundle(((m<String, ? extends Object>[])object).length);
        int n8 = ((m<String, ? extends Object>[])object).length;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object3 = object[i8];
            String string = ((m)object3).a();
            if ((object3 = ((m)object3).b()) == null) {
                object2.putString(string, null);
                continue;
            }
            if (object3 instanceof Boolean) {
                object2.putBoolean(string, ((Boolean)object3).booleanValue());
                continue;
            }
            if (object3 instanceof Byte) {
                object2.putByte(string, ((Number)object3).byteValue());
                continue;
            }
            if (object3 instanceof Character) {
                object2.putChar(string, ((Character)object3).charValue());
                continue;
            }
            if (object3 instanceof Double) {
                object2.putDouble(string, ((Number)object3).doubleValue());
                continue;
            }
            if (object3 instanceof Float) {
                object2.putFloat(string, ((Number)object3).floatValue());
                continue;
            }
            if (object3 instanceof Integer) {
                object2.putInt(string, ((Number)object3).intValue());
                continue;
            }
            if (object3 instanceof Long) {
                object2.putLong(string, ((Number)object3).longValue());
                continue;
            }
            if (object3 instanceof Short) {
                object2.putShort(string, ((Number)object3).shortValue());
                continue;
            }
            if (object3 instanceof Bundle) {
                object2.putBundle(string, (Bundle)object3);
                continue;
            }
            if (object3 instanceof CharSequence) {
                object2.putCharSequence(string, (CharSequence)object3);
                continue;
            }
            if (object3 instanceof Parcelable) {
                object2.putParcelable(string, (Parcelable)object3);
                continue;
            }
            if (object3 instanceof boolean[]) {
                object2.putBooleanArray(string, (boolean[])object3);
                continue;
            }
            if (object3 instanceof byte[]) {
                object2.putByteArray(string, (byte[])object3);
                continue;
            }
            if (object3 instanceof char[]) {
                object2.putCharArray(string, (char[])object3);
                continue;
            }
            if (object3 instanceof double[]) {
                object2.putDoubleArray(string, (double[])object3);
                continue;
            }
            if (object3 instanceof float[]) {
                object2.putFloatArray(string, (float[])object3);
                continue;
            }
            if (object3 instanceof int[]) {
                object2.putIntArray(string, (int[])object3);
                continue;
            }
            if (object3 instanceof long[]) {
                object2.putLongArray(string, (long[])object3);
                continue;
            }
            if (object3 instanceof short[]) {
                object2.putShortArray(string, (short[])object3);
                continue;
            }
            if (object3 instanceof Object[]) {
                Class<?> clazz = object3.getClass().getComponentType();
                l.c(clazz);
                if (Parcelable.class.isAssignableFrom(clazz)) {
                    l.d(object3, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    object2.putParcelableArray(string, (Parcelable[])object3);
                    continue;
                }
                if (String.class.isAssignableFrom(clazz)) {
                    l.d(object3, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    object2.putStringArray(string, (String[])object3);
                    continue;
                }
                if (CharSequence.class.isAssignableFrom(clazz)) {
                    l.d(object3, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    object2.putCharSequenceArray(string, (CharSequence[])object3);
                    continue;
                }
                if (Serializable.class.isAssignableFrom(clazz)) {
                    object2.putSerializable(string, (Serializable)object3);
                    continue;
                }
                object = clazz.getCanonicalName();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Illegal value array type ");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" for key \"");
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append('\"');
                throw new IllegalArgumentException(((StringBuilder)object2).toString());
            }
            if (object3 instanceof Serializable) {
                object2.putSerializable(string, (Serializable)object3);
                continue;
            }
            if (object3 instanceof IBinder) {
                object2.putBinder(string, (IBinder)object3);
                continue;
            }
            if (object3 instanceof Size) {
                a.a((Bundle)object2, string, (Size)object3);
                continue;
            }
            if (object3 instanceof SizeF) {
                a.b((Bundle)object2, string, (SizeF)object3);
                continue;
            }
            object2 = object3.getClass().getCanonicalName();
            object = new StringBuilder();
            ((StringBuilder)object).append("Illegal value type ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" for key \"");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('\"');
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return object2;
    }
}

