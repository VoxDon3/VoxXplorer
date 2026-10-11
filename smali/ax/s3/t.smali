.class public Lax/s3/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/s3/t$a;
    }
.end annotation


# direct methods
.method private static a(Landroid/app/NotificationChannel;Lax/s3/t$a;)Z
    .registers 5

    .line 1
    iget-object v0, p1, Lax/s3/t$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lax/s3/h;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_e

    .line 13
    .line 14
    return v1

    .line 15
    :cond_e
    iget-object v0, p1, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0}, Lax/s3/i;->a(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1b

    .line 26
    .line 27
    return v1

    .line 28
    :cond_1b
    iget p1, p1, Lax/s3/t$a;->d:I

    .line 29
    .line 30
    invoke-static {p0}, Lax/s3/j;->a(Landroid/app/NotificationChannel;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p1, p0, :cond_24

    .line 35
    .line 36
    return v1

    .line 37
    :cond_24
    const/4 p0, 0x0

    .line 38
    return p0
    .line 39
    .line 40
    .line 41
.end method

.method private static b(Landroid/app/NotificationManager;Lax/s3/t$a;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/s3/o;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p1, Lax/s3/t$a;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p1, Lax/s3/t$a;->d:I

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lax/s3/n;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p1, Lax/s3/t$a;->c:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v1, :cond_14

    .line 17
    .line 18
    invoke-static {v0, v1}, Lax/s3/p;->a(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_14
    iget-boolean v1, p1, Lax/s3/t$a;->e:Z

    .line 22
    .line 23
    invoke-static {v0, v1}, Lax/s3/q;->a(Landroid/app/NotificationChannel;Z)V

    .line 24
    .line 25
    .line 26
    iget v1, p1, Lax/s3/t$a;->f:I

    .line 27
    .line 28
    if-eqz v1, :cond_20

    .line 29
    .line 30
    invoke-static {v0, v1}, Lax/s3/r;->a(Landroid/app/NotificationChannel;I)V

    .line 31
    .line 32
    .line 33
    :cond_20
    iget-boolean v1, p1, Lax/s3/t$a;->g:Z

    .line 34
    .line 35
    invoke-static {v0, v1}, Lax/s3/s;->a(Landroid/app/NotificationChannel;Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p1, Lax/s3/t$a;->h:[J

    .line 39
    .line 40
    if-eqz v1, :cond_2c

    .line 41
    .line 42
    invoke-static {v0, v1}, Lax/s3/d;->a(Landroid/app/NotificationChannel;[J)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-boolean v1, p1, Lax/s3/t$a;->i:Z

    .line 46
    .line 47
    if-eqz v1, :cond_36

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    sget-object v2, Landroid/app/Notification;->AUDIO_ATTRIBUTES_DEFAULT:Landroid/media/AudioAttributes;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Lax/s3/e;->a(Landroid/app/NotificationChannel;Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    iget-boolean p1, p1, Lax/s3/t$a;->j:Z

    .line 56
    .line 57
    invoke-static {v0, p1}, Lax/s3/f;->a(Landroid/app/NotificationChannel;Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v0}, Lax/s3/g;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 61
    .line 62
    .line 63
    return-void
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

.method private static c(Ljava/util/List;Ljava/lang/String;)Landroid/app/NotificationChannel;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Landroid/app/NotificationChannel;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_21

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Lax/s3/k;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lax/s3/l;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_8

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_21
    return-object v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static d([Lax/s3/t$a;Ljava/lang/String;)Z
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    array-length v1, p0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_6
    if-ge v2, v1, :cond_17

    .line 8
    .line 9
    aget-object v3, p0, v2

    .line 10
    .line 11
    iget-object v3, v3, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_14

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_6

    .line 24
    :cond_17
    return v0
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

.method public static e(Landroid/content/Context;[Lax/s3/t$a;)V
    .registers 7

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/app/NotificationManager;

    .line 8
    .line 9
    if-nez p0, :cond_b

    .line 10
    .line 11
    goto :goto_73

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    :try_start_c
    invoke-static {p0}, Lax/s3/c;->a(Landroid/app/NotificationManager;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_3e

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :cond_16
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_3e

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Lax/s3/k;->a(Ljava/lang/Object;)Landroid/app/NotificationChannel;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Lax/s3/l;->a(Landroid/app/NotificationChannel;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {p1, v3}, Lax/s3/t;->d([Lax/s3/t$a;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_16

    .line 46
    .line 47
    if-eqz v3, :cond_16

    .line 48
    .line 49
    const-string v4, "miscellaneous"

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_16

    .line 56
    .line 57
    invoke-static {p0, v3}, Lax/s3/m;->a(Landroid/app/NotificationManager;Ljava/lang/String;)V
    :try_end_3b
    .catch Ljava/lang/NullPointerException; {:try_start_c .. :try_end_3b} :catch_55
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_3b} :catch_3c

    .line 58
    .line 59
    .line 60
    goto :goto_16

    .line 61
    :catch_3c
    move-exception v1

    .line 62
    goto :goto_40

    .line 63
    :cond_3e
    move-object v0, v1

    .line 64
    goto :goto_55

    .line 65
    :goto_40
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "Delete Channel Error"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, v1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Lax/Ha/b;->h()V

    .line 84
    .line 85
    .line 86
    :catch_55
    :goto_55
    array-length v1, p1

    .line 87
    const/4 v2, 0x0

    .line 88
    :goto_57
    if-ge v2, v1, :cond_73

    .line 89
    .line 90
    aget-object v3, p1, v2

    .line 91
    .line 92
    iget-object v4, v3, Lax/s3/t$a;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v0, v4}, Lax/s3/t;->c(Ljava/util/List;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_6d

    .line 99
    .line 100
    invoke-static {v4, v3}, Lax/s3/t;->a(Landroid/app/NotificationChannel;Lax/s3/t$a;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_70

    .line 105
    .line 106
    invoke-static {p0, v3}, Lax/s3/t;->b(Landroid/app/NotificationManager;Lax/s3/t$a;)V

    .line 107
    .line 108
    .line 109
    goto :goto_70

    .line 110
    :cond_6d
    invoke-static {p0, v3}, Lax/s3/t;->b(Landroid/app/NotificationManager;Lax/s3/t$a;)V

    .line 111
    .line 112
    .line 113
    :cond_70
    :goto_70
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_57

    .line 116
    :cond_73
    :goto_73
    return-void
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
