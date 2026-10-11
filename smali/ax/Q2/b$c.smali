.class Lax/Q2/b$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/Q2/b;->q(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/Q2/b;


# direct methods
.method constructor <init>(Lax/Q2/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Q2/b$c;->a:Lax/Q2/b;

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
    .registers 4

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1c

    .line 12
    .line 13
    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1c

    .line 20
    .line 21
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_5c

    .line 28
    .line 29
    :cond_1c
    iget-object v0, p0, Lax/Q2/b$c;->a:Lax/Q2/b;

    .line 30
    .line 31
    invoke-static {v0}, Lax/Q2/b;->a(Lax/Q2/b;)Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p2}, Lax/U2/d;->b0(Landroid/content/Intent;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lax/c3/u;->a()V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Lax/Q2/b$c;->a:Lax/Q2/b;

    .line 46
    .line 47
    invoke-static {p2}, Lax/Q2/b;->d(Lax/Q2/b;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-eqz p2, :cond_5c

    .line 52
    .line 53
    iget-object p2, p0, Lax/Q2/b$c;->a:Lax/Q2/b;

    .line 54
    .line 55
    invoke-static {p2}, Lax/Q2/b;->d(Lax/Q2/b;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-lez p2, :cond_5c

    .line 64
    .line 65
    iget-object p2, p0, Lax/Q2/b$c;->a:Lax/Q2/b;

    .line 66
    .line 67
    invoke-static {p2}, Lax/Q2/b;->d(Lax/Q2/b;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    :cond_4a
    :goto_4a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_5c

    .line 80
    .line 81
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Lax/g3/g;

    .line 86
    .line 87
    if-eqz v0, :cond_4a

    .line 88
    .line 89
    invoke-interface {v0, p1}, Lax/g3/g;->J(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4a

    .line 93
    :cond_5c
    return-void
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
