.class public final Lax/A2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/A2/v;


# static fields
.field public static final b:Lax/A2/y;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/A2/y;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/A2/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/A2/y;->b:Lax/A2/y;

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
.end method

.method private constructor <init>()V
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
.method public a(Landroid/content/Context;Lax/A2/m;)Lax/z2/a;
    .registers 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "densityCompatHelper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lax/A2/l;->a:Lax/A2/l;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lax/A2/l;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Landroid/app/Activity;

    .line 18
    .line 19
    if-eqz v1, :cond_1b

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {p0, v0, p2}, Lax/A2/y;->b(Landroid/app/Activity;Lax/A2/m;)Lax/z2/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1b
    instance-of v0, v0, Landroid/inputmethodservice/InputMethodService;

    .line 29
    .line 30
    if-eqz v0, :cond_4f

    .line 31
    .line 32
    const-string v0, "window"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lax/Gb/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast v0, Landroid/view/WindowManager;

    .line 44
    .line 45
    sget-object v1, Lax/A2/u;->a:Lax/A2/u;

    .line 46
    .line 47
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "getDefaultDisplay(...)"

    .line 52
    .line 53
    invoke-static {v0, v2}, Lax/Gb/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lax/A2/u;->a(Landroid/view/Display;)Landroid/graphics/Point;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Landroid/graphics/Rect;

    .line 61
    .line 62
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 63
    .line 64
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v1, v3, v3, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lax/z2/a;

    .line 71
    .line 72
    invoke-interface {p2, p1}, Lax/A2/m;->a(Landroid/content/Context;)F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-direct {v0, v1, p1}, Lax/z2/a;-><init>(Landroid/graphics/Rect;F)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_4f
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, " is not a UiContext"

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2
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

.method public b(Landroid/app/Activity;Lax/A2/m;)Lax/z2/a;
    .registers 6

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "densityCompatHelper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lax/z2/a;

    .line 12
    .line 13
    new-instance v1, Lax/y2/a;

    .line 14
    .line 15
    sget-object v2, Lax/A2/c;->a:Lax/A2/c$a;

    .line 16
    .line 17
    invoke-virtual {v2}, Lax/A2/c$a;->a()Lax/A2/c;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2, p1}, Lax/A2/c;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v1, v2}, Lax/y2/a;-><init>(Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, p1}, Lax/A2/m;->a(Landroid/content/Context;)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {v0, v1, p1}, Lax/z2/a;-><init>(Lax/y2/a;F)V

    .line 33
    .line 34
    .line 35
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
