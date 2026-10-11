.class abstract Lax/i2/r;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;"
    }
.end annotation


# instance fields
.field protected final a:Lax/i2/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/I<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final b:Lax/i2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/p<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final c:Lax/i2/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/j<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lax/i2/I;Lax/i2/p;Lax/i2/j;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/I<",
            "TK;>;",
            "Lax/i2/p<",
            "TK;>;",
            "Lax/i2/j<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_a

    .line 10
    :cond_9
    const/4 v2, 0x0

    .line 11
    :goto_a
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 12
    .line 13
    .line 14
    if-eqz p2, :cond_11

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    const/4 v2, 0x0

    .line 19
    :goto_12
    invoke-static {v2}, Lax/b0/g;->a(Z)V

    .line 20
    .line 21
    .line 22
    if-eqz p3, :cond_18

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    :cond_18
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 29
    .line 30
    iput-object p2, p0, Lax/i2/r;->b:Lax/i2/p;

    .line 31
    .line 32
    iput-object p3, p0, Lax/i2/r;->c:Lax/i2/j;

    .line 33
    .line 34
    return-void
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

.method static c(Lax/i2/o$a;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o$a<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_b

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/i2/o$a;->a()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p0, v0, :cond_b

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_b
    const/4 p0, 0x0

    .line 13
    return p0
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

.method static d(Lax/i2/o$a;)Z
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o$a<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_a

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/i2/o$a;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_a

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_a
    const/4 p0, 0x0

    .line 12
    return p0
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
.method protected final a(Lax/i2/o$a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o$a<",
            "TK;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i2/r;->b:Lax/i2/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lax/i2/p;->c(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Lax/b0/g;->i(Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lax/i2/r;->c(Lax/i2/o$a;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lax/i2/r;->d(Lax/i2/o$a;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Lax/b0/g;->a(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 26
    .line 27
    invoke-virtual {p1}, Lax/i2/o$a;->a()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Lax/i2/I;->h(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lax/i2/r;->c:Lax/i2/j;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lax/i2/j;->b(Lax/i2/o$a;)V

    .line 37
    .line 38
    .line 39
    return-void
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

.method protected final b(Lax/i2/o$a;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o$a<",
            "TK;>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_6

    .line 6
    :cond_5
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lax/i2/r;->d(Lax/i2/o$a;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 18
    .line 19
    invoke-virtual {v1}, Lax/i2/I;->e()Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lax/i2/r;->c:Lax/i2/j;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lax/i2/j;->b(Lax/i2/o$a;)V

    .line 25
    .line 26
    .line 27
    return v0
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
.end method

.method final e(Lax/i2/o$a;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/i2/o$a<",
            "TK;>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_6

    .line 6
    :cond_5
    const/4 v1, 0x0

    .line 7
    :goto_6
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lax/i2/r;->c(Lax/i2/o$a;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lax/i2/r;->d(Lax/i2/o$a;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Lax/b0/g;->a(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/i2/o$a;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v1, v2}, Lax/i2/I;->o(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2c

    .line 35
    .line 36
    iget-object v1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 37
    .line 38
    invoke-virtual {p1}, Lax/i2/o$a;->a()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Lax/i2/I;->c(I)V

    .line 43
    .line 44
    .line 45
    :cond_2c
    iget-object v1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 46
    .line 47
    invoke-virtual {v1}, Lax/i2/I;->j()Lax/i2/D;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lax/i2/D;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ne v1, v0, :cond_3e

    .line 56
    .line 57
    iget-object v1, p0, Lax/i2/r;->c:Lax/i2/j;

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lax/i2/j;->b(Lax/i2/o$a;)V

    .line 60
    .line 61
    .line 62
    goto :goto_43

    .line 63
    :cond_3e
    iget-object p1, p0, Lax/i2/r;->c:Lax/i2/j;

    .line 64
    .line 65
    invoke-virtual {p1}, Lax/i2/j;->a()V

    .line 66
    .line 67
    .line 68
    :goto_43
    return v0
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

.method f(Landroid/view/MotionEvent;Lax/i2/o$a;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            "Lax/i2/o$a<",
            "TK;>;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/i2/q;->j(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1a

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lax/i2/o$a;->e(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1a

    .line 12
    .line 13
    iget-object p1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 14
    .line 15
    invoke-virtual {p2}, Lax/i2/o$a;->b()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1, p2}, Lax/i2/I;->m(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1a

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1a
    const/4 p1, 0x0

    .line 28
    return p1
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

.method final g(Landroid/view/MotionEvent;)Z
    .registers 3

    .line 1
    invoke-static {p1}, Lax/i2/q;->o(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_19

    .line 7
    .line 8
    iget-object p1, p0, Lax/i2/r;->a:Lax/i2/I;

    .line 9
    .line 10
    invoke-virtual {p1}, Lax/i2/I;->l()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_19

    .line 15
    .line 16
    iget-object p1, p0, Lax/i2/r;->b:Lax/i2/p;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lax/i2/p;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_19

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_19
    return v0
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
.end method
