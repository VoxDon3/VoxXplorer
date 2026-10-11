.class public final Lax/a1/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a1/f0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/a1/J$b;,
        Lax/a1/J$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_7

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_b

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_b
    iput-object p1, p0, Lax/a1/J;->a:Landroid/content/Context;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private b(Landroid/content/Context;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/J;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_9
    if-eqz p1, :cond_29

    .line 11
    .line 12
    invoke-static {p1}, Lax/Q0/m;->c(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "offloadVariableRateSupported"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_21

    .line 23
    .line 24
    const-string v0, "offloadVariableRateSupported=1"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_21

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    const/4 p1, 0x0

    .line 35
    :goto_22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lax/a1/J;->b:Ljava/lang/Boolean;

    .line 40
    .line 41
    goto :goto_2d

    .line 42
    :cond_29
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    iput-object p1, p0, Lax/a1/J;->b:Ljava/lang/Boolean;

    .line 45
    .line 46
    :goto_2d
    iget-object p1, p0, Lax/a1/J;->b:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public a(Lax/P0/v;Lax/P0/c;)Lax/a1/l;
    .registers 7

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_60

    .line 12
    .line 13
    iget v1, p1, Lax/P0/v;->H:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v1, v2, :cond_12

    .line 17
    .line 18
    goto :goto_60

    .line 19
    :cond_12
    iget-object v1, p0, Lax/a1/J;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {p0, v1}, Lax/a1/J;->b(Landroid/content/Context;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p1, Lax/P0/v;->o:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v2}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lax/P0/v;->k:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v3}, Lax/P0/D;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_5d

    .line 40
    .line 41
    invoke-static {v2}, Lax/S0/d0;->K(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v0, v3, :cond_2f

    .line 46
    .line 47
    goto :goto_5d

    .line 48
    :cond_2f
    iget v3, p1, Lax/P0/v;->G:I

    .line 49
    .line 50
    invoke-static {v3}, Lax/S0/d0;->M(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_3a

    .line 55
    .line 56
    sget-object p1, Lax/a1/l;->d:Lax/a1/l;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3a
    :try_start_3a
    iget p1, p1, Lax/P0/v;->H:I

    .line 60
    .line 61
    invoke-static {p1, v3, v2}, Lax/S0/d0;->L(III)Landroid/media/AudioFormat;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_40
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3a .. :try_end_40} :catch_5a

    .line 65
    const/16 v2, 0x1f

    .line 66
    .line 67
    if-lt v0, v2, :cond_4f

    .line 68
    .line 69
    invoke-virtual {p2}, Lax/P0/c;->a()Lax/P0/c$d;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iget-object p2, p2, Lax/P0/c$d;->a:Landroid/media/AudioAttributes;

    .line 74
    .line 75
    invoke-static {p1, p2, v1}, Lax/a1/J$b;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Lax/a1/l;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_4f
    invoke-virtual {p2}, Lax/P0/c;->a()Lax/P0/c$d;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iget-object p2, p2, Lax/P0/c$d;->a:Landroid/media/AudioAttributes;

    .line 85
    .line 86
    invoke-static {p1, p2, v1}, Lax/a1/J$a;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Lax/a1/l;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :catch_5a
    sget-object p1, Lax/a1/l;->d:Lax/a1/l;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5d
    :goto_5d
    sget-object p1, Lax/a1/l;->d:Lax/a1/l;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_60
    :goto_60
    sget-object p1, Lax/a1/l;->d:Lax/a1/l;

    .line 98
    .line 99
    return-object p1
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
