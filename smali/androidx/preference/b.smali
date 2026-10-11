.class final Landroidx/preference/b;
.super Landroidx/preference/Preference;
.source "SourceFile"


# instance fields
.field private R0:J


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;J)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Landroidx/preference/Preference;",
            ">;J)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/preference/b;->T0()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Landroidx/preference/b;->U0(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const-wide/32 p1, 0xf4240

    .line 11
    .line 12
    .line 13
    add-long/2addr p3, p1

    .line 14
    iput-wide p3, p0, Landroidx/preference/b;->R0:J

    .line 15
    .line 16
    return-void
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

.method private T0()V
    .registers 2

    .line 1
    sget v0, Lax/b2/i;->a:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->E0(I)V

    .line 4
    .line 5
    .line 6
    sget v0, Lax/b2/g;->a:I

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->A0(I)V

    .line 9
    .line 10
    .line 11
    sget v0, Lax/b2/j;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->L0(I)V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x3e7

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->I0(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private U0(Ljava/util/List;)V
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/preference/Preference;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x0

    .line 11
    :cond_a
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_5a

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/preference/Preference;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/preference/Preference;->O()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    instance-of v4, v2, Landroidx/preference/PreferenceGroup;

    .line 28
    .line 29
    if-eqz v4, :cond_2a

    .line 30
    .line 31
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_2a

    .line 36
    .line 37
    move-object v5, v2

    .line 38
    check-cast v5, Landroidx/preference/PreferenceGroup;

    .line 39
    .line 40
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2a
    invoke-virtual {v2}, Landroidx/preference/Preference;->E()Landroidx/preference/PreferenceGroup;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3c

    .line 52
    .line 53
    if-eqz v4, :cond_a

    .line 54
    .line 55
    check-cast v2, Landroidx/preference/PreferenceGroup;

    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_a

    .line 61
    :cond_3c
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_a

    .line 66
    .line 67
    if-nez v1, :cond_46

    .line 68
    .line 69
    move-object v1, v3

    .line 70
    goto :goto_a

    .line 71
    :cond_46
    invoke-virtual {p0}, Landroidx/preference/Preference;->s()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    sget v4, Lax/b2/j;->e:I

    .line 76
    .line 77
    const/4 v5, 0x2

    .line 78
    new-array v5, v5, [Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    aput-object v1, v5, v6

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    aput-object v3, v5, v1

    .line 85
    .line 86
    invoke-virtual {v2, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    goto :goto_a

    .line 91
    :cond_5a
    invoke-virtual {p0, v1}, Landroidx/preference/Preference;->J0(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    return-void
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


# virtual methods
.method public c0(Landroidx/preference/h;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Landroidx/preference/Preference;->c0(Landroidx/preference/h;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroidx/preference/h;->R(Z)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method x()J
    .registers 3

    .line 1
    iget-wide v0, p0, Landroidx/preference/b;->R0:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
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
.end method
