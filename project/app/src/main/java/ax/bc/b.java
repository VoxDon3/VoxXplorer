/*
 * Decompiled with CFR 0.152.
 */
package ax.bc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ax.bc.c;

public interface b
extends IInterface {
    public boolean H1() throws RemoteException;

    public boolean N0() throws RemoteException;

    public int P1() throws RemoteException;

    public void i1(int var1) throws RemoteException;

    public int q() throws RemoteException;

    public int q1(c var1, Bundle var2) throws RemoteException;

    public int r1(c var1, Bundle var2) throws RemoteException;

    public static abstract class ax.bc.b$a
    extends Binder
    implements b {
        public static b r(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("moe.shizuku.server.IShizukuService");
            if (iInterface != null && iInterface instanceof b) {
                return (b)iInterface;
            }
            return new a(iBinder);
        }

        public static b w() {
            return a.f;
        }

        private static class a
        implements b {
            public static b f;
            private IBinder e;

            a(IBinder iBinder) {
                this.e = iBinder;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public boolean H1() throws RemoteException {
                Throwable throwable2;
                Parcel parcel;
                Parcel parcel2;
                block5: {
                    boolean bl;
                    block4: {
                        block3: {
                            parcel2 = Parcel.obtain();
                            parcel = Parcel.obtain();
                            try {
                                parcel2.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                                IBinder iBinder = this.e;
                                bl = false;
                                if (iBinder.transact(16, parcel2, parcel, 0) || ax.bc.b$a.w() == null) break block3;
                                bl = ax.bc.b$a.w().H1();
                            }
                            catch (Throwable throwable2) {}
                            parcel.recycle();
                            parcel2.recycle();
                            return bl;
                        }
                        parcel.readException();
                        int n8 = parcel.readInt();
                        if (n8 == 0) break block4;
                        bl = true;
                        break block5;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    return bl;
                }
                parcel.recycle();
                parcel2.recycle();
                throw throwable2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public boolean N0() throws RemoteException {
                Throwable throwable2;
                Parcel parcel;
                Parcel parcel2;
                block5: {
                    boolean bl;
                    block4: {
                        block3: {
                            parcel2 = Parcel.obtain();
                            parcel = Parcel.obtain();
                            try {
                                parcel2.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                                IBinder iBinder = this.e;
                                bl = false;
                                if (iBinder.transact(17, parcel2, parcel, 0) || ax.bc.b$a.w() == null) break block3;
                                bl = ax.bc.b$a.w().N0();
                            }
                            catch (Throwable throwable2) {}
                            parcel.recycle();
                            parcel2.recycle();
                            return bl;
                        }
                        parcel.readException();
                        int n8 = parcel.readInt();
                        if (n8 == 0) break block4;
                        bl = true;
                        break block5;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    return bl;
                }
                parcel.recycle();
                parcel2.recycle();
                throw throwable2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int P1() throws RemoteException {
                int n8;
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (this.e.transact(3, parcel, parcel2, 0) || ax.bc.b$a.w() == null) {
                        parcel2.readException();
                        n8 = parcel2.readInt();
                    }
                    n8 = ax.bc.b$a.w().P1();
                }
                catch (Throwable throwable) {}
                parcel2.recycle();
                parcel.recycle();
                return n8;
                parcel2.recycle();
                parcel.recycle();
                throw throwable;
            }

            public IBinder asBinder() {
                return this.e;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void i1(int n8) throws RemoteException {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    parcel.writeInt(n8);
                    if (this.e.transact(15, parcel, parcel2, 0) || ax.bc.b$a.w() == null) {
                        parcel2.readException();
                    }
                    ax.bc.b$a.w().i1(n8);
                }
                catch (Throwable throwable) {}
                parcel2.recycle();
                parcel.recycle();
                return;
                parcel2.recycle();
                parcel.recycle();
                throw throwable;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int q() throws RemoteException {
                int n8;
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                    if (this.e.transact(4, parcel, parcel2, 0) || ax.bc.b$a.w() == null) {
                        parcel2.readException();
                        n8 = parcel2.readInt();
                    }
                    n8 = ax.bc.b$a.w().q();
                }
                catch (Throwable throwable) {}
                parcel2.recycle();
                parcel.recycle();
                return n8;
                parcel2.recycle();
                parcel.recycle();
                throw throwable;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int q1(c c8, Bundle bundle) throws RemoteException {
                Throwable throwable2;
                Parcel parcel;
                Parcel parcel2;
                block8: {
                    int n8;
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                        IBinder iBinder = c8 != null ? c8.asBinder() : null;
                        parcel2.writeStrongBinder(iBinder);
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 0);
                        } else {
                            parcel2.writeInt(0);
                        }
                        if (!this.e.transact(12, parcel2, parcel, 0) && ax.bc.b$a.w() != null) {
                            n8 = ax.bc.b$a.w().q1(c8, bundle);
                        } else {
                            parcel.readException();
                            n8 = parcel.readInt();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    return n8;
                }
                parcel.recycle();
                parcel2.recycle();
                throw throwable2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int r1(c c8, Bundle bundle) throws RemoteException {
                Throwable throwable2;
                Parcel parcel;
                Parcel parcel2;
                block8: {
                    int n8;
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("moe.shizuku.server.IShizukuService");
                        IBinder iBinder = c8 != null ? c8.asBinder() : null;
                        parcel2.writeStrongBinder(iBinder);
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 0);
                        } else {
                            parcel2.writeInt(0);
                        }
                        if (!this.e.transact(13, parcel2, parcel, 0) && ax.bc.b$a.w() != null) {
                            n8 = ax.bc.b$a.w().r1(c8, bundle);
                        } else {
                            parcel.readException();
                            n8 = parcel.readInt();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    parcel.recycle();
                    parcel2.recycle();
                    return n8;
                }
                parcel.recycle();
                parcel2.recycle();
                throw throwable2;
            }
        }
    }
}

