.class public final Landroidx/activity/ImmLeaksCleaner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/ImmLeaksCleaner$a;,
        Landroidx/activity/ImmLeaksCleaner$c;,
        Landroidx/activity/ImmLeaksCleaner$d;,
        Landroidx/activity/ImmLeaksCleaner$e;
    }
.end annotation


# static fields
.field public static final c0:Landroidx/activity/ImmLeaksCleaner$c;

.field private static final d0:Lax/sb/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/sb/h<",
            "Landroidx/activity/ImmLeaksCleaner$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final q:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Landroidx/activity/ImmLeaksCleaner$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/activity/ImmLeaksCleaner$c;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/activity/ImmLeaksCleaner;->c0:Landroidx/activity/ImmLeaksCleaner$c;

    .line 8
    .line 9
    sget-object v0, Landroidx/activity/ImmLeaksCleaner$b;->q:Landroidx/activity/ImmLeaksCleaner$b;

    .line 10
    .line 11
    invoke-static {v0}, Lax/sb/i;->a(Lax/Fb/a;)Lax/sb/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroidx/activity/ImmLeaksCleaner;->d0:Lax/sb/h;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .registers 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/activity/ImmLeaksCleaner;->q:Landroid/app/Activity;

    .line 10
    .line 11
    return-void
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

.method public static final synthetic h()Lax/sb/h;
    .registers 1

    .line 1
    sget-object v0, Landroidx/activity/ImmLeaksCleaner;->d0:Lax/sb/h;

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
.method public b(Lax/G0/h;Landroidx/lifecycle/d$a;)V
    .registers 5

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Landroidx/lifecycle/d$a;->ON_DESTROY:Landroidx/lifecycle/d$a;

    .line 12
    .line 13
    if-eq p2, p1, :cond_f

    .line 14
    .line 15
    goto :goto_46

    .line 16
    :cond_f
    iget-object p1, p0, Landroidx/activity/ImmLeaksCleaner;->q:Landroid/app/Activity;

    .line 17
    .line 18
    const-string p2, "input_method"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lax/Gb/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 30
    .line 31
    sget-object p2, Landroidx/activity/ImmLeaksCleaner;->c0:Landroidx/activity/ImmLeaksCleaner$c;

    .line 32
    .line 33
    invoke-virtual {p2}, Landroidx/activity/ImmLeaksCleaner$c;->a()Landroidx/activity/ImmLeaksCleaner$a;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2, p1}, Landroidx/activity/ImmLeaksCleaner$a;->b(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2b

    .line 42
    .line 43
    goto :goto_46

    .line 44
    :cond_2b
    monitor-enter v0

    .line 45
    :try_start_2c
    invoke-virtual {p2, p1}, Landroidx/activity/ImmLeaksCleaner$a;->c(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1
    :try_end_30
    .catchall {:try_start_2c .. :try_end_30} :catchall_47

    .line 49
    if-nez v1, :cond_34

    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :cond_34
    :try_start_34
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 54
    .line 55
    .line 56
    move-result v1
    :try_end_38
    .catchall {:try_start_34 .. :try_end_38} :catchall_47

    .line 57
    if-eqz v1, :cond_3c

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :cond_3c
    :try_start_3c
    invoke-virtual {p2, p1}, Landroidx/activity/ImmLeaksCleaner$a;->a(Landroid/view/inputmethod/InputMethodManager;)Z

    .line 62
    .line 63
    .line 64
    move-result p2
    :try_end_40
    .catchall {:try_start_3c .. :try_end_40} :catchall_47

    .line 65
    monitor-exit v0

    .line 66
    if-eqz p2, :cond_46

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z

    .line 69
    .line 70
    .line 71
    :cond_46
    :goto_46
    return-void

    .line 72
    :catchall_47
    move-exception p1

    .line 73
    monitor-exit v0

    .line 74
    throw p1
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
