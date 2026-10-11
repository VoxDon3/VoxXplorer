.class public final Lax/K2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/K2/e;


# instance fields
.field private final a:Lax/k2/u;

.field private final b:Lax/k2/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/k2/i<",
            "Lax/K2/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/k2/u;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 5
    .line 6
    new-instance v0, Lax/K2/f$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lax/K2/f$a;-><init>(Lax/K2/f;Lax/k2/u;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lax/K2/f;->b:Lax/k2/i;

    .line 12
    .line 13
    return-void
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

.method public static c()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
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


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Long;
    .registers 6

    .line 1
    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lax/k2/x;->c(Ljava/lang/String;I)Lax/k2/x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez p1, :cond_d

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/k2/x;->t0(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_10

    .line 14
    :cond_d
    invoke-virtual {v0, v1, p1}, Lax/k2/x;->D(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_10
    iget-object p1, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 18
    .line 19
    invoke-virtual {p1}, Lax/k2/u;->d()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {p1, v0, v1, v2}, Lax/m2/b;->b(Lax/k2/u;Lax/o2/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :try_start_1d
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_35

    .line 35
    .line 36
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2a

    .line 41
    .line 42
    goto :goto_35

    .line 43
    :cond_2a
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v2
    :try_end_32
    .catchall {:try_start_1d .. :try_end_32} :catchall_33

    .line 51
    goto :goto_35

    .line 52
    :catchall_33
    move-exception v1

    .line 53
    goto :goto_3c

    .line 54
    :cond_35
    :goto_35
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :goto_3c
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lax/k2/x;->f()V

    .line 65
    .line 66
    .line 67
    throw v1
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
.end method

.method public b(Lax/K2/d;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/k2/u;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/k2/u;->e()V

    .line 9
    .line 10
    .line 11
    :try_start_a
    iget-object v0, p0, Lax/K2/f;->b:Lax/k2/i;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/k2/i;->j(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 17
    .line 18
    invoke-virtual {p1}, Lax/k2/u;->A()V
    :try_end_14
    .catchall {:try_start_a .. :try_end_14} :catchall_1a

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 22
    .line 23
    invoke-virtual {p1}, Lax/k2/u;->i()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_1a
    move-exception p1

    .line 28
    iget-object v0, p0, Lax/K2/f;->a:Lax/k2/u;

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/k2/u;->i()V

    .line 31
    .line 32
    .line 33
    throw p1
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
.end method
