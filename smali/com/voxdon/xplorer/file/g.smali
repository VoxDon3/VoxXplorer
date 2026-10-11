.class public Lcom/voxdon/xplorer/file/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/logging/Logger;


# instance fields
.field a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.DocumentFileClient"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/g;->b:Ljava/util/logging/Logger;

    .line 8
    .line 9
    return-void
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
.end method

.method constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/voxdon/xplorer/file/g;->a:Landroid/content/Context;

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

.method public static A(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gez v1, :cond_d

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
.end method

.method public static B(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gez v1, :cond_d

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
.end method

.method public static C(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Z
    .registers 5

    .line 1
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lax/Z2/j;->E0(Lax/c3/K;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1f

    .line 10
    .line 11
    if-eqz p2, :cond_1f

    .line 12
    .line 13
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/g;->n(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1d

    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/voxdon/xplorer/file/g;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1d

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_23

    .line 30
    :cond_1d
    const/4 v0, 0x0

    .line 31
    goto :goto_23

    .line 32
    :cond_1f
    invoke-static {p0, p1, p2}, Lcom/voxdon/xplorer/file/g;->x(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2b

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_2b
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/g;->H(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static D(Lax/c3/K;Lax/c3/l;)Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->i0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_17

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_12

    .line 17
    .line 18
    return v1

    .line 19
    :cond_12
    invoke-static {p0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_3f

    .line 24
    :cond_17
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lax/Q2/f;->c0(Lax/Q2/f;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2a

    .line 33
    .line 34
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p0}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    goto :goto_3f

    .line 43
    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "Unexpected location unit : "

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    :goto_3f
    iget-object v0, p1, Lax/c3/l;->b:Ljava/lang/String;

    .line 65
    .line 66
    if-eqz v0, :cond_5a

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v2, 0x1

    .line 73
    if-eqz v0, :cond_4b

    .line 74
    .line 75
    return v2

    .line 76
    :cond_4b
    iget-object p1, p1, Lax/c3/l;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_5a

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_5a

    .line 89
    .line 90
    return v2

    .line 91
    :cond_5a
    return v1
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

.method public static E(Ljava/lang/String;)Z
    .registers 2

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_4
    const-string v0, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
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

.method public static F(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z
    .registers 7

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-static {p3}, Lax/X2/v;->h(Landroid/net/Uri;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz p2, :cond_22

    .line 21
    .line 22
    invoke-static {v0}, Lcom/voxdon/xplorer/file/g;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_21

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_29

    .line 33
    .line 34
    :cond_21
    return v1

    .line 35
    :cond_22
    invoke-static {v0}, Lcom/voxdon/xplorer/file/g;->E(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_29

    .line 40
    .line 41
    return v1

    .line 42
    :cond_29
    if-nez p2, :cond_5f

    .line 43
    .line 44
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lax/Q2/f;->i0(Lax/Q2/f;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3e

    .line 53
    .line 54
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    goto :goto_63

    .line 63
    :cond_3e
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lax/Q2/f;->c0(Lax/Q2/f;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_51

    .line 72
    .line 73
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2, p1}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    goto :goto_63

    .line 82
    :cond_51
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, Lax/Q2/f;->o0(Lax/Q2/f;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5c

    .line 91
    .line 92
    return v1

    .line 93
    :cond_5c
    const-string v2, ""

    .line 94
    .line 95
    goto :goto_63

    .line 96
    :cond_5f
    invoke-static {p2}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_63
    invoke-static {p3}, Lcom/voxdon/xplorer/file/g;->c(Landroid/net/Uri;)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-static {p0, p3, v2}, Lcom/voxdon/xplorer/file/g;->i(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lax/c3/l;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-nez p0, :cond_6e

    .line 109
    .line 110
    return v1

    .line 111
    :cond_6e
    if-nez p2, :cond_75

    .line 112
    .line 113
    invoke-static {p1, p0}, Lcom/voxdon/xplorer/file/g;->D(Lax/c3/K;Lax/c3/l;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    return p0

    .line 118
    :cond_75
    invoke-static {v0}, Lcom/voxdon/xplorer/file/g;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object p2, Lax/c3/K;->e:Lax/c3/K;

    .line 123
    .line 124
    if-ne p1, p2, :cond_84

    .line 125
    .line 126
    const-string p1, "primary"

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    return p0

    .line 133
    :cond_84
    sget-object p2, Lax/c3/K;->f:Lax/c3/K;

    .line 134
    .line 135
    if-ne p1, p2, :cond_9b

    .line 136
    .line 137
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-eqz p1, :cond_9a

    .line 146
    .line 147
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_9a

    .line 152
    .line 153
    const/4 p0, 0x1

    .line 154
    return p0

    .line 155
    :cond_9a
    return v1

    .line 156
    :cond_9b
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_9e
    .catch Lax/b3/j; {:try_start_8 .. :try_end_9e} :catch_9e

    .line 157
    .line 158
    .line 159
    :catch_9e
    return v1
    .line 160
    .line 161
    .line 162
.end method

.method public static G(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;)Z
    .registers 7

    .line 1
    invoke-static {}, Lax/X2/Q;->V1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lax/Z2/j;->M(Lax/c3/K;)Lax/Z2/j$f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1a

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    iget-object v2, v0, Lax/Z2/j$f;->b:Landroid/net/Uri;

    .line 28
    .line 29
    if-eqz v2, :cond_23

    .line 30
    .line 31
    invoke-virtual {v2, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_23
    iget-object v2, v0, Lax/Z2/j$f;->a:Landroid/net/Uri;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_66

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_36

    .line 53
    .line 54
    goto :goto_66

    .line 55
    :cond_36
    invoke-static {p2}, Lcom/voxdon/xplorer/file/g;->c(Landroid/net/Uri;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-static {p0, v2, v3}, Lcom/voxdon/xplorer/file/g;->i(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lax/c3/l;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-nez p0, :cond_42

    .line 65
    .line 66
    return v1

    .line 67
    :cond_42
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, p0, Lax/c3/l;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, p1, p2, v3}, Lax/Z2/j;->U0(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lax/c3/l;->b:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Lax/c3/K;->j(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Lax/X2/v;->h(Landroid/net/Uri;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_66

    .line 86
    .line 87
    iget-object v2, p0, Lax/c3/l;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_66

    .line 94
    .line 95
    iput-object p2, v0, Lax/Z2/j$f;->b:Landroid/net/Uri;

    .line 96
    .line 97
    iget-object p0, p0, Lax/c3/l;->b:Ljava/lang/String;

    .line 98
    .line 99
    iput-object p0, v0, Lax/Z2/j$f;->c:Ljava/lang/String;
    :try_end_64
    .catch Lax/b3/j; {:try_start_8 .. :try_end_64} :catch_66

    .line 100
    .line 101
    const/4 p0, 0x1

    .line 102
    return p0

    .line 103
    :catch_66
    :cond_66
    :goto_66
    return v1
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static H(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z
    .registers 6

    .line 1
    invoke-virtual {p3}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.android.externalstorage.documents"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_11

    .line 12
    .line 13
    invoke-static {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/g;->F(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_11
    const-string p2, "com.android.mtp.documents"

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_1e

    .line 25
    .line 26
    invoke-static {p0, p1, p3}, Lcom/voxdon/xplorer/file/g;->G(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1e
    sget-object p0, Lcom/voxdon/xplorer/file/g;->b:Ljava/util/logging/Logger;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, "Unknown Document Athority : "

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static I(Lax/c3/K;Landroid/net/Uri;)Z
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_20

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, v0}, Lcom/voxdon/xplorer/file/g;->n(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_13

    .line 18
    .line 19
    return v1

    .line 20
    :cond_13
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_20
    sget-object v0, Lax/Q2/f;->h1:Lax/Q2/f;

    .line 34
    .line 35
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-ne v0, v2, :cond_37

    .line 40
    .line 41
    const-string p0, "com.android.mtp.documents"

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_36

    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_36
    return v1

    .line 56
    :cond_37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v2, "same storage uri :"

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, ":"

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return v1
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

.method public static J(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/e;",
            "Lcom/voxdon/xplorer/file/n;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_3d

    .line 26
    .line 27
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3d

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v3, "/Android"

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3d

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3d

    .line 57
    .line 58
    invoke-static {v0}, Lcom/voxdon/xplorer/file/g;->N(Landroid/net/Uri;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_3d
    move-object v3, v0

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    :try_start_44
    sget-object v4, Lax/c3/l;->g:[Ljava/lang/String;

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 75
    .line 76
    .line 77
    move-result-object v13
    :try_end_4d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_44 .. :try_end_4d} :catch_11a
    .catch Lax/b3/j; {:try_start_44 .. :try_end_4d} :catch_117
    .catch Ljava/lang/Exception; {:try_start_44 .. :try_end_4d} :catch_114
    .catchall {:try_start_44 .. :try_end_4d} :catchall_111

    .line 78
    if-eqz v13, :cond_109

    .line 79
    .line 80
    :try_start_4f
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v12

    .line 84
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_8d

    .line 89
    .line 90
    move-object v1, p1

    .line 91
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    move-object v1, p1

    .line 98
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    :catch_67
    :goto_67
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1
    :try_end_6b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4f .. :try_end_6b} :catch_88
    .catch Lax/b3/j; {:try_start_4f .. :try_end_6b} :catch_83
    .catch Ljava/lang/Exception; {:try_start_4f .. :try_end_6b} :catch_7e
    .catchall {:try_start_4f .. :try_end_6b} :catchall_79

    .line 108
    if-eqz v1, :cond_a9

    .line 109
    .line 110
    :try_start_6d
    new-instance v8, Lcom/voxdon/xplorer/file/y;

    .line 111
    .line 112
    move-object v9, p0

    .line 113
    check-cast v9, Lcom/voxdon/xplorer/file/x;

    .line 114
    .line 115
    invoke-direct/range {v8 .. v13}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Landroid/net/Uri;Lax/c3/K;Ljava/lang/String;Landroid/database/Cursor;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_78
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6d .. :try_end_78} :catch_67
    .catch Lax/b3/j; {:try_start_6d .. :try_end_78} :catch_83
    .catch Ljava/lang/Exception; {:try_start_6d .. :try_end_78} :catch_7e
    .catchall {:try_start_6d .. :try_end_78} :catchall_79

    .line 119
    .line 120
    .line 121
    goto :goto_67

    .line 122
    :catchall_79
    move-exception v0

    .line 123
    move-object p0, v0

    .line 124
    move-object v1, v13

    .line 125
    goto/16 :goto_17c

    .line 126
    .line 127
    :catch_7e
    move-exception v0

    .line 128
    move-object p0, v0

    .line 129
    move-object v1, v13

    .line 130
    goto/16 :goto_11d

    .line 131
    .line 132
    :catch_83
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    move-object v1, v13

    .line 135
    goto/16 :goto_147

    .line 136
    .line 137
    :catch_88
    move-exception v0

    .line 138
    move-object p0, v0

    .line 139
    move-object v1, v13

    .line 140
    goto/16 :goto_148

    .line 141
    .line 142
    :cond_8d
    :try_start_8d
    move-object v1, p1

    .line 143
    check-cast v1, Lcom/voxdon/xplorer/file/i;

    .line 144
    .line 145
    :goto_90
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_a9

    .line 150
    .line 151
    new-instance v2, Lcom/voxdon/xplorer/file/i;

    .line 152
    .line 153
    move-object v3, p0

    .line 154
    check-cast v3, Lcom/voxdon/xplorer/file/h;

    .line 155
    .line 156
    invoke-direct {v2, v3, v12, v13}, Lcom/voxdon/xplorer/file/i;-><init>(Lcom/voxdon/xplorer/file/h;Ljava/lang/String;Landroid/database/Cursor;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/i;->m0()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v2, v3}, Lcom/voxdon/xplorer/file/i;->q0(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_90

    .line 170
    :cond_a9
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-eqz p0, :cond_105

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-nez p0, :cond_105

    .line 181
    .line 182
    instance-of p0, p1, Lcom/voxdon/xplorer/file/y;

    .line 183
    .line 184
    if-eqz p0, :cond_105

    .line 185
    .line 186
    move-object p0, p1

    .line 187
    check-cast p0, Lcom/voxdon/xplorer/file/y;

    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->a1()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_105

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-nez v1, :cond_105

    .line 204
    .line 205
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->n()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_ff

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    sget-object v2, Lax/c3/K;->e:Lax/c3/K;

    .line 219
    .line 220
    if-eq v1, v2, :cond_f3

    .line 221
    .line 222
    const-string p1, "/Android/data"

    .line 223
    .line 224
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/y;->C0()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0
    :try_end_e7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8d .. :try_end_e7} :catch_88
    .catch Lax/b3/j; {:try_start_8d .. :try_end_e7} :catch_83
    .catch Ljava/lang/Exception; {:try_start_8d .. :try_end_e7} :catch_7e
    .catchall {:try_start_8d .. :try_end_e7} :catchall_79

    .line 232
    if-nez p0, :cond_ed

    .line 233
    .line 234
    invoke-static {v13}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_ed
    :try_start_ed
    new-instance p0, Lax/b3/e;

    .line 239
    .line 240
    invoke-direct {p0}, Lax/b3/e;-><init>()V

    .line 241
    .line 242
    .line 243
    throw p0
    :try_end_f3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_ed .. :try_end_f3} :catch_88
    .catch Lax/b3/j; {:try_start_ed .. :try_end_f3} :catch_83
    .catch Ljava/lang/Exception; {:try_start_ed .. :try_end_f3} :catch_7e
    .catchall {:try_start_ed .. :try_end_f3} :catchall_79

    .line 244
    :cond_f3
    :try_start_f3
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 245
    .line 246
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->x1()Landroid/net/Uri;
    :try_end_f8
    .catch Lax/b3/r; {:try_start_f3 .. :try_end_f8} :catch_f9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f3 .. :try_end_f8} :catch_88
    .catch Lax/b3/j; {:try_start_f3 .. :try_end_f8} :catch_83
    .catch Ljava/lang/Exception; {:try_start_f3 .. :try_end_f8} :catch_7e
    .catchall {:try_start_f3 .. :try_end_f8} :catchall_79

    .line 247
    .line 248
    .line 249
    goto :goto_105

    .line 250
    :catch_f9
    :try_start_f9
    new-instance p0, Lax/b3/e;

    .line 251
    .line 252
    invoke-direct {p0}, Lax/b3/e;-><init>()V

    .line 253
    .line 254
    .line 255
    throw p0

    .line 256
    :cond_ff
    new-instance p0, Lax/b3/t;

    .line 257
    .line 258
    invoke-direct {p0}, Lax/b3/t;-><init>()V

    .line 259
    .line 260
    .line 261
    throw p0
    :try_end_105
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f9 .. :try_end_105} :catch_88
    .catch Lax/b3/j; {:try_start_f9 .. :try_end_105} :catch_83
    .catch Ljava/lang/Exception; {:try_start_f9 .. :try_end_105} :catch_7e
    .catchall {:try_start_f9 .. :try_end_105} :catchall_79

    .line 262
    :cond_105
    :goto_105
    invoke-static {v13}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 263
    .line 264
    .line 265
    return-object v0

    .line 266
    :cond_109
    :try_start_109
    new-instance p0, Lax/b3/j;

    .line 267
    .line 268
    const-string p1, "query return null"

    .line 269
    .line 270
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw p0
    :try_end_111
    .catch Ljava/lang/IllegalArgumentException; {:try_start_109 .. :try_end_111} :catch_88
    .catch Lax/b3/j; {:try_start_109 .. :try_end_111} :catch_83
    .catch Ljava/lang/Exception; {:try_start_109 .. :try_end_111} :catch_7e
    .catchall {:try_start_109 .. :try_end_111} :catchall_79

    .line 274
    :catchall_111
    move-exception v0

    .line 275
    move-object p0, v0

    .line 276
    goto :goto_17c

    .line 277
    :catch_114
    move-exception v0

    .line 278
    move-object p0, v0

    .line 279
    goto :goto_11d

    .line 280
    :catch_117
    move-exception v0

    .line 281
    move-object p0, v0

    .line 282
    goto :goto_147

    .line 283
    :catch_11a
    move-exception v0

    .line 284
    move-object p0, v0

    .line 285
    goto :goto_148

    .line 286
    :goto_11d
    :try_start_11d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const-string v0, "listChildren : "

    .line 292
    .line 293
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v0, ":"

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-static {p1, p0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    throw p0

    .line 328
    :goto_147
    throw p0

    .line 329
    :goto_148
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-nez p1, :cond_176

    .line 341
    .line 342
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    const-string v0, "FileNotFoundException"

    .line 347
    .line 348
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-nez p1, :cond_176

    .line 353
    .line 354
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    const-string v0, "DOCUMENT FILE EXCEPTION DO NOT CONTAIN FILENOTFOUND"

    .line 363
    .line 364
    invoke-virtual {p1, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    invoke-virtual {p1, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 373
    .line 374
    .line 375
    :cond_176
    new-instance p0, Lax/b3/t;

    .line 376
    .line 377
    invoke-direct {p0}, Lax/b3/t;-><init>()V

    .line 378
    .line 379
    .line 380
    throw p0
    :try_end_17c
    .catchall {:try_start_11d .. :try_end_17c} :catchall_111

    .line 381
    :goto_17c
    invoke-static {v1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 382
    .line 383
    .line 384
    throw p0
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public static K(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->p()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-static/range {p1 .. p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-static/range {p1 .. p1}, Lcom/voxdon/xplorer/file/g;->v(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static/range {p2 .. p2}, Lcom/voxdon/xplorer/file/g;->v(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->n()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_d8

    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v14

    .line 37
    if-nez v14, :cond_3f

    .line 38
    .line 39
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->p()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->q()J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    invoke-static/range {v4 .. v10}, Lax/X2/v;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;JJ)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eqz v4, :cond_3f

    .line 60
    .line 61
    move-object/from16 v16, v4

    .line 62
    .line 63
    goto :goto_41

    .line 64
    :cond_3f
    move-object/from16 v16, v5

    .line 65
    .line 66
    :goto_41
    const/4 v4, 0x0

    .line 67
    :try_start_42
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    move-object v9, v11

    .line 72
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->p()J

    .line 73
    .line 74
    .line 75
    move-result-wide v10

    .line 76
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->q()J

    .line 77
    .line 78
    .line 79
    move-result-wide v12
    :try_end_4f
    .catch Lax/b3/j; {:try_start_42 .. :try_end_4f} :catch_5e

    .line 80
    move-object v8, v0

    .line 81
    move-object/from16 v7, v16

    .line 82
    .line 83
    :try_start_52
    invoke-static/range {v6 .. v13}, Lax/X2/y;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;JJ)Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_56
    .catch Lax/b3/j; {:try_start_52 .. :try_end_56} :catch_5c

    .line 87
    move-object/from16 v22, v4

    .line 88
    .line 89
    move-object v4, v0

    .line 90
    move-object/from16 v0, v22

    .line 91
    .line 92
    goto :goto_61

    .line 93
    :catch_5c
    move-exception v0

    .line 94
    goto :goto_61

    .line 95
    :catch_5e
    move-exception v0

    .line 96
    move-object/from16 v7, v16

    .line 97
    .line 98
    :goto_61
    if-nez v4, :cond_90

    .line 99
    .line 100
    invoke-virtual {v7, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_7e

    .line 105
    .line 106
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v17

    .line 114
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->p()J

    .line 115
    .line 116
    .line 117
    move-result-wide v18

    .line 118
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->q()J

    .line 119
    .line 120
    .line 121
    move-result-wide v20

    .line 122
    move-object/from16 v16, v7

    .line 123
    .line 124
    invoke-static/range {v15 .. v21}, Lax/X2/v;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;JJ)Landroid/net/Uri;

    .line 125
    .line 126
    .line 127
    :cond_7e
    if-nez v0, :cond_88

    .line 128
    .line 129
    new-instance v0, Lax/b3/j;

    .line 130
    .line 131
    const-string v1, "moveDocument failed 1"

    .line 132
    .line 133
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_88
    new-instance v1, Lax/b3/j;

    .line 138
    .line 139
    const-string v2, "moveDocument failed 2"

    .line 140
    .line 141
    invoke-direct {v1, v2, v0}, Lax/b3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_90
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_c7

    .line 154
    .line 155
    invoke-static/range {p2 .. p2}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v4, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_d2

    .line 164
    .line 165
    if-nez v14, :cond_d2

    .line 166
    .line 167
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    invoke-virtual/range {p2 .. p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v17

    .line 175
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->p()J

    .line 176
    .line 177
    .line 178
    move-result-wide v18

    .line 179
    invoke-interface/range {p1 .. p1}, Lax/c3/b;->q()J

    .line 180
    .line 181
    .line 182
    move-result-wide v20

    .line 183
    move-object/from16 v16, v4

    .line 184
    .line 185
    invoke-static/range {v15 .. v21}, Lax/X2/v;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;JJ)Landroid/net/Uri;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-eqz v0, :cond_bf

    .line 190
    .line 191
    goto :goto_d2

    .line 192
    :cond_bf
    new-instance v0, Lax/b3/j;

    .line 193
    .line 194
    const-string v1, "renameDocument in move failed"

    .line 195
    .line 196
    invoke-direct {v0, v1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :cond_c7
    sget-object v0, Lax/Q2/f;->h1:Lax/Q2/f;

    .line 201
    .line 202
    invoke-virtual/range {p1 .. p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    if-ne v0, v4, :cond_d2

    .line 207
    .line 208
    invoke-static {}, Lax/u3/b;->f()V

    .line 209
    .line 210
    .line 211
    :cond_d2
    :goto_d2
    if-eqz v1, :cond_d7

    .line 212
    .line 213
    invoke-interface {v1, v2, v3, v2, v3}, Lax/g3/i;->a(JJ)V

    .line 214
    .line 215
    .line 216
    :cond_d7
    return-void

    .line 217
    :cond_d8
    new-instance v0, Lax/b3/t;

    .line 218
    .line 219
    const-string v1, "Source File not exist"

    .line 220
    .line 221
    invoke-direct {v0, v1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public static L(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_61

    .line 10
    .line 11
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_25

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lax/Q2/f;->h1:Lax/Q2/f;

    .line 22
    .line 23
    if-eq p0, p1, :cond_1d

    .line 24
    .line 25
    const-string p0, "Not supported : doesSupportMoveFileToDifferentParent() == false"

    .line 26
    .line 27
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    new-instance p0, Lax/b3/j;

    .line 31
    .line 32
    const-string p1, "Folder rename is not supported"

    .line 33
    .line 34
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0

    .line 38
    :cond_25
    :try_start_25
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->s(Lcom/voxdon/xplorer/file/n;)Lax/c3/G;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v7
    :try_end_35
    .catch Lax/b3/a; {:try_start_25 .. :try_end_35} :catch_50
    .catch Lax/b3/j; {:try_start_25 .. :try_end_35} :catch_4c

    .line 54
    const/4 v8, 0x1

    .line 55
    move-object v2, p0

    .line 56
    move-object v3, p2

    .line 57
    move-object v9, p3

    .line 58
    move-object v10, p4

    .line 59
    :try_start_3a
    invoke-static/range {v2 .. v10}, Lcom/voxdon/xplorer/file/g;->Q(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
    :try_end_3d
    .catch Lax/b3/a; {:try_start_3a .. :try_end_3d} :catch_49
    .catch Lax/b3/j; {:try_start_3a .. :try_end_3d} :catch_46

    .line 60
    .line 61
    .line 62
    invoke-static {v2, p1}, Lcom/voxdon/xplorer/file/g;->g(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 63
    .line 64
    .line 65
    if-eqz v10, :cond_45

    .line 66
    .line 67
    invoke-interface {v10, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V

    .line 68
    .line 69
    .line 70
    :cond_45
    return-void

    .line 71
    :catch_46
    move-exception v0

    .line 72
    :goto_47
    move-object p0, v0

    .line 73
    goto :goto_54

    .line 74
    :catch_49
    move-exception v0

    .line 75
    :goto_4a
    move-object p0, v0

    .line 76
    goto :goto_58

    .line 77
    :catch_4c
    move-exception v0

    .line 78
    move-object v2, p0

    .line 79
    move-object v3, p2

    .line 80
    goto :goto_47

    .line 81
    :catch_50
    move-exception v0

    .line 82
    move-object v2, p0

    .line 83
    move-object v3, p2

    .line 84
    goto :goto_4a

    .line 85
    :goto_54
    invoke-static {v2, v3}, Lcom/voxdon/xplorer/file/g;->g(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :goto_58
    invoke-static {v2, v3}, Lcom/voxdon/xplorer/file/g;->g(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Lax/b3/j;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_61
    move-object v3, p2

    .line 99
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    const-string p1, "!! Move Document FILE ALREADY EXISTS !!"

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string p2, "location:"

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p2}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 147
    .line 148
    .line 149
    new-instance p0, Lax/b3/j;

    .line 150
    .line 151
    const-string p1, "moveUsingCopyDocumentFile file already exists"

    .line 152
    .line 153
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public static M(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-interface {p1}, Lax/c3/b;->q()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    invoke-static/range {v2 .. v8}, Lax/X2/v;->b(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;JJ)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    if-eqz p4, :cond_20

    .line 29
    .line 30
    invoke-interface {p4, v0, v1, v0, v1}, Lax/g3/i;->a(JJ)V

    .line 31
    .line 32
    .line 33
    :cond_20
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
.end method

.method public static N(Landroid/net/Uri;)Landroid/net/Uri;
    .registers 3

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-static {v0}, Lax/X2/Q;->l(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "manage"

    .line 11
    .line 12
    const-string v1, "true"

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static O(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)V
    .registers 6

    .line 1
    :try_start_0
    const-string v0, "pref_secondary"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/g;->y(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_19
    .catch Lax/b3/M; {:try_start_0 .. :try_end_19} :catch_1a

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_1a
    move-exception p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static P(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;J)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_a9

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_f
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v2, "rw"

    .line 21
    .line 22
    invoke-virtual {p0, v0, v2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_19
    .catch Ljava/lang/IllegalArgumentException; {:try_start_f .. :try_end_19} :catch_56
    .catch Ljava/lang/SecurityException; {:try_start_f .. :try_end_19} :catch_52
    .catchall {:try_start_f .. :try_end_19} :catchall_4e

    .line 26
    :try_start_19
    new-instance v0, Ljava/io/FileOutputStream;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_22
    .catch Ljava/lang/IllegalArgumentException; {:try_start_19 .. :try_end_22} :catch_49
    .catch Ljava/lang/SecurityException; {:try_start_19 .. :try_end_22} :catch_44
    .catchall {:try_start_19 .. :try_end_22} :catchall_40

    .line 33
    .line 34
    .line 35
    :try_start_22
    invoke-static {v0}, Lax/g2/b;->a(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, p2, p3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;
    :try_end_29
    .catch Ljava/lang/IllegalArgumentException; {:try_start_22 .. :try_end_29} :catch_3b
    .catch Ljava/lang/SecurityException; {:try_start_22 .. :try_end_29} :catch_36
    .catchall {:try_start_22 .. :try_end_29} :catchall_33

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_33
    move-exception p1

    .line 53
    goto/16 :goto_99

    .line 54
    .line 55
    :catch_36
    move-exception p1

    .line 56
    move-object v3, v1

    .line 57
    move-object v1, p0

    .line 58
    move-object p0, v3

    .line 59
    goto :goto_5a

    .line 60
    :catch_3b
    move-exception p2

    .line 61
    move-object v3, v1

    .line 62
    move-object v1, p0

    .line 63
    move-object p0, v3

    .line 64
    goto :goto_65

    .line 65
    :catchall_40
    move-exception p1

    .line 66
    move-object v0, v1

    .line 67
    goto/16 :goto_99

    .line 68
    .line 69
    :catch_44
    move-exception p1

    .line 70
    move-object v0, v1

    .line 71
    move-object v1, p0

    .line 72
    move-object p0, v0

    .line 73
    goto :goto_5a

    .line 74
    :catch_49
    move-exception p2

    .line 75
    move-object v0, v1

    .line 76
    move-object v1, p0

    .line 77
    move-object p0, v0

    .line 78
    goto :goto_65

    .line 79
    :catchall_4e
    move-exception p1

    .line 80
    move-object p0, v1

    .line 81
    move-object v0, p0

    .line 82
    goto :goto_99

    .line 83
    :catch_52
    move-exception p1

    .line 84
    move-object p0, v1

    .line 85
    move-object v0, p0

    .line 86
    goto :goto_5a

    .line 87
    :catch_56
    move-exception p2

    .line 88
    move-object p0, v1

    .line 89
    move-object v0, p0

    .line 90
    goto :goto_65

    .line 91
    :goto_5a
    :try_start_5a
    new-instance p2, Lax/b3/j;

    .line 92
    .line 93
    invoke-direct {p2, p1}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p2

    .line 97
    :catchall_60
    move-exception p1

    .line 98
    move-object v3, v1

    .line 99
    move-object v1, p0

    .line 100
    move-object p0, v3

    .line 101
    goto :goto_99

    .line 102
    :goto_65
    new-instance p3, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v2, "FILE:"

    .line 108
    .line 109
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-virtual {p3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    const-string v2, "trucate failed"

    .line 132
    .line 133
    invoke-virtual {p3, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-virtual {p3, p2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-virtual {p3, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 146
    .line 147
    .line 148
    new-instance p1, Ljava/io/IOException;

    .line 149
    .line 150
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    throw p1
    :try_end_99
    .catchall {:try_start_5a .. :try_end_99} :catchall_60

    .line 154
    :goto_99
    if-eqz v1, :cond_9e

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 157
    .line 158
    .line 159
    :cond_9e
    if-eqz v0, :cond_a3

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 162
    .line 163
    .line 164
    :cond_a3
    if-eqz p0, :cond_a8

    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 167
    .line 168
    .line 169
    :cond_a8
    throw p1

    .line 170
    :cond_a9
    new-instance p0, Lax/b3/t;

    .line 171
    .line 172
    invoke-direct {p0}, Lax/b3/t;-><init>()V

    .line 173
    .line 174
    .line 175
    throw p0
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static Q(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Lax/c3/G;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
    .registers 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/file/g;->d(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_198

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_86

    .line 21
    .line 22
    :try_start_15
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_89

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_89

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lax/c3/d0;->M(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_89

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lax/c3/d0;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_57

    .line 57
    .line 58
    const-string v4, ")"

    .line 59
    .line 60
    invoke-virtual {p1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_57

    .line 65
    .line 66
    const-string v4, "("

    .line 67
    .line 68
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p1
    :try_end_47
    .catch Lax/b3/j; {:try_start_15 .. :try_end_47} :catch_89

    .line 72
    if-nez p1, :cond_4a

    .line 73
    .line 74
    goto :goto_57

    .line 75
    :cond_4a
    :try_start_4a
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, v2}, Lax/X2/v;->f(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    :try_end_51
    .catch Ljava/lang/SecurityException; {:try_start_4a .. :try_end_51} :catch_51
    .catch Lax/b3/j; {:try_start_4a .. :try_end_51} :catch_89

    .line 80
    .line 81
    .line 82
    :catch_51
    :try_start_51
    new-instance p1, Lax/b3/f;

    .line 83
    .line 84
    invoke-direct {p1, v0}, Lax/b3/f;-><init>(Z)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_57
    :goto_57
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-string v4, "UNEXPECTED DOCUMENT FILE NAME"

    .line 97
    .line 98
    invoke-virtual {p1, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v4, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v5, "expected:"

    .line 108
    .line 109
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v3, ",uri:"

    .line 116
    .line 117
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {p1, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_85
    .catch Lax/b3/j; {:try_start_51 .. :try_end_85} :catch_89

    .line 132
    .line 133
    .line 134
    goto :goto_89

    .line 135
    :cond_86
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 136
    .line 137
    .line 138
    :catch_89
    :cond_89
    :goto_89
    const/4 p1, 0x0

    .line 139
    :cond_8a
    :goto_8a
    const/4 v3, 0x0

    .line 140
    :try_start_8b
    invoke-virtual {p2}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 141
    .line 142
    .line 143
    move-result-object v4
    :try_end_8f
    .catch Ljava/io/SyncFailedException; {:try_start_8b .. :try_end_8f} :catch_15f
    .catch Ljava/io/IOException; {:try_start_8b .. :try_end_8f} :catch_155
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8b .. :try_end_8f} :catch_130
    .catch Ljava/lang/SecurityException; {:try_start_8b .. :try_end_8f} :catch_12c
    .catch Ljava/lang/NullPointerException; {:try_start_8b .. :try_end_8f} :catch_123
    .catchall {:try_start_8b .. :try_end_8f} :catchall_11f

    .line 144
    :try_start_8f
    invoke-static {v1, v2}, Lax/X2/v;->p(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 145
    .line 146
    .line 147
    move-result-object v0
    :try_end_93
    .catch Ljava/io/FileNotFoundException; {:try_start_8f .. :try_end_93} :catch_a9
    .catch Ljava/io/SyncFailedException; {:try_start_8f .. :try_end_93} :catch_a6
    .catch Ljava/io/IOException; {:try_start_8f .. :try_end_93} :catch_a2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8f .. :try_end_93} :catch_a0
    .catch Ljava/lang/SecurityException; {:try_start_8f .. :try_end_93} :catch_9c
    .catch Ljava/lang/NullPointerException; {:try_start_8f .. :try_end_93} :catch_98
    .catchall {:try_start_8f .. :try_end_93} :catchall_94

    .line 148
    goto :goto_c0

    .line 149
    :catchall_94
    move-exception v0

    .line 150
    move-object p0, v0

    .line 151
    goto/16 :goto_185

    .line 152
    .line 153
    :catch_98
    move-exception v0

    .line 154
    move-object p0, v0

    .line 155
    goto/16 :goto_126

    .line 156
    .line 157
    :catch_9c
    move-exception v0

    .line 158
    :goto_9d
    move-object p0, v0

    .line 159
    goto/16 :goto_132

    .line 160
    .line 161
    :catch_a0
    move-exception v0

    .line 162
    goto :goto_9d

    .line 163
    :catch_a2
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    goto/16 :goto_158

    .line 166
    .line 167
    :catch_a6
    move-exception v0

    .line 168
    goto/16 :goto_161

    .line 169
    .line 170
    :catch_a9
    :try_start_a9
    invoke-static {v1, v2}, Lax/X2/v;->p(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-eqz v0, :cond_c0

    .line 175
    .line 176
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v5}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    const-string v6, "REMOTE EXCEPTION RETRY SUCCESS! : WriteDocumentFile"

    .line 185
    .line 186
    invoke-virtual {v5, v6}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v5}, Lax/Ha/b;->h()V

    .line 191
    .line 192
    .line 193
    :cond_c0
    :goto_c0
    if-eqz v0, :cond_c7

    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->createOutputStream()Ljava/io/FileOutputStream;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    goto :goto_c8

    .line 200
    :cond_c7
    move-object v5, v3

    .line 201
    :goto_c8
    if-nez v5, :cond_d2

    .line 202
    .line 203
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {v5, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    :cond_d2
    new-instance v6, Ljava/io/BufferedOutputStream;

    .line 212
    .line 213
    const/16 v7, 0x2000

    .line 214
    .line 215
    invoke-direct {v6, v5, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_d9
    .catch Ljava/io/SyncFailedException; {:try_start_a9 .. :try_end_d9} :catch_a6
    .catch Ljava/io/IOException; {:try_start_a9 .. :try_end_d9} :catch_a2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_a9 .. :try_end_d9} :catch_a0
    .catch Ljava/lang/SecurityException; {:try_start_a9 .. :try_end_d9} :catch_9c
    .catch Ljava/lang/NullPointerException; {:try_start_a9 .. :try_end_d9} :catch_98
    .catchall {:try_start_a9 .. :try_end_d9} :catchall_94

    .line 216
    .line 217
    .line 218
    move-object/from16 v8, p7

    .line 219
    .line 220
    move-object/from16 v9, p8

    .line 221
    .line 222
    move-object v5, v6

    .line 223
    move-wide v6, p3

    .line 224
    :try_start_df
    invoke-static/range {v4 .. v9}, Lax/c3/F;->c(Ljava/io/InputStream;Ljava/io/OutputStream;JLax/u3/c;Lax/g3/i;)J

    .line 225
    .line 226
    .line 227
    if-eqz v0, :cond_10e

    .line 228
    .line 229
    if-eqz p6, :cond_10e

    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/e;->k0()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_10e

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_f7
    .catch Ljava/io/SyncFailedException; {:try_start_df .. :try_end_f7} :catch_10b
    .catch Ljava/io/IOException; {:try_start_df .. :try_end_f7} :catch_107
    .catch Ljava/lang/IllegalArgumentException; {:try_start_df .. :try_end_f7} :catch_105
    .catch Ljava/lang/SecurityException; {:try_start_df .. :try_end_f7} :catch_101
    .catch Ljava/lang/NullPointerException; {:try_start_df .. :try_end_f7} :catch_fd
    .catchall {:try_start_df .. :try_end_f7} :catchall_f8

    .line 246
    .line 247
    .line 248
    goto :goto_10e

    .line 249
    :catchall_f8
    move-exception v0

    .line 250
    move-object p0, v0

    .line 251
    move-object v3, v5

    .line 252
    goto/16 :goto_185

    .line 253
    .line 254
    :catch_fd
    move-exception v0

    .line 255
    move-object p0, v0

    .line 256
    move-object v3, v5

    .line 257
    goto :goto_126

    .line 258
    :catch_101
    move-exception v0

    .line 259
    :goto_102
    move-object p0, v0

    .line 260
    move-object v3, v5

    .line 261
    goto :goto_132

    .line 262
    :catch_105
    move-exception v0

    .line 263
    goto :goto_102

    .line 264
    :catch_107
    move-exception v0

    .line 265
    move-object p0, v0

    .line 266
    move-object v3, v5

    .line 267
    goto :goto_158

    .line 268
    :catch_10b
    move-exception v0

    .line 269
    move-object v3, v5

    .line 270
    goto :goto_161

    .line 271
    :cond_10e
    :goto_10e
    :try_start_10e
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_111
    .catch Ljava/io/IOException; {:try_start_10e .. :try_end_111} :catch_112

    .line 272
    .line 273
    .line 274
    goto :goto_113

    .line 275
    :catch_112
    nop

    .line 276
    :goto_113
    if-eqz v4, :cond_11e

    .line 277
    .line 278
    :try_start_115
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_118
    .catch Ljava/io/IOException; {:try_start_115 .. :try_end_118} :catch_119

    .line 279
    .line 280
    .line 281
    goto :goto_11e

    .line 282
    :catch_119
    move-exception v0

    .line 283
    move-object p0, v0

    .line 284
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 285
    .line 286
    .line 287
    :cond_11e
    :goto_11e
    return-void

    .line 288
    :catchall_11f
    move-exception v0

    .line 289
    move-object p0, v0

    .line 290
    move-object v4, v3

    .line 291
    goto :goto_185

    .line 292
    :catch_123
    move-exception v0

    .line 293
    move-object p0, v0

    .line 294
    move-object v4, v3

    .line 295
    :goto_126
    :try_start_126
    new-instance p1, Lax/b3/j;

    .line 296
    .line 297
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    throw p1

    .line 301
    :catch_12c
    move-exception v0

    .line 302
    :goto_12d
    move-object p0, v0

    .line 303
    move-object v4, v3

    .line 304
    goto :goto_132

    .line 305
    :catch_130
    move-exception v0

    .line 306
    goto :goto_12d

    .line 307
    :goto_132
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    const-string p2, "LOWDF1:"

    .line 316
    .line 317
    invoke-virtual {p1, p2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p1, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 334
    .line 335
    .line 336
    new-instance p1, Lax/b3/j;

    .line 337
    .line 338
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    throw p1

    .line 342
    :catch_155
    move-exception v0

    .line 343
    move-object p0, v0

    .line 344
    move-object v4, v3

    .line 345
    :goto_158
    const-string p1, "write document error"

    .line 346
    .line 347
    invoke-static {p1, p0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    throw p0

    .line 352
    :catch_15f
    move-exception v0

    .line 353
    move-object v4, v3

    .line 354
    :goto_161
    if-gtz p1, :cond_17f

    .line 355
    .line 356
    invoke-virtual {p2}, Lax/c3/G;->a()Z

    .line 357
    .line 358
    .line 359
    move-result v5
    :try_end_167
    .catchall {:try_start_126 .. :try_end_167} :catchall_94

    .line 360
    if-eqz v5, :cond_17f

    .line 361
    .line 362
    add-int/lit8 p1, p1, 0x1

    .line 363
    .line 364
    if-eqz v3, :cond_172

    .line 365
    .line 366
    :try_start_16d
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_170
    .catch Ljava/io/IOException; {:try_start_16d .. :try_end_170} :catch_171

    .line 367
    .line 368
    .line 369
    goto :goto_172

    .line 370
    :catch_171
    nop

    .line 371
    :cond_172
    :goto_172
    if-eqz v4, :cond_8a

    .line 372
    .line 373
    :try_start_174
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_177
    .catch Ljava/io/IOException; {:try_start_174 .. :try_end_177} :catch_179

    .line 374
    .line 375
    .line 376
    goto/16 :goto_8a

    .line 377
    .line 378
    :catch_179
    move-exception v0

    .line 379
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_8a

    .line 383
    .line 384
    :cond_17f
    :try_start_17f
    new-instance p0, Lax/b3/j;

    .line 385
    .line 386
    invoke-direct {p0, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    throw p0
    :try_end_185
    .catchall {:try_start_17f .. :try_end_185} :catchall_94

    .line 390
    :goto_185
    if-eqz v3, :cond_18c

    .line 391
    .line 392
    :try_start_187
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_18a
    .catch Ljava/io/IOException; {:try_start_187 .. :try_end_18a} :catch_18b

    .line 393
    .line 394
    .line 395
    goto :goto_18c

    .line 396
    :catch_18b
    nop

    .line 397
    :cond_18c
    :goto_18c
    if-eqz v4, :cond_197

    .line 398
    .line 399
    :try_start_18e
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_191
    .catch Ljava/io/IOException; {:try_start_18e .. :try_end_191} :catch_192

    .line 400
    .line 401
    .line 402
    goto :goto_197

    .line 403
    :catch_192
    move-exception v0

    .line 404
    move-object p1, v0

    .line 405
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 406
    .line 407
    .line 408
    :cond_197
    :goto_197
    throw p0

    .line 409
    :cond_198
    new-instance p0, Lax/b3/j;

    .line 410
    .line 411
    const-string p1, "DocumentFile returns null"

    .line 412
    .line 413
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw p0
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;)Z
    .registers 2

    .line 1
    invoke-static {p0}, Lax/Z2/n;->b(Landroid/content/Context;)Lax/Z2/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lax/Z2/n;->d(Landroid/net/Uri;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static b(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)V
    .registers 5

    .line 1
    :try_start_0
    const-string v0, "pref_secondary"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 17
    .line 18
    if-ne v0, v1, :cond_18

    .line 19
    .line 20
    const-string v0, "secondaryRootUri"

    .line 21
    .line 22
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    :cond_18
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/g;->y(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_22
    .catch Lax/b3/M; {:try_start_0 .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    move-exception p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static c(Landroid/net/Uri;)Landroid/net/Uri;
    .registers 2

    .line 1
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static d(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {p0, v3}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_6b

    .line 22
    .line 23
    invoke-interface {p0}, Lax/c3/b;->n()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_6b

    .line 28
    .line 29
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->v(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 p1, 0x0

    .line 34
    if-eqz p2, :cond_43

    .line 35
    .line 36
    :try_start_23
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2, p0, v2}, Lax/X2/v;->e(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object p0
    :try_end_2b
    .catch Ljava/lang/SecurityException; {:try_start_23 .. :try_end_2b} :catch_2c

    .line 44
    return-object p0

    .line 45
    :catch_2c
    move-exception p0

    .line 46
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string v0, "CDF1"

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_43
    invoke-static {v1}, Lax/c3/v;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-nez p2, :cond_4b

    .line 73
    .line 74
    const-string p2, ""

    .line 75
    .line 76
    :cond_4b
    :try_start_4b
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0, p0, p2, v2}, Lax/X2/v;->d(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_53
    .catch Ljava/lang/SecurityException; {:try_start_4b .. :try_end_53} :catch_54

    .line 84
    return-object p0

    .line 85
    :catch_54
    move-exception p0

    .line 86
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    const-string v0, "CDF2"

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_6b
    new-instance p0, Lax/b3/j;

    .line 109
    .line 110
    const-string p1, "CreateDocument Parent not exists"

    .line 111
    .line 112
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_64

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_15

    .line 12
    .line 13
    invoke-static {p1}, Lax/X2/v;->h(Landroid/net/Uri;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1, p0}, Lax/X2/v;->c(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_15
    :try_start_15
    invoke-static {p0, p2}, Lax/c3/d0;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_26

    .line 27
    .line 28
    invoke-static {p0, p2}, Lax/c3/d0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1, p0}, Lcom/voxdon/xplorer/file/g;->f(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :catch_24
    move-exception p0

    .line 38
    goto :goto_45

    .line 39
    :cond_26
    new-instance p1, Lax/b3/j;

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "Path is not subdir of root"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ":"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1
    :try_end_45
    .catch Ljava/lang/IllegalArgumentException; {:try_start_15 .. :try_end_45} :catch_24

    .line 70
    :goto_45
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "Invalid PATH"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 93
    .line 94
    .line 95
    new-instance p1, Lax/b3/j;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_64
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string p2, "Null RootUri"

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v0, "loc:"

    .line 121
    .line 122
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p1, p0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 141
    .line 142
    .line 143
    new-instance p0, Lax/b3/r;

    .line 144
    .line 145
    const-string p1, "RootUri is empty"

    .line 146
    .line 147
    invoke-direct {p0, p1}, Lax/b3/r;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p0
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private static f(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    :try_start_2
    invoke-static {p0}, Lax/X2/v;->h(Landroid/net/Uri;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_d

    .line 12
    .line 13
    goto :goto_1d

    .line 14
    :cond_d
    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ltz v0, :cond_1d

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_1d

    .line 28
    :catch_1b
    move-exception p0

    .line 29
    goto :goto_35

    .line 30
    :cond_1d
    :goto_1d
    invoke-static {p1}, Lax/c3/d0;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p0, v0}, Lax/X2/v;->c(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 50
    .line 51
    .line 52
    move-result-object p0
    :try_end_34
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_34} :catch_1b

    .line 53
    return-object p0

    .line 54
    :goto_35
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "Invalid Tree PATH"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 77
    .line 78
    .line 79
    new-instance p1, Lax/b3/j;

    .line 80
    .line 81
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw p1
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

.method public static g(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1b

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1b

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gtz v0, :cond_13

    .line 18
    .line 19
    goto :goto_1b

    .line 20
    :cond_13
    new-instance p0, Lax/b3/k;

    .line 21
    .line 22
    const-string p1, "DocumentFile Delete Failed : has Children"

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lax/b3/k;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1b
    :goto_1b
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :try_start_1f
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, v1}, Lax/X2/v;->f(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    :try_end_2a
    .catch Lax/b3/j; {:try_start_1f .. :try_end_2a} :catch_2d
    .catch Ljava/lang/SecurityException; {:try_start_1f .. :try_end_2a} :catch_2b

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catch_2b
    move-exception v0

    .line 45
    goto :goto_2e

    .line 46
    :catch_2d
    move-exception v0

    .line 47
    :goto_2e
    instance-of v1, v0, Ljava/lang/SecurityException;

    .line 48
    .line 49
    if-eqz v1, :cond_6d

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, ".$recycle_bin$"

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_58

    .line 66
    .line 67
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "CDF3"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 86
    .line 87
    .line 88
    goto :goto_6d

    .line 89
    :cond_58
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "CDF4"

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 108
    .line 109
    .line 110
    :cond_6d
    :goto_6d
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-interface {p0, v1}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {p0}, Lax/c3/b;->n()Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-eqz p0, :cond_95

    .line 123
    .line 124
    new-instance p0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v1, "DocumentFile delete failed : exist=true, dir="

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0, v0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    throw p0

    .line 150
    :cond_95
    new-instance p0, Lax/b3/t;

    .line 151
    .line 152
    const-string p1, "DocumentFile delete failed : File not exist"

    .line 153
    .line 154
    invoke-direct {p0, p1}, Lax/b3/t;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public static h(Landroid/content/Context;Landroid/net/Uri;)Lax/c3/K;
    .registers 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-eqz v3, :cond_23

    .line 9
    .line 10
    :try_start_9
    invoke-static {p1}, Lax/X2/v;->h(Landroid/net/Uri;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    sget-object v5, Lax/c3/K;->e:Lax/c3/K;

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v3, :cond_23

    .line 25
    .line 26
    if-eqz v4, :cond_23

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v3
    :try_end_1f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_1f} :catch_22

    .line 32
    if-eqz v3, :cond_23

    .line 33
    .line 34
    return-object v5

    .line 35
    :catch_22
    nop

    .line 36
    :cond_23
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Lax/Z2/j;->Y()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz v3, :cond_4d

    .line 46
    .line 47
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Lax/Z2/j;->Y()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :cond_3a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_4d

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lax/c3/K;

    .line 70
    .line 71
    invoke-static {p0, v5, v4, p1}, Lcom/voxdon/xplorer/file/g;->H(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_3a

    .line 76
    .line 77
    return-object v5

    .line 78
    :cond_4d
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Lax/Z2/j;->L()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    :cond_59
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_6c

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Lax/c3/K;

    .line 101
    .line 102
    invoke-static {p0, v5, v4, p1}, Lcom/voxdon/xplorer/file/g;->H(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_59

    .line 107
    .line 108
    return-object v5

    .line 109
    :cond_6c
    new-array v3, v2, [Lax/Q2/f;

    .line 110
    .line 111
    sget-object v5, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 112
    .line 113
    aput-object v5, v3, v1

    .line 114
    .line 115
    sget-object v5, Lax/Q2/f;->u0:Lax/Q2/f;

    .line 116
    .line 117
    aput-object v5, v3, v0

    .line 118
    .line 119
    const/4 v5, 0x0

    .line 120
    :goto_77
    if-ge v5, v2, :cond_8e

    .line 121
    .line 122
    aget-object v6, v3, v5

    .line 123
    .line 124
    invoke-static {v6, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v6}, Lax/c3/K;->e()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-eqz v7, :cond_8c

    .line 133
    .line 134
    invoke-static {p0, v6, v4, p1}, Lcom/voxdon/xplorer/file/g;->H(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;Landroid/net/Uri;)Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-eqz v7, :cond_8c

    .line 139
    .line 140
    return-object v6

    .line 141
    :cond_8c
    add-int/2addr v5, v0

    .line 142
    goto :goto_77

    .line 143
    :cond_8e
    return-object v4
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public static i(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lax/c3/l;
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const-string v1, "Missing file"

    .line 2
    .line 3
    const-string v2, "No root for"

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 p0, 0x0

    .line 10
    :try_start_9
    sget-object v5, Lax/c3/l;->g:[Ljava/lang/String;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v4, p1

    .line 16
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_13
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_13} :catch_fa
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_13} :catch_f4
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_13} :catch_ee
    .catchall {:try_start_9 .. :try_end_13} :catchall_e8

    .line 20
    if-nez p1, :cond_d5

    .line 21
    .line 22
    :try_start_15
    invoke-static {v4}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v4}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    invoke-static {v0, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_21
    .catch Ljava/lang/IllegalArgumentException; {:try_start_15 .. :try_end_21} :catch_6f
    .catch Ljava/lang/SecurityException; {:try_start_15 .. :try_end_21} :catch_6b
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_21} :catch_67
    .catchall {:try_start_15 .. :try_end_21} :catchall_63

    .line 34
    const-string v10, "Remote Provider Error"

    .line 35
    .line 36
    if-eqz v0, :cond_cf

    .line 37
    .line 38
    :try_start_25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v4, "$A$B$C$D$E$F$G$H$I$J$K$L"

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v4
    :try_end_3e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_25 .. :try_end_3e} :catch_6f
    .catch Ljava/lang/SecurityException; {:try_start_25 .. :try_end_3e} :catch_6b
    .catch Ljava/lang/RuntimeException; {:try_start_25 .. :try_end_3e} :catch_67
    .catchall {:try_start_25 .. :try_end_3e} :catchall_63

    .line 63
    :try_start_3e
    const-string v0, "document_id"

    .line 64
    .line 65
    filled-new-array {v0}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_4b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3e .. :try_end_4b} :catch_7c
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_4b} :catch_79
    .catchall {:try_start_3e .. :try_end_4b} :catchall_63

    .line 76
    if-eqz p1, :cond_73

    .line 77
    .line 78
    :try_start_4d
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v3, "RETRY success for getting file attribute 1"

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 89
    .line 90
    .line 91
    new-instance v0, Lax/c3/l;

    .line 92
    .line 93
    invoke-direct {v0, v9, p2}, Lax/c3/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4d .. :try_end_5f} :catch_6f
    .catch Ljava/lang/SecurityException; {:try_start_4d .. :try_end_5f} :catch_6b
    .catch Ljava/lang/RuntimeException; {:try_start_4d .. :try_end_5f} :catch_67
    .catchall {:try_start_4d .. :try_end_5f} :catchall_63

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :catchall_63
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    goto/16 :goto_141

    .line 103
    .line 104
    :catch_67
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    goto/16 :goto_fe

    .line 107
    .line 108
    :catch_6b
    move-exception v0

    .line 109
    move-object p0, v0

    .line 110
    goto/16 :goto_107

    .line 111
    .line 112
    :catch_6f
    move-exception v0

    .line 113
    move-object p2, v0

    .line 114
    goto/16 :goto_10d

    .line 115
    .line 116
    :cond_73
    :try_start_73
    new-instance p2, Lax/b3/v;

    .line 117
    .line 118
    invoke-direct {p2, v10}, Lax/b3/v;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2

    .line 122
    :catch_79
    move-exception v0

    .line 123
    move-object p2, v0

    .line 124
    goto :goto_7e

    .line 125
    :catch_7c
    move-exception v0

    .line 126
    goto :goto_84

    .line 127
    :goto_7e
    new-instance v0, Lax/b3/j;

    .line 128
    .line 129
    invoke-direct {v0, p2}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :goto_84
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    if-eqz v3, :cond_9b

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_95

    .line 148
    .line 149
    goto :goto_9b

    .line 150
    :cond_95
    new-instance p2, Lax/b3/C;

    .line 151
    .line 152
    invoke-direct {p2, v0}, Lax/b3/C;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw p2

    .line 156
    :cond_9b
    :goto_9b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_c9

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_c9

    .line 171
    .line 172
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v3}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const-string v4, "RETRY success for getting file attribute 2"

    .line 181
    .line 182
    invoke-virtual {v3, v4}, Lax/Ha/b;->c(Ljava/lang/String;)Lax/Ha/b;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3, v0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 191
    .line 192
    .line 193
    new-instance v0, Lax/c3/l;

    .line 194
    .line 195
    invoke-direct {v0, v9, p2}, Lax/c3/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_73 .. :try_end_c5} :catch_6f
    .catch Ljava/lang/SecurityException; {:try_start_73 .. :try_end_c5} :catch_6b
    .catch Ljava/lang/RuntimeException; {:try_start_73 .. :try_end_c5} :catch_67
    .catchall {:try_start_73 .. :try_end_c5} :catchall_63

    .line 196
    .line 197
    .line 198
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :cond_c9
    :try_start_c9
    new-instance p2, Lax/b3/j;

    .line 203
    .line 204
    invoke-direct {p2, v0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw p2

    .line 208
    :cond_cf
    new-instance p2, Lax/b3/v;

    .line 209
    .line 210
    invoke-direct {p2, v10}, Lax/b3/v;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p2

    .line 214
    :cond_d5
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_e4

    .line 219
    .line 220
    new-instance p2, Lax/c3/l;

    .line 221
    .line 222
    invoke-direct {p2, p1}, Lax/c3/l;-><init>(Landroid/database/Cursor;)V
    :try_end_e0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c9 .. :try_end_e0} :catch_6f
    .catch Ljava/lang/SecurityException; {:try_start_c9 .. :try_end_e0} :catch_6b
    .catch Ljava/lang/RuntimeException; {:try_start_c9 .. :try_end_e0} :catch_67
    .catchall {:try_start_c9 .. :try_end_e0} :catchall_63

    .line 223
    .line 224
    .line 225
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 226
    .line 227
    .line 228
    return-object p2

    .line 229
    :cond_e4
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 230
    .line 231
    .line 232
    return-object p0

    .line 233
    :catchall_e8
    move-exception v0

    .line 234
    move-object p1, v0

    .line 235
    move-object v11, p1

    .line 236
    move-object p1, p0

    .line 237
    move-object p0, v11

    .line 238
    goto :goto_141

    .line 239
    :catch_ee
    move-exception v0

    .line 240
    move-object p1, v0

    .line 241
    move-object v11, p1

    .line 242
    move-object p1, p0

    .line 243
    move-object p0, v11

    .line 244
    goto :goto_fe

    .line 245
    :catch_f4
    move-exception v0

    .line 246
    move-object p1, v0

    .line 247
    move-object v11, p1

    .line 248
    move-object p1, p0

    .line 249
    move-object p0, v11

    .line 250
    goto :goto_107

    .line 251
    :catch_fa
    move-exception v0

    .line 252
    move-object p2, v0

    .line 253
    move-object p1, p0

    .line 254
    goto :goto_10d

    .line 255
    :goto_fe
    :try_start_fe
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 256
    .line 257
    .line 258
    new-instance p2, Lax/b3/j;

    .line 259
    .line 260
    invoke-direct {p2, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw p2

    .line 264
    :goto_107
    new-instance p2, Lax/b3/p;

    .line 265
    .line 266
    invoke-direct {p2, p0}, Lax/b3/p;-><init>(Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    throw p2

    .line 270
    :goto_10d
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    if-eqz v0, :cond_124

    .line 275
    .line 276
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-nez v0, :cond_11e

    .line 285
    .line 286
    goto :goto_124

    .line 287
    :cond_11e
    new-instance p0, Lax/b3/C;

    .line 288
    .line 289
    invoke-direct {p0, p2}, Lax/b3/C;-><init>(Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    throw p0

    .line 293
    :cond_124
    :goto_124
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-eqz v0, :cond_138

    .line 298
    .line 299
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 304
    .line 305
    .line 306
    move-result v0
    :try_end_132
    .catchall {:try_start_fe .. :try_end_132} :catchall_63

    .line 307
    if-eqz v0, :cond_138

    .line 308
    .line 309
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 310
    .line 311
    .line 312
    return-object p0

    .line 313
    :cond_138
    :try_start_138
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 314
    .line 315
    .line 316
    new-instance p0, Lax/b3/t;

    .line 317
    .line 318
    invoke-direct {p0, p2}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    throw p0
    :try_end_141
    .catchall {:try_start_138 .. :try_end_141} :catchall_63

    .line 322
    :goto_141
    invoke-static {p1}, Lax/c3/F;->a(Ljava/lang/AutoCloseable;)V

    .line 323
    .line 324
    .line 325
    throw p0
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static j(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Lax/c3/l;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, v0, p1}, Lcom/voxdon/xplorer/file/g;->i(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Lax/c3/l;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static k(Landroid/content/Context;Lcom/voxdon/xplorer/file/m;Lax/c3/K;Landroid/net/Uri;)Lax/c3/k0;
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/X2/Q;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_32

    .line 6
    .line 7
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "LOST.DIR"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_36

    .line 26
    .line 27
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, ".tempfstat"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Lax/c3/b;->n()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_36

    .line 46
    .line 47
    invoke-interface {p1, v1}, Lcom/voxdon/xplorer/file/c;->N(Lcom/voxdon/xplorer/file/n;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_36

    .line 51
    :cond_32
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_36
    :goto_36
    invoke-static {p2, p3, v0}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x0

    .line 60
    :try_start_3b
    const-string p3, "r"

    .line 61
    .line 62
    invoke-static {p0, p1, p3}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_68

    .line 67
    .line 68
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Landroid/system/Os;->fstatvfs(Ljava/io/FileDescriptor;)Landroid/system/StructStatVfs;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance v0, Lax/c3/k0;

    .line 77
    .line 78
    iget-wide v1, p0, Landroid/system/StructStatVfs;->f_blocks:J

    .line 79
    .line 80
    iget-wide v3, p0, Landroid/system/StructStatVfs;->f_bsize:J

    .line 81
    .line 82
    move-wide v5, v1

    .line 83
    mul-long v1, v5, v3

    .line 84
    .line 85
    iget-wide p0, p0, Landroid/system/StructStatVfs;->f_bavail:J

    .line 86
    .line 87
    sub-long p0, v5, p0

    .line 88
    .line 89
    mul-long v3, v3, p0

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-direct/range {v0 .. v5}, Lax/c3/k0;-><init>(JJI)V
    :try_end_5e
    .catch Landroid/system/ErrnoException; {:try_start_3b .. :try_end_5e} :catch_65
    .catchall {:try_start_3b .. :try_end_5e} :catchall_62

    .line 93
    .line 94
    .line 95
    :try_start_5e
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_61
    .catch Ljava/io/IOException; {:try_start_5e .. :try_end_61} :catch_61

    .line 96
    .line 97
    .line 98
    :catch_61
    return-object v0

    .line 99
    :catchall_62
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    goto :goto_76

    .line 102
    :catch_65
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    goto :goto_70

    .line 105
    :cond_68
    :try_start_68
    new-instance p0, Lax/b3/j;

    .line 106
    .line 107
    const-string p1, "faild to get file descriptor"

    .line 108
    .line 109
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0
    :try_end_70
    .catch Landroid/system/ErrnoException; {:try_start_68 .. :try_end_70} :catch_65
    .catchall {:try_start_68 .. :try_end_70} :catchall_62

    .line 113
    :goto_70
    :try_start_70
    new-instance p1, Lax/b3/j;

    .line 114
    .line 115
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw p1
    :try_end_76
    .catchall {:try_start_70 .. :try_end_76} :catchall_62

    .line 119
    :goto_76
    if-eqz p2, :cond_7b

    .line 120
    .line 121
    :try_start_78
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7b
    .catch Ljava/io/IOException; {:try_start_78 .. :try_end_7b} :catch_7b

    .line 122
    .line 123
    .line 124
    :catch_7b
    :cond_7b
    throw p0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v1, v0, p0}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1a
    invoke-static {p0}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_27

    .line 32
    .line 33
    check-cast p0, Lcom/voxdon/xplorer/file/i;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->n0()Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_27
    invoke-static {}, Lax/u3/b;->f()V

    .line 41
    .line 42
    .line 43
    new-instance p0, Lax/b3/j;

    .line 44
    .line 45
    const-string v0, "Illegal File Info Class"

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
    .line 51
    .line 52
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

.method public static m(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_26

    .line 11
    .line 12
    invoke-static {p0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_26

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "not reachable root uri : "

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_26
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/g;->n(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2d

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2d
    invoke-static {p0}, Lcom/voxdon/xplorer/file/g;->c(Landroid/net/Uri;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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

.method public static n(Lax/c3/K;Ljava/lang/String;)Landroid/net/Uri;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_26

    .line 11
    .line 12
    invoke-static {p0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_26

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "not reachable root tree : "

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_26
    if-eqz p1, :cond_33

    .line 40
    .line 41
    invoke-static {p0}, Lax/Q2/f;->Q(Lax/c3/K;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_33

    .line 46
    .line 47
    invoke-static {p1}, Lax/c3/d0;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_35

    .line 52
    :cond_33
    const-string p1, ""

    .line 53
    .line 54
    :goto_35
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, p0}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-nez p0, :cond_40

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_40
    new-instance v0, Landroid/net/Uri$Builder;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v1, "content"

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "com.android.externalstorage.documents"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "tree"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, ":"

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
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

.method public static o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_8
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_8} :catch_10
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_8} :catch_10
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_8} :catch_9
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_8} :catch_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_8} :catch_9
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_8} :catch_9

    .line 9
    return-object p0

    .line 10
    :catch_9
    move-exception p0

    .line 11
    new-instance p1, Lax/b3/j;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :catch_10
    move-exception p0

    .line 18
    new-instance p1, Lax/b3/t;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gez v1, :cond_d

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1a

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1a
    invoke-static {p0, p1}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static q(Landroid/content/Context;Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lax/c3/l;)Ljava/lang/String;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lax/Q2/f;->o0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_f

    .line 10
    .line 11
    invoke-static {p2, p3, p4, p5}, Lcom/voxdon/xplorer/file/g;->s(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lax/c3/l;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_f
    invoke-virtual {p1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0, p3}, Lcom/voxdon/xplorer/file/g;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method public static r(Landroid/net/Uri;)Ljava/lang/String;
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-static {p0}, Lax/X2/v;->g(Landroid/net/Uri;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p0}, Lcom/voxdon/xplorer/file/g;->A(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "primary"

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1c

    .line 17
    .line 18
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 19
    .line 20
    invoke-virtual {v1}, Lax/c3/K;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1, p0}, Lcom/voxdon/xplorer/file/g;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1c
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lax/Z2/j;->t0()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_43

    .line 38
    .line 39
    sget-object v2, Lax/c3/K;->f:Lax/c3/K;

    .line 40
    .line 41
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_43

    .line 46
    .line 47
    invoke-static {v3}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_43

    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_43

    .line 58
    .line 59
    invoke-virtual {v2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1, p0}, Lcom/voxdon/xplorer/file/g;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0
    :try_end_42
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_42} :catch_43

    .line 67
    return-object p0

    .line 68
    :catch_43
    :cond_43
    return-object v0
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private static s(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lax/c3/l;)Ljava/lang/String;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {}, Lax/X2/Q;->k1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2e

    .line 6
    .line 7
    if-eqz p0, :cond_17

    .line 8
    .line 9
    invoke-static {p0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_1a

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1a

    .line 20
    .line 21
    const-string p0, "/"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_17
    invoke-static {}, Lax/u3/b;->f()V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object p0, p3, Lax/c3/l;->b:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p0, :cond_23

    .line 30
    .line 31
    invoke-static {p2, p0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_23
    invoke-static {}, Lax/u3/b;->f()V

    .line 37
    .line 38
    .line 39
    new-instance p0, Lax/b3/j;

    .line 40
    .line 41
    const-string p1, "No displayname"

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2e
    invoke-static {}, Lax/u3/b;->f()V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lax/b3/j;

    .line 51
    .line 52
    const-string p1, "not reachable"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public static t(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "r"

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long p0, p2, v0

    .line 19
    .line 20
    if-eqz p0, :cond_50

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3}, Ljava/io/InputStream;->skip(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    cmp-long p0, v0, p2

    .line 27
    .line 28
    if-nez p0, :cond_1e

    .line 29
    .line 30
    goto :goto_50

    .line 31
    :cond_1e
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "Document file SKIP FAILED"

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "offst:"

    .line 47
    .line 48
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p2, ",skipped:"

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 71
    .line 72
    .line 73
    new-instance p0, Lax/b3/j;

    .line 74
    .line 75
    const-string p1, "AutoCloseInputStream skip failed"

    .line 76
    .line 77
    invoke-direct {p0, p1}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0
    :try_end_50
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_50} :catch_59
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_50} :catch_51

    .line 81
    :cond_50
    :goto_50
    return-object p1

    .line 82
    :catch_51
    move-exception p0

    .line 83
    const-string p1, "document getInputStream"

    .line 84
    .line 85
    invoke-static {p1, p0}, Lax/b3/d;->a(Ljava/lang/String;Ljava/lang/Exception;)Lax/b3/j;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :catch_59
    move-exception p0

    .line 91
    new-instance p1, Lax/b3/t;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Lax/b3/t;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static u(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Ljava/io/OutputStream;
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_88

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p0, p1, v1}, Lcom/voxdon/xplorer/file/g;->d(Lcom/voxdon/xplorer/file/e;Lcom/voxdon/xplorer/file/n;Z)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_80

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lax/Q2/f;->b0(Lax/Q2/f;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_7d

    .line 28
    .line 29
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_7d

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lax/c3/d0;->M(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_7d

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lax/c3/d0;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_4f

    .line 62
    .line 63
    const-string v3, ")"

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4f

    .line 70
    .line 71
    const-string v3, "("

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4f

    .line 78
    .line 79
    goto :goto_7d

    .line 80
    :cond_4f
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v3, "UNEXPECTED DOCUMENT FILE NAME 2"

    .line 89
    .line 90
    invoke-virtual {v1, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v4, "expected:"

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v4, ",created:"

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v3}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 124
    .line 125
    .line 126
    :cond_7d
    :goto_7d
    move-object v1, v2

    .line 127
    move-object v2, p0

    .line 128
    goto :goto_8d

    .line 129
    :cond_80
    new-instance p0, Ljava/io/IOException;

    .line 130
    .line 131
    const-string p1, "Create Document File failed"

    .line 132
    .line 133
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_88
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    move-object v1, v2

    .line 142
    :goto_8d
    if-eqz p2, :cond_9c

    .line 143
    .line 144
    :try_start_8f
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v3, "wa"

    .line 149
    .line 150
    invoke-virtual {v0, p0, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    goto :goto_a6

    .line 155
    :catch_9a
    move-exception p0

    .line 156
    goto :goto_b3

    .line 157
    :cond_9c
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v3, "wt"

    .line 162
    .line 163
    invoke-virtual {v0, p0, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_a6
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    .line 168
    .line 169
    invoke-direct {v0, p0}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_ab
    .catch Ljava/lang/IllegalArgumentException; {:try_start_8f .. :try_end_ab} :catch_9a
    .catch Ljava/lang/SecurityException; {:try_start_8f .. :try_end_ab} :catch_ac

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :catch_ac
    move-exception p0

    .line 174
    new-instance p1, Lax/b3/j;

    .line 175
    .line 176
    invoke-direct {p1, p0}, Lax/b3/j;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :goto_b3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v3, "FILE:"

    .line 186
    .line 187
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string p1, ":"

    .line 198
    .line 199
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-eqz v2, :cond_ea

    .line 210
    .line 211
    new-instance p2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string p1, ",CREATED:"

    .line 220
    .line 221
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    :cond_ea
    if-eqz v1, :cond_104

    .line 236
    .line 237
    new-instance p2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string p1, ",EXPECTED:"

    .line 246
    .line 247
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    :cond_104
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    const-string v0, "GetOutputStreamForDocumentFile failed"

    .line 270
    .line 271
    invoke-virtual {p2, v0}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    invoke-virtual {p2, p0}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p2, p1}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 284
    .line 285
    .line 286
    new-instance p1, Ljava/io/IOException;

    .line 287
    .line 288
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    throw p1
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public static v(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->N0()Landroid/net/Uri;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v1, v0, p0}, Lcom/voxdon/xplorer/file/g;->e(Lax/c3/K;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1a
    invoke-static {p0}, Lax/c3/B;->J(Lcom/voxdon/xplorer/file/n;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_27

    .line 32
    .line 33
    check-cast p0, Lcom/voxdon/xplorer/file/i;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/i;->o0()Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_27
    invoke-static {}, Lax/u3/b;->f()V

    .line 41
    .line 42
    .line 43
    new-instance p0, Lax/b3/j;

    .line 44
    .line 45
    const-string v0, "Illegal File Info Class"

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
    .line 51
    .line 52
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

.method public static w(Landroid/content/Context;Lcom/voxdon/xplorer/file/n;)Landroid/os/ParcelFileDescriptor;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/voxdon/xplorer/file/g;->l(Lcom/voxdon/xplorer/file/n;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "rw"

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Lcom/voxdon/xplorer/file/g;->o(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public static x(Landroid/content/Context;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    const-string v1, "pref_secondary"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 14
    .line 15
    if-ne v1, v2, :cond_1b

    .line 16
    .line 17
    const-string v1, "secondaryRootUri"

    .line 18
    .line 19
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1b

    .line 24
    .line 25
    return-object v1

    .line 26
    :catch_19
    move-exception p0

    .line 27
    goto :goto_3c

    .line 28
    :cond_1b
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/g;->y(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {}, Lax/X2/J;->o()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3b

    .line 41
    .line 42
    if-eqz p0, :cond_3b

    .line 43
    .line 44
    const-string p1, "content://0@com.android.externalstorage.documents"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_3b

    .line 51
    .line 52
    const-string p1, "0@com.android.externalstorage.documents"

    .line 53
    .line 54
    const-string p2, "com.android.externalstorage.documents"

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_3b
    .catch Lax/b3/M; {:try_start_1 .. :try_end_3b} :catch_19

    .line 60
    :cond_3b
    return-object p0

    .line 61
    :goto_3c
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    return-object v0
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static y(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/M;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->i0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ":"

    .line 10
    .line 11
    if-eqz v1, :cond_48

    .line 12
    .line 13
    const-string v1, "secondaryRootUri:"

    .line 14
    .line 15
    if-eqz p1, :cond_34

    .line 16
    .line 17
    sget-object v3, Lax/Q2/f;->p0:Lax/Q2/f;

    .line 18
    .line 19
    if-ne v0, v3, :cond_16

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_17

    .line 23
    :cond_16
    const/4 v0, 0x0

    .line 24
    :goto_17
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_48
    sget-object v1, Lax/Q2/f;->o0:Lax/Q2/f;

    .line 74
    .line 75
    const-string v3, "uuid is null"

    .line 76
    .line 77
    if-eq v0, v1, :cond_e2

    .line 78
    .line 79
    sget-object v1, Lax/Q2/f;->s0:Lax/Q2/f;

    .line 80
    .line 81
    if-ne v0, v1, :cond_54

    .line 82
    .line 83
    goto/16 :goto_e2

    .line 84
    .line 85
    :cond_54
    invoke-static {v0}, Lax/Q2/f;->c0(Lax/Q2/f;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    const-string v1, "documentRootUri:"

    .line 90
    .line 91
    if-eqz p1, :cond_86

    .line 92
    .line 93
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, p0}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_80

    .line 102
    .line 103
    new-instance p1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_80
    new-instance p0, Lax/b3/M;

    .line 130
    .line 131
    invoke-direct {p0, v3}, Lax/b3/M;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :cond_86
    invoke-static {v0}, Lax/Q2/f;->o0(Lax/Q2/f;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_ac

    .line 140
    .line 141
    new-instance p1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v1, "nonExternalRootUri:"

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lax/c3/K;->b()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :cond_ac
    new-instance p1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v3, "not reachable:"

    .line 179
    .line 180
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-static {p1}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance p1, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lax/c3/K;->b()I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :cond_e2
    :goto_e2
    if-eqz p1, :cond_10c

    .line 228
    .line 229
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0, p0}, Lax/Z2/j;->Z(Lax/c3/K;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    if-eqz p0, :cond_106

    .line 238
    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v1, "primaryRootUri:"

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    return-object p0

    .line 263
    :cond_106
    new-instance p0, Lax/b3/M;

    .line 264
    .line 265
    invoke-direct {p0, v3}, Lax/b3/M;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p0

    .line 269
    :cond_10c
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-virtual {p0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    const-string p1, "ROOT URI PREF NULL ROOT"

    .line 278
    .line 279
    invoke-virtual {p0, p1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-virtual {p0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 288
    .line 289
    .line 290
    new-instance p0, Lax/b3/M;

    .line 291
    .line 292
    const-string p1, "no rootTreePath"

    .line 293
    .line 294
    invoke-direct {p0, p1}, Lax/b3/M;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw p0
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method public static z(Ljava/lang/String;)Ljava/lang/String;
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    const-string v1, ":"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gez v1, :cond_d

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "/"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
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
