.class Lax/d3/j$s;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/d3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field h:Lax/d3/j;

.field i:Landroid/content/Context;

.field j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lax/U2/d$e;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic k:Lax/d3/j;


# direct methods
.method public constructor <init>(Lax/d3/j;Lax/d3/j;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->d0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lax/d3/j$s;->h:Lax/d3/j;

    .line 9
    .line 10
    invoke-virtual {p2}, Lax/d3/j;->o3()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lax/d3/j$s;->i:Landroid/content/Context;

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
.end method

.method private w(Ljava/lang/String;Z)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "APPS_UNUSED"

    .line 8
    .line 9
    if-ne p1, v1, :cond_15

    .line 10
    .line 11
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 12
    .line 13
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/T2/h;->y()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_19

    .line 22
    :cond_15
    invoke-virtual {v0, p1}, Lax/U2/d;->R(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_19
    if-eqz v0, :cond_1f

    .line 27
    .line 28
    if-eqz p2, :cond_1e

    .line 29
    .line 30
    goto :goto_1f

    .line 31
    :cond_1e
    return-void

    .line 32
    :cond_1f
    :goto_1f
    iget-object p2, p0, Lax/d3/j$s;->h:Lax/d3/j;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-static {p2, p1, v0}, Lax/d3/j;->g5(Lax/d3/j;Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
    .line 41
.end method

.method private y(Ljava/lang/String;Z)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "APPS_UNUSED"

    .line 3
    .line 4
    if-ne p1, v1, :cond_2b

    .line 5
    .line 6
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 7
    .line 8
    invoke-static {v1}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lax/T2/h;->B0()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_22

    .line 17
    .line 18
    iget-object v2, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v2}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lax/U2/d;->B()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v1}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3, v2}, Lax/T2/h;->P0(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    invoke-static {v1}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lax/T2/h;->h0()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_35

    .line 44
    :cond_2b
    iget-object v1, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {v1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1, p1}, Lax/U2/d;->D(Ljava/lang/String;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_35
    if-eqz p2, :cond_42

    .line 55
    .line 56
    if-eqz v1, :cond_42

    .line 57
    .line 58
    iget-object p2, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {p2}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2, v1, v0}, Lax/U2/d;->i(Ljava/util/List;Z)V

    .line 65
    .line 66
    .line 67
    :cond_42
    if-eqz v1, :cond_5b

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_5b

    .line 74
    .line 75
    iget-object p2, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 76
    .line 77
    invoke-static {p2}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iget-object v2, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 82
    .line 83
    iget-object v3, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {v2, v3}, Lax/d3/j;->h5(Lax/d3/j;Landroid/content/Context;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p2, v1, v2}, Lax/U2/d;->e0(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    :cond_5b
    iget-object p2, p0, Lax/d3/j$s;->h:Lax/d3/j;

    .line 93
    .line 94
    invoke-static {p2, p1, v0}, Lax/d3/j;->g5(Lax/d3/j;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    const/4 p2, 0x2

    .line 98
    new-array p2, p2, [Ljava/lang/Object;

    .line 99
    .line 100
    aput-object p1, p2, v0

    .line 101
    .line 102
    const/4 p1, 0x1

    .line 103
    aput-object v1, p2, p1

    .line 104
    .line 105
    invoke-virtual {p0, p2}, Lax/u3/q;->v([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v1
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

.method private z()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lax/U2/d;->y()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lax/d3/j$s;->j:Ljava/util/Map;

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
.end method


# virtual methods
.method protected A(Ljava/lang/Void;)V
    .registers 3

    .line 1
    iget-object p1, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 2
    .line 3
    invoke-static {p1}, Lax/d3/j;->i5(Lax/d3/j;)Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_11

    .line 8
    .line 9
    iget-object p1, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 10
    .line 11
    invoke-static {p1}, Lax/d3/j;->i5(Lax/d3/j;)Lcom/voxdon/xplorer/widget/MyViewPager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 16
    .line 17
    .line 18
    :cond_11
    iget-object p1, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 19
    .line 20
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_36

    .line 25
    .line 26
    iget-object p1, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 27
    .line 28
    invoke-static {p1}, Lax/d3/j;->m5(Lax/d3/j;)Landroid/widget/EditText;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_36

    .line 49
    .line 50
    iget-object v0, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lax/d3/j;->F5(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/j$s;->x([Ljava/lang/Void;)Ljava/lang/Void;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected o()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method protected bridge synthetic q(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/d3/j$s;->A(Ljava/lang/Void;)V

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

.method protected r()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method protected varargs s([Ljava/lang/Object;)V
    .registers 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p1, v0

    .line 3
    .line 4
    check-cast v0, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aget-object p1, p1, v1

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    if-eqz p1, :cond_1d

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1d

    .line 18
    .line 19
    iget-object v1, p0, Lax/d3/j$s;->h:Lax/d3/j;

    .line 20
    .line 21
    invoke-static {v1}, Lax/d3/j;->e5(Lax/d3/j;)Lax/x3/c;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lax/d3/j$s;->j:Ljava/util/Map;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p1, v2}, Lax/x3/c;->A(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    :cond_1d
    return-void
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
.end method

.method protected varargs x([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 5

    .line 1
    new-instance p1, Lax/d3/j$s$a;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lax/d3/j$s$a;-><init>(Lax/d3/j$s;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 7
    .line 8
    invoke-static {v0}, Lax/d3/j;->Z4(Lax/d3/j;)Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-wide/16 v1, 0x14

    .line 13
    .line 14
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lax/d3/j$s;->z()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 21
    .line 22
    invoke-static {v0}, Lax/d3/j;->Z4(Lax/d3/j;)Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/d3/j$s;->i:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {p1}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v0, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 36
    .line 37
    invoke-virtual {v0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lax/Q2/f;->q1:Lax/Q2/f;

    .line 42
    .line 43
    const-string v2, "APPS_DOWNLOADED"

    .line 44
    .line 45
    if-ne v0, v1, :cond_35

    .line 46
    .line 47
    invoke-direct {p0, v2, p1}, Lax/d3/j$s;->w(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v2, p1}, Lax/d3/j$s;->y(Ljava/lang/String;Z)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    goto :goto_56

    .line 54
    :cond_35
    iget-object v0, p0, Lax/d3/j$s;->k:Lax/d3/j;

    .line 55
    .line 56
    invoke-virtual {v0}, Lax/d3/j;->z3()Lax/Q2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sget-object v1, Lax/Q2/f;->r1:Lax/Q2/f;

    .line 61
    .line 62
    if-ne v0, v1, :cond_48

    .line 63
    .line 64
    const-string v0, "APPS_UNUSED"

    .line 65
    .line 66
    invoke-direct {p0, v0, p1}, Lax/d3/j$s;->w(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v0, p1}, Lax/d3/j$s;->y(Ljava/lang/String;Z)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    goto :goto_56

    .line 73
    :cond_48
    invoke-direct {p0, v2, p1}, Lax/d3/j$s;->w(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    const-string v0, "APPS_ALL"

    .line 77
    .line 78
    invoke-direct {p0, v0, p1}, Lax/d3/j$s;->w(Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v2, p1}, Lax/d3/j$s;->y(Ljava/lang/String;Z)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v0, p1}, Lax/d3/j$s;->y(Ljava/lang/String;Z)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    :goto_56
    const/4 p1, 0x0

    .line 88
    return-object p1
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
