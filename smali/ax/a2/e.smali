.class public final synthetic Lax/a2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroidx/media3/ui/b;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/ui/b;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a2/e;->a:Landroidx/media3/ui/b;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a2/e;->a:Landroidx/media3/ui/b;

    invoke-static {v0, p1}, Landroidx/media3/ui/b;->c(Landroidx/media3/ui/b;Landroid/animation/ValueAnimator;)V

    return-void
.end method
