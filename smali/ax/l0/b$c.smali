.class Lax/l0/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/l0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final c0:Landroid/graphics/Rect;

.field private final d0:Z

.field private final e0:Lax/l0/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/l0/b$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final q:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(ZLax/l0/b$a;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lax/l0/b$a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/l0/b$c;->q:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/l0/b$c;->c0:Landroid/graphics/Rect;

    .line 17
    .line 18
    iput-boolean p1, p0, Lax/l0/b$c;->d0:Z

    .line 19
    .line 20
    iput-object p2, p0, Lax/l0/b$c;->e0:Lax/l0/b$a;

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/l0/b$c;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v1, p0, Lax/l0/b$c;->c0:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget-object v2, p0, Lax/l0/b$c;->e0:Lax/l0/b$a;

    .line 6
    .line 7
    invoke-interface {v2, p1, v0}, Lax/l0/b$a;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/l0/b$c;->e0:Lax/l0/b$a;

    .line 11
    .line 12
    invoke-interface {p1, p2, v1}, Lax/l0/b$a;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-ge p1, p2, :cond_16

    .line 21
    .line 22
    return v2

    .line 23
    :cond_16
    const/4 v3, 0x1

    .line 24
    if-le p1, p2, :cond_1a

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1a
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    iget p2, v1, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    if-ge p1, p2, :cond_26

    .line 32
    .line 33
    iget-boolean p1, p0, Lax/l0/b$c;->d0:Z

    .line 34
    .line 35
    if-eqz p1, :cond_25

    .line 36
    .line 37
    return v3

    .line 38
    :cond_25
    return v2

    .line 39
    :cond_26
    if-le p1, p2, :cond_2e

    .line 40
    .line 41
    iget-boolean p1, p0, Lax/l0/b$c;->d0:Z

    .line 42
    .line 43
    if-eqz p1, :cond_2d

    .line 44
    .line 45
    return v2

    .line 46
    :cond_2d
    return v3

    .line 47
    :cond_2e
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    iget p2, v1, Landroid/graphics/Rect;->bottom:I

    .line 50
    .line 51
    if-ge p1, p2, :cond_35

    .line 52
    .line 53
    return v2

    .line 54
    :cond_35
    if-le p1, p2, :cond_38

    .line 55
    .line 56
    return v3

    .line 57
    :cond_38
    iget p1, v0, Landroid/graphics/Rect;->right:I

    .line 58
    .line 59
    iget p2, v1, Landroid/graphics/Rect;->right:I

    .line 60
    .line 61
    if-ge p1, p2, :cond_44

    .line 62
    .line 63
    iget-boolean p1, p0, Lax/l0/b$c;->d0:Z

    .line 64
    .line 65
    if-eqz p1, :cond_43

    .line 66
    .line 67
    return v3

    .line 68
    :cond_43
    return v2

    .line 69
    :cond_44
    if-le p1, p2, :cond_4c

    .line 70
    .line 71
    iget-boolean p1, p0, Lax/l0/b$c;->d0:Z

    .line 72
    .line 73
    if-eqz p1, :cond_4b

    .line 74
    .line 75
    return v2

    .line 76
    :cond_4b
    return v3

    .line 77
    :cond_4c
    const/4 p1, 0x0

    .line 78
    return p1
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
