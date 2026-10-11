.class public final Lax/r4/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/r4/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lax/Gb/g;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/r4/b$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lax/r4/a;)Lax/r4/b$b;
    .registers 20

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->c()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object v7, v1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    move-object v7, v0

    .line 11
    :goto_a
    if-eqz p1, :cond_12

    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->b()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v8, v1

    .line 18
    goto :goto_13

    .line 19
    :cond_12
    move-object v8, v0

    .line 20
    :goto_13
    if-eqz p1, :cond_1b

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->d()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v9, v1

    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    move-object v9, v0

    .line 29
    :goto_1c
    if-eqz p1, :cond_27

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->a()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_25

    .line 36
    .line 37
    goto :goto_27

    .line 38
    :cond_25
    :goto_25
    move-object v10, v1

    .line 39
    goto :goto_2c

    .line 40
    :cond_27
    :goto_27
    invoke-static {}, Lax/tb/o;->j()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_25

    .line 45
    :goto_2c
    if-eqz p1, :cond_34

    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->i()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v11, v1

    .line 52
    goto :goto_35

    .line 53
    :cond_34
    move-object v11, v0

    .line 54
    :goto_35
    if-eqz p1, :cond_3d

    .line 55
    .line 56
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->j()Lax/p4/z;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v12, v1

    .line 61
    goto :goto_3e

    .line 62
    :cond_3d
    move-object v12, v0

    .line 63
    :goto_3e
    if-eqz p1, :cond_46

    .line 64
    .line 65
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->g()Lax/p4/m;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    move-object v13, v1

    .line 70
    goto :goto_47

    .line 71
    :cond_46
    move-object v13, v0

    .line 72
    :goto_47
    if-eqz p1, :cond_4f

    .line 73
    .line 74
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->e()Lax/p4/k;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v3, v1

    .line 79
    goto :goto_50

    .line 80
    :cond_4f
    move-object v3, v0

    .line 81
    :goto_50
    if-eqz p1, :cond_58

    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->h()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    move-object v14, v1

    .line 88
    goto :goto_59

    .line 89
    :cond_58
    move-object v14, v0

    .line 90
    :goto_59
    if-eqz p1, :cond_5f

    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Lax/r4/a;->f()Lax/p4/q;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :cond_5f
    move-object v15, v0

    .line 97
    new-instance v2, Lax/r4/b$b;

    .line 98
    .line 99
    const/16 v16, 0xe

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    invoke-direct/range {v2 .. v17}, Lax/r4/b$b;-><init>(Lax/p4/k;Landroid/content/Intent;Lax/p4/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lax/p4/z;Lax/p4/m;Ljava/lang/String;Lax/p4/q;ILax/Gb/g;)V

    .line 107
    .line 108
    .line 109
    return-object v2
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method
