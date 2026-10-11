.class Lcom/android/ex/photo/f$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/J0/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/ex/photo/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/J0/a$a<",
        "Lax/A3/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/android/ex/photo/f;


# direct methods
.method private constructor <init>(Lcom/android/ex/photo/f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/ex/photo/f;Lcom/android/ex/photo/f$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lcom/android/ex/photo/f$h;-><init>(Lcom/android/ex/photo/f;)V

    return-void
.end method


# virtual methods
.method public a(Lax/K0/c;Lax/A3/b$a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/K0/c<",
            "Lax/A3/b$a;",
            ">;",
            "Lax/A3/b$a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/ex/photo/f;->H(Lcom/android/ex/photo/f;)Lcom/android/ex/photo/f$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/android/ex/photo/f$g;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, v0}, Lax/A3/b$a;->a(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/android/ex/photo/f;->H(Lcom/android/ex/photo/f;)Lcom/android/ex/photo/f$g;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Lcom/android/ex/photo/f$g;->o()Lcom/android/ex/photo/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lax/K0/c;->k()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v1, 0x1

    .line 30
    if-eq p1, v1, :cond_29

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    if-eq p1, v0, :cond_23

    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    iget-object p1, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    .line 37
    .line 38
    invoke-static {p1, p2}, Lcom/android/ex/photo/f;->I(Lcom/android/ex/photo/f;Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_29
    if-nez p2, :cond_30

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-interface {v0, p1}, Lcom/android/ex/photo/a;->e(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    invoke-interface {v0, p2}, Lcom/android/ex/photo/a;->e(Landroid/graphics/drawable/Drawable;)V

    .line 50
    .line 51
    .line 52
    return-void
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

.method public p(Lax/K0/c;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/K0/c<",
            "Lax/A3/b$a;",
            ">;)V"
        }
    .end annotation

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
    .line 22
.end method

.method public bridge synthetic v(Lax/K0/c;Ljava/lang/Object;)V
    .registers 3

    .line 1
    check-cast p2, Lax/A3/b$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/ex/photo/f$h;->a(Lax/K0/c;Lax/A3/b$a;)V

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

.method public w(ILandroid/os/Bundle;)Lax/K0/c;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Lax/K0/c<",
            "Lax/A3/b$a;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "image_uri"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq p1, v1, :cond_15

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p1, v1, :cond_e

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_e
    iget-object p1, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    .line 16
    .line 17
    invoke-virtual {p1, v1, p2, v0}, Lcom/android/ex/photo/f;->z(ILandroid/os/Bundle;Ljava/lang/String;)Lax/K0/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_15
    iget-object p1, p0, Lcom/android/ex/photo/f$h;->a:Lcom/android/ex/photo/f;

    .line 23
    .line 24
    invoke-virtual {p1, v1, p2, v0}, Lcom/android/ex/photo/f;->z(ILandroid/os/Bundle;Ljava/lang/String;)Lax/K0/c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
