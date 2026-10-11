/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.shizuku;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

public interface a
extends IInterface {
    public List<String> A0(String var1, long var2) throws RemoteException;

    public ParcelFileDescriptor G1(String var1, boolean var2) throws RemoteException;

    public int K1(String var1, boolean var2) throws RemoteException;

    public ax.p3.a L0(String var1) throws RemoteException;

    public boolean W1(String var1) throws RemoteException;

    public boolean X0(String var1, String var2) throws RemoteException;

    public List<ax.p3.a> d1(String var1) throws RemoteException;

    public void destroy() throws RemoteException;

    public boolean h(String var1) throws RemoteException;

    public boolean l0(String var1, long var2) throws RemoteException;

    public ParcelFileDescriptor w0(String var1) throws RemoteException;

    public boolean x1(String var1) throws RemoteException;

    public ax.p3.a z(String var1) throws RemoteException;

    public ParcelFileDescriptor z0(String var1) throws RemoteException;

    public static abstract class com.alphainventor.filemanager.shizuku.a$a
    extends Binder
    implements com.alphainventor.filemanager.shizuku.a {
        public com.alphainventor.filemanager.shizuku.a$a() {
            this.attachInterface(this, "com.alphainventor.filemanager.shizuku.IShizukuUserService");
        }

        public static com.alphainventor.filemanager.shizuku.a r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.alphainventor.filemanager.shizuku.IShizukuUserService");
            if (iInterface != null && iInterface instanceof com.alphainventor.filemanager.shizuku.a) {
                return (com.alphainventor.filemanager.shizuku.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel object, Parcel parcel, int n9) throws RemoteException {
            if (n8 >= 1 && n8 <= 0xFFFFFF) {
                object.enforceInterface("com.alphainventor.filemanager.shizuku.IShizukuUserService");
            }
            if (n8 == 1598968902) {
                parcel.writeString("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                return true;
            }
            if (n8 != 3) {
                if (n8 != 23) {
                    if (n8 != 0xFFFF9B) {
                        boolean bl = false;
                        boolean bl2 = false;
                        switch (n8) {
                            default: {
                                return super.onTransact(n8, object, parcel, n9);
                            }
                            case 21: {
                                object = this.z0(object.readString());
                                parcel.writeNoException();
                                b.f(parcel, (Parcelable)object, 1);
                                break;
                            }
                            case 20: {
                                String string = object.readString();
                                bl = bl2;
                                if (object.readInt() != 0) {
                                    bl = true;
                                }
                                object = this.G1(string, bl);
                                parcel.writeNoException();
                                b.f(parcel, (Parcelable)object, 1);
                                break;
                            }
                            case 19: {
                                n8 = this.X0(object.readString(), object.readString()) ? 1 : 0;
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 18: {
                                n8 = this.l0(object.readString(), object.readLong()) ? 1 : 0;
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 17: {
                                n8 = this.h(object.readString()) ? 1 : 0;
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 16: {
                                n8 = this.W1(object.readString()) ? 1 : 0;
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 15: {
                                n8 = this.x1(object.readString()) ? 1 : 0;
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 14: {
                                String string = object.readString();
                                if (object.readInt() != 0) {
                                    bl = true;
                                }
                                n8 = this.K1(string, bl);
                                parcel.writeNoException();
                                parcel.writeInt(n8);
                                break;
                            }
                            case 13: {
                                object = this.L0(object.readString());
                                parcel.writeNoException();
                                b.f(parcel, (Parcelable)object, 1);
                                break;
                            }
                            case 12: {
                                object = this.z(object.readString());
                                parcel.writeNoException();
                                b.f(parcel, (Parcelable)object, 1);
                                break;
                            }
                            case 11: {
                                object = this.d1(object.readString());
                                parcel.writeNoException();
                                b.e(parcel, (List)object, 1);
                                break;
                            }
                        }
                    } else {
                        this.destroy();
                        parcel.writeNoException();
                    }
                } else {
                    object = this.w0(object.readString());
                    parcel.writeNoException();
                    b.f(parcel, (Parcelable)object, 1);
                }
            } else {
                object = this.A0(object.readString(), object.readLong());
                parcel.writeNoException();
                parcel.writeStringList((List)object);
            }
            return true;
        }

        private static class a
        implements com.alphainventor.filemanager.shizuku.a {
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override
            public ParcelFileDescriptor G1(String string, boolean bl) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString(string);
                    parcel.writeInt(bl ? 1 : 0);
                    this.e.transact(20, parcel, parcel2, 0);
                    parcel2.readException();
                    string = (ParcelFileDescriptor)b.d(parcel2, ParcelFileDescriptor.CREATOR);
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public int K1(String string, boolean bl) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString(string);
                    parcel.writeInt(bl ? 1 : 0);
                    this.e.transact(14, parcel, parcel2, 0);
                    parcel2.readException();
                    int n8 = parcel2.readInt();
                    return n8;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public ax.p3.a L0(String object) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString((String)object);
                    this.e.transact(13, parcel, parcel2, 0);
                    parcel2.readException();
                    object = (ax.p3.a)b.d(parcel2, ax.p3.a.CREATOR);
                    return object;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public boolean W1(String string) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                        parcel2.writeString(string);
                        string = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    string.transact(16, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public boolean X0(String string, String string2) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                        parcel2.writeString(string);
                        parcel2.writeString(string2);
                        string = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    string.transact(19, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            public IBinder asBinder() {
                return this.e;
            }

            @Override
            public List<ax.p3.a> d1(String object) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString((String)object);
                    this.e.transact(11, parcel, parcel2, 0);
                    parcel2.readException();
                    object = parcel2.createTypedArrayList(ax.p3.a.CREATOR);
                    return object;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public boolean h(String string) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                        parcel2.writeString(string);
                        string = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    string.transact(17, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public boolean l0(String string, long l8) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                        parcel2.writeString(string);
                        parcel2.writeLong(l8);
                        string = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    string.transact(18, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public ParcelFileDescriptor w0(String string) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString(string);
                    this.e.transact(23, parcel, parcel2, 0);
                    parcel2.readException();
                    string = (ParcelFileDescriptor)b.d(parcel2, ParcelFileDescriptor.CREATOR);
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public boolean x1(String string) throws RemoteException {
                boolean bl;
                Parcel parcel;
                Parcel parcel2;
                block3: {
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                        parcel2.writeString(string);
                        string = this.e;
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel.recycle();
                        parcel2.recycle();
                        throw throwable;
                    }
                    string.transact(15, parcel2, parcel, 0);
                    parcel.readException();
                    int n8 = parcel.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel.recycle();
                parcel2.recycle();
                return bl;
            }

            @Override
            public ax.p3.a z(String object) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString((String)object);
                    this.e.transact(12, parcel, parcel2, 0);
                    parcel2.readException();
                    object = (ax.p3.a)b.d(parcel2, ax.p3.a.CREATOR);
                    return object;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public ParcelFileDescriptor z0(String string) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.alphainventor.filemanager.shizuku.IShizukuUserService");
                    parcel.writeString(string);
                    this.e.transact(21, parcel, parcel2, 0);
                    parcel2.readException();
                    string = (ParcelFileDescriptor)b.d(parcel2, ParcelFileDescriptor.CREATOR);
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }
    }

    public static class b {
        private static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return (T)creator.createFromParcel(parcel);
            }
            return null;
        }

        private static <T extends Parcelable> void e(Parcel parcel, List<T> list, int n8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int n9 = list.size();
            parcel.writeInt(n9);
            for (int i8 = 0; i8 < n9; ++i8) {
                b.f(parcel, (Parcelable)list.get(i8), n8);
            }
        }

        private static <T extends Parcelable> void f(Parcel parcel, T t8, int n8) {
            if (t8 != null) {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }
}

