.class Landroidx/recyclerview/widget/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/recyclerview/widget/h$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
.method public a(Landroidx/recyclerview/widget/h$c;Landroidx/recyclerview/widget/h$c;)I
    .registers 9

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/h$c;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v3, 0x0

    .line 10
    :goto_9
    iget-object v4, p2, Landroidx/recyclerview/widget/h$c;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    if-nez v4, :cond_f

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v4, 0x0

    .line 17
    :goto_10
    const/4 v5, -0x1

    .line 18
    if-eq v3, v4, :cond_17

    .line 19
    .line 20
    if-nez v0, :cond_16

    .line 21
    .line 22
    return v2

    .line 23
    :cond_16
    return v5

    .line 24
    :cond_17
    iget-boolean v0, p1, Landroidx/recyclerview/widget/h$c;->a:Z

    .line 25
    .line 26
    iget-boolean v3, p2, Landroidx/recyclerview/widget/h$c;->a:Z

    .line 27
    .line 28
    if-eq v0, v3, :cond_21

    .line 29
    .line 30
    if-eqz v0, :cond_20

    .line 31
    .line 32
    return v5

    .line 33
    :cond_20
    return v2

    .line 34
    :cond_21
    iget v0, p2, Landroidx/recyclerview/widget/h$c;->b:I

    .line 35
    .line 36
    iget v2, p1, Landroidx/recyclerview/widget/h$c;->b:I

    .line 37
    .line 38
    sub-int/2addr v0, v2

    .line 39
    if-eqz v0, :cond_29

    .line 40
    .line 41
    return v0

    .line 42
    :cond_29
    iget p1, p1, Landroidx/recyclerview/widget/h$c;->c:I

    .line 43
    .line 44
    iget p2, p2, Landroidx/recyclerview/widget/h$c;->c:I

    .line 45
    .line 46
    sub-int/2addr p1, p2

    .line 47
    if-eqz p1, :cond_31

    .line 48
    .line 49
    return p1

    .line 50
    :cond_31
    return v1
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    .line 1
    check-cast p1, Landroidx/recyclerview/widget/h$c;

    .line 2
    .line 3
    check-cast p2, Landroidx/recyclerview/widget/h$c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/h$a;->a(Landroidx/recyclerview/widget/h$c;Landroidx/recyclerview/widget/h$c;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
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
