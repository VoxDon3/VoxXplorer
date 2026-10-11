.class public Lax/x3/f;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/x3/f$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/x3/f$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lax/x3/f$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/x3/f;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lax/x3/f;->a:Ljava/util/List;

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

.method public static a(Landroid/content/Context;)Lax/x3/f;
    .registers 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/x3/f$a;

    .line 7
    .line 8
    sget-object v2, Lax/Q2/f;->N0:Lax/Q2/f;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Lax/x3/f$a;

    .line 18
    .line 19
    sget-object v2, Lax/Q2/f;->O0:Lax/Q2/f;

    .line 20
    .line 21
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    new-instance v1, Lax/x3/f$a;

    .line 28
    .line 29
    sget-object v2, Lax/Q2/f;->P0:Lax/Q2/f;

    .line 30
    .line 31
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lax/X2/Q;->D0()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_34

    .line 42
    .line 43
    new-instance v1, Lax/x3/f$a;

    .line 44
    .line 45
    sget-object v2, Lax/Q2/f;->S0:Lax/Q2/f;

    .line 46
    .line 47
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_34
    new-instance v1, Lax/x3/f;

    .line 54
    .line 55
    invoke-direct {v1, p0, v0}, Lax/x3/f;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    return-object v1
    .line 59
    .line 60
    .line 61
.end method

.method public static b(Landroid/content/Context;)Lax/x3/f;
    .registers 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/x3/f$a;

    .line 7
    .line 8
    sget-object v2, Lax/Q2/f;->L0:Lax/Q2/f;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Lax/x3/f$a;

    .line 18
    .line 19
    sget-object v2, Lax/Q2/f;->J0:Lax/Q2/f;

    .line 20
    .line 21
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    new-instance v1, Lax/x3/f$a;

    .line 28
    .line 29
    sget-object v2, Lax/Q2/f;->H0:Lax/Q2/f;

    .line 30
    .line 31
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-direct {v1, p0, v2, v4}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, Lax/x3/f$a;

    .line 40
    .line 41
    sget-object v2, Lax/Q2/f;->I0:Lax/Q2/f;

    .line 42
    .line 43
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    new-instance v1, Lax/x3/f$a;

    .line 50
    .line 51
    sget-object v2, Lax/Q2/f;->K0:Lax/Q2/f;

    .line 52
    .line 53
    invoke-direct {v1, p0, v2, v3}, Lax/x3/f$a;-><init>(Landroid/content/Context;Lax/Q2/f;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance v1, Lax/x3/f;

    .line 60
    .line 61
    invoke-direct {v1, p0, v0}, Lax/x3/f;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-object v1
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
.end method


# virtual methods
.method public c(I)Lax/x3/f$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x3/f;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lax/x3/f$a;

    .line 8
    .line 9
    return-object p1
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

.method public getCount()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x3/f;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/x3/f;->c(I)Lax/x3/f$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method public getItemId(I)J
    .registers 4

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
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

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .registers 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    check-cast p2, Landroid/widget/TextView;

    .line 5
    .line 6
    goto :goto_19

    .line 7
    :cond_6
    iget-object p2, p0, Lax/x3/f;->b:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "layout_inflater"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Landroid/view/LayoutInflater;

    .line 16
    .line 17
    const v1, 0x7f0d0122

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Landroid/widget/TextView;

    .line 25
    .line 26
    :goto_19
    invoke-virtual {p0, p1}, Lax/x3/f;->c(I)Lax/x3/f$a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p3, p1, Lax/x3/f$a;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Lax/x3/f;->b:Landroid/content/Context;

    .line 36
    .line 37
    iget-object p1, p1, Lax/x3/f$a;->a:Lax/Q2/f;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {p1, v1}, Lax/s3/b;->k(Lax/Q2/f;Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p3, p1}, Lax/s3/a;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p3, p0, Lax/x3/f;->b:Landroid/content/Context;

    .line 49
    .line 50
    const/16 v2, 0x20

    .line 51
    .line 52
    invoke-static {p3, v2}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    invoke-virtual {p1, v0, v0, p3, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lax/x3/f;->b:Landroid/content/Context;

    .line 63
    .line 64
    const/16 p3, 0xc

    .line 65
    .line 66
    invoke-static {p1, p3}, Lax/u3/B;->e(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 71
    .line 72
    .line 73
    return-object p2
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
