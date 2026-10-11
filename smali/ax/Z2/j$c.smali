.class Lax/Z2/j$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/Z2/j;->S0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/Z2/j;


# direct methods
.method constructor <init>(Lax/Z2/j;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Z2/j$c;->a:Lax/Z2/j;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "device"

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroid/hardware/usb/UsbDevice;

    .line 12
    .line 13
    if-eqz p2, :cond_15

    .line 14
    .line 15
    invoke-static {}, Lax/Q2/o;->i()Lax/Q2/o;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Lax/Q2/o;->c()V

    .line 20
    .line 21
    .line 22
    :cond_15
    const-string p2, "android.hardware.usb.action.USB_DEVICE_ATTACHED"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x1

    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p1, :cond_25

    .line 31
    .line 32
    iget-object p1, p0, Lax/Z2/j$c;->a:Lax/Z2/j;

    .line 33
    .line 34
    invoke-static {p1, v0}, Lax/Z2/j;->l(Lax/Z2/j;Z)Z

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    :cond_25
    invoke-static {}, Lax/X2/Q;->R1()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_3d

    .line 43
    .line 44
    invoke-static {}, Lax/Q2/e;->U()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_32

    .line 49
    .line 50
    goto :goto_3d

    .line 51
    :cond_32
    iget-object p1, p0, Lax/Z2/j$c;->a:Lax/Z2/j;

    .line 52
    .line 53
    invoke-static {p1, p2}, Lax/Z2/j;->a(Lax/Z2/j;Z)Z

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lax/Z2/j$c;->a:Lax/Z2/j;

    .line 57
    .line 58
    invoke-virtual {p1}, Lax/Z2/j;->K0()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3d
    :goto_3d
    if-eqz v0, :cond_5d

    .line 63
    .line 64
    invoke-static {}, Lax/X2/Q;->R1()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/16 p2, 0x3a98

    .line 69
    .line 70
    if-eqz p1, :cond_51

    .line 71
    .line 72
    invoke-static {}, Lax/X2/Q;->S1()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4e

    .line 77
    .line 78
    goto :goto_5f

    .line 79
    :cond_4e
    const/16 p2, 0x1770

    .line 80
    .line 81
    goto :goto_5f

    .line 82
    :cond_51
    iget-object p1, p0, Lax/Z2/j$c;->a:Lax/Z2/j;

    .line 83
    .line 84
    invoke-virtual {p1}, Lax/Z2/j;->y0()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_5a

    .line 89
    .line 90
    goto :goto_5f

    .line 91
    :cond_5a
    const/16 p2, 0xfa0

    .line 92
    .line 93
    goto :goto_5f

    .line 94
    :cond_5d
    const/16 p2, 0x5dc

    .line 95
    .line 96
    :goto_5f
    new-instance p1, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lax/Z2/j$c$a;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Lax/Z2/j$c$a;-><init>(Lax/Z2/j$c;)V

    .line 108
    .line 109
    .line 110
    int-to-long v1, p2

    .line 111
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-string p2, "local.intent.action.USB_DETECTING_STARTED"

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lax/u3/g;->f(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method
