.class Lax/z3/a$g;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/z3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lax/z3/a;


# direct methods
.method private constructor <init>(Lax/z3/a;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/z3/a;Lax/z3/a$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/z3/a$g;-><init>(Lax/z3/a;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 6

    .line 1
    const-string p2, "connectivity"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    if-eqz p1, :cond_4a

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_16

    .line 21
    .line 22
    goto :goto_4a

    .line 23
    :cond_16
    iget-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 24
    .line 25
    iget-boolean v0, p1, Lax/z3/a;->B0:Z

    .line 26
    .line 27
    if-nez v0, :cond_49

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/z3/a;->c3()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_49

    .line 34
    .line 35
    iget-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 36
    .line 37
    iget-boolean v0, p1, Lax/z3/a;->A0:Z

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-nez v0, :cond_33

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w0()Lax/J0/a;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const/4 v0, 0x2

    .line 47
    iget-object v2, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1, v2}, Lax/J0/a;->g(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;

    .line 50
    .line 51
    .line 52
    :cond_33
    iget-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->w0()Lax/J0/a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v0, 0x3

    .line 59
    iget-object v2, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1, v2}, Lax/J0/a;->g(ILandroid/os/Bundle;Lax/J0/a$a;)Lax/K0/c;

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p1, Lax/z3/a;->B0:Z

    .line 68
    .line 69
    iget-object p1, p1, Lax/z3/a;->t0:Lax/D3/a;

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lax/D3/a;->b(I)V

    .line 72
    .line 73
    .line 74
    :cond_49
    return-void

    .line 75
    :cond_4a
    :goto_4a
    iget-object p1, p0, Lax/z3/a$g;->a:Lax/z3/a;

    .line 76
    .line 77
    iput-boolean p2, p1, Lax/z3/a;->B0:Z

    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
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
