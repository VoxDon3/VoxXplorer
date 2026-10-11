.class Lax/d3/w$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/voxdon/xplorer/file/w$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/w;->g5(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/w;


# direct methods
.method constructor <init>(Lax/d3/w;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a(Z)V
    .registers 10

    .line 1
    iget-object v0, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lax/d3/w;->G5(Lax/d3/w;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_f

    .line 14
    .line 15
    goto :goto_5b

    .line 16
    :cond_f
    if-eqz p1, :cond_18

    .line 17
    .line 18
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 19
    .line 20
    const/16 v0, 0x2710

    .line 21
    .line 22
    invoke-static {p1, v0}, Lax/d3/w;->H5(Lax/d3/w;I)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 26
    .line 27
    invoke-static {p1}, Lax/d3/w;->I5(Lax/d3/w;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_33

    .line 36
    .line 37
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lax/d3/x;->j5(Z)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 43
    .line 44
    invoke-static {p1, v1}, Lax/d3/w;->x5(Lax/d3/w;Z)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 48
    .line 49
    invoke-virtual {p1}, Lax/d3/x;->a5()V

    .line 50
    .line 51
    .line 52
    :cond_33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 57
    .line 58
    invoke-static {p1}, Lax/d3/w;->z5(Lax/d3/w;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    sub-long v4, v2, v4

    .line 63
    .line 64
    const-wide/32 v6, 0x36ee80

    .line 65
    .line 66
    .line 67
    cmp-long p1, v4, v6

    .line 68
    .line 69
    if-lez p1, :cond_5b

    .line 70
    .line 71
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 72
    .line 73
    invoke-static {p1, v2, v3}, Lax/d3/w;->A5(Lax/d3/w;J)J

    .line 74
    .line 75
    .line 76
    new-instance p1, Lax/Z2/a$b;

    .line 77
    .line 78
    iget-object v0, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p1, v0}, Lax/Z2/a$b;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    new-array v0, v1, [Ljava/lang/Void;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 90
    .line 91
    .line 92
    :cond_5b
    :goto_5b
    return-void
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

.method public b(Ljava/util/HashMap;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lax/Q2/f;",
            "Lcom/voxdon/xplorer/file/w$f;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_1f

    .line 10
    :cond_9
    if-eqz p1, :cond_1f

    .line 11
    .line 12
    iget-object v1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 13
    .line 14
    invoke-static {v1}, Lax/d3/w;->C5(Lax/d3/w;)Lax/x3/m;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 19
    .line 20
    invoke-static {v3}, Lax/d3/w;->F5(Lax/d3/w;)Lax/Z2/d;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v0, v2, v3, p1}, Lax/d3/x;->w5(Landroid/content/Context;Lax/x3/n;Lax/Z2/d;Ljava/util/HashMap;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lax/d3/w$g;->a:Lax/d3/w;

    .line 28
    .line 29
    invoke-virtual {p1}, Lax/d3/w;->J5()V

    .line 30
    .line 31
    .line 32
    :cond_1f
    :goto_1f
    return-void
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
.end method
